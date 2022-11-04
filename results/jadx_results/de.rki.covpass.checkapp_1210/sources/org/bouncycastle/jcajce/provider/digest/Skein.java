package org.bouncycastle.jcajce.provider.digest;

import nh.e0;
import org.bouncycastle.crypto.h;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.conscrypt.PSKKeyManager;
import uh.g;
import uh.o;
/* loaded from: classes3.dex */
public class Skein {

    /* loaded from: classes3.dex */
    public static class DigestSkein1024 extends BCMessageDigest implements Cloneable {
        public DigestSkein1024(int i10) {
            super(new e0(1024, i10));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new e0((e0) this.digest);
            return bCMessageDigest;
        }
    }

    /* loaded from: classes3.dex */
    public static class DigestSkein256 extends BCMessageDigest implements Cloneable {
        public DigestSkein256(int i10) {
            super(new e0(PSKKeyManager.MAX_KEY_LENGTH_BYTES, i10));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new e0((e0) this.digest);
            return bCMessageDigest;
        }
    }

    /* loaded from: classes3.dex */
    public static class DigestSkein512 extends BCMessageDigest implements Cloneable {
        public DigestSkein512(int i10) {
            super(new e0(512, i10));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new e0((e0) this.digest);
            return bCMessageDigest;
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest_1024_1024 extends DigestSkein1024 {
        public Digest_1024_1024() {
            super(1024);
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest_1024_384 extends DigestSkein1024 {
        public Digest_1024_384() {
            super(384);
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest_1024_512 extends DigestSkein1024 {
        public Digest_1024_512() {
            super(512);
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest_256_128 extends DigestSkein256 {
        public Digest_256_128() {
            super(128);
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest_256_160 extends DigestSkein256 {
        public Digest_256_160() {
            super(160);
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest_256_224 extends DigestSkein256 {
        public Digest_256_224() {
            super(224);
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest_256_256 extends DigestSkein256 {
        public Digest_256_256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest_512_128 extends DigestSkein512 {
        public Digest_512_128() {
            super(128);
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest_512_160 extends DigestSkein512 {
        public Digest_512_160() {
            super(160);
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest_512_224 extends DigestSkein512 {
        public Digest_512_224() {
            super(224);
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest_512_256 extends DigestSkein512 {
        public Digest_512_256() {
            super(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest_512_384 extends DigestSkein512 {
        public Digest_512_384() {
            super(384);
        }
    }

    /* loaded from: classes3.dex */
    public static class Digest_512_512 extends DigestSkein512 {
        public Digest_512_512() {
            super(512);
        }
    }

    /* loaded from: classes3.dex */
    public static class HMacKeyGenerator_1024_1024 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_1024() {
            super("HMACSkein-1024-1024", 1024, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class HMacKeyGenerator_1024_384 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_384() {
            super("HMACSkein-1024-384", 384, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class HMacKeyGenerator_1024_512 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_512() {
            super("HMACSkein-1024-512", 512, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class HMacKeyGenerator_256_128 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_128() {
            super("HMACSkein-256-128", 128, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class HMacKeyGenerator_256_160 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_160() {
            super("HMACSkein-256-160", 160, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class HMacKeyGenerator_256_224 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_224() {
            super("HMACSkein-256-224", 224, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class HMacKeyGenerator_256_256 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_256() {
            super("HMACSkein-256-256", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class HMacKeyGenerator_512_128 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_128() {
            super("HMACSkein-512-128", 128, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class HMacKeyGenerator_512_160 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_160() {
            super("HMACSkein-512-160", 160, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class HMacKeyGenerator_512_224 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_224() {
            super("HMACSkein-512-224", 224, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class HMacKeyGenerator_512_256 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_256() {
            super("HMACSkein-512-256", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class HMacKeyGenerator_512_384 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_384() {
            super("HMACSkein-512-384", 384, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class HMacKeyGenerator_512_512 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_512() {
            super("HMACSkein-512-512", 512, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac_1024_1024 extends BaseMac {
        public HashMac_1024_1024() {
            super(new g(new e0(1024, 1024)));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac_1024_384 extends BaseMac {
        public HashMac_1024_384() {
            super(new g(new e0(1024, 384)));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac_1024_512 extends BaseMac {
        public HashMac_1024_512() {
            super(new g(new e0(1024, 512)));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac_256_128 extends BaseMac {
        public HashMac_256_128() {
            super(new g(new e0(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128)));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac_256_160 extends BaseMac {
        public HashMac_256_160() {
            super(new g(new e0(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 160)));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac_256_224 extends BaseMac {
        public HashMac_256_224() {
            super(new g(new e0(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 224)));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac_256_256 extends BaseMac {
        public HashMac_256_256() {
            super(new g(new e0(PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES)));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac_512_128 extends BaseMac {
        public HashMac_512_128() {
            super(new g(new e0(512, 128)));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac_512_160 extends BaseMac {
        public HashMac_512_160() {
            super(new g(new e0(512, 160)));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac_512_224 extends BaseMac {
        public HashMac_512_224() {
            super(new g(new e0(512, 224)));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac_512_256 extends BaseMac {
        public HashMac_512_256() {
            super(new g(new e0(512, PSKKeyManager.MAX_KEY_LENGTH_BYTES)));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac_512_384 extends BaseMac {
        public HashMac_512_384() {
            super(new g(new e0(512, 384)));
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac_512_512 extends BaseMac {
        public HashMac_512_512() {
            super(new g(new e0(512, 512)));
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Skein.class.getName();

        private void addSkeinMacAlgorithm(ConfigurableProvider configurableProvider, int i10, int i11) {
            String str = "Skein-MAC-" + i10 + "-" + i11;
            StringBuilder sb2 = new StringBuilder();
            String str2 = PREFIX;
            sb2.append(str2);
            sb2.append("$SkeinMac_");
            sb2.append(i10);
            sb2.append("_");
            sb2.append(i11);
            configurableProvider.addAlgorithm("Mac." + str, sb2.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.Skein-MAC" + i10 + "/" + i11, str);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("KeyGenerator.");
            sb3.append(str);
            configurableProvider.addAlgorithm(sb3.toString(), str2 + "$SkeinMacKeyGenerator_" + i10 + "_" + i11);
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.Skein-MAC" + i10 + "/" + i11, str);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb2 = new StringBuilder();
            String str = PREFIX;
            sb2.append(str);
            sb2.append("$Digest_256_128");
            configurableProvider.addAlgorithm("MessageDigest.Skein-256-128", sb2.toString());
            configurableProvider.addAlgorithm("MessageDigest.Skein-256-160", str + "$Digest_256_160");
            configurableProvider.addAlgorithm("MessageDigest.Skein-256-224", str + "$Digest_256_224");
            configurableProvider.addAlgorithm("MessageDigest.Skein-256-256", str + "$Digest_256_256");
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-128", str + "$Digest_512_128");
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-160", str + "$Digest_512_160");
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-224", str + "$Digest_512_224");
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-256", str + "$Digest_512_256");
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-384", str + "$Digest_512_384");
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-512", str + "$Digest_512_512");
            configurableProvider.addAlgorithm("MessageDigest.Skein-1024-384", str + "$Digest_1024_384");
            configurableProvider.addAlgorithm("MessageDigest.Skein-1024-512", str + "$Digest_1024_512");
            configurableProvider.addAlgorithm("MessageDigest.Skein-1024-1024", str + "$Digest_1024_1024");
            addHMACAlgorithm(configurableProvider, "Skein-256-128", str + "$HashMac_256_128", str + "$HMacKeyGenerator_256_128");
            addHMACAlgorithm(configurableProvider, "Skein-256-160", str + "$HashMac_256_160", str + "$HMacKeyGenerator_256_160");
            addHMACAlgorithm(configurableProvider, "Skein-256-224", str + "$HashMac_256_224", str + "$HMacKeyGenerator_256_224");
            addHMACAlgorithm(configurableProvider, "Skein-256-256", str + "$HashMac_256_256", str + "$HMacKeyGenerator_256_256");
            addHMACAlgorithm(configurableProvider, "Skein-512-128", str + "$HashMac_512_128", str + "$HMacKeyGenerator_512_128");
            addHMACAlgorithm(configurableProvider, "Skein-512-160", str + "$HashMac_512_160", str + "$HMacKeyGenerator_512_160");
            addHMACAlgorithm(configurableProvider, "Skein-512-224", str + "$HashMac_512_224", str + "$HMacKeyGenerator_512_224");
            addHMACAlgorithm(configurableProvider, "Skein-512-256", str + "$HashMac_512_256", str + "$HMacKeyGenerator_512_256");
            addHMACAlgorithm(configurableProvider, "Skein-512-384", str + "$HashMac_512_384", str + "$HMacKeyGenerator_512_384");
            addHMACAlgorithm(configurableProvider, "Skein-512-512", str + "$HashMac_512_512", str + "$HMacKeyGenerator_512_512");
            addHMACAlgorithm(configurableProvider, "Skein-1024-384", str + "$HashMac_1024_384", str + "$HMacKeyGenerator_1024_384");
            addHMACAlgorithm(configurableProvider, "Skein-1024-512", str + "$HashMac_1024_512", str + "$HMacKeyGenerator_1024_512");
            addHMACAlgorithm(configurableProvider, "Skein-1024-1024", str + "$HashMac_1024_1024", str + "$HMacKeyGenerator_1024_1024");
            addSkeinMacAlgorithm(configurableProvider, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128);
            addSkeinMacAlgorithm(configurableProvider, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 160);
            addSkeinMacAlgorithm(configurableProvider, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 224);
            addSkeinMacAlgorithm(configurableProvider, PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            addSkeinMacAlgorithm(configurableProvider, 512, 128);
            addSkeinMacAlgorithm(configurableProvider, 512, 160);
            addSkeinMacAlgorithm(configurableProvider, 512, 224);
            addSkeinMacAlgorithm(configurableProvider, 512, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            addSkeinMacAlgorithm(configurableProvider, 512, 384);
            addSkeinMacAlgorithm(configurableProvider, 512, 512);
            addSkeinMacAlgorithm(configurableProvider, 1024, 384);
            addSkeinMacAlgorithm(configurableProvider, 1024, 512);
            addSkeinMacAlgorithm(configurableProvider, 1024, 1024);
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMacKeyGenerator_1024_1024 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_1024() {
            super("Skein-MAC-1024-1024", 1024, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMacKeyGenerator_1024_384 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_384() {
            super("Skein-MAC-1024-384", 384, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMacKeyGenerator_1024_512 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_512() {
            super("Skein-MAC-1024-512", 512, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMacKeyGenerator_256_128 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_128() {
            super("Skein-MAC-256-128", 128, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMacKeyGenerator_256_160 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_160() {
            super("Skein-MAC-256-160", 160, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMacKeyGenerator_256_224 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_224() {
            super("Skein-MAC-256-224", 224, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMacKeyGenerator_256_256 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_256() {
            super("Skein-MAC-256-256", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMacKeyGenerator_512_128 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_128() {
            super("Skein-MAC-512-128", 128, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMacKeyGenerator_512_160 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_160() {
            super("Skein-MAC-512-160", 160, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMacKeyGenerator_512_224 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_224() {
            super("Skein-MAC-512-224", 224, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMacKeyGenerator_512_256 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_256() {
            super("Skein-MAC-512-256", PSKKeyManager.MAX_KEY_LENGTH_BYTES, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMacKeyGenerator_512_384 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_384() {
            super("Skein-MAC-512-384", 384, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMacKeyGenerator_512_512 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_512() {
            super("Skein-MAC-512-512", 512, new h());
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMac_1024_1024 extends BaseMac {
        public SkeinMac_1024_1024() {
            super(new o(1024, 1024));
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMac_1024_384 extends BaseMac {
        public SkeinMac_1024_384() {
            super(new o(1024, 384));
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMac_1024_512 extends BaseMac {
        public SkeinMac_1024_512() {
            super(new o(1024, 512));
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMac_256_128 extends BaseMac {
        public SkeinMac_256_128() {
            super(new o(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128));
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMac_256_160 extends BaseMac {
        public SkeinMac_256_160() {
            super(new o(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 160));
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMac_256_224 extends BaseMac {
        public SkeinMac_256_224() {
            super(new o(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 224));
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMac_256_256 extends BaseMac {
        public SkeinMac_256_256() {
            super(new o(PSKKeyManager.MAX_KEY_LENGTH_BYTES, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMac_512_128 extends BaseMac {
        public SkeinMac_512_128() {
            super(new o(512, 128));
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMac_512_160 extends BaseMac {
        public SkeinMac_512_160() {
            super(new o(512, 160));
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMac_512_224 extends BaseMac {
        public SkeinMac_512_224() {
            super(new o(512, 224));
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMac_512_256 extends BaseMac {
        public SkeinMac_512_256() {
            super(new o(512, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMac_512_384 extends BaseMac {
        public SkeinMac_512_384() {
            super(new o(512, 384));
        }
    }

    /* loaded from: classes3.dex */
    public static class SkeinMac_512_512 extends BaseMac {
        public SkeinMac_512_512() {
            super(new o(512, 512));
        }
    }

    private Skein() {
    }
}
