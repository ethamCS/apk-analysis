package androidx.work.impl;

import androidx.room.i0;
import androidx.room.j;
import androidx.room.k0;
import androidx.room.p;
import c2.b;
import c2.e;
import c2.f;
import c2.h;
import c2.i;
import c2.k;
import c2.l;
import c2.n;
import c2.o;
import c2.q;
import c2.r;
import c2.t;
import c2.u;
import j1.c;
import j1.g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import m1.g;
import m1.h;
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: p */
    private volatile q f5307p;

    /* renamed from: q */
    private volatile b f5308q;

    /* renamed from: r */
    private volatile t f5309r;

    /* renamed from: s */
    private volatile h f5310s;

    /* renamed from: t */
    private volatile k f5311t;

    /* renamed from: u */
    private volatile n f5312u;

    /* renamed from: v */
    private volatile e f5313v;

    /* loaded from: classes.dex */
    class a extends k0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(i10);
            WorkDatabase_Impl.this = r1;
        }

        @Override // androidx.room.k0.a
        public void a(g gVar) {
            gVar.H("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.H("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            gVar.H("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            gVar.H("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            gVar.H("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            gVar.H("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            gVar.H("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.H("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            gVar.H("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.H("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.H("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            gVar.H("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.H("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            gVar.H("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.H("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cf029002fffdcadf079e8d0a1c9a70ac')");
        }

        @Override // androidx.room.k0.a
        public void b(g gVar) {
            gVar.H("DROP TABLE IF EXISTS `Dependency`");
            gVar.H("DROP TABLE IF EXISTS `WorkSpec`");
            gVar.H("DROP TABLE IF EXISTS `WorkTag`");
            gVar.H("DROP TABLE IF EXISTS `SystemIdInfo`");
            gVar.H("DROP TABLE IF EXISTS `WorkName`");
            gVar.H("DROP TABLE IF EXISTS `WorkProgress`");
            gVar.H("DROP TABLE IF EXISTS `Preference`");
            if (((i0) WorkDatabase_Impl.this).f4882h != null) {
                int size = ((i0) WorkDatabase_Impl.this).f4882h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((i0.b) ((i0) WorkDatabase_Impl.this).f4882h.get(i10)).b(gVar);
                }
            }
        }

        @Override // androidx.room.k0.a
        protected void c(g gVar) {
            if (((i0) WorkDatabase_Impl.this).f4882h != null) {
                int size = ((i0) WorkDatabase_Impl.this).f4882h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((i0.b) ((i0) WorkDatabase_Impl.this).f4882h.get(i10)).a(gVar);
                }
            }
        }

        @Override // androidx.room.k0.a
        public void d(g gVar) {
            ((i0) WorkDatabase_Impl.this).f4875a = gVar;
            gVar.H("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.w(gVar);
            if (((i0) WorkDatabase_Impl.this).f4882h != null) {
                int size = ((i0) WorkDatabase_Impl.this).f4882h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((i0.b) ((i0) WorkDatabase_Impl.this).f4882h.get(i10)).c(gVar);
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
            hashMap.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new g.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new g.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new g.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            j1.g gVar2 = new j1.g("Dependency", hashMap, hashSet, hashSet2);
            j1.g a10 = j1.g.a(gVar, "Dependency");
            if (!gVar2.equals(a10)) {
                return new k0.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + gVar2 + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(24);
            hashMap2.put("id", new g.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("state", new g.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new g.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new g.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new g.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new g.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new g.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new g.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new g.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new g.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new g.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new g.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_start_time", new g.a("period_start_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new g.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new g.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new g.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_type", new g.a("required_network_type", "INTEGER", false, 0, null, 1));
            hashMap2.put("requires_charging", new g.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new g.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new g.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new g.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new g.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new g.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new g.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new g.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new g.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            j1.g gVar3 = new j1.g("WorkSpec", hashMap2, hashSet3, hashSet4);
            j1.g a11 = j1.g.a(gVar, "WorkSpec");
            if (!gVar3.equals(a11)) {
                return new k0.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + gVar3 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new g.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new g.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            j1.g gVar4 = new j1.g("WorkTag", hashMap3, hashSet5, hashSet6);
            j1.g a12 = j1.g.a(gVar, "WorkTag");
            if (!gVar4.equals(a12)) {
                return new k0.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + gVar4 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("system_id", new g.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            j1.g gVar5 = new j1.g("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            j1.g a13 = j1.g.a(gVar, "SystemIdInfo");
            if (!gVar5.equals(a13)) {
                return new k0.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + gVar5 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new g.a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new g.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            j1.g gVar6 = new j1.g("WorkName", hashMap5, hashSet8, hashSet9);
            j1.g a14 = j1.g.a(gVar, "WorkName");
            if (!gVar6.equals(a14)) {
                return new k0.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + gVar6 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new g.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            j1.g gVar7 = new j1.g("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            j1.g a15 = j1.g.a(gVar, "WorkProgress");
            if (!gVar7.equals(a15)) {
                return new k0.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + gVar7 + "\n Found:\n" + a15);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new g.a("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new g.a("long_value", "INTEGER", false, 0, null, 1));
            j1.g gVar8 = new j1.g("Preference", hashMap7, new HashSet(0), new HashSet(0));
            j1.g a16 = j1.g.a(gVar, "Preference");
            if (gVar8.equals(a16)) {
                return new k0.b(true, null);
            }
            return new k0.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + gVar8 + "\n Found:\n" + a16);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public b G() {
        b bVar;
        if (this.f5308q != null) {
            return this.f5308q;
        }
        synchronized (this) {
            if (this.f5308q == null) {
                this.f5308q = new c2.c(this);
            }
            bVar = this.f5308q;
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public e K() {
        e eVar;
        if (this.f5313v != null) {
            return this.f5313v;
        }
        synchronized (this) {
            if (this.f5313v == null) {
                this.f5313v = new f(this);
            }
            eVar = this.f5313v;
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public h L() {
        h hVar;
        if (this.f5310s != null) {
            return this.f5310s;
        }
        synchronized (this) {
            if (this.f5310s == null) {
                this.f5310s = new i(this);
            }
            hVar = this.f5310s;
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k M() {
        k kVar;
        if (this.f5311t != null) {
            return this.f5311t;
        }
        synchronized (this) {
            if (this.f5311t == null) {
                this.f5311t = new l(this);
            }
            kVar = this.f5311t;
        }
        return kVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public n N() {
        n nVar;
        if (this.f5312u != null) {
            return this.f5312u;
        }
        synchronized (this) {
            if (this.f5312u == null) {
                this.f5312u = new o(this);
            }
            nVar = this.f5312u;
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q O() {
        q qVar;
        if (this.f5307p != null) {
            return this.f5307p;
        }
        synchronized (this) {
            if (this.f5307p == null) {
                this.f5307p = new r(this);
            }
            qVar = this.f5307p;
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public t P() {
        t tVar;
        if (this.f5309r != null) {
            return this.f5309r;
        }
        synchronized (this) {
            if (this.f5309r == null) {
                this.f5309r = new u(this);
            }
            tVar = this.f5309r;
        }
        return tVar;
    }

    @Override // androidx.room.i0
    protected p g() {
        return new p(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.i0
    protected m1.h h(j jVar) {
        return jVar.f4918a.a(h.b.a(jVar.f4919b).c(jVar.f4920c).b(new k0(jVar, new a(11), "cf029002fffdcadf079e8d0a1c9a70ac", "8aff2efc47fafe870c738f727dfcfc6e")).a());
    }
}
