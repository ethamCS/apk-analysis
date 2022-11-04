package org.bouncycastle.jcajce.provider.asymmetric.ec;

import ei.a;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.CipherSpi;
import javax.crypto.NoSuchPaddingException;
import ni.c;
import org.bouncycastle.crypto.e;
import org.bouncycastle.crypto.f;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.r;
import org.bouncycastle.crypto.u;
import org.bouncycastle.crypto.v;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import qh.c0;
import qi.k;
import ri.p;
import sh.l;
import sh.q;
import sh.t;
import uh.g;
import zh.a0;
import zh.b;
import zh.b0;
import zh.e0;
import zh.f1;
import zh.y;
import zh.y0;
/* loaded from: classes3.dex */
public class IESCipher extends CipherSpi {
    private ByteArrayOutputStream buffer;
    private boolean dhaesMode;
    private c0 engine;
    private AlgorithmParameters engineParam;
    private p engineSpec;
    private final c helper;
    private int ivLength;
    private b key;
    private b otherKeyParameter;
    private SecureRandom random;
    private int state;

    /* loaded from: classes3.dex */
    public static class ECIES extends IESCipher {
        public ECIES() {
            this(a.b(), a.b());
        }

        public ECIES(r rVar, r rVar2) {
            super(new c0(new lh.c(), new t(rVar), new g(rVar2)));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECIESwithAESCBC extends ECIESwithCipher {
        public ECIESwithAESCBC() {
            super(new vh.c(new qh.a()), 16);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECIESwithCipher extends IESCipher {
        public ECIESwithCipher(e eVar, int i10) {
            this(eVar, i10, a.b(), a.b());
        }

        public ECIESwithCipher(e eVar, int i10, r rVar, r rVar2) {
            super(new c0(new lh.c(), new t(rVar), new g(rVar2), new yh.e(eVar)), i10);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECIESwithDESedeCBC extends ECIESwithCipher {
        public ECIESwithDESedeCBC() {
            super(new vh.c(new qh.p()), 8);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECIESwithSHA256 extends ECIES {
        public ECIESwithSHA256() {
            super(a.d(), a.d());
        }
    }

    /* loaded from: classes3.dex */
    public static class ECIESwithSHA256andAESCBC extends ECIESwithCipher {
        public ECIESwithSHA256andAESCBC() {
            super(new vh.c(new qh.a()), 16, a.d(), a.d());
        }
    }

    /* loaded from: classes3.dex */
    public static class ECIESwithSHA256andDESedeCBC extends ECIESwithCipher {
        public ECIESwithSHA256andDESedeCBC() {
            super(new vh.c(new qh.p()), 8, a.d(), a.d());
        }
    }

    /* loaded from: classes3.dex */
    public static class ECIESwithSHA384 extends ECIES {
        public ECIESwithSHA384() {
            super(a.e(), a.e());
        }
    }

    /* loaded from: classes3.dex */
    public static class ECIESwithSHA384andAESCBC extends ECIESwithCipher {
        public ECIESwithSHA384andAESCBC() {
            super(new vh.c(new qh.a()), 16, a.e(), a.e());
        }
    }

    /* loaded from: classes3.dex */
    public static class ECIESwithSHA384andDESedeCBC extends ECIESwithCipher {
        public ECIESwithSHA384andDESedeCBC() {
            super(new vh.c(new qh.p()), 8, a.e(), a.e());
        }
    }

    /* loaded from: classes3.dex */
    public static class ECIESwithSHA512 extends ECIES {
        public ECIESwithSHA512() {
            super(a.j(), a.j());
        }
    }

    /* loaded from: classes3.dex */
    public static class ECIESwithSHA512andAESCBC extends ECIESwithCipher {
        public ECIESwithSHA512andAESCBC() {
            super(new vh.c(new qh.a()), 16, a.j(), a.j());
        }
    }

    /* loaded from: classes3.dex */
    public static class ECIESwithSHA512andDESedeCBC extends ECIESwithCipher {
        public ECIESwithSHA512andDESedeCBC() {
            super(new vh.c(new qh.p()), 8, a.j(), a.j());
        }
    }

    public IESCipher(c0 c0Var) {
        this.helper = new ni.a();
        this.state = -1;
        this.buffer = new ByteArrayOutputStream();
        this.engineParam = null;
        this.engineSpec = null;
        this.dhaesMode = false;
        this.otherKeyParameter = null;
        this.engine = c0Var;
        this.ivLength = 0;
    }

    public IESCipher(c0 c0Var, int i10) {
        this.helper = new ni.a();
        this.state = -1;
        this.buffer = new ByteArrayOutputStream();
        this.engineParam = null;
        this.engineSpec = null;
        this.dhaesMode = false;
        this.otherKeyParameter = null;
        this.engine = c0Var;
        this.ivLength = i10;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        byte[] engineDoFinal = engineDoFinal(bArr, i10, i11);
        System.arraycopy(engineDoFinal, 0, bArr2, i12, engineDoFinal.length);
        return engineDoFinal.length;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i10, int i11) {
        if (i11 != 0) {
            this.buffer.write(bArr, i10, i11);
        }
        byte[] byteArray = this.buffer.toByteArray();
        this.buffer.reset();
        i y0Var = new y0(this.engineSpec.b(), this.engineSpec.c(), this.engineSpec.d(), this.engineSpec.a());
        if (this.engineSpec.e() != null) {
            y0Var = new f1(y0Var, this.engineSpec.e());
        }
        y b10 = ((b0) this.key).b();
        b bVar = this.otherKeyParameter;
        if (bVar != null) {
            try {
                int i12 = this.state;
                if (i12 != 1 && i12 != 3) {
                    this.engine.i(false, this.key, bVar, y0Var);
                    return this.engine.j(byteArray, 0, byteArray.length);
                }
                this.engine.i(true, bVar, this.key, y0Var);
                return this.engine.j(byteArray, 0, byteArray.length);
            } catch (Exception e10) {
                throw new BadBlockException("unable to process block", e10);
            }
        }
        int i13 = this.state;
        if (i13 != 1 && i13 != 3) {
            if (i13 != 2 && i13 != 4) {
                throw new IllegalStateException("cipher not initialised");
            }
            try {
                this.engine.g(this.key, y0Var, new ai.b(b10));
                return this.engine.j(byteArray, 0, byteArray.length);
            } catch (u e11) {
                throw new BadBlockException("unable to process block", e11);
            }
        }
        l lVar = new l();
        lVar.c(new a0(b10, this.random));
        final boolean f10 = this.engineSpec.f();
        try {
            this.engine.h(this.key, y0Var, new q(lVar, new v() { // from class: org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher.1
                @Override // org.bouncycastle.crypto.v
                public byte[] getEncoded(b bVar2) {
                    return ((e0) bVar2).c().l(f10);
                }
            }));
            return this.engine.j(byteArray, 0, byteArray.length);
        } catch (Exception e12) {
            throw new BadBlockException("unable to process block", e12);
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        if (this.engine.d() != null) {
            return this.engine.d().b();
        }
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        p pVar = this.engineSpec;
        if (pVar != null) {
            return pVar.e();
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof qi.a) {
            return ((qi.a) key).getParameters().a().t();
        }
        throw new IllegalArgumentException("not an EC key");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i10) {
        f fVar;
        if (this.key != null) {
            int macSize = this.engine.f().getMacSize();
            int t10 = this.otherKeyParameter == null ? ((((b0) this.key).b().a().t() + 7) / 8) * 2 : 0;
            int size = this.buffer.size() + i10;
            if (this.engine.d() != null) {
                int i11 = this.state;
                if (i11 == 1 || i11 == 3) {
                    fVar = this.engine.d();
                } else if (i11 != 2 && i11 != 4) {
                    throw new IllegalStateException("cipher not initialised");
                } else {
                    fVar = this.engine.d();
                    size = (size - macSize) - t10;
                }
                size = fVar.c(size);
            }
            int i12 = this.state;
            if (i12 == 1 || i12 == 3) {
                return macSize + t10 + size;
            }
            if (i12 != 2 && i12 != 4) {
                throw new IllegalStateException("cipher not initialised");
            }
            return size;
        }
        throw new IllegalStateException("cipher not initialised");
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParam == null && this.engineSpec != null) {
            try {
                AlgorithmParameters f10 = this.helper.f("IES");
                this.engineParam = f10;
                f10.init(this.engineSpec);
            } catch (Exception e10) {
                throw new RuntimeException(e10.toString());
            }
        }
        return this.engineParam;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(p.class);
            } catch (Exception e10) {
                throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + e10.toString());
            }
        } else {
            parameterSpec = null;
        }
        this.engineParam = algorithmParameters;
        engineInit(i10, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i10, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new IllegalArgumentException("cannot handle supplied parameter spec: " + e10.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        p pVar;
        b bVar;
        PrivateKey Y;
        byte[] bArr = null;
        this.otherKeyParameter = null;
        if (algorithmParameterSpec == null) {
            int i11 = this.ivLength;
            if (i11 != 0 && i10 == 1) {
                bArr = new byte[i11];
                secureRandom.nextBytes(bArr);
            }
            pVar = IESUtil.guessParameterSpec(this.engine.d(), bArr);
        } else if (!(algorithmParameterSpec instanceof p)) {
            throw new InvalidAlgorithmParameterException("must be passed IES parameters");
        } else {
            pVar = (p) algorithmParameterSpec;
        }
        this.engineSpec = pVar;
        byte[] e10 = this.engineSpec.e();
        int i12 = this.ivLength;
        if (i12 != 0 && (e10 == null || e10.length != i12)) {
            throw new InvalidAlgorithmParameterException("NONCE in IES Parameters needs to be " + this.ivLength + " bytes long");
        }
        if (i10 == 1 || i10 == 3) {
            if (!(key instanceof PublicKey)) {
                if (!(key instanceof k)) {
                    throw new InvalidKeyException("must be passed recipient's public EC key for encryption");
                }
                k kVar = (k) key;
                this.key = ECUtils.generatePublicKeyParameter(kVar.E());
                this.otherKeyParameter = ECUtil.generatePrivateKeyParameter(kVar.Y());
                this.random = secureRandom;
                this.state = i10;
                this.buffer.reset();
            }
            bVar = ECUtils.generatePublicKeyParameter((PublicKey) key);
        } else if (i10 != 2 && i10 != 4) {
            throw new InvalidKeyException("must be passed EC key");
        } else {
            if (key instanceof PrivateKey) {
                Y = (PrivateKey) key;
            } else if (!(key instanceof k)) {
                throw new InvalidKeyException("must be passed recipient's private EC key for decryption");
            } else {
                k kVar2 = (k) key;
                this.otherKeyParameter = ECUtils.generatePublicKeyParameter(kVar2.E());
                Y = kVar2.Y();
            }
            bVar = ECUtil.generatePrivateKeyParameter(Y);
        }
        this.key = bVar;
        this.random = secureRandom;
        this.state = i10;
        this.buffer.reset();
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) {
        boolean z10;
        String k10 = ak.q.k(str);
        if (k10.equals("NONE")) {
            z10 = false;
        } else if (!k10.equals("DHAES")) {
            throw new IllegalArgumentException("can't support mode " + str);
        } else {
            z10 = true;
        }
        this.dhaesMode = z10;
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) {
        String k10 = ak.q.k(str);
        if (!k10.equals("NOPADDING") && !k10.equals("PKCS5PADDING") && !k10.equals("PKCS7PADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        this.buffer.write(bArr, i10, i11);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i10, int i11) {
        this.buffer.write(bArr, i10, i11);
        return null;
    }
}
