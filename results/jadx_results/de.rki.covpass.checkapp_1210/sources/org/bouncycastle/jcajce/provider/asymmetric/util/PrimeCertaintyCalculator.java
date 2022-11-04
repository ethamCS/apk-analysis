package org.bouncycastle.jcajce.provider.asymmetric.util;
/* loaded from: classes3.dex */
public class PrimeCertaintyCalculator {
    private PrimeCertaintyCalculator() {
    }

    public static int getDefaultCertainty(int i10) {
        if (i10 <= 1024) {
            return 80;
        }
        return (((i10 - 1) / 1024) * 16) + 96;
    }
}
