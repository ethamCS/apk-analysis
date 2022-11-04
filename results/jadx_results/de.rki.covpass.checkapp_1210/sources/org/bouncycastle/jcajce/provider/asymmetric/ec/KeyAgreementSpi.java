package org.bouncycastle.jcajce.provider.asymmetric.ec;

import ei.a;
import ih.n;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import lh.c;
import lh.d;
import lh.f;
import mi.e;
import mi.l;
import mi.u;
import nh.s;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.p;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import qi.b;
import qi.m;
import sh.t;
import zh.c1;
import zh.d0;
import zh.d1;
import zh.e0;
import zh.w;
import zh.x;
import zh.y;
/* loaded from: classes3.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private static final n converter = new n();
    private Object agreement;
    private e dheParameters;
    private String kaAlgorithm;
    private l mqvParameters;
    private y parameters;
    private byte[] result;

    /* loaded from: classes3.dex */
    public static class CDHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA1KDFAndSharedInfo() {
            super("ECCDHwithSHA1KDF", new d(), new t(a.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class CDHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA224KDFAndSharedInfo() {
            super("ECCDHwithSHA224KDF", new d(), new t(a.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class CDHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA256KDFAndSharedInfo() {
            super("ECCDHwithSHA256KDF", new d(), new t(a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class CDHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA384KDFAndSharedInfo() {
            super("ECCDHwithSHA384KDF", new d(), new t(a.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class CDHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA512KDFAndSharedInfo() {
            super("ECCDHwithSHA512KDF", new d(), new t(a.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DH extends KeyAgreementSpi {
        public DH() {
            super("ECDH", new c(), (p) null);
        }
    }

    /* loaded from: classes3.dex */
    public static class DHC extends KeyAgreementSpi {
        public DHC() {
            super("ECDHC", new d(), (p) null);
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUC extends KeyAgreementSpi {
        public DHUC() {
            super("ECCDHU", new lh.e(), (p) null);
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA1CKDF extends KeyAgreementSpi {
        public DHUwithSHA1CKDF() {
            super("ECCDHUwithSHA1CKDF", new lh.e(), new mh.a(a.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA1KDF extends KeyAgreementSpi {
        public DHUwithSHA1KDF() {
            super("ECCDHUwithSHA1KDF", new lh.e(), new t(a.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA224CKDF extends KeyAgreementSpi {
        public DHUwithSHA224CKDF() {
            super("ECCDHUwithSHA224CKDF", new lh.e(), new mh.a(a.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA224KDF extends KeyAgreementSpi {
        public DHUwithSHA224KDF() {
            super("ECCDHUwithSHA224KDF", new lh.e(), new t(a.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA256CKDF extends KeyAgreementSpi {
        public DHUwithSHA256CKDF() {
            super("ECCDHUwithSHA256CKDF", new lh.e(), new mh.a(a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA256KDF extends KeyAgreementSpi {
        public DHUwithSHA256KDF() {
            super("ECCDHUwithSHA256KDF", new lh.e(), new t(a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA384CKDF extends KeyAgreementSpi {
        public DHUwithSHA384CKDF() {
            super("ECCDHUwithSHA384CKDF", new lh.e(), new mh.a(a.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA384KDF extends KeyAgreementSpi {
        public DHUwithSHA384KDF() {
            super("ECCDHUwithSHA384KDF", new lh.e(), new t(a.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA512CKDF extends KeyAgreementSpi {
        public DHUwithSHA512CKDF() {
            super("ECCDHUwithSHA512CKDF", new lh.e(), new mh.a(a.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHUwithSHA512KDF extends KeyAgreementSpi {
        public DHUwithSHA512KDF() {
            super("ECCDHUwithSHA512KDF", new lh.e(), new t(a.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA1CKDF extends KeyAgreementSpi {
        public DHwithSHA1CKDF() {
            super("ECDHwithSHA1CKDF", new d(), new mh.a(a.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA1KDF extends KeyAgreementSpi {
        public DHwithSHA1KDF() {
            super("ECDHwithSHA1KDF", new c(), new t(a.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA1KDFAndSharedInfo() {
            super("ECDHwithSHA1KDF", new c(), new t(a.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA224KDFAndSharedInfo() {
            super("ECDHwithSHA224KDF", new c(), new t(a.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA256CKDF extends KeyAgreementSpi {
        public DHwithSHA256CKDF() {
            super("ECDHwithSHA256CKDF", new d(), new mh.a(a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA256KDFAndSharedInfo() {
            super("ECDHwithSHA256KDF", new c(), new t(a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA384CKDF extends KeyAgreementSpi {
        public DHwithSHA384CKDF() {
            super("ECDHwithSHA384CKDF", new d(), new mh.a(a.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA384KDFAndSharedInfo() {
            super("ECDHwithSHA384KDF", new c(), new t(a.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA512CKDF extends KeyAgreementSpi {
        public DHwithSHA512CKDF() {
            super("ECDHwithSHA512CKDF", new d(), new mh.a(a.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class DHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA512KDFAndSharedInfo() {
            super("ECDHwithSHA512KDF", new c(), new t(a.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECKAEGwithRIPEMD160KDF extends KeyAgreementSpi {
        public ECKAEGwithRIPEMD160KDF() {
            super("ECKAEGwithRIPEMD160KDF", new c(), new t(new s()));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECKAEGwithSHA1KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA1KDF() {
            super("ECKAEGwithSHA1KDF", new c(), new t(a.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECKAEGwithSHA224KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA224KDF() {
            super("ECKAEGwithSHA224KDF", new c(), new t(a.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECKAEGwithSHA256KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA256KDF() {
            super("ECKAEGwithSHA256KDF", new c(), new t(a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECKAEGwithSHA384KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA384KDF() {
            super("ECKAEGwithSHA384KDF", new c(), new t(a.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECKAEGwithSHA512KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA512KDF() {
            super("ECKAEGwithSHA512KDF", new c(), new t(a.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQV extends KeyAgreementSpi {
        public MQV() {
            super("ECMQV", new f(), (p) null);
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA1CKDF extends KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            super("ECMQVwithSHA1CKDF", new f(), new mh.a(a.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA1KDF extends KeyAgreementSpi {
        public MQVwithSHA1KDF() {
            super("ECMQVwithSHA1KDF", new f(), new t(a.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA1KDFAndSharedInfo() {
            super("ECMQVwithSHA1KDF", new f(), new t(a.b()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA224CKDF extends KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            super("ECMQVwithSHA224CKDF", new f(), new mh.a(a.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA224KDF extends KeyAgreementSpi {
        public MQVwithSHA224KDF() {
            super("ECMQVwithSHA224KDF", new f(), new t(a.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA224KDFAndSharedInfo() {
            super("ECMQVwithSHA224KDF", new f(), new t(a.c()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA256CKDF extends KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            super("ECMQVwithSHA256CKDF", new f(), new mh.a(a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA256KDF extends KeyAgreementSpi {
        public MQVwithSHA256KDF() {
            super("ECMQVwithSHA256KDF", new f(), new t(a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA256KDFAndSharedInfo() {
            super("ECMQVwithSHA256KDF", new f(), new t(a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA384CKDF extends KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            super("ECMQVwithSHA384CKDF", new f(), new mh.a(a.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA384KDF extends KeyAgreementSpi {
        public MQVwithSHA384KDF() {
            super("ECMQVwithSHA384KDF", new f(), new t(a.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA384KDFAndSharedInfo() {
            super("ECMQVwithSHA384KDF", new f(), new t(a.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA512CKDF extends KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            super("ECMQVwithSHA512CKDF", new f(), new mh.a(a.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA512KDF extends KeyAgreementSpi {
        public MQVwithSHA512KDF() {
            super("ECMQVwithSHA512KDF", new f(), new t(a.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class MQVwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA512KDFAndSharedInfo() {
            super("ECMQVwithSHA512KDF", new f(), new t(a.j()));
        }
    }

    protected KeyAgreementSpi(String str, lh.e eVar, p pVar) {
        super(str, pVar);
        this.kaAlgorithm = str;
        this.agreement = eVar;
    }

    protected KeyAgreementSpi(String str, org.bouncycastle.crypto.d dVar, p pVar) {
        super(str, pVar);
        this.kaAlgorithm = str;
        this.agreement = dVar;
    }

    private static String getSimpleName(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    private void initFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        d0 d0Var;
        d0 d0Var2;
        Object obj = this.agreement;
        byte[] bArr = null;
        r4 = null;
        e0 e0Var = null;
        e0 e0Var2 = null;
        if (obj instanceof f) {
            this.mqvParameters = null;
            boolean z10 = key instanceof qi.l;
            if (!z10 && !(algorithmParameterSpec instanceof l)) {
                throw new InvalidAlgorithmParameterException(this.kaAlgorithm + " key agreement requires " + getSimpleName(l.class) + " for initialisation");
            }
            if (z10) {
                qi.l lVar = (qi.l) key;
                d0Var = (d0) ECUtil.generatePrivateKeyParameter(lVar.J());
                d0Var2 = (d0) ECUtil.generatePrivateKeyParameter(lVar.X());
                if (lVar.O() != null) {
                    e0Var = (e0) ECUtils.generatePublicKeyParameter(lVar.O());
                }
            } else {
                l lVar2 = (l) algorithmParameterSpec;
                d0 d0Var3 = (d0) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
                d0Var2 = (d0) ECUtil.generatePrivateKeyParameter(lVar2.a());
                if (lVar2.b() != null) {
                    e0Var = (e0) ECUtils.generatePublicKeyParameter(lVar2.b());
                }
                this.mqvParameters = lVar2;
                this.ukmParameters = lVar2.d();
                d0Var = d0Var3;
            }
            c1 c1Var = new c1(d0Var, d0Var2, e0Var);
            this.parameters = d0Var.b();
            ((f) this.agreement).init(c1Var);
        } else if (algorithmParameterSpec instanceof e) {
            if (!(obj instanceof lh.e)) {
                throw new InvalidAlgorithmParameterException(this.kaAlgorithm + " key agreement cannot be used with " + getSimpleName(e.class));
            }
            e eVar = (e) algorithmParameterSpec;
            d0 d0Var4 = (d0) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
            d0 d0Var5 = (d0) ECUtil.generatePrivateKeyParameter(eVar.a());
            if (eVar.b() != null) {
                e0Var2 = (e0) ECUtils.generatePublicKeyParameter(eVar.b());
            }
            this.dheParameters = eVar;
            this.ukmParameters = eVar.d();
            w wVar = new w(d0Var4, d0Var5, e0Var2);
            this.parameters = d0Var4.b();
            ((lh.e) this.agreement).c(wVar);
        } else if (!(key instanceof PrivateKey)) {
            throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + getSimpleName(b.class) + " for initialisation");
        } else if (this.kdf == null && (algorithmParameterSpec instanceof u)) {
            throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
        } else {
            d0 d0Var6 = (d0) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
            this.parameters = d0Var6.b();
            if (algorithmParameterSpec instanceof u) {
                bArr = ((u) algorithmParameterSpec).a();
            }
            this.ukmParameters = bArr;
            ((org.bouncycastle.crypto.d) this.agreement).init(d0Var6);
        }
    }

    protected byte[] bigIntToBytes(BigInteger bigInteger) {
        n nVar = converter;
        return nVar.c(bigInteger, nVar.a(this.parameters.a()));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected byte[] calcSecret() {
        return ak.a.h(this.result);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z10) {
        i iVar;
        if (this.parameters == null) {
            throw new IllegalStateException(this.kaAlgorithm + " not initialised.");
        } else if (!z10) {
            throw new IllegalStateException(this.kaAlgorithm + " can only be between two parties.");
        } else {
            Object obj = this.agreement;
            if (obj instanceof f) {
                if (!(key instanceof m)) {
                    iVar = new d1((e0) ECUtils.generatePublicKeyParameter((PublicKey) key), (e0) ECUtils.generatePublicKeyParameter(this.mqvParameters.c()));
                } else {
                    m mVar = (m) key;
                    iVar = new d1((e0) ECUtils.generatePublicKeyParameter(mVar.C()), (e0) ECUtils.generatePublicKeyParameter(mVar.S()));
                }
            } else if (obj instanceof lh.e) {
                iVar = new x((e0) ECUtils.generatePublicKeyParameter((PublicKey) key), (e0) ECUtils.generatePublicKeyParameter(this.dheParameters.c()));
            } else if (!(key instanceof PublicKey)) {
                throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + getSimpleName(qi.c.class) + " for doPhase");
            } else {
                iVar = ECUtils.generatePublicKeyParameter((PublicKey) key);
            }
            try {
                Object obj2 = this.agreement;
                if (obj2 instanceof org.bouncycastle.crypto.d) {
                    this.result = bigIntToBytes(((org.bouncycastle.crypto.d) obj2).b(iVar));
                    return null;
                }
                this.result = ((lh.e) obj2).a(iVar);
                return null;
            } catch (Exception e10) {
                throw new InvalidKeyException("calculation failed: " + e10.getMessage()) { // from class: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi.1
                    @Override // java.lang.Throwable
                    public Throwable getCause() {
                        return e10;
                    }
                };
            }
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) {
        try {
            initFromKey(key, null);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new InvalidKeyException(e10.getMessage());
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec == null || (algorithmParameterSpec instanceof l) || (algorithmParameterSpec instanceof u) || (algorithmParameterSpec instanceof e)) {
            initFromKey(key, algorithmParameterSpec);
            return;
        }
        throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
    }
}
