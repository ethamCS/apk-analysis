package org.bouncycastle.jce.provider;

import ak.q;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.e;
import org.bouncycastle.crypto.f;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.l;
import org.bouncycastle.crypto.u;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jce.provider.BrokenPBE;
import org.conscrypt.PSKKeyManager;
import qh.c1;
import qh.o;
import qh.p;
import vh.c;
import vh.v;
import zh.b1;
import zh.f1;
import zh.j1;
import zh.k1;
/* loaded from: classes3.dex */
public class BrokenJCEBlockCipher implements BrokenPBE {
    private Class[] availableSpecs;
    private f cipher;
    private AlgorithmParameters engineParams;
    private int ivLength;
    private f1 ivParam;
    private int pbeHash;
    private int pbeIvSize;
    private int pbeKeySize;
    private int pbeType;

    /* loaded from: classes3.dex */
    public static class BrokePBEWithMD5AndDES extends BrokenJCEBlockCipher {
        public BrokePBEWithMD5AndDES() {
            super(new c(new o()), 0, 0, 64, 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class BrokePBEWithSHA1AndDES extends BrokenJCEBlockCipher {
        public BrokePBEWithSHA1AndDES() {
            super(new c(new o()), 0, 1, 64, 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class BrokePBEWithSHAAndDES2Key extends BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES2Key() {
            super(new c(new p()), 2, 1, 128, 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class BrokePBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES3Key() {
            super(new c(new p()), 2, 1, 192, 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class OldPBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
        public OldPBEWithSHAAndDES3Key() {
            super(new c(new p()), 3, 1, 192, 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class OldPBEWithSHAAndTwofish extends BrokenJCEBlockCipher {
        public OldPBEWithSHAAndTwofish() {
            super(new c(new c1()), 3, 1, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128);
        }
    }

    protected BrokenJCEBlockCipher(e eVar) {
        this.availableSpecs = new Class[]{IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.ivLength = 0;
        this.engineParams = null;
        this.cipher = new yh.e(eVar);
    }

    protected BrokenJCEBlockCipher(e eVar, int i10, int i11, int i12, int i13) {
        this.availableSpecs = new Class[]{IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.ivLength = 0;
        this.engineParams = null;
        this.cipher = new yh.e(eVar);
        this.pbeType = i10;
        this.pbeHash = i11;
        this.pbeKeySize = i12;
        this.pbeIvSize = i13;
    }

    protected int engineDoFinal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int h10 = i11 != 0 ? this.cipher.h(bArr, i10, i11, bArr2, i12) : 0;
        try {
            return h10 + this.cipher.a(bArr2, i12 + h10);
        } catch (org.bouncycastle.crypto.o e10) {
            throw new IllegalBlockSizeException(e10.getMessage());
        } catch (u e11) {
            throw new BadPaddingException(e11.getMessage());
        }
    }

    protected byte[] engineDoFinal(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[engineGetOutputSize(i11)];
        int h10 = i11 != 0 ? this.cipher.h(bArr, i10, i11, bArr2, 0) : 0;
        try {
            int a10 = h10 + this.cipher.a(bArr2, h10);
            byte[] bArr3 = new byte[a10];
            System.arraycopy(bArr2, 0, bArr3, 0, a10);
            return bArr3;
        } catch (org.bouncycastle.crypto.o e10) {
            throw new IllegalBlockSizeException(e10.getMessage());
        } catch (u e11) {
            throw new BadPaddingException(e11.getMessage());
        }
    }

    protected int engineGetBlockSize() {
        return this.cipher.b();
    }

    protected byte[] engineGetIV() {
        f1 f1Var = this.ivParam;
        if (f1Var != null) {
            return f1Var.a();
        }
        return null;
    }

    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length;
    }

    protected int engineGetOutputSize(int i10) {
        return this.cipher.c(i10);
    }

    protected AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.ivParam != null) {
            String algorithmName = this.cipher.d().getAlgorithmName();
            if (algorithmName.indexOf(47) >= 0) {
                algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
            }
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(algorithmName, BouncyCastleProvider.PROVIDER_NAME);
                this.engineParams = algorithmParameters;
                algorithmParameters.init(this.ivParam.a());
            } catch (Exception e10) {
                throw new RuntimeException(e10.toString());
            }
        }
        return this.engineParams;
    }

    protected void engineInit(int i10, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (algorithmParameters != null) {
            int i11 = 0;
            while (true) {
                Class[] clsArr = this.availableSpecs;
                if (i11 == clsArr.length) {
                    break;
                }
                try {
                    algorithmParameterSpec = algorithmParameters.getParameterSpec(clsArr[i11]);
                    break;
                } catch (Exception unused) {
                    i11++;
                }
            }
            if (algorithmParameterSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        }
        this.engineParams = algorithmParameters;
        engineInit(i10, key, algorithmParameterSpec, secureRandom);
    }

    protected void engineInit(int i10, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i10, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new IllegalArgumentException(e10.getMessage());
        }
    }

    protected void engineInit(int i10, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        b1 b1Var;
        f1 f1Var;
        f1 f1Var2;
        b1 b1Var2;
        if (key instanceof BCPBEKey) {
            i makePBEParameters = BrokenPBE.Util.makePBEParameters((BCPBEKey) key, algorithmParameterSpec, this.pbeType, this.pbeHash, this.cipher.d().getAlgorithmName(), this.pbeKeySize, this.pbeIvSize);
            b1Var = makePBEParameters;
            if (this.pbeIvSize != 0) {
                this.ivParam = (f1) makePBEParameters;
                b1Var = makePBEParameters;
            }
        } else {
            if (algorithmParameterSpec == null) {
                b1Var2 = new b1(key.getEncoded());
            } else {
                if (algorithmParameterSpec instanceof IvParameterSpec) {
                    if (this.ivLength != 0) {
                        f1 f1Var3 = new f1(new b1(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
                        this.ivParam = f1Var3;
                        f1Var2 = f1Var3;
                    } else {
                        b1Var2 = new b1(key.getEncoded());
                    }
                } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                    RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                    j1 j1Var = new j1(key.getEncoded(), rC2ParameterSpec.getEffectiveKeyBits());
                    f1Var2 = j1Var;
                    if (rC2ParameterSpec.getIV() != null) {
                        f1Var2 = j1Var;
                        if (this.ivLength != 0) {
                            f1Var = new f1(j1Var, rC2ParameterSpec.getIV());
                            this.ivParam = f1Var;
                            b1Var = f1Var;
                        }
                    }
                } else if (!(algorithmParameterSpec instanceof RC5ParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("unknown parameter type.");
                } else {
                    RC5ParameterSpec rC5ParameterSpec = (RC5ParameterSpec) algorithmParameterSpec;
                    k1 k1Var = new k1(key.getEncoded(), rC5ParameterSpec.getRounds());
                    if (rC5ParameterSpec.getWordSize() != 32) {
                        throw new IllegalArgumentException("can only accept RC5 word size 32 (at the moment...)");
                    }
                    f1Var2 = k1Var;
                    if (rC5ParameterSpec.getIV() != null) {
                        f1Var2 = k1Var;
                        if (this.ivLength != 0) {
                            f1Var = new f1(k1Var, rC5ParameterSpec.getIV());
                            this.ivParam = f1Var;
                            b1Var = f1Var;
                        }
                    }
                }
                b1Var = f1Var2;
            }
            b1Var = b1Var2;
        }
        f1 f1Var4 = b1Var;
        if (this.ivLength != 0) {
            boolean z10 = b1Var instanceof f1;
            f1Var4 = b1Var;
            if (!z10) {
                if (secureRandom == null) {
                    secureRandom = l.b();
                }
                if (i10 != 1 && i10 != 3) {
                    throw new InvalidAlgorithmParameterException("no IV set when one expected");
                }
                byte[] bArr = new byte[this.ivLength];
                secureRandom.nextBytes(bArr);
                f1 f1Var5 = new f1(b1Var, bArr);
                this.ivParam = f1Var5;
                f1Var4 = f1Var5;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        System.out.println("eeek!");
                        return;
                    }
                }
            }
            this.cipher.f(false, f1Var4);
            return;
        }
        this.cipher.f(true, f1Var4);
    }

    protected void engineSetMode(String str) {
        yh.e eVar;
        yh.e eVar2;
        String k10 = q.k(str);
        if (k10.equals("ECB")) {
            this.ivLength = 0;
            eVar = new yh.e(this.cipher.d());
        } else if (k10.equals("CBC")) {
            this.ivLength = this.cipher.d().b();
            eVar = new yh.e(new c(this.cipher.d()));
        } else if (k10.startsWith("OFB")) {
            this.ivLength = this.cipher.d().b();
            if (k10.length() != 3) {
                eVar2 = new yh.e(new v(this.cipher.d(), Integer.parseInt(k10.substring(3))));
                this.cipher = eVar2;
                return;
            }
            eVar = new yh.e(new v(this.cipher.d(), this.cipher.b() * 8));
        } else if (!k10.startsWith("CFB")) {
            throw new IllegalArgumentException("can't support mode " + str);
        } else {
            this.ivLength = this.cipher.d().b();
            if (k10.length() != 3) {
                eVar2 = new yh.e(new vh.e(this.cipher.d(), Integer.parseInt(k10.substring(3))));
                this.cipher = eVar2;
                return;
            }
            eVar = new yh.e(new vh.e(this.cipher.d(), this.cipher.b() * 8));
        }
        this.cipher = eVar;
    }

    protected void engineSetPadding(String str) {
        f eVar;
        String k10 = q.k(str);
        if (k10.equals("NOPADDING")) {
            eVar = new f(this.cipher.d());
        } else if (k10.equals("PKCS5PADDING") || k10.equals("PKCS7PADDING") || k10.equals("ISO10126PADDING")) {
            eVar = new yh.e(this.cipher.d());
        } else if (!k10.equals("WITHCTS")) {
            throw new NoSuchPaddingException("Padding " + str + " unknown.");
        } else {
            eVar = new vh.f(this.cipher.d());
        }
        this.cipher = eVar;
    }

    protected Key engineUnwrap(byte[] bArr, String str, int i10) {
        try {
            byte[] engineDoFinal = engineDoFinal(bArr, 0, bArr.length);
            if (i10 == 3) {
                return new SecretKeySpec(engineDoFinal, str);
            }
            try {
                KeyFactory keyFactory = KeyFactory.getInstance(str, BouncyCastleProvider.PROVIDER_NAME);
                if (i10 == 1) {
                    return keyFactory.generatePublic(new X509EncodedKeySpec(engineDoFinal));
                }
                if (i10 == 2) {
                    return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(engineDoFinal));
                }
                throw new InvalidKeyException("Unknown key type " + i10);
            } catch (NoSuchAlgorithmException e10) {
                throw new InvalidKeyException("Unknown key type " + e10.getMessage());
            } catch (NoSuchProviderException e11) {
                throw new InvalidKeyException("Unknown key type " + e11.getMessage());
            } catch (InvalidKeySpecException e12) {
                throw new InvalidKeyException("Unknown key type " + e12.getMessage());
            }
        } catch (BadPaddingException e13) {
            throw new InvalidKeyException(e13.getMessage());
        } catch (IllegalBlockSizeException e14) {
            throw new InvalidKeyException(e14.getMessage());
        }
    }

    protected int engineUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        return this.cipher.h(bArr, i10, i11, bArr2, i12);
    }

    protected byte[] engineUpdate(byte[] bArr, int i10, int i11) {
        int e10 = this.cipher.e(i11);
        if (e10 <= 0) {
            this.cipher.h(bArr, i10, i11, null, 0);
            return null;
        }
        byte[] bArr2 = new byte[e10];
        this.cipher.h(bArr, i10, i11, bArr2, 0);
        return bArr2;
    }

    protected byte[] engineWrap(Key key) {
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            try {
                return engineDoFinal(encoded, 0, encoded.length);
            } catch (BadPaddingException e10) {
                throw new IllegalBlockSizeException(e10.getMessage());
            }
        }
        throw new InvalidKeyException("Cannot wrap key, null encoding.");
    }
}
