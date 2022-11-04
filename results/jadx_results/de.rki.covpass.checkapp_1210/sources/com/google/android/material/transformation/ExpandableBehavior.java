package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.y;
import java.util.List;
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a */
    private int f7786a = 0;

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: c */
        final /* synthetic */ View f7787c;

        /* renamed from: d */
        final /* synthetic */ int f7788d;

        /* renamed from: q */
        final /* synthetic */ m5.a f7789q;

        a(View view, int i10, m5.a aVar) {
            ExpandableBehavior.this = r1;
            this.f7787c = view;
            this.f7788d = i10;
            this.f7789q = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f7787c.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f7786a == this.f7788d) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                m5.a aVar = this.f7789q;
                expandableBehavior.H((View) aVar, this.f7787c, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private boolean F(boolean z10) {
        if (!z10) {
            return this.f7786a == 1;
        }
        int i10 = this.f7786a;
        return i10 == 0 || i10 == 2;
    }

    protected m5.a G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> r10 = coordinatorLayout.r(view);
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = r10.get(i10);
            if (e(coordinatorLayout, view, view2)) {
                return (m5.a) view2;
            }
        }
        return null;
    }

    protected abstract boolean H(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        m5.a aVar = (m5.a) view2;
        if (F(aVar.a())) {
            this.f7786a = aVar.a() ? 1 : 2;
            return H((View) aVar, view, aVar.a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        m5.a G;
        if (y.S(view) || (G = G(coordinatorLayout, view)) == null || !F(G.a())) {
            return false;
        }
        int i11 = G.a() ? 1 : 2;
        this.f7786a = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, G));
        return false;
    }
}
