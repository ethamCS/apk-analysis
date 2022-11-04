package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.e;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;
@TargetApi(16)
/* loaded from: classes.dex */
public class a implements e {

    /* renamed from: a */
    private final FlutterJNI f1123a;

    /* renamed from: c */
    private Surface f1125c;

    /* renamed from: e */
    private final io.flutter.embedding.engine.renderer.b f1127e;

    /* renamed from: b */
    private final AtomicLong f1124b = new AtomicLong(0);

    /* renamed from: d */
    private boolean f1126d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.embedding.engine.renderer.a$a */
    /* loaded from: classes.dex */
    public class C0055a implements io.flutter.embedding.engine.renderer.b {
        C0055a() {
            a.this = r1;
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void e() {
            a.this.f1126d = true;
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void f() {
            a.this.f1126d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class b implements e.a {

        /* renamed from: a */
        private final long f1129a;

        /* renamed from: b */
        private final SurfaceTextureWrapper f1130b;

        /* renamed from: c */
        private boolean f1131c;

        /* renamed from: d */
        private SurfaceTexture.OnFrameAvailableListener f1132d = new C0056a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.flutter.embedding.engine.renderer.a$b$a */
        /* loaded from: classes.dex */
        public class C0056a implements SurfaceTexture.OnFrameAvailableListener {
            C0056a() {
                b.this = r1;
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (b.this.f1131c || !a.this.f1123a.isAttached()) {
                    return;
                }
                b bVar = b.this;
                a.this.j(bVar.f1129a);
            }
        }

        b(long j, SurfaceTexture surfaceTexture) {
            a.this = r1;
            this.f1129a = j;
            this.f1130b = new SurfaceTextureWrapper(surfaceTexture);
            if (Build.VERSION.SDK_INT >= 21) {
                c().setOnFrameAvailableListener(this.f1132d, new Handler());
            } else {
                c().setOnFrameAvailableListener(this.f1132d);
            }
        }

        @Override // io.flutter.view.e.a
        public void a() {
            if (this.f1131c) {
                return;
            }
            d.a.b.e("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f1129a + ").");
            this.f1130b.release();
            a.this.s(this.f1129a);
            this.f1131c = true;
        }

        @Override // io.flutter.view.e.a
        public long b() {
            return this.f1129a;
        }

        @Override // io.flutter.view.e.a
        public SurfaceTexture c() {
            return this.f1130b.surfaceTexture();
        }

        public SurfaceTextureWrapper f() {
            return this.f1130b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public float f1135a = 1.0f;

        /* renamed from: b */
        public int f1136b = 0;

        /* renamed from: c */
        public int f1137c = 0;

        /* renamed from: d */
        public int f1138d = 0;

        /* renamed from: e */
        public int f1139e = 0;
        public int f = 0;
        public int g = 0;
        public int h = 0;
        public int i = 0;
        public int j = 0;
        public int k = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int o = 0;
    }

    public a(FlutterJNI flutterJNI) {
        C0055a c0055a = new C0055a();
        this.f1127e = c0055a;
        this.f1123a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(c0055a);
    }

    public void j(long j) {
        this.f1123a.markTextureFrameAvailable(j);
    }

    private void k(long j, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f1123a.registerTexture(j, surfaceTextureWrapper);
    }

    public void s(long j) {
        this.f1123a.unregisterTexture(j);
    }

    @Override // io.flutter.view.e
    public e.a a() {
        d.a.b.e("FlutterRenderer", "Creating a SurfaceTexture.");
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.detachFromGLContext();
        b bVar = new b(this.f1124b.getAndIncrement(), surfaceTexture);
        d.a.b.e("FlutterRenderer", "New SurfaceTexture ID: " + bVar.b());
        k(bVar.b(), bVar.f());
        return bVar;
    }

    public void f(io.flutter.embedding.engine.renderer.b bVar) {
        this.f1123a.addIsDisplayingFlutterUiListener(bVar);
        if (this.f1126d) {
            bVar.e();
        }
    }

    public void g(ByteBuffer byteBuffer, int i) {
        this.f1123a.dispatchPointerDataPacket(byteBuffer, i);
    }

    public boolean h() {
        return this.f1126d;
    }

    public boolean i() {
        return this.f1123a.getIsSoftwareRenderingEnabled();
    }

    public void l(io.flutter.embedding.engine.renderer.b bVar) {
        this.f1123a.removeIsDisplayingFlutterUiListener(bVar);
    }

    public void m(boolean z) {
        this.f1123a.setSemanticsEnabled(z);
    }

    public void n(c cVar) {
        d.a.b.e("FlutterRenderer", "Setting viewport metrics\nSize: " + cVar.f1136b + " x " + cVar.f1137c + "\nPadding - L: " + cVar.g + ", T: " + cVar.f1138d + ", R: " + cVar.f1139e + ", B: " + cVar.f + "\nInsets - L: " + cVar.k + ", T: " + cVar.h + ", R: " + cVar.i + ", B: " + cVar.j + "\nSystem Gesture Insets - L: " + cVar.o + ", T: " + cVar.l + ", R: " + cVar.m + ", B: " + cVar.j);
        this.f1123a.setViewportMetrics(cVar.f1135a, cVar.f1136b, cVar.f1137c, cVar.f1138d, cVar.f1139e, cVar.f, cVar.g, cVar.h, cVar.i, cVar.j, cVar.k, cVar.l, cVar.m, cVar.n, cVar.o);
    }

    public void o(Surface surface) {
        if (this.f1125c != null) {
            p();
        }
        this.f1125c = surface;
        this.f1123a.onSurfaceCreated(surface);
    }

    public void p() {
        this.f1123a.onSurfaceDestroyed();
        this.f1125c = null;
        if (this.f1126d) {
            this.f1127e.f();
        }
        this.f1126d = false;
    }

    public void q(int i, int i2) {
        this.f1123a.onSurfaceChanged(i, i2);
    }

    public void r(Surface surface) {
        this.f1125c = surface;
        this.f1123a.onSurfaceWindowChanged(surface);
    }
}
