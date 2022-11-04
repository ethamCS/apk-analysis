package b.o.a.g;

import android.database.sqlite.SQLiteStatement;
import b.o.a.f;
/* loaded from: classes.dex */
class e extends d implements f {

    /* renamed from: c */
    private final SQLiteStatement f2678c;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f2678c = sQLiteStatement;
    }

    @Override // b.o.a.f
    public int C() {
        return this.f2678c.executeUpdateDelete();
    }

    @Override // b.o.a.f
    public long T() {
        return this.f2678c.executeInsert();
    }
}
