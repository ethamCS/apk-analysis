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
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
/* loaded from: classes.dex */
public class c1 implements g0 {

    /* renamed from: a */
    Toolbar f1260a;

    /* renamed from: b */
    private int f1261b;

    /* renamed from: c */
    private View f1262c;

    /* renamed from: d */
    private View f1263d;

    /* renamed from: e */
    private Drawable f1264e;

    /* renamed from: f */
    private Drawable f1265f;

    /* renamed from: g */
    private Drawable f1266g;

    /* renamed from: h */
    private boolean f1267h;

    /* renamed from: i */
    CharSequence f1268i;

    /* renamed from: j */
    private CharSequence f1269j;

    /* renamed from: k */
    private CharSequence f1270k;

    /* renamed from: l */
    Window.Callback f1271l;

    /* renamed from: m */
    boolean f1272m;

    /* renamed from: n */
    private c f1273n;

    /* renamed from: o */
    private int f1274o;

    /* renamed from: p */
    private int f1275p;

    /* renamed from: q */
    private Drawable f1276q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: c */
        final l.a f1277c;

        a() {
            c1.this = r9;
            this.f1277c = new l.a(r9.f1260a.getContext(), 0, 16908332, 0, 0, r9.f1268i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c1 c1Var = c1.this;
            Window.Callback callback = c1Var.f1271l;
            if (callback == null || !c1Var.f1272m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1277c);
        }
    }

    /* loaded from: classes.dex */
    class b extends androidx.core.view.g0 {

        /* renamed from: a */
        private boolean f1279a = false;

        /* renamed from: b */
        final /* synthetic */ int f1280b;

        b(int i10) {
            c1.this = r1;
            this.f1280b = i10;
        }

        @Override // androidx.core.view.g0, androidx.core.view.f0
        public void a(View view) {
            this.f1279a = true;
        }

        @Override // androidx.core.view.f0
        public void b(View view) {
            if (!this.f1279a) {
                c1.this.f1260a.setVisibility(this.f1280b);
            }
        }

        @Override // androidx.core.view.g0, androidx.core.view.f0
        public void c(View view) {
            c1.this.f1260a.setVisibility(0);
        }
    }

