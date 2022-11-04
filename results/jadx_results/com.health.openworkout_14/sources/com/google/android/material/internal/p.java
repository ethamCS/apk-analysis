package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import b.g.l.b0;
import b.g.l.t;
/* loaded from: classes.dex */
public class p {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements b.g.l.q {

        /* renamed from: a */
        final /* synthetic */ c f3233a;

        /* renamed from: b */
        final /* synthetic */ d f3234b;

        a(c cVar, d dVar) {
            this.f3233a = cVar;
            this.f3234b = dVar;
        }

        @Override // b.g.l.q
        public b0 a(View view, b0 b0Var) {
            this.f3233a.a(view, b0Var, new d(this.f3234b));
            return b0Var;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            t.f0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        b0 a(View view, b0 b0Var, d dVar);
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public int f3235a;

        /* renamed from: b */
        public int f3236b;

        /* renamed from: c */
        public int f3237c;

        /* renamed from: d */
        public int f3238d;

        public d(int i, int i2, int i3, int i4) {
            this.f3235a = i;
            this.f3236b = i2;
            this.f3237c = i3;
            this.f3238d = i4;
        }

        public d(d dVar) {
            this.f3235a = dVar.f3235a;
            this.f3236b = dVar.f3236b;
            this.f3237c = dVar.f3237c;
            this.f3238d = dVar.f3238d;
        }
    }

    public static void a(View view, c cVar) {
        t.t0(view, new a(cVar, new d(t.D(view), view.getPaddingTop(), t.C(view), view.getPaddingBottom())));
        f(view);
    }

    public static float b(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static float c(View view) {
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f2 += t.t((View) parent);
        }
        return f2;
    }

    public static boolean d(View view) {
        return t.y(view) == 1;
    }

    public static PorterDuff.Mode e(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i == 5) {
                return PorterDuff.Mode.SRC_IN;
            }
            if (i == 9) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            switch (i) {
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

    public static void f(View view) {
        if (t.N(view)) {
            t.f0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }
}
