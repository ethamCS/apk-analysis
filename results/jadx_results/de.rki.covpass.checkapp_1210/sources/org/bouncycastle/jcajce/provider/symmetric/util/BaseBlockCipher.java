package org.bouncycastle.jcajce.provider.symmetric.util;

import gg.t1;
import gi.c;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.bouncycastle.crypto.a0;
import org.bouncycastle.crypto.e;
import org.bouncycastle.crypto.f;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.o;
import org.bouncycastle.crypto.u;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import qh.r;
import vh.b;
import vh.d;
import vh.h;
import vh.m;
import vh.n;
import vh.p;
import vh.s;
import vh.t;
import vh.v;
import vh.w;
import vh.x;
import vh.y;
import yh.g;
import zg.q;
import zh.a;
import zh.f1;
import zh.h1;
/* loaded from: classes3.dex */
public class BaseBlockCipher extends BaseWrapCipher {
    private static final int BUF_SIZE = 512;
    private static final Class gcmSpecClass = ClassUtil.loadClass(BaseBlockCipher.class, "javax.crypto.spec.GCMParameterSpec");
    private a aeadParams;
    private Class[] availableSpecs;
    private e baseEngine;
    private GenericBlockCipher cipher;
    private int digest;
    private BlockCipherProvider engineProvider;
    private boolean fixedIv;
    private int ivLength;
    private f1 ivParam;
    private int keySizeInBits;
    private String modeName;
    private boolean padded;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;
    private int scheme;

    /* loaded from: classes3.dex */
    public static class AEADGenericBlockCipher implements GenericBlockCipher {
        private static final Constructor aeadBadTagConstructor;
        private b cipher;

        static {
            Class loadClass = ClassUtil.loadClass(BaseBlockCipher.class, "javax.crypto.AEADBadTagException");
            aeadBadTagConstructor = loadClass != null ? findExceptionConstructor(loadClass) : null;
        }

        AEADGenericBlockCipher(b bVar) {
            this.cipher = bVar;
        }

