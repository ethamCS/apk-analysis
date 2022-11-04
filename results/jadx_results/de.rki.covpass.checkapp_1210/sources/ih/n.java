package ih;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public class n {
    public int a(ti.e eVar) {
        return (eVar.t() + 7) / 8;
    }

    public int b(ti.f fVar) {
        return (fVar.f() + 7) / 8;
    }

    public byte[] c(BigInteger bigInteger, int i10) {
        byte[] byteArray = bigInteger.toByteArray();
        if (i10 < byteArray.length) {
            byte[] bArr = new byte[i10];
            System.arraycopy(byteArray, byteArray.length - i10, bArr, 0, i10);
            return bArr;
        } else if (i10 <= byteArray.length) {
            return byteArray;
        } else {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(byteArray, 0, bArr2, i10 - byteArray.length, byteArray.length);
            return bArr2;
        }
    }
}
