package vh;
/* loaded from: classes3.dex */
public interface b {
    void a(byte[] bArr, int i10, int i11);

    byte[] b();

    int doFinal(byte[] bArr, int i10);

    String getAlgorithmName();

    int getOutputSize(int i10);

    int getUpdateOutputSize(int i10);

    void init(boolean z10, org.bouncycastle.crypto.i iVar);

    int processByte(byte b10, byte[] bArr, int i10);

    int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);
}
