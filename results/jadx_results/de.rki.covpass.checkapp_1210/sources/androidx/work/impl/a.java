package androidx.work.impl;

import android.content.Context;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    public static i1.b f5315a = new C0070a(1, 2);

    /* renamed from: b */
    public static i1.b f5316b = new b(3, 4);

    /* renamed from: c */
    public static i1.b f5317c = new c(4, 5);

    /* renamed from: d */
    public static i1.b f5318d = new d(6, 7);

    /* renamed from: e */
    public static i1.b f5319e = new e(7, 8);

    /* renamed from: f */
    public static i1.b f5320f = new f(8, 9);

    /* renamed from: androidx.work.impl.a$a */
    /* loaded from: classes.dex */
    class C0070a extends i1.b {
        C0070a(int i10, int i11) {
            super(i10, i11);
        }

        @Override // i1.b
        public void a(m1.g gVar) {
            gVar.H("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.H("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            gVar.H("DROP TABLE IF EXISTS alarmInfo");
            gVar.H("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* loaded from: classes.dex */
    class b extends i1.b {
        b(int i10, int i11) {
            super(i10, i11);
        }

        @Override // i1.b
        public void a(m1.g gVar) {
            gVar.H("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    /* loaded from: classes.dex */
    class c extends i1.b {
        c(int i10, int i11) {
            super(i10, i11);
        }

        @Override // i1.b
        public void a(m1.g gVar) {
            gVar.H("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            gVar.H("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* loaded from: classes.dex */
    class d extends i1.b {
        d(int i10, int i11) {
            super(i10, i11);
        }

        @Override // i1.b
        public void a(m1.g gVar) {
            gVar.H("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* loaded from: classes.dex */
    class e extends i1.b {
        e(int i10, int i11) {
            super(i10, i11);
        }

        @Override // i1.b
        public void a(m1.g gVar) {
            gVar.H("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* loaded from: classes.dex */
    class f extends i1.b {
        f(int i10, int i11) {
            super(i10, i11);
        }

        @Override // i1.b
        public void a(m1.g gVar) {
            gVar.H("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* loaded from: classes.dex */
    public static class g extends i1.b {

        /* renamed from: c */
        final Context f5321c;

        public g(Context context, int i10, int i11) {
            super(i10, i11);
            this.f5321c = context;
        }

        @Override // i1.b
        public void a(m1.g gVar) {
            if (this.f12304b >= 10) {
                gVar.F0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f5321c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h extends i1.b {

        /* renamed from: c */
        final Context f5322c;

        public h(Context context) {
            super(9, 10);
            this.f5322c = context;
        }

        @Override // i1.b
        public void a(m1.g gVar) {
            gVar.H("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            d2.e.b(this.f5322c, gVar);
            d2.c.a(this.f5322c, gVar);
        }
    }
}
