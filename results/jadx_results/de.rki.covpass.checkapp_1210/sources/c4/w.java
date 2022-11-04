package c4;

import c4.w;
/* loaded from: classes.dex */
public abstract class w<T extends w<T>> extends y<T> {
    public short[] W3;

    public w() {
        this.W3 = new short[0];
    }

    public w(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    @Override // c4.r
    protected Object A() {
        return this.W3;
    }

    @Override // c4.r
    protected void B(Object obj) {
        this.W3 = (short[]) obj;
    }

    @Override // c4.r
    protected Class V() {
        return Short.TYPE;
    }

    @Override // c4.r
    public String d0(int i10) {
        return String.format("%04x", Integer.valueOf(this.W3[i10] & 65535));
    }
}
