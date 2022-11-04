package androidx.camera.core;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.z;
import androidx.concurrent.futures.c;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import w.a0;
import w.i0;
import w.p2;
import w.z;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: o */
    private static final Object f2550o = new Object();

    /* renamed from: p */
    private static final SparseArray<Integer> f2551p = new SparseArray<>();

    /* renamed from: c */
    private final z f2554c;

    /* renamed from: d */
    private final Executor f2555d;

    /* renamed from: e */
    private final Handler f2556e;

    /* renamed from: f */
    private final HandlerThread f2557f;

    /* renamed from: g */
    private w.a0 f2558g;

    /* renamed from: h */
    private w.z f2559h;

    /* renamed from: i */
    private w.p2 f2560i;

    /* renamed from: j */
    private Context f2561j;

    /* renamed from: k */
    private final x5.a<Void> f2562k;

    /* renamed from: n */
    private final Integer f2565n;

    /* renamed from: a */
    final w.e0 f2552a = new w.e0();

    /* renamed from: b */
    private final Object f2553b = new Object();

    /* renamed from: l */
    private a f2563l = a.UNINITIALIZED;

    /* renamed from: m */
    private x5.a<Void> f2564m = y.f.h(null);

    /* loaded from: classes.dex */
    public enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public y(Context context, z.b bVar) {
        if (bVar == null && (bVar = f(context)) == null) {
            throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
        }
        this.f2554c = bVar.getCameraXConfig();
        Executor I = this.f2554c.I(null);
        Handler L = this.f2554c.L(null);
        this.f2555d = I == null ? new o() : I;
        if (L == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f2557f = handlerThread;
            handlerThread.start();
            this.f2556e = androidx.core.os.g.a(handlerThread.getLooper());
        } else {
            this.f2557f = null;
            this.f2556e = L;
        }
        Integer num = (Integer) this.f2554c.a(z.F, null);
        this.f2565n = num;
        i(num);
        this.f2562k = k(context);
    }

    private static z.b f(Context context) {
        Application b10 = androidx.camera.core.impl.utils.d.b(context);
        if (b10 instanceof z.b) {
            return (z.b) b10;
        }
        try {
            Context a10 = androidx.camera.core.impl.utils.d.a(context);
            Bundle bundle = a10.getPackageManager().getServiceInfo(new ComponentName(a10, MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (z.b) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            s1.c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e10) {
            s1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e10);
            return null;
        }
    }

    private static void i(Integer num) {
        synchronized (f2550o) {
            if (num == null) {
                return;
            }
            androidx.core.util.h.c(num.intValue(), 3, 6, "minLogLevel");
            SparseArray<Integer> sparseArray = f2551p;
            int i10 = 1;
            if (sparseArray.get(num.intValue()) != null) {
                i10 = 1 + sparseArray.get(num.intValue()).intValue();
            }
            sparseArray.put(num.intValue(), Integer.valueOf(i10));
            p();
        }
    }

    private void j(final Executor executor, final long j10, final Context context, final c.a<Void> aVar) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.w
            @Override // java.lang.Runnable
            public final void run() {
                y.this.m(context, executor, aVar, j10);
            }
        });
    }

    private x5.a<Void> k(final Context context) {
        x5.a<Void> a10;
        synchronized (this.f2553b) {
            androidx.core.util.h.j(this.f2563l == a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f2563l = a.INITIALIZING;
            a10 = androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.core.v
                @Override // androidx.concurrent.futures.c.AbstractC0023c
                public final Object a(c.a aVar) {
                    Object n10;
                    n10 = y.this.n(context, aVar);
                    return n10;
                }
            });
        }
        return a10;
    }

    public /* synthetic */ void l(Executor executor, long j10, c.a aVar) {
        j(executor, j10, this.f2561j, aVar);
    }

    public /* synthetic */ void m(Context context, final Executor executor, final c.a aVar, final long j10) {
        try {
            Application b10 = androidx.camera.core.impl.utils.d.b(context);
            this.f2561j = b10;
            if (b10 == null) {
                this.f2561j = androidx.camera.core.impl.utils.d.a(context);
            }
            a0.a J = this.f2554c.J(null);
            if (J == null) {
                throw new r1(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
            }
            w.h0 a10 = w.h0.a(this.f2555d, this.f2556e);
            s H = this.f2554c.H(null);
            this.f2558g = J.a(this.f2561j, a10, H);
            z.a K = this.f2554c.K(null);
            if (K == null) {
                throw new r1(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            this.f2559h = K.a(this.f2561j, this.f2558g.b(), this.f2558g.c());
            p2.c M = this.f2554c.M(null);
            if (M == null) {
                throw new r1(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
            }
            this.f2560i = M.a(this.f2561j);
            if (executor instanceof o) {
                ((o) executor).c(this.f2558g);
            }
            this.f2552a.b(this.f2558g);
            w.i0.a(this.f2561j, this.f2552a, H);
            o();
            aVar.c(null);
        } catch (r1 | RuntimeException | i0.a e10) {
            if (SystemClock.elapsedRealtime() - j10 < 2500) {
                s1.l("CameraX", "Retry init. Start time " + j10 + " current time " + SystemClock.elapsedRealtime(), e10);
                androidx.core.os.g.b(this.f2556e, new Runnable() { // from class: androidx.camera.core.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.this.l(executor, j10, aVar);
                    }
                }, "retry_token", 500L);
                return;
            }
            synchronized (this.f2553b) {
                this.f2563l = a.INITIALIZING_ERROR;
            }
            if (e10 instanceof i0.a) {
                s1.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                aVar.c(null);
            } else if (e10 instanceof r1) {
                aVar.f(e10);
            } else {
                aVar.f(new r1(e10));
            }
        }
    }

    public /* synthetic */ Object n(Context context, c.a aVar) {
        j(this.f2555d, SystemClock.elapsedRealtime(), context, aVar);
        return "CameraX initInternal";
    }

    private void o() {
        synchronized (this.f2553b) {
            this.f2563l = a.INITIALIZED;
        }
    }

    private static void p() {
        SparseArray<Integer> sparseArray = f2551p;
        if (sparseArray.size() == 0) {
            s1.h();
            return;
        }
        int i10 = 3;
        if (sparseArray.get(3) == null) {
            i10 = 4;
            if (sparseArray.get(4) == null) {
                i10 = 5;
                if (sparseArray.get(5) == null) {
                    i10 = 6;
                    if (sparseArray.get(6) == null) {
                        return;
                    }
                }
            }
        }
        s1.i(i10);
    }

    public w.z d() {
        w.z zVar = this.f2559h;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public w.e0 e() {
        return this.f2552a;
    }

    public w.p2 g() {
        w.p2 p2Var = this.f2560i;
        if (p2Var != null) {
            return p2Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public x5.a<Void> h() {
        return this.f2562k;
    }
}
