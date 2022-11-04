package c4;

import c4.e;
/* loaded from: classes.dex */
public abstract class e<T extends e<T>> extends f<T> {
    public byte[] V3;

    public e() {
        this.V3 = new byte[0];
    }

    public e(int i10, int i11) {
        super(i10, i11);
    }

    @Override // c4.q
    protected Object A() {
        return this.V3;
    }

    @Override // c4.q
    public void B(Object obj) {
        this.V3 = (byte[]) obj;
    }

    @Override // c4.f, c4.q
    public p M() {
        return p.I8;
    }

    public void e0(int i10, int i11, int i12) {
        if (t(i10, i11)) {
            this.V3[i(i10, i11)] = (byte) i12;
            return;
        }
        throw new m("Requested pixel is out of bounds: " + i10 + " " + i11);
    }
}
