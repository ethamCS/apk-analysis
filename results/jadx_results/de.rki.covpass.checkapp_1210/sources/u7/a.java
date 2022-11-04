package u7;
/* loaded from: classes.dex */
final class a implements p {

    /* renamed from: a */
    private int f23163a;

    /* renamed from: b */
    private int f23164b;

    /* renamed from: c */
    private f f23165c;

    /* renamed from: d */
    private l f23166d;

    /* renamed from: e */
    private int f23167e;

    /* renamed from: f */
    private boolean f23168f;

    /* renamed from: g */
    private l f23169g;

    public a(int i10, int i11, int i12) {
        this.f23167e = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException("shiftedSmall(" + this.f23167e + ") is less than 0");
        }
        int i13 = 1;
        this.f23168f = true;
        this.f23169g = new l(0);
        this.f23164b = i12 != 0 ? 1 : 0;
        this.f23163a = i11 == 0 ? 0 : i13;
    }

    public a(f fVar, int i10, int i11) {
        if (fVar.I1() < 0) {
            throw new IllegalArgumentException("bigint's sign(" + fVar.I1() + ") is less than 0");
        }
        int i12 = 1;
        if (fVar.B()) {
            this.f23168f = true;
            this.f23167e = fVar.s1();
        } else {
            this.f23165c = fVar;
        }
        this.f23169g = new l(0);
        this.f23164b = i11 != 0 ? 1 : 0;
        this.f23163a = i10 == 0 ? 0 : i12;
    }

    private l l() {
        if (!this.f23168f) {
            if (this.f23165c.H1()) {
                return new l(1);
            }
            long m02 = this.f23165c.m0();
            return m02 < 2147483647L ? new l((int) m02) : l.q(this.f23165c.l0());
        }
        int i10 = 32;
        for (int i11 = 31; i11 >= 0 && (this.f23167e & (1 << i11)) == 0; i11--) {
            i10--;
        }
        if (i10 == 0) {
            i10++;
        }
        return new l(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
        if (r3.C1(r4) > 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
        if (r3 > 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
        r8.f23163a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
        r8.f23163a = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m(int r9) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.a.m(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:
        if (r0.C1(r3) > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
        if (r3 > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cc, code lost:
        r7.f23163a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cf, code lost:
        r7.f23163a = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void o(int r8) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.a.o(int):void");
    }

    private void p(int i10) {
        if (i10 <= 0) {
            return;
        }
        int i11 = 0;
        if (this.f23167e == 0) {
            this.f23169g.g(i10);
            this.f23164b |= this.f23163a;
            this.f23163a = 0;
            this.f23166d = new l(1);
            return;
        }
        int i12 = 32;
        for (int i13 = 31; i13 >= 0 && (this.f23167e & (1 << i13)) == 0; i13--) {
            i12--;
        }
        int min = Math.min(i12, i10);
        boolean z10 = i10 > i12;
        this.f23166d = new l(i12 - min);
        this.f23169g.g(i10);
        int i14 = this.f23164b | this.f23163a;
        this.f23164b = i14;
        int i15 = i14 | ((min <= 1 || (this.f23167e << ((32 - min) + 1)) == 0) ? 0 : 1);
        this.f23164b = i15;
        int i16 = this.f23167e;
        int i17 = (i16 >> (min - 1)) & 1;
        this.f23163a = i17;
        this.f23167e = i16 >> min;
        if (z10) {
            this.f23164b = i15 | i17;
            this.f23163a = 0;
        }
        if (this.f23164b != 0) {
            i11 = 1;
        }
        this.f23164b = i11;
    }

    private void q(int i10) {
        l lVar = this.f23166d;
        if (lVar == null || lVar.l(i10) > 0) {
            l lVar2 = this.f23166d;
            if (lVar2 == null) {
                lVar2 = l();
            }
            this.f23166d = lVar2;
            if (lVar2.l(i10) <= 0) {
                return;
            }
            int G = this.f23166d.G();
            if (G <= i10) {
                this.f23166d = new l(G);
                return;
            }
            int i11 = G - i10;
            this.f23166d = new l(i10);
            this.f23169g.g(i11);
            int i12 = this.f23164b | this.f23163a;
            this.f23164b = i12;
            int i13 = 0;
            int i14 = i12 | ((i11 <= 1 || (this.f23167e << ((32 - i11) + 1)) == 0) ? 0 : 1);
            this.f23164b = i14;
            int i15 = this.f23167e;
            this.f23163a = (i15 >> (i11 - 1)) & 1;
            if (i14 != 0) {
                i13 = 1;
            }
            this.f23164b = i13;
            this.f23167e = i15 >> i11;
        }
    }

    private static void s() {
    }

    @Override // u7.p
    public final int a() {
        return this.f23164b;
    }

    @Override // u7.p
    public void b(l lVar, boolean z10) {
        n(lVar);
    }

    @Override // u7.p
    public final f c() {
        return this.f23168f ? f.Y(this.f23167e) : this.f23165c;
    }

    @Override // u7.p
    public int d(int i10) {
        if (i10 >= 1) {
            if (i10 == 1) {
                return 0;
            }
            return i10 != 2 ? this.f23168f ? this.f23167e % i10 : this.f23165c.I0(i10).s1() : this.f23168f ? 1 & this.f23167e : this.f23165c.F1() ? 0 : 1;
        }
        throw new IllegalArgumentException("mod (" + i10 + ") is not greater or equal to 1");
    }

    @Override // u7.p
    public void e(int i10) {
        if (this.f23168f) {
            p(i10);
        } else {
            o(i10);
        }
    }

    @Override // u7.p
    public l f() {
        return i();
    }

    @Override // u7.p
    public void g(l lVar, l lVar2, boolean z10) {
        if (lVar.L() < 0) {
            throw new IllegalArgumentException("bits's sign(" + lVar.L() + ") is less than 0");
        } else if (lVar2 == null || lVar2.L() <= 0) {
            if (lVar.j()) {
                r(lVar.G());
            } else {
                l lVar3 = this.f23166d;
                if (lVar3 == null) {
                    lVar3 = l();
                }
                this.f23166d = lVar3;
                f n12 = lVar3.F().n1(lVar.F());
                if (n12.I1() > 0) {
                    n(l.q(n12));
                }
            }
            s();
        } else {
            l lVar4 = this.f23166d;
            if (lVar4 == null) {
                lVar4 = l();
            }
            this.f23166d = lVar4;
            if (lVar4.compareTo(lVar) > 0) {
                l B = this.f23166d.m().B(lVar);
                if (B.compareTo(lVar2) > 0) {
                    n(B);
                    s();
                }
            }
            n(lVar2);
            s();
        }
    }

    @Override // u7.p
    public final int h() {
        return this.f23163a;
    }

    @Override // u7.p
    public l i() {
        l lVar = this.f23166d;
        if (lVar == null) {
            lVar = l();
        }
        this.f23166d = lVar;
        return l.o(lVar);
    }

    @Override // u7.p
    public final l j() {
        return this.f23169g;
    }

    @Override // u7.p
    public final l k() {
        return this.f23168f ? new l(this.f23167e) : l.q(this.f23165c);
    }

    public void n(l lVar) {
        if (lVar.L() <= 0) {
            return;
        }
        if (lVar.j()) {
            e(lVar.G());
            return;
        }
        f F = lVar.F();
        while (F.I1() > 0) {
            int i10 = 1000000;
            if (F.compareTo(f.Z(1000000L)) < 0) {
                i10 = F.s1();
            }
            e(i10);
            F = F.n1(f.Y(i10));
            if (this.f23168f) {
                if (this.f23167e == 0) {
                    return;
                }
            } else if (this.f23165c.H1()) {
                return;
            }
        }
    }

    public void r(int i10) {
        if (i10 >= 0) {
            if (this.f23168f) {
                q(i10);
                return;
            } else {
                m(i10);
                return;
            }
        }
        throw new IllegalArgumentException("bits(" + i10 + ") is less than 0");
    }
}
