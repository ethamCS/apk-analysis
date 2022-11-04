package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.s0;
import androidx.core.view.e0;
import androidx.core.view.f0;
import androidx.core.view.h0;
import androidx.core.view.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k.b;
/* loaded from: classes.dex */
public class l extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator E = new AccelerateInterpolator();
    private static final Interpolator F = new DecelerateInterpolator();
    boolean A;

    /* renamed from: a */
    Context f834a;

    /* renamed from: b */
    private Context f835b;

    /* renamed from: c */
    private Activity f836c;

    /* renamed from: d */
    ActionBarOverlayLayout f837d;

    /* renamed from: e */
    ActionBarContainer f838e;

    /* renamed from: f */
    g0 f839f;

    /* renamed from: g */
    ActionBarContextView f840g;

    /* renamed from: h */
    View f841h;

    /* renamed from: i */
    s0 f842i;

    /* renamed from: l */
    private boolean f845l;

    /* renamed from: m */
    d f846m;

    /* renamed from: n */
    k.b f847n;

    /* renamed from: o */
    b.a f848o;

    /* renamed from: p */
    private boolean f849p;

    /* renamed from: r */
    private boolean f851r;

    /* renamed from: u */
    boolean f854u;

    /* renamed from: v */
    boolean f855v;

    /* renamed from: w */
    private boolean f856w;

    /* renamed from: y */
    k.h f858y;

    /* renamed from: z */
    private boolean f859z;

    /* renamed from: j */
    private ArrayList<Object> f843j = new ArrayList<>();

    /* renamed from: k */
    private int f844k = -1;

    /* renamed from: q */
    private ArrayList<a.b> f850q = new ArrayList<>();

    /* renamed from: s */
    private int f852s = 0;

    /* renamed from: t */
    boolean f853t = true;

    /* renamed from: x */
    private boolean f857x = true;
    final f0 B = new a();
    final f0 C = new b();
    final h0 D = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends androidx.core.view.g0 {
        a() {
            l.this = r1;
        }

        @Override // androidx.core.view.f0
        public void b(View view) {
            View view2;
            l lVar = l.this;
            if (lVar.f853t && (view2 = lVar.f841h) != null) {
                view2.setTranslationY(0.0f);
                l.this.f838e.setTranslationY(0.0f);
            }
            l.this.f838e.setVisibility(8);
            l.this.f838e.setTransitioning(false);
            l lVar2 = l.this;
            lVar2.f858y = null;
            lVar2.B();
            ActionBarOverlayLayout actionBarOverlayLayout = l.this.f837d;
            if (actionBarOverlayLayout != null) {
                y.l0(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends androidx.core.view.g0 {
        b() {
            l.this = r1;
        }

        @Override // androidx.core.view.f0
        public void b(View view) {
            l lVar = l.this;
            lVar.f858y = null;
            lVar.f838e.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements h0 {
        c() {
            l.this = r1;
        }

        @Override // androidx.core.view.h0
        public void a(View view) {
            ((View) l.this.f838e.getParent()).invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class d extends k.b implements e.a {
        private WeakReference<View> U3;

        /* renamed from: q */
        private final Context f863q;

        /* renamed from: x */
        private final androidx.appcompat.view.menu.e f864x;

        /* renamed from: y */
        private b.a f865y;

        public d(Context context, b.a aVar) {
            l.this = r1;
            this.f863q = context;
            this.f865y = aVar;
            androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(context).S(1);
            this.f864x = S;
            S.R(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f865y;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f865y == null) {
                return;
            }
            k();
            l.this.f840g.l();
        }

        @Override // k.b
        public void c() {
            l lVar = l.this;
            if (lVar.f846m != this) {
                return;
            }
            if (!l.A(lVar.f854u, lVar.f855v, false)) {
                l lVar2 = l.this;
                lVar2.f847n = this;
                lVar2.f848o = this.f865y;
            } else {
                this.f865y.d(this);
            }
            this.f865y = null;
            l.this.z(false);
            l.this.f840g.g();
            l lVar3 = l.this;
            lVar3.f837d.setHideOnContentScrollEnabled(lVar3.A);
            l.this.f846m = null;
        }

        @Override // k.b
        public View d() {
            WeakReference<View> weakReference = this.U3;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // k.b
        public Menu e() {
            return this.f864x;
        }

        @Override // k.b
        public MenuInflater f() {
            return new k.g(this.f863q);
        }

        @Override // k.b
        public CharSequence g() {
            return l.this.f840g.getSubtitle();
        }

        @Override // k.b
        public CharSequence i() {
            return l.this.f840g.getTitle();
        }

        @Override // k.b
        public void k() {
            if (l.this.f846m != this) {
                return;
            }
            this.f864x.d0();
            try {
                this.f865y.c(this, this.f864x);
            } finally {
                this.f864x.c0();
            }
        }

        @Override // k.b
        public boolean l() {
            return l.this.f840g.j();
        }

        @Override // k.b
        public void m(View view) {
            l.this.f840g.setCustomView(view);
            this.U3 = new WeakReference<>(view);
        }

        @Override // k.b
        public void n(int i10) {
            o(l.this.f834a.getResources().getString(i10));
        }

        @Override // k.b
        public void o(CharSequence charSequence) {
            l.this.f840g.setSubtitle(charSequence);
        }

        @Override // k.b
        public void q(int i10) {
            r(l.this.f834a.getResources().getString(i10));
        }

        @Override // k.b
        public void r(CharSequence charSequence) {
            l.this.f840g.setTitle(charSequence);
        }

        @Override // k.b
        public void s(boolean z10) {
            super.s(z10);
            l.this.f840g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f864x.d0();
            try {
                return this.f865y.b(this, this.f864x);
            } finally {
                this.f864x.c0();
            }
        }
    }

    public l(Activity activity, boolean z10) {
        this.f836c = activity;
        View decorView = activity.getWindow().getDecorView();
        H(decorView);
        if (!z10) {
            this.f841h = decorView.findViewById(16908290);
        }
    }

    public l(Dialog dialog) {
        H(dialog.getWindow().getDecorView());
    }

    static boolean A(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return !z10 && !z11;
    }

    private g0 E(View view) {
        if (view instanceof g0) {
            return (g0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    private void G() {
        if (this.f856w) {
            this.f856w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f837d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            P(false);
        }
    }

    private void H(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(e.f.p_res_0x7f0900bd);
        this.f837d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f839f = E(view.findViewById(e.f.a_res_0x7f090035));
        this.f840g = (ActionBarContextView) view.findViewById(e.f.f_res_0x7f09003d);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(e.f.c_res_0x7f090037);
        this.f838e = actionBarContainer;
        g0 g0Var = this.f839f;
        if (g0Var == null || this.f840g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f834a = g0Var.b();
        boolean z10 = (this.f839f.q() & 4) != 0;
        if (z10) {
            this.f845l = true;
        }
        k.a b10 = k.a.b(this.f834a);
        M(b10.a() || z10);
        K(b10.g());
        TypedArray obtainStyledAttributes = this.f834a.obtainStyledAttributes(null, e.j.f9209a, e.a.c_res_0x7f030007, 0);
        if (obtainStyledAttributes.getBoolean(e.j.f9259k, false)) {
            L(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(e.j.f9249i, 0);
        if (dimensionPixelSize != 0) {
            J(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void K(boolean z10) {
        this.f851r = z10;
        if (!z10) {
            this.f839f.l(null);
            this.f838e.setTabContainer(this.f842i);
        } else {
            this.f838e.setTabContainer(null);
            this.f839f.l(this.f842i);
        }
        boolean z11 = true;
        boolean z12 = F() == 2;
        s0 s0Var = this.f842i;
        if (s0Var != null) {
            if (z12) {
                s0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f837d;
                if (actionBarOverlayLayout != null) {
                    y.l0(actionBarOverlayLayout);
                }
            } else {
                s0Var.setVisibility(8);
            }
        }
        this.f839f.y(!this.f851r && z12);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f837d;
        if (this.f851r || !z12) {
            z11 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z11);
    }

    private boolean N() {
        return y.S(this.f838e);
    }

    private void O() {
        if (!this.f856w) {
            this.f856w = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f837d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            P(false);
        }
    }

    private void P(boolean z10) {
        if (A(this.f854u, this.f855v, this.f856w)) {
            if (this.f857x) {
                return;
            }
            this.f857x = true;
            D(z10);
        } else if (!this.f857x) {
        } else {
            this.f857x = false;
            C(z10);
        }
    }

    void B() {
        b.a aVar = this.f848o;
        if (aVar != null) {
            aVar.d(this.f847n);
            this.f847n = null;
            this.f848o = null;
        }
    }

    public void C(boolean z10) {
        View view;
        int[] iArr;
        k.h hVar = this.f858y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f852s != 0 || (!this.f859z && !z10)) {
            this.B.b(null);
            return;
        }
        this.f838e.setAlpha(1.0f);
        this.f838e.setTransitioning(true);
        k.h hVar2 = new k.h();
        float f10 = -this.f838e.getHeight();
        if (z10) {
            this.f838e.getLocationInWindow(new int[]{0, 0});
            f10 -= iArr[1];
        }
        e0 m10 = y.e(this.f838e).m(f10);
        m10.k(this.D);
        hVar2.c(m10);
        if (this.f853t && (view = this.f841h) != null) {
            hVar2.c(y.e(view).m(f10));
        }
        hVar2.f(E);
        hVar2.e(250L);
        hVar2.g(this.B);
        this.f858y = hVar2;
        hVar2.h();
    }

    public void D(boolean z10) {
        View view;
        View view2;
        int[] iArr;
        k.h hVar = this.f858y;
        if (hVar != null) {
            hVar.a();
        }
        this.f838e.setVisibility(0);
        if (this.f852s != 0 || (!this.f859z && !z10)) {
            this.f838e.setAlpha(1.0f);
            this.f838e.setTranslationY(0.0f);
            if (this.f853t && (view = this.f841h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b(null);
        } else {
            this.f838e.setTranslationY(0.0f);
            float f10 = -this.f838e.getHeight();
            if (z10) {
                this.f838e.getLocationInWindow(new int[]{0, 0});
                f10 -= iArr[1];
            }
            this.f838e.setTranslationY(f10);
            k.h hVar2 = new k.h();
            e0 m10 = y.e(this.f838e).m(0.0f);
            m10.k(this.D);
            hVar2.c(m10);
            if (this.f853t && (view2 = this.f841h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(y.e(this.f841h).m(0.0f));
            }
            hVar2.f(F);
            hVar2.e(250L);
            hVar2.g(this.C);
            this.f858y = hVar2;
            hVar2.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f837d;
        if (actionBarOverlayLayout != null) {
            y.l0(actionBarOverlayLayout);
        }
    }

    public int F() {
        return this.f839f.u();
    }

    public void I(int i10, int i11) {
        int q10 = this.f839f.q();
        if ((i11 & 4) != 0) {
            this.f845l = true;
        }
        this.f839f.p((i10 & i11) | ((~i11) & q10));
    }

    public void J(float f10) {
        y.w0(this.f838e, f10);
    }

    public void L(boolean z10) {
        if (!z10 || this.f837d.w()) {
            this.A = z10;
            this.f837d.setHideOnContentScrollEnabled(z10);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void M(boolean z10) {
        this.f839f.n(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f855v) {
            this.f855v = false;
            P(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        k.h hVar = this.f858y;
        if (hVar != null) {
            hVar.a();
            this.f858y = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(int i10) {
        this.f852s = i10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e(boolean z10) {
        this.f853t = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f() {
        if (!this.f855v) {
            this.f855v = true;
            P(true);
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        g0 g0Var = this.f839f;
        if (g0Var == null || !g0Var.o()) {
            return false;
        }
        this.f839f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z10) {
        if (z10 == this.f849p) {
            return;
        }
        this.f849p = z10;
        int size = this.f850q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f850q.get(i10).a(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f839f.q();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        if (this.f835b == null) {
            TypedValue typedValue = new TypedValue();
            this.f834a.getTheme().resolveAttribute(e.a.g_res_0x7f03000c, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f835b = new ContextThemeWrapper(this.f834a, i10);
            } else {
                this.f835b = this.f834a;
            }
        }
        return this.f835b;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        K(k.a.b(this.f834a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu e10;
        d dVar = this.f846m;
        if (dVar == null || (e10 = dVar.e()) == null) {
            return false;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z10 = false;
        }
        e10.setQwertyMode(z10);
        return e10.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z10) {
        if (!this.f845l) {
            s(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z10) {
        I(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z10) {
        I(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void u(int i10) {
        this.f839f.t(i10);
    }

    @Override // androidx.appcompat.app.a
    public void v(int i10) {
        this.f839f.z(i10);
    }

    @Override // androidx.appcompat.app.a
    public void w(boolean z10) {
        k.h hVar;
        this.f859z = z10;
        if (z10 || (hVar = this.f858y) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void x(CharSequence charSequence) {
        this.f839f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public k.b y(b.a aVar) {
        d dVar = this.f846m;
        if (dVar != null) {
            dVar.c();
        }
        this.f837d.setHideOnContentScrollEnabled(false);
        this.f840g.k();
        d dVar2 = new d(this.f840g.getContext(), aVar);
        if (dVar2.t()) {
            this.f846m = dVar2;
            dVar2.k();
            this.f840g.h(dVar2);
            z(true);
            return dVar2;
        }
        return null;
    }

    public void z(boolean z10) {
        e0 e0Var;
        e0 e0Var2;
        if (z10) {
            O();
        } else {
            G();
        }
        if (!N()) {
            if (z10) {
                this.f839f.k(4);
                this.f840g.setVisibility(0);
                return;
            }
            this.f839f.k(0);
            this.f840g.setVisibility(8);
            return;
        }
        if (z10) {
            e0Var = this.f839f.v(4, 100L);
            e0Var2 = this.f840g.f(0, 200L);
        } else {
            e0Var2 = this.f839f.v(0, 200L);
            e0Var = this.f840g.f(8, 100L);
        }
        k.h hVar = new k.h();
        hVar.d(e0Var, e0Var2);
        hVar.h();
    }
}
