package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.j0;
import androidx.lifecycle.m;
/* loaded from: classes.dex */
public class i0 implements v {
    private static final i0 X3 = new i0();

    /* renamed from: y */
    private Handler f4324y;

    /* renamed from: c */
    private int f4320c = 0;

    /* renamed from: d */
    private int f4321d = 0;

    /* renamed from: q */
    private boolean f4322q = true;

    /* renamed from: x */
    private boolean f4323x = true;
    private final x U3 = new x(this);
    private Runnable V3 = new a();
    j0.a W3 = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            i0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            i0.this.i();
            i0.this.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements j0.a {
        b() {
            i0.this = r1;
        }

        @Override // androidx.lifecycle.j0.a
        public void a() {
        }

        @Override // androidx.lifecycle.j0.a
        public void b() {
            i0.this.b();
        }

        @Override // androidx.lifecycle.j0.a
        public void c() {
            i0.this.d();
        }
    }

    /* loaded from: classes.dex */
    public class c extends i {

        /* loaded from: classes.dex */
        class a extends i {
            a() {
                c.this = r1;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                i0.this.b();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                i0.this.d();
            }
        }

        c() {
            i0.this = r1;
        }

        @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                j0.f(activity).h(i0.this.W3);
            }
        }

        @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            i0.this.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            d.a(activity, new a());
        }

        @Override // androidx.lifecycle.i, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            i0.this.e();
        }
    }

    /* loaded from: classes.dex */
    static class d {
        static void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    private i0() {
    }

    public static v k() {
        return X3;
    }

    public static void l(Context context) {
        X3.h(context);
    }

    void a() {
        int i10 = this.f4321d - 1;
        this.f4321d = i10;
        if (i10 == 0) {
            this.f4324y.postDelayed(this.V3, 700L);
        }
    }

    void b() {
        int i10 = this.f4321d + 1;
        this.f4321d = i10;
        if (i10 == 1) {
            if (!this.f4322q) {
                this.f4324y.removeCallbacks(this.V3);
                return;
            }
            this.U3.h(m.b.ON_RESUME);
            this.f4322q = false;
        }
    }

    @Override // androidx.lifecycle.v
    public m c() {
        return this.U3;
    }

    void d() {
        int i10 = this.f4320c + 1;
        this.f4320c = i10;
        if (i10 != 1 || !this.f4323x) {
            return;
        }
        this.U3.h(m.b.ON_START);
        this.f4323x = false;
    }

    void e() {
        this.f4320c--;
        j();
    }

    void h(Context context) {
        this.f4324y = new Handler();
        this.U3.h(m.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    void i() {
        if (this.f4321d == 0) {
            this.f4322q = true;
            this.U3.h(m.b.ON_PAUSE);
        }
    }

    void j() {
        if (this.f4320c != 0 || !this.f4322q) {
            return;
        }
        this.U3.h(m.b.ON_STOP);
        this.f4323x = true;
    }
}
