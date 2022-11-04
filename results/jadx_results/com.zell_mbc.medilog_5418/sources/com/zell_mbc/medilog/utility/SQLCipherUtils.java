package com.zell_mbc.medilog.utility;

import android.content.Context;
import java.io.File;
import net.sqlcipher.database.SQLiteDatabase;
/* loaded from: classes2.dex */
public class SQLCipherUtils {

    /* loaded from: classes2.dex */
    public enum State {
        DOES_NOT_EXIST,
        UNENCRYPTED,
        ENCRYPTED
    }

    public static State getDatabaseState(Context ctxt, String dbName) {
        SQLiteDatabase.loadLibs(ctxt);
        return getDatabaseState(ctxt.getDatabasePath(dbName));
    }

    public static State getDatabaseState(File dbPath) {
        if (dbPath.exists()) {
            try {
                SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(dbPath.getAbsolutePath(), "", (SQLiteDatabase.CursorFactory) null, 1);
                openDatabase.getVersion();
                State state = State.UNENCRYPTED;
                if (openDatabase != null) {
                    openDatabase.close();
                }
                return state;
            } catch (Exception unused) {
                return State.ENCRYPTED;
            }
        }
        return State.DOES_NOT_EXIST;
    }
}
