package com.airbnb.lottie;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import e4.a0;
import e4.c0;
import e4.q;
import e4.u;
import e4.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o4.v;
/* loaded from: classes.dex */
public class n extends Drawable implements Drawable.Callback, Animatable {
    private final ValueAnimator.AnimatorUpdateListener W3;
    private i4.b X3;
    private String Y3;
    private e4.b Z3;

    /* renamed from: a4 */
    private i4.a f6694a4;

    /* renamed from: b4 */
    private boolean f6695b4;

    /* renamed from: c */
    private e4.h f6696c;

    /* renamed from: d */
    private final q4.e f6698d;

    /* renamed from: e4 */
    private m4.c f6700e4;

    /* renamed from: g4 */
    private boolean f6702g4;

    /* renamed from: h4 */
    private boolean f6703h4;

    /* renamed from: i4 */
    private boolean f6704i4;

    /* renamed from: m4 */
    private Bitmap f6708m4;

    /* renamed from: n4 */
    private Canvas f6709n4;

    /* renamed from: o4 */
    private Rect f6710o4;

    /* renamed from: p4 */
    private RectF f6711p4;

    /* renamed from: q4 */
    private Paint f6713q4;

    /* renamed from: r4 */
    private Rect f6714r4;

    /* renamed from: s4 */
    private Rect f6715s4;

    /* renamed from: t4 */
    private RectF f6716t4;

    /* renamed from: u4 */
    private RectF f6717u4;

    /* renamed from: v4 */
    private Matrix f6718v4;

    /* renamed from: w4 */
    private Matrix f6719w4;

    /* renamed from: q */
    private boolean f6712q = true;

    /* renamed from: x */
    private boolean f6720x = false;

    /* renamed from: y */
    private boolean f6722y = false;
    private c U3 = c.NONE;
    private final ArrayList<b> V3 = new ArrayList<>();

    /* renamed from: c4 */
    private boolean f6697c4 = false;

    /* renamed from: d4 */
    private boolean f6699d4 = true;

    /* renamed from: f4 */
    private int f6701f4 = 255;

    /* renamed from: j4 */
    private a0 f6705j4 = a0.AUTOMATIC;

    /* renamed from: k4 */
    private boolean f6706k4 = false;

    /* renamed from: l4 */
    private final Matrix f6707l4 = new Matrix();

    /* renamed from: x4 */
    private boolean f6721x4 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
            n.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (n.this.f6700e4 != null) {
                n.this.f6700e4.M(n.this.f6698d.i());
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(e4.h hVar);
    }

    /* loaded from: classes.dex */
    public enum c {
        NONE,
        PLAY,
        RESUME
    }

    public n() {
        q4.e eVar = new q4.e();
        this.f6698d = eVar;
        a aVar = new a();
        this.W3 = aVar;
        eVar.addUpdateListener(aVar);
    }

    private void A(int i10, int i11) {
        Bitmap bitmap;
        Bitmap bitmap2 = this.f6708m4;
        if (bitmap2 == null || bitmap2.getWidth() < i10 || this.f6708m4.getHeight() < i11) {
            bitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        } else if (this.f6708m4.getWidth() <= i10 && this.f6708m4.getHeight() <= i11) {
            return;
        } else {
            bitmap = Bitmap.createBitmap(this.f6708m4, 0, 0, i10, i11);
        }
        this.f6708m4 = bitmap;
        this.f6709n4.setBitmap(bitmap);
        this.f6721x4 = true;
    }

    private void B() {
        if (this.f6709n4 != null) {
            return;
        }
        this.f6709n4 = new Canvas();
        this.f6717u4 = new RectF();
        this.f6718v4 = new Matrix();
        this.f6719w4 = new Matrix();
        this.f6710o4 = new Rect();
        this.f6711p4 = new RectF();
        this.f6713q4 = new f4.a();
        this.f6714r4 = new Rect();
        this.f6715s4 = new Rect();
        this.f6716t4 = new RectF();
    }

