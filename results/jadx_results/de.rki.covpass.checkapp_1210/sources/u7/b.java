package u7;

import java.util.Objects;
/* loaded from: classes.dex */
final class b implements p {

    /* renamed from: h */
    private static final long[] f23170h = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    /* renamed from: i */
    private static final f f23171i = f.Y(10);

    /* renamed from: j */
    private static final int[] f23172j = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};

    /* renamed from: a */
    private int f23173a;

    /* renamed from: b */
    private int f23174b;

    /* renamed from: c */
    private l f23175c;

    /* renamed from: d */
    private boolean f23176d;

    /* renamed from: e */
    private l f23177e;

    /* renamed from: f */
    private f f23178f;

    /* renamed from: g */
    private int f23179g;

    public b(int i10, int i11, int i12) {
        this.f23179g = i10;
        if (i10 >= 0) {
            int i13 = 1;
            this.f23176d = true;
            this.f23174b = i12 == 0 ? 0 : i13;
            this.f23173a = i11;
            return;
        }
        throw new IllegalArgumentException("shiftedSmall(" + this.f23179g + ") is less than 0");
    }

    public b(f fVar, int i10, int i11) {
        int i12 = 1;
        if (fVar.B()) {
            int s12 = fVar.s1();
            this.f23179g = s12;
            if (s12 < 0) {
                throw new IllegalArgumentException("shiftedSmall(" + this.f23179g + ") is less than 0");
            }
            this.f23176d = true;
        } else {
            this.f23178f = fVar;
            this.f23176d = false;
        }
        this.f23174b = i11 == 0 ? 0 : i12;
        this.f23173a = i10;
    }

    private l l() {
        f Z;
        if (this.f23176d) {
            return new l(q.d(this.f23179g));
        }
        long h02 = this.f23178f.h0();
        if (h02 == Long.MAX_VALUE) {
            Z = this.f23178f.g0();
        } else if (h02 < 2147483647L) {
            return new l((int) h02);
        } else {
            Z = f.Z(h02);
        }
        return l.q(Z);
    }

    private static int m(String str, int i10, int i11) {
        if (i11 > 9) {
            throw new IllegalArgumentException("length(" + i11 + ") is more than 9 ");
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 * 10) + (str.charAt(i10 + i13) - '0');
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void o(int r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.b.o(int, boolean, boolean):void");
    }

    private void p(long j10, int i10) {
        boolean z10;
        long j11;
        long j12;
        l lVar;
        int i11 = i10;
        if (i11 <= 0) {
            return;
        }
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i12 == 0) {
            this.f23179g = 0;
            this.f23176d = true;
            l lVar2 = this.f23175c;
            if (lVar2 == null) {
                lVar2 = new l(0);
            }
            this.f23175c = lVar2;
            lVar2.g(i11);
            this.f23174b |= this.f23173a;
            this.f23173a = 0;
            this.f23177e = new l(1);
        } else if (i11 < 2 || i11 > 8) {
            this.f23177e = new l(q.e(j10));
            l lVar3 = this.f23175c;
            if (lVar3 != null) {
                lVar3.g(i11);
            } else {
                this.f23175c = new l(i11);
            }
            long j13 = j10;
            int i13 = 0;
            while (true) {
                if (i11 <= 0) {
                    z10 = false;
                    break;
                } else if (j13 == 0) {
                    this.f23174b |= this.f23173a;
                    z10 = false;
                    this.f23173a = 0;
                    break;
                } else {
                    if (j13 < 43698) {
                        j11 = (26215 * j13) >> 18;
                        j12 = 10;
                    } else {
                        j12 = 10;
                        j11 = j13 / 10;
                    }
                    Long.signum(j11);
                    this.f23174b |= this.f23173a;
                    this.f23173a = (int) (j13 - (j11 * j12));
                    i11--;
                    i13++;
                    j13 = j11;
                }
            }
            boolean z11 = j13 <= 2147483647L ? true : z10;
            this.f23176d = z11;
            if (z11) {
                this.f23179g = (int) j13;
            } else {
                this.f23178f = f.Z(j13);
            }
            z(i13);
            boolean z12 = this.f23174b != 0 ? true : z10;
            int i14 = z12 ? 1 : 0;
            int i15 = z12 ? 1 : 0;
            this.f23174b = i14;
        } else {
            int[] iArr = f23172j;
            if (j10 >= iArr[i11]) {
                long j14 = iArr[i11];
                long j15 = iArr[i11 - 1];
                l lVar4 = this.f23175c;
                if (lVar4 == null) {
                    lVar4 = new l(0);
                }
                this.f23175c = lVar4;
                lVar4.g(i11);
                long j16 = j10 / j14;
                long j17 = j10 - (j14 * j16);
                long j18 = j17 / j15;
                this.f23173a = (int) j18;
                this.f23174b |= j17 - (j18 * j15) == 0 ? 0 : 1;
                boolean z13 = j16 <= 2147483647L;
                this.f23176d = z13;
                if (z13) {
                    this.f23179g = (int) j16;
                    lVar = j16 < 10 ? new l(1) : new l(q.e(j16));
                } else {
                    this.f23178f = f.Z(j16);
                    lVar = j16 < 10 ? new l(1) : l();
                }
                this.f23177e = lVar;
                return;
            }
            int i16 = i11 - 1;
            if (this.f23179g < iArr[i16]) {
                l lVar5 = this.f23175c;
                if (lVar5 != null) {
                    lVar5.g(i11);
                } else {
                    this.f23175c = new l(i11);
                }
                this.f23173a = 0;
                this.f23174b |= i12 == 0 ? 0 : 1;
                this.f23176d = true;
                this.f23179g = 0;
                this.f23177e = new l(1);
                return;
            }
            int i17 = iArr[i16];
            l lVar6 = this.f23175c;
            if (lVar6 != null) {
                lVar6.g(i11);
            } else {
                this.f23175c = new l(i11);
            }
            long j19 = i17;
            long j20 = j10 / j19;
            this.f23173a = (int) j20;
            this.f23174b |= j10 - (j20 * j19) == 0 ? 0 : 1;
            this.f23176d = true;
            this.f23179g = 0;
            this.f23177e = new l(1);
        }
    }

    private void q(int i10) {
        l lVar;
        if (i10 <= 0) {
            return;
        }
        int i11 = this.f23179g;
        int i12 = 0;
        if (i11 == 0) {
            l lVar2 = this.f23175c;
            if (lVar2 == null) {
                lVar2 = new l(0);
            }
            this.f23175c = lVar2;
            lVar2.g(i10);
            this.f23174b |= this.f23173a;
            this.f23173a = 0;
            lVar = new l(1);
        } else {
            int i13 = 8;
            if (i10 < 2 || i10 > 8) {
                if (i11 >= 1000000000) {
                    i13 = 10;
                } else if (i11 >= 100000000) {
                    i13 = 9;
                } else if (i11 < 10000000) {
                    i13 = i11 >= 1000000 ? 7 : i11 >= 100000 ? 6 : i11 >= 10000 ? 5 : i11 >= 1000 ? 4 : i11 >= 100 ? 3 : i11 >= 10 ? 2 : 1;
                }
                this.f23177e = new l(i13);
                l lVar3 = this.f23175c;
                if (lVar3 != null) {
                    lVar3.g(i10);
                } else {
                    this.f23175c = new l(i10);
                }
                int i14 = 0;
                while (true) {
                    if (i10 <= 0) {
                        break;
                    }
                    int i15 = this.f23179g;
                    if (i15 == 0) {
                        this.f23174b |= this.f23173a;
                        this.f23173a = 0;
                        this.f23177e = new l(1);
                        break;
                    }
                    this.f23174b |= this.f23173a;
                    this.f23173a = i15 % 10;
                    i10--;
                    i14++;
                    this.f23179g = i15 / 10;
                }
                z(i14);
                if (this.f23174b != 0) {
                    i12 = 1;
                }
                this.f23174b = i12;
                return;
            }
            int[] iArr = f23172j;
            if (i11 >= iArr[i10]) {
                int i16 = iArr[i10];
                int i17 = iArr[i10 - 1];
                l lVar4 = this.f23175c;
                if (lVar4 == null) {
                    lVar4 = new l(0);
                }
                this.f23175c = lVar4;
                lVar4.g(i10);
                int i18 = this.f23179g;
                int i19 = i18 / i16;
                int i20 = i18 - (i16 * i19);
                int i21 = i20 / i17;
                this.f23173a = i21;
                this.f23174b = (i20 - (i21 * i17)) | this.f23174b;
                this.f23179g = i19;
                this.f23177e = i19 < 10 ? new l(1) : l();
                return;
            }
            int i22 = i10 - 1;
            if (i11 >= iArr[i22]) {
                int i23 = iArr[i22];
                l lVar5 = this.f23175c;
                if (lVar5 != null) {
                    lVar5.g(i10);
                } else {
                    this.f23175c = new l(i10);
                }
                int i24 = this.f23179g;
                int i25 = i24 / i23;
                this.f23173a = i25;
                this.f23174b = (i24 - (i25 * i23)) | this.f23174b;
                this.f23179g = 0;
                lVar = new l(1);
            } else {
                l lVar6 = this.f23175c;
                if (lVar6 != null) {
                    lVar6.g(i10);
                } else {
                    this.f23175c = new l(i10);
                }
                int i26 = this.f23179g;
                this.f23173a = 0;
                this.f23174b = i26 | this.f23174b;
                this.f23179g = 0;
                lVar = new l(1);
            }
        }
        this.f23177e = lVar;
    }

    private void r(int i10, boolean z10) {
        f fVar;
        l lVar = this.f23177e;
        if (lVar == null || lVar.l(i10) > 0) {
            l x10 = x();
            int i11 = 0;
            boolean z11 = this.f23177e != null;
            if (x10.l(i10) <= 0) {
                if (z11) {
                    return;
                }
                i();
                r(i10, z10);
                return;
            }
            l D = x10.m().D(i10);
            if (z10 && D.j()) {
                b(D, z10);
                if (z11) {
                    return;
                }
                i();
                r(i10, z10);
            } else if (D.l(1) == 0) {
                f[] K = this.f23178f.K(f23171i);
                f fVar2 = K[0];
                f fVar3 = K[1];
                this.f23174b |= this.f23173a;
                this.f23173a = fVar3.s1();
                this.f23178f = fVar2;
                l lVar2 = this.f23175c;
                if (lVar2 == null) {
                    lVar2 = new l(0);
                }
                this.f23175c = lVar2;
                lVar2.b(D);
                if (this.f23174b != 0) {
                    i11 = 1;
                }
                this.f23174b = i11;
                if (z11) {
                    y(D);
                    return;
                }
                i();
                r(i10, z10);
            } else if (D.l(9) <= 0) {
                int G = D.G();
                f[] K2 = this.f23178f.K(q.n(G));
                f fVar4 = K2[0];
                int s12 = K2[1].s1();
                this.f23174b |= this.f23173a;
                for (int i12 = 0; i12 < G; i12++) {
                    if (i12 == G - 1) {
                        this.f23173a = s12 % 10;
                    } else {
                        int i13 = s12 < 43698 ? (s12 * 26215) >> 18 : s12 / 10;
                        this.f23174b = (s12 - (i13 * 10)) | this.f23174b;
                        s12 = i13;
                    }
                }
                this.f23178f = fVar4;
                l lVar3 = this.f23175c;
                if (lVar3 == null) {
                    lVar3 = new l(0);
                }
                this.f23175c = lVar3;
                lVar3.b(D);
                if (this.f23174b != 0) {
                    i11 = 1;
                }
                this.f23174b = i11;
                if (z11) {
                    y(D);
                    return;
                }
                i();
                r(i10, z10);
            } else if (D.j()) {
                int G2 = D.G() - 1;
                if (!this.f23178f.F1() || this.f23174b != 0) {
                    f fVar5 = this.f23178f;
                    this.f23174b |= 1;
                    fVar = fVar5.M(q.n(G2));
                } else {
                    f[] K3 = this.f23178f.K(q.n(G2));
                    fVar = K3[0];
                    f fVar6 = K3[1];
                    this.f23174b |= this.f23173a;
                    if (!fVar6.H1()) {
                        this.f23174b |= 1;
                    }
                }
                f[] K4 = fVar.K(f23171i);
                f fVar7 = K4[0];
                this.f23173a = K4[1].s1();
                this.f23178f = fVar7;
                l lVar4 = this.f23175c;
                if (lVar4 == null) {
                    lVar4 = new l(0);
                }
                this.f23175c = lVar4;
                lVar4.b(D);
                if (this.f23174b != 0) {
                    i11 = 1;
                }
                this.f23174b = i11;
                if (z11) {
                    y(D);
                    return;
                }
                i();
                r(i10, z10);
            } else {
                String fVar8 = this.f23178f.toString();
                int length = fVar8.length();
                this.f23177e = new l(length);
                if (length <= i10) {
                    return;
                }
                int i14 = length - i10;
                z(i14);
                int i15 = length - i14;
                l lVar5 = this.f23175c;
                if (lVar5 == null) {
                    lVar5 = new l(0);
                }
                this.f23175c = lVar5;
                if (i14 <= Integer.MAX_VALUE) {
                    lVar5.g(i14);
                } else {
                    lVar5.d(f.Y(i14));
                }
                for (int length2 = fVar8.length() - 1; length2 >= 0; length2--) {
                    this.f23174b |= this.f23173a;
                    this.f23173a = fVar8.charAt(length2) - '0';
                    i14--;
                    if (i14 <= 0) {
                        break;
                    }
                }
                if (i15 <= 9) {
                    this.f23176d = true;
                    this.f23179g = m(fVar8, 0, i15);
                } else {
                    this.f23178f = f.c0(fVar8, 0, i15);
                }
                if (this.f23174b != 0) {
                    i11 = 1;
                }
                this.f23174b = i11;
            }
        }
    }

    private void s(int i10) {
        int i11 = this.f23179g;
        int i12 = 1;
        int i13 = i11 >= 1000000000 ? 10 : i11 >= 100000000 ? 9 : i11 >= 10000000 ? 8 : i11 >= 1000000 ? 7 : i11 >= 100000 ? 6 : i11 >= 10000 ? 5 : i11 >= 1000 ? 4 : i11 >= 100 ? 3 : i11 >= 10 ? 2 : 1;
        this.f23177e = new l(i13);
        if (i13 > i10) {
            int i14 = i13 - i10;
            z(i14);
            l lVar = this.f23175c;
            this.f23175c = lVar != null ? lVar.g(i14) : new l(i14);
            for (int i15 = 0; i15 < i14; i15++) {
                int i16 = this.f23179g;
                this.f23179g = i16 / 10;
                this.f23174b |= this.f23173a;
                this.f23173a = i16 % 10;
            }
            if (this.f23174b == 0) {
                i12 = 0;
            }
            this.f23174b = i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void u(long r17, int r19) {
        /*
            Method dump skipped, instructions count: 191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.b.u(long, int):void");
    }

    private void w(int i10) {
        l lVar;
        if (i10 <= 0) {
            return;
        }
        int i11 = this.f23179g;
        int i12 = 0;
        if (i11 == 0 || i10 >= 11) {
            l lVar2 = this.f23175c;
            if (lVar2 == null) {
                lVar2 = new l(0);
            }
            this.f23175c = lVar2;
            lVar2.g(i10);
            this.f23174b |= this.f23173a;
            this.f23173a = this.f23179g == 0 ? 0 : 1;
            this.f23179g = 0;
            lVar = new l(1);
        } else if (i10 < 1 || i10 > 8) {
            q(i10);
            return;
        } else {
            int[] iArr = f23172j;
            if (i11 >= iArr[i10]) {
                int i13 = iArr[i10];
                l lVar3 = this.f23175c;
                if (lVar3 != null) {
                    lVar3.g(i10);
                } else {
                    this.f23175c = new l(i10);
                }
                int i14 = this.f23174b;
                int i15 = this.f23173a;
                this.f23174b = i14 | i15;
                int i16 = this.f23179g;
                if ((i16 & 1) == 1) {
                    this.f23173a = 1;
                    this.f23179g = i16 / i13;
                } else {
                    int i17 = i16 / i13;
                    int i18 = i16 - (i13 * i17);
                    this.f23179g = i17;
                    if (i18 != 0) {
                        i12 = 1;
                    }
                    this.f23173a = i15 | i12;
                }
                z(i10);
                return;
            }
            l lVar4 = this.f23175c;
            if (lVar4 != null) {
                lVar4.g(i10);
            } else {
                this.f23175c = new l(i10);
            }
            this.f23174b |= this.f23173a;
            this.f23173a = this.f23179g == 0 ? 0 : 1;
            this.f23179g = 0;
            lVar = new l(1);
        }
        this.f23177e = lVar;
    }

    private l x() {
        l lVar = this.f23177e;
        return lVar != null ? lVar : this.f23176d ? i() : q.f(this.f23178f)[0];
    }

    private void y(l lVar) {
        l lVar2 = this.f23177e;
        if (lVar2 != null) {
            lVar2.B(lVar);
            if (this.f23177e.l(1) >= 0) {
                return;
            }
            this.f23177e.z(1);
        }
    }

    private void z(int i10) {
        l lVar = this.f23177e;
        if (lVar != null) {
            lVar.D(i10);
            if (this.f23177e.l(1) >= 0) {
                return;
            }
            this.f23177e.z(1);
        }
    }

    @Override // u7.p
    public final int a() {
        return this.f23174b;
    }

    @Override // u7.p
    public void b(l lVar, boolean z10) {
        Objects.requireNonNull(lVar, "fastint");
        if (!z10 || !lVar.j()) {
            n(lVar);
            return;
        }
        int G = lVar.G();
        if (G < 0) {
            return;
        }
        if (this.f23176d) {
            w(G);
        } else if (this.f23178f.C()) {
            u(this.f23178f.u1(), G);
        } else {
            o(G, true, false);
        }
    }

    @Override // u7.p
    public final f c() {
        return this.f23176d ? f.Y(this.f23179g) : this.f23178f;
    }

    @Override // u7.p
    public int d(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? this.f23176d ? this.f23179g % i10 : this.f23178f.I0(i10).s1() : this.f23176d ? this.f23179g & 1 : this.f23178f.F1() ? 0 : 1;
        }
        return 0;
    }

    @Override // u7.p
    public void e(int i10) {
        if (this.f23176d) {
            q(i10);
        } else {
            o(i10, false, false);
        }
    }

    @Override // u7.p
    public l f() {
        l lVar = this.f23177e;
        return lVar != null ? lVar : this.f23176d ? i() : q.f(this.f23178f)[1];
    }

    @Override // u7.p
    public void g(l lVar, l lVar2, boolean z10) {
        if (lVar2 != null && lVar2.L() > 0) {
            l lVar3 = this.f23177e;
            if (lVar3 == null) {
                lVar3 = l();
            }
            this.f23177e = lVar3;
            if (lVar3.compareTo(lVar) <= 0) {
                b(lVar2, z10);
                return;
            }
            l B = lVar3.m().B(lVar);
            if (B.compareTo(lVar2) <= 0) {
                b(lVar2, z10);
            } else {
                b(B, z10);
            }
        } else if (!lVar.j()) {
            l lVar4 = this.f23177e;
            if (lVar4 == null) {
                lVar4 = l();
            }
            this.f23177e = lVar4;
            f n12 = lVar4.F().n1(lVar.F());
            if (n12.I1() <= 0) {
                return;
            }
            n(l.q(n12));
        } else {
            int G = lVar.G();
            if (G >= 0) {
                if (this.f23176d) {
                    s(G);
                    return;
                } else {
                    r(G, z10);
                    return;
                }
            }
            throw new IllegalArgumentException("intval(" + G + ") is less than 0");
        }
    }

    @Override // u7.p
    public final int h() {
        return this.f23173a;
    }

    @Override // u7.p
    public l i() {
        l lVar = this.f23177e;
        if (lVar == null) {
            lVar = l();
        }
        this.f23177e = lVar;
        return lVar;
    }

    @Override // u7.p
    public final l j() {
        l lVar = this.f23175c;
        if (lVar == null) {
            lVar = new l(0);
        }
        this.f23175c = lVar;
        return lVar;
    }

    @Override // u7.p
    public final l k() {
        return this.f23176d ? new l(this.f23179g) : l.q(this.f23178f);
    }

    public void n(l lVar) {
        Objects.requireNonNull(lVar, "fastint");
        if (lVar.j()) {
            int G = lVar.G();
            if (G < 0) {
                return;
            }
            e(G);
        } else if (lVar.L() <= 0) {
        } else {
            f F = lVar.F();
            while (F.I1() > 0) {
                int i10 = 1000000;
                if (F.C1(1000000) >= 0 && (this.f23176d || this.f23178f.o0().compareTo(F) < 0)) {
                    l lVar2 = this.f23175c;
                    if (lVar2 == null) {
                        lVar2 = new l(0);
                    }
                    this.f23175c = lVar2;
                    lVar2.d(F);
                    int i11 = this.f23174b | this.f23173a;
                    this.f23174b = i11;
                    this.f23174b = i11 | ((!this.f23176d ? !this.f23178f.H1() : this.f23179g != 0) ? 1 : 0);
                    this.f23173a = 0;
                    this.f23177e = new l(1);
                    this.f23176d = true;
                    this.f23179g = 0;
                    return;
                }
                if (F.C1(1000000) < 0) {
                    i10 = F.s1();
                }
                e(i10);
                F = F.n1(f.Y(i10));
                if (this.f23176d) {
                    if (this.f23179g == 0) {
                        return;
                    }
                } else if (this.f23178f.H1()) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean t(u7.l r6) {
        /*
            r5 = this;
            java.lang.String r0 = "fastint"
            java.util.Objects.requireNonNull(r6, r0)
            boolean r0 = r6.j()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L50
            int r0 = r6.L()
            if (r0 >= 0) goto L1c
            int r6 = r5.f23173a
            int r0 = r5.f23174b
            r6 = r6 | r0
            if (r6 != 0) goto L1b
            r1 = r2
        L1b:
            return r1
        L1c:
            boolean r0 = r5.f23176d
            if (r0 != 0) goto L50
            u7.f r0 = r5.f23178f
            boolean r0 = r0.C()
            if (r0 != 0) goto L50
            int r6 = r6.G()
            r0 = 10
            if (r6 <= r0) goto L44
            r5.o(r0, r2, r2)
            int r3 = r5.f23173a
            int r4 = r5.f23174b
            r3 = r3 | r4
            if (r3 == 0) goto L3b
            return r1
        L3b:
            boolean r3 = r5.f23176d
            int r6 = r6 - r0
            if (r3 == 0) goto L44
            r5.e(r6)
            goto L47
        L44:
            r5.o(r6, r2, r2)
        L47:
            int r6 = r5.f23173a
            int r0 = r5.f23174b
            r6 = r6 | r0
            if (r6 != 0) goto L4f
            r1 = r2
        L4f:
            return r1
        L50:
            r5.b(r6, r2)
            int r6 = r5.f23173a
            int r0 = r5.f23174b
            r6 = r6 | r0
            if (r6 != 0) goto L5b
            r1 = r2
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.b.t(u7.l):boolean");
    }

    public String toString() {
        return "[this.bitLeftmost=" + this.f23173a + ", this.bitsAfterLeftmost=" + this.f23174b + ", this.discardedDigitCount=" + this.f23175c + ", this.isSmall=" + this.f23176d + ", this.knownDigitLength=" + this.f23177e + ", this.shiftedBigInt=" + this.f23178f + ", this.shiftedSmall=" + this.f23179g + "]";
    }

    public void v(l lVar) {
        Objects.requireNonNull(lVar, "fastint");
        if (lVar.j()) {
            if (lVar.L() < 0) {
                return;
            }
            if (!this.f23176d && !this.f23178f.C()) {
                o(lVar.G(), true, true);
                return;
            }
        }
        b(lVar, true);
    }
}
