package org.bouncycastle.jcajce.provider.asymmetric.dh;

import ak.a;
import ak.e;
import ak.q;
import java.math.BigInteger;
import zh.i;
/* loaded from: classes3.dex */
class DHUtil {
    DHUtil() {
    }

    private static String generateKeyFingerprint(BigInteger bigInteger, i iVar) {
        return new e(a.q(bigInteger.toByteArray(), iVar.f().toByteArray(), iVar.b().toByteArray())).toString();
    }

    public static String privateKeyToString(String str, BigInteger bigInteger, i iVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String d10 = q.d();
        BigInteger modPow = iVar.b().modPow(bigInteger, iVar.f());
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [");
        stringBuffer.append(generateKeyFingerprint(modPow, iVar));
        stringBuffer.append("]");
        stringBuffer.append(d10);
        stringBuffer.append("              Y: ");
        stringBuffer.append(modPow.toString(16));
        stringBuffer.append(d10);
        return stringBuffer.toString();
    }

    public static String publicKeyToString(String str, BigInteger bigInteger, i iVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String d10 = q.d();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [");
        stringBuffer.append(generateKeyFingerprint(bigInteger, iVar));
        stringBuffer.append("]");
        stringBuffer.append(d10);
        stringBuffer.append("             Y: ");
        stringBuffer.append(bigInteger.toString(16));
        stringBuffer.append(d10);
        return stringBuffer.toString();
    }
}
