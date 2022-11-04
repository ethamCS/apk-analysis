package w0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.d;
import androidx.core.view.accessibility.e;
import androidx.core.view.accessibility.f;
import androidx.core.view.y;
import i0.h;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.PSKKeyManager;
import w0.b;
/* loaded from: classes.dex */
public abstract class a extends androidx.core.view.a {

    /* renamed from: n */
    private static final Rect f24618n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    private static final b.a<d> f24619o = new C0434a();

    /* renamed from: p */
    private static final b.AbstractC0435b<h<d>, d> f24620p = new b();

    /* renamed from: h */
    private final AccessibilityManager f24625h;

    /* renamed from: i */
    private final View f24626i;

    /* renamed from: j */
    private c f24627j;

    /* renamed from: d */
    private final Rect f24621d = new Rect();

    /* renamed from: e */
    private final Rect f24622e = new Rect();

    /* renamed from: f */
    private final Rect f24623f = new Rect();

    /* renamed from: g */
    private final int[] f24624g = new int[2];

    /* renamed from: k */
    int f24628k = Integer.MIN_VALUE;

    /* renamed from: l */
    int f24629l = Integer.MIN_VALUE;

    /* renamed from: m */
    private int f24630m = Integer.MIN_VALUE;

    /* renamed from: w0.a$a */
    /* loaded from: classes.dex */
    class C0434a implements b.a<d> {
        C0434a() {
        }

        /* renamed from: b */
        public void a(d dVar, Rect rect) {
            dVar.l(rect);
        }
    }

    /* loaded from: classes.dex */
    class b implements b.AbstractC0435b<h<d>, d> {
        b() {
        }

        /* renamed from: c */
        public d a(h<d> hVar, int i10) {
            return hVar.l(i10);
        }

        /* renamed from: d */
        public int b(h<d> hVar) {
            return hVar.k();
        }
    }

    /* loaded from: classes.dex */
    private class c extends e {
        c() {
            a.this = r1;
        }

        @Override // androidx.core.view.accessibility.e
        public d b(int i10) {
            return d.M(a.this.H(i10));
        }

        @Override // androidx.core.view.accessibility.e
        public d d(int i10) {
            int i11 = i10 == 2 ? a.this.f24628k : a.this.f24629l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // androidx.core.view.accessibility.e
        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.P(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f24626i = view;
            this.f24625h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (y.z(view) != 0) {
                return;
            }
            y.y0(view, 1);
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
        } else if (i10 == 33) {
            rect.set(0, height, width, height);
        } else if (i10 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f24626i.getWindowVisibility() != 0) {
            return false;
        }
        View view = this.f24626i;
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

    private static int F(int i10) {
        if (i10 != 19) {
            if (i10 == 21) {
                return 17;
            }
            return i10 != 22 ? 130 : 66;
        }
        return 33;
    }

    private boolean G(int i10, Rect rect) {
        Object obj;
        h<d> y10 = y();
        int i11 = this.f24629l;
        int i12 = Integer.MIN_VALUE;
        d f10 = i11 == Integer.MIN_VALUE ? null : y10.f(i11);
        if (i10 == 1 || i10 == 2) {
            obj = w0.b.d(y10, f24620p, f24619o, f10, i10, y.B(this.f24626i) == 1, false);
        } else if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            Rect rect2 = new Rect();
            int i13 = this.f24629l;
            if (i13 != Integer.MIN_VALUE) {
                z(i13, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f24626i, i10, rect2);
            }
            obj = w0.b.c(y10, f24620p, f24619o, f10, rect2, i10);
        }
        d dVar = (d) obj;
        if (dVar != null) {
            i12 = y10.i(y10.h(dVar));
        }
        return T(i12);
    }

    private boolean Q(int i10, int i11, Bundle bundle) {
        return i11 != 1 ? i11 != 2 ? i11 != 64 ? i11 != 128 ? J(i10, i11, bundle) : n(i10) : S(i10) : o(i10) : T(i10);
    }

    private boolean R(int i10, Bundle bundle) {
        return y.d0(this.f24626i, i10, bundle);
    }

