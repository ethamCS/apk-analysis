package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a */
    private final e f3714a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends e {

        /* renamed from: a */
        protected final Window f3715a;

        /* renamed from: b */
        private final View f3716b;

        a(Window window, View view) {
            this.f3715a = window;
            this.f3716b = view;
        }

        protected void c(int i10) {
            View decorView = this.f3715a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void d(int i10) {
            this.f3715a.addFlags(i10);
        }

        protected void e(int i10) {
            View decorView = this.f3715a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        protected void f(int i10) {
            this.f3715a.clearFlags(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.k0.e
        public void b(boolean z10) {
            if (!z10) {
                e(8192);
                return;
            }
            f(67108864);
            d(Integer.MIN_VALUE);
            c(8192);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.k0.e
        public void a(boolean z10) {
            if (!z10) {
                e(16);
                return;
            }
            f(134217728);
            d(Integer.MIN_VALUE);
            c(16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a */
        final k0 f3717a;

        /* renamed from: b */
        final WindowInsetsController f3718b;

        /* renamed from: c */
        private final i0.g<Object, WindowInsetsController.OnControllableInsetsChangedListener> f3719c;

        /* renamed from: d */
        protected Window f3720d;

        d(Window window, k0 k0Var) {
            this(window.getInsetsController(), k0Var);
            this.f3720d = window;
        }

        d(WindowInsetsController windowInsetsController, k0 k0Var) {
            this.f3719c = new i0.g<>();
            this.f3718b = windowInsetsController;
            this.f3717a = k0Var;
        }

        @Override // androidx.core.view.k0.e
        public void a(boolean z10) {
            if (z10) {
                if (this.f3720d != null) {
                    c(16);
                }
                this.f3718b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f3720d != null) {
                d(16);
            }
            this.f3718b.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.core.view.k0.e
        public void b(boolean z10) {
            if (z10) {
                if (this.f3720d != null) {
                    c(8192);
                }
                this.f3718b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f3720d != null) {
                d(8192);
            }
            this.f3718b.setSystemBarsAppearance(0, 8);
        }

        protected void c(int i10) {
            View decorView = this.f3720d.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void d(int i10) {
            View decorView = this.f3720d.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e {
        e() {
        }

        public void a(boolean z10) {
        }

        public void b(boolean z10) {
            throw null;
        }
    }

    public k0(Window window, View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f3714a = new d(window, this);
        } else {
            this.f3714a = i10 >= 26 ? new c(window, view) : new b(window, view);
        }
    }

    public void a(boolean z10) {
        this.f3714a.a(z10);
    }

    public void b(boolean z10) {
        this.f3714a.b(z10);
    }
}
