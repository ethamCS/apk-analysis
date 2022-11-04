package ci;

import ak.g;
import java.util.Hashtable;
import org.bouncycastle.crypto.r;
import org.bouncycastle.crypto.y;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
class d {

    /* renamed from: a */
    static final Hashtable f6613a;

    static {
        Hashtable hashtable = new Hashtable();
        f6613a = hashtable;
        hashtable.put("SHA-1", g.e(128));
        hashtable.put("SHA-224", g.e(192));
        hashtable.put("SHA-256", g.e(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        hashtable.put("SHA-384", g.e(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        hashtable.put("SHA-512", g.e(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        hashtable.put("SHA-512/224", g.e(192));
        hashtable.put("SHA-512/256", g.e(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
    }

    public static int a(r rVar) {
        return ((Integer) f6613a.get(rVar.getAlgorithmName())).intValue();
    }

    public static int b(y yVar) {
        String algorithmName = yVar.getAlgorithmName();
        return ((Integer) f6613a.get(algorithmName.substring(0, algorithmName.indexOf("/")))).intValue();
    }

    public static byte[] c(r rVar, byte[] bArr, int i10) {
        int i11 = (i10 + 7) / 8;
        byte[] bArr2 = new byte[i11];
        int digestSize = i11 / rVar.getDigestSize();
        int digestSize2 = rVar.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        int i12 = 1;
        int i13 = 0;
        for (int i14 = 0; i14 <= digestSize; i14++) {
            rVar.update((byte) i12);
            rVar.update((byte) (i10 >> 24));
            rVar.update((byte) (i10 >> 16));
            rVar.update((byte) (i10 >> 8));
            rVar.update((byte) i10);
            rVar.update(bArr, 0, bArr.length);
            rVar.doFinal(bArr3, 0);
            int i15 = i14 * digestSize2;
            int i16 = i11 - i15;
            if (i16 > digestSize2) {
                i16 = digestSize2;
            }
            System.arraycopy(bArr3, 0, bArr2, i15, i16);
            i12++;
        }
        int i17 = i10 % 8;
        if (i17 != 0) {
            int i18 = 8 - i17;
            int i19 = 0;
            while (i13 != i11) {
                int i20 = bArr2[i13] & 255;
                bArr2[i13] = (byte) ((i19 << (8 - i18)) | (i20 >>> i18));
                i13++;
                i19 = i20;
            }
        }
        return bArr2;
    }
}
