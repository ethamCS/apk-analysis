package org.bouncycastle.jcajce.provider.symmetric.util;

import ei.a;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import nh.d;
import nh.d0;
import nh.g0;
import nh.n;
import nh.s;
import org.bouncycastle.crypto.b0;
import org.bouncycastle.crypto.i;
import sh.u;
import sh.v;
import sh.w;
import sh.x;
import zh.b1;
import zh.c;
import zh.f1;
/* loaded from: classes3.dex */
public interface PBE {
    public static final int GOST3411 = 6;
    public static final int MD2 = 5;
    public static final int MD5 = 0;
    public static final int OPENSSL = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S1_UTF8 = 4;
    public static final int PKCS5S2 = 1;
    public static final int PKCS5S2_UTF8 = 5;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;
    public static final int SHA224 = 7;
    public static final int SHA256 = 4;
    public static final int SHA384 = 8;
    public static final int SHA3_224 = 10;
    public static final int SHA3_256 = 11;
    public static final int SHA3_384 = 12;
    public static final int SHA3_512 = 13;
    public static final int SHA512 = 9;
    public static final int SM3 = 14;
    public static final int TIGER = 3;

    /* loaded from: classes3.dex */
    public static class Util {
        private static byte[] convertPassword(int i10, PBEKeySpec pBEKeySpec) {
            return i10 == 2 ? b0.PKCS12PasswordToBytes(pBEKeySpec.getPassword()) : (i10 == 5 || i10 == 4) ? b0.PKCS5PasswordToUTF8Bytes(pBEKeySpec.getPassword()) : b0.PKCS5PasswordToBytes(pBEKeySpec.getPassword());
        }

        private static b0 makePBEGenerator(int i10, int i11) {
            if (i10 == 0 || i10 == 4) {
                if (i11 == 0) {
                    return new w(a.a());
                }
                if (i11 == 1) {
                    return new w(a.b());
                }
                if (i11 != 5) {
                    throw new IllegalStateException("PKCS5 scheme 1 only supports MD2, MD5 and SHA1.");
                }
                return new w(new n());
            } else if (i10 != 1 && i10 != 5) {
                if (i10 != 2) {
                    return new u();
                }
                switch (i11) {
                    case 0:
                        return new v(a.a());
                    case 1:
                        return new v(a.b());
                    case 2:
                        return new v(new s());
                    case 3:
                        return new v(new g0());
                    case 4:
                        return new v(a.d());
                    case 5:
                        return new v(new n());
                    case 6:
                        return new v(new d());
                    case 7:
                        return new v(a.c());
                    case 8:
                        return new v(a.e());
                    case 9:
                        return new v(a.j());
                    default:
                        throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                }
            } else {
                switch (i11) {
                    case 0:
                        return new x(a.a());
                    case 1:
                        return new x(a.b());
                    case 2:
                        return new x(new s());
                    case 3:
                        return new x(new g0());
                    case 4:
                        return new x(a.d());
                    case 5:
                        return new x(new n());
                    case 6:
                        return new x(new d());
                    case 7:
                        return new x(a.c());
                    case 8:
                        return new x(a.e());
                    case 9:
                        return new x(a.j());
                    case 10:
                        return new x(a.f());
                    case 11:
                        return new x(a.g());
                    case 12:
                        return new x(a.h());
                    case 13:
                        return new x(a.i());
                    case 14:
                        return new x(new d0());
                    default:
                        throw new IllegalStateException("unknown digest scheme for PBE PKCS5S2 encryption.");
                }
            }
        }

        public static i makePBEMacParameters(SecretKey secretKey, int i10, int i11, int i12, PBEParameterSpec pBEParameterSpec) {
            b0 makePBEGenerator = makePBEGenerator(i10, i11);
            byte[] encoded = secretKey.getEncoded();
            makePBEGenerator.init(secretKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            i generateDerivedMacParameters = makePBEGenerator.generateDerivedMacParameters(i12);
            for (int i13 = 0; i13 != encoded.length; i13++) {
                encoded[i13] = 0;
            }
            return generateDerivedMacParameters;
        }

        public static i makePBEMacParameters(PBEKeySpec pBEKeySpec, int i10, int i11, int i12) {
            b0 makePBEGenerator = makePBEGenerator(i10, i11);
            byte[] convertPassword = convertPassword(i10, pBEKeySpec);
            makePBEGenerator.init(convertPassword, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            i generateDerivedMacParameters = makePBEGenerator.generateDerivedMacParameters(i12);
            for (int i13 = 0; i13 != convertPassword.length; i13++) {
                convertPassword[i13] = 0;
            }
            return generateDerivedMacParameters;
        }

        public static i makePBEMacParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            b0 makePBEGenerator = makePBEGenerator(bCPBEKey.getType(), bCPBEKey.getDigest());
            makePBEGenerator.init(bCPBEKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            return makePBEGenerator.generateDerivedMacParameters(bCPBEKey.getKeySize());
        }

        public static i makePBEParameters(PBEKeySpec pBEKeySpec, int i10, int i11, int i12, int i13) {
            b0 makePBEGenerator = makePBEGenerator(i10, i11);
            byte[] convertPassword = convertPassword(i10, pBEKeySpec);
            makePBEGenerator.init(convertPassword, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            i generateDerivedParameters = i13 != 0 ? makePBEGenerator.generateDerivedParameters(i12, i13) : makePBEGenerator.generateDerivedParameters(i12);
            for (int i14 = 0; i14 != convertPassword.length; i14++) {
                convertPassword[i14] = 0;
            }
            return generateDerivedParameters;
        }

        public static i makePBEParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, String str) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            b0 makePBEGenerator = makePBEGenerator(bCPBEKey.getType(), bCPBEKey.getDigest());
            byte[] encoded = bCPBEKey.getEncoded();
            if (bCPBEKey.shouldTryWrongPKCS12()) {
                encoded = new byte[2];
            }
            makePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            i generateDerivedParameters = bCPBEKey.getIvSize() != 0 ? makePBEGenerator.generateDerivedParameters(bCPBEKey.getKeySize(), bCPBEKey.getIvSize()) : makePBEGenerator.generateDerivedParameters(bCPBEKey.getKeySize());
            if (str.startsWith("DES")) {
                if (generateDerivedParameters instanceof f1) {
                    c.c(((b1) ((f1) generateDerivedParameters).b()).a());
                } else {
                    c.c(((b1) generateDerivedParameters).a());
                }
            }
            return generateDerivedParameters;
        }

        public static i makePBEParameters(byte[] bArr, int i10, int i11, int i12, int i13, AlgorithmParameterSpec algorithmParameterSpec, String str) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidAlgorithmParameterException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            b0 makePBEGenerator = makePBEGenerator(i10, i11);
            makePBEGenerator.init(bArr, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            i generateDerivedParameters = i13 != 0 ? makePBEGenerator.generateDerivedParameters(i12, i13) : makePBEGenerator.generateDerivedParameters(i12);
            if (str.startsWith("DES")) {
                if (generateDerivedParameters instanceof f1) {
                    c.c(((b1) ((f1) generateDerivedParameters).b()).a());
                } else {
                    c.c(((b1) generateDerivedParameters).a());
                }
            }
            return generateDerivedParameters;
        }
    }
}
