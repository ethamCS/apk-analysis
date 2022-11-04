package de.rki.covpass.sdk.revocation.database;

import androidx.room.i0;
import androidx.room.j;
import androidx.room.k0;
import androidx.room.p;
import i9.b;
import i9.d;
import i9.e;
import i9.h;
import i9.i;
import i9.k;
import i9.n;
import j1.c;
import j1.g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m1.g;
import m1.h;
/* loaded from: classes.dex */
public final class RevocationDatabase_Impl extends RevocationDatabase {

    /* renamed from: o */
    private volatile k f8749o;

    /* renamed from: p */
    private volatile h f8750p;

    /* renamed from: q */
    private volatile i9.a f8751q;

    /* renamed from: r */
    private volatile d f8752r;

    /* loaded from: classes.dex */
    class a extends k0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(i10);
            RevocationDatabase_Impl.this = r1;
        }

        @Override // androidx.room.k0.a
        public void a(g gVar) {
            gVar.H("CREATE TABLE IF NOT EXISTS `revocation_kid_list` (`kid` BLOB NOT NULL, `hashVariants` TEXT NOT NULL, PRIMARY KEY(`kid`))");
            gVar.H("CREATE TABLE IF NOT EXISTS `revocation_index_list` (`kid` BLOB NOT NULL, `hashVariant` INTEGER NOT NULL, `index` TEXT NOT NULL, PRIMARY KEY(`kid`, `hashVariant`))");
            gVar.H("CREATE TABLE IF NOT EXISTS `revocation_byte_one_list` (`kid` BLOB NOT NULL, `hashVariant` INTEGER NOT NULL, `byteOne` INTEGER NOT NULL, `chunks` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`kid`, `hashVariant`, `byteOne`))");
            gVar.H("CREATE TABLE IF NOT EXISTS `revocation_byte_two_list` (`kid` BLOB NOT NULL, `hashVariant` INTEGER NOT NULL, `byteOne` INTEGER NOT NULL, `byteTwo` INTEGER NOT NULL, `chunks` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`kid`, `hashVariant`, `byteOne`, `byteTwo`))");
            gVar.H("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.H("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cfbabe954125a83123d5853a3dc027b7')");
        }

        @Override // androidx.room.k0.a
        public void b(g gVar) {
            gVar.H("DROP TABLE IF EXISTS `revocation_kid_list`");
            gVar.H("DROP TABLE IF EXISTS `revocation_index_list`");
            gVar.H("DROP TABLE IF EXISTS `revocation_byte_one_list`");
            gVar.H("DROP TABLE IF EXISTS `revocation_byte_two_list`");
            if (((i0) RevocationDatabase_Impl.this).f4882h != null) {
                int size = ((i0) RevocationDatabase_Impl.this).f4882h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((i0.b) ((i0) RevocationDatabase_Impl.this).f4882h.get(i10)).b(gVar);
                }
            }
        }

        @Override // androidx.room.k0.a
        protected void c(g gVar) {
            if (((i0) RevocationDatabase_Impl.this).f4882h != null) {
                int size = ((i0) RevocationDatabase_Impl.this).f4882h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((i0.b) ((i0) RevocationDatabase_Impl.this).f4882h.get(i10)).a(gVar);
                }
            }
        }

        @Override // androidx.room.k0.a
        public void d(g gVar) {
            ((i0) RevocationDatabase_Impl.this).f4875a = gVar;
            RevocationDatabase_Impl.this.w(gVar);
            if (((i0) RevocationDatabase_Impl.this).f4882h != null) {
                int size = ((i0) RevocationDatabase_Impl.this).f4882h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((i0.b) ((i0) RevocationDatabase_Impl.this).f4882h.get(i10)).c(gVar);
                }
            }
        }

        @Override // androidx.room.k0.a
        public void e(g gVar) {
        }

        @Override // androidx.room.k0.a
        public void f(g gVar) {
            c.b(gVar);
        }

        @Override // androidx.room.k0.a
        protected k0.b g(g gVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("kid", new g.a("kid", "BLOB", true, 1, null, 1));
            hashMap.put("hashVariants", new g.a("hashVariants", "TEXT", true, 0, null, 1));
            j1.g gVar2 = new j1.g("revocation_kid_list", hashMap, new HashSet(0), new HashSet(0));
            j1.g a10 = j1.g.a(gVar, "revocation_kid_list");
            if (!gVar2.equals(a10)) {
                return new k0.b(false, "revocation_kid_list(de.rki.covpass.sdk.revocation.database.RevocationKidLocal).\n Expected:\n" + gVar2 + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(3);
            hashMap2.put("kid", new g.a("kid", "BLOB", true, 1, null, 1));
            hashMap2.put("hashVariant", new g.a("hashVariant", "INTEGER", true, 2, null, 1));
            hashMap2.put("index", new g.a("index", "TEXT", true, 0, null, 1));
            j1.g gVar3 = new j1.g("revocation_index_list", hashMap2, new HashSet(0), new HashSet(0));
            j1.g a11 = j1.g.a(gVar, "revocation_index_list");
            if (!gVar3.equals(a11)) {
                return new k0.b(false, "revocation_index_list(de.rki.covpass.sdk.revocation.database.RevocationIndexLocal).\n Expected:\n" + gVar3 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(5);
            hashMap3.put("kid", new g.a("kid", "BLOB", true, 1, null, 1));
            hashMap3.put("hashVariant", new g.a("hashVariant", "INTEGER", true, 2, null, 1));
            hashMap3.put("byteOne", new g.a("byteOne", "INTEGER", true, 3, null, 1));
            hashMap3.put("chunks", new g.a("chunks", "TEXT", true, 0, null, 1));
            hashMap3.put("timestamp", new g.a("timestamp", "INTEGER", true, 0, null, 1));
            j1.g gVar4 = new j1.g("revocation_byte_one_list", hashMap3, new HashSet(0), new HashSet(0));
            j1.g a12 = j1.g.a(gVar, "revocation_byte_one_list");
            if (!gVar4.equals(a12)) {
                return new k0.b(false, "revocation_byte_one_list(de.rki.covpass.sdk.revocation.database.RevocationByteOneLocal).\n Expected:\n" + gVar4 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(6);
            hashMap4.put("kid", new g.a("kid", "BLOB", true, 1, null, 1));
            hashMap4.put("hashVariant", new g.a("hashVariant", "INTEGER", true, 2, null, 1));
            hashMap4.put("byteOne", new g.a("byteOne", "INTEGER", true, 3, null, 1));
            hashMap4.put("byteTwo", new g.a("byteTwo", "INTEGER", true, 4, null, 1));
            hashMap4.put("chunks", new g.a("chunks", "TEXT", true, 0, null, 1));
            hashMap4.put("timestamp", new g.a("timestamp", "INTEGER", true, 0, null, 1));
            j1.g gVar5 = new j1.g("revocation_byte_two_list", hashMap4, new HashSet(0), new HashSet(0));
            j1.g a13 = j1.g.a(gVar, "revocation_byte_two_list");
            if (gVar5.equals(a13)) {
                return new k0.b(true, null);
            }
            return new k0.b(false, "revocation_byte_two_list(de.rki.covpass.sdk.revocation.database.RevocationByteTwoLocal).\n Expected:\n" + gVar5 + "\n Found:\n" + a13);
        }
    }

    @Override // de.rki.covpass.sdk.revocation.database.RevocationDatabase
    public i9.a F() {
        i9.a aVar;
        if (this.f8751q != null) {
            return this.f8751q;
        }
        synchronized (this) {
            if (this.f8751q == null) {
                this.f8751q = new b(this);
            }
            aVar = this.f8751q;
        }
        return aVar;
    }

    @Override // de.rki.covpass.sdk.revocation.database.RevocationDatabase
    public d G() {
        d dVar;
        if (this.f8752r != null) {
            return this.f8752r;
        }
        synchronized (this) {
            if (this.f8752r == null) {
                this.f8752r = new e(this);
            }
            dVar = this.f8752r;
        }
        return dVar;
    }

    @Override // de.rki.covpass.sdk.revocation.database.RevocationDatabase
    public h H() {
        h hVar;
        if (this.f8750p != null) {
            return this.f8750p;
        }
        synchronized (this) {
            if (this.f8750p == null) {
                this.f8750p = new i(this);
            }
            hVar = this.f8750p;
        }
        return hVar;
    }

    @Override // de.rki.covpass.sdk.revocation.database.RevocationDatabase
    public k I() {
        k kVar;
        if (this.f8749o != null) {
            return this.f8749o;
        }
        synchronized (this) {
            if (this.f8749o == null) {
                this.f8749o = new n(this);
            }
            kVar = this.f8749o;
        }
        return kVar;
    }

    @Override // androidx.room.i0
    protected p g() {
        return new p(this, new HashMap(0), new HashMap(0), "revocation_kid_list", "revocation_index_list", "revocation_byte_one_list", "revocation_byte_two_list");
    }

    @Override // androidx.room.i0
    protected m1.h h(j jVar) {
        return jVar.f4918a.a(h.b.a(jVar.f4919b).c(jVar.f4920c).b(new k0(jVar, new a(1), "cfbabe954125a83123d5853a3dc027b7", "550e19dfcb2aca839d1a1b39af0cc3d5")).a());
    }

    @Override // androidx.room.i0
    public List<i1.b> j(Map<Class<? extends i1.a>, i1.a> map) {
        return Arrays.asList(new i1.b[0]);
    }

    @Override // androidx.room.i0
    public Set<Class<? extends i1.a>> o() {
        return new HashSet();
    }

    @Override // androidx.room.i0
    protected Map<Class<?>, List<Class<?>>> p() {
        HashMap hashMap = new HashMap();
        hashMap.put(k.class, n.p());
        hashMap.put(i9.h.class, i.m());
        hashMap.put(i9.a.class, b.o());
        hashMap.put(d.class, e.q());
        return hashMap;
    }
}
