package org.bouncycastle.jcajce.provider.keystore;

import ak.m;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
/* loaded from: classes3.dex */
public class BC {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.keystore.bc.";

    /* loaded from: classes3.dex */
    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyStore.BKS", "org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi$Std");
            if (m.c("org.bouncycastle.bks.enable_v1")) {
                configurableProvider.addAlgorithm("KeyStore.BKS-V1", "org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi$Version1");
            }
            configurableProvider.addAlgorithm("KeyStore.BouncyCastle", "org.bouncycastle.jcajce.provider.keystore.bc.BcKeyStoreSpi$BouncyCastleStore");
            configurableProvider.addAlgorithm("Alg.Alias.KeyStore.UBER", "BouncyCastle");
            configurableProvider.addAlgorithm("Alg.Alias.KeyStore.BOUNCYCASTLE", "BouncyCastle");
            configurableProvider.addAlgorithm("Alg.Alias.KeyStore.bouncycastle", "BouncyCastle");
        }
    }
}
