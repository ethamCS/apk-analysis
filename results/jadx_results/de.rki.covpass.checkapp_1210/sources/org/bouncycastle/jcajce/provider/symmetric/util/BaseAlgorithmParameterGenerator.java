package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.SecureRandom;
import ni.a;
import ni.c;
/* loaded from: classes3.dex */
public abstract class BaseAlgorithmParameterGenerator extends AlgorithmParameterGeneratorSpi {
    protected SecureRandom random;
    private final c helper = new a();
    protected int strength = 1024;

    public final AlgorithmParameters createParametersInstance(String str) {
        return this.helper.f(str);
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(int i10, SecureRandom secureRandom) {
        this.strength = i10;
        this.random = secureRandom;
    }
}
