package b.i.b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import b.d.h;
import b.g.l.c0.e;
import b.g.l.t;
import b.i.b.b;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class a extends b.g.l.a {
    private static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final b.a<b.g.l.c0.c> o = new C0057a();
    private static final b.AbstractC0058b<h<b.g.l.c0.c>, b.g.l.c0.c> p = new b();

    /* renamed from: h */
    private final AccessibilityManager f2610h;
    private final View i;
    private c j;

    /* renamed from: d */
    private final Rect f2606d = new Rect();

    /* renamed from: e */
    private final Rect f2607e = new Rect();

    /* renamed from: f */
    private final Rect f2608f = new Rect();

    /* renamed from: g */
    private final int[] f2609g = new int[2];
    int k = Integer.MIN_VALUE;
    int l = Integer.MIN_VALUE;
    private int m = Integer.MIN_VALUE;

    /* renamed from: b.i.b.a$a */
    /* loaded from: classes.dex */
    class C0057a implements b.a<b.g.l.c0.c> {
        C0057a() {
        }

        /* renamed from: b */
        public void a(b.g.l.c0.c cVar, Rect rect) {
            cVar.m(rect);
        }
    }

    /* loaded from: classes.dex */
    class b implements b.AbstractC0058b<h<b.g.l.c0.c>, b.g.l.c0.c> {
        b() {
        }

        /* renamed from: c */
        public b.g.l.c0.c b(h<b.g.l.c0.c> hVar, int i) {
            return hVar.q(i);
        }

        /* renamed from: d */
        public int a(h<b.g.l.c0.c> hVar) {
            return hVar.p();
        }
    }

    /* loaded from: classes.dex */
    private class c extends b.g.l.c0.d {
        c() {
            a.this = r1;
        }

        @Override // b.g.l.c0.d
        public b.g.l.c0.c a(int i) {
            return b.g.l.c0.c.Q(a.this.H(i));
        }

        @Override // b.g.l.c0.d
        public b.g.l.c0.c c(int i) {
            int i2 = i == 2 ? a.this.k : a.this.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i2);
        }

        @Override // b.g.l.c0.d
        public boolean e(int i, int i2, Bundle bundle) {
            return a.this.P(i, i2, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.i = view;
            this.f2610h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (t.w(view) != 0) {
                return;
            }
            t.r0(view, 1);
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.i.getWindowVisibility() != 0) {
            return false;
        }
        View view = this.i;
        do {
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return parent != null;
            }
            view = (View) parent;
            if (view.getAlpha() <= 0.0f) {
                break;
            }
        } while (view.getVisibility() == 0);
        return false;
    }

    private static int F(int i) {
        if (i != 19) {
            if (i == 21) {
                return 17;
            }
            return i != 22 ? 130 : 66;
        }
        return 33;
    }

    private boolean G(int i, Rect rect) {
        Object obj;
        h<b.g.l.c0.c> y = y();
        int i2 = this.l;
        int i3 = Integer.MIN_VALUE;
        b.g.l.c0.c g2 = i2 == Integer.MIN_VALUE ? null : y.g(i2);
        if (i == 1 || i == 2) {
            obj = b.i.b.b.d(y, p, o, g2, i, t.y(this.i) == 1, false);
        } else if (i != 17 && i != 33 && i != 66 && i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            Rect rect2 = new Rect();
            int i4 = this.l;
            if (i4 != Integer.MIN_VALUE) {
                z(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.i, i, rect2);
            }
            obj = b.i.b.b.c(y, p, o, g2, rect2, i);
        }
        b.g.l.c0.c cVar = (b.g.l.c0.c) obj;
        if (cVar != null) {
            i3 = y.l(y.j(cVar));
        }
        return T(i3);
    }

    private boolean Q(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? J(i, i2, bundle) : n(i) : S(i) : o(i) : T(i);
    }

    private boolean R(int i, Bundle bundle) {
        return t.Y(this.i, i, bundle);
    }

    private boolean S(int i) {
        int i2;
        if (!this.f2610h.isEnabled() || !this.f2610h.isTouchExplorationEnabled() || (i2 = this.k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            n(i2);
        }
        this.k = i;
        this.i.invalidate();
        U(i, 32768);
        return true;
    }

    private void V(int i) {
        int i2 = this.m;
        if (i2 == i) {
            return;
        }
        this.m = i;
        U(i, 128);
        U(i2, 256);
    }

    private boolean n(int i) {
        if (this.k == i) {
            this.k = Integer.MIN_VALUE;
            this.i.invalidate();
            U(i, 65536);
            return true;
        }
        return false;
    }

    private boolean p() {
        int i = this.l;
        return i != Integer.MIN_VALUE && J(i, 16, null);
    }

    private AccessibilityEvent q(int i, int i2) {
        return i != -1 ? r(i, i2) : s(i2);
    }

    private AccessibilityEvent r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        b.g.l.c0.c H = H(i);
        obtain.getText().add(H.x());
        obtain.setContentDescription(H.s());
        obtain.setScrollable(H.K());
        obtain.setPassword(H.J());
        obtain.setEnabled(H.F());
        obtain.setChecked(H.D());
        L(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(H.p());
            e.c(obtain, this.i, i);
            obtain.setPackageName(this.i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    private AccessibilityEvent s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private b.g.l.c0.c t(int i) {
        b.g.l.c0.c O = b.g.l.c0.c.O();
        O.g0(true);
        O.i0(true);
        O.b0("android.view.View");
        Rect rect = n;
        O.X(rect);
        O.Y(rect);
        O.p0(this.i);
        N(i, O);
        if (O.x() == null && O.s() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        O.m(this.f2607e);
        if (this.f2607e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int k = O.k();
        if ((k & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((k & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        O.n0(this.i.getContext().getPackageName());
        O.w0(this.i, i);
        if (this.k == i) {
            O.V(true);
            O.a(128);
        } else {
            O.V(false);
            O.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            O.a(2);
        } else if (O.G()) {
            O.a(1);
        }
        O.j0(z);
        this.i.getLocationOnScreen(this.f2609g);
        O.n(this.f2606d);
        if (this.f2606d.equals(rect)) {
            O.m(this.f2606d);
            if (O.f2525b != -1) {
                b.g.l.c0.c O2 = b.g.l.c0.c.O();
                for (int i2 = O.f2525b; i2 != -1; i2 = O2.f2525b) {
                    O2.q0(this.i, -1);
                    O2.X(n);
                    N(i2, O2);
                    O2.m(this.f2607e);
                    Rect rect2 = this.f2606d;
                    Rect rect3 = this.f2607e;
                    rect2.offset(rect3.left, rect3.top);
                }
                O2.S();
            }
            this.f2606d.offset(this.f2609g[0] - this.i.getScrollX(), this.f2609g[1] - this.i.getScrollY());
        }
        if (this.i.getLocalVisibleRect(this.f2608f)) {
            this.f2608f.offset(this.f2609g[0] - this.i.getScrollX(), this.f2609g[1] - this.i.getScrollY());
            if (this.f2606d.intersect(this.f2608f)) {
                O.Y(this.f2606d);
                if (E(this.f2606d)) {
                    O.y0(true);
                }
            }
        }
        return O;
    }

    private b.g.l.c0.c u() {
        b.g.l.c0.c P = b.g.l.c0.c.P(this.i);
        t.W(this.i, P);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (P.o() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                P.d(this.i, ((Integer) arrayList.get(i)).intValue());
            }
            return P;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private h<b.g.l.c0.c> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        h<b.g.l.c0.c> hVar = new h<>();
        for (int i = 0; i < arrayList.size(); i++) {
            hVar.m(arrayList.get(i).intValue(), t(arrayList.get(i).intValue()));
        }
        return hVar;
    }

    private void z(int i, Rect rect) {
        H(i).m(rect);
    }

    public final int A() {
        return this.l;
    }

    protected abstract int B(float f2, float f3);

    protected abstract void C(List<Integer> list);

    b.g.l.c0.c H(int i) {
        return i == -1 ? u() : t(i);
    }

    public final void I(boolean z, int i, Rect rect) {
        int i2 = this.l;
        if (i2 != Integer.MIN_VALUE) {
            o(i2);
        }
        if (z) {
            G(i, rect);
        }
    }

    protected abstract boolean J(int i, int i2, Bundle bundle);

    protected void K(AccessibilityEvent accessibilityEvent) {
    }

    protected void L(int i, AccessibilityEvent accessibilityEvent) {
    }

    protected void M(b.g.l.c0.c cVar) {
    }

    protected abstract void N(int i, b.g.l.c0.c cVar);

    protected void O(int i, boolean z) {
    }

    boolean P(int i, int i2, Bundle bundle) {
        return i != -1 ? Q(i, i2, bundle) : R(i2, bundle);
    }

    public final boolean T(int i) {
        int i2;
        if ((this.i.isFocused() || this.i.requestFocus()) && (i2 = this.l) != i) {
            if (i2 != Integer.MIN_VALUE) {
                o(i2);
            }
            if (i == Integer.MIN_VALUE) {
                return false;
            }
            this.l = i;
            O(i, true);
            U(i, 8);
            return true;
        }
        return false;
    }

    public final boolean U(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f2610h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.i, q(i, i2));
    }

    @Override // b.g.l.a
    public b.g.l.c0.d b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    @Override // b.g.l.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // b.g.l.a
    public void g(View view, b.g.l.c0.c cVar) {
        super.g(view, cVar);
        M(cVar);
    }

    public final boolean o(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        O(i, false);
        U(i, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f2610h.isEnabled() || !this.f2610h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B = B(motionEvent.getX(), motionEvent.getY());
            V(B);
            return B != Integer.MIN_VALUE;
        } else if (action != 10 || this.m == Integer.MIN_VALUE) {
            return false;
        } else {
            V(Integer.MIN_VALUE);
            return true;
        }
    }

    public final boolean w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return G(2, null);
                }
                if (!keyEvent.hasModifiers(1)) {
                    return false;
                }
                return G(1, null);
            }
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int F = F(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && G(F, null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            p();
            return true;
        }
        return false;
    }

    public final int x() {
        return this.k;
    }
}
