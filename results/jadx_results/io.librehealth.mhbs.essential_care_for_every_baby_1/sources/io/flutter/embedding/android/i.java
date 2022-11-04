package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
/* loaded from: classes.dex */
public class i extends SurfaceView implements io.flutter.embedding.engine.renderer.c {

    /* renamed from: a */
    private final boolean f886a;

    /* renamed from: b */
    private boolean f887b;

    /* renamed from: c */
    private boolean f888c;

    /* renamed from: d */
    private io.flutter.embedding.engine.renderer.a f889d;

    /* renamed from: e */
    private final SurfaceHolder.Callback f890e;
    private final io.flutter.embedding.engine.renderer.b f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements SurfaceHolder.Callback {
        a() {
            i.this = r1;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            d.a.b.e("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (i.this.f888c) {
                i.this.j(i2, i3);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            d.a.b.e("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            i.this.f887b = true;
            if (i.this.f888c) {
                i.this.k();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            d.a.b.e("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            i.this.f887b = false;
            if (i.this.f888c) {
                i.this.l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements io.flutter.embedding.engine.renderer.b {
        b() {
            i.this = r1;
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void e() {
            d.a.b.e("FlutterSurfaceView", "onFlutterUiDisplayed()");
            i.this.setAlpha(1.0f);
            if (i.this.f889d != null) {
                i.this.f889d.l(this);
            }
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void f() {
        }
    }

    private i(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.f887b = false;
        this.f888c = false;
        this.f890e = new a();
        this.f = new b();
        this.f886a = z;
        m();
    }

    public i(Context context, boolean z) {
        this(context, null, z);
    }

    public void j(int i, int i2) {
        if (this.f889d != null) {
            d.a.b.e("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i + " x " + i2);
            this.f889d.q(i, i2);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    public void k() {
        if (this.f889d == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f889d.o(getHolder().getSurface());
    }

    public void l() {
        io.flutter.embedding.engine.renderer.a aVar = this.f889d;
        if (aVar != null) {
            aVar.p();
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    private void m() {
        if (this.f886a) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f890e);
        setAlpha(0.0f);
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void a(io.flutter.embedding.engine.renderer.a aVar) {
        d.a.b.e("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f889d != null) {
            d.a.b.e("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f889d.p();
            this.f889d.l(this.f);
        }
        this.f889d = aVar;
        this.f888c = true;
        aVar.f(this.f);
        if (this.f887b) {
            d.a.b.e("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            k();
        }
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void b() {
        if (this.f889d == null) {
            d.a.b.f("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            d.a.b.e("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
            l();
        }
        setAlpha(0.0f);
        this.f889d.l(this.f);
        this.f889d = null;
        this.f888c = false;
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void c() {
        if (this.f889d == null) {
            d.a.b.f("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f889d = null;
        this.f888c = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        region.op(iArr[0], iArr[1], (iArr[0] + getRight()) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public io.flutter.embedding.engine.renderer.a getAttachedRenderer() {
        return this.f889d;
    }
}
