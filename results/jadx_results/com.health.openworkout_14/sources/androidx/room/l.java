package androidx.room;

import android.database.Cursor;
import b.o.a.c;
import java.util.List;
/* loaded from: classes.dex */
public class l extends c.a {

    /* renamed from: b */
    private androidx.room.a f1900b;

    /* renamed from: c */
    private final a f1901c;

    /* renamed from: d */
    private final String f1902d;

    /* renamed from: e */
    private final String f1903e;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a */
        public final int f1904a;

        public a(int i) {
            this.f1904a = i;
        }

        protected abstract void a(b.o.a.b bVar);

        protected abstract void b(b.o.a.b bVar);

        protected abstract void c(b.o.a.b bVar);

        protected abstract void d(b.o.a.b bVar);

        protected abstract void e(b.o.a.b bVar);

        protected abstract void f(b.o.a.b bVar);

        protected abstract b g(b.o.a.b bVar);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final boolean f1905a;

        /* renamed from: b */
        public final String f1906b;

        public b(boolean z, String str) {
            this.f1905a = z;
            this.f1906b = str;
        }
    }

    public l(androidx.room.a aVar, a aVar2, String str, String str2) {
        super(aVar2.f1904a);
        this.f1900b = aVar;
        this.f1901c = aVar2;
        this.f1902d = str;
        this.f1903e = str2;
    }

    private void h(b.o.a.b bVar) {
        if (!k(bVar)) {
            b g2 = this.f1901c.g(bVar);
            if (g2.f1905a) {
                this.f1901c.e(bVar);
                l(bVar);
                return;
            }
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g2.f1906b);
        }
        String str = null;
        Cursor G = bVar.G(new b.o.a.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            if (G.moveToFirst()) {
                str = G.getString(0);
            }
            G.close();
            if (!this.f1902d.equals(str) && !this.f1903e.equals(str)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            G.close();
            throw th;
        }
    }

    private void i(b.o.a.b bVar) {
        bVar.t("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(b.o.a.b bVar) {
        Cursor V = bVar.V("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (V.moveToFirst()) {
                if (V.getInt(0) == 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            V.close();
        }
    }

    private static boolean k(b.o.a.b bVar) {
        Cursor V = bVar.V("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (V.moveToFirst()) {
                if (V.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            V.close();
        }
    }

    private void l(b.o.a.b bVar) {
        i(bVar);
        bVar.t(k.a(this.f1902d));
    }

    @Override // b.o.a.c.a
    public void b(b.o.a.b bVar) {
        super.b(bVar);
    }

    @Override // b.o.a.c.a
    public void d(b.o.a.b bVar) {
        boolean j = j(bVar);
        this.f1901c.a(bVar);
        if (!j) {
            b g2 = this.f1901c.g(bVar);
            if (!g2.f1905a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g2.f1906b);
            }
        }
        l(bVar);
        this.f1901c.c(bVar);
    }

    @Override // b.o.a.c.a
    public void e(b.o.a.b bVar, int i, int i2) {
        g(bVar, i, i2);
    }

    @Override // b.o.a.c.a
    public void f(b.o.a.b bVar) {
        super.f(bVar);
        h(bVar);
        this.f1901c.d(bVar);
        this.f1900b = null;
    }

    @Override // b.o.a.c.a
    public void g(b.o.a.b bVar, int i, int i2) {
        boolean z;
        List<androidx.room.r.a> c2;
        androidx.room.a aVar = this.f1900b;
        if (aVar == null || (c2 = aVar.f1838d.c(i, i2)) == null) {
            z = false;
        } else {
            this.f1901c.f(bVar);
            for (androidx.room.r.a aVar2 : c2) {
                aVar2.a(bVar);
            }
            b g2 = this.f1901c.g(bVar);
            if (!g2.f1905a) {
                throw new IllegalStateException("Migration didn't properly handle: " + g2.f1906b);
            }
            this.f1901c.e(bVar);
            l(bVar);
            z = true;
        }
        if (!z) {
            androidx.room.a aVar3 = this.f1900b;
            if (aVar3 != null && !aVar3.a(i, i2)) {
                this.f1901c.b(bVar);
                this.f1901c.a(bVar);
                return;
            }
            throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
    }
}
