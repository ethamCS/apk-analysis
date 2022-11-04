package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
/* loaded from: classes.dex */
final class b {

    /* renamed from: a */
    private final Rect f3040a;

    /* renamed from: b */
    private final ColorStateList f3041b;

    /* renamed from: c */
    private final ColorStateList f3042c;

    /* renamed from: d */
    private final ColorStateList f3043d;

    /* renamed from: e */
    private final int f3044e;

    /* renamed from: f */
    private final d.a.a.a.a0.k f3045f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, d.a.a.a.a0.k kVar, Rect rect) {
        b.g.k.h.b(rect.left);
        b.g.k.h.b(rect.top);
        b.g.k.h.b(rect.right);
        b.g.k.h.b(rect.bottom);
        this.f3040a = rect;
        this.f3041b = colorStateList2;
        this.f3042c = colorStateList;
        this.f3043d = colorStateList3;
        this.f3044e = i;
        this.f3045f = kVar;
    }

    public static b a(Context context, int i) {
        b.g.k.h.a(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, d.a.a.a.k.D1);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(d.a.a.a.k.E1, 0), obtainStyledAttributes.getDimensionPixelOffset(d.a.a.a.k.G1, 0), obtainStyledAttributes.getDimensionPixelOffset(d.a.a.a.k.F1, 0), obtainStyledAttributes.getDimensionPixelOffset(d.a.a.a.k.H1, 0));
        ColorStateList a2 = d.a.a.a.x.c.a(context, obtainStyledAttributes, d.a.a.a.k.I1);
        ColorStateList a3 = d.a.a.a.x.c.a(context, obtainStyledAttributes, d.a.a.a.k.N1);
        ColorStateList a4 = d.a.a.a.x.c.a(context, obtainStyledAttributes, d.a.a.a.k.L1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(d.a.a.a.k.M1, 0);
        d.a.a.a.a0.k m = d.a.a.a.a0.k.b(context, obtainStyledAttributes.getResourceId(d.a.a.a.k.J1, 0), obtainStyledAttributes.getResourceId(d.a.a.a.k.K1, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a2, a3, a4, dimensionPixelSize, m, rect);
    }

    public int b() {
        return this.f3040a.bottom;
    }

    public int c() {
        return this.f3040a.top;
    }

    public void d(TextView textView) {
        d.a.a.a.a0.g gVar = new d.a.a.a.a0.g();
        d.a.a.a.a0.g gVar2 = new d.a.a.a.a0.g();
        gVar.setShapeAppearanceModel(this.f3045f);
        gVar2.setShapeAppearanceModel(this.f3045f);
        gVar.V(this.f3042c);
        gVar.c0(this.f3044e, this.f3043d);
        textView.setTextColor(this.f3041b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f3041b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.f3040a;
        b.g.l.t.l0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
