package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes.dex */
public class c<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a */
    private d f1383a;

    /* renamed from: b */
    private int f1384b = 0;

    /* renamed from: c */
    private int f1385c = 0;

    public c() {
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(int i) {
        d dVar = this.f1383a;
        if (dVar != null) {
            return dVar.b(i);
        }
        this.f1384b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
        b(coordinatorLayout, (CoordinatorLayout) v, i);
        if (this.f1383a == null) {
            this.f1383a = new d(v);
        }
        this.f1383a.c();
        this.f1383a.a();
        int i2 = this.f1384b;
        if (i2 != 0) {
            this.f1383a.b(i2);
            this.f1384b = 0;
        }
        int i3 = this.f1385c;
        if (i3 != 0) {
            this.f1383a.a(i3);
            this.f1385c = 0;
            return true;
        }
        return true;
    }

    public int b() {
        d dVar = this.f1383a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    public void b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.c(v, i);
    }
}
