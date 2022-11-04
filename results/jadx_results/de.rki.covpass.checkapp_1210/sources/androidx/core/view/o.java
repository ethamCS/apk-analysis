package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public class o {

    /* renamed from: a */
    private ViewParent f3721a;

    /* renamed from: b */
    private ViewParent f3722b;

    /* renamed from: c */
    private final View f3723c;

    /* renamed from: d */
    private boolean f3724d;

    /* renamed from: e */
    private int[] f3725e;

    public o(View view) {
        this.f3723c = view;
    }

    private boolean g(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent h10;
        int i15;
        int i16;
        int[] iArr3;
        if (!l() || (h10 = h(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f3723c.getLocationInWindow(iArr);
            i16 = iArr[0];
            i15 = iArr[1];
        } else {
            i16 = 0;
            i15 = 0;
        }
        if (iArr2 == null) {
            int[] i17 = i();
            i17[0] = 0;
            i17[1] = 0;
            iArr3 = i17;
        } else {
            iArr3 = iArr2;
        }
        c0.d(h10, this.f3723c, i10, i11, i12, i13, i14, iArr3);
        if (iArr != null) {
            this.f3723c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i16;
            iArr[1] = iArr[1] - i15;
        }
        return true;
    }

    private ViewParent h(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return this.f3722b;
            }
            return null;
        }
        return this.f3721a;
    }

    private int[] i() {
        if (this.f3725e == null) {
            this.f3725e = new int[2];
        }
        return this.f3725e;
    }

    private void n(int i10, ViewParent viewParent) {
        if (i10 == 0) {
            this.f3721a = viewParent;
        } else if (i10 != 1) {
        } else {
            this.f3722b = viewParent;
        }
    }

    public boolean a(float f10, float f11, boolean z10) {
        ViewParent h10;
        if (!l() || (h10 = h(0)) == null) {
            return false;
        }
        return c0.a(h10, this.f3723c, f10, f11, z10);
    }

    public boolean b(float f10, float f11) {
        ViewParent h10;
        if (!l() || (h10 = h(0)) == null) {
            return false;
        }
        return c0.b(h10, this.f3723c, f10, f11);
    }

    public boolean c(int i10, int i11, int[] iArr, int[] iArr2) {
        return d(i10, i11, iArr, iArr2, 0);
    }

    public boolean d(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent h10;
        int i13;
        int i14;
        if (!l() || (h10 = h(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f3723c.getLocationInWindow(iArr2);
            i14 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i14 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            iArr = i();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        c0.c(h10, this.f3723c, i10, i11, iArr, i12);
        if (iArr2 != null) {
            this.f3723c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i14;
            iArr2[1] = iArr2[1] - i13;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        g(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public boolean f(int i10, int i11, int i12, int i13, int[] iArr) {
        return g(i10, i11, i12, i13, iArr, 0, null);
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int i10) {
        return h(i10) != null;
    }

    public boolean l() {
        return this.f3724d;
    }

    public void m(boolean z10) {
        if (this.f3724d) {
            y.J0(this.f3723c);
        }
        this.f3724d = z10;
    }

    public boolean o(int i10) {
        return p(i10, 0);
    }

    public boolean p(int i10, int i11) {
        if (k(i11)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        View view = this.f3723c;
        for (ViewParent parent = this.f3723c.getParent(); parent != null; parent = parent.getParent()) {
            if (c0.f(parent, view, this.f3723c, i10, i11)) {
                n(i11, parent);
                c0.e(parent, view, this.f3723c, i10, i11);
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

    public void r(int i10) {
        ViewParent h10 = h(i10);
        if (h10 != null) {
            c0.g(h10, this.f3723c, i10);
            n(i10, null);
        }
    }
}
