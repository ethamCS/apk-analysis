package di;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class p implements a {

    /* renamed from: a */
    public static final p f9141a = new p();

    private void e(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i10, int i11) {
        byte[] byteArray = c(bigInteger, bigInteger2).toByteArray();
        int max = Math.max(0, byteArray.length - i11);
        int length = byteArray.length - max;
        int i12 = (i11 - length) + i10;
        ak.a.z(bArr, i10, i12, (byte) 0);
        System.arraycopy(byteArray, max, bArr, i12, length);
    }

    @Override // di.a
    public BigInteger[] a(BigInteger bigInteger, byte[] bArr) {
        int i10 = ak.b.i(bigInteger);
        if (bArr.length == i10 * 2) {
            return new BigInteger[]{d(bigInteger, bArr, 0, i10), d(bigInteger, bArr, i10, i10)};
        }
        throw new IllegalArgumentException("Encoding has incorrect length");
    }

    @Override // di.a
    public byte[] b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        int i10 = ak.b.i(bigInteger);
        byte[] bArr = new byte[i10 * 2];
        e(bigInteger, bigInteger2, bArr, 0, i10);
        e(bigInteger, bigInteger3, bArr, i10, i10);
        return bArr;
    }

    protected BigInteger c(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
            throw new IllegalArgumentException("Value out of range");
        }
        return bigInteger2;
    }

    protected BigInteger d(BigInteger bigInteger, byte[] bArr, int i10, int i11) {
        return c(bigInteger, new BigInteger(1, ak.a.w(bArr, i10, i11 + i10)));
    }
}
