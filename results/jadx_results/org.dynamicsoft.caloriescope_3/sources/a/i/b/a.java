package a.i.b;

import a.d.h;
import a.g.l.d0.d;
import a.g.l.d0.e;
import a.g.l.u;
import a.g.l.x;
import a.i.b.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class a extends a.g.l.a {
    private static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
    private static final b.a<a.g.l.d0.c> o = new C0020a();
    private static final b.AbstractC0021b<h<a.g.l.d0.c>, a.g.l.d0.c> p = new b();
    private final AccessibilityManager h;
    private final View i;
    private c j;
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private final int[] g = new int[2];
    int k = RecyclerView.UNDEFINED_DURATION;
    int l = RecyclerView.UNDEFINED_DURATION;
    private int m = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: a.i.b.a$a */
    /* loaded from: classes.dex */
    static class C0020a implements b.a<a.g.l.d0.c> {
        C0020a() {
        }

        public void a(a.g.l.d0.c cVar, Rect rect) {
            cVar.a(rect);
        }
    }

    /* loaded from: classes.dex */
    static class b implements b.AbstractC0021b<h<a.g.l.d0.c>, a.g.l.d0.c> {
        b() {
        }

        public int a(h<a.g.l.d0.c> hVar) {
            return hVar.b();
        }

        public a.g.l.d0.c a(h<a.g.l.d0.c> hVar, int i) {
            return hVar.d(i);
        }
    }

    /* loaded from: classes.dex */
    private class c extends d {
        c() {
            a.this = r1;
        }

        @Override // a.g.l.d0.d
        public a.g.l.d0.c a(int i) {
            return a.g.l.d0.c.a(a.this.b(i));
        }

        @Override // a.g.l.d0.d
        public boolean a(int i, int i2, Bundle bundle) {
            return a.this.b(i, i2, bundle);
        }

        @Override // a.g.l.d0.d
        public a.g.l.d0.c b(int i) {
            int i2 = i == 2 ? a.this.k : a.this.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i2);
        }
    }

    public a(View view) {
        if (view != null) {
            this.i = view;
            this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (u.m(view) != 0) {
                return;
            }
            u.h(view, 1);
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect a(View view, int i, Rect rect) {
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

    private void a(int i, Rect rect) {
        b(i).a(rect);
    }

    private boolean a(int i, Bundle bundle) {
        return u.a(this.i, i, bundle);
    }

    private boolean a(Rect rect) {
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

    private AccessibilityEvent b(int i, int i2) {
        return i != -1 ? c(i, i2) : e(i2);
    }

    private boolean b(int i, Rect rect) {
        Object obj;
        h<a.g.l.d0.c> f = f();
        int i2 = this.l;
        int i3 = RecyclerView.UNDEFINED_DURATION;
        a.g.l.d0.c a2 = i2 == Integer.MIN_VALUE ? null : f.a(i2);
        if (i == 1 || i == 2) {
            obj = a.i.b.b.a(f, p, o, a2, i, u.o(this.i) == 1, false);
        } else if (i != 17 && i != 33 && i != 66 && i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            Rect rect2 = new Rect();
            int i4 = this.l;
            if (i4 != Integer.MIN_VALUE) {
                a(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                a(this.i, i, rect2);
            }
            obj = a.i.b.b.a(f, p, o, a2, rect2, i);
        }
        a.g.l.d0.c cVar = (a.g.l.d0.c) obj;
        if (cVar != null) {
            i3 = f.b(f.a((h<a.g.l.d0.c>) cVar));
        }
        return c(i3);
    }

    private AccessibilityEvent c(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        a.g.l.d0.c b2 = b(i);
        obtain.getText().add(b2.g());
        obtain.setContentDescription(b2.d());
        obtain.setScrollable(b2.r());
        obtain.setPassword(b2.q());
        obtain.setEnabled(b2.m());
        obtain.setChecked(b2.k());
        a(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(b2.c());
            e.a(obtain, this.i, i);
            obtain.setPackageName(this.i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    private boolean c(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? a(i, i2, bundle) : d(i) : h(i) : a(i) : c(i);
    }

    private boolean d() {
        int i = this.l;
        return i != Integer.MIN_VALUE && a(i, 16, (Bundle) null);
    }

    private boolean d(int i) {
        if (this.k == i) {
            this.k = RecyclerView.UNDEFINED_DURATION;
            this.i.invalidate();
            a(i, 65536);
            return true;
        }
        return false;
    }

    private a.g.l.d0.c e() {
        a.g.l.d0.c f = a.g.l.d0.c.f(this.i);
        u.a(this.i, f);
        ArrayList arrayList = new ArrayList();
        a(arrayList);
        if (f.b() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                f.a(this.i, ((Integer) arrayList.get(i)).intValue());
            }
            return f;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private AccessibilityEvent e(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private h<a.g.l.d0.c> f() {
        ArrayList arrayList = new ArrayList();
        a(arrayList);
        h<a.g.l.d0.c> hVar = new h<>();
        for (int i = 0; i < arrayList.size(); i++) {
            hVar.c(i, f(i));
        }
        return hVar;
    }

    private a.g.l.d0.c f(int i) {
        a.g.l.d0.c z = a.g.l.d0.c.z();
        z.f(true);
        z.g(true);
        z.a("android.view.View");
        z.c(n);
        z.d(n);
        z.b(this.i);
        a(i, z);
        if (z.g() == null && z.d() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        z.a(this.e);
        if (this.e.equals(n)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int a2 = z.a();
        if ((a2 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((a2 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        z.e(this.i.getContext().getPackageName());
        z.c(this.i, i);
        if (this.k == i) {
            z.a(true);
            z.a(128);
        } else {
            z.a(false);
            z.a(64);
        }
        boolean z2 = this.l == i;
        if (z2) {
            z.a(2);
        } else if (z.n()) {
            z.a(1);
        }
        z.h(z2);
        this.i.getLocationOnScreen(this.g);
        z.b(this.d);
        if (this.d.equals(n)) {
            z.a(this.d);
            if (z.f262b != -1) {
                a.g.l.d0.c z3 = a.g.l.d0.c.z();
                for (int i2 = z.f262b; i2 != -1; i2 = z3.f262b) {
                    z3.b(this.i, -1);
                    z3.c(n);
                    a(i2, z3);
                    z3.a(this.e);
                    Rect rect = this.d;
                    Rect rect2 = this.e;
                    rect.offset(rect2.left, rect2.top);
                }
                z3.v();
            }
            this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
        }
        if (this.i.getLocalVisibleRect(this.f)) {
            this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
            if (this.d.intersect(this.f)) {
                z.d(this.d);
                if (a(this.d)) {
                    z.o(true);
                }
            }
        }
        return z;
    }

    private static int g(int i) {
        if (i != 19) {
            if (i == 21) {
                return 17;
            }
            return i != 22 ? 130 : 66;
        }
        return 33;
    }

    private boolean h(int i) {
        int i2;
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled() || (i2 = this.k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            d(i2);
        }
        this.k = i;
        this.i.invalidate();
        a(i, 32768);
        return true;
    }

    private void i(int i) {
        int i2 = this.m;
        if (i2 == i) {
            return;
        }
        this.m = i;
        a(i, 128);
        a(i2, 256);
    }

    protected abstract int a(float f, float f2);

    @Override // a.g.l.a
    public d a(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    protected abstract void a(int i, a.g.l.d0.c cVar);

    protected void a(int i, AccessibilityEvent accessibilityEvent) {
    }

    protected void a(int i, boolean z) {
    }

    protected void a(a.g.l.d0.c cVar) {
    }

    @Override // a.g.l.a
    public void a(View view, a.g.l.d0.c cVar) {
        super.a(view, cVar);
        a(cVar);
    }

    protected void a(AccessibilityEvent accessibilityEvent) {
    }

    protected abstract void a(List<Integer> list);

    public final void a(boolean z, int i, Rect rect) {
        int i2 = this.l;
        if (i2 != Integer.MIN_VALUE) {
            a(i2);
        }
        if (z) {
            b(i, rect);
        }
    }

    public final boolean a(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = RecyclerView.UNDEFINED_DURATION;
        a(i, false);
        a(i, 8);
        return true;
    }

    public final boolean a(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        return x.a(parent, this.i, b(i, i2));
    }

    protected abstract boolean a(int i, int i2, Bundle bundle);

    public final boolean a(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return b(2, (Rect) null);
                }
                if (!keyEvent.hasModifiers(1)) {
                    return false;
                }
                return b(1, (Rect) null);
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
                        int g = g(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && b(g, (Rect) null)) {
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
            d();
            return true;
        }
        return false;
    }

    public final boolean a(MotionEvent motionEvent) {
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int a2 = a(motionEvent.getX(), motionEvent.getY());
            i(a2);
            return a2 != Integer.MIN_VALUE;
        } else if (action != 10 || this.m == Integer.MIN_VALUE) {
            return false;
        } else {
            i(RecyclerView.UNDEFINED_DURATION);
            return true;
        }
    }

    public final int b() {
        return this.k;
    }

    a.g.l.d0.c b(int i) {
        return i == -1 ? e() : f(i);
    }

    @Override // a.g.l.a
    public void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        a(accessibilityEvent);
    }

    boolean b(int i, int i2, Bundle bundle) {
        return i != -1 ? c(i, i2, bundle) : a(i2, bundle);
    }

    public final int c() {
        return this.l;
    }

    public final boolean c(int i) {
        int i2;
        if ((this.i.isFocused() || this.i.requestFocus()) && (i2 = this.l) != i) {
            if (i2 != Integer.MIN_VALUE) {
                a(i2);
            }
            this.l = i;
            a(i, true);
            a(i, 8);
            return true;
        }
        return false;
    }
}
