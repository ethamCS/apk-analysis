package a.d;
/* loaded from: classes.dex */
public class h<E> implements Cloneable {
    private static final Object f = new Object();

    /* renamed from: b */
    private boolean f97b;

    /* renamed from: c */
    private int[] f98c;
    private Object[] d;
    private int e;

    public h() {
        this(10);
    }

    public h(int i) {
        this.f97b = false;
        if (i == 0) {
            this.f98c = c.f77a;
            this.d = c.f79c;
            return;
        }
        int b2 = c.b(i);
        this.f98c = new int[b2];
        this.d = new Object[b2];
    }

    private void c() {
        int i = this.e;
        int[] iArr = this.f98c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f97b = false;
        this.e = i2;
    }

    public int a(E e) {
        if (this.f97b) {
            c();
        }
        for (int i = 0; i < this.e; i++) {
            if (this.d[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public E a(int i) {
        return b(i, null);
    }

    public void a() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.f97b = false;
    }

    public void a(int i, E e) {
        int i2 = this.e;
        if (i2 != 0 && i <= this.f98c[i2 - 1]) {
            c(i, e);
            return;
        }
        if (this.f97b && this.e >= this.f98c.length) {
            c();
        }
        int i3 = this.e;
        if (i3 >= this.f98c.length) {
            int b2 = c.b(i3 + 1);
            int[] iArr = new int[b2];
            Object[] objArr = new Object[b2];
            int[] iArr2 = this.f98c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f98c = iArr;
            this.d = objArr;
        }
        this.f98c[i3] = i;
        this.d[i3] = e;
        this.e = i3 + 1;
    }

    public int b() {
        if (this.f97b) {
            c();
        }
        return this.e;
    }

    public int b(int i) {
        if (this.f97b) {
            c();
        }
        return this.f98c[i];
    }

    public E b(int i, E e) {
        int a2 = c.a(this.f98c, this.e, i);
        if (a2 >= 0) {
            Object[] objArr = this.d;
            if (objArr[a2] != f) {
                return (E) objArr[a2];
            }
        }
        return e;
    }

    public void c(int i) {
        int a2 = c.a(this.f98c, this.e, i);
        if (a2 >= 0) {
            Object[] objArr = this.d;
            Object obj = objArr[a2];
            Object obj2 = f;
            if (obj == obj2) {
                return;
            }
            objArr[a2] = obj2;
            this.f97b = true;
        }
    }

    public void c(int i, E e) {
        int a2 = c.a(this.f98c, this.e, i);
        if (a2 >= 0) {
            this.d[a2] = e;
            return;
        }
        int i2 = a2 ^ (-1);
        if (i2 < this.e) {
            Object[] objArr = this.d;
            if (objArr[i2] == f) {
                this.f98c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f97b && this.e >= this.f98c.length) {
            c();
            i2 = c.a(this.f98c, this.e, i) ^ (-1);
        }
        int i3 = this.e;
        if (i3 >= this.f98c.length) {
            int b2 = c.b(i3 + 1);
            int[] iArr = new int[b2];
            Object[] objArr2 = new Object[b2];
            int[] iArr2 = this.f98c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f98c = iArr;
            this.d = objArr2;
        }
        int i4 = this.e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f98c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.e - i2);
        }
        this.f98c[i2] = i;
        this.d[i2] = e;
        this.e++;
    }

    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f98c = (int[]) this.f98c.clone();
            hVar.d = (Object[]) this.d.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public E d(int i) {
        if (this.f97b) {
            c();
        }
        return (E) this.d[i];
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
            sb.append(b(i));
            sb.append('=');
            E d = d(i);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
