package org.bouncycastle.jcajce.provider.asymmetric.edec;

import ak.e;
import ak.q;
import bk.f;
import zh.b;
import zh.h0;
import zh.k0;
import zh.t1;
import zh.w1;
/* loaded from: classes3.dex */
class Utils {
    Utils() {
    }

    private static String generateKeyFingerprint(byte[] bArr) {
        return new e(bArr).toString();
    }

    public static boolean isValidPrefix(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return !isValidPrefix(bArr, bArr);
        }
        int i10 = 0;
        for (int i11 = 0; i11 != bArr.length; i11++) {
            i10 |= bArr[i11] ^ bArr2[i11];
        }
        return i10 == 0;
    }

    public static String keyToString(String str, String str2, b bVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String d10 = q.d();
        byte[] encoded = bVar instanceof w1 ? ((w1) bVar).getEncoded() : bVar instanceof k0 ? ((k0) bVar).getEncoded() : bVar instanceof t1 ? ((t1) bVar).getEncoded() : ((h0) bVar).getEncoded();
        stringBuffer.append(str2);
        stringBuffer.append(" ");
        stringBuffer.append(str);
        stringBuffer.append(" [");
        stringBuffer.append(generateKeyFingerprint(encoded));
        stringBuffer.append("]");
        stringBuffer.append(d10);
        stringBuffer.append("    public data: ");
        stringBuffer.append(f.f(encoded));
        stringBuffer.append(d10);
        return stringBuffer.toString();
    }
}
