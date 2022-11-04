package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.e;
import c2.p;
import java.util.HashMap;
import java.util.Map;
import u1.k;
/* loaded from: classes.dex */
public class b implements v1.b {

    /* renamed from: x */
    private static final String f5334x = k.f("CommandHandler");

    /* renamed from: c */
    private final Context f5335c;

    /* renamed from: d */
    private final Map<String, v1.b> f5336d = new HashMap();

    /* renamed from: q */
    private final Object f5337q = new Object();

    public b(Context context) {
        this.f5335c = context;
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, boolean z10) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return intent;
    }

    public static Intent e(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent f(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void g(Intent intent, int i10, e eVar) {
        k.c().a(f5334x, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new c(this.f5335c, i10, eVar).a();
    }

    private void h(Intent intent, int i10, e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f5337q) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            k c10 = k.c();
            String str = f5334x;
            c10.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
            if (!this.f5336d.containsKey(string)) {
                d dVar = new d(this.f5335c, i10, string, eVar);
                this.f5336d.put(string, dVar);
                dVar.f();
            } else {
                k.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
            }
        }
    }

    private void i(Intent intent, int i10) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z10 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        k.c().a(f5334x, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
        a(string, z10);
    }

    private void j(Intent intent, int i10, e eVar) {
        k.c().a(f5334x, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
        eVar.g().t();
    }

    private void k(Intent intent, int i10, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        k c10 = k.c();
        String str = f5334x;
        c10.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase p10 = eVar.g().p();
        p10.e();
        try {
            p j10 = p10.O().j(string);
            if (j10 == null) {
                k c11 = k.c();
                c11.h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (j10.f6165b.b()) {
                k c12 = k.c();
                c12.h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
            } else {
                long a10 = j10.a();
                if (!j10.b()) {
                    k.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a10)), new Throwable[0]);
                    a.c(this.f5335c, eVar.g(), string, a10);
                } else {
                    k.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a10)), new Throwable[0]);
                    a.c(this.f5335c, eVar.g(), string, a10);
                    eVar.k(new e.b(eVar, b(this.f5335c), i10));
                }
                p10.D();
            }
        } finally {
            p10.i();
        }
    }

    private void l(Intent intent, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        k.c().a(f5334x, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        eVar.g().y(string);
        a.a(this.f5335c, eVar.g(), string);
        eVar.a(string, false);
    }

    private static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // v1.b
    public void a(String str, boolean z10) {
        synchronized (this.f5337q) {
            v1.b remove = this.f5336d.remove(str);
            if (remove != null) {
                remove.a(str, z10);
            }
        }
    }

    public boolean n() {
        boolean z10;
        synchronized (this.f5337q) {
            z10 = !this.f5336d.isEmpty();
        }
        return z10;
    }

    public void o(Intent intent, int i10, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i10, eVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i10, eVar);
        } else if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            k.c().b(f5334x, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i10, eVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i10, eVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i10);
        } else {
            k.c().h(f5334x, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
