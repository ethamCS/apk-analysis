package c4;

import c4.f;
/* loaded from: classes.dex */
public abstract class f<T extends f<T>> extends q<T> {
    public f() {
    }

    public f(int i10, int i11) {
        super(i10, i11);
    }

    @Override // c4.q
    public p M() {
        return p.I;
    }

    public int c0(int i10, int i11) {
        if (t(i10, i11)) {
            return d0(i10, i11);
        }
        throw new m("Requested pixel is out of bounds: " + i10 + " " + i11);
    }

    public abstract int d0(int i10, int i11);
}
