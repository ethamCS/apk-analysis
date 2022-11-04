package zh;
/* loaded from: classes3.dex */
public final class k0 extends b {

    /* renamed from: d */
    private final byte[] f26951d;

    public k0(byte[] bArr) {
        this(c(bArr), 0);
    }

    public k0(byte[] bArr, int i10) {
        super(false);
        byte[] bArr2 = new byte[57];
        this.f26951d = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 57);
    }

    private static byte[] c(byte[] bArr) {
        if (bArr.length == 57) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 57");
    }

    public void b(byte[] bArr, int i10) {
        System.arraycopy(this.f26951d, 0, bArr, i10, 57);
    }

    public byte[] getEncoded() {
        return ak.a.h(this.f26951d);
    }
}
