package c4;

import c4.n;
import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class n<T extends n> implements Serializable, Cloneable {
    public t U3;

    /* renamed from: c */
    public int f6218c;

    /* renamed from: d */
    public int f6219d;

    /* renamed from: q */
    public int f6220q;

    /* renamed from: x */
    public int f6221x;

    /* renamed from: y */
    public boolean f6222y = false;

    public abstract void U(int i10, int i11);

    /* renamed from: c */
    public T clone() {
        T f10 = f();
        f10.y(this);
        return f10;
    }

    public abstract T e(int i10, int i11);

    public T f() {
        return e(this.f6220q, this.f6221x);
    }

    public int g() {
        return this.f6221x;
    }

    public t<T> h() {
        return this.U3;
    }

    public int i(int i10, int i11) {
        return this.f6218c + (i11 * this.f6219d) + i10;
    }

    public int j() {
        return this.f6218c;
    }

    public int k() {
        return this.f6219d;
    }

    public int p() {
        return this.f6220q;
    }

    public final boolean t(int i10, int i11) {
        return i10 >= 0 && i10 < this.f6220q && i11 >= 0 && i11 < this.f6221x;
    }

    public boolean v() {
        return this.f6222y;
    }

    public void x(n nVar) {
        U(nVar.f6220q, nVar.f6221x);
    }

    public abstract void y(T t10);
}
