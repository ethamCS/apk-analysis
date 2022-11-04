package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    final b f3046a;

    /* renamed from: b */
    final b f3047b;

    /* renamed from: c */
    final b f3048c;

    /* renamed from: d */
    final b f3049d;

    /* renamed from: e */
    final b f3050e;

    /* renamed from: f */
    final b f3051f;

    /* renamed from: g */
    final b f3052g;

    /* renamed from: h */
    final Paint f3053h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(d.a.a.a.x.b.c(context, d.a.a.a.b.s, h.class.getCanonicalName()), d.a.a.a.k.u1);
        this.f3046a = b.a(context, obtainStyledAttributes.getResourceId(d.a.a.a.k.x1, 0));
        this.f3052g = b.a(context, obtainStyledAttributes.getResourceId(d.a.a.a.k.v1, 0));
        this.f3047b = b.a(context, obtainStyledAttributes.getResourceId(d.a.a.a.k.w1, 0));
        this.f3048c = b.a(context, obtainStyledAttributes.getResourceId(d.a.a.a.k.y1, 0));
        ColorStateList a2 = d.a.a.a.x.c.a(context, obtainStyledAttributes, d.a.a.a.k.z1);
        this.f3049d = b.a(context, obtainStyledAttributes.getResourceId(d.a.a.a.k.B1, 0));
        this.f3050e = b.a(context, obtainStyledAttributes.getResourceId(d.a.a.a.k.A1, 0));
        this.f3051f = b.a(context, obtainStyledAttributes.getResourceId(d.a.a.a.k.C1, 0));
        Paint paint = new Paint();
        this.f3053h = paint;
        paint.setColor(a2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
