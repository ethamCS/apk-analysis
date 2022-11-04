package net.sqlcipher.database;
/* loaded from: classes2.dex */
public interface SQLiteTransactionListener {
    void onBegin();

    void onCommit();

    void onRollback();
}
