package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import ni.a;
import ni.c;
/* loaded from: classes3.dex */
public abstract class BaseAlgorithmParameterGeneratorSpi extends AlgorithmParameterGeneratorSpi {
    private final c helper = new a();

    public final AlgorithmParameters createParametersInstance(String str) {
        return this.helper.f(str);
    }
}
