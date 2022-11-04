package bi;
/* loaded from: classes3.dex */
public class e {
    public static byte[] a(c cVar, int i10) {
        byte[] bArr = new byte[i10];
        if (i10 * 8 <= cVar.entropySize()) {
            System.arraycopy(cVar.getEntropy(), 0, bArr, 0, i10);
        } else {
            int entropySize = cVar.entropySize() / 8;
            for (int i11 = 0; i11 < i10; i11 += entropySize) {
                byte[] entropy = cVar.getEntropy();
                int i12 = i10 - i11;
                if (entropy.length <= i12) {
                    System.arraycopy(entropy, 0, bArr, i11, entropy.length);
                } else {
                    System.arraycopy(entropy, 0, bArr, i11, i12);
                }
            }
        }
        return bArr;
    }
}
