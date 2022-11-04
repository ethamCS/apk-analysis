package i0;
/* loaded from: classes.dex */
public class h<E> implements Cloneable {

    /* renamed from: y */
    private static final Object f12298y = new Object();

    /* renamed from: c */
    private boolean f12299c;

    /* renamed from: d */
    private int[] f12300d;

    /* renamed from: q */
    private Object[] f12301q;

    /* renamed from: x */
    private int f12302x;

    public h() {
        this(10);
    }

    public h(int i10) {
        this.f12299c = false;
        if (i10 == 0) {
            this.f12300d = c.f12262a;
            this.f12301q = c.f12264c;
            return;
        }
        int e10 = c.e(i10);
        this.f12300d = new int[e10];
        this.f12301q = new Object[e10];
    }

    private void e() {
        int i10 = this.f12302x;
        int[] iArr = this.f12300d;
        Object[] objArr = this.f12301q;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f12298y) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f12299c = false;
        this.f12302x = i11;
    }

    public void a(int i10, E e10) {
        int i11 = this.f12302x;
        if (i11 != 0 && i10 <= this.f12300d[i11 - 1]) {
            j(i10, e10);
            return;
        }
        if (this.f12299c && i11 >= this.f12300d.length) {
            e();
        }
        int i12 = this.f12302x;
        if (i12 >= this.f12300d.length) {
            int e11 = c.e(i12 + 1);
            int[] iArr = new int[e11];
            Object[] objArr = new Object[e11];
            int[] iArr2 = this.f12300d;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f12301q;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f12300d = iArr;
            this.f12301q = objArr;
        }
        this.f12300d[i12] = i10;
        this.f12301q[i12] = e10;
        this.f12302x = i12 + 1;
    }

    public void c() {
        int i10 = this.f12302x;
        Object[] objArr = this.f12301q;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f12302x = 0;
        this.f12299c = false;
    }

    /* renamed from: d */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f12300d = (int[]) this.f12300d.clone();
            hVar.f12301q = (Object[]) this.f12301q.clone();
            return hVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public E f(int i10) {
        return g(i10, null);
    }

    public E g(int i10, E e10) {
        int a10 = c.a(this.f12300d, this.f12302x, i10);
        if (a10 >= 0) {
            Object[] objArr = this.f12301q;
            if (objArr[a10] != f12298y) {
                return (E) objArr[a10];
            }
        }
        return e10;
    }

    public int h(E e10) {
        if (this.f12299c) {
            e();
        }
        for (int i10 = 0; i10 < this.f12302x; i10++) {
            if (this.f12301q[i10] == e10) {
                return i10;
            }
        }
        return -1;
    }

    public int i(int i10) {
        if (this.f12299c) {
            e();
        }
        return this.f12300d[i10];
    }

    public void j(int i10, E e10) {
        int a10 = c.a(this.f12300d, this.f12302x, i10);
        if (a10 >= 0) {
            this.f12301q[a10] = e10;
            return;
        }
        int i11 = ~a10;
        int i12 = this.f12302x;
        if (i11 < i12) {
            Object[] objArr = this.f12301q;
            if (objArr[i11] == f12298y) {
                this.f12300d[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f12299c && i12 >= this.f12300d.length) {
            e();
            i11 = ~c.a(this.f12300d, this.f12302x, i10);
        }
        int i13 = this.f12302x;
        if (i13 >= this.f12300d.length) {
            int e11 = c.e(i13 + 1);
            int[] iArr = new int[e11];
            Object[] objArr2 = new Object[e11];
            int[] iArr2 = this.f12300d;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f12301q;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f12300d = iArr;
            this.f12301q = objArr2;
        }
        int i14 = this.f12302x;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f12300d;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f12301q;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f12302x - i11);
        }
        this.f12300d[i11] = i10;
        this.f12301q[i11] = e10;
        this.f12302x++;
    }

    public int k() {
        if (this.f12299c) {
            e();
        }
        return this.f12302x;
    }

    public E l(int i10) {
        if (this.f12299c) {
            e();
        }
        return (E) this.f12301q[i10];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f12302x * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f12302x; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(i(i10));
            sb2.append('=');
            E l10 = l(i10);
            if (l10 != this) {
                sb2.append(l10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
