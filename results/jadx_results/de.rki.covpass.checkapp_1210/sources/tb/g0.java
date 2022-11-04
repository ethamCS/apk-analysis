package tb;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001\u001a\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\u0001\u001a\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\tH\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H\u0000\u001a\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0000H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {BuildConfig.FLAVOR, "v1", "v2", "a", BuildConfig.FLAVOR, "c", "Ltb/z;", "b", "(II)I", "Ltb/a0;", "d", "(JJ)J", "v", BuildConfig.FLAVOR, "e", "base", "f", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class g0 {
    public static final int a(int i10, int i11) {
        return hc.t.f(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    public static final int b(int i10, int i11) {
        return z.b((int) ((i10 & 4294967295L) / (i11 & 4294967295L)));
    }

    public static final int c(long j10, long j11) {
        return hc.t.g(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    public static final long d(long j10, long j11) {
        if (j11 < 0) {
            return c(j10, j11) < 0 ? a0.b(0L) : a0.b(1L);
        } else if (j10 >= 0) {
            return a0.b(j10 / j11);
        } else {
            int i10 = 1;
            long j12 = ((j10 >>> 1) / j11) << 1;
            if (c(a0.b(j10 - (j12 * j11)), a0.b(j11)) < 0) {
                i10 = 0;
            }
            return a0.b(j12 + i10);
        }
    }

    public static final String e(long j10) {
        return f(j10, 10);
    }

    public static final String f(long j10, int i10) {
        int a10;
        int a11;
        int a12;
        if (j10 >= 0) {
            a12 = bf.b.a(i10);
            String l10 = Long.toString(j10, a12);
            hc.t.d(l10, "toString(this, checkRadix(radix))");
            return l10;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        a10 = bf.b.a(i10);
        String l11 = Long.toString(j12, a10);
        hc.t.d(l11, "toString(this, checkRadix(radix))");
        sb2.append(l11);
        a11 = bf.b.a(i10);
        String l12 = Long.toString(j13, a11);
        hc.t.d(l12, "toString(this, checkRadix(radix))");
        sb2.append(l12);
        return sb2.toString();
    }
}
