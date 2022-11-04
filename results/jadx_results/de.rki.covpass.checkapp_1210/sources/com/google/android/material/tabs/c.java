package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.o;
import com.google.android.material.tabs.TabLayout;
/* loaded from: classes.dex */
public class c {
    public static RectF a(TabLayout tabLayout, View view) {
        return view == null ? new RectF() : (tabLayout.z() || !(view instanceof TabLayout.h)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : b((TabLayout.h) view, 24);
    }

    static RectF b(TabLayout.h hVar, int i10) {
        int contentWidth = hVar.getContentWidth();
        int contentHeight = hVar.getContentHeight();
        int b10 = (int) o.b(hVar.getContext(), i10);
        if (contentWidth < b10) {
            contentWidth = b10;
        }
        int left = (hVar.getLeft() + hVar.getRight()) / 2;
        int top = (hVar.getTop() + hVar.getBottom()) / 2;
        int i11 = contentWidth / 2;
        return new RectF(left - i11, top - (contentHeight / 2), i11 + left, top + (left / 2));
    }

    public void c(TabLayout tabLayout, View view, Drawable drawable) {
        RectF a10 = a(tabLayout, view);
        drawable.setBounds((int) a10.left, drawable.getBounds().top, (int) a10.right, drawable.getBounds().bottom);
    }

    public void d(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        RectF a10 = a(tabLayout, view);
        RectF a11 = a(tabLayout, view2);
        drawable.setBounds(c5.a.c((int) a10.left, (int) a11.left, f10), drawable.getBounds().top, c5.a.c((int) a10.right, (int) a11.right, f10), drawable.getBounds().bottom);
    }
}
