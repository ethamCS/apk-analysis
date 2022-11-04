package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.g.l.t;
import java.util.List;
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a */
    private int f3343a = 0;

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        final /* synthetic */ View f3344b;

        /* renamed from: c */
        final /* synthetic */ int f3345c;

        /* renamed from: d */
        final /* synthetic */ d.a.a.a.u.a f3346d;

        a(View view, int i, d.a.a.a.u.a aVar) {
            ExpandableBehavior.this = r1;
            this.f3344b = view;
            this.f3345c = i;
            this.f3346d = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f3344b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f3343a == this.f3345c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                d.a.a.a.u.a aVar = this.f3346d;
                expandableBehavior.H((View) aVar, this.f3344b, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private boolean F(boolean z) {
        if (!z) {
            return this.f3343a == 1;
        }
        int i = this.f3343a;
        return i == 0 || i == 2;
    }

    protected d.a.a.a.u.a G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> r = coordinatorLayout.r(view);
        int size = r.size();
        for (int i = 0; i < size; i++) {
            View view2 = r.get(i);
            if (e(coordinatorLayout, view, view2)) {
                return (d.a.a.a.u.a) view2;
            }
        }
        return null;
    }

    protected abstract boolean H(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        d.a.a.a.u.a aVar = (d.a.a.a.u.a) view2;
        if (F(aVar.a())) {
            this.f3343a = aVar.a() ? 1 : 2;
            return H((View) aVar, view, aVar.a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        d.a.a.a.u.a G;
        if (t.O(view) || (G = G(coordinatorLayout, view)) == null || !F(G.a())) {
            return false;
        }
        int i2 = G.a() ? 1 : 2;
        this.f3343a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i2, G));
        return false;
    }
}
