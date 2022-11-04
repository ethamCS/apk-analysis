package n7;

import de.rki.covpass.logging.Lumber;
import hc.v;
import java.security.Security;
import kotlin.Lazy;
import kotlin.Metadata;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.conscrypt.BuildConfig;
import org.conscrypt.Conscrypt;
import tb.m;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0006\u0010\u0001\u001a\u00020\u0000\"\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ltb/e0;", "b", BuildConfig.FLAVOR, "lazySecurityProviderInstaller$delegate", "Lkotlin/Lazy;", "a", "()I", "lazySecurityProviderInstaller", "securityprovider_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private static final Lazy f16874a;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: n7.a$a */
    /* loaded from: classes.dex */
    static final class C0257a extends v implements gc.a<Integer> {

        /* renamed from: c */
        public static final C0257a f16875c = new C0257a();

        C0257a() {
            super(0);
        }

        /* renamed from: b */
        public final Integer invoke() {
            System.setProperty("org.bouncycastle.ec.disable_mqv", "true");
            try {
                Security.removeProvider(BouncyCastleProvider.PROVIDER_NAME);
            } catch (Throwable th2) {
                if (Lumber.Companion.getEnabled()) {
                    timber.log.a.f22457a.w(th2, "Provider BC not found. Removal failed.", new Object[0]);
                }
            }
            Security.addProvider(new BouncyCastleProvider());
            return Integer.valueOf(Security.insertProviderAt(Conscrypt.newProvider(), 1));
        }
    }

    static {
        Lazy a10;
        a10 = m.a(C0257a.f16875c);
        f16874a = a10;
    }

    private static final int a() {
        return ((Number) f16874a.getValue()).intValue();
    }

    public static final void b() {
        a();
    }
}
