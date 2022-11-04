package org.bouncycastle.jce.provider;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import nh.p;
import nh.s;
import nh.v;
import org.bouncycastle.crypto.b0;
import org.bouncycastle.crypto.i;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import sh.w;
import sh.x;
import zh.b1;
import zh.f1;
/* loaded from: classes3.dex */
public interface BrokenPBE {
    public static final int MD5 = 0;
    public static final int OLD_PKCS12 = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S2 = 1;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;

    /* loaded from: classes3.dex */
    public static class Util {
        private static b0 makePBEGenerator(int i10, int i11) {
            if (i10 == 0) {
                if (i11 == 0) {
                    return new w(new p());
                }
                if (i11 != 1) {
                    throw new IllegalStateException("PKCS5 scheme 1 only supports only MD5 and SHA1.");
                }
                return new w(new v());
            } else if (i10 == 1) {
                return new x();
            } else {
                if (i10 == 3) {
                    if (i11 == 0) {
                        return new OldPKCS12ParametersGenerator(new p());
                    }
                    if (i11 == 1) {
                        return new OldPKCS12ParametersGenerator(new v());
                    }
                    if (i11 != 2) {
                        throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                    }
                    return new OldPKCS12ParametersGenerator(new s());
                } else if (i11 == 0) {
                    return new sh.v(new p());
                } else {
                    if (i11 == 1) {
                        return new sh.v(new v());
                    }
                    if (i11 != 2) {
                        throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                    }
                    return new sh.v(new s());
                }
            }
        }

        static i makePBEMacParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, int i10, int i11, int i12) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            b0 makePBEGenerator = makePBEGenerator(i10, i11);
            byte[] encoded = bCPBEKey.getEncoded();
            makePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            i generateDerivedMacParameters = makePBEGenerator.generateDerivedMacParameters(i12);
            for (int i13 = 0; i13 != encoded.length; i13++) {
                encoded[i13] = 0;
            }
            return generateDerivedMacParameters;
        }

        public static i makePBEParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, int i10, int i11, String str, int i12, int i13) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            b0 makePBEGenerator = makePBEGenerator(i10, i11);
            byte[] encoded = bCPBEKey.getEncoded();
            makePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            i generateDerivedParameters = i13 != 0 ? makePBEGenerator.generateDerivedParameters(i12, i13) : makePBEGenerator.generateDerivedParameters(i12);
            if (str.startsWith("DES")) {
                if (generateDerivedParameters instanceof f1) {
                    setOddParity(((b1) ((f1) generateDerivedParameters).b()).a());
                } else {
                    setOddParity(((b1) generateDerivedParameters).a());
                }
            }
            for (int i14 = 0; i14 != encoded.length; i14++) {
                encoded[i14] = 0;
            }
            return generateDerivedParameters;
        }

        private static void setOddParity(byte[] bArr) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                byte b10 = bArr[i10];
                bArr[i10] = (byte) ((((b10 >> 7) ^ ((((((b10 >> 1) ^ (b10 >> 2)) ^ (b10 >> 3)) ^ (b10 >> 4)) ^ (b10 >> 5)) ^ (b10 >> 6))) ^ 1) | (b10 & 254));
            }
        }
    }
}
