package w7;

import bf.x;
import kotlin.Metadata;
import org.conscrypt.PSKKeyManager;
@Metadata(bv = {}, d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"covpass-base45"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private static final byte[] f24695a;

    /* renamed from: b */
    private static final byte[] f24696b;

    static {
        byte[] s10;
        s10 = x.s("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:");
        f24695a = s10;
        byte[] bArr = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            bArr[i11] = -1;
        }
        byte[] bArr2 = f24695a;
        int length = bArr2.length;
        int i12 = 0;
        while (i10 < length) {
            bArr[bArr2[i10]] = (byte) i12;
            i10++;
            i12++;
        }
        f24696b = bArr;
    }

    public static final /* synthetic */ byte[] a() {
        return f24696b;
    }
}
