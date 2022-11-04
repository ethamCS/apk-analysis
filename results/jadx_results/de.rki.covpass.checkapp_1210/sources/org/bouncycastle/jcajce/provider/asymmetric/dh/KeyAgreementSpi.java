package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import lh.b;
import lh.h;
import mh.a;
import mh.c;
import mi.e;
import mi.l;
import mi.u;
import org.bouncycastle.crypto.d;
import org.bouncycastle.crypto.p;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import sh.t;
import zh.g;
import zh.i;
import zh.j;
import zh.k;
import zh.m;
/* loaded from: classes3.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private e dheParameters;

    /* renamed from: g */
    private BigInteger f18672g;
    private final d mqvAgreement;
    private l mqvParameters;

    /* renamed from: p */
    private BigInteger f18673p;
    private byte[] result;
    private final b unifiedAgreement;

    /* renamed from: x */
    private BigInteger f18674x;

    /* loaded from: classes3.dex */
    public static class DHUwithSHA1CKDF extends KeyAgreementSpi {
        public DHUwithSHA1CKDF() {
            super("DHUwithSHA1CKDF", new b(), new a(ei.a.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA1KDF extends KeyAgreementSpi {
        public DHUwithSHA1KDF() {
            super("DHUwithSHA1KDF", new b(), new t(ei.a.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA224CKDF extends KeyAgreementSpi {
        public DHUwithSHA224CKDF() {
            super("DHUwithSHA224CKDF", new b(), new a(ei.a.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA224KDF extends KeyAgreementSpi {
        public DHUwithSHA224KDF() {
            super("DHUwithSHA224KDF", new b(), new t(ei.a.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA256CKDF extends KeyAgreementSpi {
        public DHUwithSHA256CKDF() {
            super("DHUwithSHA256CKDF", new b(), new a(ei.a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA256KDF extends KeyAgreementSpi {
        public DHUwithSHA256KDF() {
            super("DHUwithSHA256KDF", new b(), new t(ei.a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA384CKDF extends KeyAgreementSpi {
        public DHUwithSHA384CKDF() {
            super("DHUwithSHA384CKDF", new b(), new a(ei.a.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA384KDF extends KeyAgreementSpi {
        public DHUwithSHA384KDF() {
            super("DHUwithSHA384KDF", new b(), new t(ei.a.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA512CKDF extends KeyAgreementSpi {
        public DHUwithSHA512CKDF() {
            super("DHUwithSHA512CKDF", new b(), new a(ei.a.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA512KDF extends KeyAgreementSpi {
        public DHUwithSHA512KDF() {
            super("DHUwithSHA512KDF", new b(), new t(ei.a.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithRFC2631KDF extends KeyAgreementSpi {
        public DHwithRFC2631KDF() {
            super("DHwithRFC2631KDF", new c(ei.a.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA1CKDF extends KeyAgreementSpi {
        public DHwithSHA1CKDF() {
            super("DHwithSHA1CKDF", new a(ei.a.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA1KDF extends KeyAgreementSpi {
        public DHwithSHA1KDF() {
            super("DHwithSHA1CKDF", new t(ei.a.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA224CKDF extends KeyAgreementSpi {
        public DHwithSHA224CKDF() {
            super("DHwithSHA224CKDF", new a(ei.a.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA224KDF extends KeyAgreementSpi {
        public DHwithSHA224KDF() {
            super("DHwithSHA224CKDF", new t(ei.a.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA256CKDF extends KeyAgreementSpi {
        public DHwithSHA256CKDF() {
            super("DHwithSHA256CKDF", new a(ei.a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA256KDF extends KeyAgreementSpi {
        public DHwithSHA256KDF() {
            super("DHwithSHA256CKDF", new t(ei.a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA384CKDF extends KeyAgreementSpi {
        public DHwithSHA384CKDF() {
            super("DHwithSHA384CKDF", new a(ei.a.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA384KDF extends KeyAgreementSpi {
        public DHwithSHA384KDF() {
            super("DHwithSHA384KDF", new t(ei.a.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA512CKDF extends KeyAgreementSpi {
        public DHwithSHA512CKDF() {
            super("DHwithSHA512CKDF", new a(ei.a.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA512KDF extends KeyAgreementSpi {
        public DHwithSHA512KDF() {
            super("DHwithSHA512KDF", new t(ei.a.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA1CKDF extends KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            super("MQVwithSHA1CKDF", new h(), new a(ei.a.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA1KDF extends KeyAgreementSpi {
        public MQVwithSHA1KDF() {
            super("MQVwithSHA1KDF", new h(), new t(ei.a.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA224CKDF extends KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            super("MQVwithSHA224CKDF", new h(), new a(ei.a.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA224KDF extends KeyAgreementSpi {
        public MQVwithSHA224KDF() {
            super("MQVwithSHA224KDF", new h(), new t(ei.a.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA256CKDF extends KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            super("MQVwithSHA256CKDF", new h(), new a(ei.a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA256KDF extends KeyAgreementSpi {
        public MQVwithSHA256KDF() {
            super("MQVwithSHA256KDF", new h(), new t(ei.a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA384CKDF extends KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            super("MQVwithSHA384CKDF", new h(), new a(ei.a.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA384KDF extends KeyAgreementSpi {
        public MQVwithSHA384KDF() {
            super("MQVwithSHA384KDF", new h(), new t(ei.a.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA512CKDF extends KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            super("MQVwithSHA512CKDF", new h(), new a(ei.a.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA512KDF extends KeyAgreementSpi {
        public MQVwithSHA512KDF() {
            super("MQVwithSHA512KDF", new h(), new t(ei.a.j()));
        }
    }

    public KeyAgreementSpi() {
        this("Diffie-Hellman", null);
    }

    public KeyAgreementSpi(String str, b bVar, p pVar) {
        super(str, pVar);
        this.unifiedAgreement = bVar;
        this.mqvAgreement = null;
    }

    public KeyAgreementSpi(String str, d dVar, p pVar) {
        super(str, pVar);
        this.unifiedAgreement = null;
        this.mqvAgreement = dVar;
    }

    public KeyAgreementSpi(String str, p pVar) {
        super(str, pVar);
        this.unifiedAgreement = null;
        this.mqvAgreement = null;
    }

    private j generatePrivateKeyParameter(PrivateKey privateKey) {
        if (privateKey instanceof DHPrivateKey) {
            if (privateKey instanceof BCDHPrivateKey) {
                return ((BCDHPrivateKey) privateKey).engineGetKeyParameters();
            }
            DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
            DHParameterSpec params = dHPrivateKey.getParams();
            return new j(dHPrivateKey.getX(), new i(params.getP(), params.getG(), null, params.getL()));
        }
        throw new InvalidKeyException("private key not a DHPrivateKey");
    }

    private k generatePublicKeyParameter(PublicKey publicKey) {
        if (publicKey instanceof DHPublicKey) {
            if (publicKey instanceof BCDHPublicKey) {
                return ((BCDHPublicKey) publicKey).engineGetKeyParameters();
            }
            DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
            DHParameterSpec params = dHPublicKey.getParams();
            return params instanceof mi.b ? new k(dHPublicKey.getY(), ((mi.b) params).a()) : new k(dHPublicKey.getY(), new i(params.getP(), params.getG(), null, params.getL()));
        }
        throw new InvalidKeyException("public key not a DHPublicKey");
    }

    protected byte[] bigIntToBytes(BigInteger bigInteger) {
        int bitLength = (this.f18673p.bitLength() + 7) / 8;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == bitLength) {
            return byteArray;
        }
        if (byteArray[0] != 0 || byteArray.length != bitLength + 1) {
            byte[] bArr = new byte[bitLength];
            System.arraycopy(byteArray, 0, bArr, bitLength - byteArray.length, byteArray.length);
            return bArr;
        }
        int length = byteArray.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(byteArray, 1, bArr2, 0, length);
        return bArr2;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected byte[] calcSecret() {
        return this.result;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z10) {
        if (this.f18674x != null) {
            if (!(key instanceof DHPublicKey)) {
                throw new InvalidKeyException("DHKeyAgreement doPhase requires DHPublicKey");
            }
            DHPublicKey dHPublicKey = (DHPublicKey) key;
            if (!dHPublicKey.getParams().getG().equals(this.f18672g) || !dHPublicKey.getParams().getP().equals(this.f18673p)) {
                throw new InvalidKeyException("DHPublicKey not for this KeyAgreement!");
            }
            BigInteger y10 = dHPublicKey.getY();
            if (y10 != null && y10.compareTo(TWO) >= 0) {
                BigInteger bigInteger = this.f18673p;
                BigInteger bigInteger2 = ONE;
                if (y10.compareTo(bigInteger.subtract(bigInteger2)) < 0) {
                    if (this.unifiedAgreement != null) {
                        if (!z10) {
                            throw new IllegalStateException("unified Diffie-Hellman can use only two key pairs");
                        }
                        this.result = this.unifiedAgreement.a(new m(generatePublicKeyParameter((PublicKey) key), generatePublicKeyParameter(this.dheParameters.c())));
                        return null;
                    } else if (this.mqvAgreement != null) {
                        if (!z10) {
                            throw new IllegalStateException("MQV Diffie-Hellman can use only two key pairs");
                        }
                        this.result = bigIntToBytes(this.mqvAgreement.b(new zh.h(generatePublicKeyParameter((PublicKey) key), generatePublicKeyParameter(this.mqvParameters.c()))));
                        return null;
                    } else {
                        BigInteger modPow = y10.modPow(this.f18674x, this.f18673p);
                        if (modPow.compareTo(bigInteger2) == 0) {
                            throw new InvalidKeyException("Shared key can't be 1");
                        }
                        this.result = bigIntToBytes(modPow);
                        if (!z10) {
                            return new BCDHPublicKey(modPow, dHPublicKey.getParams());
                        }
                        return null;
                    }
                }
            }
            throw new InvalidKeyException("Invalid DH PublicKey");
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i10) {
        if (this.f18674x != null) {
            return super.engineGenerateSecret(bArr, i10);
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) {
        if (this.f18674x != null) {
            return str.equals("TlsPremasterSecret") ? new SecretKeySpec(BaseAgreementSpi.trimZeroes(this.result), str) : super.engineGenerateSecret(str);
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() {
        if (this.f18674x != null) {
            return super.engineGenerateSecret();
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) {
        if (key instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            this.f18673p = dHPrivateKey.getParams().getP();
            this.f18672g = dHPrivateKey.getParams().getG();
            BigInteger x10 = dHPrivateKey.getX();
            this.f18674x = x10;
            this.result = bigIntToBytes(x10);
            return;
        }
        throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey");
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        g gVar;
        d dVar;
        zh.l lVar;
        b bVar;
        if (key instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            if (algorithmParameterSpec == null) {
                this.f18673p = dHPrivateKey.getParams().getP();
                this.f18672g = dHPrivateKey.getParams().getG();
            } else if (algorithmParameterSpec instanceof DHParameterSpec) {
                DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
                this.f18673p = dHParameterSpec.getP();
                this.f18672g = dHParameterSpec.getG();
                this.dheParameters = null;
                this.ukmParameters = null;
            } else if (algorithmParameterSpec instanceof e) {
                if (this.unifiedAgreement == null) {
                    throw new InvalidAlgorithmParameterException("agreement algorithm not DHU based");
                }
                this.f18673p = dHPrivateKey.getParams().getP();
                this.f18672g = dHPrivateKey.getParams().getG();
                e eVar = (e) algorithmParameterSpec;
                this.dheParameters = eVar;
                this.ukmParameters = eVar.d();
                if (this.dheParameters.b() != null) {
                    bVar = this.unifiedAgreement;
                    lVar = new zh.l(generatePrivateKeyParameter(dHPrivateKey), generatePrivateKeyParameter(this.dheParameters.a()), generatePublicKeyParameter(this.dheParameters.b()));
                } else {
                    bVar = this.unifiedAgreement;
                    lVar = new zh.l(generatePrivateKeyParameter(dHPrivateKey), generatePrivateKeyParameter(this.dheParameters.a()));
                }
                bVar.c(lVar);
            } else if (algorithmParameterSpec instanceof l) {
                if (this.mqvAgreement == null) {
                    throw new InvalidAlgorithmParameterException("agreement algorithm not MQV based");
                }
                this.f18673p = dHPrivateKey.getParams().getP();
                this.f18672g = dHPrivateKey.getParams().getG();
                l lVar2 = (l) algorithmParameterSpec;
                this.mqvParameters = lVar2;
                this.ukmParameters = lVar2.d();
                if (this.mqvParameters.b() != null) {
                    dVar = this.mqvAgreement;
                    gVar = new g(generatePrivateKeyParameter(dHPrivateKey), generatePrivateKeyParameter(this.mqvParameters.a()), generatePublicKeyParameter(this.mqvParameters.b()));
                } else {
                    dVar = this.mqvAgreement;
                    gVar = new g(generatePrivateKeyParameter(dHPrivateKey), generatePrivateKeyParameter(this.mqvParameters.a()));
                }
                dVar.init(gVar);
            } else if (!(algorithmParameterSpec instanceof u)) {
                throw new InvalidAlgorithmParameterException("DHKeyAgreement only accepts DHParameterSpec");
            } else {
                if (this.kdf == null) {
                    throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
                }
                this.f18673p = dHPrivateKey.getParams().getP();
                this.f18672g = dHPrivateKey.getParams().getG();
                this.dheParameters = null;
                this.ukmParameters = ((u) algorithmParameterSpec).a();
            }
            BigInteger x10 = dHPrivateKey.getX();
            this.f18674x = x10;
            this.result = bigIntToBytes(x10);
            return;
        }
        throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey for initialisation");
    }
}
