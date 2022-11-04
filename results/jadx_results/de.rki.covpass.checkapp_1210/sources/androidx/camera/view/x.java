package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.b3;
import androidx.camera.core.s1;
import androidx.camera.view.k;
import androidx.concurrent.futures.c;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class x extends k {

    /* renamed from: e */
    TextureView f2704e;

    /* renamed from: f */
    SurfaceTexture f2705f;

    /* renamed from: g */
    x5.a<b3.f> f2706g;

    /* renamed from: h */
    b3 f2707h;

    /* renamed from: j */
    SurfaceTexture f2709j;

    /* renamed from: l */
    k.a f2711l;

    /* renamed from: i */
    boolean f2708i = false;

    /* renamed from: k */
    AtomicReference<c.a<Void>> f2710k = new AtomicReference<>();

    /* loaded from: classes.dex */
    public class a implements TextureView.SurfaceTextureListener {

        /* renamed from: androidx.camera.view.x$a$a */
        /* loaded from: classes.dex */
        class C0020a implements y.c<b3.f> {

            /* renamed from: a */
            final /* synthetic */ SurfaceTexture f2713a;

            C0020a(SurfaceTexture surfaceTexture) {
                a.this = r1;
                this.f2713a = surfaceTexture;
            }

            @Override // y.c
            public void a(Throwable th2) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th2);
            }

            /* renamed from: c */
            public void b(b3.f fVar) {
                androidx.core.util.h.j(fVar.a() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                s1.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f2713a.release();
                x xVar = x.this;
                if (xVar.f2709j != null) {
                    xVar.f2709j = null;
                }
            }
        }

        a() {
            x.this = r1;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            s1.a("TextureViewImpl", "SurfaceTexture available. Size: " + i10 + "x" + i11);
            x xVar = x.this;
            xVar.f2705f = surfaceTexture;
            if (xVar.f2706g == null) {
                xVar.u();
                return;
            }
            androidx.core.util.h.g(xVar.f2707h);
            s1.a("TextureViewImpl", "Surface invalidated " + x.this.f2707h);
            x.this.f2707h.k().c();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            x xVar = x.this;
            xVar.f2705f = null;
            x5.a<b3.f> aVar = xVar.f2706g;
            if (aVar == null) {
                s1.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
                return true;
            }
            y.f.b(aVar, new C0020a(surfaceTexture), androidx.core.content.a.g(x.this.f2704e.getContext()));
            x.this.f2709j = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            s1.a("TextureViewImpl", "SurfaceTexture size changed: " + i10 + "x" + i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            c.a<Void> andSet = x.this.f2710k.getAndSet(null);
            if (andSet != null) {
                andSet.c(null);
            }
        }
    }

    public x(FrameLayout frameLayout, f fVar) {
        super(frameLayout, fVar);
    }

    public /* synthetic */ void o(b3 b3Var) {
        b3 b3Var2 = this.f2707h;
        if (b3Var2 != null && b3Var2 == b3Var) {
            this.f2707h = null;
            this.f2706g = null;
        }
        s();
    }

    public /* synthetic */ Object p(Surface surface, final c.a aVar) {
        s1.a("TextureViewImpl", "Surface set on Preview.");
        b3 b3Var = this.f2707h;
        Executor a10 = x.a.a();
        Objects.requireNonNull(aVar);
        b3Var.v(surface, a10, new androidx.core.util.a() { // from class: androidx.camera.view.u
            @Override // androidx.core.util.a
            public final void a(Object obj) {
                c.a.this.c((b3.f) obj);
            }
        });
        return "provideSurface[request=" + this.f2707h + " surface=" + surface + "]";
    }

    public /* synthetic */ void q(Surface surface, x5.a aVar, b3 b3Var) {
        s1.a("TextureViewImpl", "Safe to release surface.");
        s();
        surface.release();
        if (this.f2706g == aVar) {
            this.f2706g = null;
        }
        if (this.f2707h == b3Var) {
            this.f2707h = null;
        }
    }

    public /* synthetic */ Object r(c.a aVar) {
        this.f2710k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    private void s() {
        k.a aVar = this.f2711l;
        if (aVar != null) {
            aVar.a();
            this.f2711l = null;
        }
    }

    private void t() {
        if (!this.f2708i || this.f2709j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f2704e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f2709j;
        if (surfaceTexture == surfaceTexture2) {
            return;
        }
        this.f2704e.setSurfaceTexture(surfaceTexture2);
        this.f2709j = null;
        this.f2708i = false;
    }

    @Override // androidx.camera.view.k
    View b() {
        return this.f2704e;
    }

    @Override // androidx.camera.view.k
    Bitmap c() {
        TextureView textureView = this.f2704e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f2704e.getBitmap();
    }

    @Override // androidx.camera.view.k
    public void d() {
        t();
    }

    @Override // androidx.camera.view.k
    public void e() {
        this.f2708i = true;
    }

    @Override // androidx.camera.view.k
    public void g(final b3 b3Var, k.a aVar) {
        this.f2671a = b3Var.l();
        this.f2711l = aVar;
        n();
        b3 b3Var2 = this.f2707h;
        if (b3Var2 != null) {
            b3Var2.y();
        }
        this.f2707h = b3Var;
        b3Var.i(androidx.core.content.a.g(this.f2704e.getContext()), new Runnable() { // from class: androidx.camera.view.w
            @Override // java.lang.Runnable
            public final void run() {
                x.this.o(b3Var);
            }
        });
        u();
    }

    @Override // androidx.camera.view.k
    public x5.a<Void> i() {
        return androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.view.s
            @Override // androidx.concurrent.futures.c.AbstractC0023c
            public final Object a(c.a aVar) {
                Object r10;
                r10 = x.this.r(aVar);
                return r10;
            }
        });
    }

    public void n() {
        androidx.core.util.h.g(this.f2672b);
        androidx.core.util.h.g(this.f2671a);
        TextureView textureView = new TextureView(this.f2672b.getContext());
        this.f2704e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f2671a.getWidth(), this.f2671a.getHeight()));
        this.f2704e.setSurfaceTextureListener(new a());
        this.f2672b.removeAllViews();
        this.f2672b.addView(this.f2704e);
    }

    void u() {
        SurfaceTexture surfaceTexture;
        Size size = this.f2671a;
        if (size == null || (surfaceTexture = this.f2705f) == null || this.f2707h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f2671a.getHeight());
        final Surface surface = new Surface(this.f2705f);
        final b3 b3Var = this.f2707h;
        final x5.a<b3.f> a10 = androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.view.t
            @Override // androidx.concurrent.futures.c.AbstractC0023c
            public final Object a(c.a aVar) {
                Object p10;
                p10 = x.this.p(surface, aVar);
                return p10;
            }
        });
        this.f2706g = a10;
        a10.b(new Runnable() { // from class: androidx.camera.view.v
            @Override // java.lang.Runnable
            public final void run() {
                x.this.q(surface, a10, b3Var);
            }
        }, androidx.core.content.a.g(this.f2704e.getContext()));
        f();
    }
}
