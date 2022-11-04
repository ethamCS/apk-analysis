package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.view.y;
import b5.f;
import b5.l;
import q5.c;
import r5.b;
import t5.d;
import t5.e;
import t5.g;
import t5.j;
import t5.k;
/* loaded from: classes.dex */
public class a {

    /* renamed from: u */
    private static final double f7016u = Math.cos(Math.toRadians(45.0d));

    /* renamed from: v */
    private static final Drawable f7017v;

    /* renamed from: a */
    private final MaterialCardView f7018a;

    /* renamed from: c */
    private final g f7020c;

    /* renamed from: d */
    private final g f7021d;

    /* renamed from: e */
    private int f7022e;

    /* renamed from: f */
    private int f7023f;

    /* renamed from: g */
    private int f7024g;

    /* renamed from: h */
    private int f7025h;

    /* renamed from: i */
    private Drawable f7026i;

    /* renamed from: j */
    private Drawable f7027j;

    /* renamed from: k */
    private ColorStateList f7028k;

    /* renamed from: l */
    private ColorStateList f7029l;

    /* renamed from: m */
    private k f7030m;

    /* renamed from: n */
    private ColorStateList f7031n;

    /* renamed from: o */
    private Drawable f7032o;

    /* renamed from: p */
    private LayerDrawable f7033p;

    /* renamed from: q */
    private g f7034q;

    /* renamed from: r */
    private g f7035r;

    /* renamed from: t */
    private boolean f7037t;

    /* renamed from: b */
    private final Rect f7019b = new Rect();

    /* renamed from: s */
    private boolean f7036s = false;

    /* renamed from: com.google.android.material.card.a$a */
    /* loaded from: classes.dex */
    public class C0101a extends InsetDrawable {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0101a(Drawable drawable, int i10, int i11, int i12, int i13) {
            super(drawable, i10, i11, i12, i13);
            a.this = r7;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        f7017v = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public a(MaterialCardView materialCardView, AttributeSet attributeSet, int i10, int i11) {
        this.f7018a = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, i10, i11);
        this.f7020c = gVar;
        gVar.O(materialCardView.getContext());
        gVar.e0(-12303292);
        k.b v10 = gVar.E().v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, l.f5581i0, i10, b5.k.f5487a);
        int i12 = l.f5590j0;
        if (obtainStyledAttributes.hasValue(i12)) {
            v10.o(obtainStyledAttributes.getDimension(i12, 0.0f));
        }
        this.f7021d = new g();
        V(v10.m());
        obtainStyledAttributes.recycle();
    }

    private Drawable B(Drawable drawable) {
        int i10;
        int i11;
        if (this.f7018a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil(d());
            i11 = (int) Math.ceil(c());
            i10 = ceil;
        } else {
            i11 = 0;
            i10 = 0;
        }
        return new C0101a(drawable, i11, i10, i11, i10);
    }

    private boolean E() {
        return (this.f7024g & 80) == 80;
    }

    private boolean F() {
        return (this.f7024g & 8388613) == 8388613;
    }

    private boolean Z() {
        return this.f7018a.getPreventCornerOverlap() && !e();
    }

    private float a() {
        return Math.max(Math.max(b(this.f7030m.q(), this.f7020c.H()), b(this.f7030m.s(), this.f7020c.I())), Math.max(b(this.f7030m.k(), this.f7020c.t()), b(this.f7030m.i(), this.f7020c.s())));
    }

    private boolean a0() {
        return this.f7018a.getPreventCornerOverlap() && e() && this.f7018a.getUseCompatPadding();
    }

    private float b(d dVar, float f10) {
        if (dVar instanceof j) {
            return (float) ((1.0d - f7016u) * f10);
        }
        if (!(dVar instanceof e)) {
            return 0.0f;
        }
        return f10 / 2.0f;
    }

    private float c() {
        return this.f7018a.getMaxCardElevation() + (a0() ? a() : 0.0f);
    }

    private float d() {
        return (this.f7018a.getMaxCardElevation() * 1.5f) + (a0() ? a() : 0.0f);
    }

    private boolean e() {
        return this.f7020c.R();
    }

