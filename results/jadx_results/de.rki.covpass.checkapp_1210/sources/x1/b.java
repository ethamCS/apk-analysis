package x1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import c2.g;
import c2.p;
import c2.q;
import d2.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import u1.k;
import u1.s;
import v1.e;
import v1.i;
/* loaded from: classes.dex */
public class b implements e {

    /* renamed from: y */
    private static final String f25363y = k.f("SystemJobScheduler");

    /* renamed from: c */
    private final Context f25364c;

    /* renamed from: d */
    private final JobScheduler f25365d;

    /* renamed from: q */
    private final i f25366q;

    /* renamed from: x */
    private final a f25367x;

    public b(Context context, i iVar) {
        this(context, iVar, (JobScheduler) context.getSystemService("jobscheduler"), new a(context));
    }

    public b(Context context, i iVar, JobScheduler jobScheduler, a aVar) {
        this.f25364c = context;
        this.f25366q = iVar;
        this.f25365d = jobScheduler;
        this.f25367x = aVar;
    }

    public static void a(Context context) {
        List<JobInfo> g10;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (g10 = g(context, jobScheduler)) == null || g10.isEmpty()) {
            return;
        }
        for (JobInfo jobInfo : g10) {
            c(jobScheduler, jobInfo.getId());
        }
    }

    private static void c(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            k.c().b(f25363y, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    private static List<Integer> d(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g10 = g(context, jobScheduler);
        if (g10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g10) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            k.c().b(f25363y, "getAllPendingJobs() is not reliable on this device.", th2);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return null;
                }
                return extras.getString("EXTRA_WORK_SPEC_ID");
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean i(Context context, i iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g10 = g(context, jobScheduler);
        List<String> a10 = iVar.p().L().a();
        boolean z10 = false;
        HashSet hashSet = new HashSet(g10 != null ? g10.size() : 0);
        if (g10 != null && !g10.isEmpty()) {
            for (JobInfo jobInfo : g10) {
                String h10 = h(jobInfo);
                if (!TextUtils.isEmpty(h10)) {
                    hashSet.add(h10);
                } else {
                    c(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = a10.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (!hashSet.contains(it.next())) {
                k.c().a(f25363y, "Reconciling jobs", new Throwable[0]);
                z10 = true;
                break;
            }
        }
        if (z10) {
            WorkDatabase p10 = iVar.p();
            p10.e();
            try {
                q O = p10.O();
                for (String str : a10) {
                    O.d(str, -1L);
                }
                p10.D();
            } finally {
                p10.i();
            }
        }
        return z10;
    }

    @Override // v1.e
    public void b(String str) {
        List<Integer> d10 = d(this.f25364c, this.f25365d, str);
        if (d10 == null || d10.isEmpty()) {
            return;
        }
        for (Integer num : d10) {
            c(this.f25365d, num.intValue());
        }
        this.f25366q.p().L().d(str);
    }

    @Override // v1.e
    public void e(p... pVarArr) {
        List<Integer> d10;
        WorkDatabase p10 = this.f25366q.p();
        c cVar = new c(p10);
        for (p pVar : pVarArr) {
            p10.e();
            try {
                p j10 = p10.O().j(pVar.f6164a);
                if (j10 == null) {
                    k.c().h(f25363y, "Skipping scheduling " + pVar.f6164a + " because it's no longer in the DB", new Throwable[0]);
                } else if (j10.f6165b != s.a.ENQUEUED) {
                    k.c().h(f25363y, "Skipping scheduling " + pVar.f6164a + " because it is no longer enqueued", new Throwable[0]);
                } else {
                    g c10 = p10.L().c(pVar.f6164a);
                    int d11 = c10 != null ? c10.f6142b : cVar.d(this.f25366q.i().h(), this.f25366q.i().f());
                    if (c10 == null) {
                        this.f25366q.p().L().b(new g(pVar.f6164a, d11));
                    }
                    j(pVar, d11);
                    if (Build.VERSION.SDK_INT == 23 && (d10 = d(this.f25364c, this.f25365d, pVar.f6164a)) != null) {
                        int indexOf = d10.indexOf(Integer.valueOf(d11));
                        if (indexOf >= 0) {
                            d10.remove(indexOf);
                        }
                        j(pVar, !d10.isEmpty() ? d10.get(0).intValue() : cVar.d(this.f25366q.i().h(), this.f25366q.i().f()));
                    }
                }
                p10.D();
                p10.i();
            } catch (Throwable th2) {
                p10.i();
                throw th2;
            }
        }
    }

    @Override // v1.e
    public boolean f() {
        return true;
    }

    public void j(p pVar, int i10) {
        JobInfo a10 = this.f25367x.a(pVar, i10);
        k.c().a(f25363y, String.format("Scheduling work ID %s Job ID %s", pVar.f6164a, Integer.valueOf(i10)), new Throwable[0]);
        try {
            this.f25365d.schedule(a10);
        } catch (IllegalStateException e10) {
            List<JobInfo> g10 = g(this.f25364c, this.f25365d);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(g10 != null ? g10.size() : 0), Integer.valueOf(this.f25366q.p().O().r().size()), Integer.valueOf(this.f25366q.i().g()));
            k.c().b(f25363y, format, new Throwable[0]);
            throw new IllegalStateException(format, e10);
        } catch (Throwable th2) {
            k.c().b(f25363y, String.format("Unable to schedule %s", pVar), th2);
        }
    }
}
