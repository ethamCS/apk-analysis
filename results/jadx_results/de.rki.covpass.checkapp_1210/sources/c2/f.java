package c2;

import android.database.Cursor;
import androidx.room.i0;
/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a */
    private final i0 f6138a;

    /* renamed from: b */
    private final h1.g<d> f6139b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h1.g<d> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i0 i0Var) {
            super(i0Var);
            f.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void g(m1.k kVar, d dVar) {
            String str = dVar.f6136a;
            if (str == null) {
                kVar.a0(1);
            } else {
                kVar.K(1, str);
            }
            Long l10 = dVar.f6137b;
            if (l10 == null) {
                kVar.a0(2);
            } else {
                kVar.A0(2, l10.longValue());
            }
        }
    }

    public f(i0 i0Var) {
        this.f6138a = i0Var;
        this.f6139b = new a(i0Var);
    }

    @Override // c2.e
    public Long a(String str) {
        h1.l f10 = h1.l.f("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            f10.a0(1);
        } else {
            f10.K(1, str);
        }
        this.f6138a.d();
        Long l10 = null;
        Cursor c10 = j1.c.c(this.f6138a, f10, false, null);
        try {
            if (c10.moveToFirst() && !c10.isNull(0)) {
                l10 = Long.valueOf(c10.getLong(0));
            }
            return l10;
        } finally {
            c10.close();
            f10.j();
        }
    }

    @Override // c2.e
    public void b(d dVar) {
        this.f6138a.d();
        this.f6138a.e();
        try {
            this.f6139b.h(dVar);
            this.f6138a.D();
        } finally {
            this.f6138a.i();
        }
    }
}