    private boolean S(int i10) {
        int i11;
        if (!this.f24625h.isEnabled() || !this.f24625h.isTouchExplorationEnabled() || (i11 = this.f24628k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            n(i11);
        }
        this.f24628k = i10;
        this.f24626i.invalidate();
        U(i10, 32768);
        return true;
    }

    private void V(int i10) {
        int i11 = this.f24630m;
        if (i11 == i10) {
            return;
        }
        this.f24630m = i10;
        U(i10, 128);
        U(i11, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    private boolean n(int i10) {
        if (this.f24628k == i10) {
            this.f24628k = Integer.MIN_VALUE;
            this.f24626i.invalidate();
            U(i10, 65536);
            return true;
        }
        return false;
    }

    private boolean p() {
        int i10 = this.f24629l;
        return i10 != Integer.MIN_VALUE && J(i10, 16, null);
    }

    private AccessibilityEvent q(int i10, int i11) {
        return i10 != -1 ? r(i10, i11) : s(i11);
    }

    private AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        d H = H(i10);
        obtain.getText().add(H.v());
        obtain.setContentDescription(H.q());
        obtain.setScrollable(H.H());
        obtain.setPassword(H.G());
        obtain.setEnabled(H.C());
        obtain.setChecked(H.A());
        L(i10, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(H.o());
            f.c(obtain, this.f24626i, i10);
            obtain.setPackageName(this.f24626i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    private AccessibilityEvent s(int i10) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        this.f24626i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private d t(int i10) {
        d K = d.K();
        K.c0(true);
        K.e0(true);
        K.X("android.view.View");
        Rect rect = f24618n;
        K.T(rect);
        K.U(rect);
        K.m0(this.f24626i);
        N(i10, K);
        if (K.v() == null && K.q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        K.l(this.f24622e);
        if (this.f24622e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int j10 = K.j();
        if ((j10 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((j10 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        K.k0(this.f24626i.getContext().getPackageName());
        K.s0(this.f24626i, i10);
        if (this.f24628k == i10) {
            K.R(true);
            K.a(128);
        } else {
            K.R(false);
            K.a(64);
        }
        boolean z10 = this.f24629l == i10;
        if (z10) {
            K.a(2);
        } else if (K.D()) {
            K.a(1);
        }
        K.f0(z10);
        this.f24626i.getLocationOnScreen(this.f24624g);
        K.m(this.f24621d);
        if (this.f24621d.equals(rect)) {
            K.l(this.f24621d);
            if (K.f3612b != -1) {
                d K2 = d.K();
                for (int i11 = K.f3612b; i11 != -1; i11 = K2.f3612b) {
                    K2.n0(this.f24626i, -1);
                    K2.T(f24618n);
                    N(i11, K2);
                    K2.l(this.f24622e);
                    Rect rect2 = this.f24621d;
                    Rect rect3 = this.f24622e;
                    rect2.offset(rect3.left, rect3.top);
                }
                K2.O();
            }
            this.f24621d.offset(this.f24624g[0] - this.f24626i.getScrollX(), this.f24624g[1] - this.f24626i.getScrollY());
        }
        if (this.f24626i.getLocalVisibleRect(this.f24623f)) {
            this.f24623f.offset(this.f24624g[0] - this.f24626i.getScrollX(), this.f24624g[1] - this.f24626i.getScrollY());
            if (this.f24621d.intersect(this.f24623f)) {
                K.U(this.f24621d);
                if (E(this.f24621d)) {
                    K.w0(true);
                }
            }
        }
        return K;
    }

    private d u() {
        d L = d.L(this.f24626i);
        y.b0(this.f24626i, L);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (L.n() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                L.c(this.f24626i, ((Integer) arrayList.get(i10)).intValue());
            }
            return L;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private h<d> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        h<d> hVar = new h<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            hVar.j(arrayList.get(i10).intValue(), t(arrayList.get(i10).intValue()));
        }
        return hVar;
    }

    private void z(int i10, Rect rect) {
        H(i10).l(rect);
    }

    public final int A() {
        return this.f24629l;
    }

    protected abstract int B(float f10, float f11);

    protected abstract void C(List<Integer> list);

    d H(int i10) {
        return i10 == -1 ? u() : t(i10);
    }

    public final void I(boolean z10, int i10, Rect rect) {
        int i11 = this.f24629l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            G(i10, rect);
        }
    }

    protected abstract boolean J(int i10, int i11, Bundle bundle);

    protected void K(AccessibilityEvent accessibilityEvent) {
    }

    protected void L(int i10, AccessibilityEvent accessibilityEvent) {
    }

    protected abstract void M(d dVar);

    protected abstract void N(int i10, d dVar);

    protected abstract void O(int i10, boolean z10);

    boolean P(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? Q(i10, i11, bundle) : R(i11, bundle);
    }

    public final boolean T(int i10) {
        int i11;
        if ((this.f24626i.isFocused() || this.f24626i.requestFocus()) && (i11 = this.f24629l) != i10) {
            if (i11 != Integer.MIN_VALUE) {
                o(i11);
            }
            if (i10 == Integer.MIN_VALUE) {
                return false;
            }
            this.f24629l = i10;
            O(i10, true);
            U(i10, 8);
            return true;
        }
        return false;
    }

    public final boolean U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f24625h.isEnabled() || (parent = this.f24626i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f24626i, q(i10, i11));
    }

    @Override // androidx.core.view.a
    public e b(View view) {
        if (this.f24627j == null) {
            this.f24627j = new c();
        }
        return this.f24627j;
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void g(View view, d dVar) {
        super.g(view, dVar);
        M(dVar);
    }

    public final boolean o(int i10) {
        if (this.f24629l != i10) {
            return false;
        }
        this.f24629l = Integer.MIN_VALUE;
        O(i10, false);
        U(i10, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f24625h.isEnabled() || !this.f24625h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B = B(motionEvent.getX(), motionEvent.getY());
            V(B);
            return B != Integer.MIN_VALUE;
        } else if (action != 10 || this.f24630m == Integer.MIN_VALUE) {
            return false;
        } else {
            V(Integer.MIN_VALUE);
            return true;
        }
    }

    public final boolean w(KeyEvent keyEvent) {
        int i10 = 0;
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
                        boolean z10 = false;
                        while (i10 < repeatCount && G(F, null)) {
                            i10++;
                            z10 = true;
                        }
                        return z10;
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
        return this.f24628k;
    }
}
