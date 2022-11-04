package c4;

import c4.d;
/* loaded from: classes.dex */
public abstract class d<T extends d<T>> extends f<T> {
    public short[] V3;

    public d() {
        this.V3 = new short[0];
    }

    public d(int i10, int i11) {
        super(i10, i11);
    }

    @Override // c4.q
    protected Object A() {
        return this.V3;
    }

    @Override // c4.q
    public void B(Object obj) {
        this.V3 = (short[]) obj;
    }

    @Override // c4.f, c4.q
    public p M() {
        return p.I16;
    }

    public void e0(int i10, int i11, int i12) {
        if (t(i10, i11)) {
            this.V3[i(i10, i11)] = (short) i12;
            return;
        }
        throw new m("Requested pixel is out of bounds: " + i10 + " " + i11);
    }
}