        private static Constructor findExceptionConstructor(Class cls) {
            try {
                return cls.getConstructor(String.class);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i10) {
            try {
                return this.cipher.doFinal(bArr, i10);
            } catch (u e10) {
                Constructor constructor = aeadBadTagConstructor;
                if (constructor != null) {
                    BadPaddingException badPaddingException = null;
                    try {
                        badPaddingException = (BadPaddingException) constructor.newInstance(e10.getMessage());
                    } catch (Exception unused) {
                    }
                    if (badPaddingException != null) {
                        throw badPaddingException;
                    }
                }
                throw new BadPaddingException(e10.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            b bVar = this.cipher;
            return bVar instanceof vh.a ? ((vh.a) bVar).getUnderlyingCipher().getAlgorithmName() : bVar.getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i10) {
            return this.cipher.getOutputSize(i10);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public e getUnderlyingCipher() {
            b bVar = this.cipher;
            if (bVar instanceof vh.a) {
                return ((vh.a) bVar).getUnderlyingCipher();
            }
            return null;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i10) {
            return this.cipher.getUpdateOutputSize(i10);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z10, i iVar) {
            this.cipher.init(z10, iVar);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b10, byte[] bArr, int i10) {
            return this.cipher.processByte(b10, bArr, i10);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
            return this.cipher.processBytes(bArr, i10, i11, bArr2, i12);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i10, int i11) {
            this.cipher.a(bArr, i10, i11);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    /* loaded from: classes3.dex */
    private static class BufferedFPEBlockCipher implements GenericBlockCipher {
        private rh.a cipher;
        private BaseWrapCipher.ErasableOutputStream eOut = new BaseWrapCipher.ErasableOutputStream();

        BufferedFPEBlockCipher(rh.a aVar) {
            this.cipher = aVar;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i10) {
            try {
                return this.cipher.e(this.eOut.getBuf(), 0, this.eOut.size(), bArr, i10);
            } finally {
                this.eOut.erase();
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return this.cipher.c();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i10) {
            return this.eOut.size() + i10;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public e getUnderlyingCipher() {
            throw new IllegalStateException("not applicable for FPE");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i10) {
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z10, i iVar) {
            this.cipher.d(z10, iVar);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b10, byte[] bArr, int i10) {
            this.eOut.write(b10);
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
            this.eOut.write(bArr, i10, i11);
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i10, int i11) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class BufferedGenericBlockCipher implements GenericBlockCipher {
        private f cipher;

        BufferedGenericBlockCipher(e eVar) {
            this.cipher = new yh.e(eVar);
        }

        BufferedGenericBlockCipher(e eVar, yh.a aVar) {
            this.cipher = new yh.e(eVar, aVar);
        }

        BufferedGenericBlockCipher(f fVar) {
            this.cipher = fVar;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i10) {
            try {
                return this.cipher.a(bArr, i10);
            } catch (u e10) {
                throw new BadPaddingException(e10.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return this.cipher.d().getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i10) {
            return this.cipher.c(i10);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public e getUnderlyingCipher() {
            return this.cipher.d();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i10) {
            return this.cipher.e(i10);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z10, i iVar) {
            this.cipher.f(z10, iVar);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b10, byte[] bArr, int i10) {
            return this.cipher.g(b10, bArr, i10);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
            return this.cipher.h(bArr, i10, i11, bArr2, i12);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i10, int i11) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return !(this.cipher instanceof vh.f);
        }
    }

    /* loaded from: classes3.dex */
    public interface GenericBlockCipher {
        int doFinal(byte[] bArr, int i10);

        String getAlgorithmName();

        int getOutputSize(int i10);

        e getUnderlyingCipher();

        int getUpdateOutputSize(int i10);

        void init(boolean z10, i iVar);

        int processByte(byte b10, byte[] bArr, int i10);

        int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

        void updateAAD(byte[] bArr, int i10, int i11);

        boolean wrapOnNoPadding();
    }

    public BaseBlockCipher(e eVar) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, mi.i.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = eVar;
        this.cipher = new BufferedGenericBlockCipher(eVar);
    }

    public BaseBlockCipher(e eVar, int i10) {
        this(eVar, true, i10);
    }

    public BaseBlockCipher(e eVar, int i10, int i11, int i12, int i13) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, mi.i.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = eVar;
        this.scheme = i10;
        this.digest = i11;
        this.keySizeInBits = i12;
        this.ivLength = i13;
        this.cipher = new BufferedGenericBlockCipher(eVar);
    }

    public BaseBlockCipher(e eVar, boolean z10, int i10) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, mi.i.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = eVar;
        this.fixedIv = z10;
        this.cipher = new BufferedGenericBlockCipher(eVar);
        this.ivLength = i10 / 8;
    }

    public BaseBlockCipher(f fVar, int i10) {
        this(fVar, true, i10);
    }

    public BaseBlockCipher(f fVar, boolean z10, int i10) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, mi.i.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = fVar.d();
        this.cipher = new BufferedGenericBlockCipher(fVar);
        this.fixedIv = z10;
        this.ivLength = i10 / 8;
    }

    public BaseBlockCipher(BlockCipherProvider blockCipherProvider) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, mi.i.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipherProvider.get();
        this.engineProvider = blockCipherProvider;
        this.cipher = new BufferedGenericBlockCipher(blockCipherProvider.get());
    }

    public BaseBlockCipher(vh.a aVar) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, mi.i.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = aVar.getUnderlyingCipher();
        this.ivLength = aVar.getAlgorithmName().indexOf("GCM") >= 0 ? 12 : this.baseEngine.b();
        this.cipher = new AEADGenericBlockCipher(aVar);
    }

    public BaseBlockCipher(vh.a aVar, boolean z10, int i10) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, mi.i.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = aVar.getUnderlyingCipher();
        this.fixedIv = z10;
        this.ivLength = i10;
        this.cipher = new AEADGenericBlockCipher(aVar);
    }

    public BaseBlockCipher(b bVar, boolean z10, int i10) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, mi.i.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = null;
        this.fixedIv = z10;
        this.ivLength = i10;
        this.cipher = new AEADGenericBlockCipher(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private i adjustParameters(AlgorithmParameterSpec algorithmParameterSpec, i iVar) {
        h1 h1Var;
        f1 f1Var;
        if (iVar instanceof f1) {
            i b10 = ((f1) iVar).b();
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                f1Var = new f1(b10, ((IvParameterSpec) algorithmParameterSpec).getIV());
            } else if (!(algorithmParameterSpec instanceof mi.i)) {
                return iVar;
            } else {
                mi.i iVar2 = (mi.i) algorithmParameterSpec;
                h1 h1Var2 = new h1(iVar, iVar2.d());
                if (iVar2.a() == null || this.ivLength == 0) {
                    return h1Var2;
                }
                f1Var = new f1(b10, iVar2.a());
            }
            this.ivParam = f1Var;
            return f1Var;
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            f1 f1Var2 = new f1(iVar, ((IvParameterSpec) algorithmParameterSpec).getIV());
            this.ivParam = f1Var2;
            h1Var = f1Var2;
        } else if (!(algorithmParameterSpec instanceof mi.i)) {
            return iVar;
        } else {
            mi.i iVar3 = (mi.i) algorithmParameterSpec;
            h1 h1Var3 = new h1(iVar, iVar3.d());
            h1Var = h1Var3;
            if (iVar3.a() != null) {
                h1Var = h1Var3;
                if (this.ivLength != 0) {
                    return new f1(h1Var3, iVar3.a());
                }
            }
        }
        return h1Var;
    }

    private boolean isAEADModeName(String str) {
        return "CCM".equals(str) || "EAX".equals(str) || "GCM".equals(str) || "GCM-SIV".equals(str) || "OCB".equals(str);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int processBytes;
        if (engineGetOutputSize(i11) + i12 <= bArr2.length) {
            if (i11 != 0) {
                try {
                    processBytes = this.cipher.processBytes(bArr, i10, i11, bArr2, i12);
                } catch (a0 e10) {
                    throw new IllegalBlockSizeException(e10.getMessage());
                } catch (o e11) {
                    throw new IllegalBlockSizeException(e11.getMessage());
                }
            } else {
                processBytes = 0;
            }
            return processBytes + this.cipher.doFinal(bArr2, i12 + processBytes);
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i10, int i11) {
        int engineGetOutputSize = engineGetOutputSize(i11);
        byte[] bArr2 = new byte[engineGetOutputSize];
        int processBytes = i11 != 0 ? this.cipher.processBytes(bArr, i10, i11, bArr2, 0) : 0;
        try {
            int doFinal = processBytes + this.cipher.doFinal(bArr2, processBytes);
            if (doFinal == engineGetOutputSize) {
                return bArr2;
            }
            if (doFinal > engineGetOutputSize) {
                throw new IllegalBlockSizeException("internal buffer overflow");
            }
            byte[] bArr3 = new byte[doFinal];
            System.arraycopy(bArr2, 0, bArr3, 0, doFinal);
            return bArr3;
        } catch (o e10) {
            throw new IllegalBlockSizeException(e10.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        e eVar = this.baseEngine;
        if (eVar == null) {
            return -1;
        }
        return eVar.b();
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        a aVar = this.aeadParams;
        if (aVar != null) {
            return aVar.d();
        }
        f1 f1Var = this.ivParam;
        if (f1Var == null) {
            return null;
        }
        return f1Var.a();
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i10) {
        return this.cipher.getOutputSize(i10);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            if (this.pbeSpec != null) {
                try {
                    AlgorithmParameters createParametersInstance = createParametersInstance(this.pbeAlgorithm);
                    this.engineParams = createParametersInstance;
                    createParametersInstance.init(this.pbeSpec);
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.aeadParams != null) {
                if (this.baseEngine == null) {
                    try {
                        AlgorithmParameters createParametersInstance2 = createParametersInstance(q.H2.H());
                        this.engineParams = createParametersInstance2;
                        createParametersInstance2.init(new t1(this.aeadParams.d()).getEncoded());
                    } catch (Exception e10) {
                        throw new RuntimeException(e10.toString());
                    }
                } else {
                    try {
                        AlgorithmParameters createParametersInstance3 = createParametersInstance("GCM");
                        this.engineParams = createParametersInstance3;
                        createParametersInstance3.init(new c(this.aeadParams.d(), this.aeadParams.c() / 8).getEncoded());
                    } catch (Exception e11) {
                        throw new RuntimeException(e11.toString());
                    }
                }
            } else if (this.ivParam != null) {
                String algorithmName = this.cipher.getUnderlyingCipher().getAlgorithmName();
                if (algorithmName.indexOf(47) >= 0) {
                    algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                }
                try {
                    AlgorithmParameters createParametersInstance4 = createParametersInstance(algorithmName);
                    this.engineParams = createParametersInstance4;
                    createParametersInstance4.init(new IvParameterSpec(this.ivParam.a()));
                } catch (Exception e12) {
                    throw new RuntimeException(e12.toString());
                }
            }
        }
        return this.engineParams;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
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
        engineInit(i10, key, algorithmParameterSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i10, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i10, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new InvalidKeyException(e10.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
        if (r8 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
        r20.ivParam = (zh.f1) r6;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f9, code lost:
        if (r8 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0145, code lost:
        if (r8 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f9, code lost:
        if (r8 != false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:206:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04dd A[Catch: Exception -> 0x0504, IllegalArgumentException -> 0x050f, TryCatch #3 {IllegalArgumentException -> 0x050f, Exception -> 0x0504, blocks: (B:228:0x04af, B:229:0x04ca, B:230:0x04cb, B:231:0x04d2, B:232:0x04d7, B:234:0x04dd, B:236:0x04e1), top: B:248:0x04a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v17, types: [zh.f1] */
    /* JADX WARN: Type inference failed for: r6v11, types: [org.bouncycastle.crypto.i] */
    /* JADX WARN: Type inference failed for: r6v12, types: [org.bouncycastle.crypto.i] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [zh.k1, org.bouncycastle.crypto.i] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27, types: [zh.f1] */
    /* JADX WARN: Type inference failed for: r6v29, types: [zh.a] */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r6v64 */
    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void engineInit(int r21, java.security.Key r22, java.security.spec.AlgorithmParameterSpec r23, java.security.SecureRandom r24) {
        /*
            Method dump skipped, instructions count: 1314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetMode(String str) {
        GenericBlockCipher aEADGenericBlockCipher;
        BufferedGenericBlockCipher bufferedGenericBlockCipher;
        if (this.baseEngine != null) {
            String k10 = ak.q.k(str);
            this.modeName = k10;
            if (k10.equals("ECB")) {
                this.ivLength = 0;
                aEADGenericBlockCipher = new BufferedGenericBlockCipher(this.baseEngine);
            } else if (this.modeName.equals("CBC")) {
                this.ivLength = this.baseEngine.b();
                aEADGenericBlockCipher = new BufferedGenericBlockCipher(new vh.c(this.baseEngine));
            } else if (this.modeName.startsWith("OFB")) {
                this.ivLength = this.baseEngine.b();
                if (this.modeName.length() != 3) {
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new v(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                    this.cipher = bufferedGenericBlockCipher;
                    return;
                }
                e eVar = this.baseEngine;
                aEADGenericBlockCipher = new BufferedGenericBlockCipher(new v(eVar, eVar.b() * 8));
            } else if (!this.modeName.startsWith("CFB")) {
                if (this.modeName.startsWith("PGPCFB")) {
                    boolean equals = this.modeName.equals("PGPCFBWITHIV");
                    if (!equals && this.modeName.length() != 6) {
                        throw new NoSuchAlgorithmException("no mode support for " + this.modeName);
                    }
                    this.ivLength = this.baseEngine.b();
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new x(this.baseEngine, equals));
                } else if (this.modeName.equals("OPENPGPCFB")) {
                    this.ivLength = 0;
                    aEADGenericBlockCipher = new BufferedGenericBlockCipher(new w(this.baseEngine));
                } else if (this.modeName.equals("FF1")) {
                    this.ivLength = 0;
                    aEADGenericBlockCipher = new BufferedFPEBlockCipher(new rh.b(this.baseEngine));
                } else if (this.modeName.equals("FF3-1")) {
                    this.ivLength = 0;
                    aEADGenericBlockCipher = new BufferedFPEBlockCipher(new rh.c(this.baseEngine));
                } else if (this.modeName.equals("SIC")) {
                    int b10 = this.baseEngine.b();
                    this.ivLength = b10;
                    if (b10 < 16) {
                        throw new IllegalArgumentException("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
                    }
                    this.fixedIv = false;
                    aEADGenericBlockCipher = new BufferedGenericBlockCipher(new f(new y(this.baseEngine)));
                } else if (this.modeName.equals("CTR")) {
                    this.ivLength = this.baseEngine.b();
                    this.fixedIv = false;
                    e eVar2 = this.baseEngine;
                    bufferedGenericBlockCipher = eVar2 instanceof r ? new BufferedGenericBlockCipher(new f(new s(eVar2))) : new BufferedGenericBlockCipher(new f(new y(eVar2)));
                } else if (this.modeName.equals("GOFB")) {
                    this.ivLength = this.baseEngine.b();
                    aEADGenericBlockCipher = new BufferedGenericBlockCipher(new f(new p(this.baseEngine)));
                } else if (this.modeName.equals("GCFB")) {
                    this.ivLength = this.baseEngine.b();
                    aEADGenericBlockCipher = new BufferedGenericBlockCipher(new f(new m(this.baseEngine)));
                } else if (this.modeName.equals("CTS")) {
                    this.ivLength = this.baseEngine.b();
                    aEADGenericBlockCipher = new BufferedGenericBlockCipher(new vh.f(new vh.c(this.baseEngine)));
                } else if (this.modeName.equals("CCM")) {
                    this.ivLength = 12;
                    aEADGenericBlockCipher = this.baseEngine instanceof r ? new AEADGenericBlockCipher(new vh.r(this.baseEngine)) : new AEADGenericBlockCipher(new d(this.baseEngine));
                } else if (this.modeName.equals("OCB")) {
                    if (this.engineProvider == null) {
                        throw new NoSuchAlgorithmException("can't support mode " + str);
                    }
                    this.ivLength = 15;
                    aEADGenericBlockCipher = new AEADGenericBlockCipher(new vh.u(this.baseEngine, this.engineProvider.get()));
                } else if (this.modeName.equals("EAX")) {
                    this.ivLength = this.baseEngine.b();
                    aEADGenericBlockCipher = new AEADGenericBlockCipher(new h(this.baseEngine));
                } else if (this.modeName.equals("GCM-SIV")) {
                    this.ivLength = 12;
                    aEADGenericBlockCipher = new AEADGenericBlockCipher(new vh.o(this.baseEngine));
                } else if (!this.modeName.equals("GCM")) {
                    throw new NoSuchAlgorithmException("can't support mode " + str);
                } else {
                    e eVar3 = this.baseEngine;
                    if (eVar3 instanceof r) {
                        this.ivLength = eVar3.b();
                        aEADGenericBlockCipher = new AEADGenericBlockCipher(new t(this.baseEngine));
                    } else {
                        this.ivLength = 12;
                        aEADGenericBlockCipher = new AEADGenericBlockCipher(new n(this.baseEngine));
                    }
                }
                this.cipher = bufferedGenericBlockCipher;
                return;
            } else {
                this.ivLength = this.baseEngine.b();
                if (this.modeName.length() != 3) {
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new vh.e(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                    this.cipher = bufferedGenericBlockCipher;
                    return;
                }
                e eVar4 = this.baseEngine;
                aEADGenericBlockCipher = new BufferedGenericBlockCipher(new vh.e(eVar4, eVar4.b() * 8));
            }
            this.cipher = aEADGenericBlockCipher;
            return;
        }
        throw new NoSuchAlgorithmException("no mode supported for this algorithm");
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetPadding(String str) {
        BufferedGenericBlockCipher bufferedGenericBlockCipher;
        if (this.baseEngine != null) {
            String k10 = ak.q.k(str);
            if (k10.equals("NOPADDING")) {
                if (!this.cipher.wrapOnNoPadding()) {
                    return;
                }
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new f(this.cipher.getUnderlyingCipher()));
            } else if (k10.equals("WITHCTS") || k10.equals("CTSPADDING") || k10.equals("CS3PADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new vh.f(this.cipher.getUnderlyingCipher()));
            } else {
                this.padded = true;
                if (isAEADModeName(this.modeName)) {
                    throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
                }
                if (k10.equals("PKCS5PADDING") || k10.equals("PKCS7PADDING")) {
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher());
                } else if (k10.equals("ZEROBYTEPADDING")) {
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new yh.h());
                } else if (k10.equals("ISO10126PADDING") || k10.equals("ISO10126-2PADDING")) {
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new yh.b());
                } else if (k10.equals("X9.23PADDING") || k10.equals("X923PADDING")) {
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new g());
                } else if (k10.equals("ISO7816-4PADDING") || k10.equals("ISO9797-1PADDING")) {
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new yh.c());
                } else if (!k10.equals("TBCPADDING")) {
                    throw new NoSuchPaddingException("Padding " + str + " unknown.");
                } else {
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new yh.f());
                }
            }
            this.cipher = bufferedGenericBlockCipher;
            return;
        }
        throw new NoSuchPaddingException("no padding supported for this algorithm");
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (this.cipher.getUpdateOutputSize(i11) + i12 <= bArr2.length) {
            try {
                return this.cipher.processBytes(bArr, i10, i11, bArr2, i12);
            } catch (o e10) {
                throw new IllegalStateException(e10.toString());
            }
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i10, int i11) {
        int updateOutputSize = this.cipher.getUpdateOutputSize(i11);
        if (updateOutputSize <= 0) {
            this.cipher.processBytes(bArr, i10, i11, null, 0);
            return null;
        }
        byte[] bArr2 = new byte[updateOutputSize];
        int processBytes = this.cipher.processBytes(bArr, i10, i11, bArr2, 0);
        if (processBytes == 0) {
            return null;
        }
        if (processBytes == updateOutputSize) {
            return bArr2;
        }
        byte[] bArr3 = new byte[processBytes];
        System.arraycopy(bArr2, 0, bArr3, 0, processBytes);
        return bArr3;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining < 1) {
            return;
        }
        if (byteBuffer.hasArray()) {
            engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), remaining);
            byteBuffer.position(byteBuffer.limit());
        } else if (remaining <= BUF_SIZE) {
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr);
            engineUpdateAAD(bArr, 0, remaining);
            ak.a.y(bArr, (byte) 0);
        } else {
            byte[] bArr2 = new byte[BUF_SIZE];
            do {
                int min = Math.min((int) BUF_SIZE, remaining);
                byteBuffer.get(bArr2, 0, min);
                engineUpdateAAD(bArr2, 0, min);
                remaining -= min;
            } while (remaining > 0);
            ak.a.y(bArr2, (byte) 0);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(byte[] bArr, int i10, int i11) {
        this.cipher.updateAAD(bArr, i10, i11);
    }
}
