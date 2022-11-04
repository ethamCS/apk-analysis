package c6;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import g6.u;
import g6.w;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.annotation.concurrent.GuardedBy;
import javax.crypto.KeyGenerator;
import org.conscrypt.PSKKeyManager;
import y5.m;
/* loaded from: classes.dex */
public final class c implements m {

    /* renamed from: c */
    private static final String f6304c = "c";

    /* renamed from: a */
    private final String f6305a;
    @GuardedBy("this")

    /* renamed from: b */
    private KeyStore f6306b;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        String f6307a = null;

        /* renamed from: b */
        KeyStore f6308b;

        public b() {
            this.f6308b = null;
            if (c.f()) {
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    this.f6308b = keyStore;
                    keyStore.load(null);
                    return;
                } catch (IOException | GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            }
            throw new IllegalStateException("need Android Keystore on Android M or newer");
        }

        public c a() {
            return new c(this);
        }

        public b b(KeyStore keyStore) {
            if (keyStore != null) {
                this.f6308b = keyStore;
                return this;
            }
            throw new IllegalArgumentException("val cannot be null");
        }
    }

    public c() {
        this(new b());
    }

    private c(b bVar) {
        this.f6305a = bVar.f6307a;
        this.f6306b = bVar.f6308b;
    }

    public static void d(String str) {
        if (!new c().e(str)) {
            String b10 = w.b("android-keystore://", str);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(b10, 3).setKeySize(PSKKeyManager.MAX_KEY_LENGTH_BYTES).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
            keyGenerator.generateKey();
            return;
        }
        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
    }

    public static boolean f() {
        return true;
    }

    private static y5.a g(y5.a aVar) {
        byte[] c10 = u.c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(c10, aVar.b(aVar.a(c10, bArr), bArr))) {
            return aVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r3.toLowerCase(java.util.Locale.US).startsWith("android-keystore://") != false) goto L14;
     */
    @Override // y5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.f6305a     // Catch: java.lang.Throwable -> L24
            r1 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto Le
            monitor-exit(r2)
            return r1
        Le:
            java.lang.String r0 = r2.f6305a     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L21
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = r3.toLowerCase(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = "android-keystore://"
            boolean r3 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            monitor-exit(r2)
            return r1
        L24:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.c.a(java.lang.String):boolean");
    }

    @Override // y5.m
    public synchronized y5.a b(String str) {
        String str2 = this.f6305a;
        if (str2 != null && !str2.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f6305a, str));
        }
        return g(new c6.b(w.b("android-keystore://", str), this.f6306b));
    }

    public synchronized boolean e(String str) {
        String str2;
        try {
        } catch (NullPointerException unused) {
            Log.w(f6304c, "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f6306b = keyStore;
                keyStore.load(null);
            } catch (IOException e10) {
                throw new GeneralSecurityException(e10);
            } catch (InterruptedException unused2) {
            }
            return this.f6306b.containsAlias(str2);
        }
        return this.f6306b.containsAlias(w.b("android-keystore://", str));
    }
}
