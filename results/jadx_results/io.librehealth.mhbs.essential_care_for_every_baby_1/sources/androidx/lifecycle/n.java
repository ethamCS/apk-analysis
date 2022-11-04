package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.e;
import androidx.lifecycle.o;
/* loaded from: classes.dex */
public class n implements i {
    private static final n i = new n();

    /* renamed from: e */
    private Handler f272e;

    /* renamed from: a */
    private int f268a = 0;

    /* renamed from: b */
    private int f269b = 0;

    /* renamed from: c */
    private boolean f270c = true;

    /* renamed from: d */
    private boolean f271d = true;
    private final j f = new j(this);
    private Runnable g = new a();
    o.a h = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            n.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.g();
            n.this.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements o.a {
        b() {
            n.this = r1;
        }

        @Override // androidx.lifecycle.o.a
        public void a() {
        }

        @Override // androidx.lifecycle.o.a
        public void b() {
            n.this.c();
        }

        @Override // androidx.lifecycle.o.a
        public void c() {
            n.this.d();
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
                n.this.c();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                n.this.d();
            }
        }

        c() {
            n.this = r1;
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                o.f(activity).h(n.this.h);
            }
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            n.this.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            n.this.e();
        }
    }

    private n() {
    }

    public static i k() {
        return i;
    }

    public static void l(Context context) {
        i.f(context);
    }

    @Override // androidx.lifecycle.i
    public e a() {
        return this.f;
    }

    void b() {
        int i2 = this.f269b - 1;
        this.f269b = i2;
        if (i2 == 0) {
            this.f272e.postDelayed(this.g, 700L);
        }
    }

    void c() {
        int i2 = this.f269b + 1;
        this.f269b = i2;
        if (i2 == 1) {
            if (!this.f270c) {
                this.f272e.removeCallbacks(this.g);
                return;
            }
            this.f.g(e.a.ON_RESUME);
            this.f270c = false;
        }
    }

    void d() {
        int i2 = this.f268a + 1;
        this.f268a = i2;
        if (i2 != 1 || !this.f271d) {
            return;
        }
        this.f.g(e.a.ON_START);
        this.f271d = false;
    }

    void e() {
        this.f268a--;
        h();
    }

    void f(Context context) {
        this.f272e = new Handler();
        this.f.g(e.a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    void g() {
        if (this.f269b == 0) {
            this.f270c = true;
            this.f.g(e.a.ON_PAUSE);
        }
    }

    void h() {
        if (this.f268a != 0 || !this.f270c) {
            return;
        }
        this.f.g(e.a.ON_STOP);
        this.f271d = true;
    }
}
