package yh;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class h implements a {
    @Override // yh.a
    public int a(byte[] bArr) {
        int length = bArr.length;
        while (length > 0 && bArr[length - 1] == 0) {
            length--;
        }
        return bArr.length - length;
    }

    @Override // yh.a
    public int b(byte[] bArr, int i10) {
        int length = bArr.length - i10;
        while (i10 < bArr.length) {
            bArr[i10] = 0;
            i10++;
        }
        return length;
    }

    @Override // yh.a
    public void c(SecureRandom secureRandom) {
    }
}
