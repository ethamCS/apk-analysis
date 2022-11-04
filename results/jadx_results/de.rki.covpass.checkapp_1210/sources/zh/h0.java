package zh;
/* loaded from: classes3.dex */
public final class h0 extends b {

    /* renamed from: d */
    private final byte[] f26934d;

    public h0(byte[] bArr) {
        this(c(bArr), 0);
    }

    public h0(byte[] bArr, int i10) {
        super(false);
        byte[] bArr2 = new byte[32];
        this.f26934d = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 32);
    }

    private static byte[] c(byte[] bArr) {
        if (bArr.length == 32) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 32");
    }

    public void b(byte[] bArr, int i10) {
        System.arraycopy(this.f26934d, 0, bArr, i10, 32);
    }

    public byte[] getEncoded() {
        return ak.a.h(this.f26934d);
    }
}
