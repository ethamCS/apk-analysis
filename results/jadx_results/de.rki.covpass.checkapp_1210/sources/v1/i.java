package v1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import u1.b;
import u1.k;
import u1.n;
import u1.p;
import u1.t;
import u1.u;
/* loaded from: classes.dex */
public class i extends t {

    /* renamed from: k */
    private static final String f23863k = k.f("WorkManagerImpl");

    /* renamed from: l */
    private static i f23864l = null;

    /* renamed from: m */
    private static i f23865m = null;

    /* renamed from: n */
    private static final Object f23866n = new Object();

    /* renamed from: a */
    private Context f23867a;

    /* renamed from: b */
    private u1.b f23868b;

    /* renamed from: c */
    private WorkDatabase f23869c;

    /* renamed from: d */
    private e2.a f23870d;

    /* renamed from: e */
    private List<e> f23871e;

    /* renamed from: f */
    private d f23872f;

    /* renamed from: g */
    private d2.e f23873g;

    /* renamed from: h */
    private boolean f23874h;

    /* renamed from: i */
    private BroadcastReceiver.PendingResult f23875i;

    /* renamed from: j */
    private volatile f2.a f23876j;

    public i(Context context, u1.b bVar, e2.a aVar) {
        this(context, bVar, aVar, context.getResources().getBoolean(p.a_res_0x7f040006));
    }

    public i(Context context, u1.b bVar, e2.a aVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        k.e(new k.a(bVar.i()));
        List<e> g10 = g(applicationContext, bVar, aVar);
        r(context, bVar, aVar, workDatabase, g10, new d(context, bVar, aVar, workDatabase, g10));
    }

    public i(Context context, u1.b bVar, e2.a aVar, boolean z10) {
        this(context, bVar, aVar, WorkDatabase.F(context.getApplicationContext(), aVar.c(), z10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (v1.i.f23865m != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        v1.i.f23865m = new v1.i(r4, r5, new e2.b(r5.k()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        v1.i.f23864l = v1.i.f23865m;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(android.content.Context r4, u1.b r5) {
        /*
            java.lang.Object r0 = v1.i.f23866n
            monitor-enter(r0)
            v1.i r1 = v1.i.f23864l     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L14
            v1.i r2 = v1.i.f23865m     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> L34
        L14:
            if (r1 != 0) goto L32
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L34
            v1.i r1 = v1.i.f23865m     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L2e
            v1.i r1 = new v1.i     // Catch: java.lang.Throwable -> L34
            e2.b r2 = new e2.b     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Executor r3 = r5.k()     // Catch: java.lang.Throwable -> L34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L34
            v1.i.f23865m = r1     // Catch: java.lang.Throwable -> L34
        L2e:
            v1.i r4 = v1.i.f23865m     // Catch: java.lang.Throwable -> L34
            v1.i.f23864l = r4     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.i.e(android.content.Context, u1.b):void");
    }

    @Deprecated
    public static i j() {
        synchronized (f23866n) {
            i iVar = f23864l;
            if (iVar != null) {
                return iVar;
            }
            return f23865m;
        }
    }

    public static i k(Context context) {
        i j10;
        synchronized (f23866n) {
            j10 = j();
            if (j10 == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof b.AbstractC0398b)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                e(applicationContext, ((b.AbstractC0398b) applicationContext).a());
                j10 = k(applicationContext);
            }
        }
        return j10;
    }

    private void r(Context context, u1.b bVar, e2.a aVar, WorkDatabase workDatabase, List<e> list, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f23867a = applicationContext;
        this.f23868b = bVar;
        this.f23870d = aVar;
        this.f23869c = workDatabase;
        this.f23871e = list;
        this.f23872f = dVar;
        this.f23873g = new d2.e(workDatabase);
        this.f23874h = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext.isDeviceProtectedStorage()) {
            this.f23870d.b(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    private void z() {
        try {
            this.f23876j = (f2.a) Class.forName("androidx.work.multiprocess.RemoteWorkManagerClient").getConstructor(Context.class, i.class).newInstance(this.f23867a, this);
        } catch (Throwable th2) {
            k.c().a(f23863k, "Unable to initialize multi-process support", th2);
        }
    }

    @Override // u1.t
    public n a(String str) {
        d2.a d10 = d2.a.d(str, this);
        this.f23870d.b(d10);
        return d10.e();
    }

    @Override // u1.t
    public n b(List<? extends u> list) {
        if (!list.isEmpty()) {
            return new g(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public n f(UUID uuid) {
        d2.a b10 = d2.a.b(uuid, this);
        this.f23870d.b(b10);
        return b10.e();
    }

    public List<e> g(Context context, u1.b bVar, e2.a aVar) {
        return Arrays.asList(f.a(context, this), new w1.b(context, bVar, aVar, this));
    }

    public Context h() {
        return this.f23867a;
    }

    public u1.b i() {
        return this.f23868b;
    }

    public d2.e l() {
        return this.f23873g;
    }

    public d m() {
        return this.f23872f;
    }

    public f2.a n() {
        if (this.f23876j == null) {
            synchronized (f23866n) {
                if (this.f23876j == null) {
                    z();
                    if (this.f23876j == null && !TextUtils.isEmpty(this.f23868b.b())) {
                        throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                    }
                }
            }
        }
        return this.f23876j;
    }

    public List<e> o() {
        return this.f23871e;
    }

    public WorkDatabase p() {
        return this.f23869c;
    }

    public e2.a q() {
        return this.f23870d;
    }

    public void s() {
        synchronized (f23866n) {
            this.f23874h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f23875i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f23875i = null;
            }
        }
    }

    public void t() {
        x1.b.a(h());
        p().O().u();
        f.b(i(), p(), o());
    }

    public void u(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f23866n) {
            this.f23875i = pendingResult;
            if (this.f23874h) {
                pendingResult.finish();
                this.f23875i = null;
            }
        }
    }

    public void v(String str) {
        w(str, null);
    }

    public void w(String str, WorkerParameters.a aVar) {
        this.f23870d.b(new d2.h(this, str, aVar));
    }

    public void x(String str) {
        this.f23870d.b(new d2.i(this, str, true));
    }

    public void y(String str) {
        this.f23870d.b(new d2.i(this, str, false));
    }
}
