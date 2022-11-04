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
import org.odk.collect.android.provider.FormsProviderAPI;
import org.odk.collect.android.utilities.FileUtils;
import org.odk.collect.android.utilities.MediaUtils;
/* loaded from: classes.dex */
public class FormsProvider extends ContentProvider {
    private static final String DATABASE_NAME = "forms.db";
    private static final int DATABASE_VERSION = 4;
    private static final int FORMS = 1;
    private static final String FORMS_TABLE_NAME = "forms";
    private static final int FORM_ID = 2;
    private static final String t = "FormsProvider";
    private DatabaseHelper mDbHelper;
    private static final UriMatcher sUriMatcher = new UriMatcher(-1);
    private static HashMap<String, String> sFormsProjectionMap = new HashMap<>();

    /* loaded from: classes.dex */
    public static class DatabaseHelper extends ODKSQLiteOpenHelper {
        private static final String MODEL_VERSION = "modelVersion";
        private static final String TEMP_FORMS_TABLE_NAME = "forms_v4";

        DatabaseHelper(String databaseName) {
            super(Collect.METADATA_PATH, databaseName, null, 4);
        }

        @Override // org.odk.collect.android.database.ODKSQLiteOpenHelper
        public void onCreate(SQLiteDatabase db) {
            onCreateNamed(db, FormsProvider.FORMS_TABLE_NAME);
        }

        private void onCreateNamed(SQLiteDatabase db, String tableName) {
            db.execSQL("CREATE TABLE " + tableName + " (_id integer primary key, displayName text not null, displaySubtext text not null, " + FormsProviderAPI.FormsColumns.DESCRIPTION + " text, jrFormId text not null, jrVersion text, " + FormsProviderAPI.FormsColumns.MD5_HASH + " text not null, date integer not null, " + FormsProviderAPI.FormsColumns.FORM_MEDIA_PATH + " text not null, " + FormsProviderAPI.FormsColumns.FORM_FILE_PATH + " text not null, " + FormsProviderAPI.FormsColumns.LANGUAGE + " text, submissionUri text, base64RsaPublicKey text, " + FormsProviderAPI.FormsColumns.JRCACHE_FILE_PATH + " text not null );");
        }

