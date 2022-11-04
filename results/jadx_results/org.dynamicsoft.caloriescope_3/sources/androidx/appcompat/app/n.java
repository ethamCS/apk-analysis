package androidx.appcompat.app;

import a.a.n.b;
import a.g.l.a0;
import a.g.l.b0;
import a.g.l.u;
import a.g.l.y;
import a.g.l.z;
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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class n extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator B = new AccelerateInterpolator();
    private static final Interpolator C = new DecelerateInterpolator();

    /* renamed from: a */
    Context f542a;

    /* renamed from: b */
    private Context f543b;

    /* renamed from: c */
    ActionBarOverlayLayout f544c;
    ActionBarContainer d;
    d0 e;
    ActionBarContextView f;
    View g;
    p0 h;
    private boolean i;
    d j;
    a.a.n.b k;
    b.a l;
    private boolean m;
    private boolean o;
    boolean r;
    boolean s;
    private boolean t;
    a.a.n.h v;
    private boolean w;
    boolean x;
    private ArrayList<a.b> n = new ArrayList<>();
    private int p = 0;
    boolean q = true;
    private boolean u = true;
    final z y = new a();
    final z z = new b();
    final b0 A = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends a0 {
        a() {
            n.this = r1;
        }

        @Override // a.g.l.z
        public void a(View view) {
            View view2;
            n nVar = n.this;
            if (nVar.q && (view2 = nVar.g) != null) {
                view2.setTranslationY(0.0f);
                n.this.d.setTranslationY(0.0f);
            }
            n.this.d.setVisibility(8);
            n.this.d.setTransitioning(false);
            n nVar2 = n.this;
            nVar2.v = null;
            nVar2.l();
            ActionBarOverlayLayout actionBarOverlayLayout = n.this.f544c;
            if (actionBarOverlayLayout != null) {
                u.I(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends a0 {
        b() {
            n.this = r1;
        }

        @Override // a.g.l.z
        public void a(View view) {
            n nVar = n.this;
            nVar.v = null;
            nVar.d.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements b0 {
        c() {
            n.this = r1;
        }

        @Override // a.g.l.b0
        public void a(View view) {
            ((View) n.this.d.getParent()).invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class d extends a.a.n.b implements g.a {
        private final Context d;
        private final androidx.appcompat.view.menu.g e;
        private b.a f;
        private WeakReference<View> g;

        public d(Context context, b.a aVar) {
            n.this = r1;
            this.d = context;
            this.f = aVar;
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            gVar.c(1);
            this.e = gVar;
            gVar.a(this);
        }

        @Override // a.a.n.b
        public void a() {
            n nVar = n.this;
            if (nVar.j != this) {
                return;
            }
            if (!n.a(nVar.r, nVar.s, false)) {
                n nVar2 = n.this;
                nVar2.k = this;
                nVar2.l = this.f;
            } else {
                this.f.a(this);
            }
            this.f = null;
            n.this.e(false);
            n.this.f.a();
            n.this.e.l().sendAccessibilityEvent(32);
            n nVar3 = n.this;
            nVar3.f544c.setHideOnContentScrollEnabled(nVar3.x);
            n.this.j = null;
        }

        @Override // a.a.n.b
        public void a(int i) {
            a((CharSequence) n.this.f542a.getResources().getString(i));
        }

        @Override // a.a.n.b
        public void a(View view) {
            n.this.f.setCustomView(view);
            this.g = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void a(androidx.appcompat.view.menu.g gVar) {
            if (this.f == null) {
                return;
            }
            i();
            n.this.f.d();
        }

        @Override // a.a.n.b
        public void a(CharSequence charSequence) {
            n.this.f.setSubtitle(charSequence);
        }

        @Override // a.a.n.b
        public void a(boolean z) {
            super.a(z);
            n.this.f.setTitleOptional(z);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            b.a aVar = this.f;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // a.a.n.b
        public View b() {
            WeakReference<View> weakReference = this.g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // a.a.n.b
        public void b(int i) {
            b(n.this.f542a.getResources().getString(i));
        }

        @Override // a.a.n.b
        public void b(CharSequence charSequence) {
            n.this.f.setTitle(charSequence);
        }

        @Override // a.a.n.b
        public Menu c() {
            return this.e;
        }

        @Override // a.a.n.b
        public MenuInflater d() {
            return new a.a.n.g(this.d);
        }

        @Override // a.a.n.b
        public CharSequence e() {
            return n.this.f.getSubtitle();
        }

        @Override // a.a.n.b
        public CharSequence g() {
            return n.this.f.getTitle();
        }

        @Override // a.a.n.b
        public void i() {
            if (n.this.j != this) {
                return;
            }
            this.e.s();
            try {
                this.f.a(this, this.e);
            } finally {
                this.e.r();
            }
        }

        @Override // a.a.n.b
        public boolean j() {
            return n.this.f.b();
        }

        public boolean k() {
            this.e.s();
            try {
                return this.f.b(this, this.e);
            } finally {
                this.e.r();
            }
        }
    }

    public n(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (!z) {
            this.g = decorView.findViewById(16908290);
        }
    }

    public n(Dialog dialog) {
        new ArrayList();
        b(dialog.getWindow().getDecorView());
    }

    private d0 a(View view) {
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

    static boolean a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    private void b(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(a.a.f.decor_content_parent);
        this.f544c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.e = a(view.findViewById(a.a.f.action_bar));
        this.f = (ActionBarContextView) view.findViewById(a.a.f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(a.a.f.action_bar_container);
        this.d = actionBarContainer;
        d0 d0Var = this.e;
        if (d0Var == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(n.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f542a = d0Var.n();
        boolean z = (this.e.h() & 4) != 0;
        if (z) {
            this.i = true;
        }
        a.a.n.a a2 = a.a.n.a.a(this.f542a);
        j(a2.a() || z);
        k(a2.f());
        TypedArray obtainStyledAttributes = this.f542a.obtainStyledAttributes(null, a.a.j.ActionBar, a.a.a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(a.a.j.ActionBar_hideOnContentScroll, false)) {
            i(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(a.a.j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            a(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void k(boolean z) {
        this.o = z;
        if (!z) {
            this.e.a((p0) null);
            this.d.setTabContainer(this.h);
        } else {
            this.d.setTabContainer(null);
            this.e.a(this.h);
        }
        boolean z2 = true;
        boolean z3 = m() == 2;
        p0 p0Var = this.h;
        if (p0Var != null) {
            if (z3) {
                p0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f544c;
                if (actionBarOverlayLayout != null) {
                    u.I(actionBarOverlayLayout);
                }
            } else {
                p0Var.setVisibility(8);
            }
        }
        this.e.b(!this.o && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f544c;
        if (this.o || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    private void l(boolean z) {
        if (a(this.r, this.s, this.t)) {
            if (this.u) {
                return;
            }
            this.u = true;
            g(z);
        } else if (!this.u) {
        } else {
            this.u = false;
            f(z);
        }
    }

    private void n() {
        if (this.t) {
            this.t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f544c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            l(false);
        }
    }

    private boolean o() {
        return u.D(this.d);
    }

    private void p() {
        if (!this.t) {
            this.t = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f544c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            l(false);
        }
    }

    @Override // androidx.appcompat.app.a
    public a.a.n.b a(b.a aVar) {
        d dVar = this.j;
        if (dVar != null) {
            dVar.a();
        }
        this.f544c.setHideOnContentScrollEnabled(false);
        this.f.c();
        d dVar2 = new d(this.f.getContext(), aVar);
        if (dVar2.k()) {
            this.j = dVar2;
            dVar2.i();
            this.f.a(dVar2);
            e(true);
            this.f.sendAccessibilityEvent(32);
            return dVar2;
        }
        return null;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        a.a.n.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
            this.v = null;
        }
    }

    public void a(float f) {
        u.a(this.d, f);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a(int i) {
        this.p = i;
    }

    public void a(int i, int i2) {
        int h = this.e.h();
        if ((i2 & 4) != 0) {
            this.i = true;
        }
        this.e.d((i & i2) | ((i2 ^ (-1)) & h));
    }

    @Override // androidx.appcompat.app.a
    public void a(Configuration configuration) {
        k(a.a.n.a.a(this.f542a).f());
    }

    @Override // androidx.appcompat.app.a
    public void a(Drawable drawable) {
        this.e.a(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void a(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a(boolean z) {
        this.q = z;
    }

    @Override // androidx.appcompat.app.a
    public boolean a(int i, KeyEvent keyEvent) {
        Menu c2;
        d dVar = this.j;
        if (dVar == null || (c2 = dVar.c()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        c2.setQwertyMode(z);
        return c2.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        if (!this.s) {
            this.s = true;
            l(true);
        }
    }

    @Override // androidx.appcompat.app.a
    public void b(int i) {
        this.e.c(i);
    }

    @Override // androidx.appcompat.app.a
    public void b(boolean z) {
        if (z == this.m) {
            return;
        }
        this.m = z;
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            this.n.get(i).a(z);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
        if (this.s) {
            this.s = false;
            l(true);
        }
    }

    @Override // androidx.appcompat.app.a
    public void c(boolean z) {
        if (!this.i) {
            h(z);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
    }

    @Override // androidx.appcompat.app.a
    public void d(boolean z) {
        a.a.n.h hVar;
        this.w = z;
        if (z || (hVar = this.v) == null) {
            return;
        }
        hVar.a();
    }

    public void e(boolean z) {
        y yVar;
        y yVar2;
        if (z) {
            p();
        } else {
            n();
        }
        if (!o()) {
            if (z) {
                this.e.a(4);
                this.f.setVisibility(0);
                return;
            }
            this.e.a(0);
            this.f.setVisibility(8);
            return;
        }
        if (z) {
            yVar = this.e.a(4, 100L);
            yVar2 = this.f.a(0, 200L);
        } else {
            yVar2 = this.e.a(0, 200L);
            yVar = this.f.a(8, 100L);
        }
        a.a.n.h hVar = new a.a.n.h();
        hVar.a(yVar, yVar2);
        hVar.c();
    }

    public void f(boolean z) {
        View view;
        int[] iArr;
        a.a.n.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        if (this.p != 0 || (!this.w && !z)) {
            this.y.a(null);
            return;
        }
        this.d.setAlpha(1.0f);
        this.d.setTransitioning(true);
        a.a.n.h hVar2 = new a.a.n.h();
        float f = -this.d.getHeight();
        if (z) {
            this.d.getLocationInWindow(new int[]{0, 0});
            f -= iArr[1];
        }
        y a2 = u.a(this.d);
        a2.b(f);
        a2.a(this.A);
        hVar2.a(a2);
        if (this.q && (view = this.g) != null) {
            y a3 = u.a(view);
            a3.b(f);
            hVar2.a(a3);
        }
        hVar2.a(B);
        hVar2.a(250L);
        hVar2.a(this.y);
        this.v = hVar2;
        hVar2.c();
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        d0 d0Var = this.e;
        if (d0Var == null || !d0Var.k()) {
            return false;
        }
        this.e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public int g() {
        return this.e.h();
    }

    public void g(boolean z) {
        View view;
        View view2;
        int[] iArr;
        a.a.n.h hVar = this.v;
        if (hVar != null) {
            hVar.a();
        }
        this.d.setVisibility(0);
        if (this.p != 0 || (!this.w && !z)) {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.q && (view = this.g) != null) {
                view.setTranslationY(0.0f);
            }
            this.z.a(null);
        } else {
            this.d.setTranslationY(0.0f);
            float f = -this.d.getHeight();
            if (z) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            this.d.setTranslationY(f);
            a.a.n.h hVar2 = new a.a.n.h();
            y a2 = u.a(this.d);
            a2.b(0.0f);
            a2.a(this.A);
            hVar2.a(a2);
            if (this.q && (view2 = this.g) != null) {
                view2.setTranslationY(f);
                y a3 = u.a(this.g);
                a3.b(0.0f);
                hVar2.a(a3);
            }
            hVar2.a(C);
            hVar2.a(250L);
            hVar2.a(this.z);
            this.v = hVar2;
            hVar2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f544c;
        if (actionBarOverlayLayout != null) {
            u.I(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.app.a
    public Context h() {
        if (this.f543b == null) {
            TypedValue typedValue = new TypedValue();
            this.f542a.getTheme().resolveAttribute(a.a.a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f543b = new ContextThemeWrapper(this.f542a, i);
            } else {
                this.f543b = this.f542a;
            }
        }
        return this.f543b;
    }

    public void h(boolean z) {
        a(z ? 4 : 0, 4);
    }

    public void i(boolean z) {
        if (!z || this.f544c.i()) {
            this.x = z;
            this.f544c.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void j(boolean z) {
        this.e.a(z);
    }

    void l() {
        b.a aVar = this.l;
        if (aVar != null) {
            aVar.a(this.k);
            this.k = null;
            this.l = null;
        }
    }

    public int m() {
        return this.e.o();
    }
}
