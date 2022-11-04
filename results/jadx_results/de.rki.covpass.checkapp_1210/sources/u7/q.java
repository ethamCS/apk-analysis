package u7;

import org.conscrypt.PSKKeyManager;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a */
    private static final f[] f23262a = {f.Y(1), f.Y(10), f.Z(100), f.Z(1000), f.Z(10000), f.Z(100000), f.Z(1000000), f.Z(10000000), f.Z(100000000), f.Z(1000000000), f.Z(10000000000L), f.Z(100000000000L), f.Z(1000000000000L), f.Z(10000000000000L), f.Z(100000000000000L), f.Z(1000000000000000L), f.Z(10000000000000000L), f.Z(100000000000000000L), f.Z(1000000000000000000L)};

    /* renamed from: b */
    private static final f[] f23263b = {f.Y(1), f.Z(5), f.Z(25), f.Z(125), f.Z(625), f.Z(3125), f.Z(15625), f.Z(78125), f.Z(390625), f.Z(1953125), f.Z(9765625), f.Z(48828125), f.Z(244140625), f.Z(1220703125), f.Z(6103515625L), f.Z(30517578125L), f.Z(152587890625L), f.Z(762939453125L), f.Z(3814697265625L), f.Z(19073486328125L), f.Z(95367431640625L), f.Z(476837158203125L), f.Z(2384185791015625L), f.Z(11920928955078125L), f.Z(59604644775390625L), f.Z(298023223876953125L), f.Z(1490116119384765625L), f.Z(7450580596923828125L)};

    /* renamed from: c */
    private static final a f23264c = new a();

    /* renamed from: d */
    private static final a f23265d = new a();

    /* renamed from: e */
    private static final f f23266e = f.Z(95367431640625L).K0(f.Z(95367431640625L));

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final f[] f23267a = new f[128];

        /* renamed from: b */
        private final f[] f23268b = new f[128];

        /* renamed from: c */
        private final int[] f23269c = new int[128];

        /* renamed from: d */
        private int f23270d;

        public void a(int i10, f fVar) {
            b(f.Y(i10), fVar);
        }

        public void b(f fVar, f fVar2) {
            synchronized (this.f23267a) {
                int i10 = this.f23270d;
                int i11 = -1;
                if (i10 < 128) {
                    while (i10 > 0) {
                        f[] fVarArr = this.f23268b;
                        int i12 = i10 - 1;
                        fVarArr[i10] = fVarArr[i12];
                        int[] iArr = this.f23269c;
                        iArr[i10] = iArr[i12];
                        f[] fVarArr2 = this.f23267a;
                        fVarArr2[i10] = fVarArr2[i12];
                        i10--;
                    }
                    this.f23268b[0] = fVar;
                    int[] iArr2 = this.f23269c;
                    if (fVar.B()) {
                        i11 = fVar.s1();
                    }
                    iArr2[0] = i11;
                    this.f23267a[0] = fVar2;
                    this.f23270d++;
                } else {
                    for (int i13 = 127; i13 > 0; i13--) {
                        f[] fVarArr3 = this.f23268b;
                        int i14 = i13 - 1;
                        fVarArr3[i13] = fVarArr3[i14];
                        int[] iArr3 = this.f23269c;
                        iArr3[i13] = iArr3[i14];
                        f[] fVarArr4 = this.f23267a;
                        fVarArr4[i13] = fVarArr4[i14];
                    }
                    this.f23268b[0] = fVar;
                    int[] iArr4 = this.f23269c;
                    if (fVar.B()) {
                        i11 = fVar.s1();
                    }
                    iArr4[0] = i11;
                    this.f23267a[0] = fVar2;
                }
            }
        }

        public f c(f fVar) {
            if (fVar.B()) {
                return d(fVar.s1());
            }
            synchronized (this.f23267a) {
                for (int i10 = 0; i10 < this.f23270d; i10++) {
                    if (fVar.equals(this.f23268b[i10])) {
                        if (i10 != 0) {
                            f[] fVarArr = this.f23268b;
                            f fVar2 = fVarArr[i10];
                            fVarArr[i10] = fVarArr[0];
                            fVarArr[0] = fVar2;
                            int[] iArr = this.f23269c;
                            int i11 = iArr[i10];
                            iArr[i10] = iArr[0];
                            iArr[0] = i11;
                            f[] fVarArr2 = this.f23267a;
                            f fVar3 = fVarArr2[i10];
                            fVarArr2[i10] = fVarArr2[0];
                            fVarArr2[0] = fVar3;
                            if (i10 != 1) {
                                f fVar4 = fVarArr[i10];
                                fVarArr[i10] = fVarArr[1];
                                fVarArr[1] = fVar4;
                                int i12 = iArr[i10];
                                iArr[i10] = iArr[1];
                                iArr[1] = i12;
                                f fVar5 = fVarArr2[i10];
                                fVarArr2[i10] = fVarArr2[1];
                                fVarArr2[1] = fVar5;
                            }
                        }
                        return this.f23267a[0];
                    }
                }
                return null;
            }
        }

        public f d(int i10) {
            synchronized (this.f23267a) {
                if (i10 > 0) {
                    try {
                        if (this.f23270d < 64) {
                            for (int i11 = 0; i11 < this.f23270d; i11++) {
                                if (this.f23269c[i11] == i10) {
                                    return this.f23267a[i11];
                                }
                            }
                            return null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                for (int i12 = 0; i12 < this.f23270d; i12++) {
                    int[] iArr = this.f23269c;
                    if (iArr[i12] >= 0 && iArr[i12] == i10) {
                        if (i12 != 0) {
                            f[] fVarArr = this.f23268b;
                            f fVar = fVarArr[i12];
                            fVarArr[i12] = fVarArr[0];
                            fVarArr[0] = fVar;
                            int i13 = iArr[i12];
                            iArr[i12] = iArr[0];
                            iArr[0] = i13;
                            f[] fVarArr2 = this.f23267a;
                            f fVar2 = fVarArr2[i12];
                            fVarArr2[i12] = fVarArr2[0];
                            fVarArr2[0] = fVar2;
                            if (i12 != 1) {
                                f fVar3 = fVarArr[i12];
                                fVarArr[i12] = fVarArr[1];
                                fVarArr[1] = fVar3;
                                int i14 = iArr[i12];
                                iArr[i12] = iArr[1];
                                iArr[1] = i14;
                                f fVar4 = fVarArr2[i12];
                                fVarArr2[i12] = fVarArr2[1];
                                fVarArr2[1] = fVar4;
                            }
                        }
                        return this.f23267a[0];
                    }
                }
                return null;
            }
        }
    }

    public static int a(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 32;
        if ((i10 >> 16) == 0) {
            i10 <<= 16;
            i11 = 16;
        }
        if ((i10 >> 24) == 0) {
            i10 <<= 8;
            i11 -= 8;
        }
        if ((i10 >> 28) == 0) {
            i10 <<= 4;
            i11 -= 4;
        }
        if ((i10 >> 30) == 0) {
            i10 <<= 2;
            i11 -= 2;
        }
        return (i10 >> 31) == 0 ? i11 - 1 : i11;
    }

    public static int b(long j10) {
        if (j10 == 0) {
            return 1;
        }
        int i10 = 64;
        if ((j10 >> 32) == 0) {
            j10 <<= 32;
            i10 = 32;
        }
        if ((j10 >> 48) == 0) {
            j10 <<= 16;
            i10 -= 16;
        }
        if ((j10 >> 56) == 0) {
            j10 <<= 8;
            i10 -= 8;
        }
        if ((j10 >> 60) == 0) {
            j10 <<= 4;
            i10 -= 4;
        }
        if ((j10 >> 62) == 0) {
            j10 <<= 2;
            i10 -= 2;
        }
        return (j10 >> 63) == 0 ? i10 - 1 : i10;
    }

    private static int c(int i10) {
        if (i10 == 0) {
            return 32;
        }
        int i11 = 0;
        if ((i10 << 16) == 0) {
            i10 >>= 16;
            i11 = 16;
        }
        if ((i10 << 24) == 0) {
            i10 >>= 8;
            i11 += 8;
        }
        if ((i10 << 28) == 0) {
            i10 >>= 4;
            i11 += 4;
        }
        if ((i10 << 30) == 0) {
            i10 >>= 2;
            i11 += 2;
        }
        return (i10 << 31) == 0 ? i11 + 1 : i11;
    }

    public static int d(int i10) {
        if (i10 < 100000) {
            if (i10 >= 10000) {
                return 5;
            }
            if (i10 >= 1000) {
                return 4;
            }
            if (i10 >= 100) {
                return 3;
            }
            return i10 >= 10 ? 2 : 1;
        } else if (i10 >= 1000000000) {
            return 10;
        } else {
            if (i10 >= 100000000) {
                return 9;
            }
            if (i10 >= 10000000) {
                return 8;
            }
            return i10 >= 1000000 ? 7 : 6;
        }
    }

    public static int e(long j10) {
        int i10 = (j10 > 1000000000L ? 1 : (j10 == 1000000000L ? 0 : -1));
        if (i10 < 0) {
            int i11 = (int) j10;
            if (i11 >= 100000000) {
                return 9;
            }
            if (i11 >= 10000000) {
                return 8;
            }
            if (i11 >= 1000000) {
                return 7;
            }
            if (i11 >= 100000) {
                return 6;
            }
            if (i11 >= 10000) {
                return 5;
            }
            if (i11 >= 1000) {
                return 4;
            }
            if (i11 >= 100) {
                return 3;
            }
            return i11 >= 10 ? 2 : 1;
        } else if (j10 >= 1000000000000000000L) {
            return 19;
        } else {
            if (j10 >= 100000000000000000L) {
                return 18;
            }
            if (j10 >= 10000000000000000L) {
                return 17;
            }
            if (j10 >= 1000000000000000L) {
                return 16;
            }
            if (j10 >= 100000000000000L) {
                return 15;
            }
            if (j10 >= 10000000000000L) {
                return 14;
            }
            if (j10 >= 1000000000000L) {
                return 13;
            }
            if (j10 >= 100000000000L) {
                return 12;
            }
            if (j10 >= 10000000000L) {
                return 11;
            }
            return i10 >= 0 ? 10 : 9;
        }
    }

    public static l[] f(f fVar) {
        long p02 = fVar.p0();
        if (p02 < 33) {
            l lVar = new l((int) fVar.h0());
            return new l[]{lVar, lVar};
        } else if (p02 <= 2135) {
            int i10 = (int) p02;
            int i11 = (((i10 - 1) * 631305) >> 21) + 1;
            int i12 = ((i10 * 631305) >> 21) + 1;
            if (i11 != i12) {
                return new l[]{new l(i11), new l(i12)};
            }
            l lVar2 = new l(i11);
            return new l[]{lVar2, lVar2};
        } else if (p02 > 6432162) {
            f o02 = fVar.o0();
            return new l[]{l.q(o02.J0(100).L(335)), l.q(o02.L(3))};
        } else {
            int i13 = (int) p02;
            int i14 = ((int) (((i13 - 1) * 661971961083L) >> 41)) + 1;
            int i15 = ((int) ((i13 * 661971961083L) >> 41)) + 1;
            if (i14 != i15) {
                return new l[]{new l(i14), new l(i15)};
            }
            l lVar3 = new l(i14);
            return new l[]{lVar3, lVar3};
        }
    }

    public static f[] g(f fVar) {
        long p02 = fVar.p0();
        if (p02 < 33) {
            f Y = f.Y((int) fVar.h0());
            return new f[]{Y, Y};
        } else if (p02 <= 2135) {
            int i10 = (int) p02;
            int i11 = (((i10 - 1) * 631305) >> 21) + 1;
            int i12 = ((i10 * 631305) >> 21) + 1;
            if (i11 != i12) {
                return new f[]{f.Y(i11), f.Y(i12)};
            }
            f Y2 = f.Y(i11);
            return new f[]{Y2, Y2};
        } else if (p02 > 6432162) {
            l[] f10 = f(fVar);
            return new f[]{f10[0].F(), f10[1].F()};
        } else {
            int i13 = (int) p02;
            int i14 = ((int) (((i13 - 1) * 661971961083L) >> 41)) + 1;
            int i15 = ((int) ((i13 * 661971961083L) >> 41)) + 1;
            if (i14 != i15) {
                return new f[]{f.Y(i14), f.Y(i15)};
            }
            f Y3 = f.Y(i14);
            return new f[]{Y3, Y3};
        }
    }

    public static <THelper> l[] h(o<THelper> oVar, f fVar) {
        int h10 = oVar.h();
        if (h10 == 2) {
            l q10 = l.q(fVar.o0());
            return new l[]{q10, q10};
        } else if (h10 == 10) {
            return f(fVar);
        } else {
            l o10 = oVar.o(fVar);
            return new l[]{o10, o10};
        }
    }

    public static <THelper> m[] i(o<THelper> oVar, m mVar) {
        int h10 = oVar.h();
        m k10 = k(mVar, h10);
        if (k10 != null) {
            return new m[]{k10, k10};
        }
        if (h10 == 10) {
            f[] g10 = g(mVar.B());
            return new m[]{m.p(g10[0]), m.p(g10[1])};
        }
        m q10 = m.q(oVar.o(mVar.B()));
        return new m[]{q10, q10};
    }

    public static <THelper> m j(o<THelper> oVar, m mVar) {
        m k10 = k(mVar, oVar.h());
        return k10 != null ? k10 : m.q(oVar.o(mVar.B()));
    }

    private static m k(m mVar, int i10) {
        int h02;
        if (mVar.h()) {
            int D = mVar.D();
            if (D == Integer.MIN_VALUE) {
                return null;
            }
            if (i10 == 2) {
                h02 = a(Math.abs(D));
            } else if (i10 != 10) {
                return null;
            } else {
                h02 = d(Math.abs(D));
            }
        } else if (i10 == 2) {
            long p02 = mVar.B().p0();
            if (p02 == Long.MAX_VALUE) {
                return null;
            }
            return m.s(p02);
        } else if (i10 != 10) {
            return null;
        } else {
            f B = mVar.B();
            long p03 = B.p0();
            if (p03 >= 33) {
                if (p03 <= 2135) {
                    int i11 = (int) p03;
                    int i12 = (((i11 - 1) * 631305) >> 21) + 1;
                    if (i12 != ((i11 * 631305) >> 21) + 1) {
                        return null;
                    }
                    return m.r(i12);
                } else if (p03 > 6432162) {
                    return null;
                } else {
                    int i13 = (int) p03;
                    int i14 = ((int) (((i13 - 1) * 661971961083L) >> 41)) + 1;
                    if (i14 != ((int) ((i13 * 661971961083L) >> 41)) + 1) {
                        return null;
                    }
                    return m.r(i14);
                }
            }
            h02 = (int) B.h0();
        }
        return m.r(h02);
    }

    public static f l(int i10) {
        if (i10 < 0) {
            return f.Y(0);
        }
        if (i10 <= 27) {
            return f23263b[i10];
        }
        if (i10 == 40) {
            return f23266e;
        }
        a aVar = f23264c;
        f d10 = aVar.d(i10);
        if (d10 != null) {
            return d10;
        }
        f Y = f.Y(i10);
        if (i10 <= 54) {
            if ((i10 & 1) == 0) {
                f fVar = f23263b[i10 >> 1];
                f K0 = fVar.K0(fVar);
                aVar.b(Y, K0);
                return K0;
            }
            f[] fVarArr = f23263b;
            f K02 = fVarArr[27].K0(fVarArr[i10 - 27]);
            aVar.b(Y, K02);
            return K02;
        } else if (i10 <= 94) {
            f K03 = f23266e.K0(l(i10 - 40));
            aVar.b(Y, K03);
            return K03;
        } else {
            int i11 = 64;
            f l10 = l(i10 & 63);
            for (int i12 = i10 >> 6; i12 > 0; i12 >>= 1) {
                if ((i12 & 1) == 1) {
                    a aVar2 = f23264c;
                    f d11 = aVar2.d(i11);
                    if (d11 == null) {
                        f l11 = l(i11 >> 1);
                        d11 = l11.K0(l11);
                        aVar2.a(i11, d11);
                    }
                    l10 = l10.K0(d11);
                }
                i11 <<= 1;
            }
            return l10;
        }
    }

    public static f m(f fVar) {
        int I1 = fVar.I1();
        if (I1 < 0) {
            return f.Y(0);
        }
        if (I1 == 0) {
            return f.Y(1);
        }
        if (fVar.B()) {
            return l(fVar.s1());
        }
        f Y = f.Y(1);
        f Y2 = f.Y(1);
        while (fVar.I1() > 0) {
            if (!fVar.F1()) {
                a aVar = f23264c;
                f c10 = aVar.c(Y);
                if (c10 == null) {
                    f m10 = m(Y.c1(1));
                    c10 = m10.K0(m10);
                    aVar.b(Y, c10);
                }
                Y2 = Y2.K0(c10);
            }
            Y = Y.a1(1);
            fVar = fVar.c1(1);
        }
        return Y2;
    }

    public static f n(int i10) {
        f K0;
        if (i10 < 0) {
            return f.Y(0);
        }
        if (i10 <= 18) {
            return f23262a[i10];
        }
        a aVar = f23265d;
        f d10 = aVar.d(i10);
        if (d10 != null) {
            return d10;
        }
        if (i10 <= 27) {
            K0 = f23263b[i10].a1(i10);
        } else if (i10 > 36) {
            return l(i10).a1(i10);
        } else {
            if ((i10 & 1) == 0) {
                f fVar = f23262a[i10 >> 1];
                K0 = fVar.K0(fVar);
            } else {
                f[] fVarArr = f23262a;
                K0 = fVarArr[18].K0(fVarArr[i10 - 18]);
            }
        }
        aVar.a(i10, K0);
        return K0;
    }

    public static f o(long j10) {
        int i10;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 < 0) {
            i10 = 0;
        } else if (i11 != 0) {
            return j10 <= 2147483647L ? n((int) j10) : p(f.Z(j10));
        } else {
            i10 = 1;
        }
        return f.Y(i10);
    }

    public static f p(f fVar) {
        int i10;
        int I1 = fVar.I1();
        if (I1 < 0) {
            i10 = 0;
        } else if (I1 != 0) {
            return fVar.B() ? n(fVar.s1()) : m(fVar).b1(fVar);
        } else {
            i10 = 1;
        }
        return f.Y(i10);
    }

    public static f q(f fVar, int i10) {
        if (i10 < 0 || fVar.H1()) {
            return f.Y(0);
        }
        if (i10 <= 94) {
            return fVar.K0(l(i10));
        }
        f d10 = f23264c.d(i10);
        if (d10 != null) {
            return fVar.K0(d10);
        }
        int i11 = 64;
        f K0 = fVar.K0(l(i10 & 63));
        for (int i12 = i10 >> 6; i12 > 0; i12 >>= 1) {
            if ((i12 & 1) == 1) {
                a aVar = f23264c;
                f d11 = aVar.d(i11);
                if (d11 == null) {
                    f l10 = l(i11 >> 1);
                    d11 = l10.K0(l10);
                    aVar.a(i11, d11);
                }
                K0 = K0.K0(d11);
            }
            i11 <<= 1;
        }
        return K0;
    }

    static f r(f fVar, f fVar2) {
        return fVar2.B() ? q(fVar, fVar2.s1()) : fVar.K0(m(fVar2));
    }

    public static f s(f fVar, int i10) {
        if (i10 < 0 || fVar.H1()) {
            return f.Y(0);
        }
        f[] fVarArr = f23262a;
        if (i10 < fVarArr.length) {
            return fVar.K0(fVarArr[i10]);
        }
        return (i10 <= 94 ? fVar.K0(l(i10)) : q(fVar, i10)).a1(i10);
    }

    public static f t(f fVar, f fVar2) {
        return (fVar2.I1() < 0 || fVar.H1()) ? f.Y(0) : r(fVar, fVar2).b1(fVar2);
    }

    public static <THelper> THelper u(THelper thelper, c cVar, n<THelper> nVar) {
        c cVar2;
        if (cVar != null && cVar.A()) {
            o<THelper> h10 = nVar.h();
            if ((h10.e(thelper) & 14) != 0) {
                return thelper;
            }
            l q10 = l.q(cVar.B());
            f a10 = h10.b(thelper).a();
            l[] h11 = h(h10, a10);
            if (h11[1].compareTo(q10) <= 0) {
                return thelper;
            }
            if (h11[0].compareTo(q10) <= 0) {
                l o10 = h10.o(a10);
                cVar2 = cVar.k().q(0);
                if (o10.compareTo(q10) <= 0) {
                    return thelper;
                }
            } else {
                cVar2 = cVar;
            }
            thelper = nVar.b(thelper, cVar2);
            if ((cVar2.w() & 1) != 0 && cVar.y()) {
                cVar.G(cVar.w() | 259);
            }
            if ((cVar2.w() & 2) != 0 && cVar.y()) {
                cVar.G(cVar.w() | 2);
            }
            if ((cVar2.w() & 16) != 0 && cVar.y()) {
                cVar.G(cVar.w() | PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                cVar.G(cVar.w() | 19);
            }
        }
        return thelper;
    }

    public static f v(f fVar, l lVar, int i10, l lVar2, l lVar3, l lVar4) {
        if (fVar.H1()) {
            lVar.z(0);
            return fVar;
        }
        if (i10 == 2) {
            if (!fVar.F1()) {
                return fVar;
            }
            long j02 = fVar.j0();
            if (j02 != Long.MAX_VALUE) {
                if (lVar3 != null && lVar2.compareTo(lVar3) >= 0) {
                    f n12 = lVar2.F().n1(lVar3.F());
                    if (n12.compareTo(f.Z(j02)) < 0) {
                        j02 = n12.u1();
                    }
                }
                if (lVar4 != null && lVar.compareTo(lVar4) <= 0) {
                    f n13 = lVar4.F().n1(lVar.F());
                    if (n13.compareTo(f.Z(j02)) < 0) {
                        j02 = n13.u1();
                    }
                }
                f c12 = j02 <= 2147483647L ? fVar.c1((int) j02) : fVar.d1(f.Z(j02));
                if (lVar2 != null) {
                    lVar2.E(j02);
                }
                if (lVar != null) {
                    lVar.h(j02);
                }
                return c12;
            }
        }
        f Y = f.Y(i10);
        new l(0);
        while (!fVar.H1() && ((lVar3 == null || lVar2.compareTo(lVar3) != 0) && (lVar4 == null || lVar.compareTo(lVar4) != 0))) {
            f[] K = fVar.K(Y);
            f fVar2 = K[0];
            if (!K[1].H1()) {
                break;
            }
            lVar.t();
            if (lVar2 != null) {
                lVar2.p();
            }
            fVar = fVar2;
        }
        return fVar;
    }

    public static int w(int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int c10 = c(i10);
        if (c10 == 0) {
            return 0;
        }
        if (c10 < 32) {
            int i12 = Integer.MAX_VALUE >> (c10 - 1);
            iArr[0] = ((i10 >> c10) & i12) | (i11 << (32 - c10));
            iArr[1] = (i11 >> c10) & i12;
            return c10;
        }
        int c11 = c(i11);
        if (c11 == 32) {
            iArr[0] = 0;
        } else if (c11 > 0) {
            iArr[0] = (i11 >> c11) & (Integer.MAX_VALUE >> (c11 - 1));
        } else {
            iArr[0] = i11;
        }
        iArr[1] = 0;
        return c11 + 32;
    }
}
