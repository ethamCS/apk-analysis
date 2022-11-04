package l1;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Objects;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private final String f15687a;

    /* renamed from: b */
    private final KeyGenParameterSpec f15688b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15689a;

        static {
            int[] iArr = new int[c.values().length];
            f15689a = iArr;
            try {
                iArr[c.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: l1.b$b */
    /* loaded from: classes.dex */
    public static final class C0238b {

        /* renamed from: a */
        private final String f15690a;

        /* renamed from: b */
        private KeyGenParameterSpec f15691b;

        /* renamed from: c */
        private c f15692c;

        /* renamed from: d */
        private boolean f15693d;

        /* renamed from: e */
        private int f15694e;

        /* renamed from: f */
        private boolean f15695f;

        /* renamed from: g */
        private final Context f15696g;

        public C0238b(Context context, String str) {
            this.f15696g = context.getApplicationContext();
            this.f15690a = str;
        }

        private b b() {
            c cVar = this.f15692c;
            if (cVar == null && this.f15691b == null) {
                throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
            }
            if (cVar == c.AES256_GCM) {
                KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(this.f15690a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                if (this.f15693d) {
                    keySize.setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(this.f15694e);
                }
                if (Build.VERSION.SDK_INT >= 28 && this.f15695f && this.f15696g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                    keySize.setIsStrongBoxBacked(true);
                }
                this.f15691b = keySize.build();
            }
            KeyGenParameterSpec keyGenParameterSpec = this.f15691b;
            Objects.requireNonNull(keyGenParameterSpec, "KeyGenParameterSpec was null after build() check");
            return new b(l1.c.c(keyGenParameterSpec), this.f15691b);
        }

        public b a() {
            return b();
        }

        public C0238b c(c cVar) {
            if (a.f15689a[cVar.ordinal()] == 1) {
                if (this.f15691b != null) {
                    throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
                }
                this.f15692c = cVar;
                return this;
            }
            throw new IllegalArgumentException("Unsupported scheme: " + cVar);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        AES256_GCM
    }

    b(String str, Object obj) {
        this.f15687a = str;
        this.f15688b = (KeyGenParameterSpec) obj;
    }

    public String a() {
        return this.f15687a;
    }

    public boolean b() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f15687a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f15687a + ", isKeyStoreBacked=" + b() + "}";
    }
}
