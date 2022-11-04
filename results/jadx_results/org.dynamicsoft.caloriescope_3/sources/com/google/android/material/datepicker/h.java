package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
/* loaded from: classes.dex */
public final class h<S> extends androidx.fragment.app.c {
    public static boolean b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.a.a.a.y.b.a(context, b.a.a.a.b.materialCalendarStyle, g.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }
}
