package org.bouncycastle.jcajce.provider.symmetric;

import og.a;
import org.bouncycastle.crypto.f;
import org.bouncycastle.crypto.h;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.conscrypt.PSKKeyManager;
import qh.b1;
import qh.v0;
import sh.y;
import uh.l;
import vh.c;
import vh.e;
import vh.n;
import vh.v;
/* loaded from: classes3.dex */
public final class Serpent {

    /* loaded from: classes3.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Serpent IV";
        }
    }

    /* loaded from: classes3.dex */
    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new c(new v0()), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new f(new e(new v0(), 128)), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public org.bouncycastle.crypto.e get() {
                    return new v0();
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Serpent", 192, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Serpent.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.Serpent", sb2.toString());
            configurableProvider.addAlgorithm("KeyGenerator.Serpent", str + "$KeyGen");
            configurableProvider.addAlgorithm("AlgorithmParameters.Serpent", str + "$AlgParams");
            configurableProvider.addAlgorithm("Cipher.Tnepres", str + "$TECB");
            configurableProvider.addAlgorithm("KeyGenerator.Tnepres", str + "$TKeyGen");
            configurableProvider.addAlgorithm("AlgorithmParameters.Tnepres", str + "$TAlgParams");
            configurableProvider.addAlgorithm("Cipher", a.f18401j, str + "$ECB");
            configurableProvider.addAlgorithm("Cipher", a.f18405n, str + "$ECB");
            configurableProvider.addAlgorithm("Cipher", a.f18409r, str + "$ECB");
            configurableProvider.addAlgorithm("Cipher", a.f18402k, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", a.f18406o, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", a.f18410s, str + "$CBC");
            configurableProvider.addAlgorithm("Cipher", a.f18404m, str + "$CFB");
            configurableProvider.addAlgorithm("Cipher", a.f18408q, str + "$CFB");
            configurableProvider.addAlgorithm("Cipher", a.f18412u, str + "$CFB");
            configurableProvider.addAlgorithm("Cipher", a.f18403l, str + "$OFB");
            configurableProvider.addAlgorithm("Cipher", a.f18407p, str + "$OFB");
            configurableProvider.addAlgorithm("Cipher", a.f18411t, str + "$OFB");
            addGMacAlgorithm(configurableProvider, "SERPENT", str + "$SerpentGMAC", str + "$KeyGen");
            addGMacAlgorithm(configurableProvider, "TNEPRES", str + "$TSerpentGMAC", str + "$TKeyGen");
            addPoly1305Algorithm(configurableProvider, "SERPENT", str + "$Poly1305", str + "$Poly1305KeyGen");
        }
    }

    /* loaded from: classes3.dex */
    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new f(new v(new v0(), 128)), 128);
        }
    }

    /* loaded from: classes3.dex */
    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new l(new v0()));
        }
    }

    /* loaded from: classes3.dex */
    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Serpent", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new y());
        }
    }

    /* loaded from: classes3.dex */
    public static class SerpentGMAC extends BaseMac {
        public SerpentGMAC() {
            super(new uh.e(new n(new v0())));
        }
    }

    /* loaded from: classes3.dex */
    public static class TAlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "Tnepres IV";
        }
    }

    /* loaded from: classes3.dex */
    public static class TECB extends BaseBlockCipher {
        public TECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.TECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public org.bouncycastle.crypto.e get() {
                    return new b1();
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static class TKeyGen extends BaseKeyGenerator {
        public TKeyGen() {
            super("Tnepres", 192, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class TSerpentGMAC extends BaseMac {
        public TSerpentGMAC() {
            super(new uh.e(new n(new b1())));
        }
    }

    private Serpent() {
    }
}
