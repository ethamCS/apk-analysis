package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import lh.i;
import lh.j;
import lh.k;
import mh.a;
import mi.e;
import mi.u;
import org.bouncycastle.crypto.d0;
import org.bouncycastle.crypto.p;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import sh.t;
import zh.b;
import zh.s1;
import zh.v1;
import zh.x1;
import zh.y1;
/* loaded from: classes3.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private d0 agreement;
    private e dhuSpec;
    private byte[] result;

    /* loaded from: classes3.dex */
    public static final class X25519 extends KeyAgreementSpi {
        public X25519() {
            super("X25519");
        }
    }

    /* loaded from: classes3.dex */
    public static class X25519UwithSHA256CKDF extends KeyAgreementSpi {
        public X25519UwithSHA256CKDF() {
            super("X25519UwithSHA256CKDF", new a(ei.a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class X25519UwithSHA256KDF extends KeyAgreementSpi {
        public X25519UwithSHA256KDF() {
            super("X25519UwithSHA256KDF", new t(ei.a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class X25519withSHA256CKDF extends KeyAgreementSpi {
        public X25519withSHA256CKDF() {
            super("X25519withSHA256CKDF", new a(ei.a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class X25519withSHA256KDF extends KeyAgreementSpi {
        public X25519withSHA256KDF() {
            super("X25519withSHA256KDF", new t(ei.a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class X25519withSHA384CKDF extends KeyAgreementSpi {
        public X25519withSHA384CKDF() {
            super("X25519withSHA384CKDF", new a(ei.a.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static class X25519withSHA512CKDF extends KeyAgreementSpi {
        public X25519withSHA512CKDF() {
            super("X25519withSHA512CKDF", new a(ei.a.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class X448 extends KeyAgreementSpi {
        public X448() {
            super("X448");
        }
    }

    /* loaded from: classes3.dex */
    public static class X448UwithSHA512CKDF extends KeyAgreementSpi {
        public X448UwithSHA512CKDF() {
            super("X448UwithSHA512CKDF", new a(ei.a.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static class X448UwithSHA512KDF extends KeyAgreementSpi {
        public X448UwithSHA512KDF() {
            super("X448UwithSHA512KDF", new t(ei.a.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class X448withSHA256CKDF extends KeyAgreementSpi {
        public X448withSHA256CKDF() {
            super("X448withSHA256CKDF", new a(ei.a.d()));
        }
    }

    /* loaded from: classes3.dex */
    public static class X448withSHA384CKDF extends KeyAgreementSpi {
        public X448withSHA384CKDF() {
            super("X448withSHA384CKDF", new a(ei.a.e()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class X448withSHA512CKDF extends KeyAgreementSpi {
        public X448withSHA512CKDF() {
            super("X448withSHA512CKDF", new a(ei.a.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class X448withSHA512KDF extends KeyAgreementSpi {
        public X448withSHA512KDF() {
            super("X448withSHA512KDF", new t(ei.a.j()));
        }
    }

    /* loaded from: classes3.dex */
    public static final class XDH extends KeyAgreementSpi {
        public XDH() {
            super("XDH");
        }
    }

    KeyAgreementSpi(String str) {
        super(str, null);
    }

    KeyAgreementSpi(String str, p pVar) {
        super(str, pVar);
    }

    private d0 getAgreement(String str) {
        if (this.kaAlgorithm.equals("XDH") || this.kaAlgorithm.startsWith(str)) {
            int indexOf = this.kaAlgorithm.indexOf(85);
            boolean startsWith = str.startsWith("X448");
            return indexOf > 0 ? startsWith ? new k(new j()) : new k(new i()) : startsWith ? new j() : new i();
        }
        throw new InvalidKeyException("inappropriate key for " + this.kaAlgorithm);
    }

    private static b getLwXDHKeyPrivate(Key key) {
        if (key instanceof BCXDHPrivateKey) {
            return ((BCXDHPrivateKey) key).engineGetKeyParameters();
        }
        throw new InvalidKeyException("cannot identify XDH private key");
    }

    private b getLwXDHKeyPublic(Key key) {
        if (key instanceof BCXDHPublicKey) {
            return ((BCXDHPublicKey) key).engineGetKeyParameters();
        }
        throw new InvalidKeyException("cannot identify XDH public key");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected byte[] calcSecret() {
        return this.result;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z10) {
        if (this.agreement == null) {
            throw new IllegalStateException(this.kaAlgorithm + " not initialised.");
        } else if (!z10) {
            throw new IllegalStateException(this.kaAlgorithm + " can only be between two parties.");
        } else {
            b lwXDHKeyPublic = getLwXDHKeyPublic(key);
            byte[] bArr = new byte[this.agreement.b()];
            this.result = bArr;
            e eVar = this.dhuSpec;
            if (eVar != null) {
                this.agreement.a(new y1(lwXDHKeyPublic, ((BCXDHPublicKey) eVar.c()).engineGetKeyParameters()), this.result, 0);
                return null;
            }
            this.agreement.a(lwXDHKeyPublic, bArr, 0);
            return null;
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) {
        String str;
        b lwXDHKeyPrivate = getLwXDHKeyPrivate(key);
        if (lwXDHKeyPrivate instanceof s1) {
            str = "X25519";
        } else if (!(lwXDHKeyPrivate instanceof v1)) {
            throw new IllegalStateException("unsupported private key type");
        } else {
            str = "X448";
        }
        this.agreement = getAgreement(str);
        this.agreement.init(lwXDHKeyPrivate);
        if (this.kdf != null) {
            this.ukmParameters = new byte[0];
        } else {
            this.ukmParameters = null;
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        String str;
        b lwXDHKeyPrivate = getLwXDHKeyPrivate(key);
        if (lwXDHKeyPrivate instanceof s1) {
            str = "X25519";
        } else if (!(lwXDHKeyPrivate instanceof v1)) {
            throw new IllegalStateException("unsupported private key type");
        } else {
            str = "X448";
        }
        this.agreement = getAgreement(str);
        this.ukmParameters = null;
        if (!(algorithmParameterSpec instanceof e)) {
            this.agreement.init(lwXDHKeyPrivate);
            if (!(algorithmParameterSpec instanceof u)) {
                throw new InvalidAlgorithmParameterException("unknown ParameterSpec");
            }
            if (this.kdf == null) {
                throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            this.ukmParameters = ((u) algorithmParameterSpec).a();
        } else if (this.kaAlgorithm.indexOf(85) < 0) {
            throw new InvalidAlgorithmParameterException("agreement algorithm not DHU based");
        } else {
            e eVar = (e) algorithmParameterSpec;
            this.dhuSpec = eVar;
            this.ukmParameters = eVar.d();
            this.agreement.init(new x1(lwXDHKeyPrivate, ((BCXDHPrivateKey) this.dhuSpec.a()).engineGetKeyParameters(), ((BCXDHPublicKey) this.dhuSpec.b()).engineGetKeyParameters()));
        }
        if (this.kdf == null || this.ukmParameters != null) {
            return;
        }
        this.ukmParameters = new byte[0];
    }
}
