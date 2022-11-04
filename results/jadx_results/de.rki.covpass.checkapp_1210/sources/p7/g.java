package p7;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import o7.s;
/* loaded from: classes.dex */
public class g {

    /* renamed from: n */
    private static final String f18932n = "g";

    /* renamed from: b */
    private j f18934b;

    /* renamed from: c */
    private h f18935c;

    /* renamed from: d */
    private Handler f18936d;

    /* renamed from: e */
    private m f18937e;

    /* renamed from: f */
    private boolean f18938f = false;

    /* renamed from: g */
    private boolean f18939g = true;

    /* renamed from: i */
    private i f18941i = new i();

    /* renamed from: j */
    private Runnable f18942j = new a();

    /* renamed from: k */
    private Runnable f18943k = new b();

    /* renamed from: l */
    private Runnable f18944l = new c();

    /* renamed from: m */
    private Runnable f18945m = new d();

    /* renamed from: a */
    private k f18933a = k.d();

    /* renamed from: h */
    private Handler f18940h = new Handler();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            g.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(g.f18932n, "Opening camera");
                g.this.f18935c.l();
            } catch (Exception e10) {
                g.this.t(e10);
                Log.e(g.f18932n, "Failed to open camera", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            g.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(g.f18932n, "Configuring camera");
                g.this.f18935c.e();
                if (g.this.f18936d == null) {
                    return;
                }
                g.this.f18936d.obtainMessage(m6.k.j_res_0x7f0902d1, g.this.o()).sendToTarget();
            } catch (Exception e10) {
                g.this.t(e10);
                Log.e(g.f18932n, "Failed to configure camera", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
            g.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(g.f18932n, "Starting preview");
                g.this.f18935c.s(g.this.f18934b);
                g.this.f18935c.u();
            } catch (Exception e10) {
                g.this.t(e10);
                Log.e(g.f18932n, "Failed to start preview", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        d() {
            g.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(g.f18932n, "Closing camera");
                g.this.f18935c.v();
                g.this.f18935c.d();
            } catch (Exception e10) {
                Log.e(g.f18932n, "Failed to close camera", e10);
            }
            g.this.f18939g = true;
            g.this.f18936d.sendEmptyMessage(m6.k.c_res_0x7f0902ca);
            g.this.f18933a.b();
        }
    }

    public g(Context context) {
        s.a();
        h hVar = new h(context);
        this.f18935c = hVar;
        hVar.o(this.f18941i);
    }

    private void C() {
        if (this.f18938f) {
            return;
        }
        throw new IllegalStateException("CameraInstance is not open");
    }

    public o7.q o() {
        return this.f18935c.h();
    }

    public /* synthetic */ void q(p pVar) {
        this.f18935c.m(pVar);
    }

    public /* synthetic */ void r(final p pVar) {
        if (!this.f18938f) {
            Log.d(f18932n, "Camera is closed, not requesting preview");
        } else {
            this.f18933a.c(new Runnable() { // from class: p7.d
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.q(pVar);
                }
            });
        }
    }

    public /* synthetic */ void s(boolean z10) {
        this.f18935c.t(z10);
    }

    public void t(Exception exc) {
        Handler handler = this.f18936d;
        if (handler != null) {
            handler.obtainMessage(m6.k.d_res_0x7f0902cb, exc).sendToTarget();
        }
    }

    public void A(final boolean z10) {
        s.a();
        if (this.f18938f) {
            this.f18933a.c(new Runnable() { // from class: p7.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.s(z10);
                }
            });
        }
    }

    public void B() {
        s.a();
        C();
        this.f18933a.c(this.f18944l);
    }

    public void l() {
        s.a();
        if (this.f18938f) {
            this.f18933a.c(this.f18945m);
        } else {
            this.f18939g = true;
        }
        this.f18938f = false;
    }

    public void m() {
        s.a();
        C();
        this.f18933a.c(this.f18943k);
    }

    public m n() {
        return this.f18937e;
    }

    public boolean p() {
        return this.f18939g;
    }

    public void u() {
        s.a();
        this.f18938f = true;
        this.f18939g = false;
        this.f18933a.e(this.f18942j);
    }

    public void v(final p pVar) {
        this.f18940h.post(new Runnable() { // from class: p7.e
            @Override // java.lang.Runnable
            public final void run() {
                g.this.r(pVar);
            }
        });
    }

    public void w(i iVar) {
        if (!this.f18938f) {
            this.f18941i = iVar;
            this.f18935c.o(iVar);
        }
    }

    public void x(m mVar) {
        this.f18937e = mVar;
        this.f18935c.q(mVar);
    }

    public void y(Handler handler) {
        this.f18936d = handler;
    }

    public void z(j jVar) {
        this.f18934b = jVar;
    }
}
