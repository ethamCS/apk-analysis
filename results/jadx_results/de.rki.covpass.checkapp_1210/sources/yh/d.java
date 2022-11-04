package yh;

import java.security.SecureRandom;
import org.bouncycastle.crypto.u;
/* loaded from: classes3.dex */
public class d implements a {
    @Override // yh.a
    public int a(byte[] bArr) {
        int i10 = bArr[bArr.length - 1] & 255;
        byte b10 = (byte) i10;
        boolean z10 = (i10 > bArr.length) | (i10 == 0);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            z10 |= (bArr.length - i11 <= i10) & (bArr[i11] != b10);
        }
        if (!z10) {
            return i10;
        }
        throw new u("pad block corrupted");
    }

    @Override // yh.a
    public int b(byte[] bArr, int i10) {
        byte length = (byte) (bArr.length - i10);
        while (i10 < bArr.length) {
            bArr[i10] = length;
            i10++;
        }
        return length;
    }

    @Override // yh.a
    public void c(SecureRandom secureRandom) {
    }
}
