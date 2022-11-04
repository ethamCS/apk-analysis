package b.d;
/* loaded from: classes.dex */
public class h<E> implements Cloneable {

    /* renamed from: f */
    private static final Object f2167f = new Object();

    /* renamed from: b */
    private boolean f2168b;

    /* renamed from: c */
    private int[] f2169c;

    /* renamed from: d */
    private Object[] f2170d;

    /* renamed from: e */
    private int f2171e;

    public h() {
        this(10);
    }

    public h(int i) {
        this.f2168b = false;
        if (i == 0) {
            this.f2169c = c.f2129a;
            this.f2170d = c.f2131c;
            return;
        }
        int e2 = c.e(i);
        this.f2169c = new int[e2];
        this.f2170d = new Object[e2];
    }

    private void f() {
        int i = this.f2171e;
        int[] iArr = this.f2169c;
        Object[] objArr = this.f2170d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2167f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2168b = false;
        this.f2171e = i2;
    }

    public void b(int i, E e2) {
        int i2 = this.f2171e;
        if (i2 != 0 && i <= this.f2169c[i2 - 1]) {
            m(i, e2);
            return;
        }
        if (this.f2168b && i2 >= this.f2169c.length) {
            f();
        }
        int i3 = this.f2171e;
        if (i3 >= this.f2169c.length) {
            int e3 = c.e(i3 + 1);
            int[] iArr = new int[e3];
            Object[] objArr = new Object[e3];
            int[] iArr2 = this.f2169c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f2170d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2169c = iArr;
            this.f2170d = objArr;
        }
        this.f2169c[i3] = i;
        this.f2170d[i3] = e2;
        this.f2171e = i3 + 1;
    }

    public void d() {
        int i = this.f2171e;
        Object[] objArr = this.f2170d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2171e = 0;
        this.f2168b = false;
    }

    /* renamed from: e */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f2169c = (int[]) this.f2169c.clone();
            hVar.f2170d = (Object[]) this.f2170d.clone();
            return hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E g(int i) {
        return h(i, null);
    }

    public E h(int i, E e2) {
        int a2 = c.a(this.f2169c, this.f2171e, i);
        if (a2 >= 0) {
            Object[] objArr = this.f2170d;
            if (objArr[a2] != f2167f) {
                return (E) objArr[a2];
            }
        }
        return e2;
    }

    public int i(int i) {
        if (this.f2168b) {
            f();
        }
        return c.a(this.f2169c, this.f2171e, i);
    }

    public int j(E e2) {
        if (this.f2168b) {
            f();
        }
        for (int i = 0; i < this.f2171e; i++) {
            if (this.f2170d[i] == e2) {
                return i;
            }
        }
        return -1;
    }

    public int l(int i) {
        if (this.f2168b) {
            f();
        }
        return this.f2169c[i];
    }

    public void m(int i, E e2) {
        int a2 = c.a(this.f2169c, this.f2171e, i);
        if (a2 >= 0) {
            this.f2170d[a2] = e2;
            return;
        }
        int i2 = ~a2;
        int i3 = this.f2171e;
        if (i2 < i3) {
            Object[] objArr = this.f2170d;
            if (objArr[i2] == f2167f) {
                this.f2169c[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f2168b && i3 >= this.f2169c.length) {
            f();
            i2 = ~c.a(this.f2169c, this.f2171e, i);
        }
        int i4 = this.f2171e;
        if (i4 >= this.f2169c.length) {
            int e3 = c.e(i4 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.f2169c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2170d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2169c = iArr;
            this.f2170d = objArr2;
        }
        int i5 = this.f2171e;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f2169c;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f2170d;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f2171e - i2);
        }
        this.f2169c[i2] = i;
        this.f2170d[i2] = e2;
        this.f2171e++;
    }

    public void n(int i) {
        int a2 = c.a(this.f2169c, this.f2171e, i);
        if (a2 >= 0) {
            Object[] objArr = this.f2170d;
            Object obj = objArr[a2];
            Object obj2 = f2167f;
            if (obj == obj2) {
                return;
            }
            objArr[a2] = obj2;
            this.f2168b = true;
        }
    }

    public void o(int i) {
        Object[] objArr = this.f2170d;
        Object obj = objArr[i];
        Object obj2 = f2167f;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f2168b = true;
        }
    }

    public int p() {
        if (this.f2168b) {
            f();
        }
        return this.f2171e;
    }

    public E q(int i) {
        if (this.f2168b) {
            f();
        }
        return (E) this.f2170d[i];
    }

    public String toString() {
        if (p() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2171e * 28);
        sb.append('{');
        for (int i = 0; i < this.f2171e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(l(i));
            sb.append('=');
            E q = q(i);
            if (q != this) {
                sb.append(q);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
