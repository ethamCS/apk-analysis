package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.e;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private e.b f1556a;

    public a(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.b(0.1f);
        swipeDismissBehavior.a(0.6f);
        swipeDismissBehavior.a(0);
    }

    public void a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (!coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                return;
            }
            e.a().a(this.f1556a);
        } else if (actionMasked != 1 && actionMasked != 3) {
        } else {
            e.a().b(this.f1556a);
        }
    }

    public boolean a(View view) {
        return view instanceof d;
    }
}
