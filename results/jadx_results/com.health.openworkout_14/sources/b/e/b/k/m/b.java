package b.e.b.k.m;

import b.e.b.k.d;
import b.e.b.k.e;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    private final ArrayList<b.e.b.k.e> f2276a = new ArrayList<>();

    /* renamed from: b */
    private a f2277b = new a();

    /* renamed from: c */
    private b.e.b.k.f f2278c;

    /* loaded from: classes.dex */
    public static class a {
        public static int k = 0;
        public static int l = 1;
        public static int m = 2;

        /* renamed from: a */
        public e.b f2279a;

        /* renamed from: b */
        public e.b f2280b;

        /* renamed from: c */
        public int f2281c;

        /* renamed from: d */
        public int f2282d;

        /* renamed from: e */
        public int f2283e;

        /* renamed from: f */
        public int f2284f;

        /* renamed from: g */
        public int f2285g;

        /* renamed from: h */
        public boolean f2286h;
        public boolean i;
        public int j;
    }

    /* renamed from: b.e.b.k.m.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0041b {
        void a(b.e.b.k.e eVar, a aVar);

        void b();
    }

    public b(b.e.b.k.f fVar) {
        this.f2278c = fVar;
    }

    private boolean a(AbstractC0041b abstractC0041b, b.e.b.k.e eVar, int i) {
        this.f2277b.f2279a = eVar.y();
        this.f2277b.f2280b = eVar.O();
        this.f2277b.f2281c = eVar.R();
        this.f2277b.f2282d = eVar.v();
        a aVar = this.f2277b;
        aVar.i = false;
        aVar.j = i;
        e.b bVar = aVar.f2279a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z = bVar == bVar2;
        boolean z2 = aVar.f2280b == bVar2;
        boolean z3 = z && eVar.U > 0.0f;
        boolean z4 = z2 && eVar.U > 0.0f;
        if (z3 && eVar.p[0] == 4) {
            aVar.f2279a = e.b.FIXED;
        }
        if (z4 && eVar.p[1] == 4) {
            aVar.f2280b = e.b.FIXED;
        }
        abstractC0041b.a(eVar, aVar);
        eVar.U0(this.f2277b.f2283e);
        eVar.v0(this.f2277b.f2284f);
        eVar.u0(this.f2277b.f2286h);
        eVar.k0(this.f2277b.f2285g);
        a aVar2 = this.f2277b;
        aVar2.j = a.k;
        return aVar2.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
        if (r8 != r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0095, code lost:
        if (r5.U <= 0.0f) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(b.e.b.k.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<b.e.b.k.e> r0 = r13.p0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.B1(r1)
            b.e.b.k.m.b$b r2 = r13.r1()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r0) goto Lb0
            java.util.ArrayList<b.e.b.k.e> r5 = r13.p0
            java.lang.Object r5 = r5.get(r4)
            b.e.b.k.e r5 = (b.e.b.k.e) r5
            boolean r6 = r5 instanceof b.e.b.k.g
            if (r6 == 0) goto L22
            goto Lac
        L22:
            boolean r6 = r5 instanceof b.e.b.k.a
            if (r6 == 0) goto L28
            goto Lac
        L28:
            boolean r6 = r5.c0()
            if (r6 == 0) goto L30
            goto Lac
        L30:
            if (r1 == 0) goto L48
            b.e.b.k.m.l r6 = r5.f2262d
            if (r6 == 0) goto L48
            b.e.b.k.m.n r7 = r5.f2263e
            if (r7 == 0) goto L48
            b.e.b.k.m.g r6 = r6.f2327e
            boolean r6 = r6.j
            if (r6 == 0) goto L48
            b.e.b.k.m.g r6 = r7.f2327e
            boolean r6 = r6.j
            if (r6 == 0) goto L48
            goto Lac
        L48:
            b.e.b.k.e$b r6 = r5.s(r3)
            r7 = 1
            b.e.b.k.e$b r8 = r5.s(r7)
            b.e.b.k.e$b r9 = b.e.b.k.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L61
            int r10 = r5.n
            if (r10 == r7) goto L61
            if (r8 != r9) goto L61
            int r10 = r5.o
            if (r10 == r7) goto L61
            r10 = 1
            goto L62
        L61:
            r10 = 0
        L62:
            if (r10 != 0) goto L98
            boolean r11 = r13.B1(r7)
            if (r11 == 0) goto L98
            boolean r11 = r5 instanceof b.e.b.k.k
            if (r11 != 0) goto L98
            if (r6 != r9) goto L7d
            int r11 = r5.n
            if (r11 != 0) goto L7d
            if (r8 == r9) goto L7d
            boolean r11 = r5.Z()
            if (r11 != 0) goto L7d
            r10 = 1
        L7d:
            if (r8 != r9) goto L8c
            int r11 = r5.o
            if (r11 != 0) goto L8c
            if (r6 == r9) goto L8c
            boolean r11 = r5.Z()
            if (r11 != 0) goto L8c
            r10 = 1
        L8c:
            if (r6 == r9) goto L90
            if (r8 != r9) goto L98
        L90:
            float r6 = r5.U
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L98
            goto L99
        L98:
            r7 = r10
        L99:
            if (r7 == 0) goto L9c
            goto Lac
        L9c:
            int r6 = b.e.b.k.m.b.a.k
            r12.a(r2, r5, r6)
            b.e.b.e r5 = r13.u0
            if (r5 == 0) goto Lac
            long r6 = r5.f2199a
            r8 = 1
            long r6 = r6 + r8
            r5.f2199a = r6
        Lac:
            int r4 = r4 + 1
            goto L12
        Lb0:
            r2.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.b.k.m.b.b(b.e.b.k.f):void");
    }

    private void c(b.e.b.k.f fVar, String str, int i, int i2) {
        int G = fVar.G();
        int F = fVar.F();
        fVar.K0(0);
        fVar.J0(0);
        fVar.U0(i);
        fVar.v0(i2);
        fVar.K0(G);
        fVar.J0(F);
        this.f2278c.b1();
    }

    public long d(b.e.b.k.f fVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        boolean z;
        int i11;
        boolean z2;
        boolean z3;
        int i12;
        boolean z4;
        AbstractC0041b abstractC0041b;
        int i13;
        int i14;
        int i15;
        boolean z5;
        b.e.b.e eVar;
        AbstractC0041b r1 = fVar.r1();
        int size = fVar.p0.size();
        int R = fVar.R();
        int v = fVar.v();
        boolean b2 = b.e.b.k.j.b(i, 128);
        boolean z6 = b2 || b.e.b.k.j.b(i, 64);
        if (z6) {
            for (int i16 = 0; i16 < size; i16++) {
                b.e.b.k.e eVar2 = fVar.p0.get(i16);
                e.b y = eVar2.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z7 = (y == bVar) && (eVar2.O() == bVar) && eVar2.t() > 0.0f;
                if ((eVar2.Z() && z7) || ((eVar2.b0() && z7) || (eVar2 instanceof b.e.b.k.k) || eVar2.Z() || eVar2.b0())) {
                    z6 = false;
                    break;
                }
            }
        }
        if (z6 && (eVar = b.e.b.d.x) != null) {
            eVar.f2201c++;
        }
        boolean z8 = z6 & ((i4 == 1073741824 && i6 == 1073741824) || b2);
        if (z8) {
            int min = Math.min(fVar.E(), i5);
            int min2 = Math.min(fVar.D(), i7);
            if (i4 == 1073741824 && fVar.R() != min) {
                fVar.U0(min);
                fVar.u1();
            }
            if (i6 == 1073741824 && fVar.v() != min2) {
                fVar.v0(min2);
                fVar.u1();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                z = fVar.o1(b2);
                i10 = 2;
            } else {
                boolean p1 = fVar.p1(b2);
                if (i4 == 1073741824) {
                    p1 &= fVar.q1(b2, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    z = fVar.q1(b2, 1) & p1;
                    i10++;
                } else {
                    z = p1;
                }
            }
            if (z) {
                fVar.Y0(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            z = false;
            i10 = 0;
        }
        if (!z || i10 != 2) {
            int s1 = fVar.s1();
            if (size > 0) {
                b(fVar);
            }
            e(fVar);
            int size2 = this.f2276a.size();
            if (size > 0) {
                c(fVar, "First pass", R, v);
            }
            if (size2 > 0) {
                e.b y2 = fVar.y();
                e.b bVar2 = e.b.WRAP_CONTENT;
                boolean z9 = y2 == bVar2;
                boolean z10 = fVar.O() == bVar2;
                int max = Math.max(fVar.R(), this.f2278c.G());
                int max2 = Math.max(fVar.v(), this.f2278c.F());
                int i17 = 0;
                boolean z11 = false;
                while (i17 < size2) {
                    b.e.b.k.e eVar3 = this.f2276a.get(i17);
                    if (!(eVar3 instanceof b.e.b.k.k)) {
                        i13 = s1;
                        i15 = R;
                        i14 = v;
                    } else {
                        int R2 = eVar3.R();
                        i13 = s1;
                        int v2 = eVar3.v();
                        i15 = R;
                        boolean a2 = a(r1, eVar3, a.l) | z11;
                        b.e.b.e eVar4 = fVar.u0;
                        i14 = v;
                        if (eVar4 != null) {
                            eVar4.f2200b++;
                        }
                        int R3 = eVar3.R();
                        int v3 = eVar3.v();
                        if (R3 != R2) {
                            eVar3.U0(R3);
                            if (z9 && eVar3.K() > max) {
                                max = Math.max(max, eVar3.K() + eVar3.m(d.b.RIGHT).e());
                            }
                            z5 = true;
                        } else {
                            z5 = a2;
                        }
                        if (v3 != v2) {
                            eVar3.v0(v3);
                            if (z10 && eVar3.p() > max2) {
                                max2 = Math.max(max2, eVar3.p() + eVar3.m(d.b.BOTTOM).e());
                            }
                            z5 = true;
                        }
                        z11 = z5 | ((b.e.b.k.k) eVar3).d1();
                    }
                    i17++;
                    s1 = i13;
                    R = i15;
                    v = i14;
                }
                int i18 = s1;
                int i19 = R;
                int i20 = v;
                int i21 = 0;
                int i22 = 2;
                while (i21 < i22) {
                    int i23 = 0;
                    while (i23 < size2) {
                        b.e.b.k.e eVar5 = this.f2276a.get(i23);
                        if ((!(eVar5 instanceof b.e.b.k.h) || (eVar5 instanceof b.e.b.k.k)) && !(eVar5 instanceof b.e.b.k.g) && eVar5.Q() != 8 && ((!z8 || !eVar5.f2262d.f2327e.j || !eVar5.f2263e.f2327e.j) && !(eVar5 instanceof b.e.b.k.k))) {
                            int R4 = eVar5.R();
                            int v4 = eVar5.v();
                            int n = eVar5.n();
                            int i24 = a.l;
                            z4 = z8;
                            if (i21 == 1) {
                                i24 = a.m;
                            }
                            boolean a3 = a(r1, eVar5, i24) | z11;
                            b.e.b.e eVar6 = fVar.u0;
                            i12 = size2;
                            abstractC0041b = r1;
                            if (eVar6 != null) {
                                eVar6.f2200b++;
                            }
                            int R5 = eVar5.R();
                            int v5 = eVar5.v();
                            if (R5 != R4) {
                                eVar5.U0(R5);
                                if (z9 && eVar5.K() > max) {
                                    max = Math.max(max, eVar5.K() + eVar5.m(d.b.RIGHT).e());
                                }
                                a3 = true;
                            }
                            if (v5 != v4) {
                                eVar5.v0(v5);
                                if (z10 && eVar5.p() > max2) {
                                    max2 = Math.max(max2, eVar5.p() + eVar5.m(d.b.BOTTOM).e());
                                }
                                a3 = true;
                            }
                            z11 = (!eVar5.U() || n == eVar5.n()) ? a3 : true;
                        } else {
                            z4 = z8;
                            i12 = size2;
                            abstractC0041b = r1;
                        }
                        i23++;
                        size2 = i12;
                        r1 = abstractC0041b;
                        z8 = z4;
                    }
                    boolean z12 = z8;
                    int i25 = size2;
                    AbstractC0041b abstractC0041b2 = r1;
                    if (!z11) {
                        break;
                    }
                    c(fVar, "intermediate pass", i19, i20);
                    i21++;
                    r1 = abstractC0041b2;
                    z8 = z12;
                    i22 = 2;
                    z11 = false;
                    size2 = i25;
                }
                if (z11) {
                    c(fVar, "2nd pass", i19, i20);
                    if (fVar.R() < max) {
                        fVar.U0(max);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (fVar.v() < max2) {
                        fVar.v0(max2);
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (z3) {
                        c(fVar, "3rd pass", i19, i20);
                    }
                }
                i11 = i18;
            } else {
                i11 = s1;
            }
            fVar.E1(i11);
            return 0L;
        }
        return 0L;
    }

    public void e(b.e.b.k.f fVar) {
        this.f2276a.clear();
        int size = fVar.p0.size();
        for (int i = 0; i < size; i++) {
            b.e.b.k.e eVar = fVar.p0.get(i);
            e.b y = eVar.y();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (y == bVar || eVar.O() == bVar) {
                this.f2276a.add(eVar);
            }
        }
        fVar.u1();
    }
}
