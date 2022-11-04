package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import lg.a;
import org.bouncycastle.crypto.b;
import ri.l;
import ri.n;
import sh.r;
import zh.r0;
import zh.t0;
import zh.u0;
import zh.v0;
/* loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    l gost3410Params;
    r0 param;
    r engine = new r();
    int strength = 1024;
    SecureRandom random = null;
    boolean initialised = false;

    public KeyPairGeneratorSpi() {
        super("GOST3410");
    }

    private void init(l lVar, SecureRandom secureRandom) {
        n a10 = lVar.a();
        r0 r0Var = new r0(secureRandom, new t0(a10.b(), a10.c(), a10.a()));
        this.param = r0Var;
        this.engine.b(r0Var);
        this.initialised = true;
        this.gost3410Params = lVar;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            init(new l(a.f16033q.H()), org.bouncycastle.crypto.l.b());
        }
        b a10 = this.engine.a();
        return new KeyPair(new BCGOST3410PublicKey((v0) a10.b(), this.gost3410Params), new BCGOST3410PrivateKey((u0) a10.a(), this.gost3410Params));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        this.strength = i10;
        this.random = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (algorithmParameterSpec instanceof l) {
            init((l) algorithmParameterSpec, secureRandom);
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a GOST3410ParameterSpec");
    }
}
