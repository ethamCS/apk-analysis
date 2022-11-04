package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.e;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private e.b f3249a;

    public a(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.K(0.1f);
        swipeDismissBehavior.J(0.6f);
        swipeDismissBehavior.L(0);
    }

    public boolean a(View view) {
        return view instanceof d;
    }

    public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (!coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                return;
            }
            e.b().e(this.f3249a);
        } else if (actionMasked != 1 && actionMasked != 3) {
        } else {
            e.b().f(this.f3249a);
        }
    }
}
