package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.h;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.conscrypt.PSKKeyManager;
import qh.a1;
import uh.c;
/* loaded from: classes3.dex */
public final class Threefish {

    /* loaded from: classes3.dex */
    public static class AlgParams_1024 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Threefish-1024 IV";
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParams_256 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Threefish-256 IV";
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParams_512 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Threefish-512 IV";
        }
    }

    /* loaded from: classes3.dex */
    public static class CMAC_1024 extends BaseMac {
        public CMAC_1024() {
            super(new c(new a1(1024)));
        }
    }

    /* loaded from: classes3.dex */
    public static class CMAC_256 extends BaseMac {
        public CMAC_256() {
            super(new c(new a1(PSKKeyManager.MAX_KEY_LENGTH_BYTES)));
        }
    }

    /* loaded from: classes3.dex */
    public static class CMAC_512 extends BaseMac {
        public CMAC_512() {
            super(new c(new a1(512)));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB_1024 extends BaseBlockCipher {
        public ECB_1024() {
            super(new a1(1024));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB_256 extends BaseBlockCipher {
        public ECB_256() {
            super(new a1(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB_512 extends BaseBlockCipher {
        public ECB_512() {
            super(new a1(512));
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen_1024 extends BaseKeyGenerator {
        public KeyGen_1024() {
            super("Threefish-1024", 1024, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen_256 extends BaseKeyGenerator {
        public KeyGen_256() {
            super("Threefish-256", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen_512 extends BaseKeyGenerator {
        public KeyGen_512() {
            super("Threefish-512", 512, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Threefish.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$CMAC_256");
            configurableProvider.addAlgorithm("Mac.Threefish-256CMAC", sb2.toString());
            configurableProvider.addAlgorithm("Mac.Threefish-512CMAC", str + "$CMAC_512");
            configurableProvider.addAlgorithm("Mac.Threefish-1024CMAC", str + "$CMAC_1024");
            configurableProvider.addAlgorithm("Cipher.Threefish-256", str + "$ECB_256");
            configurableProvider.addAlgorithm("Cipher.Threefish-512", str + "$ECB_512");
            configurableProvider.addAlgorithm("Cipher.Threefish-1024", str + "$ECB_1024");
            configurableProvider.addAlgorithm("KeyGenerator.Threefish-256", str + "$KeyGen_256");
            configurableProvider.addAlgorithm("KeyGenerator.Threefish-512", str + "$KeyGen_512");
            configurableProvider.addAlgorithm("KeyGenerator.Threefish-1024", str + "$KeyGen_1024");
            configurableProvider.addAlgorithm("AlgorithmParameters.Threefish-256", str + "$AlgParams_256");
            configurableProvider.addAlgorithm("AlgorithmParameters.Threefish-512", str + "$AlgParams_512");
            configurableProvider.addAlgorithm("AlgorithmParameters.Threefish-1024", str + "$AlgParams_1024");
        }
    }

    private Threefish() {
    }
}
