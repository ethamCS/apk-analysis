package com.google.android.material.button;

import a.g.l.u;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import b.a.a.a.b;
import b.a.a.a.b0.g;
import b.a.a.a.b0.k;
import b.a.a.a.l;
import b.a.a.a.y.c;
import com.google.android.material.internal.n;
/* loaded from: classes.dex */
public class a {
    private static final boolean s;

    /* renamed from: a */
    private final MaterialButton f1438a;

    /* renamed from: b */
    private k f1439b;

    /* renamed from: c */
    private int f1440c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
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
        this.f1438a = materialButton;
        this.f1439b = kVar;
    }

    private InsetDrawable a(Drawable drawable) {
        return new InsetDrawable(drawable, this.f1440c, this.e, this.d, this.f);
    }

    private void b(k kVar) {
        if (c() != null) {
            c().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (b() != null) {
            b().setShapeAppearanceModel(kVar);
        }
    }

    private g c(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) (s ? (LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable() : this.r).getDrawable(!z ? 1 : 0);
    }

    private Drawable m() {
        g gVar = new g(this.f1439b);
        gVar.a(this.f1438a.getContext());
        androidx.core.graphics.drawable.a.a(gVar, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.a(gVar, mode);
        }
        gVar.a(this.h, this.k);
        g gVar2 = new g(this.f1439b);
        gVar2.setTint(0);
        gVar2.a(this.h, this.n ? b.a.a.a.s.a.a(this.f1438a, b.colorSurface) : 0);
        if (s) {
            g gVar3 = new g(this.f1439b);
            this.m = gVar3;
            androidx.core.graphics.drawable.a.b(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(b.a.a.a.z.b.b(this.l), a(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.m);
            this.r = rippleDrawable;
            return rippleDrawable;
        }
        b.a.a.a.z.a aVar = new b.a.a.a.z.a(this.f1439b);
        this.m = aVar;
        androidx.core.graphics.drawable.a.a(aVar, b.a.a.a.z.b.b(this.l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.m});
        this.r = layerDrawable;
        return a(layerDrawable);
    }

    private g n() {
        return c(true);
    }

    private void o() {
        g c2 = c();
        g n = n();
        if (c2 != null) {
            c2.a(this.h, this.k);
            if (n == null) {
                return;
            }
            n.a(this.h, this.n ? b.a.a.a.s.a.a(this.f1438a, b.colorSurface) : 0);
        }
    }

    public int a() {
        return this.g;
    }

    public void a(int i) {
        if (c() != null) {
            c().setTint(i);
        }
    }

    public void a(int i, int i2) {
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setBounds(this.f1440c, this.e, i2 - this.d, i - this.f);
        }
    }

    public void a(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            if (s && (this.f1438a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f1438a.getBackground()).setColor(b.a.a.a.z.b.b(colorStateList));
            } else if (s || !(this.f1438a.getBackground() instanceof b.a.a.a.z.a)) {
            } else {
                ((b.a.a.a.z.a) this.f1438a.getBackground()).setTintList(b.a.a.a.z.b.b(colorStateList));
            }
        }
    }

    public void a(TypedArray typedArray) {
        this.f1440c = typedArray.getDimensionPixelOffset(l.MaterialButton_android_insetLeft, 0);
        this.d = typedArray.getDimensionPixelOffset(l.MaterialButton_android_insetRight, 0);
        this.e = typedArray.getDimensionPixelOffset(l.MaterialButton_android_insetTop, 0);
        this.f = typedArray.getDimensionPixelOffset(l.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(l.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(l.MaterialButton_cornerRadius, -1);
            this.g = dimensionPixelSize;
            a(this.f1439b.a(dimensionPixelSize));
            this.p = true;
        }
        this.h = typedArray.getDimensionPixelSize(l.MaterialButton_strokeWidth, 0);
        this.i = n.a(typedArray.getInt(l.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.j = c.a(this.f1438a.getContext(), typedArray, l.MaterialButton_backgroundTint);
        this.k = c.a(this.f1438a.getContext(), typedArray, l.MaterialButton_strokeColor);
        this.l = c.a(this.f1438a.getContext(), typedArray, l.MaterialButton_rippleColor);
        this.q = typedArray.getBoolean(l.MaterialButton_android_checkable, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(l.MaterialButton_elevation, 0);
        int t = u.t(this.f1438a);
        int paddingTop = this.f1438a.getPaddingTop();
        int s2 = u.s(this.f1438a);
        int paddingBottom = this.f1438a.getPaddingBottom();
        this.f1438a.setInternalBackground(m());
        g c2 = c();
        if (c2 != null) {
            c2.b(dimensionPixelSize2);
        }
        u.a(this.f1438a, t + this.f1440c, paddingTop + this.e, s2 + this.d, paddingBottom + this.f);
    }

    public void a(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            if (c() == null || this.i == null) {
                return;
            }
            androidx.core.graphics.drawable.a.a(c(), this.i);
        }
    }

    public void a(k kVar) {
        this.f1439b = kVar;
        b(kVar);
    }

    public void a(boolean z) {
        this.q = z;
    }

    public b.a.a.a.b0.n b() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (b.a.a.a.b0.n) (this.r.getNumberOfLayers() > 2 ? this.r.getDrawable(2) : this.r.getDrawable(1));
    }

    public void b(int i) {
        if (!this.p || this.g != i) {
            this.g = i;
            this.p = true;
            a(this.f1439b.a(i));
        }
    }

    public void b(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            o();
        }
    }

    public void b(boolean z) {
        this.n = z;
        o();
    }

    public g c() {
        return c(false);
    }

    public void c(int i) {
        if (this.h != i) {
            this.h = i;
            o();
        }
    }

    public void c(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            if (c() == null) {
                return;
            }
            androidx.core.graphics.drawable.a.a(c(), this.j);
        }
    }

    public ColorStateList d() {
        return this.l;
    }

    public k e() {
        return this.f1439b;
    }

    public ColorStateList f() {
        return this.k;
    }

    public int g() {
        return this.h;
    }

    public ColorStateList h() {
        return this.j;
    }

    public PorterDuff.Mode i() {
        return this.i;
    }

    public boolean j() {
        return this.o;
    }

    public boolean k() {
        return this.q;
    }

    public void l() {
        this.o = true;
        this.f1438a.setSupportBackgroundTintList(this.j);
        this.f1438a.setSupportBackgroundTintMode(this.i);
    }
}
