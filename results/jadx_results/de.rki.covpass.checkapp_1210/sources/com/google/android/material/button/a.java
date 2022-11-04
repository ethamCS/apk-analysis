package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.view.y;
import b5.b;
import b5.l;
import com.google.android.material.internal.o;
import q5.c;
import t5.g;
import t5.k;
import t5.n;
/* loaded from: classes.dex */
public class a {

    /* renamed from: t */
    private static final boolean f6988t = true;

    /* renamed from: u */
    private static final boolean f6989u = false;

    /* renamed from: a */
    private final MaterialButton f6990a;

    /* renamed from: b */
    private k f6991b;

    /* renamed from: c */
    private int f6992c;

    /* renamed from: d */
    private int f6993d;

    /* renamed from: e */
    private int f6994e;

    /* renamed from: f */
    private int f6995f;

    /* renamed from: g */
    private int f6996g;

    /* renamed from: h */
    private int f6997h;

    /* renamed from: i */
    private PorterDuff.Mode f6998i;

    /* renamed from: j */
    private ColorStateList f6999j;

    /* renamed from: k */
    private ColorStateList f7000k;

    /* renamed from: l */
    private ColorStateList f7001l;

    /* renamed from: m */
    private Drawable f7002m;

    /* renamed from: n */
    private boolean f7003n = false;

    /* renamed from: o */
    private boolean f7004o = false;

    /* renamed from: p */
    private boolean f7005p = false;

    /* renamed from: q */
    private boolean f7006q;

    /* renamed from: r */
    private LayerDrawable f7007r;

    /* renamed from: s */
    private int f7008s;

    public a(MaterialButton materialButton, k kVar) {
        this.f6990a = materialButton;
        this.f6991b = kVar;
    }

    private void E(int i10, int i11) {
        int G = y.G(this.f6990a);
        int paddingTop = this.f6990a.getPaddingTop();
        int F = y.F(this.f6990a);
        int paddingBottom = this.f6990a.getPaddingBottom();
        int i12 = this.f6994e;
        int i13 = this.f6995f;
        this.f6995f = i11;
        this.f6994e = i10;
        if (!this.f7004o) {
            F();
        }
        y.B0(this.f6990a, G, (paddingTop + i10) - i12, F, (paddingBottom + i11) - i13);
    }

    private void F() {
        this.f6990a.setInternalBackground(a());
        g f10 = f();
        if (f10 != null) {
            f10.Y(this.f7008s);
        }
    }

    private void G(k kVar) {
        if (f6989u && !this.f7004o) {
            int G = y.G(this.f6990a);
            int paddingTop = this.f6990a.getPaddingTop();
            int F = y.F(this.f6990a);
            int paddingBottom = this.f6990a.getPaddingBottom();
            F();
            y.B0(this.f6990a, G, paddingTop, F, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() == null) {
            return;
        }
        e().setShapeAppearanceModel(kVar);
    }

    private void H() {
        g f10 = f();
        g n10 = n();
        if (f10 != null) {
            f10.g0(this.f6997h, this.f7000k);
            if (n10 == null) {
                return;
            }
            n10.f0(this.f6997h, this.f7003n ? i5.a.d(this.f6990a, b.m_res_0x7f0300fb) : 0);
        }
    }

    private InsetDrawable I(Drawable drawable) {
        return new InsetDrawable(drawable, this.f6992c, this.f6994e, this.f6993d, this.f6995f);
    }

    private Drawable a() {
        g gVar = new g(this.f6991b);
        gVar.O(this.f6990a.getContext());
        androidx.core.graphics.drawable.a.o(gVar, this.f6999j);
        PorterDuff.Mode mode = this.f6998i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(gVar, mode);
        }
        gVar.g0(this.f6997h, this.f7000k);
        g gVar2 = new g(this.f6991b);
        gVar2.setTint(0);
        gVar2.f0(this.f6997h, this.f7003n ? i5.a.d(this.f6990a, b.m_res_0x7f0300fb) : 0);
        if (f6988t) {
            g gVar3 = new g(this.f6991b);
            this.f7002m = gVar3;
            androidx.core.graphics.drawable.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(r5.b.d(this.f7001l), I(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f7002m);
            this.f7007r = rippleDrawable;
            return rippleDrawable;
        }
        r5.a aVar = new r5.a(this.f6991b);
        this.f7002m = aVar;
        androidx.core.graphics.drawable.a.o(aVar, r5.b.d(this.f7001l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f7002m});
        this.f7007r = layerDrawable;
        return I(layerDrawable);
    }

    private g g(boolean z10) {
        LayerDrawable layerDrawable = this.f7007r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) (f6988t ? (LayerDrawable) ((InsetDrawable) this.f7007r.getDrawable(0)).getDrawable() : this.f7007r).getDrawable(!z10 ? 1 : 0);
    }

