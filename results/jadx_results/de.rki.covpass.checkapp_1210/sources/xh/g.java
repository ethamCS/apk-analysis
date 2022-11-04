package xh;

import java.lang.reflect.Array;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public class g implements a {

    /* renamed from: a */
    private long[][] f25656a;

    @Override // xh.a
    public void a(long[] jArr) {
        long[] jArr2 = new long[4];
        c.b(this.f25656a[((int) (jArr[3] >>> 56)) & 255], jArr2);
        for (int i10 = 30; i10 >= 0; i10--) {
            c.e(jArr2, jArr2);
            c.a(this.f25656a[((int) (jArr[i10 >>> 3] >>> ((i10 & 7) << 3))) & 255], jArr2, jArr2);
        }
        c.b(jArr2, jArr);
    }

    @Override // xh.a
    public void b(long[] jArr) {
        long[][] jArr2 = this.f25656a;
        if (jArr2 == null) {
            this.f25656a = (long[][]) Array.newInstance(long.class, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 4);
        } else if (c.c(jArr, jArr2[1])) {
            return;
        }
        c.b(jArr, this.f25656a[1]);
        for (int i10 = 2; i10 < 256; i10 += 2) {
            long[][] jArr3 = this.f25656a;
            c.d(jArr3[i10 >> 1], jArr3[i10]);
            long[][] jArr4 = this.f25656a;
            c.a(jArr4[i10], jArr4[1], jArr4[i10 + 1]);
        }
    }
}
