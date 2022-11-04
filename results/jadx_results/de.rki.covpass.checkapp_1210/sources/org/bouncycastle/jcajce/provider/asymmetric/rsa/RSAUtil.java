package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import ak.e;
import gg.v;
import hh.z0;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import zg.q;
import zh.n1;
import zh.o1;
/* loaded from: classes3.dex */
public class RSAUtil {
    public static final v[] rsaOids = {q.Z0, z0.f12187r, q.f26803f1, q.f26812i1};

    public static String generateExponentFingerprint(BigInteger bigInteger) {
        return new e(bigInteger.toByteArray(), 32).toString();
    }

    public static String generateKeyFingerprint(BigInteger bigInteger) {
        return new e(bigInteger.toByteArray()).toString();
    }

    public static n1 generatePrivateKeyParameter(RSAPrivateKey rSAPrivateKey) {
        if (rSAPrivateKey instanceof BCRSAPrivateKey) {
            return ((BCRSAPrivateKey) rSAPrivateKey).engineGetKeyParameters();
        }
        if (!(rSAPrivateKey instanceof RSAPrivateCrtKey)) {
            return new n1(true, rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) rSAPrivateKey;
        return new o1(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
    }

    public static n1 generatePublicKeyParameter(RSAPublicKey rSAPublicKey) {
        return rSAPublicKey instanceof BCRSAPublicKey ? ((BCRSAPublicKey) rSAPublicKey).engineGetKeyParameters() : new n1(false, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
    }

    public static boolean isRsaOid(v vVar) {
        int i10 = 0;
        while (true) {
            v[] vVarArr = rsaOids;
            if (i10 != vVarArr.length) {
                if (vVar.s(vVarArr[i10])) {
                    return true;
                }
                i10++;
            } else {
                return false;
            }
        }
    }
}
