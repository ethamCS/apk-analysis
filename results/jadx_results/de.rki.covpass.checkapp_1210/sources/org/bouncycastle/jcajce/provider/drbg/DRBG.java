package org.bouncycastle.jcajce.provider.drbg;

import ak.a;
import ak.l;
import ak.m;
import ak.q;
import bi.c;
import bi.d;
import bi.f;
import bi.g;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.security.Security;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nh.a0;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
/* loaded from: classes3.dex */
public class DRBG {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.drbg.DRBG";
    private static final String[][] initialEntropySourceNames = {new String[]{"sun.security.provider.Sun", "sun.security.provider.SecureRandom"}, new String[]{"org.apache.harmony.security.provider.crypto.CryptoProvider", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl"}, new String[]{"com.android.org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLRandom"}, new String[]{"org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLRandom"}};

    /* loaded from: classes3.dex */
    public static class CoreSecureRandom extends SecureRandom {
        CoreSecureRandom(Object[] objArr) {
            super((SecureRandomSpi) objArr[1], (Provider) objArr[0]);
        }
    }

    /* loaded from: classes3.dex */
    public static class Default extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.createBaseRandom(true);

        @Override // java.security.SecureRandomSpi
        protected byte[] engineGenerateSeed(int i10) {
            return random.generateSeed(i10);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class HybridRandomProvider extends Provider {
        protected HybridRandomProvider() {
            super("BCHEP", 1.0d, "Bouncy Castle Hybrid Entropy Provider");
        }
    }

    /* loaded from: classes3.dex */
    public static class HybridSecureRandom extends SecureRandom {
        private final SecureRandom baseRandom;
        private final f drbg;
        private final AtomicBoolean seedAvailable = new AtomicBoolean(false);
        private final AtomicInteger samples = new AtomicInteger(0);

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public class SignallingEntropySource implements c {
            private final int byteLength;
            private final AtomicReference entropy = new AtomicReference();
            private final AtomicBoolean scheduled = new AtomicBoolean(false);

            /* loaded from: classes3.dex */
            private class EntropyGatherer implements Runnable {
                private final int numBytes;

                EntropyGatherer(int i10) {
                    SignallingEntropySource.this = r1;
                    this.numBytes = i10;
                }

                private void sleep(long j10) {
                    try {
                        Thread.sleep(j10);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }

                @Override // java.lang.Runnable
                public void run() {
                    String b10 = m.b("org.bouncycastle.drbg.gather_pause_secs");
                    long j10 = 5000;
                    if (b10 != null) {
                        try {
                            j10 = Long.parseLong(b10) * 1000;
                        } catch (Exception unused) {
                        }
                    }
                    int i10 = this.numBytes;
                    byte[] bArr = new byte[i10];
                    for (int i11 = 0; i11 < SignallingEntropySource.this.byteLength / 8; i11++) {
                        sleep(j10);
                        byte[] generateSeed = HybridSecureRandom.this.baseRandom.generateSeed(8);
                        System.arraycopy(generateSeed, 0, bArr, i11 * 8, generateSeed.length);
                    }
                    int i12 = SignallingEntropySource.this.byteLength - ((SignallingEntropySource.this.byteLength / 8) * 8);
                    if (i12 != 0) {
                        sleep(j10);
                        byte[] generateSeed2 = HybridSecureRandom.this.baseRandom.generateSeed(i12);
                        System.arraycopy(generateSeed2, 0, bArr, i10 - generateSeed2.length, generateSeed2.length);
                    }
                    SignallingEntropySource.this.entropy.set(bArr);
                    HybridSecureRandom.this.seedAvailable.set(true);
                }
            }

            SignallingEntropySource(int i10) {
                HybridSecureRandom.this = r2;
                this.byteLength = (i10 + 7) / 8;
            }

            @Override // bi.c
            public int entropySize() {
                return this.byteLength * 8;
            }

            @Override // bi.c
            public byte[] getEntropy() {
                byte[] bArr = (byte[]) this.entropy.getAndSet(null);
                if (bArr == null || bArr.length != this.byteLength) {
                    bArr = HybridSecureRandom.this.baseRandom.generateSeed(this.byteLength);
                } else {
                    this.scheduled.set(false);
                }
                if (!this.scheduled.getAndSet(true)) {
                    Thread thread = new Thread(new EntropyGatherer(this.byteLength));
                    thread.setDaemon(true);
                    thread.start();
                }
                return bArr;
            }

            public boolean isPredictionResistant() {
                return true;
            }
        }

        HybridSecureRandom() {
            super(null, new HybridRandomProvider());
            SecureRandom createInitialEntropySource = DRBG.createInitialEntropySource();
            this.baseRandom = createInitialEntropySource;
            this.drbg = new g(new d() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.HybridSecureRandom.1
                @Override // bi.d
                public c get(int i10) {
                    return new SignallingEntropySource(i10);
                }
            }).e(q.f("Bouncy Castle Hybrid Entropy Source")).b(new uh.g(new a0()), createInitialEntropySource.generateSeed(32), false);
        }

        @Override // java.security.SecureRandom
        public byte[] generateSeed(int i10) {
            byte[] bArr = new byte[i10];
            if (this.samples.getAndIncrement() > 20 && this.seedAvailable.getAndSet(false)) {
                this.samples.set(0);
                this.drbg.b(null);
            }
            this.drbg.nextBytes(bArr);
            return bArr;
        }

        @Override // java.security.SecureRandom, java.util.Random
        public void setSeed(long j10) {
            f fVar = this.drbg;
            if (fVar != null) {
                fVar.setSeed(j10);
            }
        }

        @Override // java.security.SecureRandom
        public void setSeed(byte[] bArr) {
            f fVar = this.drbg;
            if (fVar != null) {
                fVar.setSeed(bArr);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("SecureRandom.DEFAULT", DRBG.PREFIX + "$Default");
            configurableProvider.addAlgorithm("SecureRandom.NONCEANDIV", DRBG.PREFIX + "$NonceAndIV");
        }
    }

    /* loaded from: classes3.dex */
    public static class NonceAndIV extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.createBaseRandom(false);

        @Override // java.security.SecureRandomSpi
        protected byte[] engineGenerateSeed(int i10) {
            return random.generateSeed(i10);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        protected void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    /* loaded from: classes3.dex */
    public static class URLSeededSecureRandom extends SecureRandom {
        private final InputStream seedStream;

        URLSeededSecureRandom(final URL url) {
            super(null, new HybridRandomProvider());
            this.seedStream = (InputStream) AccessController.doPrivileged(new PrivilegedAction<InputStream>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededSecureRandom.1
                @Override // java.security.PrivilegedAction
                public InputStream run() {
                    try {
                        return url.openStream();
                    } catch (IOException unused) {
                        throw new IllegalStateException("unable to open random source");
                    }
                }
            });
        }

        private int privilegedRead(final byte[] bArr, final int i10, final int i11) {
            return ((Integer) AccessController.doPrivileged(new PrivilegedAction<Integer>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededSecureRandom.2
                @Override // java.security.PrivilegedAction
                public Integer run() {
                    try {
                        return Integer.valueOf(URLSeededSecureRandom.this.seedStream.read(bArr, i10, i11));
                    } catch (IOException unused) {
                        throw new InternalError("unable to read random source");
                    }
                }
            })).intValue();
        }

        @Override // java.security.SecureRandom
        public byte[] generateSeed(int i10) {
            byte[] bArr;
            synchronized (this) {
                bArr = new byte[i10];
                int i11 = 0;
                while (i11 != i10) {
                    int privilegedRead = privilegedRead(bArr, i11, i10 - i11);
                    if (privilegedRead <= -1) {
                        break;
                    }
                    i11 += privilegedRead;
                }
                if (i11 != i10) {
                    throw new InternalError("unable to fully read random source");
                }
            }
            return bArr;
        }

        @Override // java.security.SecureRandom, java.util.Random
        public void setSeed(long j10) {
        }

        @Override // java.security.SecureRandom
        public void setSeed(byte[] bArr) {
        }
    }

    public static SecureRandom createBaseRandom(boolean z10) {
        if (m.b("org.bouncycastle.drbg.entropysource") == null) {
            HybridSecureRandom hybridSecureRandom = new HybridSecureRandom();
            byte[] generateSeed = hybridSecureRandom.generateSeed(16);
            return new g(hybridSecureRandom, true).e(z10 ? generateDefaultPersonalizationString(generateSeed) : generateNonceIVPersonalizationString(generateSeed)).c(new a0(), hybridSecureRandom.generateSeed(32), z10);
        }
        d createEntropySource = createEntropySource();
        c cVar = createEntropySource.get(128);
        byte[] entropy = cVar.getEntropy();
        return new g(createEntropySource).e(z10 ? generateDefaultPersonalizationString(entropy) : generateNonceIVPersonalizationString(entropy)).c(new a0(), a.p(cVar.getEntropy(), cVar.getEntropy()), z10);
    }

    public static SecureRandom createCoreSecureRandom() {
        if (Security.getProperty("securerandom.source") == null) {
            return new CoreSecureRandom(findSource());
        }
        try {
            return new URLSeededSecureRandom(new URL(Security.getProperty("securerandom.source")));
        } catch (Exception unused) {
            return new CoreSecureRandom(findSource());
        }
    }

    private static d createEntropySource() {
        final String b10 = m.b("org.bouncycastle.drbg.entropysource");
        return (d) AccessController.doPrivileged(new PrivilegedAction<d>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.3
            @Override // java.security.PrivilegedAction
            public d run() {
                try {
                    return (d) ClassUtil.loadClass(DRBG.class, b10).newInstance();
                } catch (Exception e10) {
                    throw new IllegalStateException("entropy source " + b10 + " not created: " + e10.getMessage(), e10);
                }
            }
        });
    }

    public static SecureRandom createInitialEntropySource() {
        return ((Boolean) AccessController.doPrivileged(new PrivilegedAction<Boolean>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.1
            @Override // java.security.PrivilegedAction
            public Boolean run() {
                try {
                    boolean z10 = false;
                    if (SecureRandom.class.getMethod("getInstanceStrong", new Class[0]) != null) {
                        z10 = true;
                    }
                    return Boolean.valueOf(z10);
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }
        })).booleanValue() ? (SecureRandom) AccessController.doPrivileged(new PrivilegedAction<SecureRandom>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.2
            @Override // java.security.PrivilegedAction
            public SecureRandom run() {
                try {
                    return (SecureRandom) SecureRandom.class.getMethod("getInstanceStrong", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception unused) {
                    return DRBG.createCoreSecureRandom();
                }
            }
        }) : createCoreSecureRandom();
    }

    private static final Object[] findSource() {
        int i10 = 0;
        while (true) {
            String[][] strArr = initialEntropySourceNames;
            if (i10 < strArr.length) {
                String[] strArr2 = strArr[i10];
                try {
                    return new Object[]{Class.forName(strArr2[0]).newInstance(), Class.forName(strArr2[1]).newInstance()};
                } catch (Throwable unused) {
                    i10++;
                }
            } else {
                return null;
            }
        }
    }

    private static byte[] generateDefaultPersonalizationString(byte[] bArr) {
        return a.r(q.f("Default"), bArr, l.u(Thread.currentThread().getId()), l.u(System.currentTimeMillis()));
    }

    private static byte[] generateNonceIVPersonalizationString(byte[] bArr) {
        return a.r(q.f("Nonce"), bArr, l.y(Thread.currentThread().getId()), l.y(System.currentTimeMillis()));
    }
}
