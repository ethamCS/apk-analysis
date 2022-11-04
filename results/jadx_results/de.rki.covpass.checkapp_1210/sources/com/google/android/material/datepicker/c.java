package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    final b f7124a;

    /* renamed from: b */
    final b f7125b;

    /* renamed from: c */
    final b f7126c;

    /* renamed from: d */
    final b f7127d;

    /* renamed from: e */
    final b f7128e;

    /* renamed from: f */
    final b f7129f;

    /* renamed from: g */
    final b f7130g;

    /* renamed from: h */
    final Paint f7131h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(q5.b.d(context, b5.b.f5464v, h.class.getCanonicalName()), b5.l.Q2);
        this.f7124a = b.a(context, obtainStyledAttributes.getResourceId(b5.l.T2, 0));
        this.f7130g = b.a(context, obtainStyledAttributes.getResourceId(b5.l.R2, 0));
        this.f7125b = b.a(context, obtainStyledAttributes.getResourceId(b5.l.S2, 0));
        this.f7126c = b.a(context, obtainStyledAttributes.getResourceId(b5.l.U2, 0));
        ColorStateList a10 = q5.c.a(context, obtainStyledAttributes, b5.l.V2);
        this.f7127d = b.a(context, obtainStyledAttributes.getResourceId(b5.l.X2, 0));
        this.f7128e = b.a(context, obtainStyledAttributes.getResourceId(b5.l.W2, 0));
        this.f7129f = b.a(context, obtainStyledAttributes.getResourceId(b5.l.Y2, 0));
        Paint paint = new Paint();
        this.f7131h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
