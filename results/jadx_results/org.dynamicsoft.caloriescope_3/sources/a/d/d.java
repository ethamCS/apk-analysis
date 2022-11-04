package a.d;
/* loaded from: classes.dex */
public class d<E> implements Cloneable {
    private static final Object f = new Object();

    /* renamed from: b */
    private boolean f80b;

    /* renamed from: c */
    private long[] f81c;
    private Object[] d;
    private int e;

    public d() {
        this(10);
    }

    public d(int i) {
        this.f80b = false;
        if (i == 0) {
            this.f81c = c.f78b;
            this.d = c.f79c;
            return;
        }
        int c2 = c.c(i);
        this.f81c = new long[c2];
        this.d = new Object[c2];
    }

    private void c() {
        int i = this.e;
        long[] jArr = this.f81c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f80b = false;
        this.e = i2;
    }

    public long a(int i) {
        if (this.f80b) {
            c();
        }
        return this.f81c[i];
    }

    public void a() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.f80b = false;
    }

    @Deprecated
    public void a(long j) {
        d(j);
    }

    public void a(long j, E e) {
        int i = this.e;
        if (i != 0 && j <= this.f81c[i - 1]) {
            c(j, e);
            return;
        }
        if (this.f80b && this.e >= this.f81c.length) {
            c();
        }
        int i2 = this.e;
        if (i2 >= this.f81c.length) {
            int c2 = c.c(i2 + 1);
            long[] jArr = new long[c2];
            Object[] objArr = new Object[c2];
            long[] jArr2 = this.f81c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f81c = jArr;
            this.d = objArr;
        }
        this.f81c[i2] = j;
        this.d[i2] = e;
        this.e = i2 + 1;
    }

    public int b() {
        if (this.f80b) {
            c();
        }
        return this.e;
    }

    public E b(long j) {
        return b(j, null);
    }

    public E b(long j, E e) {
        int a2 = c.a(this.f81c, this.e, j);
        if (a2 >= 0) {
            Object[] objArr = this.d;
            if (objArr[a2] != f) {
                return (E) objArr[a2];
            }
        }
        return e;
    }

    public void b(int i) {
        Object[] objArr = this.d;
        Object obj = objArr[i];
        Object obj2 = f;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f80b = true;
        }
    }

    public int c(long j) {
        if (this.f80b) {
            c();
        }
        return c.a(this.f81c, this.e, j);
    }

    public E c(int i) {
        if (this.f80b) {
            c();
        }
        return (E) this.d[i];
    }

    public void c(long j, E e) {
        int a2 = c.a(this.f81c, this.e, j);
        if (a2 >= 0) {
            this.d[a2] = e;
            return;
        }
        int i = a2 ^ (-1);
        if (i < this.e) {
            Object[] objArr = this.d;
            if (objArr[i] == f) {
                this.f81c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f80b && this.e >= this.f81c.length) {
            c();
            i = c.a(this.f81c, this.e, j) ^ (-1);
        }
        int i2 = this.e;
        if (i2 >= this.f81c.length) {
            int c2 = c.c(i2 + 1);
            long[] jArr = new long[c2];
            Object[] objArr2 = new Object[c2];
            long[] jArr2 = this.f81c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f81c = jArr;
            this.d = objArr2;
        }
        int i3 = this.e;
        if (i3 - i != 0) {
            long[] jArr3 = this.f81c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i, objArr4, i4, this.e - i);
        }
        this.f81c[i] = j;
        this.d[i] = e;
        this.e++;
    }

    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f81c = (long[]) this.f81c.clone();
            dVar.d = (Object[]) this.d.clone();
            return dVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public void d(long j) {
        int a2 = c.a(this.f81c, this.e, j);
        if (a2 >= 0) {
            Object[] objArr = this.d;
            Object obj = objArr[a2];
            Object obj2 = f;
            if (obj == obj2) {
                return;
            }
            objArr[a2] = obj2;
            this.f80b = true;
        }
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(a(i));
            sb.append('=');
            E c2 = c(i);
            if (c2 != this) {
                sb.append(c2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
