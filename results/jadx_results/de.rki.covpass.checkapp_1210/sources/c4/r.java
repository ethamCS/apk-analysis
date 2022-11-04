package c4;

import c4.r;
import java.lang.reflect.Array;
/* loaded from: classes.dex */
public abstract class r<T extends r<T>> extends s<T> {
    public int V3;

    public r() {
        this.U3 = t.i(0, getClass());
    }

    public r(int i10, int i11, int i12) {
        this.U3 = t.i(0, getClass());
        B(Array.newInstance(V(), i10 * i11 * i12));
        this.f6218c = 0;
        this.f6219d = i10 * i12;
        this.V3 = i12;
        this.f6220q = i10;
        this.f6221x = i11;
        this.U3.f6260q = i12;
    }

    public static <B extends r<B>> B I(Class<B> cls, int i10, int i11, int i12) {
        if (cls == e0.class) {
            return new e0(i10, i11, i12);
        }
        if (cls == c0.class) {
            return new c0(i10, i11, i12);
        }
        if (cls == d0.class) {
            return new d0(i10, i11, i12);
        }
        if (cls == z.class) {
            return new z(i10, i11, i12);
        }
        if (cls == a0.class) {
            return new a0(i10, i11, i12);
        }
        if (cls == b0.class) {
            return new b0(i10, i11, i12);
        }
        if (cls == u.class) {
            return new u(i10, i11, i12);
        }
        if (cls == v.class) {
            return new v(i10, i11, i12);
        }
        throw new IllegalArgumentException("Unknown type " + cls);
    }

    protected abstract Object A();

    protected abstract void B(Object obj);

    public int M(int i10, int i11, int i12) {
        return this.f6218c + (i11 * this.f6219d) + (i10 * this.V3) + i12;
    }

    public int N() {
        return this.U3.h();
    }

    @Override // c4.n
    public void U(int i10, int i11) {
        if (this.f6220q == i10 && this.f6221x == i11) {
            return;
        }
        if (v()) {
            throw new IllegalArgumentException("Can't reshape sub-images");
        }
        if (Array.getLength(A()) < i10 * i11 * this.V3) {
            B(((r) e(i10, i11)).A());
        }
        this.f6220q = i10;
        this.f6221x = i11;
        this.f6219d = i10 * this.V3;
    }

    protected abstract Class V();

    public void W(int i10, int i11, int i12) {
        if (this.V3 == i12) {
            U(i10, i11);
        } else if (v()) {
            throw new IllegalArgumentException("Can't reshape sub-images");
        } else {
            this.V3 = -1;
            this.f6220q = i10;
            this.f6221x = i11;
            b0(i12);
        }
    }

    public final void b0(int i10) {
        if (this.V3 == i10) {
            return;
        }
        if (v()) {
            throw new IllegalArgumentException("Can't reshape sub-images");
        }
        this.U3.f6260q = i10;
        this.V3 = i10;
        this.f6219d = this.f6220q * i10;
        Object A = A();
        if (A != null && Array.getLength(A) >= this.f6220q * this.f6221x * i10) {
            return;
        }
        B(((r) e(this.f6220q, this.f6221x)).A());
    }

    /* renamed from: c0 */
    public void y(T t10) {
        int i10 = t10.f6220q;
        if (i10 != this.f6220q || t10.f6221x != this.f6221x || t10.V3 != this.V3) {
            W(i10, t10.f6221x, t10.V3);
        }
        if (!t10.v() && !v()) {
            System.arraycopy(t10.A(), t10.f6218c, A(), this.f6218c, this.f6219d * this.f6221x);
            return;
        }
        int i11 = t10.f6218c;
        int i12 = this.f6218c;
        for (int i13 = 0; i13 < this.f6221x; i13++) {
            System.arraycopy(t10.A(), i11, A(), i12, this.f6220q * this.V3);
            i11 += t10.f6219d;
            i12 += this.f6219d;
        }
    }

    public abstract String d0(int i10);

    @Override // c4.n
    public int i(int i10, int i11) {
        return this.f6218c + (i11 * this.f6219d) + (i10 * this.V3);
    }

    public String toString() {
        String str = getClass().getSimpleName() + " : w=" + this.f6220q + ", h=" + this.f6221x + ", c=" + this.V3 + "\n";
        for (int i10 = 0; i10 < this.f6221x; i10++) {
            int i11 = this.f6218c + (this.f6219d * i10);
            for (int i12 = 0; i12 < this.f6220q; i12++) {
                int i13 = 0;
                while (i13 < this.V3) {
                    int i14 = i11 + 1;
                    str = str + d0(i11) + " ";
                    i13++;
                    i11 = i14;
                }
                if (i12 < this.f6220q - 1) {
                    str = str + ", ";
                }
            }
            str = str + "\n";
        }
        return str;
    }
}
