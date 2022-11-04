package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
/* loaded from: classes.dex */
public class x0 implements d0 {

    /* renamed from: a */
    Toolbar f667a;

    /* renamed from: b */
    private int f668b;

    /* renamed from: c */
    private View f669c;

    /* renamed from: d */
    private View f670d;

    /* renamed from: e */
    private Drawable f671e;

    /* renamed from: f */
    private Drawable f672f;

    /* renamed from: g */
    private Drawable f673g;

    /* renamed from: h */
    private boolean f674h;
    CharSequence i;
    private CharSequence j;
    private CharSequence k;
    Window.Callback l;
    boolean m;
    private c n;
    private int o;
    private int p;
    private Drawable q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b */
        final androidx.appcompat.view.menu.a f675b;

        a() {
            x0.this = r9;
            this.f675b = new androidx.appcompat.view.menu.a(r9.f667a.getContext(), 0, 16908332, 0, 0, r9.i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x0 x0Var = x0.this;
            Window.Callback callback = x0Var.l;
            if (callback == null || !x0Var.m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f675b);
        }
    }

    /* loaded from: classes.dex */
    class b extends b.g.l.z {

        /* renamed from: a */
        private boolean f677a = false;

        /* renamed from: b */
        final /* synthetic */ int f678b;

        b(int i) {
            x0.this = r1;
            this.f678b = i;
        }

        @Override // b.g.l.y
        public void a(View view) {
            if (!this.f677a) {
                x0.this.f667a.setVisibility(this.f678b);
            }
        }

        @Override // b.g.l.z, b.g.l.y
        public void b(View view) {
            x0.this.f667a.setVisibility(0);
        }

        @Override // b.g.l.z, b.g.l.y
        public void c(View view) {
            this.f677a = true;
        }
    }

    public x0(Toolbar toolbar, boolean z) {
        this(toolbar, z, b.a.h.a_res_0x7f100008, b.a.e.n);
    }

