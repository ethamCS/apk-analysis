package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes.dex */
public class c<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a */
    private d f2922a;

    /* renamed from: b */
    private int f2923b = 0;

    /* renamed from: c */
    private int f2924c = 0;

    public c() {
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int E() {
        d dVar = this.f2922a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    public void F(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.I(v, i);
    }

    public boolean G(int i) {
        d dVar = this.f2922a;
        if (dVar != null) {
            return dVar.e(i);
        }
        this.f2923b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        F(coordinatorLayout, v, i);
        if (this.f2922a == null) {
            this.f2922a = new d(v);
        }
        this.f2922a.c();
        this.f2922a.a();
        int i2 = this.f2923b;
        if (i2 != 0) {
            this.f2922a.e(i2);
            this.f2923b = 0;
        }
        int i3 = this.f2924c;
        if (i3 != 0) {
            this.f2922a.d(i3);
            this.f2924c = 0;
            return true;
        }
        return true;
    }
}
