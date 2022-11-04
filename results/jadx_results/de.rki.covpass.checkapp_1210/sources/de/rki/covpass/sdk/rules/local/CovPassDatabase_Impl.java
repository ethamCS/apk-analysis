package de.rki.covpass.sdk.rules.local;

import androidx.room.i0;
import androidx.room.j;
import androidx.room.k0;
import androidx.room.p;
import i1.b;
import j1.g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l9.h;
import m1.g;
import m1.h;
import r9.e;
import s9.c;
/* loaded from: classes.dex */
public final class CovPassDatabase_Impl extends CovPassDatabase {

    /* renamed from: o */
    private volatile e f8775o;

    /* renamed from: p */
    private volatile q9.e f8776p;

    /* renamed from: q */
    private volatile c f8777q;

    /* renamed from: r */
    private volatile l9.e f8778r;

    /* renamed from: s */
    private volatile p9.a f8779s;

    /* loaded from: classes.dex */
    class a extends k0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(i10);
            CovPassDatabase_Impl.this = r1;
        }

        @Override // androidx.room.k0.a
        public void a(g gVar) {
            gVar.H("CREATE TABLE IF NOT EXISTS `covpass_rules` (`ruleId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `identifier` TEXT NOT NULL, `type` TEXT NOT NULL, `version` TEXT NOT NULL, `schemaVersion` TEXT NOT NULL, `engine` TEXT NOT NULL, `engineVersion` TEXT NOT NULL, `ruleCertificateType` TEXT NOT NULL, `validFrom` INTEGER NOT NULL, `validTo` INTEGER NOT NULL, `affectedString` TEXT NOT NULL, `logic` TEXT NOT NULL, `countryCode` TEXT NOT NULL, `region` TEXT, `hash` TEXT NOT NULL)");
            gVar.H("CREATE TABLE IF NOT EXISTS `rules_descriptions` (`descriptionId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `ruleContainerId` INTEGER NOT NULL, `lang` TEXT NOT NULL, `desc` TEXT NOT NULL, FOREIGN KEY(`ruleContainerId`) REFERENCES `covpass_rules`(`ruleId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            gVar.H("CREATE TABLE IF NOT EXISTS `covpass_domestic_rules` (`ruleId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `identifier` TEXT NOT NULL, `type` TEXT NOT NULL, `version` TEXT NOT NULL, `schemaVersion` TEXT NOT NULL, `engine` TEXT NOT NULL, `engineVersion` TEXT NOT NULL, `ruleCertificateType` TEXT NOT NULL, `validFrom` INTEGER NOT NULL, `validTo` INTEGER NOT NULL, `affectedString` TEXT NOT NULL, `logic` TEXT NOT NULL, `countryCode` TEXT NOT NULL, `region` TEXT, `hash` TEXT NOT NULL)");
            gVar.H("CREATE TABLE IF NOT EXISTS `domestic_rules_descriptions` (`descriptionId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `ruleContainerId` INTEGER NOT NULL, `lang` TEXT NOT NULL, `desc` TEXT NOT NULL, FOREIGN KEY(`ruleContainerId`) REFERENCES `covpass_domestic_rules`(`ruleId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            gVar.H("CREATE TABLE IF NOT EXISTS `covpass_valuesets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `valueSetId` TEXT NOT NULL, `valueSetDate` INTEGER NOT NULL, `valueSetValues` TEXT NOT NULL, `hash` TEXT NOT NULL)");
            gVar.H("CREATE TABLE IF NOT EXISTS `booster_rules_descriptions` (`descriptionId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `ruleContainerId` INTEGER NOT NULL, `lang` TEXT NOT NULL, `desc` TEXT NOT NULL, FOREIGN KEY(`ruleContainerId`) REFERENCES `booster_rules`(`ruleId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            gVar.H("CREATE TABLE IF NOT EXISTS `booster_rules` (`ruleId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `identifier` TEXT NOT NULL, `type` TEXT NOT NULL, `version` TEXT NOT NULL, `schemaVersion` TEXT NOT NULL, `engine` TEXT NOT NULL, `engineVersion` TEXT NOT NULL, `ruleCertificateType` TEXT NOT NULL, `validFrom` INTEGER NOT NULL, `validTo` INTEGER NOT NULL, `affectedString` TEXT NOT NULL, `logic` TEXT NOT NULL, `countryCode` TEXT NOT NULL, `region` TEXT, `hash` TEXT NOT NULL)");
            gVar.H("CREATE TABLE IF NOT EXISTS `countries` (`countryId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `countryCode` TEXT NOT NULL)");
            gVar.H("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.H("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '83d2428844dbe37b156d992eb5dbc3d2')");
        }

        @Override // androidx.room.k0.a
        public void b(g gVar) {
            gVar.H("DROP TABLE IF EXISTS `covpass_rules`");
            gVar.H("DROP TABLE IF EXISTS `rules_descriptions`");
            gVar.H("DROP TABLE IF EXISTS `covpass_domestic_rules`");
            gVar.H("DROP TABLE IF EXISTS `domestic_rules_descriptions`");
            gVar.H("DROP TABLE IF EXISTS `covpass_valuesets`");
            gVar.H("DROP TABLE IF EXISTS `booster_rules_descriptions`");
            gVar.H("DROP TABLE IF EXISTS `booster_rules`");
            gVar.H("DROP TABLE IF EXISTS `countries`");
            if (((i0) CovPassDatabase_Impl.this).f4882h != null) {
                int size = ((i0) CovPassDatabase_Impl.this).f4882h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((i0.b) ((i0) CovPassDatabase_Impl.this).f4882h.get(i10)).b(gVar);
                }
            }
        }

        @Override // androidx.room.k0.a
        protected void c(g gVar) {
            if (((i0) CovPassDatabase_Impl.this).f4882h != null) {
                int size = ((i0) CovPassDatabase_Impl.this).f4882h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((i0.b) ((i0) CovPassDatabase_Impl.this).f4882h.get(i10)).a(gVar);
                }
            }
        }

        @Override // androidx.room.k0.a
        public void d(g gVar) {
            ((i0) CovPassDatabase_Impl.this).f4875a = gVar;
            gVar.H("PRAGMA foreign_keys = ON");
            CovPassDatabase_Impl.this.w(gVar);
            if (((i0) CovPassDatabase_Impl.this).f4882h != null) {
                int size = ((i0) CovPassDatabase_Impl.this).f4882h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((i0.b) ((i0) CovPassDatabase_Impl.this).f4882h.get(i10)).c(gVar);
                }
            }
        }

        @Override // androidx.room.k0.a
        public void e(g gVar) {
        }

        @Override // androidx.room.k0.a
        public void f(g gVar) {
            j1.c.b(gVar);
        }

        @Override // androidx.room.k0.a
        protected k0.b g(g gVar) {
            HashMap hashMap = new HashMap(15);
            hashMap.put("ruleId", new g.a("ruleId", "INTEGER", true, 1, null, 1));
            hashMap.put("identifier", new g.a("identifier", "TEXT", true, 0, null, 1));
            hashMap.put("type", new g.a("type", "TEXT", true, 0, null, 1));
            hashMap.put("version", new g.a("version", "TEXT", true, 0, null, 1));
            hashMap.put("schemaVersion", new g.a("schemaVersion", "TEXT", true, 0, null, 1));
            hashMap.put("engine", new g.a("engine", "TEXT", true, 0, null, 1));
            hashMap.put("engineVersion", new g.a("engineVersion", "TEXT", true, 0, null, 1));
            hashMap.put("ruleCertificateType", new g.a("ruleCertificateType", "TEXT", true, 0, null, 1));
            hashMap.put("validFrom", new g.a("validFrom", "INTEGER", true, 0, null, 1));
            hashMap.put("validTo", new g.a("validTo", "INTEGER", true, 0, null, 1));
            hashMap.put("affectedString", new g.a("affectedString", "TEXT", true, 0, null, 1));
            hashMap.put("logic", new g.a("logic", "TEXT", true, 0, null, 1));
            hashMap.put("countryCode", new g.a("countryCode", "TEXT", true, 0, null, 1));
            hashMap.put("region", new g.a("region", "TEXT", false, 0, null, 1));
            hashMap.put("hash", new g.a("hash", "TEXT", true, 0, null, 1));
            j1.g gVar2 = new j1.g("covpass_rules", hashMap, new HashSet(0), new HashSet(0));
            j1.g a10 = j1.g.a(gVar, "covpass_rules");
            if (!gVar2.equals(a10)) {
                return new k0.b(false, "covpass_rules(de.rki.covpass.sdk.rules.local.rules.eu.CovPassEuRuleLocal).\n Expected:\n" + gVar2 + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(4);
            hashMap2.put("descriptionId", new g.a("descriptionId", "INTEGER", true, 1, null, 1));
            hashMap2.put("ruleContainerId", new g.a("ruleContainerId", "INTEGER", true, 0, null, 1));
            hashMap2.put("lang", new g.a("lang", "TEXT", true, 0, null, 1));
            hashMap2.put("desc", new g.a("desc", "TEXT", true, 0, null, 1));
            HashSet hashSet = new HashSet(1);
            hashSet.add(new g.b("covpass_rules", "CASCADE", "NO ACTION", Arrays.asList("ruleContainerId"), Arrays.asList("ruleId")));
            j1.g gVar3 = new j1.g("rules_descriptions", hashMap2, hashSet, new HashSet(0));
            j1.g a11 = j1.g.a(gVar, "rules_descriptions");
            if (!gVar3.equals(a11)) {
                return new k0.b(false, "rules_descriptions(de.rki.covpass.sdk.rules.local.rules.eu.CovPassEuRuleDescriptionLocal).\n Expected:\n" + gVar3 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(15);
            hashMap3.put("ruleId", new g.a("ruleId", "INTEGER", true, 1, null, 1));
            hashMap3.put("identifier", new g.a("identifier", "TEXT", true, 0, null, 1));
            hashMap3.put("type", new g.a("type", "TEXT", true, 0, null, 1));
            hashMap3.put("version", new g.a("version", "TEXT", true, 0, null, 1));
            hashMap3.put("schemaVersion", new g.a("schemaVersion", "TEXT", true, 0, null, 1));
            hashMap3.put("engine", new g.a("engine", "TEXT", true, 0, null, 1));
            hashMap3.put("engineVersion", new g.a("engineVersion", "TEXT", true, 0, null, 1));
            hashMap3.put("ruleCertificateType", new g.a("ruleCertificateType", "TEXT", true, 0, null, 1));
            hashMap3.put("validFrom", new g.a("validFrom", "INTEGER", true, 0, null, 1));
            hashMap3.put("validTo", new g.a("validTo", "INTEGER", true, 0, null, 1));
            hashMap3.put("affectedString", new g.a("affectedString", "TEXT", true, 0, null, 1));
            hashMap3.put("logic", new g.a("logic", "TEXT", true, 0, null, 1));
            hashMap3.put("countryCode", new g.a("countryCode", "TEXT", true, 0, null, 1));
            hashMap3.put("region", new g.a("region", "TEXT", false, 0, null, 1));
            hashMap3.put("hash", new g.a("hash", "TEXT", true, 0, null, 1));
            j1.g gVar4 = new j1.g("covpass_domestic_rules", hashMap3, new HashSet(0), new HashSet(0));
            j1.g a12 = j1.g.a(gVar, "covpass_domestic_rules");
            if (!gVar4.equals(a12)) {
                return new k0.b(false, "covpass_domestic_rules(de.rki.covpass.sdk.rules.local.rules.domestic.CovPassDomesticRuleLocal).\n Expected:\n" + gVar4 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(4);
            hashMap4.put("descriptionId", new g.a("descriptionId", "INTEGER", true, 1, null, 1));
            hashMap4.put("ruleContainerId", new g.a("ruleContainerId", "INTEGER", true, 0, null, 1));
            hashMap4.put("lang", new g.a("lang", "TEXT", true, 0, null, 1));
            hashMap4.put("desc", new g.a("desc", "TEXT", true, 0, null, 1));
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new g.b("covpass_domestic_rules", "CASCADE", "NO ACTION", Arrays.asList("ruleContainerId"), Arrays.asList("ruleId")));
            j1.g gVar5 = new j1.g("domestic_rules_descriptions", hashMap4, hashSet2, new HashSet(0));
            j1.g a13 = j1.g.a(gVar, "domestic_rules_descriptions");
            if (!gVar5.equals(a13)) {
                return new k0.b(false, "domestic_rules_descriptions(de.rki.covpass.sdk.rules.local.rules.domestic.CovPassDomesticRuleDescriptionLocal).\n Expected:\n" + gVar5 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(5);
            hashMap5.put("id", new g.a("id", "INTEGER", true, 1, null, 1));
            hashMap5.put("valueSetId", new g.a("valueSetId", "TEXT", true, 0, null, 1));
            hashMap5.put("valueSetDate", new g.a("valueSetDate", "INTEGER", true, 0, null, 1));
            hashMap5.put("valueSetValues", new g.a("valueSetValues", "TEXT", true, 0, null, 1));
            hashMap5.put("hash", new g.a("hash", "TEXT", true, 0, null, 1));
            j1.g gVar6 = new j1.g("covpass_valuesets", hashMap5, new HashSet(0), new HashSet(0));
            j1.g a14 = j1.g.a(gVar, "covpass_valuesets");
            if (!gVar6.equals(a14)) {
                return new k0.b(false, "covpass_valuesets(de.rki.covpass.sdk.rules.local.valuesets.CovPassValueSetLocal).\n Expected:\n" + gVar6 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(4);
            hashMap6.put("descriptionId", new g.a("descriptionId", "INTEGER", true, 1, null, 1));
            hashMap6.put("ruleContainerId", new g.a("ruleContainerId", "INTEGER", true, 0, null, 1));
            hashMap6.put("lang", new g.a("lang", "TEXT", true, 0, null, 1));
            hashMap6.put("desc", new g.a("desc", "TEXT", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new g.b("booster_rules", "CASCADE", "NO ACTION", Arrays.asList("ruleContainerId"), Arrays.asList("ruleId")));
            j1.g gVar7 = new j1.g("booster_rules_descriptions", hashMap6, hashSet3, new HashSet(0));
            j1.g a15 = j1.g.a(gVar, "booster_rules_descriptions");
            if (!gVar7.equals(a15)) {
                return new k0.b(false, "booster_rules_descriptions(de.rki.covpass.sdk.rules.booster.local.BoosterDescriptionLocal).\n Expected:\n" + gVar7 + "\n Found:\n" + a15);
            }
            HashMap hashMap7 = new HashMap(15);
            hashMap7.put("ruleId", new g.a("ruleId", "INTEGER", true, 1, null, 1));
            hashMap7.put("identifier", new g.a("identifier", "TEXT", true, 0, null, 1));
            hashMap7.put("type", new g.a("type", "TEXT", true, 0, null, 1));
            hashMap7.put("version", new g.a("version", "TEXT", true, 0, null, 1));
            hashMap7.put("schemaVersion", new g.a("schemaVersion", "TEXT", true, 0, null, 1));
            hashMap7.put("engine", new g.a("engine", "TEXT", true, 0, null, 1));
            hashMap7.put("engineVersion", new g.a("engineVersion", "TEXT", true, 0, null, 1));
            hashMap7.put("ruleCertificateType", new g.a("ruleCertificateType", "TEXT", true, 0, null, 1));
            hashMap7.put("validFrom", new g.a("validFrom", "INTEGER", true, 0, null, 1));
            hashMap7.put("validTo", new g.a("validTo", "INTEGER", true, 0, null, 1));
            hashMap7.put("affectedString", new g.a("affectedString", "TEXT", true, 0, null, 1));
            hashMap7.put("logic", new g.a("logic", "TEXT", true, 0, null, 1));
            hashMap7.put("countryCode", new g.a("countryCode", "TEXT", true, 0, null, 1));
            hashMap7.put("region", new g.a("region", "TEXT", false, 0, null, 1));
            hashMap7.put("hash", new g.a("hash", "TEXT", true, 0, null, 1));
            j1.g gVar8 = new j1.g("booster_rules", hashMap7, new HashSet(0), new HashSet(0));
            j1.g a16 = j1.g.a(gVar, "booster_rules");
            if (!gVar8.equals(a16)) {
                return new k0.b(false, "booster_rules(de.rki.covpass.sdk.rules.booster.local.BoosterRuleLocal).\n Expected:\n" + gVar8 + "\n Found:\n" + a16);
            }
            HashMap hashMap8 = new HashMap(2);
            hashMap8.put("countryId", new g.a("countryId", "INTEGER", true, 1, null, 1));
            hashMap8.put("countryCode", new g.a("countryCode", "TEXT", true, 0, null, 1));
            j1.g gVar9 = new j1.g("countries", hashMap8, new HashSet(0), new HashSet(0));
            j1.g a17 = j1.g.a(gVar, "countries");
            if (gVar9.equals(a17)) {
                return new k0.b(true, null);
            }
            return new k0.b(false, "countries(de.rki.covpass.sdk.rules.local.countries.CountryLocal).\n Expected:\n" + gVar9 + "\n Found:\n" + a17);
        }
    }

    @Override // de.rki.covpass.sdk.rules.local.CovPassDatabase
    public l9.e F() {
        l9.e eVar;
        if (this.f8778r != null) {
            return this.f8778r;
        }
        synchronized (this) {
            if (this.f8778r == null) {
                this.f8778r = new h(this);
            }
            eVar = this.f8778r;
        }
        return eVar;
    }

    @Override // de.rki.covpass.sdk.rules.local.CovPassDatabase
    public p9.a G() {
        p9.a aVar;
        if (this.f8779s != null) {
            return this.f8779s;
        }
        synchronized (this) {
            if (this.f8779s == null) {
                this.f8779s = new p9.c(this);
            }
            aVar = this.f8779s;
        }
        return aVar;
    }

    @Override // de.rki.covpass.sdk.rules.local.CovPassDatabase
    public q9.e H() {
        q9.e eVar;
        if (this.f8776p != null) {
            return this.f8776p;
        }
        synchronized (this) {
            if (this.f8776p == null) {
                this.f8776p = new q9.h(this);
            }
            eVar = this.f8776p;
        }
        return eVar;
    }

    @Override // de.rki.covpass.sdk.rules.local.CovPassDatabase
    public e I() {
        e eVar;
        if (this.f8775o != null) {
            return this.f8775o;
        }
        synchronized (this) {
            if (this.f8775o == null) {
                this.f8775o = new r9.h(this);
            }
            eVar = this.f8775o;
        }
        return eVar;
    }

    @Override // de.rki.covpass.sdk.rules.local.CovPassDatabase
    public c J() {
        c cVar;
        if (this.f8777q != null) {
            return this.f8777q;
        }
        synchronized (this) {
            if (this.f8777q == null) {
                this.f8777q = new s9.e(this);
            }
            cVar = this.f8777q;
        }
        return cVar;
    }

    @Override // androidx.room.i0
    protected p g() {
        return new p(this, new HashMap(0), new HashMap(0), "covpass_rules", "rules_descriptions", "covpass_domestic_rules", "domestic_rules_descriptions", "covpass_valuesets", "booster_rules_descriptions", "booster_rules", "countries");
    }

    @Override // androidx.room.i0
    protected m1.h h(j jVar) {
        return jVar.f4918a.a(h.b.a(jVar.f4919b).c(jVar.f4920c).b(new k0(jVar, new a(7), "83d2428844dbe37b156d992eb5dbc3d2", "c75afaa0162d02bc120d0eea73f14318")).a());
    }

    @Override // androidx.room.i0
    public List<b> j(Map<Class<? extends i1.a>, i1.a> map) {
        return Arrays.asList(new b[0]);
    }

    @Override // androidx.room.i0
    public Set<Class<? extends i1.a>> o() {
        return new HashSet();
    }

    @Override // androidx.room.i0
    protected Map<Class<?>, List<Class<?>>> p() {
        HashMap hashMap = new HashMap();
        hashMap.put(e.class, r9.h.B());
        hashMap.put(q9.e.class, q9.h.B());
        hashMap.put(c.class, s9.e.l());
        hashMap.put(l9.e.class, l9.h.z());
        hashMap.put(p9.a.class, p9.c.k());
        return hashMap;
    }
}
