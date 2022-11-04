package b.g.l;

import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a */
    private ViewParent f2556a;

    /* renamed from: b */
    private ViewParent f2557b;

    /* renamed from: c */
    private final View f2558c;

    /* renamed from: d */
    private boolean f2559d;

    /* renamed from: e */
    private int[] f2560e;

    public l(View view) {
        this.f2558c = view;
    }

    private boolean g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent h2;
        int i6;
        int i7;
        int[] iArr3;
        if (!l() || (h2 = h(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f2558c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i6 = iArr[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] i8 = i();
            i8[0] = 0;
            i8[1] = 0;
            iArr3 = i8;
        } else {
            iArr3 = iArr2;
        }
        w.d(h2, this.f2558c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f2558c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i6;
        }
        return true;
    }

    private ViewParent h(int i) {
        if (i != 0) {
            if (i == 1) {
                return this.f2557b;
            }
            return null;
        }
        return this.f2556a;
    }

    private int[] i() {
        if (this.f2560e == null) {
            this.f2560e = new int[2];
        }
        return this.f2560e;
    }

    private void n(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f2556a = viewParent;
        } else if (i != 1) {
        } else {
            this.f2557b = viewParent;
        }
    }

    public boolean a(float f2, float f3, boolean z) {
        ViewParent h2;
        if (!l() || (h2 = h(0)) == null) {
            return false;
        }
        return w.a(h2, this.f2558c, f2, f3, z);
    }

    public boolean b(float f2, float f3) {
        ViewParent h2;
        if (!l() || (h2 = h(0)) == null) {
            return false;
        }
        return w.b(h2, this.f2558c, f2, f3);
    }

    public boolean c(int i, int i2, int[] iArr, int[] iArr2) {
        return d(i, i2, iArr, iArr2, 0);
    }

    public boolean d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent h2;
        int i4;
        int i5;
        if (!l() || (h2 = h(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f2558c.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i4 = iArr2[1];
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (iArr == null) {
            iArr = i();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        w.c(h2, this.f2558c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f2558c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i4;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean f(int i, int i2, int i3, int i4, int[] iArr) {
        return g(i, i2, i3, i4, iArr, 0, null);
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int i) {
        return h(i) != null;
    }

    public boolean l() {
        return this.f2559d;
    }

    public void m(boolean z) {
        if (this.f2559d) {
            t.x0(this.f2558c);
        }
        this.f2559d = z;
    }

    public boolean o(int i) {
        return p(i, 0);
    }

    public boolean p(int i, int i2) {
        if (k(i2)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        View view = this.f2558c;
        for (ViewParent parent = this.f2558c.getParent(); parent != null; parent = parent.getParent()) {
            if (w.f(parent, view, this.f2558c, i, i2)) {
                n(i2, parent);
                w.e(parent, view, this.f2558c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void q() {
        r(0);
    }

    public void r(int i) {
        ViewParent h2 = h(i);
        if (h2 != null) {
            w.g(h2, this.f2558c, i);
            n(i, null);
        }
    }
}
