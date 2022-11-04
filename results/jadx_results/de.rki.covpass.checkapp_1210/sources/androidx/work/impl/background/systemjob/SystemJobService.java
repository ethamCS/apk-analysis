package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import u1.k;
import v1.b;
import v1.i;
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements b {

    /* renamed from: q */
    private static final String f5358q = k.f("SystemJobService");

    /* renamed from: c */
    private i f5359c;

    /* renamed from: d */
    private final Map<String, JobParameters> f5360d = new HashMap();

    private static String b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // v1.b
    public void a(String str, boolean z10) {
        JobParameters remove;
        k.c().a(f5358q, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f5360d) {
            remove = this.f5360d.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            i k10 = i.k(getApplicationContext());
            this.f5359c = k10;
            k10.m().c(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            k.c().h(f5358q, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        i iVar = this.f5359c;
        if (iVar != null) {
            iVar.m().h(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f5359c == null) {
            k.c().a(f5358q, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String b10 = b(jobParameters);
        if (TextUtils.isEmpty(b10)) {
            k.c().b(f5358q, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f5360d) {
            if (this.f5360d.containsKey(b10)) {
                k.c().a(f5358q, String.format("Job is already being executed by SystemJobService: %s", b10), new Throwable[0]);
                return false;
            }
            k.c().a(f5358q, String.format("onStartJob for %s", b10), new Throwable[0]);
            this.f5360d.put(b10, jobParameters);
            WorkerParameters.a aVar = null;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                aVar = new WorkerParameters.a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    aVar.f5299b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    aVar.f5298a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i10 >= 28) {
                    aVar.f5300c = jobParameters.getNetwork();
                }
            }
            this.f5359c.w(b10, aVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f5359c == null) {
            k.c().a(f5358q, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String b10 = b(jobParameters);
        if (TextUtils.isEmpty(b10)) {
            k.c().b(f5358q, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        k.c().a(f5358q, String.format("onStopJob for %s", b10), new Throwable[0]);
        synchronized (this.f5360d) {
            this.f5360d.remove(b10);
        }
        this.f5359c.y(b10);
        return !this.f5359c.m().e(b10);
    }
}
