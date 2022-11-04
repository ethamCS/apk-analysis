package xh;

import java.lang.reflect.Array;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public class f implements a {

    /* renamed from: a */
    private long[][] f25655a;

    @Override // xh.a
    public void a(long[] jArr) {
        long[] jArr2 = new long[2];
        b.b(this.f25655a[((int) (jArr[1] >>> 56)) & 255], jArr2);
        for (int i10 = 14; i10 >= 0; i10--) {
            b.e(jArr2, jArr2);
            b.a(this.f25655a[((int) (jArr[i10 >>> 3] >>> ((i10 & 7) << 3))) & 255], jArr2, jArr2);
        }
        b.b(jArr2, jArr);
    }

    @Override // xh.a
    public void b(long[] jArr) {
        long[][] jArr2 = this.f25655a;
        if (jArr2 == null) {
            this.f25655a = (long[][]) Array.newInstance(long.class, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 2);
        } else if (b.c(jArr, jArr2[1])) {
            return;
        }
        b.b(jArr, this.f25655a[1]);
        for (int i10 = 2; i10 < 256; i10 += 2) {
            long[][] jArr3 = this.f25655a;
            b.d(jArr3[i10 >> 1], jArr3[i10]);
            long[][] jArr4 = this.f25655a;
            b.a(jArr4[i10], jArr4[1], jArr4[i10 + 1]);
        }
    }
}
