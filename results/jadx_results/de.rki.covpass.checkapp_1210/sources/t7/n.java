package t7;

import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public final class n implements Comparable<n> {

    /* renamed from: q */
    private static final v[] f21965q = {new l(), new e(), new f(), new i(), new j(), new k()};

    /* renamed from: c */
    private final b f21966c;

    /* renamed from: d */
    private final Object f21967d;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21968a;

        static {
            int[] iArr = new int[b.values().length];
            f21968a = iArr;
            try {
                iArr[b.Integer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21968a[b.Double.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21968a[b.EInteger.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21968a[b.EDecimal.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21968a[b.EFloat.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21968a[b.ERational.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        Integer,
        Double,
        EInteger,
        EDecimal,
        EFloat,
        ERational
    }

    n(b bVar, Object obj) {
        this.f21966c = bVar;
        this.f21967d = obj;
    }

    public static boolean A(o oVar) {
        if (B(oVar)) {
            return true;
        }
        if (!oVar.x1() && oVar.s1() == q.FloatingPoint) {
            return true;
        }
        if (oVar.x0(2) || oVar.x0(3)) {
            return oVar.s1() == q.ByteString;
        } else if (oVar.x0(4) || oVar.x0(5) || oVar.x0(264) || oVar.x0(265) || oVar.x0(268) || oVar.x0(269)) {
            return g(oVar, oVar.p1().s1());
        } else {
            if (!oVar.x0(30) && !oVar.x0(270)) {
                return false;
            }
            return h(oVar, oVar.p1().s1());
        }
    }

    private static boolean B(o oVar) {
        return !oVar.x1() && oVar.s1() == q.Integer;
    }

    private static boolean C(o oVar) {
        return B(oVar) || ((oVar.x0(2) || oVar.x0(3)) && oVar.s1() == q.ByteString);
    }

    private static n D(o oVar, int i10) {
        if (oVar.s1() != q.Array) {
            return null;
        }
        int D1 = oVar.D1();
        if (i10 == 270) {
            if (D1 != 3 || !B(oVar.j1(2))) {
                return null;
            }
        } else if (D1 != 2) {
            return null;
        }
        boolean z10 = false;
        if (!C(oVar.j1(0)) || !C(oVar.j1(1))) {
            return null;
        }
        u7.f t10 = t(oVar.j1(0));
        u7.f t11 = t(oVar.j1(1));
        if (t11.I1() <= 0) {
            return null;
        }
        u7.h g10 = u7.h.g(t10, t11);
        if (i10 == 270) {
            if (t10.I1() < 0 || !oVar.j1(2).y()) {
                return null;
            }
            int m10 = oVar.j1(2).m();
            switch (m10) {
                case 0:
                    break;
                case 1:
                    g10 = g10.x();
                    break;
                case 2:
                    if (t10.H1() && t11.C1(1) == 0) {
                        g10 = u7.h.W3;
                        break;
                    } else {
                        return null;
                    }
                    break;
                case 3:
                    if (t10.H1() && t11.C1(1) == 0) {
                        g10 = u7.h.f23229y;
                        break;
                    } else {
                        return null;
                    }
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    if (t11.C1(1) == 0) {
                        boolean z11 = m10 >= 6;
                        if (m10 == 5 || m10 == 7) {
                            z10 = true;
                        }
                        g10 = u7.h.h(t10, z11, z10);
                        break;
                    } else {
                        return null;
                    }
                    break;
                default:
                    return null;
            }
        }
        return p(g10);
    }

    private static n a(o oVar, int i10) {
        if (oVar.s1() != q.Array) {
            return null;
        }
        if (i10 == 268 || i10 == 269) {
            if (oVar.D1() != 3 || !B(oVar.j1(2))) {
                return null;
            }
        } else if (oVar.D1() != 2) {
            return null;
        }
        boolean z10 = false;
        if (i10 == 4 || i10 == 5) {
            if (!B(oVar.j1(0))) {
                return null;
            }
        } else if (!C(oVar.j1(0))) {
            return null;
        }
        if (!C(oVar.j1(1))) {
            return null;
        }
        u7.f t10 = t(oVar.j1(0));
        u7.f t11 = t(oVar.j1(1));
        boolean z11 = i10 == 4 || i10 == 264 || i10 == 268;
        u7.d p10 = z11 ? u7.d.p(t11, t10) : null;
        u7.e h10 = !z11 ? u7.e.h(t11, t10) : null;
        if (i10 == 268 || i10 == 269) {
            if (t11.I1() < 0 || !oVar.j1(2).y()) {
                return null;
            }
            int m10 = oVar.j1(2).m();
            switch (m10) {
                case 0:
                    break;
                case 1:
                    if (!z11) {
                        h10 = h10.D();
                        break;
                    } else {
                        p10 = p10.O();
                        break;
                    }
                case 2:
                    if (t10.H1() && t11.H1()) {
                        if (!z11) {
                            h10 = u7.e.W3;
                            break;
                        } else {
                            p10 = u7.d.W3;
                            break;
                        }
                    } else {
                        return null;
                    }
                case 3:
                    if (t10.H1() && t11.H1()) {
                        if (!z11) {
                            h10 = u7.e.f23219y;
                            break;
                        } else {
                            p10 = u7.d.f23212y;
                            break;
                        }
                    } else {
                        return null;
                    }
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    if (t10.H1()) {
                        if (!z11) {
                            boolean z12 = m10 >= 6;
                            if (m10 == 5 || m10 == 7) {
                                z10 = true;
                            }
                            h10 = u7.e.j(t11, z12, z10, null);
                            break;
                        } else {
                            boolean z13 = m10 >= 6;
                            if (m10 == 5 || m10 == 7) {
                                z10 = true;
                            }
                            p10 = u7.d.q(t11, z13, z10, null);
                            break;
                        }
                    } else {
                        return null;
                    }
                default:
                    return null;
            }
        }
        return z11 ? m(p10) : o(h10);
    }

    private static n b(o oVar) {
        u7.f fVar;
        if (oVar.s1() != q.ByteString) {
            return null;
        }
        boolean t02 = oVar.t0(3);
        byte[] j02 = oVar.j0();
        if (j02.length <= 7) {
            long j10 = 0;
            for (byte b10 : j02) {
                j10 = (j10 << 8) | (b10 & 255);
            }
            if (t02) {
                j10 = (-j10) - 1;
            }
            return new n(b.Integer, Long.valueOf(j10));
        }
        int length = j02.length;
        boolean z10 = true;
        if (((j02[0] >> 7) & 1) != 0) {
            length++;
        } else {
            z10 = false;
        }
        if (z10 || t02) {
            byte[] bArr = new byte[length];
            System.arraycopy(j02, 0, bArr, length - j02.length, j02.length);
            if (t02) {
                for (int length2 = length - j02.length; length2 < length; length2++) {
                    bArr[length2] = (byte) (~bArr[length2]);
                }
            }
            if (z10) {
                bArr[0] = t02 ? (byte) -1 : (byte) 0;
            }
            fVar = u7.f.X(bArr, false);
        } else {
            fVar = u7.f.X(j02, false);
        }
        return fVar.C() ? new n(b.Integer, Long.valueOf(fVar.u1())) : new n(b.EInteger, fVar);
    }

    private static boolean g(o oVar, int i10) {
        if (oVar.s1() != q.Array) {
            return false;
        }
        if (i10 == 268 || i10 == 269) {
            if (oVar.D1() != 3 || !B(oVar.j1(2))) {
                return false;
            }
        } else if (oVar.D1() != 2) {
            return false;
        }
        if (i10 == 4 || i10 == 5) {
            if (!B(oVar.j1(0))) {
                return false;
            }
        } else if (!C(oVar.j1(0))) {
            return false;
        }
        if (!C(oVar.j1(1))) {
            return false;
        }
        if (i10 != 268 && i10 != 269) {
            return true;
        }
        u7.f t10 = t(oVar.j1(0));
        u7.f t11 = t(oVar.j1(1));
        if (t11.I1() < 0 || !oVar.j1(2).y()) {
            return false;
        }
        switch (oVar.j1(2).m()) {
            case 0:
            case 1:
                return true;
            case 2:
            case 3:
                return t10.H1() && t11.H1();
            case 4:
            case 5:
            case 6:
            case 7:
                return t10.H1();
            default:
                return false;
        }
    }

    private static boolean h(o oVar, int i10) {
        if (oVar.s1() != q.Array) {
            return false;
        }
        int D1 = oVar.D1();
        if (i10 == 270) {
            if (D1 != 3 || !B(oVar.j1(2))) {
                return false;
            }
        } else if (D1 != 2) {
            return false;
        }
        if (!C(oVar.j1(0)) || !C(oVar.j1(1))) {
            return false;
        }
        u7.f t10 = t(oVar.j1(1));
        if (t10.I1() <= 0) {
            return false;
        }
        if (i10 != 270) {
            return true;
        }
        u7.f t11 = t(oVar.j1(0));
        if (t11.I1() < 0 || !oVar.j1(2).y()) {
            return false;
        }
        switch (oVar.j1(2).m()) {
            case 0:
            case 1:
                return true;
            case 2:
            case 3:
                return t11.H1() && t10.C1(1) == 0;
            case 4:
            case 5:
            case 6:
            case 7:
                return t10.C1(1) == 0;
            default:
                return false;
        }
    }

    public static n j(o oVar) {
        if (oVar == null) {
            return null;
        }
        if (B(oVar)) {
            return oVar.z() ? new n(b.Integer, Long.valueOf(oVar.o())) : new n(b.EInteger, oVar.h());
        } else if (!oVar.x1() && oVar.s1() == q.FloatingPoint) {
            return l(oVar.g());
        } else {
            if (oVar.x0(2) || oVar.x0(3)) {
                return b(oVar);
            }
            if (oVar.x0(4) || oVar.x0(5) || oVar.x0(264) || oVar.x0(265) || oVar.x0(268) || oVar.x0(269)) {
                return a(oVar, oVar.p1().s1());
            }
            if (!oVar.x0(30) && !oVar.x0(270)) {
                return null;
            }
            return D(oVar, oVar.p1().s1());
        }
    }

    static n l(long j10) {
        return new n(b.Double, Long.valueOf(j10));
    }

    static n m(u7.d dVar) {
        return new n(b.EDecimal, dVar);
    }

    static n o(u7.e eVar) {
        return new n(b.EFloat, eVar);
    }

    static n p(u7.h hVar) {
        return new n(b.ERational, hVar);
    }

    static v r(b bVar) {
        switch (a.f21968a[bVar.ordinal()]) {
            case 1:
                return f21965q[0];
            case 2:
                return f21965q[1];
            case 3:
                return f21965q[2];
            case 4:
                return f21965q[3];
            case 5:
                return f21965q[4];
            case 6:
                return f21965q[5];
            default:
                throw new IllegalStateException();
        }
    }

    private static u7.f t(o oVar) {
        if (B(oVar)) {
            return oVar.h();
        }
        n b10 = b(oVar);
        return b10.q().e(b10.s());
    }

    public u7.f E() {
        return q().e(s());
    }

    public int F() {
        if (v()) {
            return E().s1();
        }
        throw new ArithmeticException("Value is infinity or NaN");
    }

    public long G() {
        if (v()) {
            return E().u1();
        }
        throw new ArithmeticException("Value is infinity or NaN");
    }

    public String H() {
        switch (a.f21968a[this.f21966c.ordinal()]) {
            case 1:
                return t.D(((Long) this.f21967d).longValue());
            case 2:
                long longValue = ((Long) this.f21967d).longValue();
                return !t.m(longValue) ? "null" : t.M(t.o(longValue));
            case 3:
                return ((u7.f) this.f21967d).toString();
            case 4:
                u7.d dVar = (u7.d) this.f21967d;
                return (dVar.I() || dVar.J()) ? "null" : dVar.toString();
            case 5:
                u7.e eVar = (u7.e) this.f21967d;
                if (eVar.x() || eVar.y()) {
                    return "null";
                }
                if (!eVar.R() || eVar.O().a().compareTo(u7.f.Z(2500L)) <= 0) {
                    return eVar.toString();
                }
                long F = eVar.F();
                return !t.m(F) ? "null" : t.M(t.o(F));
            case 6:
                u7.d z10 = ((u7.h) this.f21967d).z(u7.c.f23187t.r());
                return !z10.h0() ? "null" : z10.toString();
            default:
                throw new IllegalStateException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (t7.t.n(r6) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
        if (r2 < r6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0094, code lost:
        if ((r2 ^ r1) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a9, code lost:
        if (r11 < 0) goto L48;
     */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(t7.n r11) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.n.compareTo(t7.n):int");
    }

    public boolean d() {
        v q10 = q();
        Object s10 = s();
        if (!q10.a(s10)) {
            return false;
        }
        long h10 = q10.h(s10);
        return h10 >= -2147483648L && h10 <= 2147483647L;
    }

    public v q() {
        return r(this.f21966c);
    }

    public Object s() {
        return this.f21967d;
    }

    public String toString() {
        int i10 = a.f21968a[this.f21966c.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return t.o(((Long) this.f21967d).longValue());
            }
            Object obj = this.f21967d;
            return obj == null ? BuildConfig.FLAVOR : obj.toString();
        }
        return t.D(((Long) this.f21967d).longValue());
    }

    public boolean v() {
        int i10 = a.f21968a[this.f21966c.ordinal()];
        if (i10 == 1 || i10 == 3) {
            return true;
        }
        return !w() && !y();
    }

    public boolean w() {
        return q().l(s());
    }

    public boolean x() {
        int i10 = a.f21968a[this.f21966c.ordinal()];
        if (i10 == 1 || i10 == 3) {
            return true;
        }
        return q().j(s());
    }

    public boolean y() {
        return q().c(s());
    }

    public boolean z() {
        return q().f(s());
    }
}
