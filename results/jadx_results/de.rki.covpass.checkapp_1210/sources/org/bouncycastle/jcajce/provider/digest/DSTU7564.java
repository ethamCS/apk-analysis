package org.bouncycastle.jcajce.provider.digest;

import dh.f;
import nh.c;
import org.bouncycastle.crypto.h;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.conscrypt.PSKKeyManager;
import uh.d;
/* loaded from: classes3.dex */
public class DSTU7564 {

    /* loaded from: classes3.dex */
    public static class Digest256 extends DigestDSTU7564 {
        public Digest256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest384 extends DigestDSTU7564 {
        public Digest384() {
            super(384);
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest512 extends DigestDSTU7564 {
        public Digest512() {
            super(512);
        }
    }

    /* loaded from: classes3.dex */
    public static class DigestDSTU7564 extends BCMessageDigest implements Cloneable {
        public DigestDSTU7564(int i10) {
            super(new c(i10));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new c((c) this.digest);
            return bCMessageDigest;
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac256 extends BaseMac {
        public HashMac256() {
            super(new d(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac384 extends BaseMac {
        public HashMac384() {
            super(new d(384));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac512 extends BaseMac {
        public HashMac512() {
            super(new d(512));
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGenerator256 extends BaseKeyGenerator {
        public KeyGenerator256() {
            super("HMACDSTU7564-256", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGenerator384 extends BaseKeyGenerator {
        public KeyGenerator384() {
            super("HMACDSTU7564-384", 384, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGenerator512 extends BaseKeyGenerator {
        public KeyGenerator512() {
            super("HMACDSTU7564-512", 512, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = DSTU7564.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$Digest256");
            configurableProvider.addAlgorithm("MessageDigest.DSTU7564-256", sb2.toString());
            configurableProvider.addAlgorithm("MessageDigest.DSTU7564-384", str + "$Digest384");
            configurableProvider.addAlgorithm("MessageDigest.DSTU7564-512", str + "$Digest512");
            configurableProvider.addAlgorithm("MessageDigest", f.f9061d, str + "$Digest256");
            configurableProvider.addAlgorithm("MessageDigest", f.f9062e, str + "$Digest384");
            configurableProvider.addAlgorithm("MessageDigest", f.f9063f, str + "$Digest512");
            addHMACAlgorithm(configurableProvider, "DSTU7564-256", str + "$HashMac256", str + "$KeyGenerator256");
            addHMACAlgorithm(configurableProvider, "DSTU7564-384", str + "$HashMac384", str + "$KeyGenerator384");
            addHMACAlgorithm(configurableProvider, "DSTU7564-512", str + "$HashMac512", str + "$KeyGenerator512");
            addHMACAlias(configurableProvider, "DSTU7564-256", f.f9064g);
            addHMACAlias(configurableProvider, "DSTU7564-384", f.f9065h);
            addHMACAlias(configurableProvider, "DSTU7564-512", f.f9066i);
        }
    }

    private DSTU7564() {
    }
}
