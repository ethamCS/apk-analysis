package com.journeyapps.barcodescanner;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.a;
import java.util.ArrayList;
import java.util.List;
import m6.k;
import o7.o;
import o7.p;
import o7.q;
import o7.s;
import p7.g;
import p7.i;
import p7.j;
import p7.l;
import p7.m;
import p7.n;
/* loaded from: classes.dex */
public class a extends ViewGroup {

    /* renamed from: p4 */
    private static final String f8155p4 = a.class.getSimpleName();
    private TextureView U3;
    private p W3;
    private m Z3;

    /* renamed from: b4 */
    private q f8157b4;

    /* renamed from: c */
    private g f8158c;

    /* renamed from: c4 */
    private q f8159c4;

    /* renamed from: d */
    private WindowManager f8160d;

    /* renamed from: d4 */
    private Rect f8161d4;

    /* renamed from: e4 */
    private q f8162e4;

    /* renamed from: q */
    private Handler f8173q;

    /* renamed from: y */
    private SurfaceView f8175y;

    /* renamed from: x */
    private boolean f8174x = false;
    private boolean V3 = false;
    private int X3 = -1;
    private List<f> Y3 = new ArrayList();

    /* renamed from: a4 */
    private i f8156a4 = new i();

    /* renamed from: f4 */
    private Rect f8163f4 = null;

    /* renamed from: g4 */
    private Rect f8164g4 = null;

    /* renamed from: h4 */
    private q f8165h4 = null;

    /* renamed from: i4 */
    private double f8166i4 = 0.1d;

    /* renamed from: j4 */
    private p7.q f8167j4 = null;

    /* renamed from: k4 */
    private boolean f8168k4 = false;

    /* renamed from: l4 */
    private final SurfaceHolder.Callback f8169l4 = new b();

    /* renamed from: m4 */
    private final Handler.Callback f8170m4 = new c();

    /* renamed from: n4 */
    private o f8171n4 = new d();

    /* renamed from: o4 */
    private final f f8172o4 = new e();

