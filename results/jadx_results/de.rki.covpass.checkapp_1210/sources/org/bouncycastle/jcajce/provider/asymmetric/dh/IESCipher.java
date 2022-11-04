package org.bouncycastle.jcajce.provider.asymmetric.dh;

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
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import lh.a;
import ni.c;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.u;
import org.bouncycastle.crypto.v;
import org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import qh.c0;
import ri.p;
import sh.q;
import sh.t;
import uh.g;
import yh.e;
import zh.b;
import zh.f;
import zh.f1;
import zh.k;
import zh.y0;
/* loaded from: classes3.dex */
public class IESCipher extends CipherSpi {
    private ByteArrayOutputStream buffer;
    private boolean dhaesMode;
    private c0 engine;
    private AlgorithmParameters engineParam;
    private p engineSpec;
    private final c helper;
    private final int ivLength;
    private b key;
    private b otherKeyParameter;
    private SecureRandom random;
    private int state;

    /* loaded from: classes3.dex */
    public static class IES extends IESCipher {
        public IES() {
            super(new c0(new a(), new t(ei.a.b()), new g(ei.a.b())));
        }
    }

    /* loaded from: classes3.dex */
    public static class IESwithAESCBC extends IESCipher {
        public IESwithAESCBC() {
            super(new c0(new a(), new t(ei.a.b()), new g(ei.a.b()), new e(new vh.c(new qh.a()))), 16);
        }
    }

    /* loaded from: classes3.dex */
    public static class IESwithDESedeCBC extends IESCipher {
        public IESwithDESedeCBC() {
            super(new c0(new a(), new t(ei.a.b()), new g(ei.a.b()), new e(new vh.c(new qh.p()))), 8);
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
        zh.i b10 = ((f) this.key).b();
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
        if (i13 == 1 || i13 == 3) {
            sh.f fVar = new sh.f();
            fVar.b(new zh.e(this.random, b10));
            try {
                this.engine.h(this.key, y0Var, new q(fVar, new v() { // from class: org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher.1
                    @Override // org.bouncycastle.crypto.v
                    public byte[] getEncoded(b bVar2) {
                        int bitLength = (((f) bVar2).b().f().bitLength() + 7) / 8;
                        byte[] bArr2 = new byte[bitLength];
                        byte[] c10 = ak.b.c(((k) bVar2).c());
                        if (c10.length <= bitLength) {
                            System.arraycopy(c10, 0, bArr2, bitLength - c10.length, c10.length);
                            return bArr2;
                        }
                        throw new IllegalArgumentException("Senders's public key longer than expected.");
                    }
                }));
                return this.engine.j(byteArray, 0, byteArray.length);
            } catch (Exception e11) {
                throw new BadBlockException("unable to process block", e11);
            }
        } else if (i13 != 2 && i13 != 4) {
            throw new IllegalStateException("IESCipher not initialised");
        } else {
            try {
                c0 c0Var = this.engine;
                b bVar2 = this.key;
                c0Var.g(bVar2, y0Var, new ai.a(((f) bVar2).b()));
                return this.engine.j(byteArray, 0, byteArray.length);
            } catch (u e12) {
                throw new BadBlockException("unable to process block", e12);
            }
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
        if (key instanceof DHKey) {
            return ((DHKey) key).getParams().getP().bitLength();
        }
        throw new IllegalArgumentException("not a DH key");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i10) {
        int size;
        org.bouncycastle.crypto.f fVar;
        if (this.key != null) {
            int macSize = this.engine.f().getMacSize();
            int bitLength = this.otherKeyParameter == null ? (((((f) this.key).b().f().bitLength() + 7) * 2) / 8) + 1 : 0;
            if (this.engine.d() != null) {
                int i11 = this.state;
                if (i11 == 1 || i11 == 3) {
                    fVar = this.engine.d();
                } else if (i11 != 2 && i11 != 4) {
                    throw new IllegalStateException("cipher not initialised");
                } else {
                    fVar = this.engine.d();
                    i10 = (i10 - macSize) - bitLength;
                }
                i10 = fVar.c(i10);
            }
            int i12 = this.state;
            if (i12 == 1 || i12 == 3) {
                size = this.buffer.size() + macSize + bitLength;
            } else if (i12 != 2 && i12 != 4) {
                throw new IllegalStateException("IESCipher not initialised");
            } else {
                size = (this.buffer.size() - macSize) - bitLength;
            }
            return size + i10;
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
        if (algorithmParameterSpec == null) {
            byte[] bArr = null;
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
            if (!(key instanceof DHPublicKey)) {
                if (!(key instanceof qi.k)) {
                    throw new InvalidKeyException("must be passed recipient's public DH key for encryption");
                }
                qi.k kVar = (qi.k) key;
                this.key = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePublicKeyParameter(kVar.E());
                this.otherKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePrivateKeyParameter(kVar.Y());
                this.random = secureRandom;
                this.state = i10;
                this.buffer.reset();
            }
            bVar = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePublicKeyParameter((PublicKey) key);
        } else if (i10 != 2 && i10 != 4) {
            throw new InvalidKeyException("must be passed EC key");
        } else {
            if (key instanceof DHPrivateKey) {
                Y = (PrivateKey) key;
            } else if (!(key instanceof qi.k)) {
                throw new InvalidKeyException("must be passed recipient's private DH key for decryption");
            } else {
                qi.k kVar2 = (qi.k) key;
                this.otherKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePublicKeyParameter(kVar2.E());
                Y = kVar2.Y();
            }
            bVar = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePrivateKeyParameter(Y);
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
