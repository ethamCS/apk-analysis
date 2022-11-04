package com.google.android.material.internal;

import a.g.l.c0;
import a.g.l.q;
import a.g.l.u;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public class n {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements q {

        /* renamed from: a */
        final /* synthetic */ c f1546a;

        /* renamed from: b */
        final /* synthetic */ d f1547b;

        a(c cVar, d dVar) {
            this.f1546a = cVar;
            this.f1547b = dVar;
        }

        @Override // a.g.l.q
        public c0 a(View view, c0 c0Var) {
            this.f1546a.a(view, c0Var, new d(this.f1547b));
            return c0Var;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            u.I(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        c0 a(View view, c0 c0Var, d dVar);
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public int f1548a;

        /* renamed from: b */
        public int f1549b;

        /* renamed from: c */
        public int f1550c;
        public int d;

        public d(int i, int i2, int i3, int i4) {
            this.f1548a = i;
            this.f1549b = i2;
            this.f1550c = i3;
            this.d = i4;
        }

        public d(d dVar) {
            this.f1548a = dVar.f1548a;
            this.f1549b = dVar.f1549b;
            this.f1550c = dVar.f1550c;
            this.d = dVar.d;
        }

        public void a(View view) {
            u.a(view, this.f1548a, this.f1549b, this.f1550c, this.d);
        }
    }

    public static float a(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static float a(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += u.k((View) parent);
        }
        return f;
    }

    public static PorterDuff.Mode a(int i, PorterDuff.Mode mode) {
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

    public static void a(View view, c cVar) {
        u.a(view, new a(cVar, new d(u.t(view), view.getPaddingTop(), u.s(view), view.getPaddingBottom())));
        b(view);
    }

    public static void b(View view) {
        if (u.C(view)) {
            u.I(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }
}
