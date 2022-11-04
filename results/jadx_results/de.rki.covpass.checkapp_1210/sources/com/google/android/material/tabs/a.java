package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
/* loaded from: classes.dex */
public class a extends c {
    private static float e(float f10) {
        return (float) (1.0d - Math.cos((f10 * 3.141592653589793d) / 2.0d));
    }

    private static float f(float f10) {
        return (float) Math.sin((f10 * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.c
    public void d(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        float f11;
        float f12;
        RectF a10 = c.a(tabLayout, view);
        RectF a11 = c.a(tabLayout, view2);
        if (a10.left < a11.left) {
            f12 = e(f10);
            f11 = f(f10);
        } else {
            f12 = f(f10);
            f11 = e(f10);
        }
        drawable.setBounds(c5.a.c((int) a10.left, (int) a11.left, f12), drawable.getBounds().top, c5.a.c((int) a10.right, (int) a11.right, f11), drawable.getBounds().bottom);
    }
}
