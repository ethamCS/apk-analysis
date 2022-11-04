package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParameters;
import java.security.spec.AlgorithmParameterSpec;
/* loaded from: classes3.dex */
class SpecUtil {
    SpecUtil() {
    }

    public static AlgorithmParameterSpec extractSpec(AlgorithmParameters algorithmParameters, Class[] clsArr) {
        try {
            return algorithmParameters.getParameterSpec(AlgorithmParameterSpec.class);
        } catch (Exception unused) {
            for (int i10 = 0; i10 != clsArr.length; i10++) {
                if (clsArr[i10] != null) {
                    try {
                        return algorithmParameters.getParameterSpec(clsArr[i10]);
                    } catch (Exception unused2) {
                    }
                }
            }
            return null;
        }
    }
}
