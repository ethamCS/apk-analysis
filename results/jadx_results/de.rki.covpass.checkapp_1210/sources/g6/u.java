package g6;

import java.security.SecureRandom;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f10604a = new a();

    /* loaded from: classes.dex */
    class a extends ThreadLocal<SecureRandom> {
        a() {
        }

        /* renamed from: a */
        public SecureRandom initialValue() {
            return u.b();
        }
    }

    public static SecureRandom b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] c(int i10) {
        byte[] bArr = new byte[i10];
        f10604a.get().nextBytes(bArr);
        return bArr;
    }
}
