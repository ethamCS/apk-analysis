package x1;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import c2.p;
import u1.c;
import u1.d;
import u1.k;
import u1.l;
/* loaded from: classes.dex */
class a {

    /* renamed from: b */
    private static final String f25360b = k.f("SystemJobInfoConverter");

    /* renamed from: a */
    private final ComponentName f25361a;

    /* renamed from: x1.a$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0448a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25362a;

        static {
            int[] iArr = new int[l.values().length];
            f25362a = iArr;
            try {
                iArr[l.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25362a[l.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25362a[l.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25362a[l.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25362a[l.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public a(Context context) {
        this.f25361a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(d.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.a(), aVar.b() ? 1 : 0);
    }

    static int c(l lVar) {
        int i10 = C0448a.f25362a[lVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
                    return 4;
                }
            } else if (Build.VERSION.SDK_INT >= 24) {
                return 3;
            }
            k.c().a(f25360b, String.format("API version too low. Cannot convert network type value %s", lVar), new Throwable[0]);
            return 1;
        }
        return 0;
    }

    public JobInfo a(p pVar, int i10) {
        c cVar = pVar.f6173j;
        int c10 = c(cVar.b());
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f6164a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.d());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f25361a).setRequiredNetworkType(c10).setRequiresCharging(cVar.g()).setRequiresDeviceIdle(cVar.h()).setExtras(persistableBundle);
        if (!cVar.h()) {
            extras.setBackoffCriteria(pVar.f6176m, pVar.f6175l == u1.a.LINEAR ? 0 : 1);
        }
        long max = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 > 28 && max <= 0) {
            extras.setImportantWhileForeground(true);
        } else {
            extras.setMinimumLatency(max);
        }
        if (i11 >= 24 && cVar.e()) {
            for (d.a aVar : cVar.a().b()) {
                extras.addTriggerContentUri(b(aVar));
            }
            extras.setTriggerContentUpdateDelay(cVar.c());
            extras.setTriggerContentMaxDelay(cVar.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f());
            extras.setRequiresStorageNotLow(cVar.i());
        }
        return extras.build();
    }
}
