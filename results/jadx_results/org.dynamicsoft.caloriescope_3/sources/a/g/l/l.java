package a.g.l;

import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public class l {

    /* renamed from: a */
    private ViewParent f273a;

    /* renamed from: b */
    private ViewParent f274b;

    /* renamed from: c */
    private final View f275c;
    private boolean d;
    private int[] e;

    public l(View view) {
        this.f275c = view;
    }

    private void a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f273a = viewParent;
        } else if (i != 1) {
        } else {
            this.f274b = viewParent;
        }
    }

    private boolean b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent d;
        int i6;
        int i7;
        int[] iArr3;
        if (!b() || (d = d(i5)) == null) {
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
            this.f275c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i6 = iArr[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] d2 = d();
            d2[0] = 0;
            d2[1] = 0;
            iArr3 = d2;
        } else {
            iArr3 = iArr2;
        }
        x.a(d, this.f275c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f275c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i6;
        }
        return true;
    }

    private ViewParent d(int i) {
        if (i != 0) {
            if (i == 1) {
                return this.f274b;
            }
            return null;
        }
        return this.f273a;
    }

    private int[] d() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    public void a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        b(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void a(boolean z) {
        if (this.d) {
            u.J(this.f275c);
        }
        this.d = z;
    }

    public boolean a() {
        return a(0);
    }

    public boolean a(float f, float f2) {
        ViewParent d;
        if (!b() || (d = d(0)) == null) {
            return false;
        }
        return x.a(d, this.f275c, f, f2);
    }

    public boolean a(float f, float f2, boolean z) {
        ViewParent d;
        if (!b() || (d = d(0)) == null) {
            return false;
        }
        return x.a(d, this.f275c, f, f2, z);
    }

    public boolean a(int i) {
        return d(i) != null;
    }

    public boolean a(int i, int i2) {
        if (a(i2)) {
            return true;
        }
        if (!b()) {
            return false;
        }
        View view = this.f275c;
        for (ViewParent parent = this.f275c.getParent(); parent != null; parent = parent.getParent()) {
            if (x.b(parent, view, this.f275c, i, i2)) {
                a(i2, parent);
                x.a(parent, view, this.f275c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public boolean a(int i, int i2, int i3, int i4, int[] iArr) {
        return b(i, i2, i3, i4, iArr, 0, null);
    }

    public boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return b(i, i2, i3, i4, iArr, i5, null);
    }

    public boolean a(int i, int i2, int[] iArr, int[] iArr2) {
        return a(i, i2, iArr, iArr2, 0);
    }

    public boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent d;
        int i4;
        int i5;
        if (!b() || (d = d(i3)) == null) {
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
            this.f275c.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i4 = iArr2[1];
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (iArr == null) {
            iArr = d();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        x.a(d, this.f275c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f275c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i4;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean b() {
        return this.d;
    }

    public boolean b(int i) {
        return a(i, 0);
    }

    public void c() {
        c(0);
    }

    public void c(int i) {
        ViewParent d = d(i);
        if (d != null) {
            x.a(d, this.f275c, i);
            a(i, (ViewParent) null);
        }
    }
}
