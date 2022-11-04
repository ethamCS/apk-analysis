package ni;

import java.security.Provider;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
/* loaded from: classes3.dex */
public class a extends e {

    /* renamed from: b */
    private static volatile Provider f17325b;

    public a() {
        super(i());
    }

    private static synchronized Provider i() {
        synchronized (a.class) {
            Provider provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
            if (provider instanceof BouncyCastleProvider) {
                return provider;
            }
            if (f17325b != null) {
                return f17325b;
            }
            f17325b = new BouncyCastleProvider();
            return f17325b;
        }
    }
}
