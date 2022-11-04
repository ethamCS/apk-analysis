package org.conscrypt;

import java.security.SecureRandomSpi;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class OpenSSLRandom extends SecureRandomSpi {
    private static final long serialVersionUID = 8506210602917522861L;

    @Override // java.security.SecureRandomSpi
    protected byte[] engineGenerateSeed(int i10) {
        byte[] bArr = new byte[i10];
        NativeCrypto.RAND_bytes(bArr);
        return bArr;
    }

    @Override // java.security.SecureRandomSpi
    protected void engineNextBytes(byte[] bArr) {
        NativeCrypto.RAND_bytes(bArr);
    }

    @Override // java.security.SecureRandomSpi
    protected void engineSetSeed(byte[] bArr) {
        Objects.requireNonNull(bArr, "seed == null");
    }
}
