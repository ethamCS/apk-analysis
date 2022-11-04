package org.odk.collect.android.provider;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.database.ODKSQLiteOpenHelper;
import org.odk.collect.android.provider.InstanceProviderAPI;
import org.odk.collect.android.utilities.MediaUtils;
/* loaded from: classes.dex */
public class InstanceProvider extends ContentProvider {
    private static final String DATABASE_NAME = "instances.db";
    private static final int DATABASE_VERSION = 3;
    private static final int INSTANCES = 1;
    private static final String INSTANCES_TABLE_NAME = "instances";
    private static final int INSTANCE_ID = 2;
    private static final String t = "InstancesProvider";
    private DatabaseHelper mDbHelper;
    private static final UriMatcher sUriMatcher = new UriMatcher(-1);
    private static HashMap<String, String> sInstancesProjectionMap = new HashMap<>();

    /* loaded from: classes.dex */
    public static class DatabaseHelper extends ODKSQLiteOpenHelper {
        DatabaseHelper(String databaseName) {
            super(Collect.METADATA_PATH, databaseName, null, 3);
        }

        @Override // org.odk.collect.android.database.ODKSQLiteOpenHelper
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE instances (_id integer primary key, displayName text not null, submissionUri text, canEditWhenComplete text, instanceFilePath text not null, jrFormId text not null, jrVersion text, status text not null, date date not null, displaySubtext text not null );");
        }