    /* renamed from: com.journeyapps.barcodescanner.a$a */
    /* loaded from: classes.dex */
    public class TextureView$SurfaceTextureListenerC0116a implements TextureView.SurfaceTextureListener {
        TextureView$SurfaceTextureListenerC0116a() {
            a.this = r1;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            a.this.f8162e4 = new q(i10, i11);
            a.this.C();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements SurfaceHolder.Callback {
        b() {
            a.this = r1;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            if (surfaceHolder == null) {
                Log.e(a.f8155p4, "*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            a.this.f8162e4 = new q(i11, i12);
            a.this.C();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            a.this.f8162e4 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Handler.Callback {
        c() {
            a.this = r1;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == k.j_res_0x7f0902d1) {
                a.this.w((q) message.obj);
                return true;
            } else if (i10 != k.d_res_0x7f0902cb) {
                if (i10 != k.c_res_0x7f0902ca) {
                    return false;
                }
                a.this.f8172o4.e();
                return false;
            } else {
                Exception exc = (Exception) message.obj;
                if (!a.this.r()) {
                    return false;
                }
                a.this.u();
                a.this.f8172o4.b(exc);
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements o {
        d() {
            a.this = r1;
        }

        public /* synthetic */ void c() {
            a.this.z();
        }

        @Override // o7.o
        public void a(int i10) {
            a.this.f8173q.postDelayed(new Runnable() { // from class: com.journeyapps.barcodescanner.b
                @Override // java.lang.Runnable
                public final void run() {
                    a.d.this.c();
                }
            }, 250L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements f {
        e() {
            a.this = r1;
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void a() {
            for (f fVar : a.this.Y3) {
                fVar.a();
            }
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void b(Exception exc) {
            for (f fVar : a.this.Y3) {
                fVar.b(exc);
            }
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void c() {
            for (f fVar : a.this.Y3) {
                fVar.c();
            }
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void d() {
            for (f fVar : a.this.Y3) {
                fVar.d();
            }
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void e() {
            for (f fVar : a.this.Y3) {
                fVar.e();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b(Exception exc);

        void c();

        void d();

        void e();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p(context, attributeSet, 0, 0);
    }

    private void A() {
        View view;
        if (this.f8174x) {
            TextureView textureView = new TextureView(getContext());
            this.U3 = textureView;
            textureView.setSurfaceTextureListener(D());
            view = this.U3;
        } else {
            SurfaceView surfaceView = new SurfaceView(getContext());
            this.f8175y = surfaceView;
            surfaceView.getHolder().addCallback(this.f8169l4);
            view = this.f8175y;
        }
        addView(view);
    }

    private void B(j jVar) {
        if (this.V3 || this.f8158c == null) {
            return;
        }
        Log.i(f8155p4, "Starting preview");
        this.f8158c.z(jVar);
        this.f8158c.B();
        this.V3 = true;
        x();
        this.f8172o4.c();
    }

    public void C() {
        Rect rect;
        j jVar;
        q qVar = this.f8162e4;
        if (qVar == null || this.f8159c4 == null || (rect = this.f8161d4) == null) {
            return;
        }
        if (this.f8175y == null || !qVar.equals(new q(rect.width(), this.f8161d4.height()))) {
            TextureView textureView = this.U3;
            if (textureView == null || textureView.getSurfaceTexture() == null) {
                return;
            }
            if (this.f8159c4 != null) {
                this.U3.setTransform(l(new q(this.U3.getWidth(), this.U3.getHeight()), this.f8159c4));
            }
            jVar = new j(this.U3.getSurfaceTexture());
        } else {
            jVar = new j(this.f8175y.getHolder());
        }
        B(jVar);
    }

    @TargetApi(14)
    private TextureView.SurfaceTextureListener D() {
        return new TextureView$SurfaceTextureListenerC0116a();
    }

    private int getDisplayRotation() {
        return this.f8160d.getDefaultDisplay().getRotation();
    }

    private void j() {
        q qVar;
        m mVar;
        q qVar2 = this.f8157b4;
        if (qVar2 == null || (qVar = this.f8159c4) == null || (mVar = this.Z3) == null) {
            this.f8164g4 = null;
            this.f8163f4 = null;
            this.f8161d4 = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i10 = qVar.f17644c;
        int i11 = qVar.f17645d;
        int i12 = qVar2.f17644c;
        int i13 = qVar2.f17645d;
        Rect d10 = mVar.d(qVar);
        if (d10.width() <= 0 || d10.height() <= 0) {
            return;
        }
        this.f8161d4 = d10;
        this.f8163f4 = k(new Rect(0, 0, i12, i13), this.f8161d4);
        Rect rect = new Rect(this.f8163f4);
        Rect rect2 = this.f8161d4;
        rect.offset(-rect2.left, -rect2.top);
        Rect rect3 = new Rect((rect.left * i10) / this.f8161d4.width(), (rect.top * i11) / this.f8161d4.height(), (rect.right * i10) / this.f8161d4.width(), (rect.bottom * i11) / this.f8161d4.height());
        this.f8164g4 = rect3;
        if (rect3.width() > 0 && this.f8164g4.height() > 0) {
            this.f8172o4.a();
            return;
        }
        this.f8164g4 = null;
        this.f8163f4 = null;
        Log.w(f8155p4, "Preview frame is too small");
    }

    private void m(q qVar) {
        this.f8157b4 = qVar;
        g gVar = this.f8158c;
        if (gVar == null || gVar.n() != null) {
            return;
        }
        m mVar = new m(getDisplayRotation(), qVar);
        this.Z3 = mVar;
        mVar.e(getPreviewScalingStrategy());
        this.f8158c.x(this.Z3);
        this.f8158c.m();
        boolean z10 = this.f8168k4;
        if (!z10) {
            return;
        }
        this.f8158c.A(z10);
    }

    private void o() {
        if (this.f8158c != null) {
            Log.w(f8155p4, "initCamera called twice");
            return;
        }
        g n10 = n();
        this.f8158c = n10;
        n10.y(this.f8173q);
        this.f8158c.u();
        this.X3 = getDisplayRotation();
    }

    private void p(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        q(attributeSet);
        this.f8160d = (WindowManager) context.getSystemService("window");
        this.f8173q = new Handler(this.f8170m4);
        this.W3 = new p();
    }

    public void w(q qVar) {
        this.f8159c4 = qVar;
        if (this.f8157b4 != null) {
            j();
            requestLayout();
            C();
        }
    }

    public void z() {
        if (!r() || getDisplayRotation() == this.X3) {
            return;
        }
        u();
        y();
    }

    public g getCameraInstance() {
        return this.f8158c;
    }

    public i getCameraSettings() {
        return this.f8156a4;
    }

    public Rect getFramingRect() {
        return this.f8163f4;
    }

    public q getFramingRectSize() {
        return this.f8165h4;
    }

    public double getMarginFraction() {
        return this.f8166i4;
    }

    public Rect getPreviewFramingRect() {
        return this.f8164g4;
    }

    public p7.q getPreviewScalingStrategy() {
        p7.q qVar = this.f8167j4;
        return qVar != null ? qVar : this.U3 != null ? new l() : new n();
    }

    public q getPreviewSize() {
        return this.f8159c4;
    }

    public void i(f fVar) {
        this.Y3.add(fVar);
    }

    protected Rect k(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.f8165h4 != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.f8165h4.f17644c) / 2), Math.max(0, (rect3.height() - this.f8165h4.f17645d) / 2));
            return rect3;
        }
        int min = (int) Math.min(rect3.width() * this.f8166i4, rect3.height() * this.f8166i4);
        rect3.inset(min, min);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    protected Matrix l(q qVar, q qVar2) {
        float f10;
        float f11 = qVar.f17644c / qVar.f17645d;
        float f12 = qVar2.f17644c / qVar2.f17645d;
        float f13 = 1.0f;
        if (f11 < f12) {
            float f14 = f12 / f11;
            f10 = 1.0f;
            f13 = f14;
        } else {
            f10 = f11 / f12;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f13, f10);
        int i10 = qVar.f17644c;
        int i11 = qVar.f17645d;
        matrix.postTranslate((i10 - (i10 * f13)) / 2.0f, (i11 - (i11 * f10)) / 2.0f);
        return matrix;
    }

    protected g n() {
        g gVar = new g(getContext());
        gVar.w(this.f8156a4);
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        A();
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        m(new q(i12 - i10, i13 - i11));
        SurfaceView surfaceView = this.f8175y;
        if (surfaceView == null) {
            TextureView textureView = this.U3;
            if (textureView == null) {
                return;
            }
            textureView.layout(0, 0, getWidth(), getHeight());
            return;
        }
        Rect rect = this.f8161d4;
        if (rect == null) {
            surfaceView.layout(0, 0, getWidth(), getHeight());
        } else {
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.f8168k4);
        return bundle;
    }

    public void q(AttributeSet attributeSet) {
        p7.q oVar;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m6.o.f16378i);
        int dimension = (int) obtainStyledAttributes.getDimension(m6.o.f16380k, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(m6.o.f16379j, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f8165h4 = new q(dimension, dimension2);
        }
        this.f8174x = obtainStyledAttributes.getBoolean(m6.o.f16382m, true);
        int integer = obtainStyledAttributes.getInteger(m6.o.f16381l, -1);
        if (integer == 1) {
            oVar = new l();
        } else if (integer != 2) {
            if (integer == 3) {
                oVar = new p7.o();
            }
            obtainStyledAttributes.recycle();
        } else {
            oVar = new n();
        }
        this.f8167j4 = oVar;
        obtainStyledAttributes.recycle();
    }

    protected boolean r() {
        return this.f8158c != null;
    }

    public boolean s() {
        g gVar = this.f8158c;
        return gVar == null || gVar.p();
    }

    public void setCameraSettings(i iVar) {
        this.f8156a4 = iVar;
    }

    public void setFramingRectSize(q qVar) {
        this.f8165h4 = qVar;
    }

    public void setMarginFraction(double d10) {
        if (d10 < 0.5d) {
            this.f8166i4 = d10;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public void setPreviewScalingStrategy(p7.q qVar) {
        this.f8167j4 = qVar;
    }

    public void setTorch(boolean z10) {
        this.f8168k4 = z10;
        g gVar = this.f8158c;
        if (gVar != null) {
            gVar.A(z10);
        }
    }

    public void setUseTextureView(boolean z10) {
        this.f8174x = z10;
    }

    public boolean t() {
        return this.V3;
    }

    public void u() {
        TextureView textureView;
        SurfaceView surfaceView;
        s.a();
        Log.d(f8155p4, "pause()");
        this.X3 = -1;
        g gVar = this.f8158c;
        if (gVar != null) {
            gVar.l();
            this.f8158c = null;
            this.V3 = false;
        } else {
            this.f8173q.sendEmptyMessage(k.c_res_0x7f0902ca);
        }
        if (this.f8162e4 == null && (surfaceView = this.f8175y) != null) {
            surfaceView.getHolder().removeCallback(this.f8169l4);
        }
        if (this.f8162e4 == null && (textureView = this.U3) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f8157b4 = null;
        this.f8159c4 = null;
        this.f8164g4 = null;
        this.W3.f();
        this.f8172o4.d();
    }

    public void v() {
        g cameraInstance = getCameraInstance();
        u();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.p() && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public void x() {
    }

    public void y() {
        s.a();
        Log.d(f8155p4, "resume()");
        o();
        if (this.f8162e4 != null) {
            C();
        } else {
            SurfaceView surfaceView = this.f8175y;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f8169l4);
            } else {
                TextureView textureView = this.U3;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        D().onSurfaceTextureAvailable(this.U3.getSurfaceTexture(), this.U3.getWidth(), this.U3.getHeight());
                    } else {
                        this.U3.setSurfaceTextureListener(D());
                    }
                }
            }
        }
        requestLayout();
        this.W3.e(getContext(), this.f8171n4);
    }
}
