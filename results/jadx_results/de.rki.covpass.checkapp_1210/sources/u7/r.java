package u7;

import java.util.Objects;
/* loaded from: classes.dex */
class r<T> implements n<T> {

    /* renamed from: d */
    private static final int[] f23271d = {Integer.MAX_VALUE, 1073741823, 536870911, 268435455, 134217727, 67108863, 33554431, 16777215, 8388607, 4194303, 2097151, 1048575, 524287, 262143, 131071, 65535, 32767, 16383, 8191, 4095, 2047, 1023, 511, 255, 127, 63, 31, 15, 7, 3, 1};

    /* renamed from: e */
    private static final long[] f23272e = {Long.MAX_VALUE, 4611686018427387903L, 2305843009213693951L, 1152921504606846975L, 576460752303423487L, 288230376151711743L, 144115188075855871L, 72057594037927935L, 36028797018963967L, 18014398509481983L, 9007199254740991L, 4503599627370495L, 2251799813685247L, 1125899906842623L, 562949953421311L, 281474976710655L, 140737488355327L, 70368744177663L, 35184372088831L, 17592186044415L, 8796093022207L, 4398046511103L, 2199023255551L, 1099511627775L, 549755813887L, 274877906943L, 137438953471L, 68719476735L, 34359738367L, 17179869183L, 8589934591L, 4294967295L, 2147483647L, 1073741823, 536870911, 268435455, 134217727, 67108863, 33554431, 16777215, 8388607, 4194303, 2097151, 1048575, 524287, 262143, 131071, 65535, 32767, 16383, 8191, 4095, 2047, 1023, 511, 255, 127, 63, 31, 15, 7, 3, 1};

    /* renamed from: f */
    private static final int[] f23273f = {Integer.MAX_VALUE, 214748364, 21474836, 2147483, 214748, 21474, 2147, 214, 21, 2};

    /* renamed from: g */
    private static final f f23274g = f.Y(0).n1(f.Z(1));

    /* renamed from: h */
    private static final int[] f23275h = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: i */
    private static final long[] f23276i = {Long.MAX_VALUE, 922337203685477580L, 92233720368547758L, 9223372036854775L, 922337203685477L, 92233720368547L, 9223372036854L, 922337203685L, 92233720368L, 9223372036L, 922337203, 92233720, 9223372, 922337, 92233, 9223, 922, 92, 9};

    /* renamed from: j */
    private static final long[] f23277j = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    /* renamed from: k */
    private static f f23278k = f.Z(5726623058L);

    /* renamed from: l */
    private static final int[] f23279l = {0, 0, 100, 158, 200, 232, 258, 280, 300, 316, 332};

    /* renamed from: m */
    private static final c f23280m = c.f23191x.p(i.HalfEven);

    /* renamed from: a */
    private final o<T> f23281a;

    /* renamed from: b */
    private final int f23282b;

    /* renamed from: c */
    private final int f23283c;

    public r(o<T> oVar) {
        this.f23281a = oVar;
        this.f23282b = oVar.f();
        this.f23283c = oVar.h();
    }

    private static boolean A(c cVar) {
        return cVar == null || cVar == c.f23191x || (!cVar.x() && !cVar.A() && cVar.D() == 0 && !cVar.y());
    }

    private T B(T t10, c cVar, l lVar, l lVar2) {
        T b10 = b(t10, cVar);
        if (b10 == null || (this.f23281a.e(b10) & 14) != 0) {
            return b10;
        }
        f b11 = this.f23281a.b(b10);
        l q10 = l.q(this.f23281a.j(b10));
        int i10 = this.f23283c;
        boolean z10 = false;
        if (b11.H1()) {
            q10 = new l(0);
        } else {
            b11 = q.v(b11, q10, i10, lVar == null ? null : this.f23281a.o(b11), lVar, lVar2);
        }
        int e10 = this.f23281a.e(t10);
        T d10 = this.f23281a.d(b11, q10.F(), e10);
        if (cVar != null && cVar.t()) {
            c k10 = cVar.k();
            d10 = b(d10, k10);
            if (cVar.y()) {
                cVar.G((k10.w() & (-33)) | cVar.w());
            }
        }
        if ((e10 & 1) != 0) {
            z10 = true;
        }
        return x(d10, z10);
    }

    private static <TMath> f C(f fVar, f fVar2, f fVar3, o<TMath> oVar) {
        if (fVar.I1() == 0) {
            return f.Y(0);
        }
        l a10 = l.q(fVar2).C(fVar3).a();
        f o02 = fVar.o0();
        f F = a10.F();
        if (oVar.h() <= 10) {
            if (o02.d(F.J0(f23279l[oVar.h()]).L(100)).C1(Integer.MAX_VALUE) > 0) {
                return null;
            }
        }
        return oVar.a(fVar, a10);
    }

    private static <TMath> m D(m mVar, m mVar2, m mVar3, o<TMath> oVar) {
        if (mVar.K() == 0) {
            return m.r(0);
        }
        m a10 = mVar2.z(mVar3).a();
        f o02 = mVar.B().o0();
        f B = a10.B();
        if (oVar.h() <= 10) {
            if (o02.d(B.J0(f23279l[oVar.h()]).L(100)).C1(Integer.MAX_VALUE) > 0) {
                return null;
            }
        }
        return oVar.k(mVar, a10);
    }

