package org.bouncycastle.jcajce.provider.symmetric.util;

import ak.a;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import mi.j;
import ni.c;
import org.bouncycastle.crypto.i0;
import org.bouncycastle.crypto.u;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.conscrypt.BuildConfig;
import zg.s;
import zh.b1;
import zh.f1;
import zh.g1;
import zh.h1;
import zh.i1;
/* loaded from: classes3.dex */
public abstract class BaseWrapCipher extends CipherSpi implements PBE {
    private Class[] availableSpecs;
    protected AlgorithmParameters engineParams;
    private boolean forWrapping;
    private final c helper;
    private byte[] iv;
    private int ivSize;
    protected int pbeHash;
    protected int pbeIvSize;
    protected int pbeKeySize;
    protected int pbeType;
    protected i0 wrapEngine;
    private ErasableOutputStream wrapStream;

    /* loaded from: classes3.dex */
    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public void erase() {
            a.y(((ByteArrayOutputStream) this).buf, (byte) 0);
            reset();
        }

        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* loaded from: classes3.dex */
    public static class InvalidKeyOrParametersException extends InvalidKeyException {
        private final Throwable cause;

        public InvalidKeyOrParametersException(String str, Throwable th2) {
            super(str);
            this.cause = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public BaseWrapCipher() {
        this.availableSpecs = new Class[]{j.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapStream = null;
        this.helper = new ni.a();
    }

    public BaseWrapCipher(i0 i0Var) {
        this(i0Var, 0);
    }

    public BaseWrapCipher(i0 i0Var, int i10) {
        this.availableSpecs = new Class[]{j.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapStream = null;
        this.helper = new ni.a();
        this.wrapEngine = i0Var;
        this.ivSize = i10;
    }

    public final AlgorithmParameters createParametersInstance(String str) {
        return this.helper.f(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #2 {all -> 0x005f, blocks: (B:5:0x0007, B:8:0x000c, B:10:0x0020, B:11:0x0029, B:12:0x002a, B:13:0x003c, B:15:0x0041, B:18:0x004c, B:19:0x0053, B:21:0x0055, B:22:0x005e), top: B:32:0x0007, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #2 {all -> 0x005f, blocks: (B:5:0x0007, B:8:0x000c, B:10:0x0020, B:11:0x0029, B:12:0x002a, B:13:0x003c, B:15:0x0041, B:18:0x004c, B:19:0x0053, B:21:0x0055, B:22:0x005e), top: B:32:0x0007, inners: #0, #1 }] */
    @Override // javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected int engineDoFinal(byte[] r2, int r3, int r4, byte[] r5, int r6) {
        /*
            r1 = this;
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r0 = r1.wrapStream
            if (r0 == 0) goto L66
            r0.write(r2, r3, r4)
            boolean r2 = r1.forWrapping     // Catch: java.lang.Throwable -> L5f
            r3 = 0
            if (r2 == 0) goto L2a
            org.bouncycastle.crypto.i0 r2 = r1.wrapEngine     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L5f
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r4 = r1.wrapStream     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L5f
            byte[] r4 = r4.getBuf()     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L5f
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r0 = r1.wrapStream     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L5f
            int r0 = r0.size()     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L5f
            byte[] r2 = r2.b(r4, r3, r0)     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L5f
            goto L3c
        L1f:
            r2 = move-exception
            javax.crypto.IllegalBlockSizeException r3 = new javax.crypto.IllegalBlockSizeException     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L5f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L5f
            throw r3     // Catch: java.lang.Throwable -> L5f
        L2a:
            org.bouncycastle.crypto.i0 r2 = r1.wrapEngine     // Catch: org.bouncycastle.crypto.u -> L54 java.lang.Throwable -> L5f
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r4 = r1.wrapStream     // Catch: org.bouncycastle.crypto.u -> L54 java.lang.Throwable -> L5f
            byte[] r4 = r4.getBuf()     // Catch: org.bouncycastle.crypto.u -> L54 java.lang.Throwable -> L5f
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r0 = r1.wrapStream     // Catch: org.bouncycastle.crypto.u -> L54 java.lang.Throwable -> L5f
            int r0 = r0.size()     // Catch: org.bouncycastle.crypto.u -> L54 java.lang.Throwable -> L5f
            byte[] r2 = r2.a(r4, r3, r0)     // Catch: org.bouncycastle.crypto.u -> L54 java.lang.Throwable -> L5f
        L3c:
            int r4 = r2.length     // Catch: java.lang.Throwable -> L5f
            int r4 = r4 + r6
            int r0 = r5.length     // Catch: java.lang.Throwable -> L5f
            if (r4 > r0) goto L4c
            int r4 = r2.length     // Catch: java.lang.Throwable -> L5f
            java.lang.System.arraycopy(r2, r3, r5, r6, r4)     // Catch: java.lang.Throwable -> L5f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L5f
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r3 = r1.wrapStream
            r3.erase()
            return r2
        L4c:
            javax.crypto.ShortBufferException r2 = new javax.crypto.ShortBufferException     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = "output buffer too short for input."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5f
            throw r2     // Catch: java.lang.Throwable -> L5f
        L54:
            r2 = move-exception
            javax.crypto.BadPaddingException r3 = new javax.crypto.BadPaddingException     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L5f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L5f
            throw r3     // Catch: java.lang.Throwable -> L5f
        L5f:
            r2 = move-exception
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r3 = r1.wrapStream
            r3.erase()
            throw r2
        L66:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "not supported in a wrapping mode"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher.engineDoFinal(byte[], int, int, byte[], int):int");
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i10, int i11) {
        byte[] b10;
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream != null) {
            if (bArr != null) {
                erasableOutputStream.write(bArr, i10, i11);
            }
            try {
                if (this.forWrapping) {
                    try {
                        b10 = this.wrapEngine.b(this.wrapStream.getBuf(), 0, this.wrapStream.size());
                        return b10;
                    } catch (Exception e10) {
                        throw new IllegalBlockSizeException(e10.getMessage());
                    }
                }
                try {
                    b10 = this.wrapEngine.a(this.wrapStream.getBuf(), 0, this.wrapStream.size());
                    return b10;
                } catch (u e11) {
                    throw new BadPaddingException(e11.getMessage());
                }
            } finally {
                this.wrapStream.erase();
            }
        }
        throw new IllegalStateException("not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        return a.h(this.iv);
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i10) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.iv != null) {
            String algorithmName = this.wrapEngine.getAlgorithmName();
            if (algorithmName.indexOf(47) >= 0) {
                algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
            }
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(algorithmName);
                this.engineParams = createParametersInstance;
                createParametersInstance.init(new IvParameterSpec(this.iv));
            } catch (Exception e10) {
                throw new RuntimeException(e10.toString());
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i10, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            algorithmParameterSpec = SpecUtil.extractSpec(algorithmParameters, this.availableSpecs);
            if (algorithmParameterSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        } else {
            algorithmParameterSpec = null;
        }
        this.engineParams = algorithmParameters;
        engineInit(i10, key, algorithmParameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i10, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i10, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new InvalidKeyOrParametersException(e10.getMessage(), e10);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i10, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        f1 f1Var;
        int i11;
        if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                f1Var = PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.wrapEngine.getAlgorithmName());
            } else if (bCPBEKey.getParam() == null) {
                throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
            } else {
                f1Var = bCPBEKey.getParam();
            }
        } else {
            f1Var = new b1(key.getEncoded());
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            byte[] iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            this.iv = iv;
            f1Var = new f1(f1Var, iv);
        }
        if (algorithmParameterSpec instanceof j) {
            j jVar = (j) algorithmParameterSpec;
            byte[] a10 = jVar.a();
            if (a10 != null) {
                f1Var = new h1(f1Var, a10);
            }
            f1Var = new i1(f1Var, jVar.b());
        }
        if ((f1Var instanceof b1) && (i11 = this.ivSize) != 0 && (i10 == 3 || i10 == 1)) {
            byte[] bArr = new byte[i11];
            this.iv = bArr;
            secureRandom.nextBytes(bArr);
            f1Var = new f1(f1Var, this.iv);
        }
        if (secureRandom != null) {
            f1Var = new g1(f1Var, secureRandom);
        }
        try {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.wrapEngine.init(false, f1Var);
                    this.wrapStream = new ErasableOutputStream();
                } else if (i10 == 3) {
                    this.wrapEngine.init(true, f1Var);
                    this.wrapStream = null;
                } else if (i10 != 4) {
                    throw new InvalidParameterException("Unknown mode parameter passed to init.");
                } else {
                    this.wrapEngine.init(false, f1Var);
                    this.wrapStream = null;
                }
                this.forWrapping = false;
                return;
            }
            this.wrapEngine.init(true, f1Var);
            this.wrapStream = new ErasableOutputStream();
            this.forWrapping = true;
        } catch (Exception e10) {
            throw new InvalidKeyOrParametersException(e10.getMessage(), e10);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetMode(String str) {
        throw new NoSuchAlgorithmException("can't support mode " + str);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetPadding(String str) {
        throw new NoSuchPaddingException("Padding " + str + " unknown.");
    }

    @Override // javax.crypto.CipherSpi
    protected Key engineUnwrap(byte[] bArr, String str, int i10) {
        try {
            i0 i0Var = this.wrapEngine;
            byte[] engineDoFinal = i0Var == null ? engineDoFinal(bArr, 0, bArr.length) : i0Var.a(bArr, 0, bArr.length);
            if (i10 == 3) {
                return new SecretKeySpec(engineDoFinal, str);
            }
            if (str.equals(BuildConfig.FLAVOR) && i10 == 2) {
                try {
                    s m10 = s.m(engineDoFinal);
                    PrivateKey privateKey = BouncyCastleProvider.getPrivateKey(m10);
                    if (privateKey != null) {
                        return privateKey;
                    }
                    throw new InvalidKeyException("algorithm " + m10.o().l() + " not supported");
                } catch (Exception unused) {
                    throw new InvalidKeyException("Invalid key encoding.");
                }
            }
            try {
                KeyFactory h10 = this.helper.h(str);
                if (i10 == 1) {
                    return h10.generatePublic(new X509EncodedKeySpec(engineDoFinal));
                }
                if (i10 == 2) {
                    return h10.generatePrivate(new PKCS8EncodedKeySpec(engineDoFinal));
                }
                throw new InvalidKeyException("Unknown key type " + i10);
            } catch (NoSuchProviderException e10) {
                throw new InvalidKeyException("Unknown key type " + e10.getMessage());
            } catch (InvalidKeySpecException e11) {
                throw new InvalidKeyException("Unknown key type " + e11.getMessage());
            }
        } catch (BadPaddingException e12) {
            throw new InvalidKeyException(e12.getMessage());
        } catch (IllegalBlockSizeException e13) {
            throw new InvalidKeyException(e13.getMessage());
        } catch (u e14) {
            throw new InvalidKeyException(e14.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream != null) {
            erasableOutputStream.write(bArr, i10, i11);
            return 0;
        }
        throw new IllegalStateException("not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i10, int i11) {
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream != null) {
            erasableOutputStream.write(bArr, i10, i11);
            return null;
        }
        throw new IllegalStateException("not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineWrap(Key key) {
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            try {
                i0 i0Var = this.wrapEngine;
                return i0Var == null ? engineDoFinal(encoded, 0, encoded.length) : i0Var.b(encoded, 0, encoded.length);
            } catch (BadPaddingException e10) {
                throw new IllegalBlockSizeException(e10.getMessage());
            }
        }
        throw new InvalidKeyException("Cannot wrap key, null encoding.");
    }
}
