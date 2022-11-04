package org.bouncycastle.crypto;
/* loaded from: classes3.dex */
public interface r {
    int doFinal(byte[] bArr, int i10);

    String getAlgorithmName();

    int getDigestSize();

    void reset();

    void update(byte b10);

    void update(byte[] bArr, int i10, int i11);
}
