package com.google.android.material.theme.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b.a.o.d;
import d.a.a.a.b;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private static final int[] f3341a = {16842752, b.D_res_0x7f040340};

    /* renamed from: b */
    private static final int[] f3342b = {b.t_res_0x7f040236};

    private static int a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3341a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3342b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context c(Context context, AttributeSet attributeSet, int i, int i2) {
        int b2 = b(context, attributeSet, i, i2);
        boolean z = (context instanceof d) && ((d) context).c() == b2;
        if (b2 == 0 || z) {
            return context;
        }
        d dVar = new d(context, b2);
        int a2 = a(context, attributeSet);
        if (a2 != 0) {
            dVar.getTheme().applyStyle(a2, true);
        }
        return dVar;
    }
}
