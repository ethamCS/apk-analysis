package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
/* loaded from: classes.dex */
public class j extends TextureView implements io.flutter.embedding.engine.renderer.c {

    /* renamed from: a */
    private boolean f893a;

    /* renamed from: b */
    private boolean f894b;

    /* renamed from: c */
    private io.flutter.embedding.engine.renderer.a f895c;

    /* renamed from: d */
    private Surface f896d;

    /* renamed from: e */
    private final TextureView.SurfaceTextureListener f897e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements TextureView.SurfaceTextureListener {
        a() {
            j.this = r1;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            d.a.b.e("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            j.this.f893a = true;
            if (j.this.f894b) {
                j.this.j();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            d.a.b.e("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            j.this.f893a = false;
            if (j.this.f894b) {
                j.this.k();
                return true;
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            d.a.b.e("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (j.this.f894b) {
                j.this.i(i, i2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public j(Context context) {
        this(context, null);
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f893a = false;
        this.f894b = false;
        this.f897e = new a();
        l();
    }

    public void i(int i, int i2) {
        if (this.f895c != null) {
            d.a.b.e("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i + " x " + i2);
            this.f895c.q(i, i2);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    public void j() {
        if (this.f895c == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = new Surface(getSurfaceTexture());
        this.f896d = surface;
        this.f895c.o(surface);
    }

    public void k() {
        io.flutter.embedding.engine.renderer.a aVar = this.f895c;
        if (aVar != null) {
            aVar.p();
            Surface surface = this.f896d;
            if (surface == null) {
                return;
            }
            surface.release();
            this.f896d = null;
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    private void l() {
        setSurfaceTextureListener(this.f897e);
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void a(io.flutter.embedding.engine.renderer.a aVar) {
        d.a.b.e("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f895c != null) {
            d.a.b.e("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f895c.p();
        }
        this.f895c = aVar;
        this.f894b = true;
        if (this.f893a) {
            d.a.b.e("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            j();
        }
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void b() {
        if (this.f895c == null) {
            d.a.b.f("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            d.a.b.e("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
            k();
        }
        this.f895c = null;
        this.f894b = false;
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public void c() {
        if (this.f895c == null) {
            d.a.b.f("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f895c = null;
        this.f894b = false;
    }

    @Override // io.flutter.embedding.engine.renderer.c
    public io.flutter.embedding.engine.renderer.a getAttachedRenderer() {
        return this.f895c;
    }
}
