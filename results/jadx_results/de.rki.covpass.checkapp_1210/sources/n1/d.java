package n1;

import android.database.sqlite.SQLiteProgram;
import m1.i;
/* loaded from: classes.dex */
class d implements i {

    /* renamed from: c */
    private final SQLiteProgram f16858c;

    public d(SQLiteProgram sQLiteProgram) {
        this.f16858c = sQLiteProgram;
    }

    @Override // m1.i
    public void A0(int i10, long j10) {
        this.f16858c.bindLong(i10, j10);
    }

    @Override // m1.i
    public void K(int i10, String str) {
        this.f16858c.bindString(i10, str);
    }

    @Override // m1.i
    public void L0(int i10, byte[] bArr) {
        this.f16858c.bindBlob(i10, bArr);
    }

    @Override // m1.i
    public void a0(int i10) {
        this.f16858c.bindNull(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16858c.close();
    }

    @Override // m1.i
    public void d0(int i10, double d10) {
        this.f16858c.bindDouble(i10, d10);
    }
}