        @Override // org.odk.collect.android.database.ODKSQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            if (oldVersion == 1) {
                db.execSQL("ALTER TABLE instances ADD COLUMN canEditWhenComplete text;");
                db.execSQL("UPDATE instances SET canEditWhenComplete = '" + Boolean.toString(true) + "' WHERE " + InstanceProviderAPI.InstanceColumns.STATUS + " IS NOT NULL AND " + InstanceProviderAPI.InstanceColumns.STATUS + " != '" + InstanceProviderAPI.STATUS_INCOMPLETE + "'");
                oldVersion = 2;
            }
            if (oldVersion == 2) {
                db.execSQL("ALTER TABLE instances ADD COLUMN jrVersion text;");
            }
            Log.w(InstanceProvider.t, "Successfully upgraded database from version " + oldVersion + " to " + newVersion + ", without destroying all the old data");
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Collect.createODKDirs();
        this.mDbHelper = new DatabaseHelper(DATABASE_NAME);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        qb.setTables("instances");
        switch (sUriMatcher.match(uri)) {
            case 1:
                qb.setProjectionMap(sInstancesProjectionMap);
                break;
            case 2:
                qb.setProjectionMap(sInstancesProjectionMap);
                qb.appendWhere("_id=" + uri.getPathSegments().get(1));
                break;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);
        }
        SQLiteDatabase db = this.mDbHelper.getReadableDatabase();
        Cursor c = qb.query(db, projection, selection, selectionArgs, null, null, sortOrder);
        c.setNotificationUri(getContext().getContentResolver(), uri);
        return c;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        switch (sUriMatcher.match(uri)) {
            case 1:
                return InstanceProviderAPI.InstanceColumns.CONTENT_TYPE;
            case 2:
                return InstanceProviderAPI.InstanceColumns.CONTENT_ITEM_TYPE;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);
        }
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues initialValues) {
        ContentValues values;
        if (sUriMatcher.match(uri) != 1) {
            throw new IllegalArgumentException("Unknown URI " + uri);
        }
        if (initialValues != null) {
            values = new ContentValues(initialValues);
        } else {
            values = new ContentValues();
        }
        Long now = Long.valueOf(System.currentTimeMillis());
        if (!values.containsKey("date")) {
            values.put("date", now);
        }
        if (!values.containsKey("displaySubtext")) {
            Date today = new Date();
            String text = getDisplaySubtext(InstanceProviderAPI.STATUS_INCOMPLETE, today);
            values.put("displaySubtext", text);
        }
        if (!values.containsKey(InstanceProviderAPI.InstanceColumns.STATUS)) {
            values.put(InstanceProviderAPI.InstanceColumns.STATUS, InstanceProviderAPI.STATUS_INCOMPLETE);
        }
        SQLiteDatabase db = this.mDbHelper.getWritableDatabase();
        long rowId = db.insert("instances", null, values);
        if (rowId > 0) {
            Uri instanceUri = ContentUris.withAppendedId(InstanceProviderAPI.InstanceColumns.CONTENT_URI, rowId);
            getContext().getContentResolver().notifyChange(instanceUri, null);
            Collect.getInstance().getActivityLogger().logActionParam(this, "insert", instanceUri.toString(), values.getAsString(InstanceProviderAPI.InstanceColumns.INSTANCE_FILE_PATH));
            return instanceUri;
        }
        throw new SQLException("Failed to insert row into " + uri);
    }

    private String getDisplaySubtext(String state, Date date) {
        if (state == null) {
            return new SimpleDateFormat(getContext().getString(R.string.added_on_date_at_time), Locale.getDefault()).format(date);
        }
        if (InstanceProviderAPI.STATUS_INCOMPLETE.equalsIgnoreCase(state)) {
            return new SimpleDateFormat(getContext().getString(R.string.saved_on_date_at_time), Locale.getDefault()).format(date);
        }
        if (InstanceProviderAPI.STATUS_COMPLETE.equalsIgnoreCase(state)) {
            return new SimpleDateFormat(getContext().getString(R.string.finalized_on_date_at_time), Locale.getDefault()).format(date);
        }
        if (InstanceProviderAPI.STATUS_SUBMITTED.equalsIgnoreCase(state)) {
            return new SimpleDateFormat(getContext().getString(R.string.sent_on_date_at_time), Locale.getDefault()).format(date);
        }
        if (InstanceProviderAPI.STATUS_SUBMISSION_FAILED.equalsIgnoreCase(state)) {
            return new SimpleDateFormat(getContext().getString(R.string.sending_failed_on_date_at_time), Locale.getDefault()).format(date);
        }
        return new SimpleDateFormat(getContext().getString(R.string.added_on_date_at_time), Locale.getDefault()).format(date);
    }

    private void deleteAllFilesInDirectory(File directory) {
        if (directory.exists()) {
            if (directory.isDirectory()) {
                int images = MediaUtils.deleteImagesInFolderFromMediaProvider(directory);
                int audio = MediaUtils.deleteAudioInFolderFromMediaProvider(directory);
                int video = MediaUtils.deleteVideoInFolderFromMediaProvider(directory);
                Log.i(t, "removed from content providers: " + images + " image files, " + audio + " audio files, and " + video + " video files.");
                File[] files = directory.listFiles();
                for (File f : files) {
                    f.delete();
                }
            }
            directory.delete();
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String where, String[] whereArgs) {
        Cursor del;
        int count;
        SQLiteDatabase db = this.mDbHelper.getWritableDatabase();
        switch (sUriMatcher.match(uri)) {
            case 1:
                Cursor del2 = null;
                try {
                    del = query(uri, null, where, whereArgs, null);
                    del.moveToPosition(-1);
                    while (del.moveToNext()) {
                        String instanceFile = del.getString(del.getColumnIndex(InstanceProviderAPI.InstanceColumns.INSTANCE_FILE_PATH));
                        Collect.getInstance().getActivityLogger().logAction(this, "delete", instanceFile);
                        File instanceDir = new File(instanceFile).getParentFile();
                        deleteAllFilesInDirectory(instanceDir);
                    }
                    count = db.delete("instances", where, whereArgs);
                    break;
                } finally {
                }
            case 2:
                String instanceId = uri.getPathSegments().get(1);
                del = null;
                try {
                    del = query(uri, null, where, whereArgs, null);
                    del.moveToPosition(-1);
                    while (del.moveToNext()) {
                        String instanceFile2 = del.getString(del.getColumnIndex(InstanceProviderAPI.InstanceColumns.INSTANCE_FILE_PATH));
                        Collect.getInstance().getActivityLogger().logAction(this, "delete", instanceFile2);
                        File instanceDir2 = new File(instanceFile2).getParentFile();
                        deleteAllFilesInDirectory(instanceDir2);
                    }
                    if (del != null) {
                        del.close();
                    }
                    count = db.delete("instances", "_id=" + instanceId + (!TextUtils.isEmpty(where) ? " AND (" + where + ')' : ""), whereArgs);
                    break;
                } finally {
                    if (del != null) {
                        del.close();
                    }
                }
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);
        }
        getContext().getContentResolver().notifyChange(uri, null);
        return count;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues values, String where, String[] whereArgs) {
        int count;
        SQLiteDatabase db = this.mDbHelper.getWritableDatabase();
        switch (sUriMatcher.match(uri)) {
            case 1:
                if (values.containsKey(InstanceProviderAPI.InstanceColumns.STATUS)) {
                    String status = values.getAsString(InstanceProviderAPI.InstanceColumns.STATUS);
                    if (!values.containsKey("displaySubtext")) {
                        Date today = new Date();
                        String text = getDisplaySubtext(status, today);
                        values.put("displaySubtext", text);
                    }
                }
                count = db.update("instances", values, where, whereArgs);
                break;
            case 2:
                String instanceId = uri.getPathSegments().get(1);
                if (values.containsKey(InstanceProviderAPI.InstanceColumns.STATUS)) {
                    String status2 = values.getAsString(InstanceProviderAPI.InstanceColumns.STATUS);
                    if (!values.containsKey("displaySubtext")) {
                        Date today2 = new Date();
                        String text2 = getDisplaySubtext(status2, today2);
                        values.put("displaySubtext", text2);
                    }
                }
                count = db.update("instances", values, "_id=" + instanceId + (!TextUtils.isEmpty(where) ? " AND (" + where + ')' : ""), whereArgs);
                break;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);
        }
        getContext().getContentResolver().notifyChange(uri, null);
        return count;
    }

    static {
        sUriMatcher.addURI(InstanceProviderAPI.AUTHORITY, "instances", 1);
        sUriMatcher.addURI(InstanceProviderAPI.AUTHORITY, "instances/#", 2);
        sInstancesProjectionMap.put("_id", "_id");
        sInstancesProjectionMap.put("displayName", "displayName");
        sInstancesProjectionMap.put("submissionUri", "submissionUri");
        sInstancesProjectionMap.put(InstanceProviderAPI.InstanceColumns.CAN_EDIT_WHEN_COMPLETE, InstanceProviderAPI.InstanceColumns.CAN_EDIT_WHEN_COMPLETE);
        sInstancesProjectionMap.put(InstanceProviderAPI.InstanceColumns.INSTANCE_FILE_PATH, InstanceProviderAPI.InstanceColumns.INSTANCE_FILE_PATH);
        sInstancesProjectionMap.put("jrFormId", "jrFormId");
        sInstancesProjectionMap.put("jrVersion", "jrVersion");
        sInstancesProjectionMap.put(InstanceProviderAPI.InstanceColumns.STATUS, InstanceProviderAPI.InstanceColumns.STATUS);
        sInstancesProjectionMap.put("date", "date");
        sInstancesProjectionMap.put("displaySubtext", "displaySubtext");
    }
}
