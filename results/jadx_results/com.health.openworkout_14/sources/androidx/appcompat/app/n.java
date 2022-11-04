package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
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
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.p0;
import b.a.o.b;
import b.g.l.a0;
import b.g.l.t;
import b.g.l.x;
import b.g.l.y;
import b.g.l.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class n extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator B = new AccelerateInterpolator();
    private static final Interpolator C = new DecelerateInterpolator();

    /* renamed from: a */
    Context f228a;

    /* renamed from: b */
    private Context f229b;

    /* renamed from: c */
    ActionBarOverlayLayout f230c;

    /* renamed from: d */
    ActionBarContainer f231d;

    /* renamed from: e */
    d0 f232e;

    /* renamed from: f */
    ActionBarContextView f233f;

    /* renamed from: g */
    View f234g;

    /* renamed from: h */
    p0 f235h;
    private boolean i;
    d j;
    b.a.o.b k;
    b.a l;
    private boolean m;
    private boolean o;
    boolean r;
    boolean s;
    private boolean t;
    b.a.o.h v;
    private boolean w;
    boolean x;
    private ArrayList<a.b> n = new ArrayList<>();
    private int p = 0;
    boolean q = true;
    private boolean u = true;
    final y y = new a();
    final y z = new b();
    final a0 A = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends z {
        a() {
            n.this = r1;
        }

        @Override // b.g.l.y
        public void a(View view) {
            View view2;
            n nVar = n.this;
            if (nVar.q && (view2 = nVar.f234g) != null) {
                view2.setTranslationY(0.0f);
                n.this.f231d.setTranslationY(0.0f);
            }
            n.this.f231d.setVisibility(8);
            n.this.f231d.setTransitioning(false);
            n nVar2 = n.this;
            nVar2.v = null;
            nVar2.B();
            ActionBarOverlayLayout actionBarOverlayLayout = n.this.f230c;
            if (actionBarOverlayLayout != null) {
                t.f0(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends z {
        b() {
            n.this = r1;
        }

        @Override // b.g.l.y
        public void a(View view) {
            n nVar = n.this;
            nVar.v = null;
            nVar.f231d.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements a0 {
        c() {
            n.this = r1;
        }

        @Override // b.g.l.a0
        public void a(View view) {
            ((View) n.this.f231d.getParent()).invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class d extends b.a.o.b implements g.a {

        /* renamed from: d */
        private final Context f239d;

        /* renamed from: e */
        private final androidx.appcompat.view.menu.g f240e;

        /* renamed from: f */
        private b.a f241f;

        /* renamed from: g */
        private WeakReference<View> f242g;

        public d(Context context, b.a aVar) {
            n.this = r1;
            this.f239d = context;
            this.f241f = aVar;
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            gVar.W(1);
            this.f240e = gVar;
            gVar.V(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            b.a aVar = this.f241f;
            if (aVar != null) {
                return aVar.b(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (this.f241f == null) {
                return;
            }
            k();
            n.this.f233f.l();
        }

        @Override // b.a.o.b
        public void c() {
            n nVar = n.this;
            if (nVar.j != this) {
                return;
            }
            if (!n.A(nVar.r, nVar.s, false)) {
                n nVar2 = n.this;
                nVar2.k = this;
                nVar2.l = this.f241f;
            } else {
                this.f241f.d(this);
            }
            this.f241f = null;
            n.this.z(false);
            n.this.f233f.g();
            n.this.f232e.o().sendAccessibilityEvent(32);
            n nVar3 = n.this;
            nVar3.f230c.setHideOnContentScrollEnabled(nVar3.x);
            n.this.j = null;
        }

        @Override // b.a.o.b
        public View d() {
            WeakReference<View> weakReference = this.f242g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // b.a.o.b
        public Menu e() {
            return this.f240e;
        }

        @Override // b.a.o.b
        public MenuInflater f() {
            return new b.a.o.g(this.f239d);
        }

        @Override // b.a.o.b
        public CharSequence g() {
            return n.this.f233f.getSubtitle();
        }

        @Override // b.a.o.b
        public CharSequence i() {
            return n.this.f233f.getTitle();
        }

        @Override // b.a.o.b
        public void k() {
            if (n.this.j != this) {
                return;
            }
            this.f240e.h0();
            try {
                this.f241f.a(this, this.f240e);
            } finally {
                this.f240e.g0();
            }
        }

        @Override // b.a.o.b
        public boolean l() {
            return n.this.f233f.j();
        }

        @Override // b.a.o.b
        public void m(View view) {
            n.this.f233f.setCustomView(view);
            this.f242g = new WeakReference<>(view);
        }

        @Override // b.a.o.b
        public void n(int i) {
            o(n.this.f228a.getResources().getString(i));
        }

        @Override // b.a.o.b
        public void o(CharSequence charSequence) {
            n.this.f233f.setSubtitle(charSequence);
        }

        @Override // b.a.o.b
        public void q(int i) {
            r(n.this.f228a.getResources().getString(i));
        }

        @Override // b.a.o.b
        public void r(CharSequence charSequence) {
            n.this.f233f.setTitle(charSequence);
        }

        @Override // b.a.o.b
        public void s(boolean z) {
            super.s(z);
            n.this.f233f.setTitleOptional(z);
        }

        public boolean t() {
            this.f240e.h0();
            try {
                return this.f241f.c(this, this.f240e);
            } finally {
                this.f240e.g0();
            }
        }
    }

    public n(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        H(decorView);
        if (!z) {
            this.f234g = decorView.findViewById(16908290);
        }
    }

    public n(Dialog dialog) {
        new ArrayList();
        H(dialog.getWindow().getDecorView());
    }

    static boolean A(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    private d0 E(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void G() {
        if (this.t) {
            this.t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f230c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            P(false);
        }
    }

    private void H(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(b.a.f.p_res_0x7f09009a);
        this.f230c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f232e = E(view.findViewById(b.a.f.a_res_0x7f09003e));
        this.f233f = (ActionBarContextView) view.findViewById(b.a.f.f_res_0x7f090046);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(b.a.f.c_res_0x7f090040);
        this.f231d = actionBarContainer;
        d0 d0Var = this.f232e;
        if (d0Var == null || this.f233f == null || actionBarContainer == null) {
            throw new IllegalStateException(n.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f228a = d0Var.r();
        boolean z = (this.f232e.j() & 4) != 0;
        if (z) {
            this.i = true;
        }
        b.a.o.a b2 = b.a.o.a.b(this.f228a);
        M(b2.a() || z);
        K(b2.g());
        TypedArray obtainStyledAttributes = this.f228a.obtainStyledAttributes(null, b.a.j.f1990a, b.a.a.c_res_0x7f040006, 0);
        if (obtainStyledAttributes.getBoolean(b.a.j.k, false)) {
            L(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(b.a.j.i, 0);
        if (dimensionPixelSize != 0) {
            J(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void K(boolean z) {
        this.o = z;
        if (!z) {
            this.f232e.n(null);
            this.f231d.setTabContainer(this.f235h);
        } else {
            this.f231d.setTabContainer(null);
            this.f232e.n(this.f235h);
        }
        boolean z2 = true;
        boolean z3 = F() == 2;
        p0 p0Var = this.f235h;
        if (p0Var != null) {
            if (z3) {
                p0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f230c;
                if (actionBarOverlayLayout != null) {
                    t.f0(actionBarOverlayLayout);
                }
            } else {
                p0Var.setVisibility(8);
            }
        }
        this.f232e.y(!this.o && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f230c;
        if (this.o || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    private boolean N() {
        return t.O(this.f231d);
    }

    private void O() {
        if (!this.t) {
            this.t = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f230c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            P(false);
        }
    }

    private void P(boolean z) {
        if (A(this.r, this.s, this.t)) {
            if (this.u) {
                return;
            }
            this.u = true;
            D(z);
        } else if (!this.u) {
        } else {
            this.u = false;
            C(z);
        }
    }

    void B() {
        b.a aVar = this.l;
        if (aVar != null) {
            aVar.d(this.k);
            this.k = null;
            this.l = null;
        }
    }

    public void C(boolean z) {
        View view;
        int[] iArr;
        b.a.o.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        if (this.p != 0 || (!this.w && !z)) {
            this.y.a(null);
            return;
        }
        this.f231d.setAlpha(1.0f);
        this.f231d.setTransitioning(true);
        b.a.o.h hVar2 = new b.a.o.h();
        float f2 = -this.f231d.getHeight();
        if (z) {
            this.f231d.getLocationInWindow(new int[]{0, 0});
            f2 -= iArr[1];
        }
        x c2 = t.c(this.f231d);
        c2.k(f2);
        c2.i(this.A);
        hVar2.c(c2);
        if (this.q && (view = this.f234g) != null) {
            x c3 = t.c(view);
            c3.k(f2);
            hVar2.c(c3);
        }
        hVar2.f(B);
        hVar2.e(250L);
        hVar2.g(this.y);
        this.v = hVar2;
        hVar2.h();
    }

    public void D(boolean z) {
        View view;
        View view2;
        int[] iArr;
        b.a.o.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        this.f231d.setVisibility(0);
        if (this.p != 0 || (!this.w && !z)) {
            this.f231d.setAlpha(1.0f);
            this.f231d.setTranslationY(0.0f);
            if (this.q && (view = this.f234g) != null) {
                view.setTranslationY(0.0f);
            }
            this.z.a(null);
        } else {
            this.f231d.setTranslationY(0.0f);
            float f2 = -this.f231d.getHeight();
            if (z) {
                this.f231d.getLocationInWindow(new int[]{0, 0});
                f2 -= iArr[1];
            }
            this.f231d.setTranslationY(f2);
            b.a.o.h hVar2 = new b.a.o.h();
            x c2 = t.c(this.f231d);
            c2.k(0.0f);
            c2.i(this.A);
            hVar2.c(c2);
            if (this.q && (view2 = this.f234g) != null) {
                view2.setTranslationY(f2);
                x c3 = t.c(this.f234g);
                c3.k(0.0f);
                hVar2.c(c3);
            }
            hVar2.f(C);
            hVar2.e(250L);
            hVar2.g(this.z);
            this.v = hVar2;
            hVar2.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f230c;
        if (actionBarOverlayLayout != null) {
            t.f0(actionBarOverlayLayout);
        }
    }

    public int F() {
        return this.f232e.s();
    }

    public void I(int i, int i2) {
        int j = this.f232e.j();
        if ((i2 & 4) != 0) {
            this.i = true;
        }
        this.f232e.z((i & i2) | ((~i2) & j));
    }

    public void J(float f2) {
        t.p0(this.f231d, f2);
    }

    public void L(boolean z) {
        if (!z || this.f230c.w()) {
            this.x = z;
            this.f230c.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void M(boolean z) {
        this.f232e.q(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a(boolean z) {
        this.q = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        if (this.s) {
            this.s = false;
            P(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
        b.a.o.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
            this.v = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d(int i) {
        this.p = i;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        if (!this.s) {
            this.s = true;
            P(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f() {
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        d0 d0Var = this.f232e;
        if (d0Var == null || !d0Var.v()) {
            return false;
        }
        this.f232e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z) {
        if (z == this.m) {
            return;
        }
        this.m = z;
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            this.n.get(i).a(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f232e.j();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        if (this.f229b == null) {
            TypedValue typedValue = new TypedValue();
            this.f228a.getTheme().resolveAttribute(b.a.a.g_res_0x7f04000b, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f229b = new ContextThemeWrapper(this.f228a, i);
            } else {
                this.f229b = this.f228a;
            }
        }
        return this.f229b;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        K(b.a.o.a.b(this.f228a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i, KeyEvent keyEvent) {
        Menu e2;
        d dVar = this.j;
        if (dVar == null || (e2 = dVar.e()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        e2.setQwertyMode(z);
        return e2.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z) {
        if (!this.i) {
            s(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z) {
        I(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void t(int i) {
        this.f232e.p(i);
    }

    @Override // androidx.appcompat.app.a
    public void u(Drawable drawable) {
        this.f232e.x(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z) {
        b.a.o.h hVar;
        this.w = z;
        if (z || (hVar = this.v) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.f232e.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void x(CharSequence charSequence) {
        this.f232e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public b.a.o.b y(b.a aVar) {
        d dVar = this.j;
        if (dVar != null) {
            dVar.c();
        }
        this.f230c.setHideOnContentScrollEnabled(false);
        this.f233f.k();
        d dVar2 = new d(this.f233f.getContext(), aVar);
        if (dVar2.t()) {
            this.j = dVar2;
            dVar2.k();
            this.f233f.h(dVar2);
            z(true);
            this.f233f.sendAccessibilityEvent(32);
            return dVar2;
        }
        return null;
    }

    public void z(boolean z) {
        x xVar;
        x xVar2;
        if (z) {
            O();
        } else {
            G();
        }
        if (!N()) {
            if (z) {
                this.f232e.k(4);
                this.f233f.setVisibility(0);
                return;
            }
            this.f232e.k(0);
            this.f233f.setVisibility(8);
            return;
        }
        if (z) {
            xVar = this.f232e.t(4, 100L);
            xVar2 = this.f233f.f(0, 200L);
        } else {
            xVar2 = this.f232e.t(0, 200L);
            xVar = this.f233f.f(8, 100L);
        }
        b.a.o.h hVar = new b.a.o.h();
        hVar.d(xVar, xVar2);
        hVar.h();
    }
}
