package c4;

import c4.q;
import java.lang.reflect.Array;
/* loaded from: classes.dex */
public abstract class q<T extends q<T>> extends n<T> {
    public q() {
        this.U3 = t.n(getClass());
    }

    public q(int i10, int i11) {
        this.U3 = t.n(getClass());
        N(i10, i11);
    }

    public static <B extends q<B>> B I(Class<B> cls, int i10, int i11) {
        if (cls == l.class) {
            return new l(i10, i11);
        }
        if (cls == j.class) {
            return new j(i10, i11);
        }
        if (cls == g.class) {
            return new g(i10, i11);
        }
        if (cls == k.class) {
            return new k(i10, i11);
        }
        if (cls == h.class) {
            return new h(i10, i11);
        }
        if (cls == i.class) {
            return new i(i10, i11);
        }
        if (cls == a.class) {
            return new a(i10, i11);
        }
        if (cls == b.class) {
            return new b(i10, i11);
        }
        if (cls == f.class) {
            return new h(i10, i11);
        }
        throw new IllegalArgumentException("Unknown type " + cls);
    }

    protected abstract Object A();

    public abstract void B(Object obj);

    public abstract p M();

    protected void N(int i10, int i11) {
        B(Array.newInstance(M().h(), i10 * i11));
        this.f6218c = 0;
        this.f6219d = i10;
        this.f6220q = i10;
        this.f6221x = i11;
    }

    @Override // c4.n
    public void U(int i10, int i11) {
        if (this.f6220q == i10 && this.f6221x == i11) {
            return;
        }
        if (v()) {
            throw new IllegalArgumentException("Can't reshape sub-images");
        }
        if (Array.getLength(A()) < i10 * i11) {
            B(((q) e(i10, i11)).A());
        }
        this.f6219d = i10;
        this.f6220q = i10;
        this.f6221x = i11;
    }

    public void V(n nVar) {
        U(nVar.f6220q, nVar.f6221x);
    }

    /* renamed from: W */
    public void y(T t10) {
        int i10 = this.f6220q;
        int i11 = t10.f6220q;
        if (i10 != i11 || this.f6221x != t10.f6221x) {
            U(i11, t10.f6221x);
        }
        if (!t10.v() && !v()) {
            System.arraycopy(t10.A(), t10.f6218c, A(), this.f6218c, this.f6219d * this.f6221x);
            return;
        }
        int i12 = t10.f6218c;
        int i13 = this.f6218c;
        for (int i14 = 0; i14 < this.f6221x; i14++) {
            System.arraycopy(t10.A(), i12, A(), i13, this.f6220q);
            i12 += t10.f6219d;
            i13 += this.f6219d;
        }
    }

    public T b0(int i10, int i11, int i12, int i13, T t10) {
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("x0 or y0 is less than zero");
        }
        if (i12 < i10 || i13 < i11) {
            throw new IllegalArgumentException("x1 or y1 is less than x0 or y0 respectively");
        }
        if (i12 > this.f6220q || i13 > this.f6221x) {
            throw new IllegalArgumentException("x1 or y1 is more than the width or height respectively");
        }
        if (t10 == null) {
            t10 = (T) e(-1, -1);
        }
        t10.B(A());
        t10.f6219d = Math.max(this.f6220q, this.f6219d);
        t10.f6220q = i12 - i10;
        t10.f6221x = i13 - i11;
        t10.f6218c = this.f6218c + (i11 * this.f6219d) + i10;
        t10.f6222y = true;
        t10.U3 = this.U3;
        return t10;
    }
}
