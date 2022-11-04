package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import ih.n;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import lh.g;
import mi.u;
import nh.d;
import org.bouncycastle.crypto.p;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import qi.c;
import zh.b;
import zh.d0;
import zh.i1;
import zh.y;
/* loaded from: classes3.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private static final n converter = new n();
    private g agreement;
    private String kaAlgorithm;
    private y parameters;
    private byte[] result;

    /* loaded from: classes3.dex */
    public static class ECVKO extends KeyAgreementSpi {
        public ECVKO() {
            super("ECGOST3410", new g(new d()), null);
        }
    }

    protected KeyAgreementSpi(String str, g gVar, p pVar) {
        super(str, pVar);
        this.kaAlgorithm = str;
        this.agreement = gVar;
    }

    static b generatePublicKeyParameter(PublicKey publicKey) {
        return publicKey instanceof BCECPublicKey ? ((BCECGOST3410PublicKey) publicKey).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(publicKey);
    }

    private static String getSimpleName(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    private void initFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        if (key instanceof PrivateKey) {
            d0 d0Var = (d0) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
            this.parameters = d0Var.b();
            byte[] a10 = algorithmParameterSpec instanceof u ? ((u) algorithmParameterSpec).a() : null;
            this.ukmParameters = a10;
            this.agreement.c(new i1(d0Var, a10));
            return;
        }
        throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + getSimpleName(qi.b.class) + " for initialisation");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    protected byte[] calcSecret() {
        return this.result;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z10) {
        if (this.parameters == null) {
            throw new IllegalStateException(this.kaAlgorithm + " not initialised.");
        } else if (!z10) {
            throw new IllegalStateException(this.kaAlgorithm + " can only be between two parties.");
        } else if (!(key instanceof PublicKey)) {
            throw new InvalidKeyException(this.kaAlgorithm + " key agreement requires " + getSimpleName(c.class) + " for doPhase");
        } else {
            try {
                this.result = this.agreement.a(generatePublicKeyParameter((PublicKey) key));
                return null;
            } catch (Exception e10) {
                throw new InvalidKeyException("calculation failed: " + e10.getMessage()) { // from class: org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyAgreementSpi.1
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
        initFromKey(key, null);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec == null || (algorithmParameterSpec instanceof u)) {
            initFromKey(key, algorithmParameterSpec);
            return;
        }
        throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
    }
}
