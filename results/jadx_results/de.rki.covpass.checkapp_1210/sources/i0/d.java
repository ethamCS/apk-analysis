package i0;
/* loaded from: classes.dex */
public class d<E> implements Cloneable {

    /* renamed from: y */
    private static final Object f12265y = new Object();

    /* renamed from: c */
    private boolean f12266c;

    /* renamed from: d */
    private long[] f12267d;

    /* renamed from: q */
    private Object[] f12268q;

    /* renamed from: x */
    private int f12269x;

    public d() {
        this(10);
    }

    public d(int i10) {
        this.f12266c = false;
        if (i10 == 0) {
            this.f12267d = c.f12263b;
            this.f12268q = c.f12264c;
            return;
        }
        int f10 = c.f(i10);
        this.f12267d = new long[f10];
        this.f12268q = new Object[f10];
    }

    private void f() {
        int i10 = this.f12269x;
        long[] jArr = this.f12267d;
        Object[] objArr = this.f12268q;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f12265y) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f12266c = false;
        this.f12269x = i11;
    }

    public void a(long j10, E e10) {
        int i10 = this.f12269x;
        if (i10 != 0 && j10 <= this.f12267d[i10 - 1]) {
            l(j10, e10);
            return;
        }
        if (this.f12266c && i10 >= this.f12267d.length) {
            f();
        }
        int i11 = this.f12269x;
        if (i11 >= this.f12267d.length) {
            int f10 = c.f(i11 + 1);
            long[] jArr = new long[f10];
            Object[] objArr = new Object[f10];
            long[] jArr2 = this.f12267d;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f12268q;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f12267d = jArr;
            this.f12268q = objArr;
        }
        this.f12267d[i11] = j10;
        this.f12268q[i11] = e10;
        this.f12269x = i11 + 1;
    }

    public void c() {
        int i10 = this.f12269x;
        Object[] objArr = this.f12268q;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f12269x = 0;
        this.f12266c = false;
    }

    /* renamed from: d */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f12267d = (long[]) this.f12267d.clone();
            dVar.f12268q = (Object[]) this.f12268q.clone();
            return dVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean e(long j10) {
        return i(j10) >= 0;
    }

    public E g(long j10) {
        return h(j10, null);
    }

    public E h(long j10, E e10) {
        int b10 = c.b(this.f12267d, this.f12269x, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f12268q;
            if (objArr[b10] != f12265y) {
                return (E) objArr[b10];
            }
        }
        return e10;
    }

    public int i(long j10) {
        if (this.f12266c) {
            f();
        }
        return c.b(this.f12267d, this.f12269x, j10);
    }

    public boolean j() {
        return p() == 0;
    }

    public long k(int i10) {
        if (this.f12266c) {
            f();
        }
        return this.f12267d[i10];
    }

    public void l(long j10, E e10) {
        int b10 = c.b(this.f12267d, this.f12269x, j10);
        if (b10 >= 0) {
            this.f12268q[b10] = e10;
            return;
        }
        int i10 = ~b10;
        int i11 = this.f12269x;
        if (i10 < i11) {
            Object[] objArr = this.f12268q;
            if (objArr[i10] == f12265y) {
                this.f12267d[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f12266c && i11 >= this.f12267d.length) {
            f();
            i10 = ~c.b(this.f12267d, this.f12269x, j10);
        }
        int i12 = this.f12269x;
        if (i12 >= this.f12267d.length) {
            int f10 = c.f(i12 + 1);
            long[] jArr = new long[f10];
            Object[] objArr2 = new Object[f10];
            long[] jArr2 = this.f12267d;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f12268q;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f12267d = jArr;
            this.f12268q = objArr2;
        }
        int i13 = this.f12269x;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f12267d;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f12268q;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f12269x - i10);
        }
        this.f12267d[i10] = j10;
        this.f12268q[i10] = e10;
        this.f12269x++;
    }

    public void m(long j10) {
        int b10 = c.b(this.f12267d, this.f12269x, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f12268q;
            Object obj = objArr[b10];
            Object obj2 = f12265y;
            if (obj == obj2) {
                return;
            }
            objArr[b10] = obj2;
            this.f12266c = true;
        }
    }

    public void o(int i10) {
        Object[] objArr = this.f12268q;
        Object obj = objArr[i10];
        Object obj2 = f12265y;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f12266c = true;
        }
    }

    public int p() {
        if (this.f12266c) {
            f();
        }
        return this.f12269x;
    }

    public E q(int i10) {
        if (this.f12266c) {
            f();
        }
        return (E) this.f12268q[i10];
    }

    public String toString() {
        if (p() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f12269x * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f12269x; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(k(i10));
            sb2.append('=');
            E q10 = q(i10);
            if (q10 != this) {
                sb2.append(q10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
