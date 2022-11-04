package wh;

import ak.l;
import java.lang.reflect.Array;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public class e implements c {

    /* renamed from: a */
    private byte[] f25086a;

    /* renamed from: b */
    private long[][] f25087b;

    @Override // wh.c
    public void a(byte[] bArr) {
        if (this.f25087b == null) {
            this.f25087b = (long[][]) Array.newInstance(long.class, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 2);
        } else if (d.a(this.f25086a, bArr) != 0) {
            return;
        }
        byte[] bArr2 = new byte[16];
        this.f25086a = bArr2;
        d.e(bArr, bArr2);
        d.c(this.f25086a, this.f25087b[1]);
        long[][] jArr = this.f25087b;
        d.k(jArr[1], jArr[1]);
        for (int i10 = 2; i10 < 256; i10 += 2) {
            long[][] jArr2 = this.f25087b;
            d.g(jArr2[i10 >> 1], jArr2[i10]);
            long[][] jArr3 = this.f25087b;
            d.s(jArr3[i10], jArr3[1], jArr3[i10 + 1]);
        }
    }

    @Override // wh.c
    public void b(byte[] bArr) {
        long[] jArr = this.f25087b[bArr[15] & 255];
        long j10 = jArr[0];
        long j11 = jArr[1];
        for (int i10 = 14; i10 >= 0; i10--) {
            long[] jArr2 = this.f25087b[bArr[i10] & 255];
            long j12 = j11 << 56;
            j11 = ((j11 >>> 8) | (j10 << 56)) ^ jArr2[1];
            j10 = (((((j10 >>> 8) ^ jArr2[0]) ^ j12) ^ (j12 >>> 1)) ^ (j12 >>> 2)) ^ (j12 >>> 7);
        }
        l.s(j10, bArr, 0);
        l.s(j11, bArr, 8);
    }
}
