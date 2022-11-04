package p7;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import o7.r;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: n */
    private static final String f18950n = "h";

    /* renamed from: a */
    private Camera f18951a;

    /* renamed from: b */
    private Camera.CameraInfo f18952b;

    /* renamed from: c */
    private p7.a f18953c;

    /* renamed from: d */
    private m6.b f18954d;

    /* renamed from: e */
    private boolean f18955e;

    /* renamed from: f */
    private String f18956f;

    /* renamed from: h */
    private m f18958h;

    /* renamed from: i */
    private o7.q f18959i;

    /* renamed from: j */
    private o7.q f18960j;

    /* renamed from: l */
    private Context f18962l;

    /* renamed from: g */
    private i f18957g = new i();

    /* renamed from: k */
    private int f18961k = -1;

    /* renamed from: m */
    private final a f18963m = new a();

    /* loaded from: classes.dex */
    public final class a implements Camera.PreviewCallback {

        /* renamed from: a */
        private p f18964a;

        /* renamed from: b */
        private o7.q f18965b;

        public a() {
            h.this = r1;
        }

        public void a(p pVar) {
            this.f18964a = pVar;
        }

        public void b(o7.q qVar) {
            this.f18965b = qVar;
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Exception e10;
            o7.q qVar = this.f18965b;
            p pVar = this.f18964a;
            if (qVar == null || pVar == null) {
                Log.d(h.f18950n, "Got preview callback, but no handler or resolution available");
                if (pVar == null) {
                    return;
                }
                e10 = new Exception("No resolution available");
            } else {
                try {
                    if (bArr == null) {
                        throw new NullPointerException("No preview data received");
                    }
                    r rVar = new r(bArr, qVar.f17644c, qVar.f17645d, camera.getParameters().getPreviewFormat(), h.this.f());
                    if (h.this.f18952b.facing == 1) {
                        rVar.e(true);
                    }
                    pVar.a(rVar);
                    return;
                } catch (RuntimeException e11) {
                    e10 = e11;
                    Log.e(h.f18950n, "Camera preview failed", e10);
                }
            }
            pVar.b(e10);
        }
    }

    public h(Context context) {
        this.f18962l = context;
    }

    private int c() {
        int c10 = this.f18958h.c();
        int i10 = 0;
        if (c10 != 0) {
            if (c10 == 1) {
                i10 = 90;
            } else if (c10 == 2) {
                i10 = 180;
            } else if (c10 == 3) {
                i10 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f18952b;
        int i11 = cameraInfo.facing;
        int i12 = cameraInfo.orientation;
        int i13 = (i11 == 1 ? 360 - ((i12 + i10) % 360) : (i12 - i10) + 360) % 360;
        String str = f18950n;
        Log.i(str, "Camera Display Orientation: " + i13);
        return i13;
    }

    private Camera.Parameters g() {
        Camera.Parameters parameters = this.f18951a.getParameters();
        String str = this.f18956f;
        if (str == null) {
            this.f18956f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        return parameters;
    }

    private static List<o7.q> i(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                new o7.q(previewSize.width, previewSize.height);
                arrayList.add(new o7.q(previewSize.width, previewSize.height));
            }
            return arrayList;
        }
        for (Camera.Size size : supportedPreviewSizes) {
            arrayList.add(new o7.q(size.width, size.height));
        }
        return arrayList;
    }

    private void n(int i10) {
        this.f18951a.setDisplayOrientation(i10);
    }

    private void p(boolean z10) {
        Camera.Parameters g10 = g();
        if (g10 == null) {
            Log.w(f18950n, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str = f18950n;
        Log.i(str, "Initial camera parameters: " + g10.flatten());
        if (z10) {
            Log.w(str, "In camera config safe mode -- most settings will not be honored");
        }
        c.g(g10, this.f18957g.a(), z10);
        if (!z10) {
            c.k(g10, false);
            if (this.f18957g.h()) {
                c.i(g10);
            }
            if (this.f18957g.e()) {
                c.c(g10);
            }
            if (this.f18957g.g()) {
                c.l(g10);
                c.h(g10);
                c.j(g10);
            }
        }
        List<o7.q> i10 = i(g10);
        if (i10.size() == 0) {
            this.f18959i = null;
        } else {
            o7.q a10 = this.f18958h.a(i10, j());
            this.f18959i = a10;
            g10.setPreviewSize(a10.f17644c, a10.f17645d);
        }
        if (Build.DEVICE.equals("glass-1")) {
            c.e(g10);
        }
        Log.i(str, "Final camera parameters: " + g10.flatten());
        this.f18951a.setParameters(g10);
    }

    private void r() {
        try {
            int c10 = c();
            this.f18961k = c10;
            n(c10);
        } catch (Exception unused) {
            Log.w(f18950n, "Failed to set rotation.");
        }
        try {
            p(false);
        } catch (Exception unused2) {
            try {
                p(true);
            } catch (Exception unused3) {
                Log.w(f18950n, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f18951a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f18960j = this.f18959i;
        } else {
            this.f18960j = new o7.q(previewSize.width, previewSize.height);
        }
        this.f18963m.b(this.f18960j);
    }

    public void d() {
        Camera camera = this.f18951a;
        if (camera != null) {
            camera.release();
            this.f18951a = null;
        }
    }

    public void e() {
        if (this.f18951a != null) {
            r();
            return;
        }
        throw new RuntimeException("Camera not open");
    }

    public int f() {
        return this.f18961k;
    }

    public o7.q h() {
        if (this.f18960j == null) {
            return null;
        }
        return j() ? this.f18960j.b() : this.f18960j;
    }

    public boolean j() {
        int i10 = this.f18961k;
        if (i10 != -1) {
            return i10 % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    public boolean k() {
        String flashMode;
        Camera.Parameters parameters = this.f18951a.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    public void l() {
        Camera b10 = n6.a.b(this.f18957g.b());
        this.f18951a = b10;
        if (b10 != null) {
            int a10 = n6.a.a(this.f18957g.b());
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            this.f18952b = cameraInfo;
            Camera.getCameraInfo(a10, cameraInfo);
            return;
        }
        throw new RuntimeException("Failed to open camera");
    }

    public void m(p pVar) {
        Camera camera = this.f18951a;
        if (camera == null || !this.f18955e) {
            return;
        }
        this.f18963m.a(pVar);
        camera.setOneShotPreviewCallback(this.f18963m);
    }

    public void o(i iVar) {
        this.f18957g = iVar;
    }

    public void q(m mVar) {
        this.f18958h = mVar;
    }

    public void s(j jVar) {
        jVar.a(this.f18951a);
    }

    public void t(boolean z10) {
        if (this.f18951a != null) {
            try {
                if (z10 == k()) {
                    return;
                }
                p7.a aVar = this.f18953c;
                if (aVar != null) {
                    aVar.j();
                }
                Camera.Parameters parameters = this.f18951a.getParameters();
                c.k(parameters, z10);
                if (this.f18957g.f()) {
                    c.d(parameters, z10);
                }
                this.f18951a.setParameters(parameters);
                p7.a aVar2 = this.f18953c;
                if (aVar2 == null) {
                    return;
                }
                aVar2.i();
            } catch (RuntimeException e10) {
                Log.e(f18950n, "Failed to set torch", e10);
            }
        }
    }

    public void u() {
        Camera camera = this.f18951a;
        if (camera == null || this.f18955e) {
            return;
        }
        camera.startPreview();
        this.f18955e = true;
        this.f18953c = new p7.a(this.f18951a, this.f18957g);
        m6.b bVar = new m6.b(this.f18962l, this, this.f18957g);
        this.f18954d = bVar;
        bVar.d();
    }

    public void v() {
        p7.a aVar = this.f18953c;
        if (aVar != null) {
            aVar.j();
            this.f18953c = null;
        }
        m6.b bVar = this.f18954d;
        if (bVar != null) {
            bVar.e();
            this.f18954d = null;
        }
        Camera camera = this.f18951a;
        if (camera == null || !this.f18955e) {
            return;
        }
        camera.stopPreview();
        this.f18963m.a(null);
        this.f18955e = false;
    }
}
