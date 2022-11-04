package nc;

import hc.t;
import kotlin.Metadata;
import nc.e;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0000H\u0086\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0004\u001a\u0012\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000\u001a\u0012\u0010\u000b\u001a\u00020\n*\u00020\n2\u0006\u0010\b\u001a\u00020\n\u001a\u0012\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000\u001a\u0012\u0010\u000e\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a\u001a\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000¨\u0006\u0010"}, d2 = {BuildConfig.FLAVOR, "to", "Lnc/e;", "g", "step", "h", "Lnc/g;", "i", "minimumValue", "b", BuildConfig.FLAVOR, "c", "maximumValue", "d", "e", "f", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/ranges/RangesKt")
/* loaded from: classes.dex */
public class m extends l {
    public static int b(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long c(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static int d(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long e(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static int f(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static e g(int i10, int i11) {
        return e.Companion.a(i10, i11, -1);
    }

    public static e h(e eVar, int i10) {
        t.e(eVar, "<this>");
        l.a(i10 > 0, Integer.valueOf(i10));
        e.a aVar = e.Companion;
        int a10 = eVar.a();
        int b10 = eVar.b();
        if (eVar.d() <= 0) {
            i10 = -i10;
        }
        return aVar.a(a10, b10, i10);
    }

    public static g i(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? g.Companion.a() : new g(i10, i11 - 1);
    }
}
