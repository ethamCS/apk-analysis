package b.g.l;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Objects;
/* loaded from: classes.dex */
public class b0 {

    /* renamed from: b */
    public static final b0 f2503b = new a().a().a().b().c();

    /* renamed from: a */
    private final i f2504a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final d f2505a;

        public a() {
            int i = Build.VERSION.SDK_INT;
            this.f2505a = i >= 29 ? new c() : i >= 20 ? new b() : new d();
        }

        public a(b0 b0Var) {
            int i = Build.VERSION.SDK_INT;
            this.f2505a = i >= 29 ? new c(b0Var) : i >= 20 ? new b(b0Var) : new d(b0Var);
        }

        public b0 a() {
            return this.f2505a.a();
        }

        public a b(b.g.e.b bVar) {
            this.f2505a.b(bVar);
            return this;
        }

        public a c(b.g.e.b bVar) {
            this.f2505a.c(bVar);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends d {

        /* renamed from: c */
        private static Field f2506c = null;

        /* renamed from: d */
        private static boolean f2507d = false;

        /* renamed from: e */
        private static Constructor<WindowInsets> f2508e = null;

        /* renamed from: f */
        private static boolean f2509f = false;

        /* renamed from: b */
        private WindowInsets f2510b;

        b() {
            this.f2510b = d();
        }

        b(b0 b0Var) {
            this.f2510b = b0Var.p();
        }

        private static WindowInsets d() {
            if (!f2507d) {
                try {
                    f2506c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f2507d = true;
            }
            Field field = f2506c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f2509f) {
                try {
                    f2508e = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f2509f = true;
            }
            Constructor<WindowInsets> constructor = f2508e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // b.g.l.b0.d
        b0 a() {
            return b0.q(this.f2510b);
        }

        @Override // b.g.l.b0.d
        void c(b.g.e.b bVar) {
            WindowInsets windowInsets = this.f2510b;
            if (windowInsets != null) {
                this.f2510b = windowInsets.replaceSystemWindowInsets(bVar.f2378a, bVar.f2379b, bVar.f2380c, bVar.f2381d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends d {

        /* renamed from: b */
        final WindowInsets.Builder f2511b;

        c() {
            this.f2511b = new WindowInsets.Builder();
        }

        c(b0 b0Var) {
            WindowInsets p = b0Var.p();
            this.f2511b = p != null ? new WindowInsets.Builder(p) : new WindowInsets.Builder();
        }

        @Override // b.g.l.b0.d
        b0 a() {
            return b0.q(this.f2511b.build());
        }

        @Override // b.g.l.b0.d
        void b(b.g.e.b bVar) {
            this.f2511b.setStableInsets(bVar.c());
        }

        @Override // b.g.l.b0.d
        void c(b.g.e.b bVar) {
            this.f2511b.setSystemWindowInsets(bVar.c());
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        private final b0 f2512a;

        d() {
            this(new b0((b0) null));
        }

        d(b0 b0Var) {
            this.f2512a = b0Var;
        }

        b0 a() {
            return this.f2512a;
        }

        void b(b.g.e.b bVar) {
        }

        void c(b.g.e.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static class e extends i {

        /* renamed from: b */
        final WindowInsets f2513b;

        /* renamed from: c */
        private b.g.e.b f2514c;

        e(b0 b0Var, WindowInsets windowInsets) {
            super(b0Var);
            this.f2514c = null;
            this.f2513b = windowInsets;
        }

        e(b0 b0Var, e eVar) {
            this(b0Var, new WindowInsets(eVar.f2513b));
        }

        @Override // b.g.l.b0.i
        final b.g.e.b h() {
            if (this.f2514c == null) {
                this.f2514c = b.g.e.b.a(this.f2513b.getSystemWindowInsetLeft(), this.f2513b.getSystemWindowInsetTop(), this.f2513b.getSystemWindowInsetRight(), this.f2513b.getSystemWindowInsetBottom());
            }
            return this.f2514c;
        }

        @Override // b.g.l.b0.i
        b0 i(int i, int i2, int i3, int i4) {
            a aVar = new a(b0.q(this.f2513b));
            aVar.c(b0.m(h(), i, i2, i3, i4));
            aVar.b(b0.m(f(), i, i2, i3, i4));
            return aVar.a();
        }

        @Override // b.g.l.b0.i
        boolean k() {
            return this.f2513b.isRound();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f extends e {

        /* renamed from: d */
        private b.g.e.b f2515d = null;

        f(b0 b0Var, WindowInsets windowInsets) {
            super(b0Var, windowInsets);
        }

        f(b0 b0Var, f fVar) {
            super(b0Var, fVar);
        }

        @Override // b.g.l.b0.i
        b0 b() {
            return b0.q(this.f2513b.consumeStableInsets());
        }

        @Override // b.g.l.b0.i
        b0 c() {
            return b0.q(this.f2513b.consumeSystemWindowInsets());
        }

        @Override // b.g.l.b0.i
        final b.g.e.b f() {
            if (this.f2515d == null) {
                this.f2515d = b.g.e.b.a(this.f2513b.getStableInsetLeft(), this.f2513b.getStableInsetTop(), this.f2513b.getStableInsetRight(), this.f2513b.getStableInsetBottom());
            }
            return this.f2515d;
        }

        @Override // b.g.l.b0.i
        boolean j() {
            return this.f2513b.isConsumed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g extends f {
        g(b0 b0Var, WindowInsets windowInsets) {
            super(b0Var, windowInsets);
        }

        g(b0 b0Var, g gVar) {
            super(b0Var, gVar);
        }

        @Override // b.g.l.b0.i
        b0 a() {
            return b0.q(this.f2513b.consumeDisplayCutout());
        }

        @Override // b.g.l.b0.i
        b.g.l.c d() {
            return b.g.l.c.a(this.f2513b.getDisplayCutout());
        }

        @Override // b.g.l.b0.i
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                return Objects.equals(this.f2513b, ((g) obj).f2513b);
            }
            return false;
        }

        @Override // b.g.l.b0.i
        public int hashCode() {
            return this.f2513b.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends g {

        /* renamed from: e */
        private b.g.e.b f2516e = null;

        /* renamed from: f */
        private b.g.e.b f2517f = null;

        h(b0 b0Var, WindowInsets windowInsets) {
            super(b0Var, windowInsets);
        }

        h(b0 b0Var, h hVar) {
            super(b0Var, hVar);
        }

        @Override // b.g.l.b0.i
        b.g.e.b e() {
            if (this.f2517f == null) {
                this.f2517f = b.g.e.b.b(this.f2513b.getMandatorySystemGestureInsets());
            }
            return this.f2517f;
        }

        @Override // b.g.l.b0.i
        b.g.e.b g() {
            if (this.f2516e == null) {
                this.f2516e = b.g.e.b.b(this.f2513b.getSystemGestureInsets());
            }
            return this.f2516e;
        }

        @Override // b.g.l.b0.e, b.g.l.b0.i
        b0 i(int i, int i2, int i3, int i4) {
            return b0.q(this.f2513b.inset(i, i2, i3, i4));
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a */
        final b0 f2518a;

        i(b0 b0Var) {
            this.f2518a = b0Var;
        }

        b0 a() {
            return this.f2518a;
        }

        b0 b() {
            return this.f2518a;
        }

        b0 c() {
            return this.f2518a;
        }

        b.g.l.c d() {
            return null;
        }

        b.g.e.b e() {
            return h();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return k() == iVar.k() && j() == iVar.j() && b.g.k.c.a(h(), iVar.h()) && b.g.k.c.a(f(), iVar.f()) && b.g.k.c.a(d(), iVar.d());
        }

        b.g.e.b f() {
            return b.g.e.b.f2377e;
        }

        b.g.e.b g() {
            return h();
        }

        b.g.e.b h() {
            return b.g.e.b.f2377e;
        }

        public int hashCode() {
            return b.g.k.c.b(Boolean.valueOf(k()), Boolean.valueOf(j()), h(), f(), d());
        }

        b0 i(int i, int i2, int i3, int i4) {
            return b0.f2503b;
        }

        boolean j() {
            return false;
        }

        boolean k() {
            return false;
        }
    }

    private b0(WindowInsets windowInsets) {
        i eVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            eVar = new h(this, windowInsets);
        } else if (i2 >= 28) {
            eVar = new g(this, windowInsets);
        } else if (i2 >= 21) {
            eVar = new f(this, windowInsets);
        } else if (i2 < 20) {
            this.f2504a = new i(this);
            return;
        } else {
            eVar = new e(this, windowInsets);
        }
        this.f2504a = eVar;
    }

    public b0(b0 b0Var) {
        i iVar;
        i eVar;
        if (b0Var != null) {
            i iVar2 = b0Var.f2504a;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 29 && (iVar2 instanceof h)) {
                eVar = new h(this, (h) iVar2);
            } else if (i2 >= 28 && (iVar2 instanceof g)) {
                eVar = new g(this, (g) iVar2);
            } else if (i2 >= 21 && (iVar2 instanceof f)) {
                eVar = new f(this, (f) iVar2);
            } else if (i2 < 20 || !(iVar2 instanceof e)) {
                iVar = new i(this);
            } else {
                eVar = new e(this, (e) iVar2);
            }
            this.f2504a = eVar;
            return;
        }
        iVar = new i(this);
        this.f2504a = iVar;
    }

    static b.g.e.b m(b.g.e.b bVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, bVar.f2378a - i2);
        int max2 = Math.max(0, bVar.f2379b - i3);
        int max3 = Math.max(0, bVar.f2380c - i4);
        int max4 = Math.max(0, bVar.f2381d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? bVar : b.g.e.b.a(max, max2, max3, max4);
    }

    public static b0 q(WindowInsets windowInsets) {
        b.g.k.h.c(windowInsets);
        return new b0(windowInsets);
    }

    public b0 a() {
        return this.f2504a.a();
    }

    public b0 b() {
        return this.f2504a.b();
    }

    public b0 c() {
        return this.f2504a.c();
    }

    public b.g.e.b d() {
        return this.f2504a.e();
    }

    public b.g.e.b e() {
        return this.f2504a.g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            return b.g.k.c.a(this.f2504a, ((b0) obj).f2504a);
        }
        return false;
    }

    public int f() {
        return j().f2381d;
    }

    public int g() {
        return j().f2378a;
    }

    public int h() {
        return j().f2380c;
    }

    public int hashCode() {
        i iVar = this.f2504a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public int i() {
        return j().f2379b;
    }

    public b.g.e.b j() {
        return this.f2504a.h();
    }

    public boolean k() {
        return !j().equals(b.g.e.b.f2377e);
    }

    public b0 l(int i2, int i3, int i4, int i5) {
        return this.f2504a.i(i2, i3, i4, i5);
    }

    public boolean n() {
        return this.f2504a.j();
    }

    @Deprecated
    public b0 o(int i2, int i3, int i4, int i5) {
        a aVar = new a(this);
        aVar.c(b.g.e.b.a(i2, i3, i4, i5));
        return aVar.a();
    }

    public WindowInsets p() {
        i iVar = this.f2504a;
        if (iVar instanceof e) {
            return ((e) iVar).f2513b;
        }
        return null;
    }
}
