package ji;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyStore;
/* loaded from: classes3.dex */
public class c implements KeyStore.LoadStoreParameter {

    /* renamed from: a */
    private final InputStream f14385a;

    /* renamed from: b */
    private final OutputStream f14386b;

    /* renamed from: c */
    private final KeyStore.ProtectionParameter f14387c;

    public InputStream a() {
        if (this.f14386b == null) {
            return this.f14385a;
        }
        throw new UnsupportedOperationException("parameter configured for storage OutputStream present");
    }

    public OutputStream b() {
        OutputStream outputStream = this.f14386b;
        if (outputStream != null) {
            return outputStream;
        }
        throw new UnsupportedOperationException("parameter not configured for storage - no OutputStream");
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.f14387c;
    }
}
