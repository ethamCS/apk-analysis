package bf;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.g0;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0016\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0016\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000\u001a\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000\u001a\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000\u001a\u0011\u0010\u0015\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0016\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {BuildConfig.FLAVOR, "Ltb/y;", "a", "(Ljava/lang/String;)B", "Ltb/c0;", "j", "(Ljava/lang/String;)S", "Ltb/z;", "d", "(Ljava/lang/String;)I", "Ltb/a0;", "g", "(Ljava/lang/String;)J", "b", BuildConfig.FLAVOR, "radix", "c", "k", "l", "e", "f", "h", "i", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class b0 {
    public static final byte a(String str) {
        hc.t.e(str, "<this>");
        tb.y b10 = b(str);
        if (b10 != null) {
            return b10.j();
        }
        w.k(str);
        throw new tb.i();
    }

    public static final tb.y b(String str) {
        hc.t.e(str, "<this>");
        return c(str, 10);
    }

    public static final tb.y c(String str, int i10) {
        hc.t.e(str, "<this>");
        tb.z f10 = f(str, i10);
        if (f10 != null) {
            int j10 = f10.j();
            if (g0.a(j10, tb.z.b(255)) <= 0) {
                return tb.y.a(tb.y.b((byte) j10));
            }
            return null;
        }
        return null;
    }

    public static final int d(String str) {
        hc.t.e(str, "<this>");
        tb.z e10 = e(str);
        if (e10 != null) {
            return e10.j();
        }
        w.k(str);
        throw new tb.i();
    }

    public static final tb.z e(String str) {
        hc.t.e(str, "<this>");
        return f(str, 10);
    }

    public static final tb.z f(String str, int i10) {
        hc.t.e(str, "<this>");
        b.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char charAt = str.charAt(0);
        int i12 = 1;
        if (hc.t.f(charAt, 48) >= 0) {
            i12 = 0;
        } else if (length == 1 || charAt != '+') {
            return null;
        }
        int b10 = tb.z.b(i10);
        int i13 = 119304647;
        while (i12 < length) {
            int b11 = b.b(str.charAt(i12), i10);
            if (b11 < 0) {
                return null;
            }
            if (g0.a(i11, i13) > 0) {
                if (i13 == 119304647) {
                    i13 = g0.b(-1, b10);
                    if (g0.a(i11, i13) > 0) {
                    }
                }
                return null;
            }
            int b12 = tb.z.b(i11 * b10);
            int b13 = tb.z.b(tb.z.b(b11) + b12);
            if (g0.a(b13, b12) < 0) {
                return null;
            }
            i12++;
            i11 = b13;
        }
        return tb.z.a(i11);
    }

    public static final long g(String str) {
        hc.t.e(str, "<this>");
        tb.a0 h10 = h(str);
        if (h10 != null) {
            return h10.j();
        }
        w.k(str);
        throw new tb.i();
    }

    public static final tb.a0 h(String str) {
        hc.t.e(str, "<this>");
        return i(str, 10);
    }

    public static final tb.a0 i(String str, int i10) {
        int b10;
        hc.t.e(str, "<this>");
        b.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        long j10 = -1;
        int i11 = 0;
        char charAt = str.charAt(0);
        if (hc.t.f(charAt, 48) < 0) {
            if (length == 1 || charAt != '+') {
                return null;
            }
            i11 = 1;
        }
        long b11 = tb.a0.b(i10);
        long j11 = 0;
        long j12 = 512409557603043100L;
        while (i11 < length) {
            if (b.b(str.charAt(i11), i10) < 0) {
                return null;
            }
            if (g0.c(j11, j12) > 0) {
                if (j12 == 512409557603043100L) {
                    j12 = g0.d(j10, b11);
                    if (g0.c(j11, j12) > 0) {
                    }
                }
                return null;
            }
            long b12 = tb.a0.b(j11 * b11);
            long b13 = tb.a0.b(tb.a0.b(tb.z.b(b10) & 4294967295L) + b12);
            if (g0.c(b13, b12) < 0) {
                return null;
            }
            i11++;
            j11 = b13;
            j10 = -1;
        }
        return tb.a0.a(j11);
    }

    public static final short j(String str) {
        hc.t.e(str, "<this>");
        tb.c0 k10 = k(str);
        if (k10 != null) {
            return k10.j();
        }
        w.k(str);
        throw new tb.i();
    }

    public static final tb.c0 k(String str) {
        hc.t.e(str, "<this>");
        return l(str, 10);
    }

    public static final tb.c0 l(String str, int i10) {
        hc.t.e(str, "<this>");
        tb.z f10 = f(str, i10);
        if (f10 != null) {
            int j10 = f10.j();
            if (g0.a(j10, tb.z.b(65535)) <= 0) {
                return tb.c0.a(tb.c0.b((short) j10));
            }
            return null;
        }
        return null;
    }
}
