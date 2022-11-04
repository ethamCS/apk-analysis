package com.google.android.material.transformation;

import a.g.l.u;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a */
    private int f1602a = 0;

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        final /* synthetic */ View f1603b;

        /* renamed from: c */
        final /* synthetic */ int f1604c;
        final /* synthetic */ b.a.a.a.v.b d;

        a(View view, int i, b.a.a.a.v.b bVar) {
            ExpandableBehavior.this = r1;
            this.f1603b = view;
            this.f1604c = i;
            this.d = bVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f1603b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f1602a == this.f1604c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                b.a.a.a.v.b bVar = this.d;
                expandableBehavior.a((View) bVar, this.f1603b, bVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private boolean a(boolean z) {
        if (!z) {
            return this.f1602a == 1;
        }
        int i = this.f1602a;
        return i == 0 || i == 2;
    }

    protected abstract boolean a(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        b.a.a.a.v.b e;
        if (u.D(view) || (e = e(coordinatorLayout, view)) == null || !a(e.a())) {
            return false;
        }
        int i2 = e.a() ? 1 : 2;
        this.f1602a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i2, e));
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b.a.a.a.v.b bVar = (b.a.a.a.v.b) view2;
        if (a(bVar.a())) {
            this.f1602a = bVar.a() ? 1 : 2;
            return a((View) bVar, view, bVar.a(), true);
        }
        return false;
    }

    protected b.a.a.a.v.b e(CoordinatorLayout coordinatorLayout, View view) {
        List<View> b2 = coordinatorLayout.b(view);
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            View view2 = b2.get(i);
            if (a(coordinatorLayout, (CoordinatorLayout) view, view2)) {
                return (b.a.a.a.v.b) view2;
            }
        }
        return null;
    }
}
