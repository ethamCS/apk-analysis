package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import ak.a;
import ak.e;
import gg.v;
import hh.n0;
import ih.o;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import yg.b;
import zh.r;
import zh.s;
/* loaded from: classes3.dex */
public class DSAUtil {
    public static final v[] dsaOids = {o.A0, b.f26295j, o.B0};

    public static String generateKeyFingerprint(BigInteger bigInteger, DSAParams dSAParams) {
        return new e(a.r(bigInteger.toByteArray(), dSAParams.getP().toByteArray(), dSAParams.getQ().toByteArray(), dSAParams.getG().toByteArray())).toString();
    }

    public static zh.b generatePrivateKeyParameter(PrivateKey privateKey) {
        if (privateKey instanceof DSAPrivateKey) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) privateKey;
            return new s(dSAPrivateKey.getX(), new r(dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG()));
        }
        throw new InvalidKeyException("can't identify DSA private key.");
    }

    public static zh.b generatePublicKeyParameter(PublicKey publicKey) {
        if (publicKey instanceof BCDSAPublicKey) {
            return ((BCDSAPublicKey) publicKey).engineGetKeyParameters();
        }
        if (publicKey instanceof DSAPublicKey) {
            return new BCDSAPublicKey((DSAPublicKey) publicKey).engineGetKeyParameters();
        }
        try {
            return new BCDSAPublicKey(n0.n(publicKey.getEncoded())).engineGetKeyParameters();
        } catch (Exception unused) {
            throw new InvalidKeyException("can't identify DSA public key: " + publicKey.getClass().getName());
        }
    }

    public static boolean isDsaOid(v vVar) {
        int i10 = 0;
        while (true) {
            v[] vVarArr = dsaOids;
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

    public static r toDSAParameters(DSAParams dSAParams) {
        if (dSAParams != null) {
            return new r(dSAParams.getP(), dSAParams.getQ(), dSAParams.getG());
        }
        return null;
    }
}