    private T E(T t10, c cVar) {
        boolean z10;
        int e10;
        f b10 = this.f23281a.b(t10);
        if (!b10.H1() && cVar != null && cVar.A()) {
            l q10 = l.q(cVar.B());
            if (this.f23281a.o(b10).compareTo(q10) >= 0) {
                f R = R(f.Y(1), q10);
                if (R == null) {
                    return N(cVar, "Result requires too much memory");
                }
                if (b10.compareTo(R) >= 0) {
                    b10 = b10.T0(R);
                    z10 = true;
                    e10 = this.f23281a.e(t10);
                    if (z10 && (e10 & 4) != 0) {
                        return t10;
                    }
                    return this.f23281a.d(b10, f.Y(0), (e10 & 1) | 4);
                }
            }
        }
        z10 = false;
        e10 = this.f23281a.e(t10);
        if (z10) {
        }
        return this.f23281a.d(b10, f.Y(0), (e10 & 1) | 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r8.d(2) == 1) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r2 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
        if ((r1 | r2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
        if ((r1 | r2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005a, code lost:
        if ((r1 | r2) != 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0089, code lost:
        if (r8.d(2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008c, code lost:
        return false | r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1 >= (r0 / 2)) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
        r6 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean F(u7.p r8, u7.i r9, boolean r10) {
        /*
            r7 = this;
            int r0 = r7.f23283c
            int r1 = r8.h()
            int r2 = r8.a()
            u7.i r3 = u7.i.HalfUp
            r4 = 0
            r5 = 2
            r6 = 1
            if (r9 != r3) goto L19
            int r0 = r0 / r5
            if (r1 < r0) goto L15
            goto L16
        L15:
            r6 = r4
        L16:
            r4 = r4 | r6
            goto L8c
        L19:
            u7.i r3 = u7.i.HalfEven
            if (r9 != r3) goto L2f
            int r0 = r0 / r5
            if (r1 < r0) goto L8c
            if (r1 > r0) goto L2c
            if (r2 == 0) goto L25
            goto L2c
        L25:
            int r8 = r8.d(r5)
            if (r8 != r6) goto L15
            goto L16
        L2c:
            r4 = r6
            goto L8c
        L2f:
            u7.i r3 = u7.i.HalfDown
            if (r9 != r3) goto L3e
            int r0 = r0 / r5
            if (r1 > r0) goto L3c
            if (r1 != r0) goto L3b
            if (r2 == 0) goto L3b
            goto L3c
        L3b:
            r6 = r4
        L3c:
            r4 = r4 | r6
            goto L8c
        L3e:
            u7.i r3 = u7.i.Ceiling
            if (r9 != r3) goto L49
            if (r10 != 0) goto L3b
            r8 = r1 | r2
            if (r8 == 0) goto L3b
            goto L3c
        L49:
            u7.i r3 = u7.i.Floor
            if (r9 != r3) goto L54
            if (r10 == 0) goto L3b
            r8 = r1 | r2
            if (r8 == 0) goto L3b
            goto L3c
        L54:
            u7.i r10 = u7.i.Up
            if (r9 != r10) goto L5d
            r8 = r1 | r2
            if (r8 == 0) goto L15
            goto L16
        L5d:
            u7.i r10 = u7.i.Odd
            if (r9 == r10) goto L81
            u7.i r10 = u7.i.OddOrZeroFiveUp
            if (r9 != r10) goto L68
            if (r0 != r5) goto L68
            goto L81
        L68:
            u7.i r3 = u7.i.ZeroFiveUp
            if (r9 == r3) goto L70
            if (r9 != r10) goto L8c
            if (r0 == r5) goto L8c
        L70:
            r9 = r1 | r2
            if (r9 == 0) goto L8c
            if (r0 != r5) goto L77
            goto L2c
        L77:
            int r8 = r8.d(r0)
            if (r8 == 0) goto L2c
            int r0 = r0 / r5
            if (r8 != r0) goto L8c
            goto L2c
        L81:
            r9 = r1 | r2
            if (r9 == 0) goto L3b
            int r8 = r8.d(r5)
            if (r8 != 0) goto L3b
            goto L3c
        L8c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.r.F(u7.p, u7.i, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        if ((r14 & 1) != 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
        if (r11 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0041, code lost:
        if ((r10 | r11) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004b, code lost:
        if ((r10 | r11) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0053, code lost:
        if ((r10 | r11) != 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007f, code lost:
        if ((r14 & 1) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0082, code lost:
        return false | r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r10 >= (r0 / 2)) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean G(int r10, int r11, u7.i r12, boolean r13, long r14) {
        /*
            r9 = this;
            int r0 = r9.f23283c
            u7.i r1 = u7.i.HalfUp
            r2 = 2
            r3 = 0
            r4 = 1
            if (r12 != r1) goto L11
            int r0 = r0 / r2
            if (r10 < r0) goto Ld
            goto Le
        Ld:
            r4 = r3
        Le:
            r3 = r3 | r4
            goto L82
        L11:
            u7.i r1 = u7.i.HalfEven
            r5 = 0
            r7 = 1
            if (r12 != r1) goto L2b
            int r0 = r0 / r2
            if (r10 < r0) goto L82
            if (r10 > r0) goto L28
            if (r11 == 0) goto L21
            goto L28
        L21:
            long r10 = r14 & r7
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 == 0) goto Ld
            goto Le
        L28:
            r3 = r4
            goto L82
        L2b:
            u7.i r1 = u7.i.HalfDown
            if (r12 != r1) goto L3a
            int r0 = r0 / r2
            if (r10 > r0) goto L38
            if (r10 != r0) goto L37
            if (r11 == 0) goto L37
            goto L38
        L37:
            r4 = r3
        L38:
            r3 = r3 | r4
            goto L82
        L3a:
            u7.i r1 = u7.i.Ceiling
            if (r12 != r1) goto L44
            if (r13 != 0) goto L37
            r10 = r10 | r11
            if (r10 == 0) goto L37
            goto L38
        L44:
            u7.i r1 = u7.i.Floor
            if (r12 != r1) goto L4e
            if (r13 == 0) goto L37
            r10 = r10 | r11
            if (r10 == 0) goto L37
            goto L38
        L4e:
            u7.i r13 = u7.i.Up
            if (r12 != r13) goto L56
            r10 = r10 | r11
            if (r10 == 0) goto Ld
            goto Le
        L56:
            u7.i r13 = u7.i.Odd
            if (r12 == r13) goto L78
            u7.i r13 = u7.i.OddOrZeroFiveUp
            if (r12 != r13) goto L61
            if (r0 != r2) goto L61
            goto L78
        L61:
            u7.i r1 = u7.i.ZeroFiveUp
            if (r12 == r1) goto L69
            if (r12 != r13) goto L82
            if (r0 == r2) goto L82
        L69:
            r10 = r10 | r11
            if (r10 == 0) goto L82
            if (r0 != r2) goto L6f
            goto L28
        L6f:
            long r10 = (long) r0
            long r14 = r14 % r10
            int r10 = (int) r14
            if (r10 == 0) goto L28
            int r0 = r0 / r2
            if (r10 != r0) goto L82
            goto L28
        L78:
            r10 = r10 | r11
            if (r10 == 0) goto L37
            long r10 = r14 & r7
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 != 0) goto L37
            goto L38
        L82:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.r.G(int, int, u7.i, boolean, long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
        if (r7 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
        if ((r6 | r7) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        if ((r6 | r7) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0050, code lost:
        if ((r6 | r7) != 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0081, code lost:
        if (r10.J() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0084, code lost:
        return false | r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r6 >= (r0 / 2)) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean H(int r6, int r7, u7.i r8, boolean r9, u7.l r10) {
        /*
            r5 = this;
            int r0 = r5.f23283c
            u7.i r1 = u7.i.HalfUp
            r2 = 2
            r3 = 0
            r4 = 1
            if (r8 != r1) goto L11
            int r0 = r0 / r2
            if (r6 < r0) goto Ld
            goto Le
        Ld:
            r4 = r3
        Le:
            r3 = r3 | r4
            goto L84
        L11:
            u7.i r1 = u7.i.HalfEven
            if (r8 != r1) goto L28
            int r0 = r0 / r2
            if (r6 < r0) goto L84
            if (r6 > r0) goto L25
            if (r7 == 0) goto L1d
            goto L25
        L1d:
            boolean r6 = r10.J()
            r6 = r6 ^ r4
            r3 = r3 | r6
            goto L84
        L25:
            r3 = r4
            goto L84
        L28:
            u7.i r1 = u7.i.HalfDown
            if (r8 != r1) goto L37
            int r0 = r0 / r2
            if (r6 > r0) goto L35
            if (r6 != r0) goto L34
            if (r7 == 0) goto L34
            goto L35
        L34:
            r4 = r3
        L35:
            r3 = r3 | r4
            goto L84
        L37:
            u7.i r1 = u7.i.Ceiling
            if (r8 != r1) goto L41
            if (r9 != 0) goto L34
            r6 = r6 | r7
            if (r6 == 0) goto L34
            goto L35
        L41:
            u7.i r1 = u7.i.Floor
            if (r8 != r1) goto L4b
            if (r9 == 0) goto L34
            r6 = r6 | r7
            if (r6 == 0) goto L34
            goto L35
        L4b:
            u7.i r9 = u7.i.Up
            if (r8 != r9) goto L53
            r6 = r6 | r7
            if (r6 == 0) goto Ld
            goto Le
        L53:
            u7.i r9 = u7.i.Odd
            if (r8 == r9) goto L7a
            u7.i r9 = u7.i.OddOrZeroFiveUp
            if (r8 != r9) goto L5e
            if (r0 != r2) goto L5e
            goto L7a
        L5e:
            u7.i r1 = u7.i.ZeroFiveUp
            if (r8 == r1) goto L66
            if (r8 != r9) goto L84
            if (r0 == r2) goto L84
        L66:
            r6 = r6 | r7
            if (r6 == 0) goto L84
            if (r0 != r2) goto L6c
            goto L25
        L6c:
            u7.m r6 = u7.m.q(r10)
            int r6 = r6.v(r0)
            if (r6 == 0) goto L25
            int r0 = r0 / r2
            if (r6 != r0) goto L84
            goto L25
        L7a:
            r6 = r6 | r7
            if (r6 == 0) goto L34
            boolean r6 = r10.J()
            if (r6 == 0) goto L34
            goto L35
        L84:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.r.H(int, int, u7.i, boolean, u7.l):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:424:0x0647, code lost:
        if (r13.I() == false) goto L433;
     */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x07b7  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x07c8 A[LOOP:0: B:519:0x07c8->B:521:0x07d6, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:524:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x099e  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x0a5c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:689:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x0ace  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x0b12  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private T I(T r31, int r32, int r33, u7.l r34, boolean r35, u7.c r36) {
        /*
            Method dump skipped, instructions count: 2849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.r.I(java.lang.Object, int, int, u7.l, boolean, u7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private T J(u7.f r9, u7.f r10, u7.f r11, u7.f r12, u7.l r13, boolean r14, u7.c r15) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.r.J(u7.f, u7.f, u7.f, u7.f, u7.l, boolean, u7.c):java.lang.Object");
    }

    private int[] K(f fVar, f fVar2, c cVar) {
        int i10;
        int i11;
        i C = cVar == null ? i.HalfEven : cVar.C();
        if (fVar.H1()) {
            i11 = 0;
        } else if (C == i.HalfDown || C == i.HalfUp || C == i.HalfEven) {
            int q10 = q(fVar, fVar2);
            if (q10 == 0) {
                i11 = this.f23283c / 2;
                i10 = 0;
            } else if (q10 > 0) {
                i11 = this.f23283c / 2;
                i10 = 1;
            } else {
                i10 = 1;
                i11 = 0;
            }
            return new int[]{i11, i10};
        } else if (C == i.None) {
            return null;
        } else {
            i11 = 1;
        }
        i10 = i11;
        return new int[]{i11, i10};
    }

    private T L(c cVar, boolean z10) {
        if (cVar != null && cVar.y()) {
            cVar.G(cVar.w() | 128);
        }
        if (this.f23282b != 0) {
            return this.f23281a.d(f.Y(0), f.Y(0), (z10 ? 1 : 0) | 2);
        }
        throw new ArithmeticException("Division by zero");
    }

    private T M(c cVar) {
        if (cVar != null && cVar.y()) {
            cVar.G(cVar.w() | 64);
        }
        if (this.f23282b != 0) {
            return this.f23281a.d(f.Y(0), f.Y(0), 4);
        }
        throw new ArithmeticException("Invalid operation");
    }

    private T N(c cVar, String str) {
        if (cVar != null && cVar.y()) {
            cVar.G(cVar.w() | 64);
        }
        if (this.f23282b != 0) {
            return this.f23281a.d(f.Y(0), f.Y(0), 4);
        }
        throw new ArithmeticException(str);
    }

    private T O(c cVar, boolean z10, boolean z11) {
        return b(this.f23281a.d(z11 ? f.Y(0) : f.Y(1), cVar.v().n1(cVar.B().l1(1)).l1(2), z10 ? 1 : 0), cVar);
    }

    private T P(T t10, c cVar) {
        if (cVar != null && cVar.y()) {
            cVar.G(cVar.w() | 64);
        }
        return E(t10, cVar);
    }

    private static l Q(m mVar) {
        return mVar.h() ? new l(mVar.D()) : l.q(mVar.B());
    }

    private f R(f fVar, l lVar) {
        if (fVar.H1()) {
            return fVar;
        }
        if (!lVar.j()) {
            l q10 = l.q(f23278k);
            if (this.f23283c != 10 || lVar.compareTo(q10) > 0) {
                return null;
            }
        }
        return this.f23281a.a(fVar, lVar);
    }

    private m S(m mVar, m mVar2) {
        f a10;
        if (mVar.J()) {
            return mVar;
        }
        if (!mVar2.h()) {
            m p10 = m.p(f23278k);
            if (this.f23283c != 10 || mVar2.compareTo(p10) > 0) {
                return null;
            }
            a10 = this.f23281a.a(mVar.B(), l.q(mVar2.B()));
        } else {
            a10 = this.f23281a.a(mVar.B(), new l(mVar2.D()));
        }
        return m.p(a10);
    }

    private T j(m mVar, m mVar2, m mVar3, int i10, int i11, c cVar) {
        m mVar4;
        int i12;
        int i13 = 1;
        int i14 = (i10 & 1) != 0 ? 1 : 0;
        int i15 = (i11 & 1) != 0 ? 1 : 0;
        if (i14 != i15) {
            mVar4 = mVar.z(mVar2);
            int K = mVar4.K();
            i12 = (K == 0 ? i15 : K < 0 ? 1 : 0) ^ i14;
            if (K < 0) {
                mVar4 = mVar4.w();
            }
        } else {
            mVar4 = mVar.d(mVar2);
            i12 = i14;
        }
        if (i12 != 0 && mVar4.J()) {
            if ((i14 == 0 || i15 == 0) && ((i14 ^ i15) == 0 || cVar == null || cVar.C() != i.Floor)) {
                i13 = 0;
            }
            i12 &= i13;
        }
        return this.f23281a.l(mVar4, mVar3, i12);
    }

    private T k(m mVar, m mVar2, m mVar3, int i10, int i11, c cVar) {
        m mVar4;
        int i12;
        int i13 = 1;
        int i14 = (i10 & 1) != 0 ? 1 : 0;
        int i15 = (i11 & 1) != 0 ? 1 : 0;
        if (i14 != i15) {
            mVar4 = m.A(mVar, mVar2);
            int K = mVar4.K();
            if (K < 0) {
                i12 = i14 ^ 1;
                mVar4 = mVar4.w();
            } else if (K == 0) {
                i12 = i14 ^ i15;
                if (i12 != 0) {
                    if ((i14 == 0 || i15 == 0) && (i12 == 0 || cVar == null || cVar.C() != i.Floor)) {
                        i13 = 0;
                    }
                    i12 &= i13;
                }
            }
            i14 = i12;
        } else {
            mVar4 = m.g(mVar, mVar2);
            if (i14 != 0 && mVar4.J()) {
                if ((i14 == 0 || i15 == 0) && ((i14 ^ i15) == 0 || cVar == null || cVar.C() != i.Floor)) {
                    i13 = 0;
                }
                i14 &= i13;
            }
        }
        return this.f23281a.l(mVar4, mVar3, i14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
        if (r11 <= (Integer.MAX_VALUE - r15)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bd, code lost:
        if (r11 <= (Integer.MAX_VALUE - r15)) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0212 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x022e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private T l(int r24, u7.m r25, u7.m r26, u7.m r27, u7.m r28, u7.m r29, int r30, int r31, u7.c r32) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.r.l(int, u7.m, u7.m, u7.m, u7.m, u7.m, int, int, u7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private T m(long r30, u7.m r32, u7.m r33, u7.m r34, u7.m r35, u7.m r36, int r37, int r38, u7.c r39) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.r.m(long, u7.m, u7.m, u7.m, u7.m, u7.m, int, int, u7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private T n(u7.m r19, u7.m r20, u7.m r21, u7.m r22, int r23, int r24, u7.c r25, int r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.r.n(u7.m, u7.m, u7.m, u7.m, int, int, u7.c, int, boolean):java.lang.Object");
    }

    private static int o(int i10, int i11, int i12, int i13, m mVar, m mVar2, int i14) {
        if (i10 >= -1073741822 && i10 <= 1073741822 && i11 >= -1073741822 && i11 <= 1073741822) {
            int i15 = i10 > i11 ? i10 - i11 : i11 - i10;
            if (i15 <= 9 && i14 == 10) {
                int i16 = f23275h[i15];
                int i17 = f23273f[i15];
                if (i12 > 0) {
                    int D = mVar.D();
                    int D2 = mVar2.D();
                    if (D <= i17) {
                        int i18 = D * i16;
                        if (i18 == D2) {
                            return 0;
                        }
                        return i18 < D2 ? -i13 : i13;
                    }
                } else {
                    int D3 = mVar.D();
                    int D4 = mVar2.D();
                    if (D4 <= i17) {
                        int i19 = D4 * i16;
                        if (D3 == i19) {
                            return 0;
                        }
                        return D3 < i19 ? -i13 : i13;
                    }
                }
            } else if (i15 <= 30 && i14 == 2) {
                int i20 = f23271d[i15];
                if (i12 > 0) {
                    int D5 = mVar.D();
                    int D6 = mVar2.D();
                    if ((i20 & D5) == D5) {
                        int i21 = D5 << i15;
                        if (i21 == D6) {
                            return 0;
                        }
                        return i21 < D6 ? -i13 : i13;
                    }
                } else {
                    int D7 = mVar.D();
                    int D8 = mVar2.D();
                    if ((i20 & D8) == D8) {
                        int i22 = D8 << i15;
                        if (D7 == i22) {
                            return 0;
                        }
                        return D7 < i22 ? -i13 : i13;
                    }
                }
            }
        }
        return 2;
    }

    private static int p(int i10, int i11, int i12, int i13, m mVar, m mVar2, int i14) {
        if (i10 >= -1073741822 && i10 <= 1073741822 && i11 >= -1073741822 && i11 <= 1073741822) {
            long j10 = i10 > i11 ? i10 - i11 : i11 - i10;
            if (j10 <= 18 && i14 == 10) {
                int i15 = (int) j10;
                long j11 = f23277j[i15];
                long j12 = f23276i[i15];
                long E = mVar.E();
                long E2 = mVar2.E();
                if (i12 > 0) {
                    if (E <= j12) {
                        int i16 = ((E * j11) > E2 ? 1 : ((E * j11) == E2 ? 0 : -1));
                        if (i16 == 0) {
                            return 0;
                        }
                        return i16 < 0 ? -i13 : i13;
                    }
                } else if (E2 <= j12) {
                    int i17 = (E > (E2 * j11) ? 1 : (E == (E2 * j11) ? 0 : -1));
                    if (i17 == 0) {
                        return 0;
                    }
                    return i17 < 0 ? -i13 : i13;
                }
            } else if (j10 <= 62 && i14 == 2) {
                int i18 = (int) j10;
                long j13 = f23272e[i18];
                if (i12 > 0) {
                    long E3 = mVar.E();
                    long E4 = mVar2.E();
                    if ((j13 & E3) == E3) {
                        int i19 = ((E3 << i18) > E4 ? 1 : ((E3 << i18) == E4 ? 0 : -1));
                        if (i19 == 0) {
                            return 0;
                        }
                        return i19 < 0 ? -i13 : i13;
                    }
                } else {
                    long E5 = mVar.E();
                    long E6 = mVar2.E();
                    if ((j13 & E6) == E6) {
                        int i20 = (E5 > (E6 << i18) ? 1 : (E5 == (E6 << i18) ? 0 : -1));
                        if (i20 == 0) {
                            return 0;
                        }
                        return i20 < 0 ? -i13 : i13;
                    }
                }
            }
        }
        return 2;
    }

    private static int q(f fVar, f fVar2) {
        long p02 = fVar.p0();
        long p03 = fVar2.p0();
        if (p02 != Long.MAX_VALUE && p03 != Long.MAX_VALUE) {
            if (p03 - 1 > p02) {
                return -1;
            }
            if (p02 - 1 > p03) {
                return 1;
            }
        }
        int compareTo = fVar.compareTo(fVar2.c1(1));
        if (compareTo != 0 || fVar2.F1()) {
            return compareTo;
        }
        return -1;
    }

    private static int r(int i10, int i11) {
        if ((i10 & 12) != 0) {
            return (i11 & 12) != 0 ? 0 : 1;
        } else if ((i11 & 12) != 0) {
            return -1;
        } else {
            if ((i10 & 2) != 0) {
                if ((i10 & 3) == (i11 & 3)) {
                    return 0;
                }
                return (i10 & 1) == 0 ? 1 : -1;
            } else if ((i11 & 2) == 0) {
                return 2;
            } else {
                if ((i10 & 3) == (i11 & 3)) {
                    return 0;
                }
                return (i11 & 1) == 0 ? -1 : 1;
            }
        }
    }

    private static <TMath> int s(TMath tmath, TMath tmath2, boolean z10, o<TMath> oVar) {
        int p10;
        int n10 = oVar.n(tmath);
        int n11 = oVar.n(tmath2);
        if (n10 != n11) {
            return n10 < n11 ? -1 : 1;
        } else if (n11 == 0 || n10 == 0) {
            return 0;
        } else {
            m g10 = oVar.g(tmath);
            m g11 = oVar.g(tmath2);
            m i10 = oVar.i(tmath);
            m i11 = oVar.i(tmath2);
            int compareTo = g10.compareTo(g11);
            int compareTo2 = i10.compareTo(i11);
            if (compareTo2 == 0) {
                return n10 < 0 ? -compareTo : compareTo;
            } else if (compareTo == 0) {
                return n10 < 0 ? -compareTo2 : compareTo2;
            } else {
                if (g10.h() && g11.h()) {
                    if (i10.h() && i11.h()) {
                        int o10 = o(g10.D(), g11.D(), compareTo, n10, i10, i11, oVar.h());
                        if (o10 <= 1) {
                            return o10;
                        }
                    } else if (i10.j() && i11.j() && (p10 = p(g10.D(), g11.D(), compareTo, n10, i10, i11, oVar.h())) <= 1) {
                        return p10;
                    }
                }
                return t(g10.B(), g11.B(), compareTo, n10, i10.B(), i11.B(), oVar, z10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static <TMath> int t(u7.f r17, u7.f r18, int r19, int r20, u7.f r21, u7.f r22, u7.o<TMath> r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.r.t(u7.f, u7.f, int, int, u7.f, u7.f, u7.o, boolean):int");
    }

    private l u(l lVar) {
        l lVar2;
        int i10 = this.f23283c;
        if (i10 == 2) {
            return lVar;
        }
        if (i10 == 10 && lVar.l(2135) <= 0) {
            lVar2 = new l(((lVar.G() * 631305) >> 21) + 1);
        } else if (this.f23283c != 10 || lVar.l(6432162) > 0) {
            return this.f23281a.o(f.Y(1).b1(lVar.F()).l1(1));
        } else {
            lVar2 = new l(((int) ((lVar.G() * 661971961083L) >> 41)) + 1);
        }
        return lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private T v(T t10, T t11, c cVar, int i10, f fVar) {
        String str;
        f fVar2;
        l lVar;
        int i11;
        int i12;
        String str2;
        boolean z10;
        f fVar3;
        l lVar2;
        f fVar4;
        int i13;
        int i14;
        char c10;
        T w9 = w(t10, t11, cVar);
        if (w9 != null) {
            return w9;
        }
        int n10 = this.f23281a.n(t10);
        boolean z11 = false;
        int i15 = 1;
        if (this.f23281a.n(t11) == 0) {
            if (n10 == 0) {
                return M(cVar);
            }
            boolean z12 = (this.f23281a.e(t10) & 1) != 0;
            if ((this.f23281a.e(t11) & 1) != 0) {
                z11 = true;
            }
            return L(cVar, z12 ^ z11);
        }
        int i16 = this.f23283c;
        if (n10 == 0) {
            if (i10 == 1) {
                return this.f23281a.d(f.Y(0), fVar, (this.f23281a.e(t10) & 1) ^ (this.f23281a.e(t11) & 1));
            }
            return b(this.f23281a.d(f.Y(0), this.f23281a.j(t10).n1(this.f23281a.j(t11)), (this.f23281a.e(t10) & 1) ^ (this.f23281a.e(t11) & 1)), cVar);
        }
        f b10 = this.f23281a.b(t10);
        f b11 = this.f23281a.b(t11);
        m g10 = this.f23281a.g(t10);
        m g11 = this.f23281a.g(t11);
        int i17 = (this.f23281a.e(t10) & 1) != (this.f23281a.e(t11) & 1) ? 1 : 0;
        l C = m.A(g10, g11).C();
        f Y = (cVar == null || !cVar.A()) ? f.Y(0) : cVar.B();
        if (i10 == 1) {
            l q10 = l.q(fVar);
            if (cVar != null && cVar.y() && q10.compareTo(C) > 0) {
                cVar.G(2 | cVar.w());
            }
            if (C.compareTo(q10) <= 0) {
                l B = q10.m().B(C);
                f[] K = b10.K(b11);
                return J(K[0], K[1], b11, fVar, B, i17, cVar);
            } else if (cVar != null && cVar.B().I1() != 0 && C.m().D(8).H(Y) > 0) {
                return N(cVar, "Result can't fit the precision");
            } else {
                f R = R(b10, C.m().B(q10));
                if (R == null) {
                    return N(cVar, "Result requires too much memory");
                }
                f[] K2 = R.K(b11);
                return J(K2[0], K2[1], b11, fVar, new l(0), i17, cVar);
            }
        }
        if (i10 == 0) {
            boolean z13 = this.f23283c == 2 && g11.l(0) == 0 && g10.l(0) == 0 && cVar != null && cVar.A() && cVar.B().C1(53) <= 0 && b10.C() && b11.C();
            if (z13) {
                f a10 = b10.a();
                f a11 = b11.a();
                int s12 = cVar.B().s1();
                z10 = z13;
                int p02 = (int) a10.p0();
                str2 = "Rounding was required";
                int p03 = (int) b11.p0();
                if (p02 <= p03) {
                    i14 = (p03 - p02) + s12 + 1;
                    c10 = 0;
                } else {
                    c10 = 0;
                    i14 = Math.max(0, (s12 + 1) - (p02 - p03));
                }
                f[] K3 = a10.a1(i14).K(a11);
                fVar3 = K3[c10];
                fVar4 = K3[1];
                if (cVar == c.f23185r && fVar3.C() && fVar4.C()) {
                    long u12 = fVar3.u1();
                    long u13 = fVar4.u1();
                    int i18 = -i14;
                    if (u12 >= 9007199254740992L) {
                        while (u12 >= 18014398509481984L) {
                            u13 |= u12 & 1;
                            u12 >>= 1;
                            i18++;
                        }
                        long j10 = (!((u12 & 3) == 3 && u13 == 0) && ((u12 & 1) == 0 || u13 == 0)) ? u12 >> 1 : (u12 >> 1) + 1;
                        int i19 = i18 + 1;
                        while (j10 >= 9007199254740992L) {
                            j10 >>= 1;
                            i19++;
                        }
                        return this.f23281a.d(f.Z(j10), f.Z(i19), i17);
                    }
                }
                if (cVar == c.f23184q && fVar3.C() && fVar4.C()) {
                    long u14 = fVar3.u1();
                    long u15 = fVar4.u1();
                    int i20 = -i14;
                    if (u14 >= 16777216) {
                        while (u14 >= 33554432) {
                            u15 |= u14 & 1;
                            u14 >>= 1;
                            i20++;
                        }
                        long j11 = (!((u14 & 3) == 3 && u15 == 0) && ((u14 & 1) == 0 || u15 == 0)) ? u14 >> 1 : (u14 >> 1) + 1;
                        int i21 = i20 + 1;
                        while (j11 >= 16777216) {
                            j11 >>= 1;
                            i21++;
                        }
                        return this.f23281a.d(f.Z(j11), f.Z(i21), i17);
                    }
                }
                lVar2 = new l(-i14);
            } else {
                z10 = z13;
                str2 = "Rounding was required";
                fVar4 = null;
                lVar2 = null;
                fVar3 = null;
            }
            if (!z10) {
                f[] K4 = b10.K(b11);
                fVar3 = K4[0];
                fVar4 = K4[1];
                if (fVar4.H1()) {
                    return b(this.f23281a.l(m.p(fVar3.a()), m.q(C), i17), cVar);
                }
            }
            if (cVar != null && cVar.A()) {
                if (!z10) {
                    l q11 = l.q(cVar.B());
                    l[] h10 = q.h(this.f23281a, b10);
                    l[] h11 = q.h(this.f23281a, b11);
                    if (h10[0].m().B(h11[1]).compareTo(q11) > 0) {
                        i13 = 0;
                    } else {
                        i13 = 0;
                        l b12 = h11[0].m().B(h10[1]).g(2).b(q11);
                        if (b12.l(0) > 0) {
                            b10 = R(b10, b12);
                            if (b10 == null) {
                                return N(cVar, "Result requires too much memory");
                            }
                            q11 = b12;
                            if (q11.L() == 0 || fVar3 == null) {
                                f[] K5 = b10.K(b11);
                                f fVar5 = K5[0];
                                fVar4 = K5[1];
                                fVar3 = fVar5;
                            }
                            lVar2 = C.m().B(q11);
                        }
                    }
                    q11.z(i13);
                    if (q11.L() == 0) {
                    }
                    f[] K52 = b10.K(b11);
                    f fVar52 = K52[0];
                    fVar4 = K52[1];
                    fVar3 = fVar52;
                    lVar2 = C.m().B(q11);
                }
                f fVar6 = fVar4;
                int[] K6 = K(fVar6, b11, cVar);
                if (K6 == null) {
                    return N(cVar, str2);
                }
                T d10 = this.f23281a.d(fVar3, lVar2.F(), i17);
                if (!cVar.z() && (K6[0] | K6[1]) != 0) {
                    return I(d10, K6[0], K6[1], null, false, cVar);
                }
                c k10 = cVar.k();
                T I = I(d10, K6[0], K6[1], null, false, k10);
                if ((k10.w() & 1) != 0) {
                    if (cVar.y()) {
                        cVar.G(cVar.w() | k10.w());
                    }
                    return I;
                }
                if (cVar.y()) {
                    cVar.G(cVar.w() | (k10.w() & (-3)));
                }
                return B(I, cVar, fVar6.H1() ? null : l.q(Y), C);
            }
            str = str2;
        } else {
            str = "Rounding was required";
        }
        l lVar3 = new l(0);
        new l(0);
        if (b10.compareTo(b11) == 0) {
            lVar = new l(1);
            fVar2 = f.Y(0);
            i11 = 0;
        } else {
            f d02 = b10.d0(b11);
            if (d02.compareTo(f.Y(1)) != 0) {
                b10 = b10.M(d02);
                b11 = b11.M(d02);
            }
            l p10 = this.f23281a.p(b10, b11);
            if (p10 == null) {
                return N(cVar, "Result would have a nonterminating expansion");
            }
            f a12 = this.f23281a.a(b10, p10);
            lVar3 = p10.m();
            f[] K7 = a12.K(b11);
            fVar2 = K7[1];
            i11 = 0;
            lVar = l.q(K7[0]);
        }
        l B2 = C.m().B(lVar3);
        i C2 = cVar == null ? i.HalfEven : cVar.C();
        if (fVar2.H1()) {
            i15 = i11;
        } else if (C2 == i.HalfDown || C2 == i.HalfEven || C2 == i.HalfUp) {
            int q12 = q(fVar2, b11);
            if (q12 == 0) {
                i15 = i11;
                i12 = i16 / 2;
            } else {
                i12 = q12 > 0 ? i16 / 2 : i11;
            }
            i11 = i12;
        } else if (C2 == i.None) {
            return N(cVar, str);
        } else {
            i11 = 1;
        }
        f F = lVar.F();
        if (cVar != null && cVar.y() && B2.compareTo(C) > 0) {
            cVar.G(cVar.w() | 2);
        }
        return I(this.f23281a.d(F, B2.F(), i17), i11, i15, null, false, cVar);
    }

    private T w(T t10, T t11, c cVar) {
        int e10 = this.f23281a.e(t10);
        int e11 = this.f23281a.e(t11);
        if (((e10 | e11) & 14) != 0) {
            T y10 = y(t10, t11, cVar);
            if (y10 != null) {
                return y10;
            }
            int i10 = e10 & 2;
            if (i10 != 0 && (e11 & 2) != 0) {
                return M(cVar);
            }
            boolean z10 = false;
            if (i10 != 0) {
                if (((e10 ^ e11) & 1) != 0) {
                    z10 = true;
                }
                return x(t10, z10);
            } else if ((e11 & 2) == 0) {
                return null;
            } else {
                if (cVar == null || !cVar.x() || cVar.B().I1() <= 0) {
                    return b(this.f23281a.d(f.Y(0), f.Y(0), (e10 ^ e11) & 1), cVar);
                }
                if (cVar.y()) {
                    cVar.G(cVar.w() | 32);
                }
                f v10 = cVar.v();
                f B = cVar.B();
                if (cVar.s()) {
                    v10 = v10.n1(B).d(f.Y(1));
                }
                return this.f23281a.d(f.Y(0), v10, (e10 ^ e11) & 1);
            }
        }
        return null;
    }

    private T x(T t10, boolean z10) {
        if (t10 == null) {
            return t10;
        }
        int e10 = this.f23281a.e(t10);
        if ((!z10 || (e10 & 1) != 0) && (z10 || (e10 & 1) == 0)) {
            return t10;
        }
        int i10 = (z10 ? 1 : 0) | (e10 & (-2));
        o<T> oVar = this.f23281a;
        return oVar.d(oVar.b(t10), this.f23281a.j(t10), i10);
    }

    private T y(T t10, T t11, c cVar) {
        int e10 = this.f23281a.e(t10);
        int e11 = this.f23281a.e(t11);
        if ((e10 & 8) != 0) {
            return P(t10, cVar);
        }
        if ((e11 & 8) != 0) {
            return P(t11, cVar);
        }
        if ((e10 & 4) != 0) {
            return E(t10, cVar);
        }
        if ((e11 & 4) == 0) {
            return null;
        }
        return E(t11, cVar);
    }

    private boolean z(c cVar) {
        return cVar == null || (!cVar.y() && cVar.D() == 0 && ((!cVar.x() || (cVar.v().C1(-10) < 0 && cVar.u().I1() >= 0)) && cVar.C() != i.Floor && (!cVar.A() || ((this.f23283c >= 10 && !cVar.E() && cVar.B().C1(10) >= 0) || ((this.f23283c >= 2 || cVar.E()) && cVar.B().C1(32) >= 0)))));
    }

    @Override // u7.n
    public T a(T t10, c cVar) {
        if (cVar == null) {
            return N(cVar, "ctx is null");
        }
        if (!cVar.A()) {
            return N(cVar, "ctx has unlimited precision");
        }
        if (!cVar.x()) {
            return N(cVar, "doesn't satisfy ctx.getHasExponentRange()");
        }
        int e10 = this.f23281a.e(t10);
        if ((e10 & 8) != 0) {
            return P(t10, cVar);
        }
        if ((e10 & 4) != 0) {
            return E(t10, cVar);
        }
        if ((e10 & 2) == 0) {
            l q10 = l.q(cVar.v());
            if (cVar.s()) {
                q10.C(cVar.B()).t();
            }
            l q11 = l.q(this.f23281a.j(t10));
            if (q11.compareTo(q10) <= 0) {
                q10 = q11.m().D(2);
            }
            return d(t10, this.f23281a.d(f.Y(1), q10.F(), 0), cVar.p(i.Ceiling));
        } else if ((e10 & 1) == 0) {
            return t10;
        } else {
            f u10 = cVar.u();
            f B = cVar.B();
            if (cVar.s()) {
                u10 = u10.d(f.Y(1)).n1(B);
            }
            f R = R(f.Y(1), l.q(cVar.B()));
            if (R == null) {
                return N(cVar, "Result requires too much memory");
            }
            return this.f23281a.d(R.n1(f.Y(1)), u10, 1);
        }
    }

    @Override // u7.n
    public T b(T t10, c cVar) {
        return I(t10, 0, 0, null, false, cVar);
    }

    @Override // u7.n
    public T c(T t10, T t11, c cVar) {
        return v(t10, t11, cVar, 0, f.Y(0));
    }

    @Override // u7.n
    public T d(T t10, T t11, c cVar) {
        Objects.requireNonNull(t10, "thisValue");
        Objects.requireNonNull(t11, "other");
        return i(t10, t11, cVar, false);
    }

    @Override // u7.n
    public int e(T t10, T t11) {
        if (t11 == null) {
            return 1;
        }
        int e10 = this.f23281a.e(t10);
        int e11 = this.f23281a.e(t11);
        return ((e10 | e11) & 14) != 0 ? r(e10, e11) : s(t10, t11, true, this.f23281a);
    }

    @Override // u7.n
    public T f(T t10, c cVar) {
        int e10 = this.f23281a.e(t10);
        if ((e10 & 8) != 0) {
            return P(t10, cVar);
        }
        if ((e10 & 4) != 0) {
            return E(t10, cVar);
        }
        if ((e10 & 1) != 0) {
            o<T> oVar = this.f23281a;
            t10 = oVar.d(oVar.b(t10), this.f23281a.j(t10), e10 & (-2));
        }
        return b(t10, cVar);
    }

    @Override // u7.n
    public T g(c cVar, boolean z10) {
        String str;
        if (cVar != null) {
            i C = cVar.C();
            if (cVar.y()) {
                cVar.G(cVar.w() | 19);
            }
            if (C == i.None) {
                str = "Rounding was required";
            } else if (cVar.A() && cVar.x() && (C == i.Down || C == i.ZeroFiveUp || C == i.OddOrZeroFiveUp || C == i.Odd || ((C == i.Ceiling && z10) || (C == i.Floor && !z10)))) {
                f.Y(0);
                l q10 = l.q(cVar.B());
                f R = R(f.Y(1), q10);
                if (R != null) {
                    f n12 = R.n1(f.Y(1));
                    l q11 = l.q(cVar.u());
                    if (cVar.s()) {
                        q11.t().B(q10);
                    }
                    return this.f23281a.d(n12, q11.F(), z10 ? 1 : 0);
                }
                str = "Result requires too much memory";
            }
            return N(cVar, str);
        }
        if (this.f23282b == 0) {
            return null;
        }
        return this.f23281a.d(f.Y(0), f.Y(0), (z10 ? 1 : 0) | 2);
    }

    @Override // u7.n
    public o<T> h() {
        return this.f23281a;
    }

    @Override // u7.n
    public T i(T t10, T t11, c cVar, boolean z10) {
        m mVar;
        int i10;
        int e10 = this.f23281a.e(t10);
        int e11 = this.f23281a.e(t11);
        if (((e10 | e11) & 14) != 0) {
            T y10 = y(t10, t11, cVar);
            if (y10 != null) {
                return y10;
            }
            if ((e10 & 2) != 0) {
                return ((e11 & 2) == 0 || (e10 & 1) == (e11 & 1)) ? t10 : M(cVar);
            } else if ((e11 & 2) != 0) {
                return t11;
            }
        }
        m g10 = this.f23281a.g(t10);
        m g11 = this.f23281a.g(t11);
        m i11 = this.f23281a.i(t10);
        m i12 = this.f23281a.i(t11);
        int compareTo = g10.compareTo(g11);
        m mVar2 = compareTo < 0 ? g10 : g11;
        if ((e10 & 1) == 0 && (e11 & 1) == 0) {
            if (compareTo < 0 && i12.J()) {
                return A(cVar) ? t10 : b(t10, cVar);
            } else if (compareTo >= 0 && i11.J()) {
                return A(cVar) ? t11 : b(t11, cVar);
            }
        }
        if (!z10) {
            i10 = compareTo;
            T l10 = l(compareTo, g10, i11, g11, i12, mVar2, e10, e11, cVar);
            if (l10 != null) {
                return l10;
            }
            m mVar3 = mVar2;
            mVar = g11;
            T m10 = m(i10, g10, i11, g11, i12, mVar3, e10, e11, cVar);
            if (m10 != null) {
                return m10;
            }
        } else {
            i10 = compareTo;
            mVar = g11;
        }
        if (i10 != 0) {
            return n(g10, i11, mVar, i12, e10, e11, cVar, i10, z10);
        }
        T k10 = k(i11, i12, g10, e10, e11, cVar);
        return !A(cVar) ? b(k10, cVar) : k10;
    }
}
