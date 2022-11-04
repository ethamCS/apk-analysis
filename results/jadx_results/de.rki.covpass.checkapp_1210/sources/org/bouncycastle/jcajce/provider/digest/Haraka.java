package org.bouncycastle.jcajce.provider.digest;

import nh.i;
import nh.j;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
/* loaded from: classes3.dex */
public class Haraka {

    /* loaded from: classes3.dex */
    public static class Digest256 extends BCMessageDigest implements Cloneable {
        public Digest256() {
            super(new i());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest256 digest256 = (Digest256) super.clone();
            digest256.digest = new i((i) this.digest);
            return digest256;
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest512 extends BCMessageDigest implements Cloneable {
        public Digest512() {
            super(new j());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest512 digest512 = (Digest512) super.clone();
            digest512.digest = new j((j) this.digest);
            return digest512;
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Haraka.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$Digest256");
            configurableProvider.addAlgorithm("MessageDigest.HARAKA-256", sb2.toString());
            configurableProvider.addAlgorithm("MessageDigest.HARAKA-512", str + "$Digest512");
        }
    }

    private Haraka() {
    }
}
