package xh;

import java.lang.reflect.Array;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public class e implements a {

    /* renamed from: a */
    private long[][] f25654a;

    @Override // xh.a
    public void a(long[] jArr) {
        long[] jArr2 = new long[8];
        d.b(this.f25654a[((int) (jArr[7] >>> 56)) & 255], jArr2);
        for (int i10 = 62; i10 >= 0; i10--) {
            d.e(jArr2, jArr2);
            d.a(this.f25654a[((int) (jArr[i10 >>> 3] >>> ((i10 & 7) << 3))) & 255], jArr2, jArr2);
        }
        d.b(jArr2, jArr);
    }

    @Override // xh.a
    public void b(long[] jArr) {
        long[][] jArr2 = this.f25654a;
        if (jArr2 == null) {
            this.f25654a = (long[][]) Array.newInstance(long.class, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 8);
        } else if (d.c(jArr, jArr2[1])) {
            return;
        }
        d.b(jArr, this.f25654a[1]);
        for (int i10 = 2; i10 < 256; i10 += 2) {
            long[][] jArr3 = this.f25654a;
            d.d(jArr3[i10 >> 1], jArr3[i10]);
            long[][] jArr4 = this.f25654a;
            d.a(jArr4[i10], jArr4[1], jArr4[i10 + 1]);
        }
    }
}
