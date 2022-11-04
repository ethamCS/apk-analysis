package org.bouncycastle.crypto;
/* loaded from: classes3.dex */
public interface h0 {
    String getAlgorithmName();

    void init(boolean z10, i iVar);

    int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

    void reset();
}
