package b.d;
/* loaded from: classes.dex */
public class d<E> implements Cloneable {

    /* renamed from: f */
    private static final Object f2132f = new Object();

    /* renamed from: b */
    private boolean f2133b;

    /* renamed from: c */
    private long[] f2134c;

    /* renamed from: d */
    private Object[] f2135d;

    /* renamed from: e */
    private int f2136e;

    public d() {
        this(10);
    }

    public d(int i) {
        this.f2133b = false;
        if (i == 0) {
            this.f2134c = c.f2130b;
            this.f2135d = c.f2131c;
            return;
        }
        int f2 = c.f(i);
        this.f2134c = new long[f2];
        this.f2135d = new Object[f2];
    }

    private void f() {
        int i = this.f2136e;
        long[] jArr = this.f2134c;
        Object[] objArr = this.f2135d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f2132f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f2133b = false;
        this.f2136e = i2;
    }

    public void b(long j, E e2) {
        int i = this.f2136e;
        if (i != 0 && j <= this.f2134c[i - 1]) {
            l(j, e2);
            return;
        }
        if (this.f2133b && i >= this.f2134c.length) {
            f();
        }
        int i2 = this.f2136e;
        if (i2 >= this.f2134c.length) {
            int f2 = c.f(i2 + 1);
            long[] jArr = new long[f2];
            Object[] objArr = new Object[f2];
            long[] jArr2 = this.f2134c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f2135d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2134c = jArr;
            this.f2135d = objArr;
        }
        this.f2134c[i2] = j;
        this.f2135d[i2] = e2;
        this.f2136e = i2 + 1;
    }

    public void d() {
        int i = this.f2136e;
        Object[] objArr = this.f2135d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f2136e = 0;
        this.f2133b = false;
    }

    /* renamed from: e */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f2134c = (long[]) this.f2134c.clone();
            dVar.f2135d = (Object[]) this.f2135d.clone();
            return dVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E g(long j) {
        return h(j, null);
    }

    public E h(long j, E e2) {
        int b2 = c.b(this.f2134c, this.f2136e, j);
        if (b2 >= 0) {
            Object[] objArr = this.f2135d;
            if (objArr[b2] != f2132f) {
                return (E) objArr[b2];
            }
        }
        return e2;
    }

    public int i(long j) {
        if (this.f2133b) {
            f();
        }
        return c.b(this.f2134c, this.f2136e, j);
    }

    public long j(int i) {
        if (this.f2133b) {
            f();
        }
        return this.f2134c[i];
    }

    public void l(long j, E e2) {
        int b2 = c.b(this.f2134c, this.f2136e, j);
        if (b2 >= 0) {
            this.f2135d[b2] = e2;
            return;
        }
        int i = ~b2;
        int i2 = this.f2136e;
        if (i < i2) {
            Object[] objArr = this.f2135d;
            if (objArr[i] == f2132f) {
                this.f2134c[i] = j;
                objArr[i] = e2;
                return;
            }
        }
        if (this.f2133b && i2 >= this.f2134c.length) {
            f();
            i = ~c.b(this.f2134c, this.f2136e, j);
        }
        int i3 = this.f2136e;
        if (i3 >= this.f2134c.length) {
            int f2 = c.f(i3 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.f2134c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2135d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2134c = jArr;
            this.f2135d = objArr2;
        }
        int i4 = this.f2136e;
        if (i4 - i != 0) {
            long[] jArr3 = this.f2134c;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f2135d;
            System.arraycopy(objArr4, i, objArr4, i5, this.f2136e - i);
        }
        this.f2134c[i] = j;
        this.f2135d[i] = e2;
        this.f2136e++;
    }

    public void m(long j) {
        int b2 = c.b(this.f2134c, this.f2136e, j);
        if (b2 >= 0) {
            Object[] objArr = this.f2135d;
            Object obj = objArr[b2];
            Object obj2 = f2132f;
            if (obj == obj2) {
                return;
            }
            objArr[b2] = obj2;
            this.f2133b = true;
        }
    }

    public void n(int i) {
        Object[] objArr = this.f2135d;
        Object obj = objArr[i];
        Object obj2 = f2132f;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f2133b = true;
        }
    }

    public int o() {
        if (this.f2133b) {
            f();
        }
        return this.f2136e;
    }

    public E p(int i) {
        if (this.f2133b) {
            f();
        }
        return (E) this.f2135d[i];
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2136e * 28);
        sb.append('{');
        for (int i = 0; i < this.f2136e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(j(i));
            sb.append('=');
            E p = p(i);
            if (p != this) {
                sb.append(p);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
