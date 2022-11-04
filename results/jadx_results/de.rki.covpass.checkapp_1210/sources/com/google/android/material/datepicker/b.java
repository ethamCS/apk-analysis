package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.view.y;
/* loaded from: classes.dex */
final class b {

    /* renamed from: a */
    private final Rect f7118a;

    /* renamed from: b */
    private final ColorStateList f7119b;

    /* renamed from: c */
    private final ColorStateList f7120c;

    /* renamed from: d */
    private final ColorStateList f7121d;

    /* renamed from: e */
    private final int f7122e;

    /* renamed from: f */
    private final t5.k f7123f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, t5.k kVar, Rect rect) {
        androidx.core.util.h.d(rect.left);
        androidx.core.util.h.d(rect.top);
        androidx.core.util.h.d(rect.right);
        androidx.core.util.h.d(rect.bottom);
        this.f7118a = rect;
        this.f7119b = colorStateList2;
        this.f7120c = colorStateList;
        this.f7121d = colorStateList3;
        this.f7122e = i10;
        this.f7123f = kVar;
    }

    public static b a(Context context, int i10) {
        androidx.core.util.h.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, b5.l.Z2);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(b5.l.f5512a3, 0), obtainStyledAttributes.getDimensionPixelOffset(b5.l.f5530c3, 0), obtainStyledAttributes.getDimensionPixelOffset(b5.l.f5521b3, 0), obtainStyledAttributes.getDimensionPixelOffset(b5.l.f5539d3, 0));
        ColorStateList a10 = q5.c.a(context, obtainStyledAttributes, b5.l.f5548e3);
        ColorStateList a11 = q5.c.a(context, obtainStyledAttributes, b5.l.f5593j3);
        ColorStateList a12 = q5.c.a(context, obtainStyledAttributes, b5.l.f5575h3);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(b5.l.f5584i3, 0);
        t5.k m10 = t5.k.b(context, obtainStyledAttributes.getResourceId(b5.l.f5557f3, 0), obtainStyledAttributes.getResourceId(b5.l.f5566g3, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a10, a11, a12, dimensionPixelSize, m10, rect);
    }

    public int b() {
        return this.f7118a.bottom;
    }

    public int c() {
        return this.f7118a.top;
    }

    public void d(TextView textView) {
        t5.g gVar = new t5.g();
        t5.g gVar2 = new t5.g();
        gVar.setShapeAppearanceModel(this.f7123f);
        gVar2.setShapeAppearanceModel(this.f7123f);
        gVar.Z(this.f7120c);
        gVar.g0(this.f7122e, this.f7121d);
        textView.setTextColor(this.f7119b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f7119b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f7118a;
        y.s0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
