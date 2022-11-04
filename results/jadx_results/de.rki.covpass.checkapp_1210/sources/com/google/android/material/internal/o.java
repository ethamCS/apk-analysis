package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.j0;
import androidx.core.view.s;
import androidx.core.view.y;
/* loaded from: classes.dex */
public class o {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ View f7426c;

        a(View view) {
            this.f7426c = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f7426c.getContext().getSystemService("input_method")).showSoftInput(this.f7426c, 1);
        }
    }

    /* loaded from: classes.dex */
    public class b implements s {

        /* renamed from: a */
        final /* synthetic */ d f7427a;

        /* renamed from: b */
        final /* synthetic */ e f7428b;

        b(d dVar, e eVar) {
            this.f7427a = dVar;
            this.f7428b = eVar;
        }

        @Override // androidx.core.view.s
        public j0 a(View view, j0 j0Var) {
            return this.f7427a.a(view, j0Var, new e(this.f7428b));
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            y.l0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        j0 a(View view, j0 j0Var, e eVar);
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public int f7429a;

        /* renamed from: b */
        public int f7430b;

        /* renamed from: c */
        public int f7431c;

        /* renamed from: d */
        public int f7432d;

        public e(int i10, int i11, int i12, int i13) {
            this.f7429a = i10;
            this.f7430b = i11;
            this.f7431c = i12;
            this.f7432d = i13;
        }

        public e(e eVar) {
            this.f7429a = eVar.f7429a;
            this.f7430b = eVar.f7430b;
            this.f7431c = eVar.f7431c;
            this.f7432d = eVar.f7432d;
        }
    }

    public static void a(View view, d dVar) {
        y.A0(view, new b(dVar, new e(y.G(view), view.getPaddingTop(), y.F(view), view.getPaddingBottom())));
        g(view);
    }

    public static float b(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer c(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    public static float d(View view) {
        float f10 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f10 += y.w((View) parent);
        }
        return f10;
    }

    public static boolean e(View view) {
        return y.B(view) == 1;
    }

    public static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 == 5) {
                return PorterDuff.Mode.SRC_IN;
            }
            if (i10 == 9) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            switch (i10) {
                case 14:
                    return PorterDuff.Mode.MULTIPLY;
                case 15:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
                default:
                    return mode;
            }
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void g(View view) {
        if (y.R(view)) {
            y.l0(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void h(View view) {
        view.requestFocus();
        view.post(new a(view));
    }
}
