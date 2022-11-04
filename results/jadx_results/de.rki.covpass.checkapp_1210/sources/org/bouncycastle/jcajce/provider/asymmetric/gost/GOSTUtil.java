package org.bouncycastle.jcajce.provider.asymmetric.gost;

import ak.a;
import ak.e;
import ak.q;
import java.math.BigInteger;
import zh.t0;
/* loaded from: classes3.dex */
class GOSTUtil {
    GOSTUtil() {
    }

    private static String generateKeyFingerprint(BigInteger bigInteger, t0 t0Var) {
        return new e(a.q(bigInteger.toByteArray(), t0Var.b().toByteArray(), t0Var.a().toByteArray())).toString();
    }

    public static String privateKeyToString(String str, BigInteger bigInteger, t0 t0Var) {
        StringBuffer stringBuffer = new StringBuffer();
        String d10 = q.d();
        BigInteger modPow = t0Var.a().modPow(bigInteger, t0Var.b());
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [");
        stringBuffer.append(generateKeyFingerprint(modPow, t0Var));
        stringBuffer.append("]");
        stringBuffer.append(d10);
        stringBuffer.append("                  Y: ");
        stringBuffer.append(modPow.toString(16));
        stringBuffer.append(d10);
        return stringBuffer.toString();
    }

    public static String publicKeyToString(String str, BigInteger bigInteger, t0 t0Var) {
        StringBuffer stringBuffer = new StringBuffer();
        String d10 = q.d();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [");
        stringBuffer.append(generateKeyFingerprint(bigInteger, t0Var));
        stringBuffer.append("]");
        stringBuffer.append(d10);
        stringBuffer.append("                 Y: ");
        stringBuffer.append(bigInteger.toString(16));
        stringBuffer.append(d10);
        return stringBuffer.toString();
    }
}
