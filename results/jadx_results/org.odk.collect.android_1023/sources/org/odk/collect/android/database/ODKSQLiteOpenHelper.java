package org.odk.collect.android.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.File;
/* loaded from: classes.dex */
public abstract class ODKSQLiteOpenHelper {
    private static final String t = ODKSQLiteOpenHelper.class.getSimpleName();
    private final SQLiteDatabase.CursorFactory mFactory;
    private final String mName;
    private final int mNewVersion;
    private final String mPath;
    private SQLiteDatabase mDatabase = null;
    private boolean mIsInitializing = false;

    public abstract void onCreate(SQLiteDatabase sQLiteDatabase);

    public abstract void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

    public ODKSQLiteOpenHelper(String path, String name, SQLiteDatabase.CursorFactory factory, int version) {
        if (version < 1) {
            throw new IllegalArgumentException("Version must be >= 1, was " + version);
        }
        this.mPath = path;
        this.mName = name;
        this.mFactory = factory;
        this.mNewVersion = version;
    }

    public synchronized SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase db;
        if (this.mDatabase != null && this.mDatabase.isOpen() && !this.mDatabase.isReadOnly()) {
            db = this.mDatabase;
        } else if (this.mIsInitializing) {
            throw new IllegalStateException("getWritableDatabase called recursively");
        } else {
            this.mIsInitializing = true;
            db = this.mName == null ? SQLiteDatabase.create(null) : SQLiteDatabase.openOrCreateDatabase(this.mPath + File.separator + this.mName, this.mFactory);
            int version = db.getVersion();
            if (version != this.mNewVersion) {
                db.beginTransaction();
                if (version == 0) {
                    onCreate(db);
                } else {
                    onUpgrade(db, version, this.mNewVersion);
                }
                db.setVersion(this.mNewVersion);
                db.setTransactionSuccessful();
                db.endTransaction();
            }
            onOpen(db);
            this.mIsInitializing = false;
            if (1 != 0) {
                if (this.mDatabase != null) {
                    try {
                        this.mDatabase.close();
                    } catch (Exception e) {
                    }
                }
                this.mDatabase = db;
            } else if (db != null) {
                db.close();
            }
        }
        return db;
    }

    public synchronized SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        if (this.mDatabase != null && this.mDatabase.isOpen()) {
            sQLiteDatabase = this.mDatabase;
        } else if (this.mIsInitializing) {
            throw new IllegalStateException("getReadableDatabase called recursively");
        } else {
            try {
                sQLiteDatabase = getWritableDatabase();
            } catch (SQLiteException e) {
                if (this.mName == null) {
                    throw e;
                }
                Log.e(t, "Couldn't open " + this.mName + " for writing (will try read-only):", e);
                this.mIsInitializing = true;
                String path = this.mPath + File.separator + this.mName;
                SQLiteDatabase db = SQLiteDatabase.openDatabase(path, this.mFactory, 1);
                if (db.getVersion() != this.mNewVersion) {
                    throw new SQLiteException("Can't upgrade read-only database from version " + db.getVersion() + " to " + this.mNewVersion + ": " + path);
                }
                onOpen(db);
                Log.w(t, "Opened " + this.mName + " in read-only mode");
                this.mDatabase = db;
                sQLiteDatabase = this.mDatabase;
                this.mIsInitializing = false;
                if (db != null && db != this.mDatabase) {
                    db.close();
                }
            }
        }
        return sQLiteDatabase;
    }

    public synchronized void close() {
        if (this.mIsInitializing) {
            throw new IllegalStateException("Closed during initialization");
        }
        if (this.mDatabase != null && this.mDatabase.isOpen()) {
            this.mDatabase.close();
            this.mDatabase = null;
        }
    }

    public void onOpen(SQLiteDatabase db) {
    }
}
