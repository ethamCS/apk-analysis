package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import b.g.l.t;
import com.google.android.material.internal.p;
import d.a.a.a.a0.g;
import d.a.a.a.a0.k;
import d.a.a.a.a0.n;
import d.a.a.a.b;
import d.a.a.a.x.c;
/* loaded from: classes.dex */
public class a {
    private static final boolean s;

    /* renamed from: a */
    private final MaterialButton f3007a;

    /* renamed from: b */
    private k f3008b;

    /* renamed from: c */
    private int f3009c;

    /* renamed from: d */
    private int f3010d;

    /* renamed from: e */
    private int f3011e;

    /* renamed from: f */
    private int f3012f;

    /* renamed from: g */
    private int f3013g;

    /* renamed from: h */
    private int f3014h;
    private PorterDuff.Mode i;
    private ColorStateList j;
    private ColorStateList k;
    private ColorStateList l;
    private Drawable m;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q;
    private LayerDrawable r;

    static {
        s = Build.VERSION.SDK_INT >= 21;
    }

    public a(MaterialButton materialButton, k kVar) {
        this.f3007a = materialButton;
        this.f3008b = kVar;
    }

    private void A(k kVar) {
        if (d() != null) {
            d().setShapeAppearanceModel(kVar);
        }
        if (l() != null) {
            l().setShapeAppearanceModel(kVar);
        }
        if (c() != null) {
            c().setShapeAppearanceModel(kVar);
        }
    }

    private void C() {
        g d2 = d();
        g l = l();
        if (d2 != null) {
            d2.c0(this.f3014h, this.k);
            if (l == null) {
                return;
            }
            l.b0(this.f3014h, this.n ? d.a.a.a.q.a.c(this.f3007a, b.l_res_0x7f0400c4) : 0);
        }
    }

    private InsetDrawable D(Drawable drawable) {
        return new InsetDrawable(drawable, this.f3009c, this.f3011e, this.f3010d, this.f3012f);
    }

    private Drawable a() {
        g gVar = new g(this.f3008b);
        gVar.M(this.f3007a.getContext());
        androidx.core.graphics.drawable.a.o(gVar, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(gVar, mode);
        }
        gVar.c0(this.f3014h, this.k);
        g gVar2 = new g(this.f3008b);
        gVar2.setTint(0);
        gVar2.b0(this.f3014h, this.n ? d.a.a.a.q.a.c(this.f3007a, b.l_res_0x7f0400c4) : 0);
        if (s) {
            g gVar3 = new g(this.f3008b);
            this.m = gVar3;
            androidx.core.graphics.drawable.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(d.a.a.a.y.b.a(this.l), D(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.m);
            this.r = rippleDrawable;
            return rippleDrawable;
        }
        d.a.a.a.y.a aVar = new d.a.a.a.y.a(this.f3008b);
        this.m = aVar;
        androidx.core.graphics.drawable.a.o(aVar, d.a.a.a.y.b.a(this.l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.m});
        this.r = layerDrawable;
        return D(layerDrawable);
    }

    private g e(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) (s ? (LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable() : this.r).getDrawable(!z ? 1 : 0);
    }

    private g l() {
        return e(true);
    }

    public void B(int i, int i2) {
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setBounds(this.f3009c, this.f3011e, i2 - this.f3010d, i - this.f3012f);
        }
    }

    public int b() {
        return this.f3013g;
    }

    public n c() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (n) (this.r.getNumberOfLayers() > 2 ? this.r.getDrawable(2) : this.r.getDrawable(1));
    }

    public g d() {
        return e(false);
    }

    public ColorStateList f() {
        return this.l;
    }

    public k g() {
        return this.f3008b;
    }

    public ColorStateList h() {
        return this.k;
    }

    public int i() {
        return this.f3014h;
    }

    public ColorStateList j() {
        return this.j;
    }

    public PorterDuff.Mode k() {
        return this.i;
    }

    public boolean m() {
        return this.o;
    }

    public boolean n() {
        return this.q;
    }

    public void o(TypedArray typedArray) {
        this.f3009c = typedArray.getDimensionPixelOffset(d.a.a.a.k.c1, 0);
        this.f3010d = typedArray.getDimensionPixelOffset(d.a.a.a.k.d1, 0);
        this.f3011e = typedArray.getDimensionPixelOffset(d.a.a.a.k.e1, 0);
        this.f3012f = typedArray.getDimensionPixelOffset(d.a.a.a.k.f1, 0);
        int i = d.a.a.a.k.j1;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.f3013g = dimensionPixelSize;
            u(this.f3008b.w(dimensionPixelSize));
            this.p = true;
        }
        this.f3014h = typedArray.getDimensionPixelSize(d.a.a.a.k.t1, 0);
        this.i = p.e(typedArray.getInt(d.a.a.a.k.i1, -1), PorterDuff.Mode.SRC_IN);
        this.j = c.a(this.f3007a.getContext(), typedArray, d.a.a.a.k.h1);
        this.k = c.a(this.f3007a.getContext(), typedArray, d.a.a.a.k.s1);
        this.l = c.a(this.f3007a.getContext(), typedArray, d.a.a.a.k.r1);
        this.q = typedArray.getBoolean(d.a.a.a.k.g1, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(d.a.a.a.k.k1, 0);
        int D = t.D(this.f3007a);
        int paddingTop = this.f3007a.getPaddingTop();
        int C = t.C(this.f3007a);
        int paddingBottom = this.f3007a.getPaddingBottom();
        if (typedArray.hasValue(d.a.a.a.k.b1)) {
            q();
        } else {
            this.f3007a.setInternalBackground(a());
            g d2 = d();
            if (d2 != null) {
                d2.U(dimensionPixelSize2);
            }
        }
        t.u0(this.f3007a, D + this.f3009c, paddingTop + this.f3011e, C + this.f3010d, paddingBottom + this.f3012f);
    }

    public void p(int i) {
        if (d() != null) {
            d().setTint(i);
        }
    }

    public void q() {
        this.o = true;
        this.f3007a.setSupportBackgroundTintList(this.j);
        this.f3007a.setSupportBackgroundTintMode(this.i);
    }

    public void r(boolean z) {
        this.q = z;
    }

    public void s(int i) {
        if (!this.p || this.f3013g != i) {
            this.f3013g = i;
            this.p = true;
            u(this.f3008b.w(i));
        }
    }

    public void t(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            boolean z = s;
            if (z && (this.f3007a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f3007a.getBackground()).setColor(d.a.a.a.y.b.a(colorStateList));
            } else if (z || !(this.f3007a.getBackground() instanceof d.a.a.a.y.a)) {
            } else {
                ((d.a.a.a.y.a) this.f3007a.getBackground()).setTintList(d.a.a.a.y.b.a(colorStateList));
            }
        }
    }

    public void u(k kVar) {
        this.f3008b = kVar;
        A(kVar);
    }

    public void v(boolean z) {
        this.n = z;
        C();
    }

    public void w(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            C();
        }
    }

    public void x(int i) {
        if (this.f3014h != i) {
            this.f3014h = i;
            C();
        }
    }

    public void y(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            if (d() == null) {
                return;
            }
            androidx.core.graphics.drawable.a.o(d(), this.j);
        }
    }

    public void z(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            if (d() == null || this.i == null) {
                return;
            }
            androidx.core.graphics.drawable.a.p(d(), this.i);
        }
    }
}
