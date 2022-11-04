package b.o.a.g;

import android.database.sqlite.SQLiteProgram;
/* loaded from: classes.dex */
class d implements b.o.a.d {

    /* renamed from: b */
    private final SQLiteProgram f2677b;

    public d(SQLiteProgram sQLiteProgram) {
        this.f2677b = sQLiteProgram;
    }

    @Override // b.o.a.d
    public void H(int i, byte[] bArr) {
        this.f2677b.bindBlob(i, bArr);
    }

    @Override // b.o.a.d
    public void J(int i) {
        this.f2677b.bindNull(i);
    }

    @Override // b.o.a.d
    public void L(int i, double d2) {
        this.f2677b.bindDouble(i, d2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2677b.close();
    }

    @Override // b.o.a.d
    public void v(int i, String str) {
        this.f2677b.bindString(i, str);
    }

    @Override // b.o.a.d
    public void x(int i, long j) {
        this.f2677b.bindLong(i, j);
    }
}
