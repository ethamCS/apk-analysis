package ji;

import java.io.OutputStream;
import java.security.KeyStore;
/* loaded from: classes3.dex */
public class b implements KeyStore.LoadStoreParameter {

    /* renamed from: a */
    private final KeyStore.ProtectionParameter f14382a;

    /* renamed from: b */
    private final ei.e f14383b;

    /* renamed from: c */
    private OutputStream f14384c;

    public OutputStream a() {
        return this.f14384c;
    }

    public ei.e b() {
        return this.f14383b;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.f14382a;
    }
}
