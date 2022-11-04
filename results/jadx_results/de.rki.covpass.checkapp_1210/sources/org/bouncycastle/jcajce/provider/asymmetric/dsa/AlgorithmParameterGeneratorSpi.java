package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import nh.x;
import org.bouncycastle.crypto.l;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.conscrypt.PSKKeyManager;
import sh.j;
import zh.q;
import zh.r;
/* loaded from: classes3.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    protected q params;
    protected SecureRandom random;
    protected int strength = 2048;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected AlgorithmParameters engineGenerateParameters() {
        j jVar = this.strength <= 1024 ? new j() : new j(new x());
        if (this.random == null) {
            this.random = l.b();
        }
        int defaultCertainty = PrimeCertaintyCalculator.getDefaultCertainty(this.strength);
        int i10 = this.strength;
        if (i10 == 1024) {
            q qVar = new q(1024, 160, defaultCertainty, this.random);
            this.params = qVar;
            jVar.l(qVar);
        } else if (i10 > 1024) {
            q qVar2 = new q(i10, PSKKeyManager.MAX_KEY_LENGTH_BYTES, defaultCertainty, this.random);
            this.params = qVar2;
            jVar.l(qVar2);
        } else {
            jVar.k(i10, defaultCertainty, this.random);
        }
        r d10 = jVar.d();
        try {
            AlgorithmParameters createParametersInstance = createParametersInstance("DSA");
            createParametersInstance.init(new DSAParameterSpec(d10.b(), d10.c(), d10.a()));
            return createParametersInstance;
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(int i10, SecureRandom secureRandom) {
        if (i10 < 512 || i10 > 3072) {
            throw new InvalidParameterException("strength must be from 512 - 3072");
        }
        if (i10 <= 1024 && i10 % 64 != 0) {
            throw new InvalidParameterException("strength must be a multiple of 64 below 1024 bits.");
        }
        if (i10 > 1024 && i10 % 1024 != 0) {
            throw new InvalidParameterException("strength must be a multiple of 1024 above 1024 bits.");
        }
        this.strength = i10;
        this.random = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSA parameter generation.");
    }
}
