package ji;

import java.io.OutputStream;
import java.security.KeyStore;
/* loaded from: classes3.dex */
public class k implements KeyStore.LoadStoreParameter {
    private final boolean forDEREncoding;
    private final OutputStream out;
    private final KeyStore.ProtectionParameter protectionParameter;

    public k(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter) {
        this(outputStream, protectionParameter, false);
    }

    public k(OutputStream outputStream, KeyStore.ProtectionParameter protectionParameter, boolean z10) {
        this.out = outputStream;
        this.protectionParameter = protectionParameter;
        this.forDEREncoding = z10;
    }

    public k(OutputStream outputStream, char[] cArr) {
        this(outputStream, cArr, false);
    }

    public k(OutputStream outputStream, char[] cArr, boolean z10) {
        this(outputStream, new KeyStore.PasswordProtection(cArr), z10);
    }

    public OutputStream getOutputStream() {
        return this.out;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.protectionParameter;
    }

    public boolean isForDEREncoding() {
        return this.forDEREncoding;
    }
}