    public x0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.f667a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.f674h = this.i != null;
        this.f673g = toolbar.getNavigationIcon();
        w0 v = w0.v(toolbar.getContext(), null, b.a.j.f1990a, b.a.a.c_res_0x7f040006, 0);
        this.q = v.g(b.a.j.l);
        if (z) {
            CharSequence p = v.p(b.a.j.r);
            if (!TextUtils.isEmpty(p)) {
                setTitle(p);
            }
            CharSequence p2 = v.p(b.a.j.p);
            if (!TextUtils.isEmpty(p2)) {
                F(p2);
            }
            Drawable g2 = v.g(b.a.j.n);
            if (g2 != null) {
                D(g2);
            }
            Drawable g3 = v.g(b.a.j.m);
            if (g3 != null) {
                setIcon(g3);
            }
            if (this.f673g == null && (drawable = this.q) != null) {
                x(drawable);
            }
            z(v.k(b.a.j.f1997h, 0));
            int n = v.n(b.a.j.f1996g, 0);
            if (n != 0) {
                B(LayoutInflater.from(this.f667a.getContext()).inflate(n, (ViewGroup) this.f667a, false));
                z(this.f668b | 16);
            }
            int m = v.m(b.a.j.j, 0);
            if (m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f667a.getLayoutParams();
                layoutParams.height = m;
                this.f667a.setLayoutParams(layoutParams);
            }
            int e2 = v.e(b.a.j.f1995f, -1);
            int e3 = v.e(b.a.j.f1994e, -1);
            if (e2 >= 0 || e3 >= 0) {
                this.f667a.H(Math.max(e2, 0), Math.max(e3, 0));
            }
            int n2 = v.n(b.a.j.s, 0);
            if (n2 != 0) {
                Toolbar toolbar2 = this.f667a;
                toolbar2.L(toolbar2.getContext(), n2);
            }
            int n3 = v.n(b.a.j.q, 0);
            if (n3 != 0) {
                Toolbar toolbar3 = this.f667a;
                toolbar3.K(toolbar3.getContext(), n3);
            }
            int n4 = v.n(b.a.j.o, 0);
            if (n4 != 0) {
                this.f667a.setPopupTheme(n4);
            }
        } else {
            this.f668b = A();
        }
        v.w();
        C(i);
        this.k = this.f667a.getNavigationContentDescription();
        this.f667a.setNavigationOnClickListener(new a());
    }

    private int A() {
        if (this.f667a.getNavigationIcon() != null) {
            this.q = this.f667a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    private void G(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.f668b & 8) != 0) {
            this.f667a.setTitle(charSequence);
        }
    }

    private void H() {
        if ((this.f668b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.f667a.setNavigationContentDescription(this.p);
            } else {
                this.f667a.setNavigationContentDescription(this.k);
            }
        }
    }

    private void I() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f668b & 4) != 0) {
            toolbar = this.f667a;
            drawable = this.f673g;
            if (drawable == null) {
                drawable = this.q;
            }
        } else {
            toolbar = this.f667a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void J() {
        Drawable drawable;
        int i = this.f668b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f672f) == null) {
            drawable = this.f671e;
        }
        this.f667a.setLogo(drawable);
    }

    public void B(View view) {
        View view2 = this.f670d;
        if (view2 != null && (this.f668b & 16) != 0) {
            this.f667a.removeView(view2);
        }
        this.f670d = view;
        if (view == null || (this.f668b & 16) == 0) {
            return;
        }
        this.f667a.addView(view);
    }

    public void C(int i) {
        if (i == this.p) {
            return;
        }
        this.p = i;
        if (!TextUtils.isEmpty(this.f667a.getNavigationContentDescription())) {
            return;
        }
        p(this.p);
    }

    public void D(Drawable drawable) {
        this.f672f = drawable;
        J();
    }

    public void E(CharSequence charSequence) {
        this.k = charSequence;
        H();
    }

    public void F(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.f668b & 8) != 0) {
            this.f667a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.d0
    public void a(Menu menu, m.a aVar) {
        if (this.n == null) {
            c cVar = new c(this.f667a.getContext());
            this.n = cVar;
            cVar.s(b.a.f.g_res_0x7f09004a);
        }
        this.n.k(aVar);
        this.f667a.I((androidx.appcompat.view.menu.g) menu, this.n);
    }

    @Override // androidx.appcompat.widget.d0
    public boolean b() {
        return this.f667a.z();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean c() {
        return this.f667a.A();
    }

    @Override // androidx.appcompat.widget.d0
    public void collapseActionView() {
        this.f667a.e();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean d() {
        return this.f667a.w();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean e() {
        return this.f667a.O();
    }

    @Override // androidx.appcompat.widget.d0
    public void f() {
        this.m = true;
    }

    @Override // androidx.appcompat.widget.d0
    public boolean g() {
        return this.f667a.d();
    }

    @Override // androidx.appcompat.widget.d0
    public CharSequence getTitle() {
        return this.f667a.getTitle();
    }

    @Override // androidx.appcompat.widget.d0
    public void h() {
        this.f667a.f();
    }

    @Override // androidx.appcompat.widget.d0
    public void i(m.a aVar, g.a aVar2) {
        this.f667a.J(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.d0
    public int j() {
        return this.f668b;
    }

    @Override // androidx.appcompat.widget.d0
    public void k(int i) {
        this.f667a.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.d0
    public Menu l() {
        return this.f667a.getMenu();
    }

    @Override // androidx.appcompat.widget.d0
    public void m(int i) {
        D(i != 0 ? b.a.k.a.a.d(r(), i) : null);
    }

    @Override // androidx.appcompat.widget.d0
    public void n(p0 p0Var) {
        View view = this.f669c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f667a;
            if (parent == toolbar) {
                toolbar.removeView(this.f669c);
            }
        }
        this.f669c = p0Var;
        if (p0Var == null || this.o != 2) {
            return;
        }
        this.f667a.addView(p0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f669c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f139a = 8388691;
        p0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.d0
    public ViewGroup o() {
        return this.f667a;
    }

    @Override // androidx.appcompat.widget.d0
    public void p(int i) {
        E(i == 0 ? null : r().getString(i));
    }

    @Override // androidx.appcompat.widget.d0
    public void q(boolean z) {
    }

    @Override // androidx.appcompat.widget.d0
    public Context r() {
        return this.f667a.getContext();
    }

    @Override // androidx.appcompat.widget.d0
    public int s() {
        return this.o;
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(int i) {
        setIcon(i != 0 ? b.a.k.a.a.d(r(), i) : null);
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(Drawable drawable) {
        this.f671e = drawable;
        J();
    }

    @Override // androidx.appcompat.widget.d0
    public void setTitle(CharSequence charSequence) {
        this.f674h = true;
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f674h) {
            G(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.d0
    public b.g.l.x t(int i, long j) {
        b.g.l.x c2 = b.g.l.t.c(this.f667a);
        c2.a(i == 0 ? 1.0f : 0.0f);
        c2.d(j);
        c2.f(new b(i));
        return c2;
    }

    @Override // androidx.appcompat.widget.d0
    public void u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d0
    public boolean v() {
        return this.f667a.v();
    }

    @Override // androidx.appcompat.widget.d0
    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d0
    public void x(Drawable drawable) {
        this.f673g = drawable;
        I();
    }

    @Override // androidx.appcompat.widget.d0
    public void y(boolean z) {
        this.f667a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.d0
    public void z(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f668b ^ i;
        this.f668b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i2 & 3) != 0) {
                J();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f667a.setTitle(this.i);
                    toolbar = this.f667a;
                    charSequence = this.j;
                } else {
                    charSequence = null;
                    this.f667a.setTitle((CharSequence) null);
                    toolbar = this.f667a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.f670d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f667a.addView(view);
            } else {
                this.f667a.removeView(view);
            }
        }
    }
}
