package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes.dex */
public class c<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a */
    private d f6855a;

    /* renamed from: b */
    private int f6856b = 0;

    /* renamed from: c */
    private int f6857c = 0;

    public c() {
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int E() {
        d dVar = this.f6855a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    public void F(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        coordinatorLayout.I(v10, i10);
    }

    public boolean G(int i10) {
        d dVar = this.f6855a;
        if (dVar != null) {
            return dVar.e(i10);
        }
        this.f6856b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        F(coordinatorLayout, v10, i10);
        if (this.f6855a == null) {
            this.f6855a = new d(v10);
        }
        this.f6855a.c();
        this.f6855a.a();
        int i11 = this.f6856b;
        if (i11 != 0) {
            this.f6855a.e(i11);
            this.f6856b = 0;
        }
        int i12 = this.f6857c;
        if (i12 != 0) {
            this.f6855a.d(i12);
            this.f6857c = 0;
            return true;
        }
        return true;
    }
}
