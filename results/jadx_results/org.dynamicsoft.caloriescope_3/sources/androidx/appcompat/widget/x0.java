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
    Toolbar f772a;

    /* renamed from: b */
    private int f773b;

    /* renamed from: c */
    private View f774c;
    private View d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private boolean h;
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
        final androidx.appcompat.view.menu.a f775b;

        a() {
            x0.this = r8;
            this.f775b = new androidx.appcompat.view.menu.a(x0.this.f772a.getContext(), 0, 16908332, 0, 0, x0.this.i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            x0 x0Var = x0.this;
            Window.Callback callback = x0Var.l;
            if (callback == null || !x0Var.m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f775b);
        }
    }

    /* loaded from: classes.dex */
    class b extends a.g.l.a0 {

        /* renamed from: a */
        private boolean f777a = false;

        /* renamed from: b */
        final /* synthetic */ int f778b;

        b(int i) {
            x0.this = r1;
            this.f778b = i;
        }

        @Override // a.g.l.z
        public void a(View view) {
            if (!this.f777a) {
                x0.this.f772a.setVisibility(this.f778b);
            }
        }

        @Override // a.g.l.a0, a.g.l.z
        public void b(View view) {
            x0.this.f772a.setVisibility(0);
        }

        @Override // a.g.l.a0, a.g.l.z
        public void c(View view) {
            this.f777a = true;
        }
    }

    public x0(Toolbar toolbar, boolean z) {
        this(toolbar, z, a.a.h.abc_action_bar_up_description, a.a.e.abc_ic_ab_back_material);
    }

    public x0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.f772a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        w0 a2 = w0.a(toolbar.getContext(), null, a.a.j.ActionBar, a.a.a.actionBarStyle, 0);
        this.q = a2.b(a.a.j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence e = a2.e(a.a.j.ActionBar_title);
            if (!TextUtils.isEmpty(e)) {
                c(e);
            }
            CharSequence e2 = a2.e(a.a.j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(e2)) {
                b(e2);
            }
            Drawable b2 = a2.b(a.a.j.ActionBar_logo);
            if (b2 != null) {
                b(b2);
            }
            Drawable b3 = a2.b(a.a.j.ActionBar_icon);
            if (b3 != null) {
                setIcon(b3);
            }
            if (this.g == null && (drawable = this.q) != null) {
                a(drawable);
            }
            d(a2.d(a.a.j.ActionBar_displayOptions, 0));
            int g = a2.g(a.a.j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                a(LayoutInflater.from(this.f772a.getContext()).inflate(g, (ViewGroup) this.f772a, false));
                d(this.f773b | 16);
            }
            int f = a2.f(a.a.j.ActionBar_height, 0);
            if (f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f772a.getLayoutParams();
                layoutParams.height = f;
                this.f772a.setLayoutParams(layoutParams);
            }
            int b4 = a2.b(a.a.j.ActionBar_contentInsetStart, -1);
            int b5 = a2.b(a.a.j.ActionBar_contentInsetEnd, -1);
            if (b4 >= 0 || b5 >= 0) {
                this.f772a.a(Math.max(b4, 0), Math.max(b5, 0));
            }
            int g2 = a2.g(a.a.j.ActionBar_titleTextStyle, 0);
            if (g2 != 0) {
                Toolbar toolbar2 = this.f772a;
                toolbar2.b(toolbar2.getContext(), g2);
            }
            int g3 = a2.g(a.a.j.ActionBar_subtitleTextStyle, 0);
            if (g3 != 0) {
                Toolbar toolbar3 = this.f772a;
                toolbar3.a(toolbar3.getContext(), g3);
            }
            int g4 = a2.g(a.a.j.ActionBar_popupTheme, 0);
            if (g4 != 0) {
                this.f772a.setPopupTheme(g4);
            }
        } else {
            this.f773b = p();
        }
        a2.a();
        e(i);
        this.k = this.f772a.getNavigationContentDescription();
        this.f772a.setNavigationOnClickListener(new a());
    }

    private void d(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.f773b & 8) != 0) {
            this.f772a.setTitle(charSequence);
        }
    }

    private int p() {
        if (this.f772a.getNavigationIcon() != null) {
            this.q = this.f772a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    private void q() {
        if ((this.f773b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.f772a.setNavigationContentDescription(this.p);
            } else {
                this.f772a.setNavigationContentDescription(this.k);
            }
        }
    }

    private void r() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f773b & 4) != 0) {
            toolbar = this.f772a;
            drawable = this.g;
            if (drawable == null) {
                drawable = this.q;
            }
        } else {
            toolbar = this.f772a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void s() {
        Drawable drawable;
        int i = this.f773b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f) == null) {
            drawable = this.e;
        }
        this.f772a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.d0
    public a.g.l.y a(int i, long j) {
        a.g.l.y a2 = a.g.l.u.a(this.f772a);
        a2.a(i == 0 ? 1.0f : 0.0f);
        a2.a(j);
        a2.a(new b(i));
        return a2;
    }

    @Override // androidx.appcompat.widget.d0
    public void a(int i) {
        this.f772a.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.d0
    public void a(Drawable drawable) {
        this.g = drawable;
        r();
    }

    @Override // androidx.appcompat.widget.d0
    public void a(Menu menu, m.a aVar) {
        if (this.n == null) {
            c cVar = new c(this.f772a.getContext());
            this.n = cVar;
            cVar.a(a.a.f.action_menu_presenter);
        }
        this.n.a(aVar);
        this.f772a.a((androidx.appcompat.view.menu.g) menu, this.n);
    }

    public void a(View view) {
        View view2 = this.d;
        if (view2 != null && (this.f773b & 16) != 0) {
            this.f772a.removeView(view2);
        }
        this.d = view;
        if (view == null || (this.f773b & 16) == 0) {
            return;
        }
        this.f772a.addView(view);
    }

    @Override // androidx.appcompat.widget.d0
    public void a(m.a aVar, g.a aVar2) {
        this.f772a.a(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.d0
    public void a(p0 p0Var) {
        View view = this.f774c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f772a;
            if (parent == toolbar) {
                toolbar.removeView(this.f774c);
            }
        }
        this.f774c = p0Var;
        if (p0Var == null || this.o != 2) {
            return;
        }
        this.f772a.addView(p0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f774c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f477a = 8388691;
        p0Var.setAllowCollapse(true);
    }

    public void a(CharSequence charSequence) {
        this.k = charSequence;
        q();
    }

    @Override // androidx.appcompat.widget.d0
    public void a(boolean z) {
    }

    @Override // androidx.appcompat.widget.d0
    public boolean a() {
        return this.f772a.k();
    }

    @Override // androidx.appcompat.widget.d0
    public void b(int i) {
        b(i != 0 ? a.a.k.a.a.c(n(), i) : null);
    }

    public void b(Drawable drawable) {
        this.f = drawable;
        s();
    }

    public void b(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.f773b & 8) != 0) {
            this.f772a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.d0
    public void b(boolean z) {
        this.f772a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.d0
    public boolean b() {
        return this.f772a.h();
    }

    @Override // androidx.appcompat.widget.d0
    public void c() {
        this.m = true;
    }

    @Override // androidx.appcompat.widget.d0
    public void c(int i) {
        a(i == 0 ? null : n().getString(i));
    }

    public void c(CharSequence charSequence) {
        this.h = true;
        d(charSequence);
    }

    @Override // androidx.appcompat.widget.d0
    public void collapseActionView() {
        this.f772a.c();
    }

    @Override // androidx.appcompat.widget.d0
    public void d(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f773b ^ i;
        this.f773b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    q();
                }
                r();
            }
            if ((i2 & 3) != 0) {
                s();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f772a.setTitle(this.i);
                    toolbar = this.f772a;
                    charSequence = this.j;
                } else {
                    charSequence = null;
                    this.f772a.setTitle((CharSequence) null);
                    toolbar = this.f772a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f772a.addView(view);
            } else {
                this.f772a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.d0
    public boolean d() {
        return this.f772a.i();
    }

    public void e(int i) {
        if (i == this.p) {
            return;
        }
        this.p = i;
        if (!TextUtils.isEmpty(this.f772a.getNavigationContentDescription())) {
            return;
        }
        c(this.p);
    }

    @Override // androidx.appcompat.widget.d0
    public boolean e() {
        return this.f772a.b();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean f() {
        return this.f772a.g();
    }

    @Override // androidx.appcompat.widget.d0
    public void g() {
        this.f772a.d();
    }

    @Override // androidx.appcompat.widget.d0
    public CharSequence getTitle() {
        return this.f772a.getTitle();
    }

    @Override // androidx.appcompat.widget.d0
    public int h() {
        return this.f773b;
    }

    @Override // androidx.appcompat.widget.d0
    public void i() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d0
    public Menu j() {
        return this.f772a.getMenu();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean k() {
        return this.f772a.f();
    }

    @Override // androidx.appcompat.widget.d0
    public ViewGroup l() {
        return this.f772a;
    }

    @Override // androidx.appcompat.widget.d0
    public void m() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d0
    public Context n() {
        return this.f772a.getContext();
    }

    @Override // androidx.appcompat.widget.d0
    public int o() {
        return this.o;
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(int i) {
        setIcon(i != 0 ? a.a.k.a.a.c(n(), i) : null);
    }

    @Override // androidx.appcompat.widget.d0
    public void setIcon(Drawable drawable) {
        this.e = drawable;
        s();
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.h) {
            d(charSequence);
        }
    }
}
