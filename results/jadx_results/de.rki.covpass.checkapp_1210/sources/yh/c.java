package yh;

import java.security.SecureRandom;
import org.bouncycastle.crypto.u;
/* loaded from: classes3.dex */
public class c implements a {
    @Override // yh.a
    public int a(byte[] bArr) {
        int length = bArr.length - 1;
        while (length > 0 && bArr[length] == 0) {
            length--;
        }
        if (bArr[length] == Byte.MIN_VALUE) {
            return bArr.length - length;
        }
        throw new u("pad block corrupted");
    }

    @Override // yh.a
    public int b(byte[] bArr, int i10) {
        int length = bArr.length - i10;
        bArr[i10] = Byte.MIN_VALUE;
        while (true) {
            i10++;
            if (i10 < bArr.length) {
                bArr[i10] = 0;
            } else {
                return length;
            }
        }
    }

    @Override // yh.a
    public void c(SecureRandom secureRandom) {
    }
}
