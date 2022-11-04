package yh;

import java.security.SecureRandom;
import org.bouncycastle.crypto.u;
/* loaded from: classes3.dex */
public class g implements a {

    /* renamed from: a */
    SecureRandom f26300a = null;

    @Override // yh.a
    public int a(byte[] bArr) {
        int i10 = bArr[bArr.length - 1] & 255;
        if (i10 <= bArr.length) {
            return i10;
        }
        throw new u("pad block corrupted");
    }

    @Override // yh.a
    public int b(byte[] bArr, int i10) {
        byte length = (byte) (bArr.length - i10);
        while (i10 < bArr.length - 1) {
            SecureRandom secureRandom = this.f26300a;
            if (secureRandom == null) {
                bArr[i10] = 0;
            } else {
                bArr[i10] = (byte) secureRandom.nextInt();
            }
            i10++;
        }
        bArr[i10] = length;
        return length;
    }

    @Override // yh.a
    public void c(SecureRandom secureRandom) {
        this.f26300a = secureRandom;
    }
}