    private g n() {
        return g(true);
    }

    public void A(ColorStateList colorStateList) {
        if (this.f7000k != colorStateList) {
            this.f7000k = colorStateList;
            H();
        }
    }

    public void B(int i10) {
        if (this.f6997h != i10) {
            this.f6997h = i10;
            H();
        }
    }

    public void C(ColorStateList colorStateList) {
        if (this.f6999j != colorStateList) {
            this.f6999j = colorStateList;
            if (f() == null) {
                return;
            }
            androidx.core.graphics.drawable.a.o(f(), this.f6999j);
        }
    }

    public void D(PorterDuff.Mode mode) {
        if (this.f6998i != mode) {
            this.f6998i = mode;
            if (f() == null || this.f6998i == null) {
                return;
            }
            androidx.core.graphics.drawable.a.p(f(), this.f6998i);
        }
    }

    public int b() {
        return this.f6996g;
    }

    public int c() {
        return this.f6995f;
    }

    public int d() {
        return this.f6994e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f7007r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (n) (this.f7007r.getNumberOfLayers() > 2 ? this.f7007r.getDrawable(2) : this.f7007r.getDrawable(1));
    }

    public g f() {
        return g(false);
    }

    public ColorStateList h() {
        return this.f7001l;
    }

    public k i() {
        return this.f6991b;
    }

    public ColorStateList j() {
        return this.f7000k;
    }

    public int k() {
        return this.f6997h;
    }

    public ColorStateList l() {
        return this.f6999j;
    }

    public PorterDuff.Mode m() {
        return this.f6998i;
    }

    public boolean o() {
        return this.f7004o;
    }

    public boolean p() {
        return this.f7006q;
    }

    public void q(TypedArray typedArray) {
        this.f6992c = typedArray.getDimensionPixelOffset(l.f5691u2, 0);
        this.f6993d = typedArray.getDimensionPixelOffset(l.f5700v2, 0);
        this.f6994e = typedArray.getDimensionPixelOffset(l.f5709w2, 0);
        this.f6995f = typedArray.getDimensionPixelOffset(l.f5718x2, 0);
        int i10 = l.B2;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f6996g = dimensionPixelSize;
            y(this.f6991b.w(dimensionPixelSize));
            this.f7005p = true;
        }
        this.f6997h = typedArray.getDimensionPixelSize(l.L2, 0);
        this.f6998i = o.f(typedArray.getInt(l.A2, -1), PorterDuff.Mode.SRC_IN);
        this.f6999j = c.a(this.f6990a.getContext(), typedArray, l.f5734z2);
        this.f7000k = c.a(this.f6990a.getContext(), typedArray, l.K2);
        this.f7001l = c.a(this.f6990a.getContext(), typedArray, l.J2);
        this.f7006q = typedArray.getBoolean(l.f5726y2, false);
        this.f7008s = typedArray.getDimensionPixelSize(l.C2, 0);
        int G = y.G(this.f6990a);
        int paddingTop = this.f6990a.getPaddingTop();
        int F = y.F(this.f6990a);
        int paddingBottom = this.f6990a.getPaddingBottom();
        if (typedArray.hasValue(l.f5682t2)) {
            s();
        } else {
            F();
        }
        y.B0(this.f6990a, G + this.f6992c, paddingTop + this.f6994e, F + this.f6993d, paddingBottom + this.f6995f);
    }

    public void r(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    public void s() {
        this.f7004o = true;
        this.f6990a.setSupportBackgroundTintList(this.f6999j);
        this.f6990a.setSupportBackgroundTintMode(this.f6998i);
    }

    public void t(boolean z10) {
        this.f7006q = z10;
    }

    public void u(int i10) {
        if (!this.f7005p || this.f6996g != i10) {
            this.f6996g = i10;
            this.f7005p = true;
            y(this.f6991b.w(i10));
        }
    }

    public void v(int i10) {
        E(this.f6994e, i10);
    }

    public void w(int i10) {
        E(i10, this.f6995f);
    }

    public void x(ColorStateList colorStateList) {
        if (this.f7001l != colorStateList) {
            this.f7001l = colorStateList;
            boolean z10 = f6988t;
            if (z10 && (this.f6990a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f6990a.getBackground()).setColor(r5.b.d(colorStateList));
            } else if (z10 || !(this.f6990a.getBackground() instanceof r5.a)) {
            } else {
                ((r5.a) this.f6990a.getBackground()).setTintList(r5.b.d(colorStateList));
            }
        }
    }

    public void y(k kVar) {
        this.f6991b = kVar;
        G(kVar);
    }

    public void z(boolean z10) {
        this.f7003n = z10;
        H();
    }
}