    private Context F() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private i4.a G() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f6694a4 == null) {
            this.f6694a4 = new i4.a(getCallback(), null);
        }
        return this.f6694a4;
    }

    private i4.b I() {
        if (getCallback() == null) {
            return null;
        }
        i4.b bVar = this.X3;
        if (bVar != null && !bVar.b(F())) {
            this.X3 = null;
        }
        if (this.X3 == null) {
            this.X3 = new i4.b(getCallback(), this.Y3, this.Z3, this.f6696c.j());
        }
        return this.X3;
    }

    private boolean W() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (!(parent instanceof ViewGroup)) {
            return false;
        }
        return !((ViewGroup) parent).getClipChildren();
    }

    public /* synthetic */ void a0(j4.e eVar, Object obj, r4.c cVar, e4.h hVar) {
        p(eVar, obj, cVar);
    }

    public /* synthetic */ void b0(e4.h hVar) {
        o0();
    }

    public /* synthetic */ void c0(e4.h hVar) {
        r0();
    }

    public /* synthetic */ void d0(int i10, e4.h hVar) {
        x0(i10);
    }

    public /* synthetic */ void e0(int i10, e4.h hVar) {
        C0(i10);
    }

    public /* synthetic */ void f0(String str, e4.h hVar) {
        D0(str);
    }

    public /* synthetic */ void g0(float f10, e4.h hVar) {
        E0(f10);
    }

    public /* synthetic */ void h0(int i10, int i11, e4.h hVar) {
        F0(i10, i11);
    }

    public /* synthetic */ void i0(String str, e4.h hVar) {
        G0(str);
    }

    public /* synthetic */ void j0(int i10, e4.h hVar) {
        H0(i10);
    }

    public /* synthetic */ void k0(String str, e4.h hVar) {
        I0(str);
    }

    public /* synthetic */ void l0(float f10, e4.h hVar) {
        J0(f10);
    }

    public /* synthetic */ void m0(float f10, e4.h hVar) {
        M0(f10);
    }

    private void p0(Canvas canvas, m4.c cVar) {
        if (this.f6696c == null || cVar == null) {
            return;
        }
        B();
        canvas.getMatrix(this.f6718v4);
        canvas.getClipBounds(this.f6710o4);
        u(this.f6710o4, this.f6711p4);
        this.f6718v4.mapRect(this.f6711p4);
        v(this.f6711p4, this.f6710o4);
        if (this.f6699d4) {
            this.f6717u4.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.a(this.f6717u4, null, false);
        }
        this.f6718v4.mapRect(this.f6717u4);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        s0(this.f6717u4, width, height);
        if (!W()) {
            RectF rectF = this.f6717u4;
            Rect rect = this.f6710o4;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int ceil = (int) Math.ceil(this.f6717u4.width());
        int ceil2 = (int) Math.ceil(this.f6717u4.height());
        if (ceil == 0 || ceil2 == 0) {
            return;
        }
        A(ceil, ceil2);
        if (this.f6721x4) {
            this.f6707l4.set(this.f6718v4);
            this.f6707l4.preScale(width, height);
            Matrix matrix = this.f6707l4;
            RectF rectF2 = this.f6717u4;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f6708m4.eraseColor(0);
            cVar.g(this.f6709n4, this.f6707l4, this.f6701f4);
            this.f6718v4.invert(this.f6719w4);
            this.f6719w4.mapRect(this.f6716t4, this.f6717u4);
            v(this.f6716t4, this.f6715s4);
        }
        this.f6714r4.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.f6708m4, this.f6714r4, this.f6715s4, this.f6713q4);
    }

    private boolean q() {
        return this.f6712q || this.f6720x;
    }

    private void r() {
        e4.h hVar = this.f6696c;
        if (hVar == null) {
            return;
        }
        m4.c cVar = new m4.c(this, v.a(hVar), hVar.k(), hVar);
        this.f6700e4 = cVar;
        if (this.f6703h4) {
            cVar.K(true);
        }
        this.f6700e4.P(this.f6699d4);
    }

    private void s0(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }

    private void t() {
        e4.h hVar = this.f6696c;
        if (hVar == null) {
            return;
        }
        this.f6706k4 = this.f6705j4.b(Build.VERSION.SDK_INT, hVar.q(), hVar.m());
    }

    private void u(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void v(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void w(Canvas canvas) {
        m4.c cVar = this.f6700e4;
        e4.h hVar = this.f6696c;
        if (cVar == null || hVar == null) {
            return;
        }
        this.f6707l4.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float height = bounds.height() / hVar.b().height();
            this.f6707l4.preScale(bounds.width() / hVar.b().width(), height);
        }
        cVar.g(canvas, this.f6707l4, this.f6701f4);
    }

    public void A0(String str) {
        this.Y3 = str;
    }

    public void B0(boolean z10) {
        this.f6697c4 = z10;
    }

    public Bitmap C(String str) {
        i4.b I = I();
        if (I != null) {
            return I.a(str);
        }
        return null;
    }

    public void C0(final int i10) {
        if (this.f6696c == null) {
            this.V3.add(new b() { // from class: com.airbnb.lottie.k
                @Override // com.airbnb.lottie.n.b
                public final void a(e4.h hVar) {
                    n.this.e0(i10, hVar);
                }
            });
        } else {
            this.f6698d.D(i10 + 0.99f);
        }
    }

    public boolean D() {
        return this.f6699d4;
    }

    public void D0(final String str) {
        e4.h hVar = this.f6696c;
        if (hVar == null) {
            this.V3.add(new b() { // from class: com.airbnb.lottie.c
                @Override // com.airbnb.lottie.n.b
                public final void a(e4.h hVar2) {
                    n.this.f0(str, hVar2);
                }
            });
            return;
        }
        j4.h l10 = hVar.l(str);
        if (l10 != null) {
            C0((int) (l10.f14008b + l10.f14009c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public e4.h E() {
        return this.f6696c;
    }

    public void E0(final float f10) {
        e4.h hVar = this.f6696c;
        if (hVar == null) {
            this.V3.add(new b() { // from class: com.airbnb.lottie.f
                @Override // com.airbnb.lottie.n.b
                public final void a(e4.h hVar2) {
                    n.this.g0(f10, hVar2);
                }
            });
        } else {
            this.f6698d.D(q4.g.i(hVar.p(), this.f6696c.f(), f10));
        }
    }

    public void F0(final int i10, final int i11) {
        if (this.f6696c == null) {
            this.V3.add(new b() { // from class: com.airbnb.lottie.l
                @Override // com.airbnb.lottie.n.b
                public final void a(e4.h hVar) {
                    n.this.h0(i10, i11, hVar);
                }
            });
        } else {
            this.f6698d.E(i10, i11 + 0.99f);
        }
    }

    public void G0(final String str) {
        e4.h hVar = this.f6696c;
        if (hVar == null) {
            this.V3.add(new b() { // from class: com.airbnb.lottie.d
                @Override // com.airbnb.lottie.n.b
                public final void a(e4.h hVar2) {
                    n.this.i0(str, hVar2);
                }
            });
            return;
        }
        j4.h l10 = hVar.l(str);
        if (l10 != null) {
            int i10 = (int) l10.f14008b;
            F0(i10, ((int) l10.f14009c) + i10);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public int H() {
        return (int) this.f6698d.j();
    }

    public void H0(final int i10) {
        if (this.f6696c == null) {
            this.V3.add(new b() { // from class: com.airbnb.lottie.i
                @Override // com.airbnb.lottie.n.b
                public final void a(e4.h hVar) {
                    n.this.j0(i10, hVar);
                }
            });
        } else {
            this.f6698d.F(i10);
        }
    }

    public void I0(final String str) {
        e4.h hVar = this.f6696c;
        if (hVar == null) {
            this.V3.add(new b() { // from class: com.airbnb.lottie.b
                @Override // com.airbnb.lottie.n.b
                public final void a(e4.h hVar2) {
                    n.this.k0(str, hVar2);
                }
            });
            return;
        }
        j4.h l10 = hVar.l(str);
        if (l10 != null) {
            H0((int) l10.f14008b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public String J() {
        return this.Y3;
    }

    public void J0(final float f10) {
        e4.h hVar = this.f6696c;
        if (hVar == null) {
            this.V3.add(new b() { // from class: com.airbnb.lottie.g
                @Override // com.airbnb.lottie.n.b
                public final void a(e4.h hVar2) {
                    n.this.l0(f10, hVar2);
                }
            });
        } else {
            H0((int) q4.g.i(hVar.p(), this.f6696c.f(), f10));
        }
    }

    public q K(String str) {
        e4.h hVar = this.f6696c;
        if (hVar == null) {
            return null;
        }
        return hVar.j().get(str);
    }

    public void K0(boolean z10) {
        if (this.f6703h4 == z10) {
            return;
        }
        this.f6703h4 = z10;
        m4.c cVar = this.f6700e4;
        if (cVar == null) {
            return;
        }
        cVar.K(z10);
    }

    public boolean L() {
        return this.f6697c4;
    }

    public void L0(boolean z10) {
        this.f6702g4 = z10;
        e4.h hVar = this.f6696c;
        if (hVar != null) {
            hVar.v(z10);
        }
    }

    public float M() {
        return this.f6698d.l();
    }

    public void M0(final float f10) {
        if (this.f6696c == null) {
            this.V3.add(new b() { // from class: com.airbnb.lottie.h
                @Override // com.airbnb.lottie.n.b
                public final void a(e4.h hVar) {
                    n.this.m0(f10, hVar);
                }
            });
            return;
        }
        e4.c.a("Drawable#setProgress");
        this.f6698d.C(this.f6696c.h(f10));
        e4.c.b("Drawable#setProgress");
    }

    public float N() {
        return this.f6698d.m();
    }

    public void N0(a0 a0Var) {
        this.f6705j4 = a0Var;
        t();
    }

    public x O() {
        e4.h hVar = this.f6696c;
        if (hVar != null) {
            return hVar.n();
        }
        return null;
    }

    public void O0(int i10) {
        this.f6698d.setRepeatCount(i10);
    }

    public float P() {
        return this.f6698d.i();
    }

    public void P0(int i10) {
        this.f6698d.setRepeatMode(i10);
    }

    public a0 Q() {
        return this.f6706k4 ? a0.SOFTWARE : a0.HARDWARE;
    }

    public void Q0(boolean z10) {
        this.f6722y = z10;
    }

    public int R() {
        return this.f6698d.getRepeatCount();
    }

    public void R0(float f10) {
        this.f6698d.H(f10);
    }

    @SuppressLint({"WrongConstant"})
    public int S() {
        return this.f6698d.getRepeatMode();
    }

    public void S0(Boolean bool) {
        this.f6712q = bool.booleanValue();
    }

    public float T() {
        return this.f6698d.o();
    }

    public void T0(c0 c0Var) {
    }

    public c0 U() {
        return null;
    }

    public boolean U0() {
        return this.f6696c.c().k() > 0;
    }

    public Typeface V(String str, String str2) {
        i4.a G = G();
        if (G != null) {
            return G.b(str, str2);
        }
        return null;
    }

    public boolean X() {
        q4.e eVar = this.f6698d;
        if (eVar == null) {
            return false;
        }
        return eVar.isRunning();
    }

    public boolean Y() {
        if (isVisible()) {
            return this.f6698d.isRunning();
        }
        c cVar = this.U3;
        return cVar == c.PLAY || cVar == c.RESUME;
    }

    public boolean Z() {
        return this.f6704i4;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        e4.c.a("Drawable#draw");
        if (this.f6722y) {
            try {
                if (this.f6706k4) {
                    p0(canvas, this.f6700e4);
                } else {
                    w(canvas);
                }
            } catch (Throwable th2) {
                q4.d.b("Lottie crashed in draw!", th2);
            }
        } else if (this.f6706k4) {
            p0(canvas, this.f6700e4);
        } else {
            w(canvas);
        }
        this.f6721x4 = false;
        e4.c.b("Drawable#draw");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6701f4;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        e4.h hVar = this.f6696c;
        if (hVar == null) {
            return -1;
        }
        return hVar.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        e4.h hVar = this.f6696c;
        if (hVar == null) {
            return -1;
        }
        return hVar.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f6721x4) {
            return;
        }
        this.f6721x4 = true;
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return X();
    }

    public void n0() {
        this.V3.clear();
        this.f6698d.q();
        if (!isVisible()) {
            this.U3 = c.NONE;
        }
    }

    public void o0() {
        c cVar;
        if (this.f6700e4 == null) {
            this.V3.add(new b() { // from class: com.airbnb.lottie.e
                @Override // com.airbnb.lottie.n.b
                public final void a(e4.h hVar) {
                    n.this.b0(hVar);
                }
            });
            return;
        }
        t();
        if (q() || R() == 0) {
            if (isVisible()) {
                this.f6698d.t();
                cVar = c.NONE;
            } else {
                cVar = c.PLAY;
            }
            this.U3 = cVar;
        }
        if (q()) {
            return;
        }
        x0((int) (T() < 0.0f ? N() : M()));
        this.f6698d.h();
        if (isVisible()) {
            return;
        }
        this.U3 = c.NONE;
    }

    public <T> void p(final j4.e eVar, final T t10, final r4.c<T> cVar) {
        m4.c cVar2 = this.f6700e4;
        if (cVar2 == null) {
            this.V3.add(new b() { // from class: com.airbnb.lottie.m
                @Override // com.airbnb.lottie.n.b
                public final void a(e4.h hVar) {
                    n.this.a0(eVar, t10, cVar, hVar);
                }
            });
            return;
        }
        boolean z10 = true;
        if (eVar == j4.e.f14002c) {
            cVar2.e(t10, cVar);
        } else if (eVar.d() != null) {
            eVar.d().e(t10, cVar);
        } else {
            List<j4.e> q02 = q0(eVar);
            for (int i10 = 0; i10 < q02.size(); i10++) {
                q02.get(i10).d().e(t10, cVar);
            }
            z10 = true ^ q02.isEmpty();
        }
        if (!z10) {
            return;
        }
        invalidateSelf();
        if (t10 != u.E) {
            return;
        }
        M0(P());
    }

    public List<j4.e> q0(j4.e eVar) {
        if (this.f6700e4 == null) {
            q4.d.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f6700e4.h(eVar, 0, arrayList, new j4.e(new String[0]));
        return arrayList;
    }

    public void r0() {
        c cVar;
        if (this.f6700e4 == null) {
            this.V3.add(new b() { // from class: com.airbnb.lottie.a
                @Override // com.airbnb.lottie.n.b
                public final void a(e4.h hVar) {
                    n.this.c0(hVar);
                }
            });
            return;
        }
        t();
        if (q() || R() == 0) {
            if (isVisible()) {
                this.f6698d.y();
                cVar = c.NONE;
            } else {
                cVar = c.RESUME;
            }
            this.U3 = cVar;
        }
        if (q()) {
            return;
        }
        x0((int) (T() < 0.0f ? N() : M()));
        this.f6698d.h();
        if (isVisible()) {
            return;
        }
        this.U3 = c.NONE;
    }

    public void s() {
        if (this.f6698d.isRunning()) {
            this.f6698d.cancel();
            if (!isVisible()) {
                this.U3 = c.NONE;
            }
        }
        this.f6696c = null;
        this.f6700e4 = null;
        this.X3 = null;
        this.f6698d.g();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f6701f4 = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        q4.d.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        c cVar;
        boolean z12 = !isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            c cVar2 = this.U3;
            if (cVar2 == c.PLAY) {
                o0();
            } else if (cVar2 == c.RESUME) {
                r0();
            }
        } else {
            if (this.f6698d.isRunning()) {
                n0();
                cVar = c.RESUME;
            } else if (!z12) {
                cVar = c.NONE;
            }
            this.U3 = cVar;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || !((View) callback).isInEditMode()) {
            o0();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        z();
    }

    public void t0(boolean z10) {
        this.f6704i4 = z10;
    }

    public void u0(boolean z10) {
        if (z10 != this.f6699d4) {
            this.f6699d4 = z10;
            m4.c cVar = this.f6700e4;
            if (cVar != null) {
                cVar.P(z10);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public boolean v0(e4.h hVar) {
        if (this.f6696c == hVar) {
            return false;
        }
        this.f6721x4 = true;
        s();
        this.f6696c = hVar;
        r();
        this.f6698d.B(hVar);
        M0(this.f6698d.getAnimatedFraction());
        Iterator it = new ArrayList(this.V3).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                bVar.a(hVar);
            }
            it.remove();
        }
        this.V3.clear();
        hVar.v(this.f6702g4);
        t();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void w0(e4.a aVar) {
        i4.a aVar2 = this.f6694a4;
        if (aVar2 != null) {
            aVar2.c(aVar);
        }
    }

    public void x(boolean z10) {
        if (this.f6695b4 == z10) {
            return;
        }
        this.f6695b4 = z10;
        if (this.f6696c == null) {
            return;
        }
        r();
    }

    public void x0(final int i10) {
        if (this.f6696c == null) {
            this.V3.add(new b() { // from class: com.airbnb.lottie.j
                @Override // com.airbnb.lottie.n.b
                public final void a(e4.h hVar) {
                    n.this.d0(i10, hVar);
                }
            });
        } else {
            this.f6698d.C(i10);
        }
    }

    public boolean y() {
        return this.f6695b4;
    }

    public void y0(boolean z10) {
        this.f6720x = z10;
    }

    public void z() {
        this.V3.clear();
        this.f6698d.h();
        if (!isVisible()) {
            this.U3 = c.NONE;
        }
    }

    public void z0(e4.b bVar) {
        this.Z3 = bVar;
        i4.b bVar2 = this.X3;
        if (bVar2 != null) {
            bVar2.d(bVar);
        }
    }
}
