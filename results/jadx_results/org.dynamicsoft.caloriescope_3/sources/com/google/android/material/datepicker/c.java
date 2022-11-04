package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    final b f1452a;

    /* renamed from: b */
    final b f1453b;

    /* renamed from: c */
    final b f1454c;
    final b d;
    final b e;
    final b f;
    final b g;
    final Paint h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.a.a.a.y.b.a(context, b.a.a.a.b.materialCalendarStyle, g.class.getCanonicalName()), b.a.a.a.l.MaterialCalendar);
        this.f1452a = b.a(context, obtainStyledAttributes.getResourceId(b.a.a.a.l.MaterialCalendar_dayStyle, 0));
        this.g = b.a(context, obtainStyledAttributes.getResourceId(b.a.a.a.l.MaterialCalendar_dayInvalidStyle, 0));
        this.f1453b = b.a(context, obtainStyledAttributes.getResourceId(b.a.a.a.l.MaterialCalendar_daySelectedStyle, 0));
        this.f1454c = b.a(context, obtainStyledAttributes.getResourceId(b.a.a.a.l.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a2 = b.a.a.a.y.c.a(context, obtainStyledAttributes, b.a.a.a.l.MaterialCalendar_rangeFillColor);
        this.d = b.a(context, obtainStyledAttributes.getResourceId(b.a.a.a.l.MaterialCalendar_yearStyle, 0));
        this.e = b.a(context, obtainStyledAttributes.getResourceId(b.a.a.a.l.MaterialCalendar_yearSelectedStyle, 0));
        this.f = b.a(context, obtainStyledAttributes.getResourceId(b.a.a.a.l.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(a2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
