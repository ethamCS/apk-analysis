package androidx.room;

import android.database.Cursor;
import java.util.List;
import m1.h;
/* loaded from: classes.dex */
public class k0 extends h.a {

    /* renamed from: b */
    private j f4947b;

    /* renamed from: c */
    private final a f4948c;

    /* renamed from: d */
    private final String f4949d;

    /* renamed from: e */
    private final String f4950e;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a */
        public final int f4951a;

        public a(int i10) {
            this.f4951a = i10;
        }

        protected abstract void a(m1.g gVar);

        protected abstract void b(m1.g gVar);

        protected abstract void c(m1.g gVar);

        protected abstract void d(m1.g gVar);

        protected abstract void e(m1.g gVar);

        protected abstract void f(m1.g gVar);

        protected abstract b g(m1.g gVar);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final boolean f4952a;

        /* renamed from: b */
        public final String f4953b;

        public b(boolean z10, String str) {
            this.f4952a = z10;
            this.f4953b = str;
        }
    }

    public k0(j jVar, a aVar, String str, String str2) {
        super(aVar.f4951a);
        this.f4947b = jVar;
        this.f4948c = aVar;
        this.f4949d = str;
        this.f4950e = str2;
    }

    private void h(m1.g gVar) {
        if (!k(gVar)) {
            b g10 = this.f4948c.g(gVar);
            if (g10.f4952a) {
                this.f4948c.e(gVar);
                l(gVar);
                return;
            }
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f4953b);
        }
        String str = null;
        Cursor J = gVar.J(new m1.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            if (J.moveToFirst()) {
                str = J.getString(0);
            }
            J.close();
            if (!this.f4949d.equals(str) && !this.f4950e.equals(str)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th2) {
            J.close();
            throw th2;
        }
    }

    private void i(m1.g gVar) {
        gVar.H("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(m1.g gVar) {
        Cursor Y0 = gVar.Y0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (Y0.moveToFirst()) {
                if (Y0.getInt(0) == 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            Y0.close();
        }
    }

    private static boolean k(m1.g gVar) {
        Cursor Y0 = gVar.Y0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z10 = false;
            if (Y0.moveToFirst()) {
                if (Y0.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            Y0.close();
        }
    }

    private void l(m1.g gVar) {
        i(gVar);
        gVar.H(h1.k.a(this.f4949d));
    }

    @Override // m1.h.a
    public void b(m1.g gVar) {
        super.b(gVar);
    }

    @Override // m1.h.a
    public void d(m1.g gVar) {
        boolean j10 = j(gVar);
        this.f4948c.a(gVar);
        if (!j10) {
            b g10 = this.f4948c.g(gVar);
            if (!g10.f4952a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f4953b);
            }
        }
        l(gVar);
        this.f4948c.c(gVar);
    }

    @Override // m1.h.a
    public void e(m1.g gVar, int i10, int i11) {
        g(gVar, i10, i11);
    }

    @Override // m1.h.a
    public void f(m1.g gVar) {
        super.f(gVar);
        h(gVar);
        this.f4948c.d(gVar);
        this.f4947b = null;
    }

    @Override // m1.h.a
    public void g(m1.g gVar, int i10, int i11) {
        boolean z10;
        List<i1.b> c10;
        j jVar = this.f4947b;
        if (jVar == null || (c10 = jVar.f4921d.c(i10, i11)) == null) {
            z10 = false;
        } else {
            this.f4948c.f(gVar);
            for (i1.b bVar : c10) {
                bVar.a(gVar);
            }
            b g10 = this.f4948c.g(gVar);
            if (!g10.f4952a) {
                throw new IllegalStateException("Migration didn't properly handle: " + g10.f4953b);
            }
            this.f4948c.e(gVar);
            l(gVar);
            z10 = true;
        }
        if (!z10) {
            j jVar2 = this.f4947b;
            if (jVar2 != null && !jVar2.a(i10, i11)) {
                this.f4948c.b(gVar);
                this.f4948c.a(gVar);
                return;
            }
            throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
    }
}
