package com.google.android.material.datepicker;

import a.g.l.u;
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
    private final Rect f1449a;

    /* renamed from: b */
    private final ColorStateList f1450b;

    /* renamed from: c */
    private final ColorStateList f1451c;
    private final ColorStateList d;
    private final int e;
    private final b.a.a.a.b0.k f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, b.a.a.a.b0.k kVar, Rect rect) {
        a.g.k.h.a(rect.left);
        a.g.k.h.a(rect.top);
        a.g.k.h.a(rect.right);
        a.g.k.h.a(rect.bottom);
        this.f1449a = rect;
        this.f1450b = colorStateList2;
        this.f1451c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = kVar;
    }

    public static b a(Context context, int i) {
        a.g.k.h.a(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, b.a.a.a.l.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(b.a.a.a.l.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(b.a.a.a.l.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(b.a.a.a.l.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(b.a.a.a.l.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a2 = b.a.a.a.y.c.a(context, obtainStyledAttributes, b.a.a.a.l.MaterialCalendarItem_itemFillColor);
        ColorStateList a3 = b.a.a.a.y.c.a(context, obtainStyledAttributes, b.a.a.a.l.MaterialCalendarItem_itemTextColor);
        ColorStateList a4 = b.a.a.a.y.c.a(context, obtainStyledAttributes, b.a.a.a.l.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(b.a.a.a.l.MaterialCalendarItem_itemStrokeWidth, 0);
        b.a.a.a.b0.k a5 = b.a.a.a.b0.k.a(context, obtainStyledAttributes.getResourceId(b.a.a.a.l.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(b.a.a.a.l.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).a();
        obtainStyledAttributes.recycle();
        return new b(a2, a3, a4, dimensionPixelSize, a5, rect);
    }

    public int a() {
        return this.f1449a.bottom;
    }

    public void a(TextView textView) {
        b.a.a.a.b0.g gVar = new b.a.a.a.b0.g();
        b.a.a.a.b0.g gVar2 = new b.a.a.a.b0.g();
        gVar.setShapeAppearanceModel(this.f);
        gVar2.setShapeAppearanceModel(this.f);
        gVar.a(this.f1451c);
        gVar.a(this.e, this.d);
        textView.setTextColor(this.f1450b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f1450b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.f1449a;
        u.a(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    public int b() {
        return this.f1449a.top;
    }
}
