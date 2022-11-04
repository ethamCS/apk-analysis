package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.b3;
import androidx.camera.core.s1;
import androidx.camera.view.k;
import androidx.camera.view.q;
/* loaded from: classes.dex */
public final class q extends k {

    /* renamed from: e */
    SurfaceView f2685e;

    /* renamed from: f */
    final b f2686f = new b();

    /* renamed from: g */
    private k.a f2687g;

    /* loaded from: classes.dex */
    private static class a {
        static void a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    /* loaded from: classes.dex */
    public class b implements SurfaceHolder.Callback {

        /* renamed from: a */
        private Size f2688a;

        /* renamed from: b */
        private b3 f2689b;

        /* renamed from: c */
        private Size f2690c;

        /* renamed from: d */
        private boolean f2691d = false;

        b() {
            q.this = r1;
        }

        private boolean b() {
            Size size;
            return !this.f2691d && this.f2689b != null && (size = this.f2688a) != null && size.equals(this.f2690c);
        }

        private void c() {
            if (this.f2689b != null) {
                s1.a("SurfaceViewImpl", "Request canceled: " + this.f2689b);
                this.f2689b.y();
            }
        }

        private void d() {
            if (this.f2689b != null) {
                s1.a("SurfaceViewImpl", "Surface invalidated " + this.f2689b);
                this.f2689b.k().c();
            }
        }

        public /* synthetic */ void e(b3.f fVar) {
            s1.a("SurfaceViewImpl", "Safe to release surface.");
            q.this.o();
        }

        private boolean g() {
            Surface surface = q.this.f2685e.getHolder().getSurface();
            if (b()) {
                s1.a("SurfaceViewImpl", "Surface set on Preview.");
                this.f2689b.v(surface, androidx.core.content.a.g(q.this.f2685e.getContext()), new androidx.core.util.a() { // from class: androidx.camera.view.r
                    @Override // androidx.core.util.a
                    public final void a(Object obj) {
                        q.b.this.e((b3.f) obj);
                    }
                });
                this.f2691d = true;
                q.this.f();
                return true;
            }
            return false;
        }

        void f(b3 b3Var) {
            c();
            this.f2689b = b3Var;
            Size l10 = b3Var.l();
            this.f2688a = l10;
            this.f2691d = false;
            if (!g()) {
                s1.a("SurfaceViewImpl", "Wait for new Surface creation.");
                q.this.f2685e.getHolder().setFixedSize(l10.getWidth(), l10.getHeight());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            s1.a("SurfaceViewImpl", "Surface changed. Size: " + i11 + "x" + i12);
            this.f2690c = new Size(i11, i12);
            g();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            s1.a("SurfaceViewImpl", "Surface created.");
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            s1.a("SurfaceViewImpl", "Surface destroyed.");
            if (this.f2691d) {
                d();
            } else {
                c();
            }
            this.f2691d = false;
            this.f2689b = null;
            this.f2690c = null;
            this.f2688a = null;
        }
    }

    public q(FrameLayout frameLayout, f fVar) {
        super(frameLayout, fVar);
    }

    public static /* synthetic */ void m(int i10) {
        if (i10 == 0) {
            s1.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
            return;
        }
        s1.c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i10);
    }

    public /* synthetic */ void n(b3 b3Var) {
        this.f2686f.f(b3Var);
    }

    @Override // androidx.camera.view.k
    View b() {
        return this.f2685e;
    }

    @Override // androidx.camera.view.k
    Bitmap c() {
        SurfaceView surfaceView = this.f2685e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f2685e.getHolder().getSurface().isValid()) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.f2685e.getWidth(), this.f2685e.getHeight(), Bitmap.Config.ARGB_8888);
        SurfaceView surfaceView2 = this.f2685e;
        a.a(surfaceView2, createBitmap, n.f2681a, surfaceView2.getHandler());
        return createBitmap;
    }

    @Override // androidx.camera.view.k
    public void d() {
    }

    @Override // androidx.camera.view.k
    public void e() {
    }

    @Override // androidx.camera.view.k
    public void g(final b3 b3Var, k.a aVar) {
        this.f2671a = b3Var.l();
        this.f2687g = aVar;
        l();
        b3Var.i(androidx.core.content.a.g(this.f2685e.getContext()), new Runnable() { // from class: androidx.camera.view.o
            @Override // java.lang.Runnable
            public final void run() {
                q.this.o();
            }
        });
        this.f2685e.post(new Runnable() { // from class: androidx.camera.view.p
            @Override // java.lang.Runnable
            public final void run() {
                q.this.n(b3Var);
            }
        });
    }

    @Override // androidx.camera.view.k
    public x5.a<Void> i() {
        return y.f.h(null);
    }

    void l() {
        androidx.core.util.h.g(this.f2672b);
        androidx.core.util.h.g(this.f2671a);
        SurfaceView surfaceView = new SurfaceView(this.f2672b.getContext());
        this.f2685e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f2671a.getWidth(), this.f2671a.getHeight()));
        this.f2672b.removeAllViews();
        this.f2672b.addView(this.f2685e);
        this.f2685e.getHolder().addCallback(this.f2686f);
    }

    public void o() {
        k.a aVar = this.f2687g;
        if (aVar != null) {
            aVar.a();
            this.f2687g = null;
        }
    }
}
