package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.j0;
import androidx.core.view.y;
import java.util.List;
/* loaded from: classes.dex */
public abstract class b extends c<View> {

    /* renamed from: d */
    final Rect f6851d = new Rect();

    /* renamed from: e */
    final Rect f6852e = new Rect();

    /* renamed from: f */
    private int f6853f = 0;

    /* renamed from: g */
    private int f6854g;

    public b() {
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static int N(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    @Override // com.google.android.material.appbar.c
    public void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        int i11;
        View H = H(coordinatorLayout.r(view));
        if (H != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f6851d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, H.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            j0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && y.y(coordinatorLayout) && !y.y(view)) {
                rect.left += lastWindowInsets.i();
                rect.right -= lastWindowInsets.j();
            }
            Rect rect2 = this.f6852e;
            androidx.core.view.e.a(N(fVar.f3320c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            int I = I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            i11 = rect2.top - H.getBottom();
        } else {
            super.F(coordinatorLayout, view, i10);
            i11 = 0;
        }
        this.f6853f = i11;
    }

    abstract View H(List<View> list);

    public final int I(View view) {
        if (this.f6854g == 0) {
            return 0;
        }
        float J = J(view);
        int i10 = this.f6854g;
        return s0.a.b((int) (J * i10), 0, i10);
    }

    float J(View view) {
        return 1.0f;
    }

    public final int K() {
        return this.f6854g;
    }

    public int L(View view) {
        return view.getMeasuredHeight();
    }

    public final int M() {
        return this.f6853f;
    }

    public final void O(int i10) {
        this.f6854g = i10;
    }

    protected boolean P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View H;
        j0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 == -1 || i14 == -2) && (H = H(coordinatorLayout.r(view))) != null) {
            int size = View.MeasureSpec.getSize(i12);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (y.y(H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.k() + lastWindowInsets.h();
            }
            int L = size + L(H);
            int measuredHeight = H.getMeasuredHeight();
            if (P()) {
                view.setTranslationY(-measuredHeight);
            } else {
                L -= measuredHeight;
            }
            coordinatorLayout.J(view, i10, i11, View.MeasureSpec.makeMeasureSpec(L, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
            return true;
        }
        return false;
    }
}
