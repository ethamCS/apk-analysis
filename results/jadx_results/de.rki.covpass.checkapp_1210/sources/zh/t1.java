package zh;
/* loaded from: classes3.dex */
public final class t1 extends b {

    /* renamed from: d */
    private final byte[] f27005d;

    public t1(byte[] bArr) {
        this(c(bArr), 0);
    }

    public t1(byte[] bArr, int i10) {
        super(false);
        byte[] bArr2 = new byte[32];
        this.f27005d = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 32);
    }

    private static byte[] c(byte[] bArr) {
        if (bArr.length == 32) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 32");
    }

    public void b(byte[] bArr, int i10) {
        System.arraycopy(this.f27005d, 0, bArr, i10, 32);
    }

    public byte[] getEncoded() {
        return ak.a.h(this.f27005d);
    }
}
