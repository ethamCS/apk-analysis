package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.e;
import androidx.lifecycle.r;
/* loaded from: classes.dex */
public class q implements i {
    private static final q j = new q();

    /* renamed from: f */
    private Handler f1253f;

    /* renamed from: b */
    private int f1249b = 0;

    /* renamed from: c */
    private int f1250c = 0;

    /* renamed from: d */
    private boolean f1251d = true;

    /* renamed from: e */
    private boolean f1252e = true;

    /* renamed from: g */
    private final j f1254g = new j(this);

    /* renamed from: h */
    private Runnable f1255h = new a();
    r.a i = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            q.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.i();
            q.this.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements r.a {
        b() {
            q.this = r1;
        }

        @Override // androidx.lifecycle.r.a
        public void a() {
        }

        @Override // androidx.lifecycle.r.a
        public void b() {
            q.this.e();
        }

        @Override // androidx.lifecycle.r.a
        public void c() {
            q.this.f();
        }
    }

    /* loaded from: classes.dex */
    public class c extends androidx.lifecycle.b {

        /* loaded from: classes.dex */
        class a extends androidx.lifecycle.b {
            a() {
                c.this = r1;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                q.this.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                q.this.f();
            }
        }

        c() {
            q.this = r1;
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                r.f(activity).h(q.this.i);
            }
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            q.this.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            q.this.g();
        }
    }

    private q() {
    }

    public static void k(Context context) {
        j.h(context);
    }

    @Override // androidx.lifecycle.i
    public e a() {
        return this.f1254g;
    }

    void b() {
        int i = this.f1250c - 1;
        this.f1250c = i;
        if (i == 0) {
            this.f1253f.postDelayed(this.f1255h, 700L);
        }
    }

    void e() {
        int i = this.f1250c + 1;
        this.f1250c = i;
        if (i == 1) {
            if (!this.f1251d) {
                this.f1253f.removeCallbacks(this.f1255h);
                return;
            }
            this.f1254g.i(e.a.ON_RESUME);
            this.f1251d = false;
        }
    }

    void f() {
        int i = this.f1249b + 1;
        this.f1249b = i;
        if (i != 1 || !this.f1252e) {
            return;
        }
        this.f1254g.i(e.a.ON_START);
        this.f1252e = false;
    }

    void g() {
        this.f1249b--;
        j();
    }

    void h(Context context) {
        this.f1253f = new Handler();
        this.f1254g.i(e.a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    void i() {
        if (this.f1250c == 0) {
            this.f1251d = true;
            this.f1254g.i(e.a.ON_PAUSE);
        }
    }

    void j() {
        if (this.f1249b != 0 || !this.f1251d) {
            return;
        }
        this.f1254g.i(e.a.ON_STOP);
        this.f1252e = true;
    }
}
