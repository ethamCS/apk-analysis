package org.bouncycastle.jcajce.provider.asymmetric.gost;

import gg.v;
import hh.n0;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import lg.a;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import qi.i;
import qi.j;
import ri.m;
import ri.n;
import ri.o;
import zg.s;
/* loaded from: classes3.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        return keySpec instanceof m ? new BCGOST3410PrivateKey((m) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        return keySpec instanceof o ? new BCGOST3410PublicKey((o) keySpec) : super.engineGeneratePublic(keySpec);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(o.class) && (key instanceof j)) {
            j jVar = (j) key;
            n a10 = jVar.getParameters().a();
            return new o(jVar.getY(), a10.b(), a10.c(), a10.a());
        } else if (!cls.isAssignableFrom(m.class) || !(key instanceof i)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            i iVar = (i) key;
            n a11 = iVar.getParameters().a();
            return new m(iVar.getX(), a11.b(), a11.c(), a11.a());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) {
        if (key instanceof j) {
            return new BCGOST3410PublicKey((j) key);
        }
        if (!(key instanceof i)) {
            throw new InvalidKeyException("key type unknown");
        }
        return new BCGOST3410PrivateKey((i) key);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(s sVar) {
        v l10 = sVar.o().l();
        if (l10.s(a.f16028l)) {
            return new BCGOST3410PrivateKey(sVar);
        }
        throw new IOException("algorithm identifier " + l10 + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(n0 n0Var) {
        v l10 = n0Var.l().l();
        if (l10.s(a.f16028l)) {
            return new BCGOST3410PublicKey(n0Var);
        }
        throw new IOException("algorithm identifier " + l10 + " in key not recognised");
    }
}