    public c1(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, e.h.a_res_0x7f10005c, e.e.f9195n);
    }

    public c1(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1274o = 0;
        this.f1275p = 0;
        this.f1260a = toolbar;
        this.f1268i = toolbar.getTitle();
        this.f1269j = toolbar.getSubtitle();
        this.f1267h = this.f1268i != null;
        this.f1266g = toolbar.getNavigationIcon();
        a1 v10 = a1.v(toolbar.getContext(), null, e.j.f9209a, e.a.c_res_0x7f030007, 0);
        this.f1276q = v10.g(e.j.f9264l);
        if (z10) {
            CharSequence p10 = v10.p(e.j.f9294r);
            if (!TextUtils.isEmpty(p10)) {
                H(p10);
            }
            CharSequence p11 = v10.p(e.j.f9284p);
            if (!TextUtils.isEmpty(p11)) {
                G(p11);
            }
            Drawable g10 = v10.g(e.j.f9274n);
            if (g10 != null) {
                D(g10);
            }
            Drawable g11 = v10.g(e.j.f9269m);
            if (g11 != null) {
                setIcon(g11);
            }
            if (this.f1266g == null && (drawable = this.f1276q) != null) {
                F(drawable);
            }
            p(v10.k(e.j.f9244h, 0));
            int n10 = v10.n(e.j.f9239g, 0);
            if (n10 != 0) {
                B(LayoutInflater.from(this.f1260a.getContext()).inflate(n10, (ViewGroup) this.f1260a, false));
                p(this.f1261b | 16);
            }
            int m10 = v10.m(e.j.f9254j, 0);
            if (m10 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1260a.getLayoutParams();
                layoutParams.height = m10;
                this.f1260a.setLayoutParams(layoutParams);
            }
            int e10 = v10.e(e.j.f9234f, -1);
            int e11 = v10.e(e.j.f9229e, -1);
            if (e10 >= 0 || e11 >= 0) {
                this.f1260a.L(Math.max(e10, 0), Math.max(e11, 0));
            }
            int n11 = v10.n(e.j.f9299s, 0);
            if (n11 != 0) {
                Toolbar toolbar2 = this.f1260a;
                toolbar2.P(toolbar2.getContext(), n11);
            }
            int n12 = v10.n(e.j.f9289q, 0);
            if (n12 != 0) {
                Toolbar toolbar3 = this.f1260a;
                toolbar3.O(toolbar3.getContext(), n12);
            }
            int n13 = v10.n(e.j.f9279o, 0);
            if (n13 != 0) {
                this.f1260a.setPopupTheme(n13);
            }
        } else {
            this.f1261b = A();
        }
        v10.w();
        C(i10);
        this.f1270k = this.f1260a.getNavigationContentDescription();
        this.f1260a.setNavigationOnClickListener(new a());
    }

    private int A() {
        if (this.f1260a.getNavigationIcon() != null) {
            this.f1276q = this.f1260a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    private void I(CharSequence charSequence) {
        this.f1268i = charSequence;
        if ((this.f1261b & 8) != 0) {
            this.f1260a.setTitle(charSequence);
            if (!this.f1267h) {
                return;
            }
            androidx.core.view.y.r0(this.f1260a.getRootView(), charSequence);
        }
    }

    private void J() {
        if ((this.f1261b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1270k)) {
                this.f1260a.setNavigationContentDescription(this.f1275p);
            } else {
                this.f1260a.setNavigationContentDescription(this.f1270k);
            }
        }
    }

    private void K() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f1261b & 4) != 0) {
            toolbar = this.f1260a;
            drawable = this.f1266g;
            if (drawable == null) {
                drawable = this.f1276q;
            }
        } else {
            toolbar = this.f1260a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void L() {
        Drawable drawable;
        int i10 = this.f1261b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1265f) == null) {
            drawable = this.f1264e;
        }
        this.f1260a.setLogo(drawable);
    }

    public void B(View view) {
        View view2 = this.f1263d;
        if (view2 != null && (this.f1261b & 16) != 0) {
            this.f1260a.removeView(view2);
        }
        this.f1263d = view;
        if (view == null || (this.f1261b & 16) == 0) {
            return;
        }
        this.f1260a.addView(view);
    }

    public void C(int i10) {
        if (i10 == this.f1275p) {
            return;
        }
        this.f1275p = i10;
        if (!TextUtils.isEmpty(this.f1260a.getNavigationContentDescription())) {
            return;
        }
        t(this.f1275p);
    }

    public void D(Drawable drawable) {
        this.f1265f = drawable;
        L();
    }

    public void E(CharSequence charSequence) {
        this.f1270k = charSequence;
        J();
    }

    public void F(Drawable drawable) {
        this.f1266g = drawable;
        K();
    }

    public void G(CharSequence charSequence) {
        this.f1269j = charSequence;
        if ((this.f1261b & 8) != 0) {
            this.f1260a.setSubtitle(charSequence);
        }
    }

    public void H(CharSequence charSequence) {
        this.f1267h = true;
        I(charSequence);
    }

    @Override // androidx.appcompat.widget.g0
    public void a(Menu menu, j.a aVar) {
        if (this.f1273n == null) {
            c cVar = new c(this.f1260a.getContext());
            this.f1273n = cVar;
            cVar.p(e.f.g_res_0x7f090041);
        }
        this.f1273n.k(aVar);
        this.f1260a.M((androidx.appcompat.view.menu.e) menu, this.f1273n);
    }

    @Override // androidx.appcompat.widget.g0
    public Context b() {
        return this.f1260a.getContext();
    }

    @Override // androidx.appcompat.widget.g0
    public boolean c() {
        return this.f1260a.D();
    }

    @Override // androidx.appcompat.widget.g0
    public void collapseActionView() {
        this.f1260a.e();
    }

    @Override // androidx.appcompat.widget.g0
    public void d() {
        this.f1272m = true;
    }

    @Override // androidx.appcompat.widget.g0
    public boolean e() {
        return this.f1260a.B();
    }

    @Override // androidx.appcompat.widget.g0
    public boolean f() {
        return this.f1260a.x();
    }

    @Override // androidx.appcompat.widget.g0
    public boolean g() {
        return this.f1260a.S();
    }

    @Override // androidx.appcompat.widget.g0
    public CharSequence getTitle() {
        return this.f1260a.getTitle();
    }

    @Override // androidx.appcompat.widget.g0
    public boolean h() {
        return this.f1260a.d();
    }

    @Override // androidx.appcompat.widget.g0
    public void i() {
        this.f1260a.f();
    }

    @Override // androidx.appcompat.widget.g0
    public void j(j.a aVar, e.a aVar2) {
        this.f1260a.N(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.g0
    public void k(int i10) {
        this.f1260a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.g0
    public void l(s0 s0Var) {
        View view = this.f1262c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1260a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1262c);
            }
        }
        this.f1262c = s0Var;
        if (s0Var == null || this.f1274o != 2) {
            return;
        }
        this.f1260a.addView(s0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f1262c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f706a = 8388691;
        s0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.g0
    public ViewGroup m() {
        return this.f1260a;
    }

    @Override // androidx.appcompat.widget.g0
    public void n(boolean z10) {
    }

    @Override // androidx.appcompat.widget.g0
    public boolean o() {
        return this.f1260a.w();
    }

    @Override // androidx.appcompat.widget.g0
    public void p(int i10) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i11 = this.f1261b ^ i10;
        this.f1261b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    J();
                }
                K();
            }
            if ((i11 & 3) != 0) {
                L();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1260a.setTitle(this.f1268i);
                    toolbar = this.f1260a;
                    charSequence = this.f1269j;
                } else {
                    charSequence = null;
                    this.f1260a.setTitle((CharSequence) null);
                    toolbar = this.f1260a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) == 0 || (view = this.f1263d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1260a.addView(view);
            } else {
                this.f1260a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.g0
    public int q() {
        return this.f1261b;
    }

    @Override // androidx.appcompat.widget.g0
    public Menu r() {
        return this.f1260a.getMenu();
    }

    @Override // androidx.appcompat.widget.g0
    public void s(int i10) {
        D(i10 != 0 ? g.a.b(b(), i10) : null);
    }

    @Override // androidx.appcompat.widget.g0
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? g.a.b(b(), i10) : null);
    }

    @Override // androidx.appcompat.widget.g0
    public void setIcon(Drawable drawable) {
        this.f1264e = drawable;
        L();
    }

    @Override // androidx.appcompat.widget.g0
    public void setWindowCallback(Window.Callback callback) {
        this.f1271l = callback;
    }

    @Override // androidx.appcompat.widget.g0
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1267h) {
            I(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.g0
    public void t(int i10) {
        E(i10 == 0 ? null : b().getString(i10));
    }

    @Override // androidx.appcompat.widget.g0
    public int u() {
        return this.f1274o;
    }

    @Override // androidx.appcompat.widget.g0
    public androidx.core.view.e0 v(int i10, long j10) {
        return androidx.core.view.y.e(this.f1260a).b(i10 == 0 ? 1.0f : 0.0f).f(j10).h(new b(i10));
    }

    @Override // androidx.appcompat.widget.g0
    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.g0
    public void x() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.g0
    public void y(boolean z10) {
        this.f1260a.setCollapsible(z10);
    }

    @Override // androidx.appcompat.widget.g0
    public void z(int i10) {
        F(i10 != 0 ? g.a.b(b(), i10) : null);
    }
}
