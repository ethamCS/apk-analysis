package n1;

import android.database.sqlite.SQLiteStatement;
import m1.k;
/* loaded from: classes.dex */
class e extends d implements k {

    /* renamed from: d */
    private final SQLiteStatement f16859d;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f16859d = sQLiteStatement;
    }

    @Override // m1.k
    public int S() {
        return this.f16859d.executeUpdateDelete();
    }

    @Override // m1.k
    public long X0() {
        return this.f16859d.executeInsert();
    }
}
