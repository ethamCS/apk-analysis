package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.h;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.conscrypt.PSKKeyManager;
import qh.i1;
import qh.k1;
import uh.q;
import uh.r;
/* loaded from: classes3.dex */
public class Zuc {

    /* loaded from: classes3.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Zuc IV";
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen128 extends BaseKeyGenerator {
        public KeyGen128() {
            super("ZUC128", 128, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen256 extends BaseKeyGenerator {
        public KeyGen256() {
            super("ZUC256", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Zuc.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$Zuc128");
            configurableProvider.addAlgorithm("Cipher.ZUC-128", sb2.toString());
            configurableProvider.addAlgorithm("KeyGenerator.ZUC-128", str + "$KeyGen128");
            configurableProvider.addAlgorithm("AlgorithmParameters.ZUC-128", str + "$AlgParams");
            configurableProvider.addAlgorithm("Cipher.ZUC-256", str + "$Zuc256");
            configurableProvider.addAlgorithm("KeyGenerator.ZUC-256", str + "$KeyGen256");
            configurableProvider.addAlgorithm("AlgorithmParameters.ZUC-256", str + "$AlgParams");
            configurableProvider.addAlgorithm("Mac.ZUC-128", str + "$ZucMac128");
            configurableProvider.addAlgorithm("Mac.ZUC-256", str + "$ZucMac256");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.ZUC-256-128", "ZUC-256");
            configurableProvider.addAlgorithm("Mac.ZUC-256-64", str + "$ZucMac256_64");
            configurableProvider.addAlgorithm("Mac.ZUC-256-32", str + "$ZucMac256_32");
        }
    }

    /* loaded from: classes3.dex */
    public static class Zuc128 extends BaseStreamCipher {
        public Zuc128() {
            super(new i1(), 16, 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class Zuc256 extends BaseStreamCipher {
        public Zuc256() {
            super(new k1(), 25, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    /* loaded from: classes3.dex */
    public static class ZucMac128 extends BaseMac {
        public ZucMac128() {
            super(new q());
        }
    }

    /* loaded from: classes3.dex */
    public static class ZucMac256 extends BaseMac {
        public ZucMac256() {
            super(new r(128));
        }
    }

    /* loaded from: classes3.dex */
    public static class ZucMac256_32 extends BaseMac {
        public ZucMac256_32() {
            super(new r(32));
        }
    }

    /* loaded from: classes3.dex */
    public static class ZucMac256_64 extends BaseMac {
        public ZucMac256_64() {
            super(new r(64));
        }
    }

    private Zuc() {
    }
}
