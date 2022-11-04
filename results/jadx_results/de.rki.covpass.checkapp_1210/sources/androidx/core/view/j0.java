package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
/* loaded from: classes.dex */
public class j0 {

    /* renamed from: b */
    public static final j0 f3681b;

    /* renamed from: a */
    private final l f3682a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        private static Field f3683a;

        /* renamed from: b */
        private static Field f3684b;

        /* renamed from: c */
        private static Field f3685c;

        /* renamed from: d */
        private static boolean f3686d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f3683a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f3684b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f3685c = declaredField3;
                declaredField3.setAccessible(true);
                f3686d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        public static j0 a(View view) {
            if (f3686d && view.isAttachedToWindow()) {
                try {
                    Object obj = f3683a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f3684b.get(obj);
                        Rect rect2 = (Rect) f3685c.get(obj);
                        if (rect != null && rect2 != null) {
                            j0 a10 = new b().b(androidx.core.graphics.b.c(rect)).c(androidx.core.graphics.b.c(rect2)).a();
                            a10.r(a10);
                            a10.d(view.getRootView());
                            return a10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final f f3687a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            this.f3687a = i10 >= 30 ? new e() : i10 >= 29 ? new d() : new c();
        }

        public b(j0 j0Var) {
            int i10 = Build.VERSION.SDK_INT;
            this.f3687a = i10 >= 30 ? new e(j0Var) : i10 >= 29 ? new d(j0Var) : new c(j0Var);
        }

        public j0 a() {
            return this.f3687a.b();
        }

        @Deprecated
        public b b(androidx.core.graphics.b bVar) {
            this.f3687a.d(bVar);
            return this;
        }

        @Deprecated
        public b c(androidx.core.graphics.b bVar) {
            this.f3687a.f(bVar);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e */
        private static Field f3688e = null;

        /* renamed from: f */
        private static boolean f3689f = false;

        /* renamed from: g */
        private static Constructor<WindowInsets> f3690g = null;

        /* renamed from: h */
        private static boolean f3691h = false;

        /* renamed from: c */
        private WindowInsets f3692c;

        /* renamed from: d */
        private androidx.core.graphics.b f3693d;

        c() {
            this.f3692c = h();
        }

        c(j0 j0Var) {
            super(j0Var);
            this.f3692c = j0Var.t();
        }

        private static WindowInsets h() {
            if (!f3689f) {
                try {
                    f3688e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f3689f = true;
            }
            Field field = f3688e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f3691h) {
                try {
                    f3690g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f3691h = true;
            }
            Constructor<WindowInsets> constructor = f3690g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // androidx.core.view.j0.f
        j0 b() {
            a();
            j0 u10 = j0.u(this.f3692c);
            u10.p(this.f3696b);
            u10.s(this.f3693d);
            return u10;
        }

        @Override // androidx.core.view.j0.f
        void d(androidx.core.graphics.b bVar) {
            this.f3693d = bVar;
        }

        @Override // androidx.core.view.j0.f
        void f(androidx.core.graphics.b bVar) {
            WindowInsets windowInsets = this.f3692c;
            if (windowInsets != null) {
                this.f3692c = windowInsets.replaceSystemWindowInsets(bVar.f3452a, bVar.f3453b, bVar.f3454c, bVar.f3455d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends f {

        /* renamed from: c */
        final WindowInsets.Builder f3694c;

        d() {
            this.f3694c = new WindowInsets.Builder();
        }

        d(j0 j0Var) {
            super(j0Var);
            WindowInsets t10 = j0Var.t();
            this.f3694c = t10 != null ? new WindowInsets.Builder(t10) : new WindowInsets.Builder();
        }

        @Override // androidx.core.view.j0.f
        j0 b() {
            a();
            j0 u10 = j0.u(this.f3694c.build());
            u10.p(this.f3696b);
            return u10;
        }

        @Override // androidx.core.view.j0.f
        void c(androidx.core.graphics.b bVar) {
            this.f3694c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.j0.f
        void d(androidx.core.graphics.b bVar) {
            this.f3694c.setStableInsets(bVar.e());
        }

        @Override // androidx.core.view.j0.f
        void e(androidx.core.graphics.b bVar) {
            this.f3694c.setSystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.j0.f
        void f(androidx.core.graphics.b bVar) {
            this.f3694c.setSystemWindowInsets(bVar.e());
        }

        @Override // androidx.core.view.j0.f
        void g(androidx.core.graphics.b bVar) {
            this.f3694c.setTappableElementInsets(bVar.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends d {
        e() {
        }

        e(j0 j0Var) {
            super(j0Var);
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        private final j0 f3695a;

        /* renamed from: b */
        androidx.core.graphics.b[] f3696b;

        f() {
            this(new j0((j0) null));
        }

        f(j0 j0Var) {
            this.f3695a = j0Var;
        }

        protected final void a() {
            androidx.core.graphics.b[] bVarArr = this.f3696b;
            if (bVarArr != null) {
                androidx.core.graphics.b bVar = bVarArr[m.a(1)];
                androidx.core.graphics.b bVar2 = this.f3696b[m.a(2)];
                if (bVar2 == null) {
                    bVar2 = this.f3695a.f(2);
                }
                if (bVar == null) {
                    bVar = this.f3695a.f(1);
                }
                f(androidx.core.graphics.b.a(bVar, bVar2));
                androidx.core.graphics.b bVar3 = this.f3696b[m.a(16)];
                if (bVar3 != null) {
                    e(bVar3);
                }
                androidx.core.graphics.b bVar4 = this.f3696b[m.a(32)];
                if (bVar4 != null) {
                    c(bVar4);
                }
                androidx.core.graphics.b bVar5 = this.f3696b[m.a(64)];
                if (bVar5 == null) {
                    return;
                }
                g(bVar5);
            }
        }

        j0 b() {
            throw null;
        }

        void c(androidx.core.graphics.b bVar) {
        }

        void d(androidx.core.graphics.b bVar) {
            throw null;
        }

        void e(androidx.core.graphics.b bVar) {
        }

        void f(androidx.core.graphics.b bVar) {
            throw null;
        }

        void g(androidx.core.graphics.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static class g extends l {

        /* renamed from: h */
        private static boolean f3697h = false;

        /* renamed from: i */
        private static Method f3698i;

        /* renamed from: j */
        private static Class<?> f3699j;

        /* renamed from: k */
        private static Field f3700k;

        /* renamed from: l */
        private static Field f3701l;

        /* renamed from: c */
        final WindowInsets f3702c;

        /* renamed from: d */
        private androidx.core.graphics.b[] f3703d;

        /* renamed from: e */
        private androidx.core.graphics.b f3704e;

        /* renamed from: f */
        private j0 f3705f;

        /* renamed from: g */
        androidx.core.graphics.b f3706g;

        g(j0 j0Var, WindowInsets windowInsets) {
            super(j0Var);
            this.f3704e = null;
            this.f3702c = windowInsets;
        }

        g(j0 j0Var, g gVar) {
            this(j0Var, new WindowInsets(gVar.f3702c));
        }

        @SuppressLint({"WrongConstant"})
        private androidx.core.graphics.b t(int i10, boolean z10) {
            androidx.core.graphics.b bVar = androidx.core.graphics.b.f3451e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVar = androidx.core.graphics.b.a(bVar, u(i11, z10));
                }
            }
            return bVar;
        }

        private androidx.core.graphics.b v() {
            j0 j0Var = this.f3705f;
            return j0Var != null ? j0Var.g() : androidx.core.graphics.b.f3451e;
        }

        private androidx.core.graphics.b w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f3697h) {
                    x();
                }
                Method method = f3698i;
                if (method != null && f3699j != null && f3700k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f3700k.get(f3701l.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return androidx.core.graphics.b.c(rect);
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                f3698i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3699j = cls;
                f3700k = cls.getDeclaredField("mVisibleInsets");
                f3701l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f3700k.setAccessible(true);
                f3701l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f3697h = true;
        }

        @Override // androidx.core.view.j0.l
        void d(View view) {
            androidx.core.graphics.b w9 = w(view);
            if (w9 == null) {
                w9 = androidx.core.graphics.b.f3451e;
            }
            q(w9);
        }

        @Override // androidx.core.view.j0.l
        void e(j0 j0Var) {
            j0Var.r(this.f3705f);
            j0Var.q(this.f3706g);
        }

        @Override // androidx.core.view.j0.l
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f3706g, ((g) obj).f3706g);
        }

        @Override // androidx.core.view.j0.l
        public androidx.core.graphics.b g(int i10) {
            return t(i10, false);
        }

        @Override // androidx.core.view.j0.l
        final androidx.core.graphics.b k() {
            if (this.f3704e == null) {
                this.f3704e = androidx.core.graphics.b.b(this.f3702c.getSystemWindowInsetLeft(), this.f3702c.getSystemWindowInsetTop(), this.f3702c.getSystemWindowInsetRight(), this.f3702c.getSystemWindowInsetBottom());
            }
            return this.f3704e;
        }

        @Override // androidx.core.view.j0.l
        j0 m(int i10, int i11, int i12, int i13) {
            b bVar = new b(j0.u(this.f3702c));
            bVar.c(j0.m(k(), i10, i11, i12, i13));
            bVar.b(j0.m(i(), i10, i11, i12, i13));
            return bVar.a();
        }

        @Override // androidx.core.view.j0.l
        boolean o() {
            return this.f3702c.isRound();
        }

        @Override // androidx.core.view.j0.l
        public void p(androidx.core.graphics.b[] bVarArr) {
            this.f3703d = bVarArr;
        }

        @Override // androidx.core.view.j0.l
        void q(androidx.core.graphics.b bVar) {
            this.f3706g = bVar;
        }

        @Override // androidx.core.view.j0.l
        void r(j0 j0Var) {
            this.f3705f = j0Var;
        }

        protected androidx.core.graphics.b u(int i10, boolean z10) {
            int i11;
            if (i10 == 1) {
                return z10 ? androidx.core.graphics.b.b(0, Math.max(v().f3453b, k().f3453b), 0, 0) : androidx.core.graphics.b.b(0, k().f3453b, 0, 0);
            }
            androidx.core.graphics.b bVar = null;
            if (i10 == 2) {
                if (z10) {
                    androidx.core.graphics.b v10 = v();
                    androidx.core.graphics.b i12 = i();
                    return androidx.core.graphics.b.b(Math.max(v10.f3452a, i12.f3452a), 0, Math.max(v10.f3454c, i12.f3454c), Math.max(v10.f3455d, i12.f3455d));
                }
                androidx.core.graphics.b k10 = k();
                j0 j0Var = this.f3705f;
                if (j0Var != null) {
                    bVar = j0Var.g();
                }
                int i13 = k10.f3455d;
                if (bVar != null) {
                    i13 = Math.min(i13, bVar.f3455d);
                }
                return androidx.core.graphics.b.b(k10.f3452a, 0, k10.f3454c, i13);
            } else if (i10 != 8) {
                if (i10 == 16) {
                    return j();
                }
                if (i10 == 32) {
                    return h();
                }
                if (i10 == 64) {
                    return l();
                }
                if (i10 != 128) {
                    return androidx.core.graphics.b.f3451e;
                }
                j0 j0Var2 = this.f3705f;
                androidx.core.view.d e10 = j0Var2 != null ? j0Var2.e() : f();
                return e10 != null ? androidx.core.graphics.b.b(e10.b(), e10.d(), e10.c(), e10.a()) : androidx.core.graphics.b.f3451e;
            } else {
                androidx.core.graphics.b[] bVarArr = this.f3703d;
                if (bVarArr != null) {
                    bVar = bVarArr[m.a(8)];
                }
                if (bVar != null) {
                    return bVar;
                }
                androidx.core.graphics.b k11 = k();
                androidx.core.graphics.b v11 = v();
                int i14 = k11.f3455d;
                if (i14 > v11.f3455d) {
                    return androidx.core.graphics.b.b(0, 0, 0, i14);
                }
                androidx.core.graphics.b bVar2 = this.f3706g;
                return (bVar2 == null || bVar2.equals(androidx.core.graphics.b.f3451e) || (i11 = this.f3706g.f3455d) <= v11.f3455d) ? androidx.core.graphics.b.f3451e : androidx.core.graphics.b.b(0, 0, 0, i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends g {

        /* renamed from: m */
        private androidx.core.graphics.b f3707m;

        h(j0 j0Var, WindowInsets windowInsets) {
            super(j0Var, windowInsets);
            this.f3707m = null;
        }

        h(j0 j0Var, h hVar) {
            super(j0Var, hVar);
            this.f3707m = null;
            this.f3707m = hVar.f3707m;
        }

        @Override // androidx.core.view.j0.l
        j0 b() {
            return j0.u(this.f3702c.consumeStableInsets());
        }

        @Override // androidx.core.view.j0.l
        j0 c() {
            return j0.u(this.f3702c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.j0.l
        final androidx.core.graphics.b i() {
            if (this.f3707m == null) {
                this.f3707m = androidx.core.graphics.b.b(this.f3702c.getStableInsetLeft(), this.f3702c.getStableInsetTop(), this.f3702c.getStableInsetRight(), this.f3702c.getStableInsetBottom());
            }
            return this.f3707m;
        }

        @Override // androidx.core.view.j0.l
        boolean n() {
            return this.f3702c.isConsumed();
        }

        @Override // androidx.core.view.j0.l
        public void s(androidx.core.graphics.b bVar) {
            this.f3707m = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class i extends h {
        i(j0 j0Var, WindowInsets windowInsets) {
            super(j0Var, windowInsets);
        }

        i(j0 j0Var, i iVar) {
            super(j0Var, iVar);
        }

        @Override // androidx.core.view.j0.l
        j0 a() {
            return j0.u(this.f3702c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.j0.g, androidx.core.view.j0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f3702c, iVar.f3702c) && Objects.equals(this.f3706g, iVar.f3706g);
        }

        @Override // androidx.core.view.j0.l
        androidx.core.view.d f() {
            return androidx.core.view.d.e(this.f3702c.getDisplayCutout());
        }

        @Override // androidx.core.view.j0.l
        public int hashCode() {
            return this.f3702c.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class j extends i {

        /* renamed from: n */
        private androidx.core.graphics.b f3708n = null;

        /* renamed from: o */
        private androidx.core.graphics.b f3709o = null;

        /* renamed from: p */
        private androidx.core.graphics.b f3710p = null;

        j(j0 j0Var, WindowInsets windowInsets) {
            super(j0Var, windowInsets);
        }

        j(j0 j0Var, j jVar) {
            super(j0Var, jVar);
        }

        @Override // androidx.core.view.j0.l
        androidx.core.graphics.b h() {
            if (this.f3709o == null) {
                this.f3709o = androidx.core.graphics.b.d(this.f3702c.getMandatorySystemGestureInsets());
            }
            return this.f3709o;
        }

        @Override // androidx.core.view.j0.l
        androidx.core.graphics.b j() {
            if (this.f3708n == null) {
                this.f3708n = androidx.core.graphics.b.d(this.f3702c.getSystemGestureInsets());
            }
            return this.f3708n;
        }

        @Override // androidx.core.view.j0.l
        androidx.core.graphics.b l() {
            if (this.f3710p == null) {
                this.f3710p = androidx.core.graphics.b.d(this.f3702c.getTappableElementInsets());
            }
            return this.f3710p;
        }

        @Override // androidx.core.view.j0.g, androidx.core.view.j0.l
        j0 m(int i10, int i11, int i12, int i13) {
            return j0.u(this.f3702c.inset(i10, i11, i12, i13));
        }

        @Override // androidx.core.view.j0.h, androidx.core.view.j0.l
        public void s(androidx.core.graphics.b bVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class k extends j {

        /* renamed from: q */
        static final j0 f3711q = j0.u(WindowInsets.CONSUMED);

        k(j0 j0Var, WindowInsets windowInsets) {
            super(j0Var, windowInsets);
        }

        k(j0 j0Var, k kVar) {
            super(j0Var, kVar);
        }

        @Override // androidx.core.view.j0.g, androidx.core.view.j0.l
        final void d(View view) {
        }

        @Override // androidx.core.view.j0.g, androidx.core.view.j0.l
        public androidx.core.graphics.b g(int i10) {
            return androidx.core.graphics.b.d(this.f3702c.getInsets(n.a(i10)));
        }
    }

    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: b */
        static final j0 f3712b = new b().a().a().b().c();

        /* renamed from: a */
        final j0 f3713a;

        l(j0 j0Var) {
            this.f3713a = j0Var;
        }

        j0 a() {
            return this.f3713a;
        }

        j0 b() {
            return this.f3713a;
        }

        j0 c() {
            return this.f3713a;
        }

        void d(View view) {
        }

        void e(j0 j0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && androidx.core.util.c.a(k(), lVar.k()) && androidx.core.util.c.a(i(), lVar.i()) && androidx.core.util.c.a(f(), lVar.f());
        }

        androidx.core.view.d f() {
            return null;
        }

        androidx.core.graphics.b g(int i10) {
            return androidx.core.graphics.b.f3451e;
        }

        androidx.core.graphics.b h() {
            return k();
        }

        public int hashCode() {
            return androidx.core.util.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        androidx.core.graphics.b i() {
            return androidx.core.graphics.b.f3451e;
        }

        androidx.core.graphics.b j() {
            return k();
        }

        androidx.core.graphics.b k() {
            return androidx.core.graphics.b.f3451e;
        }

        androidx.core.graphics.b l() {
            return k();
        }

        j0 m(int i10, int i11, int i12, int i13) {
            return f3712b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        public void p(androidx.core.graphics.b[] bVarArr) {
        }

        void q(androidx.core.graphics.b bVar) {
        }

        void r(j0 j0Var) {
        }

        public void s(androidx.core.graphics.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static final class m {
        static int a(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return 1;
                }
                if (i10 == 4) {
                    return 2;
                }
                if (i10 == 8) {
                    return 3;
                }
                if (i10 == 16) {
                    return 4;
                }
                if (i10 == 32) {
                    return 5;
                }
                if (i10 == 64) {
                    return 6;
                }
                if (i10 == 128) {
                    return 7;
                }
                if (i10 == 256) {
                    return 8;
                }
                throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
            }
            return 0;
        }

        public static int b() {
            return 32;
        }

        public static int c() {
            return 7;
        }
    }

    /* loaded from: classes.dex */
    private static final class n {
        static int a(int i10) {
            int i11;
            int i12 = 0;
            for (int i13 = 1; i13 <= 256; i13 <<= 1) {
                if ((i10 & i13) != 0) {
                    if (i13 == 1) {
                        i11 = WindowInsets.Type.statusBars();
                    } else if (i13 == 2) {
                        i11 = WindowInsets.Type.navigationBars();
                    } else if (i13 == 4) {
                        i11 = WindowInsets.Type.captionBar();
                    } else if (i13 == 8) {
                        i11 = WindowInsets.Type.ime();
                    } else if (i13 == 16) {
                        i11 = WindowInsets.Type.systemGestures();
                    } else if (i13 == 32) {
                        i11 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i13 == 64) {
                        i11 = WindowInsets.Type.tappableElement();
                    } else if (i13 == 128) {
                        i11 = WindowInsets.Type.displayCutout();
                    }
                    i12 |= i11;
                }
            }
            return i12;
        }
    }

    static {
        f3681b = Build.VERSION.SDK_INT >= 30 ? k.f3711q : l.f3712b;
    }

    private j0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        this.f3682a = i10 >= 30 ? new k(this, windowInsets) : i10 >= 29 ? new j(this, windowInsets) : i10 >= 28 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    public j0(j0 j0Var) {
        if (j0Var == null) {
            this.f3682a = new l(this);
            return;
        }
        l lVar = j0Var.f3682a;
        int i10 = Build.VERSION.SDK_INT;
        this.f3682a = (i10 < 30 || !(lVar instanceof k)) ? (i10 < 29 || !(lVar instanceof j)) ? (i10 < 28 || !(lVar instanceof i)) ? lVar instanceof h ? new h(this, (h) lVar) : lVar instanceof g ? new g(this, (g) lVar) : new l(this) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.e(this);
    }

    static androidx.core.graphics.b m(androidx.core.graphics.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f3452a - i10);
        int max2 = Math.max(0, bVar.f3453b - i11);
        int max3 = Math.max(0, bVar.f3454c - i12);
        int max4 = Math.max(0, bVar.f3455d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? bVar : androidx.core.graphics.b.b(max, max2, max3, max4);
    }

    public static j0 u(WindowInsets windowInsets) {
        return v(windowInsets, null);
    }

    public static j0 v(WindowInsets windowInsets, View view) {
        j0 j0Var = new j0((WindowInsets) androidx.core.util.h.g(windowInsets));
        if (view != null && y.R(view)) {
            j0Var.r(y.H(view));
            j0Var.d(view.getRootView());
        }
        return j0Var;
    }

    @Deprecated
    public j0 a() {
        return this.f3682a.a();
    }

    @Deprecated
    public j0 b() {
        return this.f3682a.b();
    }

    @Deprecated
    public j0 c() {
        return this.f3682a.c();
    }

    public void d(View view) {
        this.f3682a.d(view);
    }

    public androidx.core.view.d e() {
        return this.f3682a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return androidx.core.util.c.a(this.f3682a, ((j0) obj).f3682a);
        }
        return false;
    }

    public androidx.core.graphics.b f(int i10) {
        return this.f3682a.g(i10);
    }

    @Deprecated
    public androidx.core.graphics.b g() {
        return this.f3682a.i();
    }

    @Deprecated
    public int h() {
        return this.f3682a.k().f3455d;
    }

    public int hashCode() {
        l lVar = this.f3682a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f3682a.k().f3452a;
    }

    @Deprecated
    public int j() {
        return this.f3682a.k().f3454c;
    }

    @Deprecated
    public int k() {
        return this.f3682a.k().f3453b;
    }

    public j0 l(int i10, int i11, int i12, int i13) {
        return this.f3682a.m(i10, i11, i12, i13);
    }

    public boolean n() {
        return this.f3682a.n();
    }

    @Deprecated
    public j0 o(int i10, int i11, int i12, int i13) {
        return new b(this).c(androidx.core.graphics.b.b(i10, i11, i12, i13)).a();
    }

    void p(androidx.core.graphics.b[] bVarArr) {
        this.f3682a.p(bVarArr);
    }

    void q(androidx.core.graphics.b bVar) {
        this.f3682a.q(bVar);
    }

    public void r(j0 j0Var) {
        this.f3682a.r(j0Var);
    }

    void s(androidx.core.graphics.b bVar) {
        this.f3682a.s(bVar);
    }

    public WindowInsets t() {
        l lVar = this.f3682a;
        if (lVar instanceof g) {
            return ((g) lVar).f3702c;
        }
        return null;
    }
}
