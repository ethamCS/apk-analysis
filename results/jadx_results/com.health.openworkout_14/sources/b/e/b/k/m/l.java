package b.e.b.k.m;

import b.e.b.k.d;
import b.e.b.k.e;
import b.e.b.k.m.f;
import b.e.b.k.m.p;
import java.util.List;
/* loaded from: classes.dex */
public class l extends p {
    private static int[] k = new int[2];

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2311a;

        static {
            int[] iArr = new int[p.b.values().length];
            f2311a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2311a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2311a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(b.e.b.k.e eVar) {
        super(eVar);
        this.f2330h.f2299e = f.a.LEFT;
        this.i.f2299e = f.a.RIGHT;
        this.f2328f = 0;
    }

    private void q(int[] iArr, int i, int i2, int i3, int i4, float f2, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f2) + 0.5f);
                iArr[1] = i7;
                return;
            } else if (i5 != 1) {
                return;
            } else {
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f2) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f2) + 0.5f);
        int i9 = (int) ((i6 / f2) + 0.5f);
        if (i8 <= i6 && i7 <= i7) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i6 > i6 || i9 > i7) {
        } else {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0295, code lost:
        if (r14 != 1) goto L124;
     */
    @Override // b.e.b.k.m.p, b.e.b.k.m.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(b.e.b.k.m.d r17) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.b.k.m.l.a(b.e.b.k.m.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b.e.b.k.m.p
    public void d() {
        b.e.b.k.d dVar;
        f fVar;
        int i;
        f fVar2;
        f fVar3;
        d dVar2;
        List<d> list;
        f fVar4;
        int i2;
        f fVar5;
        f fVar6;
        int i3;
        f fVar7;
        f fVar8;
        b.e.b.k.e I;
        b.e.b.k.e I2;
        b.e.b.k.e eVar = this.f2324b;
        if (eVar.f2259a) {
            this.f2327e.d(eVar.R());
        }
        if (!this.f2327e.j) {
            e.b y = this.f2324b.y();
            this.f2326d = y;
            if (y != e.b.MATCH_CONSTRAINT) {
                e.b bVar = e.b.MATCH_PARENT;
                if (y == bVar && (((I2 = this.f2324b.I()) != null && I2.y() == e.b.FIXED) || I2.y() == bVar)) {
                    int R = (I2.R() - this.f2324b.F.e()) - this.f2324b.H.e();
                    b(this.f2330h, I2.f2262d.f2330h, this.f2324b.F.e());
                    b(this.i, I2.f2262d.i, -this.f2324b.H.e());
                    this.f2327e.d(R);
                    return;
                } else if (this.f2326d == e.b.FIXED) {
                    this.f2327e.d(this.f2324b.R());
                }
            }
        } else {
            e.b bVar2 = this.f2326d;
            e.b bVar3 = e.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (((I = this.f2324b.I()) != null && I.y() == e.b.FIXED) || I.y() == bVar3)) {
                b(this.f2330h, I.f2262d.f2330h, this.f2324b.F.e());
                b(this.i, I.f2262d.i, -this.f2324b.H.e());
                return;
            }
        }
        g gVar = this.f2327e;
        if (gVar.j) {
            b.e.b.k.e eVar2 = this.f2324b;
            if (eVar2.f2259a) {
                b.e.b.k.d[] dVarArr = eVar2.N;
                if (dVarArr[0].f2248f != null && dVarArr[1].f2248f != null) {
                    if (eVar2.Z()) {
                        this.f2330h.f2300f = this.f2324b.N[0].e();
                        fVar = this.i;
                        dVar = this.f2324b.N[1];
                        fVar.f2300f = -dVar.e();
                        return;
                    }
                    f h2 = h(this.f2324b.N[0]);
                    if (h2 != null) {
                        b(this.f2330h, h2, this.f2324b.N[0].e());
                    }
                    f h3 = h(this.f2324b.N[1]);
                    if (h3 != null) {
                        b(this.i, h3, -this.f2324b.N[1].e());
                    }
                    this.f2330h.f2296b = true;
                    this.i.f2296b = true;
                    return;
                }
                if (dVarArr[0].f2248f != null) {
                    fVar8 = h(dVarArr[0]);
                    if (fVar8 == null) {
                        return;
                    }
                    fVar7 = this.f2330h;
                    i3 = this.f2324b.N[0].e();
                } else if (dVarArr[1].f2248f != null) {
                    f h4 = h(dVarArr[1]);
                    if (h4 == null) {
                        return;
                    }
                    b(this.i, h4, -this.f2324b.N[1].e());
                    fVar6 = this.f2330h;
                    fVar5 = this.i;
                    i2 = -this.f2327e.f2301g;
                    b(fVar6, fVar5, i2);
                    return;
                } else if ((eVar2 instanceof b.e.b.k.h) || eVar2.I() == null || this.f2324b.m(d.b.CENTER).f2248f != null) {
                    return;
                } else {
                    fVar8 = this.f2324b.I().f2262d.f2330h;
                    fVar7 = this.f2330h;
                    i3 = this.f2324b.S();
                }
                b(fVar7, fVar8, i3);
                fVar6 = this.i;
                fVar5 = this.f2330h;
                i2 = this.f2327e.f2301g;
                b(fVar6, fVar5, i2);
                return;
            }
        }
        if (this.f2326d == e.b.MATCH_CONSTRAINT) {
            b.e.b.k.e eVar3 = this.f2324b;
            int i4 = eVar3.n;
            if (i4 == 2) {
                b.e.b.k.e I3 = eVar3.I();
                if (I3 != null) {
                    g gVar2 = I3.f2263e.f2327e;
                    this.f2327e.l.add(gVar2);
                    gVar2.k.add(this.f2327e);
                    g gVar3 = this.f2327e;
                    gVar3.f2296b = true;
                    gVar3.k.add(this.f2330h);
                    list = this.f2327e.k;
                    dVar2 = this.i;
                    list.add(dVar2);
                }
            } else if (i4 == 3) {
                if (eVar3.o == 3) {
                    this.f2330h.f2295a = this;
                    this.i.f2295a = this;
                    n nVar = eVar3.f2263e;
                    nVar.f2330h.f2295a = this;
                    nVar.i.f2295a = this;
                    gVar.f2295a = this;
                    if (eVar3.b0()) {
                        this.f2327e.l.add(this.f2324b.f2263e.f2327e);
                        this.f2324b.f2263e.f2327e.k.add(this.f2327e);
                        n nVar2 = this.f2324b.f2263e;
                        nVar2.f2327e.f2295a = this;
                        this.f2327e.l.add(nVar2.f2330h);
                        this.f2327e.l.add(this.f2324b.f2263e.i);
                        this.f2324b.f2263e.f2330h.k.add(this.f2327e);
                        list = this.f2324b.f2263e.i.k;
                        dVar2 = this.f2327e;
                        list.add(dVar2);
                    } else if (this.f2324b.Z()) {
                        this.f2324b.f2263e.f2327e.l.add(this.f2327e);
                        list = this.f2327e.k;
                        dVar2 = this.f2324b.f2263e.f2327e;
                        list.add(dVar2);
                    } else {
                        fVar4 = this.f2324b.f2263e.f2327e;
                    }
                } else {
                    g gVar4 = eVar3.f2263e.f2327e;
                    gVar.l.add(gVar4);
                    gVar4.k.add(this.f2327e);
                    this.f2324b.f2263e.f2330h.k.add(this.f2327e);
                    this.f2324b.f2263e.i.k.add(this.f2327e);
                    g gVar5 = this.f2327e;
                    gVar5.f2296b = true;
                    gVar5.k.add(this.f2330h);
                    this.f2327e.k.add(this.i);
                    this.f2330h.l.add(this.f2327e);
                    fVar4 = this.i;
                }
                list = fVar4.l;
                dVar2 = this.f2327e;
                list.add(dVar2);
            }
            fVar.f2300f = -dVar.e();
            return;
        }
        b.e.b.k.e eVar4 = this.f2324b;
        b.e.b.k.d[] dVarArr2 = eVar4.N;
        if (dVarArr2[0].f2248f != null && dVarArr2[1].f2248f != null) {
            if (eVar4.Z()) {
                this.f2330h.f2300f = this.f2324b.N[0].e();
                fVar = this.i;
                dVar = this.f2324b.N[1];
                fVar.f2300f = -dVar.e();
                return;
            }
            f h5 = h(this.f2324b.N[0]);
            f h6 = h(this.f2324b.N[1]);
            h5.b(this);
            h6.b(this);
            this.j = p.b.CENTER;
            return;
        }
        if (dVarArr2[0].f2248f != null) {
            fVar3 = h(dVarArr2[0]);
            if (fVar3 == null) {
                return;
            }
            fVar2 = this.f2330h;
            i = this.f2324b.N[0].e();
        } else if (dVarArr2[1].f2248f != null) {
            f h7 = h(dVarArr2[1]);
            if (h7 == null) {
                return;
            }
            b(this.i, h7, -this.f2324b.N[1].e());
            c(this.f2330h, this.i, -1, this.f2327e);
            return;
        } else if ((eVar4 instanceof b.e.b.k.h) || eVar4.I() == null) {
            return;
        } else {
            fVar3 = this.f2324b.I().f2262d.f2330h;
            fVar2 = this.f2330h;
            i = this.f2324b.S();
        }
        b(fVar2, fVar3, i);
        c(this.i, this.f2330h, 1, this.f2327e);
    }

    @Override // b.e.b.k.m.p
    public void e() {
        f fVar = this.f2330h;
        if (fVar.j) {
            this.f2324b.V0(fVar.f2301g);
        }
    }

    @Override // b.e.b.k.m.p
    public void f() {
        this.f2325c = null;
        this.f2330h.c();
        this.i.c();
        this.f2327e.c();
        this.f2329g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b.e.b.k.m.p
    public boolean m() {
        return this.f2326d != e.b.MATCH_CONSTRAINT || this.f2324b.n == 0;
    }

    public void r() {
        this.f2329g = false;
        this.f2330h.c();
        this.f2330h.j = false;
        this.i.c();
        this.i.j = false;
        this.f2327e.j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f2324b.r();
    }
}