        @Override // org.odk.collect.android.database.ODKSQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            if (oldVersion < 2) {
                Log.w(FormsProvider.t, "Upgrading database from version " + oldVersion + " to " + newVersion + ", which will destroy all old data");
                db.execSQL("DROP TABLE IF EXISTS forms");
                onCreate(db);
                return;
            }
            db.execSQL("DROP TABLE IF EXISTS forms_v4");
            onCreateNamed(db, TEMP_FORMS_TABLE_NAME);
            db.execSQL("INSERT INTO forms_v4 (_id, displayName, displaySubtext, description, jrFormId, md5Hash, date, formMediaPath, formFilePath, language, submissionUri, jrVersion, " + (oldVersion != 3 ? "" : "base64RsaPublicKey, ") + FormsProviderAPI.FormsColumns.JRCACHE_FILE_PATH + ") SELECT _id, displayName, displaySubtext, " + FormsProviderAPI.FormsColumns.DESCRIPTION + ", jrFormId, " + FormsProviderAPI.FormsColumns.MD5_HASH + ", date, " + FormsProviderAPI.FormsColumns.FORM_MEDIA_PATH + ", " + FormsProviderAPI.FormsColumns.FORM_FILE_PATH + ", " + FormsProviderAPI.FormsColumns.LANGUAGE + ", submissionUri, CASE WHEN " + MODEL_VERSION + " IS NOT NULL THEN CAST(" + MODEL_VERSION + " AS TEXT) ELSE NULL END, " + (oldVersion != 3 ? "" : "base64RsaPublicKey, ") + FormsProviderAPI.FormsColumns.JRCACHE_FILE_PATH + " FROM " + FormsProvider.FORMS_TABLE_NAME);
            db.execSQL("DROP TABLE IF EXISTS forms");
            onCreateNamed(db, FormsProvider.FORMS_TABLE_NAME);
            db.execSQL("INSERT INTO forms (_id, displayName, displaySubtext, description, jrFormId, md5Hash, date, formMediaPath, formFilePath, language, submissionUri, jrVersion, base64RsaPublicKey, jrcacheFilePath) SELECT _id, displayName, displaySubtext, description, jrFormId, md5Hash, date, formMediaPath, formFilePath, language, submissionUri, jrVersion, base64RsaPublicKey, jrcacheFilePath FROM forms_v4");
            db.execSQL("DROP TABLE IF EXISTS forms_v4");
            Log.w(FormsProvider.t, "Successfully upgraded database from version " + oldVersion + " to " + newVersion + ", without destroying all the old data");
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
        qb.setTables(FORMS_TABLE_NAME);
        switch (sUriMatcher.match(uri)) {
            case 1:
                qb.setProjectionMap(sFormsProjectionMap);
                break;
            case 2:
                qb.setProjectionMap(sFormsProjectionMap);
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
                return FormsProviderAPI.FormsColumns.CONTENT_TYPE;
            case 2:
                return FormsProviderAPI.FormsColumns.CONTENT_ITEM_TYPE;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);
        }
    }

    @Override // android.content.ContentProvider
    public synchronized Uri insert(Uri uri, ContentValues initialValues) {
        ContentValues values;
        Uri formUri;
        if (sUriMatcher.match(uri) != 1) {
            throw new IllegalArgumentException("Unknown URI " + uri);
        }
        if (initialValues != null) {
            values = new ContentValues(initialValues);
        } else {
            values = new ContentValues();
        }
        if (!values.containsKey(FormsProviderAPI.FormsColumns.FORM_FILE_PATH)) {
            throw new IllegalArgumentException("formFilePath must be specified.");
        }
        File form = new File(values.getAsString(FormsProviderAPI.FormsColumns.FORM_FILE_PATH));
        String filePath = form.getAbsolutePath();
        values.put(FormsProviderAPI.FormsColumns.FORM_FILE_PATH, filePath);
        Long now = Long.valueOf(System.currentTimeMillis());
        if (!values.containsKey("date")) {
            values.put("date", now);
        }
        if (!values.containsKey("displaySubtext")) {
            Date today = new Date();
            String ts = new SimpleDateFormat(getContext().getString(R.string.added_on_date_at_time), Locale.getDefault()).format(today);
            values.put("displaySubtext", ts);
        }
        if (!values.containsKey("displayName")) {
            values.put("displayName", form.getName());
        }
        if (values.containsKey(FormsProviderAPI.FormsColumns.MD5_HASH)) {
            values.remove(FormsProviderAPI.FormsColumns.MD5_HASH);
        }
        String md5 = FileUtils.getMd5Hash(form);
        values.put(FormsProviderAPI.FormsColumns.MD5_HASH, md5);
        if (!values.containsKey(FormsProviderAPI.FormsColumns.JRCACHE_FILE_PATH)) {
            String cachePath = Collect.CACHE_PATH + File.separator + md5 + ".formdef";
            values.put(FormsProviderAPI.FormsColumns.JRCACHE_FILE_PATH, cachePath);
        }
        if (!values.containsKey(FormsProviderAPI.FormsColumns.FORM_MEDIA_PATH)) {
            String pathNoExtension = filePath.substring(0, filePath.lastIndexOf("."));
            String mediaPath = pathNoExtension + "-media";
            values.put(FormsProviderAPI.FormsColumns.FORM_MEDIA_PATH, mediaPath);
        }
        SQLiteDatabase db = this.mDbHelper.getWritableDatabase();
        String[] projection = {"_id", FormsProviderAPI.FormsColumns.FORM_FILE_PATH};
        String[] selectionArgs = {filePath};
        Cursor c = db.query(FORMS_TABLE_NAME, projection, "formFilePath=?", selectionArgs, null, null, null);
        if (c.getCount() > 0) {
            throw new SQLException("FAILED Insert into " + uri + " -- row already exists for form definition file: " + filePath);
        }
        if (c != null) {
            c.close();
        }
        long rowId = db.insert(FORMS_TABLE_NAME, null, values);
        if (rowId > 0) {
            formUri = ContentUris.withAppendedId(FormsProviderAPI.FormsColumns.CONTENT_URI, rowId);
            getContext().getContentResolver().notifyChange(formUri, null);
            Collect.getInstance().getActivityLogger().logActionParam(this, "insert", formUri.toString(), values.getAsString(FormsProviderAPI.FormsColumns.FORM_FILE_PATH));
        } else {
            throw new SQLException("Failed to insert row into " + uri);
        }
        return formUri;
    }

    private void deleteFileOrDir(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            if (file.isDirectory()) {
                int images = MediaUtils.deleteImagesInFolderFromMediaProvider(file);
                int audio = MediaUtils.deleteAudioInFolderFromMediaProvider(file);
                int video = MediaUtils.deleteVideoInFolderFromMediaProvider(file);
                Log.i(t, "removed from content providers: " + images + " image files, " + audio + " audio files, and " + video + " video files.");
                File[] files = file.listFiles();
                for (File f : files) {
                    Log.i(t, "attempting to delete file: " + f.getAbsolutePath());
                    f.delete();
                }
            }
            file.delete();
            Log.i(t, "attempting to delete file: " + file.getAbsolutePath());
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String where, String[] whereArgs) {
        int count;
        SQLiteDatabase db = this.mDbHelper.getWritableDatabase();
        switch (sUriMatcher.match(uri)) {
            case 1:
                Cursor del = null;
                try {
                    del = query(uri, null, where, whereArgs, null);
                    del.moveToPosition(-1);
                    while (del.moveToNext()) {
                        deleteFileOrDir(del.getString(del.getColumnIndex(FormsProviderAPI.FormsColumns.JRCACHE_FILE_PATH)));
                        String formFilePath = del.getString(del.getColumnIndex(FormsProviderAPI.FormsColumns.FORM_FILE_PATH));
                        Collect.getInstance().getActivityLogger().logAction(this, "delete", formFilePath);
                        deleteFileOrDir(formFilePath);
                        deleteFileOrDir(del.getString(del.getColumnIndex(FormsProviderAPI.FormsColumns.FORM_MEDIA_PATH)));
                    }
                    count = db.delete(FORMS_TABLE_NAME, where, whereArgs);
                    break;
                } finally {
                }
            case 2:
                String formId = uri.getPathSegments().get(1);
                Cursor del2 = null;
                try {
                    del2 = query(uri, null, where, whereArgs, null);
                    del2.moveToPosition(-1);
                    while (del2.moveToNext()) {
                        deleteFileOrDir(del2.getString(del2.getColumnIndex(FormsProviderAPI.FormsColumns.JRCACHE_FILE_PATH)));
                        String formFilePath2 = del2.getString(del2.getColumnIndex(FormsProviderAPI.FormsColumns.FORM_FILE_PATH));
                        Collect.getInstance().getActivityLogger().logAction(this, "delete", formFilePath2);
                        deleteFileOrDir(formFilePath2);
                        deleteFileOrDir(del2.getString(del2.getColumnIndex(FormsProviderAPI.FormsColumns.FORM_MEDIA_PATH)));
                    }
                    if (del2 != null) {
                        del2.close();
                    }
                    count = db.delete(FORMS_TABLE_NAME, "_id=" + formId + (!TextUtils.isEmpty(where) ? " AND (" + where + ')' : ""), whereArgs);
                    break;
                } finally {
                    if (del2 != null) {
                        del2.close();
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
        Cursor c;
        SQLiteDatabase db = this.mDbHelper.getWritableDatabase();
        int count = 0;
        switch (sUriMatcher.match(uri)) {
            case 1:
                if (values.containsKey(FormsProviderAPI.FormsColumns.MD5_HASH)) {
                    values.remove(FormsProviderAPI.FormsColumns.MD5_HASH);
                }
                if (values.containsKey(FormsProviderAPI.FormsColumns.FORM_FILE_PATH)) {
                    values.put(FormsProviderAPI.FormsColumns.MD5_HASH, FileUtils.getMd5Hash(new File(values.getAsString(FormsProviderAPI.FormsColumns.FORM_FILE_PATH))));
                }
                Cursor c2 = null;
                try {
                    c = query(uri, null, where, whereArgs, null);
                    if (c.getCount() > 0) {
                        c.moveToPosition(-1);
                        while (c.moveToNext()) {
                            if (values.containsKey(FormsProviderAPI.FormsColumns.FORM_FILE_PATH)) {
                                String newFile = values.getAsString(FormsProviderAPI.FormsColumns.FORM_FILE_PATH);
                                String delFile = c.getString(c.getColumnIndex(FormsProviderAPI.FormsColumns.FORM_FILE_PATH));
                                if (!newFile.equalsIgnoreCase(delFile)) {
                                    deleteFileOrDir(delFile);
                                }
                                deleteFileOrDir(c.getString(c.getColumnIndex(FormsProviderAPI.FormsColumns.JRCACHE_FILE_PATH)));
                            }
                        }
                    }
                    if (values.containsKey("date")) {
                        Date today = new Date();
                        String ts = new SimpleDateFormat(getContext().getString(R.string.added_on_date_at_time), Locale.getDefault()).format(today);
                        values.put("displaySubtext", ts);
                    }
                    count = db.update(FORMS_TABLE_NAME, values, where, whereArgs);
                    break;
                } finally {
                }
            case 2:
                String formId = uri.getPathSegments().get(1);
                c = null;
                try {
                    Cursor update = query(uri, null, where, whereArgs, null);
                    if (update.getCount() > 0) {
                        update.moveToFirst();
                        if (values.containsKey(FormsProviderAPI.FormsColumns.MD5_HASH)) {
                            values.remove(FormsProviderAPI.FormsColumns.MD5_HASH);
                        }
                        if (values.containsKey(FormsProviderAPI.FormsColumns.JRCACHE_FILE_PATH)) {
                            deleteFileOrDir(update.getString(update.getColumnIndex(FormsProviderAPI.FormsColumns.JRCACHE_FILE_PATH)));
                        }
                        if (values.containsKey(FormsProviderAPI.FormsColumns.FORM_FILE_PATH)) {
                            String formFile = values.getAsString(FormsProviderAPI.FormsColumns.FORM_FILE_PATH);
                            String oldFile = update.getString(update.getColumnIndex(FormsProviderAPI.FormsColumns.FORM_FILE_PATH));
                            if (formFile == null || !formFile.equalsIgnoreCase(oldFile)) {
                                deleteFileOrDir(oldFile);
                            }
                            deleteFileOrDir(update.getString(update.getColumnIndex(FormsProviderAPI.FormsColumns.JRCACHE_FILE_PATH)));
                            String newMd5 = FileUtils.getMd5Hash(new File(formFile));
                            values.put(FormsProviderAPI.FormsColumns.MD5_HASH, newMd5);
                            values.put(FormsProviderAPI.FormsColumns.JRCACHE_FILE_PATH, Collect.CACHE_PATH + File.separator + newMd5 + ".formdef");
                        }
                        if (values.containsKey("date")) {
                            Date today2 = new Date();
                            String ts2 = new SimpleDateFormat(getContext().getString(R.string.added_on_date_at_time), Locale.getDefault()).format(today2);
                            values.put("displaySubtext", ts2);
                        }
                        count = db.update(FORMS_TABLE_NAME, values, "_id=" + formId + (!TextUtils.isEmpty(where) ? " AND (" + where + ')' : ""), whereArgs);
                    } else {
                        Log.e(t, "Attempting to update row that does not exist");
                    }
                    if (update != null) {
                        update.close();
                        break;
                    }
                } finally {
                    if (c != null) {
                        c.close();
                    }
                }
                break;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);
        }
        getContext().getContentResolver().notifyChange(uri, null);
        return count;
    }

    static {
        sUriMatcher.addURI(FormsProviderAPI.AUTHORITY, FORMS_TABLE_NAME, 1);
        sUriMatcher.addURI(FormsProviderAPI.AUTHORITY, "forms/#", 2);
        sFormsProjectionMap.put("_id", "_id");
        sFormsProjectionMap.put("displayName", "displayName");
        sFormsProjectionMap.put("displaySubtext", "displaySubtext");
        sFormsProjectionMap.put(FormsProviderAPI.FormsColumns.DESCRIPTION, FormsProviderAPI.FormsColumns.DESCRIPTION);
        sFormsProjectionMap.put("jrFormId", "jrFormId");
        sFormsProjectionMap.put("jrVersion", "jrVersion");
        sFormsProjectionMap.put("submissionUri", "submissionUri");
        sFormsProjectionMap.put("base64RsaPublicKey", "base64RsaPublicKey");
        sFormsProjectionMap.put(FormsProviderAPI.FormsColumns.MD5_HASH, FormsProviderAPI.FormsColumns.MD5_HASH);
        sFormsProjectionMap.put("date", "date");
        sFormsProjectionMap.put(FormsProviderAPI.FormsColumns.FORM_MEDIA_PATH, FormsProviderAPI.FormsColumns.FORM_MEDIA_PATH);
        sFormsProjectionMap.put(FormsProviderAPI.FormsColumns.FORM_FILE_PATH, FormsProviderAPI.FormsColumns.FORM_FILE_PATH);
        sFormsProjectionMap.put(FormsProviderAPI.FormsColumns.JRCACHE_FILE_PATH, FormsProviderAPI.FormsColumns.JRCACHE_FILE_PATH);
        sFormsProjectionMap.put(FormsProviderAPI.FormsColumns.LANGUAGE, FormsProviderAPI.FormsColumns.LANGUAGE);
    }
}
