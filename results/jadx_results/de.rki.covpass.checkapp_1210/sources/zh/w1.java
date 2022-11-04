package zh;
/* loaded from: classes3.dex */
public final class w1 extends b {

    /* renamed from: d */
    private final byte[] f27020d;

    public w1(byte[] bArr) {
        this(c(bArr), 0);
    }

    public w1(byte[] bArr, int i10) {
        super(false);
        byte[] bArr2 = new byte[56];
        this.f27020d = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 56);
    }

    private static byte[] c(byte[] bArr) {
        if (bArr.length == 56) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 56");
    }

    public void b(byte[] bArr, int i10) {
        System.arraycopy(this.f27020d, 0, bArr, i10, 56);
    }

    public byte[] getEncoded() {
        return ak.a.h(this.f27020d);
    }
}
