package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import ei.c;
import gg.v;
import hh.n0;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import mi.m;
import mi.n;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import zh.b;
import zh.r;
import zh.s;
import zh.t;
/* loaded from: classes3.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof DSAPrivateKeySpec) {
            return new BCDSAPrivateKey((DSAPrivateKeySpec) keySpec);
        }
        if (!(keySpec instanceof m)) {
            return super.engineGeneratePrivate(keySpec);
        }
        b c10 = ei.b.c(((m) keySpec).getEncoded());
        if (!(c10 instanceof s)) {
            throw new IllegalArgumentException("openssh private key is not dsa privare key");
        }
        s sVar = (s) c10;
        return engineGeneratePrivate(new DSAPrivateKeySpec(sVar.c(), sVar.b().b(), sVar.b().c(), sVar.b().a()));
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof DSAPublicKeySpec) {
            try {
                return new BCDSAPublicKey((DSAPublicKeySpec) keySpec);
            } catch (Exception e10) {
                throw new InvalidKeySpecException("invalid KeySpec: " + e10.getMessage()) { // from class: org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi.1
                    @Override // java.lang.Throwable
                    public Throwable getCause() {
                        return e10;
                    }
                };
            }
        } else if (!(keySpec instanceof n)) {
            return super.engineGeneratePublic(keySpec);
        } else {
            b c10 = c.c(((n) keySpec).getEncoded());
            if (!(c10 instanceof t)) {
                throw new IllegalArgumentException("openssh public key is not dsa public key");
            }
            t tVar = (t) c10;
            return engineGeneratePublic(new DSAPublicKeySpec(tVar.c(), tVar.b().b(), tVar.b().c(), tVar.b().a()));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(DSAPublicKeySpec.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey = (DSAPublicKey) key;
            return new DSAPublicKeySpec(dSAPublicKey.getY(), dSAPublicKey.getParams().getP(), dSAPublicKey.getParams().getQ(), dSAPublicKey.getParams().getG());
        } else if (cls.isAssignableFrom(DSAPrivateKeySpec.class) && (key instanceof DSAPrivateKey)) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) key;
            return new DSAPrivateKeySpec(dSAPrivateKey.getX(), dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG());
        } else if (cls.isAssignableFrom(n.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey2 = (DSAPublicKey) key;
            try {
                return new n(c.a(new t(dSAPublicKey2.getY(), new r(dSAPublicKey2.getParams().getP(), dSAPublicKey2.getParams().getQ(), dSAPublicKey2.getParams().getG()))));
            } catch (IOException e10) {
                throw new IllegalArgumentException("unable to produce encoding: " + e10.getMessage());
            }
        } else if (!cls.isAssignableFrom(m.class) || !(key instanceof DSAPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            DSAPrivateKey dSAPrivateKey2 = (DSAPrivateKey) key;
            try {
                return new m(ei.b.b(new s(dSAPrivateKey2.getX(), new r(dSAPrivateKey2.getParams().getP(), dSAPrivateKey2.getParams().getQ(), dSAPrivateKey2.getParams().getG()))));
            } catch (IOException e11) {
                throw new IllegalArgumentException("unable to produce encoding: " + e11.getMessage());
            }
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) {
        if (key instanceof DSAPublicKey) {
            return new BCDSAPublicKey((DSAPublicKey) key);
        }
        if (!(key instanceof DSAPrivateKey)) {
            throw new InvalidKeyException("key type unknown");
        }
        return new BCDSAPrivateKey((DSAPrivateKey) key);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(zg.s sVar) {
        v l10 = sVar.o().l();
        if (DSAUtil.isDsaOid(l10)) {
            return new BCDSAPrivateKey(sVar);
        }
        throw new IOException("algorithm identifier " + l10 + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(n0 n0Var) {
        v l10 = n0Var.l().l();
        if (DSAUtil.isDsaOid(l10)) {
            return new BCDSAPublicKey(n0Var);
        }
        throw new IOException("algorithm identifier " + l10 + " in key not recognised");
    }
}