    private void e0(Drawable drawable) {
        if (this.f7018a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f7018a.getForeground()).setDrawable(drawable);
        } else {
            this.f7018a.setForeground(B(drawable));
        }
    }

    private Drawable f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        g h10 = h();
        this.f7034q = h10;
        h10.Z(this.f7028k);
        stateListDrawable.addState(new int[]{16842919}, this.f7034q);
        return stateListDrawable;
    }

    private Drawable g() {
        if (b.f20473a) {
            this.f7035r = h();
            return new RippleDrawable(this.f7028k, null, this.f7035r);
        }
        return f();
    }

    private void g0() {
        Drawable drawable;
        if (b.f20473a && (drawable = this.f7032o) != null) {
            ((RippleDrawable) drawable).setColor(this.f7028k);
            return;
        }
        g gVar = this.f7034q;
        if (gVar == null) {
            return;
        }
        gVar.Z(this.f7028k);
    }

    private g h() {
        return new g(this.f7030m);
    }

    private Drawable r() {
        if (this.f7032o == null) {
            this.f7032o = g();
        }
        if (this.f7033p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f7032o, this.f7021d, this.f7027j});
            this.f7033p = layerDrawable;
            layerDrawable.setId(2, f.B_res_0x7f090189);
        }
        return this.f7033p;
    }

    private float t() {
        if (!this.f7018a.getPreventCornerOverlap() || !this.f7018a.getUseCompatPadding()) {
            return 0.0f;
        }
        return (float) ((1.0d - f7016u) * this.f7018a.getCardViewRadius());
    }

    public Rect A() {
        return this.f7019b;
    }

    public boolean C() {
        return this.f7036s;
    }

    public boolean D() {
        return this.f7037t;
    }

    public void G(TypedArray typedArray) {
        ColorStateList a10 = c.a(this.f7018a.getContext(), typedArray, l.f5683t3);
        this.f7031n = a10;
        if (a10 == null) {
            this.f7031n = ColorStateList.valueOf(-1);
        }
        this.f7025h = typedArray.getDimensionPixelSize(l.f5692u3, 0);
        boolean z10 = typedArray.getBoolean(l.f5611l3, false);
        this.f7037t = z10;
        this.f7018a.setLongClickable(z10);
        this.f7029l = c.a(this.f7018a.getContext(), typedArray, l.f5665r3);
        N(c.d(this.f7018a.getContext(), typedArray, l.f5629n3));
        Q(typedArray.getDimensionPixelSize(l.f5656q3, 0));
        P(typedArray.getDimensionPixelSize(l.f5647p3, 0));
        this.f7024g = typedArray.getInteger(l.f5638o3, 8388661);
        ColorStateList a11 = c.a(this.f7018a.getContext(), typedArray, l.f5674s3);
        this.f7028k = a11;
        if (a11 == null) {
            this.f7028k = ColorStateList.valueOf(i5.a.d(this.f7018a, b5.b.f5460i));
        }
        K(c.a(this.f7018a.getContext(), typedArray, l.f5620m3));
        g0();
        d0();
        h0();
        this.f7018a.setBackgroundInternal(B(this.f7020c));
        Drawable r10 = this.f7018a.isClickable() ? r() : this.f7021d;
        this.f7026i = r10;
        this.f7018a.setForeground(B(r10));
    }

    public void H(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.f7033p != null) {
            int i15 = 0;
            if (this.f7018a.getUseCompatPadding()) {
                i12 = (int) Math.ceil(d() * 2.0f);
                i15 = (int) Math.ceil(c() * 2.0f);
            } else {
                i12 = 0;
            }
            int i16 = F() ? ((i10 - this.f7022e) - this.f7023f) - i15 : this.f7022e;
            int i17 = E() ? this.f7022e : ((i11 - this.f7022e) - this.f7023f) - i12;
            int i18 = F() ? this.f7022e : ((i10 - this.f7022e) - this.f7023f) - i15;
            int i19 = E() ? ((i11 - this.f7022e) - this.f7023f) - i12 : this.f7022e;
            if (y.B(this.f7018a) == 1) {
                i14 = i18;
                i13 = i16;
            } else {
                i13 = i18;
                i14 = i16;
            }
            this.f7033p.setLayerInset(2, i14, i19, i13, i17);
        }
    }

    public void I(boolean z10) {
        this.f7036s = z10;
    }

    public void J(ColorStateList colorStateList) {
        this.f7020c.Z(colorStateList);
    }

    public void K(ColorStateList colorStateList) {
        g gVar = this.f7021d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.Z(colorStateList);
    }

    public void L(boolean z10) {
        this.f7037t = z10;
    }

    public void M(boolean z10) {
        Drawable drawable = this.f7027j;
        if (drawable != null) {
            drawable.setAlpha(z10 ? 255 : 0);
        }
    }

    public void N(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.f7027j = mutate;
            androidx.core.graphics.drawable.a.o(mutate, this.f7029l);
            M(this.f7018a.isChecked());
        } else {
            this.f7027j = f7017v;
        }
        LayerDrawable layerDrawable = this.f7033p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(f.B_res_0x7f090189, this.f7027j);
        }
    }

    public void O(int i10) {
        this.f7024g = i10;
        H(this.f7018a.getMeasuredWidth(), this.f7018a.getMeasuredHeight());
    }

    public void P(int i10) {
        this.f7022e = i10;
    }

    public void Q(int i10) {
        this.f7023f = i10;
    }

    public void R(ColorStateList colorStateList) {
        this.f7029l = colorStateList;
        Drawable drawable = this.f7027j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        }
    }

    public void S(float f10) {
        V(this.f7030m.w(f10));
        this.f7026i.invalidateSelf();
        if (a0() || Z()) {
            c0();
        }
        if (a0()) {
            f0();
        }
    }

    public void T(float f10) {
        this.f7020c.a0(f10);
        g gVar = this.f7021d;
        if (gVar != null) {
            gVar.a0(f10);
        }
        g gVar2 = this.f7035r;
        if (gVar2 != null) {
            gVar2.a0(f10);
        }
    }

    public void U(ColorStateList colorStateList) {
        this.f7028k = colorStateList;
        g0();
    }

    public void V(k kVar) {
        this.f7030m = kVar;
        this.f7020c.setShapeAppearanceModel(kVar);
        g gVar = this.f7020c;
        gVar.d0(!gVar.R());
        g gVar2 = this.f7021d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        g gVar3 = this.f7035r;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
        g gVar4 = this.f7034q;
        if (gVar4 != null) {
            gVar4.setShapeAppearanceModel(kVar);
        }
    }

    public void W(ColorStateList colorStateList) {
        if (this.f7031n == colorStateList) {
            return;
        }
        this.f7031n = colorStateList;
        h0();
    }

    public void X(int i10) {
        if (i10 == this.f7025h) {
            return;
        }
        this.f7025h = i10;
        h0();
    }

    public void Y(int i10, int i11, int i12, int i13) {
        this.f7019b.set(i10, i11, i12, i13);
        c0();
    }

    public void b0() {
        Drawable drawable = this.f7026i;
        Drawable r10 = this.f7018a.isClickable() ? r() : this.f7021d;
        this.f7026i = r10;
        if (drawable != r10) {
            e0(r10);
        }
    }

    public void c0() {
        int a10 = (int) ((Z() || a0() ? a() : 0.0f) - t());
        MaterialCardView materialCardView = this.f7018a;
        Rect rect = this.f7019b;
        materialCardView.i(rect.left + a10, rect.top + a10, rect.right + a10, rect.bottom + a10);
    }

    public void d0() {
        this.f7020c.Y(this.f7018a.getCardElevation());
    }

    public void f0() {
        if (!C()) {
            this.f7018a.setBackgroundInternal(B(this.f7020c));
        }
        this.f7018a.setForeground(B(this.f7026i));
    }

    void h0() {
        this.f7021d.g0(this.f7025h, this.f7031n);
    }

    public void i() {
        Drawable drawable = this.f7032o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            this.f7032o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            this.f7032o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    public g j() {
        return this.f7020c;
    }

    public ColorStateList k() {
        return this.f7020c.x();
    }

    public ColorStateList l() {
        return this.f7021d.x();
    }

    public Drawable m() {
        return this.f7027j;
    }

    public int n() {
        return this.f7024g;
    }

    public int o() {
        return this.f7022e;
    }

    public int p() {
        return this.f7023f;
    }

    public ColorStateList q() {
        return this.f7029l;
    }

    public float s() {
        return this.f7020c.H();
    }

    public float u() {
        return this.f7020c.y();
    }

    public ColorStateList v() {
        return this.f7028k;
    }

    public k w() {
        return this.f7030m;
    }

    public int x() {
        ColorStateList colorStateList = this.f7031n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList y() {
        return this.f7031n;
    }

    public int z() {
        return this.f7025h;
    }
}
