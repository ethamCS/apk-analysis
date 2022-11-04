package n0;

import java.util.ArrayList;
import m0.d;
import m0.e;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    private final ArrayList<m0.e> f16749a = new ArrayList<>();

    /* renamed from: b */
    private a f16750b = new a();

    /* renamed from: c */
    private m0.f f16751c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: k */
        public static int f16752k = 0;

        /* renamed from: l */
        public static int f16753l = 1;

        /* renamed from: m */
        public static int f16754m = 2;

        /* renamed from: a */
        public e.b f16755a;

        /* renamed from: b */
        public e.b f16756b;

        /* renamed from: c */
        public int f16757c;

        /* renamed from: d */
        public int f16758d;

        /* renamed from: e */
        public int f16759e;

        /* renamed from: f */
        public int f16760f;

        /* renamed from: g */
        public int f16761g;

        /* renamed from: h */
        public boolean f16762h;

        /* renamed from: i */
        public boolean f16763i;

        /* renamed from: j */
        public int f16764j;
    }

    /* renamed from: n0.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0254b {
        void a(m0.e eVar, a aVar);

        void b();
    }

    public b(m0.f fVar) {
        this.f16751c = fVar;
    }

    private boolean a(AbstractC0254b abstractC0254b, m0.e eVar, int i10) {
        this.f16750b.f16755a = eVar.y();
        this.f16750b.f16756b = eVar.R();
        this.f16750b.f16757c = eVar.U();
        this.f16750b.f16758d = eVar.v();
        a aVar = this.f16750b;
        aVar.f16763i = false;
        aVar.f16764j = i10;
        e.b bVar = aVar.f16755a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f16756b == bVar2;
        boolean z12 = z10 && eVar.f16176d0 > 0.0f;
        boolean z13 = z11 && eVar.f16176d0 > 0.0f;
        if (z12 && eVar.f16217y[0] == 4) {
            aVar.f16755a = e.b.FIXED;
        }
        if (z13 && eVar.f16217y[1] == 4) {
            aVar.f16756b = e.b.FIXED;
        }
        abstractC0254b.a(eVar, aVar);
        eVar.h1(this.f16750b.f16759e);
        eVar.I0(this.f16750b.f16760f);
        eVar.H0(this.f16750b.f16762h);
        eVar.x0(this.f16750b.f16761g);
        a aVar2 = this.f16750b;
        aVar2.f16764j = a.f16752k;
        return aVar2.f16763i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:
        if (r8 != r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0094, code lost:
        if (r5.f16176d0 <= 0.0f) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(m0.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<m0.e> r0 = r13.L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.P1(r1)
            n0.b$b r2 = r13.F1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList<m0.e> r5 = r13.L0
            java.lang.Object r5 = r5.get(r4)
            m0.e r5 = (m0.e) r5
            boolean r6 = r5 instanceof m0.g
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof m0.a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.j0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            n0.l r6 = r5.f16177e
            if (r6 == 0) goto L47
            n0.n r7 = r5.f16179f
            if (r7 == 0) goto L47
            n0.g r6 = r6.f16829e
            boolean r6 = r6.f16785j
            if (r6 == 0) goto L47
            n0.g r6 = r7.f16829e
            boolean r6 = r6.f16785j
            if (r6 == 0) goto L47
            goto La0
        L47:
            m0.e$b r6 = r5.s(r3)
            r7 = 1
            m0.e$b r8 = r5.s(r7)
            m0.e$b r9 = m0.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f16213w
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f16215x
            if (r10 == r7) goto L60
            r10 = r7
            goto L61
        L60:
            r10 = r3
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.P1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof m0.k
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f16213w
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.g0()
            if (r11 != 0) goto L7c
            r10 = r7
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f16215x
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.g0()
            if (r11 != 0) goto L8b
            r10 = r7
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f16176d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = n0.b.a.f16752k
            r12.a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.b.b(m0.f):void");
    }

    private void c(m0.f fVar, String str, int i10, int i11, int i12) {
        int G = fVar.G();
        int F = fVar.F();
        fVar.X0(0);
        fVar.W0(0);
        fVar.h1(i11);
        fVar.I0(i12);
        fVar.X0(G);
        fVar.W0(F);
        this.f16751c.T1(i10);
        this.f16751c.p1();
    }

    public long d(m0.f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19;
        boolean z10;
        int i20;
        m0.f fVar2;
        int i21;
        boolean z11;
        int i22;
        boolean z12;
        b bVar = this;
        AbstractC0254b F1 = fVar.F1();
        int size = fVar.L0.size();
        int U = fVar.U();
        int v10 = fVar.v();
        boolean b10 = m0.j.b(i10, 128);
        boolean z13 = b10 || m0.j.b(i10, 64);
        if (z13) {
            for (int i23 = 0; i23 < size; i23++) {
                m0.e eVar = fVar.L0.get(i23);
                e.b y10 = eVar.y();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z14 = (y10 == bVar2) && (eVar.R() == bVar2) && eVar.t() > 0.0f;
                if ((eVar.g0() && z14) || ((eVar.i0() && z14) || (eVar instanceof m0.k) || eVar.g0() || eVar.i0())) {
                    z13 = false;
                    break;
                }
            }
        }
        if (z13) {
            boolean z15 = j0.d.f13871r;
        }
        boolean z16 = z13 & ((i13 == 1073741824 && i15 == 1073741824) || b10);
        int i24 = 2;
        if (z16) {
            int min = Math.min(fVar.E(), i14);
            int min2 = Math.min(fVar.D(), i16);
            if (i13 == 1073741824 && fVar.U() != min) {
                fVar.h1(min);
                fVar.I1();
            }
            if (i15 == 1073741824 && fVar.v() != min2) {
                fVar.I0(min2);
                fVar.I1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                z10 = fVar.C1(b10);
                i19 = 2;
            } else {
                boolean D1 = fVar.D1(b10);
                if (i13 == 1073741824) {
                    D1 &= fVar.E1(b10, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    z10 = fVar.E1(b10, 1) & D1;
                    i19++;
                } else {
                    z10 = D1;
                }
            }
            if (z10) {
                fVar.m1(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            z10 = false;
            i19 = 0;
        }
        if (!z10 || i19 != 2) {
            int G1 = fVar.G1();
            if (size > 0) {
                b(fVar);
            }
            e(fVar);
            int size2 = bVar.f16749a.size();
            if (size > 0) {
                c(fVar, "First pass", 0, U, v10);
            }
            if (size2 > 0) {
                e.b y11 = fVar.y();
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z17 = y11 == bVar3;
                boolean z18 = fVar.R() == bVar3;
                int max = Math.max(fVar.U(), bVar.f16751c.G());
                int max2 = Math.max(fVar.v(), bVar.f16751c.F());
                int i25 = 0;
                boolean z19 = false;
                while (i25 < size2) {
                    m0.e eVar2 = bVar.f16749a.get(i25);
                    if (!(eVar2 instanceof m0.k)) {
                        i22 = G1;
                    } else {
                        int U2 = eVar2.U();
                        int v11 = eVar2.v();
                        i22 = G1;
                        boolean a10 = bVar.a(F1, eVar2, a.f16753l) | z19;
                        int U3 = eVar2.U();
                        int v12 = eVar2.v();
                        if (U3 != U2) {
                            eVar2.h1(U3);
                            if (z17 && eVar2.K() > max) {
                                max = Math.max(max, eVar2.K() + eVar2.m(d.b.RIGHT).e());
                            }
                            z12 = true;
                        } else {
                            z12 = a10;
                        }
                        if (v12 != v11) {
                            eVar2.I0(v12);
                            if (z18 && eVar2.p() > max2) {
                                max2 = Math.max(max2, eVar2.p() + eVar2.m(d.b.BOTTOM).e());
                            }
                            z12 = true;
                        }
                        z19 = z12 | ((m0.k) eVar2).s1();
                    }
                    i25++;
                    G1 = i22;
                    i24 = 2;
                }
                int i26 = G1;
                int i27 = i24;
                int i28 = 0;
                while (i28 < i27) {
                    int i29 = 0;
                    while (i29 < size2) {
                        m0.e eVar3 = bVar.f16749a.get(i29);
                        if ((!(eVar3 instanceof m0.h) || (eVar3 instanceof m0.k)) && !(eVar3 instanceof m0.g) && eVar3.T() != 8 && ((!z16 || !eVar3.f16177e.f16829e.f16785j || !eVar3.f16179f.f16829e.f16785j) && !(eVar3 instanceof m0.k))) {
                            int U4 = eVar3.U();
                            int v13 = eVar3.v();
                            z11 = z16;
                            int n10 = eVar3.n();
                            int i30 = a.f16753l;
                            i21 = size2;
                            if (i28 == 1) {
                                i30 = a.f16754m;
                            }
                            boolean a11 = bVar.a(F1, eVar3, i30) | z19;
                            int U5 = eVar3.U();
                            int v14 = eVar3.v();
                            if (U5 != U4) {
                                eVar3.h1(U5);
                                if (z17 && eVar3.K() > max) {
                                    max = Math.max(max, eVar3.K() + eVar3.m(d.b.RIGHT).e());
                                }
                                a11 = true;
                            }
                            if (v14 != v13) {
                                eVar3.I0(v14);
                                if (z18 && eVar3.p() > max2) {
                                    max2 = Math.max(max2, eVar3.p() + eVar3.m(d.b.BOTTOM).e());
                                }
                                a11 = true;
                            }
                            z19 = (!eVar3.X() || n10 == eVar3.n()) ? a11 : true;
                        } else {
                            z11 = z16;
                            i21 = size2;
                        }
                        i29++;
                        bVar = this;
                        z16 = z11;
                        size2 = i21;
                    }
                    boolean z20 = z16;
                    int i31 = size2;
                    if (!z19) {
                        break;
                    }
                    i28++;
                    c(fVar, "intermediate pass", i28, U, v10);
                    bVar = this;
                    z16 = z20;
                    size2 = i31;
                    i27 = 2;
                    z19 = false;
                }
                fVar2 = fVar;
                i20 = i26;
            } else {
                fVar2 = fVar;
                i20 = G1;
            }
            fVar2.S1(i20);
            return 0L;
        }
        return 0L;
    }

    public void e(m0.f fVar) {
        this.f16749a.clear();
        int size = fVar.L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            m0.e eVar = fVar.L0.get(i10);
            e.b y10 = eVar.y();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (y10 == bVar || eVar.R() == bVar) {
                this.f16749a.add(eVar);
            }
        }
        fVar.I1();
    }
}
