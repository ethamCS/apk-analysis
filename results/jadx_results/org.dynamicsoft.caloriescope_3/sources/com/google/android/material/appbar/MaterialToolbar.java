package com.google.android.material.appbar;

import a.g.l.u;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import b.a.a.a.b0.g;
import b.a.a.a.b0.h;
import b.a.a.a.k;
import com.google.android.material.internal.m;
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    private static final int Q = k.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a.a.b.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(m.b(context, attributeSet, i, Q), attributeSet, i);
        a(getContext());
    }

    private void a(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.a(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.a(context);
            gVar.b(u.k(this));
            u.a(this, gVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.a(this);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        h.a(this, f);
    }
}
