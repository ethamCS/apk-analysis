package org.odk.collect.android.database;

import android.app.Activity;
import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.File;
import java.util.Calendar;
import java.util.LinkedList;
import org.javarosa.core.model.FormIndex;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.logic.FormController;
/* loaded from: classes.dex */
public final class ActivityLogger {
    private static final String ACTION = "action";
    private static final String CLASS = "class";
    private static final String CONTEXT = "context";
    private static final String DATABASE_CREATE = "create table log (_id integer primary key autoincrement, timestamp integer not null, device_id text not null, class text not null, context text not null, action text, instance_path text, question text, param1 text, param2 text);";
    private static final String DATABASE_NAME = "activityLog.db";
    private static final String DATABASE_TABLE = "log";
    private static final int DATABASE_VERSION = 1;
    private static final String DEVICEID = "device_id";
    private static final String ENABLE_LOGGING = "enabled";
    private static final String ID = "_id";
    private static final String INSTANCE_PATH = "instance_path";
    private static final int MAX_SCROLL_ACTION_BUFFER_SIZE = 8;
    private static final long MIN_SCROLL_DELAY = 400;
    private static final String PARAM1 = "param1";
    private static final String PARAM2 = "param2";
    private static final String QUESTION = "question";
    private static final String TIMESTAMP = "timestamp";
    private final String mDeviceId;
    private DatabaseHelper mDbHelper = null;
    private SQLiteDatabase mDb = null;
    private boolean mIsOpen = false;
    private LinkedList<ContentValues> mScrollActions = new LinkedList<>();
    private FormIndex cachedXPathIndex = null;
    private String cachedXPathValue = null;
    private final boolean mLoggingEnabled = new File(Collect.LOG_PATH, ENABLE_LOGGING).exists();

    /* loaded from: classes.dex */
    public static class DatabaseHelper extends ODKSQLiteOpenHelper {
        DatabaseHelper() {
            super(Collect.LOG_PATH, ActivityLogger.DATABASE_NAME, null, 1);
            new File(Collect.LOG_PATH).mkdirs();
        }

        @Override // org.odk.collect.android.database.ODKSQLiteOpenHelper
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(ActivityLogger.DATABASE_CREATE);
        }

        @Override // org.odk.collect.android.database.ODKSQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS log");
            onCreate(db);
        }
    }

    public ActivityLogger(String deviceId) {
        this.mDeviceId = deviceId;
        open();
    }

    public boolean isOpen() {
        return this.mLoggingEnabled && this.mIsOpen;
    }

    public void open() throws SQLException {
        if (this.mLoggingEnabled && !this.mIsOpen) {
            try {
                this.mDbHelper = new DatabaseHelper();
                this.mDb = this.mDbHelper.getWritableDatabase();
                this.mIsOpen = true;
            } catch (SQLiteException e) {
                System.err.println("Error: " + e.getMessage());
                this.mIsOpen = false;
            }
        }
    }

    private String getXPath(FormIndex index) {
        if (index == this.cachedXPathIndex) {
            return this.cachedXPathValue;
        }
        this.cachedXPathIndex = index;
        this.cachedXPathValue = Collect.getInstance().getFormController().getXPath(index);
        return this.cachedXPathValue;
    }

    private void log(String object, String context, String action, String instancePath, FormIndex index, String param1, String param2) {
        if (isOpen()) {
            ContentValues cv = new ContentValues();
            cv.put(DEVICEID, this.mDeviceId);
            cv.put(CLASS, object);
            cv.put(CONTEXT, context);
            cv.put(ACTION, action);
            cv.put(INSTANCE_PATH, instancePath);
            cv.put(PARAM1, param1);
            cv.put(PARAM2, param2);
            cv.put(TIMESTAMP, Long.valueOf(Calendar.getInstance().getTimeInMillis()));
            insertContentValues(cv, index);
        }
    }

    public void logScrollAction(Object t, int distance) {
        if (isOpen()) {
            synchronized (this.mScrollActions) {
                long timeStamp = Calendar.getInstance().getTimeInMillis();
                if (!this.mScrollActions.isEmpty()) {
                    ContentValues lastCv = this.mScrollActions.get(this.mScrollActions.size() - 1);
                    long oldTimeStamp = lastCv.getAsLong(TIMESTAMP).longValue();
                    int oldDistance = Integer.parseInt(lastCv.getAsString(PARAM1));
                    if (Integer.signum(distance) == Integer.signum(oldDistance) && timeStamp - oldTimeStamp < MIN_SCROLL_DELAY) {
                        lastCv.put(PARAM1, Integer.valueOf(oldDistance + distance));
                        lastCv.put(TIMESTAMP, Long.valueOf(timeStamp));
                        return;
                    }
                }
                if (this.mScrollActions.size() >= 8) {
                    insertContentValues(null, null);
                }
                String idx = "";
                String instancePath = "";
                FormController formController = Collect.getInstance().getFormController();
                if (formController != null) {
                    idx = getXPath(formController.getFormIndex());
                    instancePath = formController.getInstancePath().getAbsolutePath();
                }
                ContentValues cv = new ContentValues();
                cv.put(DEVICEID, this.mDeviceId);
                cv.put(CLASS, t.getClass().getName());
                cv.put(CONTEXT, "scroll");
                cv.put(ACTION, "");
                cv.put(PARAM1, Integer.valueOf(distance));
                cv.put(QUESTION, idx);
                cv.put(INSTANCE_PATH, instancePath);
                cv.put(TIMESTAMP, Long.valueOf(timeStamp));
                cv.put(PARAM2, Long.valueOf(timeStamp));
                this.mScrollActions.add(cv);
            }
        }
    }

    private void insertContentValues(ContentValues cv, FormIndex index) {
        synchronized (this.mScrollActions) {
            while (!this.mScrollActions.isEmpty()) {
                try {
                    ContentValues scv = this.mScrollActions.removeFirst();
                    this.mDb.insert(DATABASE_TABLE, null, scv);
                } catch (SQLiteConstraintException e) {
                    System.err.println("Error: " + e.getMessage());
                }
            }
            if (cv != null) {
                String idx = "";
                if (index != null) {
                    idx = getXPath(index);
                }
                cv.put(QUESTION, idx);
                this.mDb.insert(DATABASE_TABLE, null, cv);
            }
        }
    }

    public void logOnStart(Activity a) {
        log(a.getClass().getName(), "onStart", null, null, null, null, null);
    }

    public void logOnStop(Activity a) {
        log(a.getClass().getName(), "onStop", null, null, null, null, null);
    }

    public void logAction(Object t, String context, String action) {
        log(t.getClass().getName(), context, action, null, null, null, null);
    }

    public void logActionParam(Object t, String context, String action, String param1) {
        log(t.getClass().getName(), context, action, null, null, param1, null);
    }

    public void logInstanceAction(Object t, String context, String action) {
        FormIndex index = null;
        String instancePath = null;
        FormController formController = Collect.getInstance().getFormController();
        if (formController != null) {
            index = formController.getFormIndex();
            instancePath = formController.getInstancePath().getAbsolutePath();
        }
        log(t.getClass().getName(), context, action, instancePath, index, null, null);
    }

    public void logInstanceAction(Object t, String context, String action, FormIndex index) {
        String instancePath = null;
        FormController formController = Collect.getInstance().getFormController();
        if (formController != null) {
            index = formController.getFormIndex();
            instancePath = formController.getInstancePath().getAbsolutePath();
        }
        log(t.getClass().getName(), context, action, instancePath, index, null, null);
    }
}
