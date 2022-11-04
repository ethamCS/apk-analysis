package ak;

import nh.c0;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public class e {

    /* renamed from: b */
    private static char[] f557b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    private final byte[] f558a;

    public e(byte[] bArr) {
        this(bArr, 160);
    }

    public e(byte[] bArr, int i10) {
        this.f558a = a(bArr, i10);
    }

    public static byte[] a(byte[] bArr, int i10) {
        if (i10 % 8 == 0) {
            c0 c0Var = new c0((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            c0Var.update(bArr, 0, bArr.length);
            int i11 = i10 / 8;
            byte[] bArr2 = new byte[i11];
            c0Var.c(bArr2, 0, i11);
            return bArr2;
        }
        throw new IllegalArgumentException("bitLength must be a multiple of 8");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return a.c(((e) obj).f558a, this.f558a);
    }

    public int hashCode() {
        return a.F(this.f558a);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 != this.f558a.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(":");
            }
            stringBuffer.append(f557b[(this.f558a[i10] >>> 4) & 15]);
            stringBuffer.append(f557b[this.f558a[i10] & 15]);
        }
        return stringBuffer.toString();
    }
}
