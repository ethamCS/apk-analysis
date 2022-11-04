package c2;

import android.database.Cursor;
import androidx.room.i0;
import c2.p;
import java.util.ArrayList;
import java.util.List;
import u1.s;
/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a */
    private final i0 f6189a;

    /* renamed from: b */
    private final h1.g<p> f6190b;

    /* renamed from: c */
    private final h1.m f6191c;

    /* renamed from: d */
    private final h1.m f6192d;

    /* renamed from: e */
    private final h1.m f6193e;

    /* renamed from: f */
    private final h1.m f6194f;

    /* renamed from: g */
    private final h1.m f6195g;

    /* renamed from: h */
    private final h1.m f6196h;

    /* renamed from: i */
    private final h1.m f6197i;

    /* renamed from: j */
    private final h1.m f6198j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends h1.g<p> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i0 i0Var) {
            super(i0Var);
            r.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: k */
        public void g(m1.k kVar, p pVar) {
            String str = pVar.f6164a;
            if (str == null) {
                kVar.a0(1);
            } else {
                kVar.K(1, str);
            }
            kVar.A0(2, v.h(pVar.f6165b));
            String str2 = pVar.f6166c;
            if (str2 == null) {
                kVar.a0(3);
            } else {
                kVar.K(3, str2);
            }
            String str3 = pVar.f6167d;
            if (str3 == null) {
                kVar.a0(4);
            } else {
                kVar.K(4, str3);
            }
            byte[] k10 = androidx.work.a.k(pVar.f6168e);
            if (k10 == null) {
                kVar.a0(5);
            } else {
                kVar.L0(5, k10);
            }
            byte[] k11 = androidx.work.a.k(pVar.f6169f);
            if (k11 == null) {
                kVar.a0(6);
            } else {
                kVar.L0(6, k11);
            }
            kVar.A0(7, pVar.f6170g);
            kVar.A0(8, pVar.f6171h);
            kVar.A0(9, pVar.f6172i);
            kVar.A0(10, pVar.f6174k);
            kVar.A0(11, v.a(pVar.f6175l));
            kVar.A0(12, pVar.f6176m);
            kVar.A0(13, pVar.f6177n);
            kVar.A0(14, pVar.f6178o);
            kVar.A0(15, pVar.f6179p);
            kVar.A0(16, pVar.f6180q ? 1L : 0L);
            u1.c cVar = pVar.f6173j;
            if (cVar != null) {
                kVar.A0(17, v.g(cVar.b()));
                kVar.A0(18, cVar.g() ? 1L : 0L);
                kVar.A0(19, cVar.h() ? 1L : 0L);
                kVar.A0(20, cVar.f() ? 1L : 0L);
                kVar.A0(21, cVar.i() ? 1L : 0L);
                kVar.A0(22, cVar.c());
                kVar.A0(23, cVar.d());
                byte[] c10 = v.c(cVar.a());
                if (c10 != null) {
                    kVar.L0(24, c10);
                    return;
                }
            } else {
                kVar.a0(17);
                kVar.a0(18);
                kVar.a0(19);
                kVar.a0(20);
                kVar.a0(21);
                kVar.a0(22);
                kVar.a0(23);
            }
            kVar.a0(24);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i0 i0Var) {
            super(i0Var);
            r.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i0 i0Var) {
            super(i0Var);
            r.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(i0 i0Var) {
            super(i0Var);
            r.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(i0 i0Var) {
            super(i0Var);
            r.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(i0 i0Var) {
            super(i0Var);
            r.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(i0 i0Var) {
            super(i0Var);
            r.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(i0 i0Var) {
            super(i0Var);
            r.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i extends h1.m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(i0 i0Var) {
            super(i0Var);
            r.this = r1;
        }

        @Override // h1.m
        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(i0 i0Var) {
        this.f6189a = i0Var;
        this.f6190b = new a(i0Var);
        this.f6191c = new b(i0Var);
        this.f6192d = new c(i0Var);
        this.f6193e = new d(i0Var);
        this.f6194f = new e(i0Var);
        this.f6195g = new f(i0Var);
        this.f6196h = new g(i0Var);
        this.f6197i = new h(i0Var);
        this.f6198j = new i(i0Var);
    }

    @Override // c2.q
    public void a(String str) {
        this.f6189a.d();
        m1.k a10 = this.f6191c.a();
        if (str == null) {
            a10.a0(1);
        } else {
            a10.K(1, str);
        }
        this.f6189a.e();
        try {
            a10.S();
            this.f6189a.D();
        } finally {
            this.f6189a.i();
            this.f6191c.f(a10);
        }
    }

    @Override // c2.q
    public List<p> b() {
        h1.l lVar;
        Throwable th2;
        h1.l f10 = h1.l.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=1", 0);
        this.f6189a.d();
        Cursor c10 = j1.c.c(this.f6189a, f10, false, null);
        try {
            int e10 = j1.b.e(c10, "required_network_type");
            int e11 = j1.b.e(c10, "requires_charging");
            int e12 = j1.b.e(c10, "requires_device_idle");
            int e13 = j1.b.e(c10, "requires_battery_not_low");
            int e14 = j1.b.e(c10, "requires_storage_not_low");
            int e15 = j1.b.e(c10, "trigger_content_update_delay");
            int e16 = j1.b.e(c10, "trigger_max_content_delay");
            int e17 = j1.b.e(c10, "content_uri_triggers");
            int e18 = j1.b.e(c10, "id");
            int e19 = j1.b.e(c10, "state");
            int e20 = j1.b.e(c10, "worker_class_name");
            int e21 = j1.b.e(c10, "input_merger_class_name");
            int e22 = j1.b.e(c10, "input");
            int e23 = j1.b.e(c10, "output");
            lVar = f10;
            try {
                int e24 = j1.b.e(c10, "initial_delay");
                int e25 = j1.b.e(c10, "interval_duration");
                int e26 = j1.b.e(c10, "flex_duration");
                int e27 = j1.b.e(c10, "run_attempt_count");
                int e28 = j1.b.e(c10, "backoff_policy");
                int e29 = j1.b.e(c10, "backoff_delay_duration");
                int e30 = j1.b.e(c10, "period_start_time");
                int e31 = j1.b.e(c10, "minimum_retention_duration");
                int e32 = j1.b.e(c10, "schedule_requested_at");
                int e33 = j1.b.e(c10, "run_in_foreground");
                int i10 = e23;
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    String string = c10.getString(e18);
                    int i11 = e18;
                    String string2 = c10.getString(e20);
                    int i12 = e20;
                    u1.c cVar = new u1.c();
                    int i13 = e10;
                    cVar.k(v.e(c10.getInt(e10)));
                    cVar.m(c10.getInt(e11) != 0);
                    cVar.n(c10.getInt(e12) != 0);
                    cVar.l(c10.getInt(e13) != 0);
                    cVar.o(c10.getInt(e14) != 0);
                    int i14 = e11;
                    int i15 = e12;
                    cVar.p(c10.getLong(e15));
                    cVar.q(c10.getLong(e16));
                    cVar.j(v.b(c10.getBlob(e17)));
                    p pVar = new p(string, string2);
                    pVar.f6165b = v.f(c10.getInt(e19));
                    pVar.f6167d = c10.getString(e21);
                    pVar.f6168e = androidx.work.a.g(c10.getBlob(e22));
                    int i16 = i10;
                    pVar.f6169f = androidx.work.a.g(c10.getBlob(i16));
                    i10 = i16;
                    int i17 = e24;
                    pVar.f6170g = c10.getLong(i17);
                    int i18 = e22;
                    int i19 = e25;
                    pVar.f6171h = c10.getLong(i19);
                    int i20 = e13;
                    int i21 = e26;
                    pVar.f6172i = c10.getLong(i21);
                    int i22 = e27;
                    pVar.f6174k = c10.getInt(i22);
                    int i23 = e28;
                    pVar.f6175l = v.d(c10.getInt(i23));
                    e26 = i21;
                    int i24 = e29;
                    pVar.f6176m = c10.getLong(i24);
                    int i25 = e30;
                    pVar.f6177n = c10.getLong(i25);
                    e30 = i25;
                    int i26 = e31;
                    pVar.f6178o = c10.getLong(i26);
                    int i27 = e32;
                    pVar.f6179p = c10.getLong(i27);
                    int i28 = e33;
                    pVar.f6180q = c10.getInt(i28) != 0;
                    pVar.f6173j = cVar;
                    arrayList.add(pVar);
                    e32 = i27;
                    e33 = i28;
                    e11 = i14;
                    e22 = i18;
                    e24 = i17;
                    e25 = i19;
                    e27 = i22;
                    e18 = i11;
                    e20 = i12;
                    e10 = i13;
                    e31 = i26;
                    e12 = i15;
                    e29 = i24;
                    e13 = i20;
                    e28 = i23;
                }
                c10.close();
                lVar.j();
                return arrayList;
            } catch (Throwable th3) {
                th2 = th3;
                c10.close();
                lVar.j();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            lVar = f10;
        }
    }

    @Override // c2.q
    public List<String> c() {
        h1.l f10 = h1.l.f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f6189a.d();
        Cursor c10 = j1.c.c(this.f6189a, f10, false, null);
        try {
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                arrayList.add(c10.getString(0));
            }
            return arrayList;
        } finally {
            c10.close();
            f10.j();
        }
    }

    @Override // c2.q
    public int d(String str, long j10) {
        this.f6189a.d();
        m1.k a10 = this.f6196h.a();
        a10.A0(1, j10);
        if (str == null) {
            a10.a0(2);
        } else {
            a10.K(2, str);
        }
        this.f6189a.e();
        try {
            int S = a10.S();
            this.f6189a.D();
            return S;
        } finally {
            this.f6189a.i();
            this.f6196h.f(a10);
        }
    }

    @Override // c2.q
    public List<String> e(String str) {
        h1.l f10 = h1.l.f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            f10.a0(1);
        } else {
            f10.K(1, str);
        }
        this.f6189a.d();
        Cursor c10 = j1.c.c(this.f6189a, f10, false, null);
        try {
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                arrayList.add(c10.getString(0));
            }
            return arrayList;
        } finally {
            c10.close();
            f10.j();
        }
    }

    @Override // c2.q
    public List<p.b> f(String str) {
        h1.l f10 = h1.l.f("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            f10.a0(1);
        } else {
            f10.K(1, str);
        }
        this.f6189a.d();
        Cursor c10 = j1.c.c(this.f6189a, f10, false, null);
        try {
            int e10 = j1.b.e(c10, "id");
            int e11 = j1.b.e(c10, "state");
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                p.b bVar = new p.b();
                bVar.f6181a = c10.getString(e10);
                bVar.f6182b = v.f(c10.getInt(e11));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            c10.close();
            f10.j();
        }
    }

    @Override // c2.q
    public List<p> g(long j10) {
        h1.l lVar;
        Throwable th2;
        h1.l f10 = h1.l.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        f10.A0(1, j10);
        this.f6189a.d();
        Cursor c10 = j1.c.c(this.f6189a, f10, false, null);
        try {
            int e10 = j1.b.e(c10, "required_network_type");
            int e11 = j1.b.e(c10, "requires_charging");
            int e12 = j1.b.e(c10, "requires_device_idle");
            int e13 = j1.b.e(c10, "requires_battery_not_low");
            int e14 = j1.b.e(c10, "requires_storage_not_low");
            int e15 = j1.b.e(c10, "trigger_content_update_delay");
            int e16 = j1.b.e(c10, "trigger_max_content_delay");
            int e17 = j1.b.e(c10, "content_uri_triggers");
            int e18 = j1.b.e(c10, "id");
            int e19 = j1.b.e(c10, "state");
            int e20 = j1.b.e(c10, "worker_class_name");
            int e21 = j1.b.e(c10, "input_merger_class_name");
            int e22 = j1.b.e(c10, "input");
            int e23 = j1.b.e(c10, "output");
            lVar = f10;
            try {
                int e24 = j1.b.e(c10, "initial_delay");
                int e25 = j1.b.e(c10, "interval_duration");
                int e26 = j1.b.e(c10, "flex_duration");
                int e27 = j1.b.e(c10, "run_attempt_count");
                int e28 = j1.b.e(c10, "backoff_policy");
                int e29 = j1.b.e(c10, "backoff_delay_duration");
                int e30 = j1.b.e(c10, "period_start_time");
                int e31 = j1.b.e(c10, "minimum_retention_duration");
                int e32 = j1.b.e(c10, "schedule_requested_at");
                int e33 = j1.b.e(c10, "run_in_foreground");
                int i10 = e23;
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    String string = c10.getString(e18);
                    int i11 = e18;
                    String string2 = c10.getString(e20);
                    int i12 = e20;
                    u1.c cVar = new u1.c();
                    int i13 = e10;
                    cVar.k(v.e(c10.getInt(e10)));
                    cVar.m(c10.getInt(e11) != 0);
                    cVar.n(c10.getInt(e12) != 0);
                    cVar.l(c10.getInt(e13) != 0);
                    cVar.o(c10.getInt(e14) != 0);
                    int i14 = e11;
                    int i15 = e12;
                    cVar.p(c10.getLong(e15));
                    cVar.q(c10.getLong(e16));
                    cVar.j(v.b(c10.getBlob(e17)));
                    p pVar = new p(string, string2);
                    pVar.f6165b = v.f(c10.getInt(e19));
                    pVar.f6167d = c10.getString(e21);
                    pVar.f6168e = androidx.work.a.g(c10.getBlob(e22));
                    int i16 = i10;
                    pVar.f6169f = androidx.work.a.g(c10.getBlob(i16));
                    int i17 = e24;
                    i10 = i16;
                    pVar.f6170g = c10.getLong(i17);
                    int i18 = e21;
                    int i19 = e25;
                    pVar.f6171h = c10.getLong(i19);
                    int i20 = e13;
                    int i21 = e26;
                    pVar.f6172i = c10.getLong(i21);
                    int i22 = e27;
                    pVar.f6174k = c10.getInt(i22);
                    int i23 = e28;
                    pVar.f6175l = v.d(c10.getInt(i23));
                    e26 = i21;
                    int i24 = e29;
                    pVar.f6176m = c10.getLong(i24);
                    int i25 = e30;
                    pVar.f6177n = c10.getLong(i25);
                    e30 = i25;
                    int i26 = e31;
                    pVar.f6178o = c10.getLong(i26);
                    int i27 = e32;
                    pVar.f6179p = c10.getLong(i27);
                    int i28 = e33;
                    pVar.f6180q = c10.getInt(i28) != 0;
                    pVar.f6173j = cVar;
                    arrayList.add(pVar);
                    e11 = i14;
                    e32 = i27;
                    e33 = i28;
                    e21 = i18;
                    e24 = i17;
                    e25 = i19;
                    e27 = i22;
                    e18 = i11;
                    e20 = i12;
                    e10 = i13;
                    e31 = i26;
                    e12 = i15;
                    e29 = i24;
                    e13 = i20;
                    e28 = i23;
                }
                c10.close();
                lVar.j();
                return arrayList;
            } catch (Throwable th3) {
                th2 = th3;
                c10.close();
                lVar.j();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            lVar = f10;
        }
    }

    @Override // c2.q
    public s.a h(String str) {
        h1.l f10 = h1.l.f("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            f10.a0(1);
        } else {
            f10.K(1, str);
        }
        this.f6189a.d();
        s.a aVar = null;
        Cursor c10 = j1.c.c(this.f6189a, f10, false, null);
        try {
            if (c10.moveToFirst()) {
                aVar = v.f(c10.getInt(0));
            }
            return aVar;
        } finally {
            c10.close();
            f10.j();
        }
    }

    @Override // c2.q
    public List<p> i(int i10) {
        h1.l lVar;
        Throwable th2;
        h1.l f10 = h1.l.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        f10.A0(1, i10);
        this.f6189a.d();
        Cursor c10 = j1.c.c(this.f6189a, f10, false, null);
        try {
            int e10 = j1.b.e(c10, "required_network_type");
            int e11 = j1.b.e(c10, "requires_charging");
            int e12 = j1.b.e(c10, "requires_device_idle");
            int e13 = j1.b.e(c10, "requires_battery_not_low");
            int e14 = j1.b.e(c10, "requires_storage_not_low");
            int e15 = j1.b.e(c10, "trigger_content_update_delay");
            int e16 = j1.b.e(c10, "trigger_max_content_delay");
            int e17 = j1.b.e(c10, "content_uri_triggers");
            int e18 = j1.b.e(c10, "id");
            int e19 = j1.b.e(c10, "state");
            int e20 = j1.b.e(c10, "worker_class_name");
            int e21 = j1.b.e(c10, "input_merger_class_name");
            int e22 = j1.b.e(c10, "input");
            int e23 = j1.b.e(c10, "output");
            lVar = f10;
            try {
                int e24 = j1.b.e(c10, "initial_delay");
                int e25 = j1.b.e(c10, "interval_duration");
                int e26 = j1.b.e(c10, "flex_duration");
                int e27 = j1.b.e(c10, "run_attempt_count");
                int e28 = j1.b.e(c10, "backoff_policy");
                int e29 = j1.b.e(c10, "backoff_delay_duration");
                int e30 = j1.b.e(c10, "period_start_time");
                int e31 = j1.b.e(c10, "minimum_retention_duration");
                int e32 = j1.b.e(c10, "schedule_requested_at");
                int e33 = j1.b.e(c10, "run_in_foreground");
                int i11 = e23;
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    String string = c10.getString(e18);
                    int i12 = e18;
                    String string2 = c10.getString(e20);
                    int i13 = e20;
                    u1.c cVar = new u1.c();
                    int i14 = e10;
                    cVar.k(v.e(c10.getInt(e10)));
                    cVar.m(c10.getInt(e11) != 0);
                    cVar.n(c10.getInt(e12) != 0);
                    cVar.l(c10.getInt(e13) != 0);
                    cVar.o(c10.getInt(e14) != 0);
                    int i15 = e11;
                    int i16 = e12;
                    cVar.p(c10.getLong(e15));
                    cVar.q(c10.getLong(e16));
                    cVar.j(v.b(c10.getBlob(e17)));
                    p pVar = new p(string, string2);
                    pVar.f6165b = v.f(c10.getInt(e19));
                    pVar.f6167d = c10.getString(e21);
                    pVar.f6168e = androidx.work.a.g(c10.getBlob(e22));
                    int i17 = i11;
                    pVar.f6169f = androidx.work.a.g(c10.getBlob(i17));
                    i11 = i17;
                    int i18 = e24;
                    pVar.f6170g = c10.getLong(i18);
                    int i19 = e21;
                    int i20 = e25;
                    pVar.f6171h = c10.getLong(i20);
                    int i21 = e13;
                    int i22 = e26;
                    pVar.f6172i = c10.getLong(i22);
                    int i23 = e27;
                    pVar.f6174k = c10.getInt(i23);
                    int i24 = e28;
                    pVar.f6175l = v.d(c10.getInt(i24));
                    e26 = i22;
                    int i25 = e29;
                    pVar.f6176m = c10.getLong(i25);
                    int i26 = e30;
                    pVar.f6177n = c10.getLong(i26);
                    e30 = i26;
                    int i27 = e31;
                    pVar.f6178o = c10.getLong(i27);
                    int i28 = e32;
                    pVar.f6179p = c10.getLong(i28);
                    int i29 = e33;
                    pVar.f6180q = c10.getInt(i29) != 0;
                    pVar.f6173j = cVar;
                    arrayList.add(pVar);
                    e32 = i28;
                    e33 = i29;
                    e11 = i15;
                    e21 = i19;
                    e24 = i18;
                    e25 = i20;
                    e27 = i23;
                    e18 = i12;
                    e20 = i13;
                    e10 = i14;
                    e31 = i27;
                    e12 = i16;
                    e29 = i25;
                    e13 = i21;
                    e28 = i24;
                }
                c10.close();
                lVar.j();
                return arrayList;
            } catch (Throwable th3) {
                th2 = th3;
                c10.close();
                lVar.j();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            lVar = f10;
        }
    }

    @Override // c2.q
    public p j(String str) {
        h1.l lVar;
        Throwable th2;
        p pVar;
        h1.l f10 = h1.l.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE id=?", 1);
        if (str == null) {
            f10.a0(1);
        } else {
            f10.K(1, str);
        }
        this.f6189a.d();
        Cursor c10 = j1.c.c(this.f6189a, f10, false, null);
        try {
            int e10 = j1.b.e(c10, "required_network_type");
            int e11 = j1.b.e(c10, "requires_charging");
            int e12 = j1.b.e(c10, "requires_device_idle");
            int e13 = j1.b.e(c10, "requires_battery_not_low");
            int e14 = j1.b.e(c10, "requires_storage_not_low");
            int e15 = j1.b.e(c10, "trigger_content_update_delay");
            int e16 = j1.b.e(c10, "trigger_max_content_delay");
            int e17 = j1.b.e(c10, "content_uri_triggers");
            int e18 = j1.b.e(c10, "id");
            int e19 = j1.b.e(c10, "state");
            int e20 = j1.b.e(c10, "worker_class_name");
            int e21 = j1.b.e(c10, "input_merger_class_name");
            int e22 = j1.b.e(c10, "input");
            int e23 = j1.b.e(c10, "output");
            lVar = f10;
            try {
                int e24 = j1.b.e(c10, "initial_delay");
                int e25 = j1.b.e(c10, "interval_duration");
                int e26 = j1.b.e(c10, "flex_duration");
                int e27 = j1.b.e(c10, "run_attempt_count");
                int e28 = j1.b.e(c10, "backoff_policy");
                int e29 = j1.b.e(c10, "backoff_delay_duration");
                int e30 = j1.b.e(c10, "period_start_time");
                int e31 = j1.b.e(c10, "minimum_retention_duration");
                int e32 = j1.b.e(c10, "schedule_requested_at");
                int e33 = j1.b.e(c10, "run_in_foreground");
                if (c10.moveToFirst()) {
                    String string = c10.getString(e18);
                    String string2 = c10.getString(e20);
                    u1.c cVar = new u1.c();
                    cVar.k(v.e(c10.getInt(e10)));
                    cVar.m(c10.getInt(e11) != 0);
                    cVar.n(c10.getInt(e12) != 0);
                    cVar.l(c10.getInt(e13) != 0);
                    cVar.o(c10.getInt(e14) != 0);
                    cVar.p(c10.getLong(e15));
                    cVar.q(c10.getLong(e16));
                    cVar.j(v.b(c10.getBlob(e17)));
                    p pVar2 = new p(string, string2);
                    pVar2.f6165b = v.f(c10.getInt(e19));
                    pVar2.f6167d = c10.getString(e21);
                    pVar2.f6168e = androidx.work.a.g(c10.getBlob(e22));
                    pVar2.f6169f = androidx.work.a.g(c10.getBlob(e23));
                    pVar2.f6170g = c10.getLong(e24);
                    pVar2.f6171h = c10.getLong(e25);
                    pVar2.f6172i = c10.getLong(e26);
                    pVar2.f6174k = c10.getInt(e27);
                    pVar2.f6175l = v.d(c10.getInt(e28));
                    pVar2.f6176m = c10.getLong(e29);
                    pVar2.f6177n = c10.getLong(e30);
                    pVar2.f6178o = c10.getLong(e31);
                    pVar2.f6179p = c10.getLong(e32);
                    pVar2.f6180q = c10.getInt(e33) != 0;
                    pVar2.f6173j = cVar;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                c10.close();
                lVar.j();
                return pVar;
            } catch (Throwable th3) {
                th2 = th3;
                c10.close();
                lVar.j();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            lVar = f10;
        }
    }

    @Override // c2.q
    public int k(String str) {
        this.f6189a.d();
        m1.k a10 = this.f6195g.a();
        if (str == null) {
            a10.a0(1);
        } else {
            a10.K(1, str);
        }
        this.f6189a.e();
        try {
            int S = a10.S();
            this.f6189a.D();
            return S;
        } finally {
            this.f6189a.i();
            this.f6195g.f(a10);
        }
    }

    @Override // c2.q
    public int l(s.a aVar, String... strArr) {
        this.f6189a.d();
        StringBuilder b10 = j1.f.b();
        b10.append("UPDATE workspec SET state=");
        b10.append("?");
        b10.append(" WHERE id IN (");
        j1.f.a(b10, strArr.length);
        b10.append(")");
        m1.k f10 = this.f6189a.f(b10.toString());
        f10.A0(1, v.h(aVar));
        int i10 = 2;
        for (String str : strArr) {
            if (str == null) {
                f10.a0(i10);
            } else {
                f10.K(i10, str);
            }
            i10++;
        }
        this.f6189a.e();
        try {
            int S = f10.S();
            this.f6189a.D();
            return S;
        } finally {
            this.f6189a.i();
        }
    }

    @Override // c2.q
    public void m(p pVar) {
        this.f6189a.d();
        this.f6189a.e();
        try {
            this.f6190b.h(pVar);
            this.f6189a.D();
        } finally {
            this.f6189a.i();
        }
    }

    @Override // c2.q
    public List<String> n(String str) {
        h1.l f10 = h1.l.f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            f10.a0(1);
        } else {
            f10.K(1, str);
        }
        this.f6189a.d();
        Cursor c10 = j1.c.c(this.f6189a, f10, false, null);
        try {
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                arrayList.add(c10.getString(0));
            }
            return arrayList;
        } finally {
            c10.close();
            f10.j();
        }
    }

    @Override // c2.q
    public List<androidx.work.a> o(String str) {
        h1.l f10 = h1.l.f("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            f10.a0(1);
        } else {
            f10.K(1, str);
        }
        this.f6189a.d();
        Cursor c10 = j1.c.c(this.f6189a, f10, false, null);
        try {
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                arrayList.add(androidx.work.a.g(c10.getBlob(0)));
            }
            return arrayList;
        } finally {
            c10.close();
            f10.j();
        }
    }

    @Override // c2.q
    public int p(String str) {
        this.f6189a.d();
        m1.k a10 = this.f6194f.a();
        if (str == null) {
            a10.a0(1);
        } else {
            a10.K(1, str);
        }
        this.f6189a.e();
        try {
            int S = a10.S();
            this.f6189a.D();
            return S;
        } finally {
            this.f6189a.i();
            this.f6194f.f(a10);
        }
    }

    @Override // c2.q
    public void q(String str, long j10) {
        this.f6189a.d();
        m1.k a10 = this.f6193e.a();
        a10.A0(1, j10);
        if (str == null) {
            a10.a0(2);
        } else {
            a10.K(2, str);
        }
        this.f6189a.e();
        try {
            a10.S();
            this.f6189a.D();
        } finally {
            this.f6189a.i();
            this.f6193e.f(a10);
        }
    }

    @Override // c2.q
    public List<p> r() {
        h1.l lVar;
        Throwable th2;
        h1.l f10 = h1.l.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f6189a.d();
        Cursor c10 = j1.c.c(this.f6189a, f10, false, null);
        try {
            int e10 = j1.b.e(c10, "required_network_type");
            int e11 = j1.b.e(c10, "requires_charging");
            int e12 = j1.b.e(c10, "requires_device_idle");
            int e13 = j1.b.e(c10, "requires_battery_not_low");
            int e14 = j1.b.e(c10, "requires_storage_not_low");
            int e15 = j1.b.e(c10, "trigger_content_update_delay");
            int e16 = j1.b.e(c10, "trigger_max_content_delay");
            int e17 = j1.b.e(c10, "content_uri_triggers");
            int e18 = j1.b.e(c10, "id");
            int e19 = j1.b.e(c10, "state");
            int e20 = j1.b.e(c10, "worker_class_name");
            int e21 = j1.b.e(c10, "input_merger_class_name");
            int e22 = j1.b.e(c10, "input");
            int e23 = j1.b.e(c10, "output");
            lVar = f10;
            try {
                int e24 = j1.b.e(c10, "initial_delay");
                int e25 = j1.b.e(c10, "interval_duration");
                int e26 = j1.b.e(c10, "flex_duration");
                int e27 = j1.b.e(c10, "run_attempt_count");
                int e28 = j1.b.e(c10, "backoff_policy");
                int e29 = j1.b.e(c10, "backoff_delay_duration");
                int e30 = j1.b.e(c10, "period_start_time");
                int e31 = j1.b.e(c10, "minimum_retention_duration");
                int e32 = j1.b.e(c10, "schedule_requested_at");
                int e33 = j1.b.e(c10, "run_in_foreground");
                int i10 = e23;
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    String string = c10.getString(e18);
                    int i11 = e18;
                    String string2 = c10.getString(e20);
                    int i12 = e20;
                    u1.c cVar = new u1.c();
                    int i13 = e10;
                    cVar.k(v.e(c10.getInt(e10)));
                    cVar.m(c10.getInt(e11) != 0);
                    cVar.n(c10.getInt(e12) != 0);
                    cVar.l(c10.getInt(e13) != 0);
                    cVar.o(c10.getInt(e14) != 0);
                    int i14 = e11;
                    int i15 = e12;
                    cVar.p(c10.getLong(e15));
                    cVar.q(c10.getLong(e16));
                    cVar.j(v.b(c10.getBlob(e17)));
                    p pVar = new p(string, string2);
                    pVar.f6165b = v.f(c10.getInt(e19));
                    pVar.f6167d = c10.getString(e21);
                    pVar.f6168e = androidx.work.a.g(c10.getBlob(e22));
                    int i16 = i10;
                    pVar.f6169f = androidx.work.a.g(c10.getBlob(i16));
                    i10 = i16;
                    int i17 = e24;
                    pVar.f6170g = c10.getLong(i17);
                    int i18 = e22;
                    int i19 = e25;
                    pVar.f6171h = c10.getLong(i19);
                    int i20 = e13;
                    int i21 = e26;
                    pVar.f6172i = c10.getLong(i21);
                    int i22 = e27;
                    pVar.f6174k = c10.getInt(i22);
                    int i23 = e28;
                    pVar.f6175l = v.d(c10.getInt(i23));
                    e26 = i21;
                    int i24 = e29;
                    pVar.f6176m = c10.getLong(i24);
                    int i25 = e30;
                    pVar.f6177n = c10.getLong(i25);
                    e30 = i25;
                    int i26 = e31;
                    pVar.f6178o = c10.getLong(i26);
                    int i27 = e32;
                    pVar.f6179p = c10.getLong(i27);
                    int i28 = e33;
                    pVar.f6180q = c10.getInt(i28) != 0;
                    pVar.f6173j = cVar;
                    arrayList.add(pVar);
                    e32 = i27;
                    e33 = i28;
                    e11 = i14;
                    e22 = i18;
                    e24 = i17;
                    e25 = i19;
                    e27 = i22;
                    e18 = i11;
                    e20 = i12;
                    e10 = i13;
                    e31 = i26;
                    e12 = i15;
                    e29 = i24;
                    e13 = i20;
                    e28 = i23;
                }
                c10.close();
                lVar.j();
                return arrayList;
            } catch (Throwable th3) {
                th2 = th3;
                c10.close();
                lVar.j();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            lVar = f10;
        }
    }

    @Override // c2.q
    public List<p> s(int i10) {
        h1.l lVar;
        Throwable th2;
        h1.l f10 = h1.l.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        f10.A0(1, i10);
        this.f6189a.d();
        Cursor c10 = j1.c.c(this.f6189a, f10, false, null);
        try {
            int e10 = j1.b.e(c10, "required_network_type");
            int e11 = j1.b.e(c10, "requires_charging");
            int e12 = j1.b.e(c10, "requires_device_idle");
            int e13 = j1.b.e(c10, "requires_battery_not_low");
            int e14 = j1.b.e(c10, "requires_storage_not_low");
            int e15 = j1.b.e(c10, "trigger_content_update_delay");
            int e16 = j1.b.e(c10, "trigger_max_content_delay");
            int e17 = j1.b.e(c10, "content_uri_triggers");
            int e18 = j1.b.e(c10, "id");
            int e19 = j1.b.e(c10, "state");
            int e20 = j1.b.e(c10, "worker_class_name");
            int e21 = j1.b.e(c10, "input_merger_class_name");
            int e22 = j1.b.e(c10, "input");
            int e23 = j1.b.e(c10, "output");
            lVar = f10;
            try {
                int e24 = j1.b.e(c10, "initial_delay");
                int e25 = j1.b.e(c10, "interval_duration");
                int e26 = j1.b.e(c10, "flex_duration");
                int e27 = j1.b.e(c10, "run_attempt_count");
                int e28 = j1.b.e(c10, "backoff_policy");
                int e29 = j1.b.e(c10, "backoff_delay_duration");
                int e30 = j1.b.e(c10, "period_start_time");
                int e31 = j1.b.e(c10, "minimum_retention_duration");
                int e32 = j1.b.e(c10, "schedule_requested_at");
                int e33 = j1.b.e(c10, "run_in_foreground");
                int i11 = e23;
                ArrayList arrayList = new ArrayList(c10.getCount());
                while (c10.moveToNext()) {
                    String string = c10.getString(e18);
                    int i12 = e18;
                    String string2 = c10.getString(e20);
                    int i13 = e20;
                    u1.c cVar = new u1.c();
                    int i14 = e10;
                    cVar.k(v.e(c10.getInt(e10)));
                    cVar.m(c10.getInt(e11) != 0);
                    cVar.n(c10.getInt(e12) != 0);
                    cVar.l(c10.getInt(e13) != 0);
                    cVar.o(c10.getInt(e14) != 0);
                    int i15 = e11;
                    int i16 = e12;
                    cVar.p(c10.getLong(e15));
                    cVar.q(c10.getLong(e16));
                    cVar.j(v.b(c10.getBlob(e17)));
                    p pVar = new p(string, string2);
                    pVar.f6165b = v.f(c10.getInt(e19));
                    pVar.f6167d = c10.getString(e21);
                    pVar.f6168e = androidx.work.a.g(c10.getBlob(e22));
                    int i17 = i11;
                    pVar.f6169f = androidx.work.a.g(c10.getBlob(i17));
                    i11 = i17;
                    int i18 = e24;
                    pVar.f6170g = c10.getLong(i18);
                    int i19 = e21;
                    int i20 = e25;
                    pVar.f6171h = c10.getLong(i20);
                    int i21 = e13;
                    int i22 = e26;
                    pVar.f6172i = c10.getLong(i22);
                    int i23 = e27;
                    pVar.f6174k = c10.getInt(i23);
                    int i24 = e28;
                    pVar.f6175l = v.d(c10.getInt(i24));
                    e26 = i22;
                    int i25 = e29;
                    pVar.f6176m = c10.getLong(i25);
                    int i26 = e30;
                    pVar.f6177n = c10.getLong(i26);
                    e30 = i26;
                    int i27 = e31;
                    pVar.f6178o = c10.getLong(i27);
                    int i28 = e32;
                    pVar.f6179p = c10.getLong(i28);
                    int i29 = e33;
                    pVar.f6180q = c10.getInt(i29) != 0;
                    pVar.f6173j = cVar;
                    arrayList.add(pVar);
                    e32 = i28;
                    e33 = i29;
                    e11 = i15;
                    e21 = i19;
                    e24 = i18;
                    e25 = i20;
                    e27 = i23;
                    e18 = i12;
                    e20 = i13;
                    e10 = i14;
                    e31 = i27;
                    e12 = i16;
                    e29 = i25;
                    e13 = i21;
                    e28 = i24;
                }
                c10.close();
                lVar.j();
                return arrayList;
            } catch (Throwable th3) {
                th2 = th3;
                c10.close();
                lVar.j();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            lVar = f10;
        }
    }

    @Override // c2.q
    public void t(String str, androidx.work.a aVar) {
        this.f6189a.d();
        m1.k a10 = this.f6192d.a();
        byte[] k10 = androidx.work.a.k(aVar);
        if (k10 == null) {
            a10.a0(1);
        } else {
            a10.L0(1, k10);
        }
        if (str == null) {
            a10.a0(2);
        } else {
            a10.K(2, str);
        }
        this.f6189a.e();
        try {
            a10.S();
            this.f6189a.D();
        } finally {
            this.f6189a.i();
            this.f6192d.f(a10);
        }
    }

    @Override // c2.q
    public int u() {
        this.f6189a.d();
        m1.k a10 = this.f6197i.a();
        this.f6189a.e();
        try {
            int S = a10.S();
            this.f6189a.D();
            return S;
        } finally {
            this.f6189a.i();
            this.f6197i.f(a10);
        }
    }
}
