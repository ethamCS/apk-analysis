package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.b;
import org.bouncycastle.crypto.l;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import ri.i;
import sh.o;
import sh.p;
import zh.l0;
import zh.n0;
import zh.o0;
import zh.p0;
/* loaded from: classes3.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    l0 param;
    o engine = new o();
    int strength = 1024;
    int certainty = 20;
    SecureRandom random = l.b();
    boolean initialised = false;

    public KeyPairGeneratorSpi() {
        super("ElGamal");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        l0 l0Var;
        if (!this.initialised) {
            DHParameterSpec dHDefaultParameters = BouncyCastleProvider.CONFIGURATION.getDHDefaultParameters(this.strength);
            if (dHDefaultParameters != null) {
                l0Var = new l0(this.random, new n0(dHDefaultParameters.getP(), dHDefaultParameters.getG(), dHDefaultParameters.getL()));
            } else {
                p pVar = new p();
                pVar.b(this.strength, this.certainty, this.random);
                l0Var = new l0(this.random, pVar.a());
            }
            this.param = l0Var;
            this.engine.b(this.param);
            this.initialised = true;
        }
        b a10 = this.engine.a();
        return new KeyPair(new BCElGamalPublicKey((p0) a10.b()), new BCElGamalPrivateKey((o0) a10.a()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        this.strength = i10;
        this.random = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        l0 l0Var;
        boolean z10 = algorithmParameterSpec instanceof i;
        if (z10 || (algorithmParameterSpec instanceof DHParameterSpec)) {
            if (z10) {
                i iVar = (i) algorithmParameterSpec;
                l0Var = new l0(secureRandom, new n0(iVar.b(), iVar.a()));
            } else {
                DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
                l0Var = new l0(secureRandom, new n0(dHParameterSpec.getP(), dHParameterSpec.getG(), dHParameterSpec.getL()));
            }
            this.param = l0Var;
            this.engine.b(this.param);
            this.initialised = true;
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec or an ElGamalParameterSpec");
    }
}
