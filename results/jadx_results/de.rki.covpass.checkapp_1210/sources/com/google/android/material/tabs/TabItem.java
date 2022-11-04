package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.a1;
import b5.l;
/* loaded from: classes.dex */
public class TabItem extends View {

    /* renamed from: c */
    public final CharSequence f7488c;

    /* renamed from: d */
    public final Drawable f7489d;

    /* renamed from: q */
    public final int f7490q;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1 u10 = a1.u(context, attributeSet, l.f5523b5);
        this.f7488c = u10.p(l.f5550e5);
        this.f7489d = u10.g(l.f5532c5);
        this.f7490q = u10.n(l.f5541d5, 0);
        u10.w();
    }
}
