package c4;

import c4.x;
/* loaded from: classes.dex */
public abstract class x<T extends x<T>> extends y<T> {
    public byte[] W3;

    public x() {
        this.W3 = new byte[0];
    }

    public x(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    @Override // c4.r
    protected Object A() {
        return this.W3;
    }

    @Override // c4.r
    protected void B(Object obj) {
        this.W3 = (byte[]) obj;
    }

    @Override // c4.r
    protected Class V() {
        return Byte.TYPE;
    }

    @Override // c4.r
    public String d0(int i10) {
        return String.format("%02x", Integer.valueOf(this.W3[i10] & 255));
    }
}
