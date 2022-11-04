package n0;

import java.util.List;
import m0.d;
import m0.e;
import n0.f;
import n0.p;
/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: k */
    private static int[] f16797k = new int[2];

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16798a;

        static {
            int[] iArr = new int[p.b.values().length];
            f16798a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16798a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16798a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(m0.e eVar) {
        super(eVar);
        this.f16832h.f16780e = f.a.LEFT;
        this.f16833i.f16780e = f.a.RIGHT;
        this.f16830f = 0;
    }

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else if (i14 != 1) {
                return;
            } else {
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 > i16) {
        } else {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0296, code lost:
        if (r14 != 1) goto L124;
     */
    @Override // n0.p, n0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(n0.d r17) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.l.a(n0.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // n0.p
    public void d() {
        m0.d dVar;
        f fVar;
        int i10;
        f fVar2;
        f fVar3;
        d dVar2;
        List<d> list;
        f fVar4;
        int i11;
        f fVar5;
        f fVar6;
        int i12;
        f fVar7;
        f fVar8;
        m0.e I;
        m0.e I2;
        m0.e eVar = this.f16826b;
        if (eVar.f16169a) {
            this.f16829e.d(eVar.U());
        }
        if (!this.f16829e.f16785j) {
            e.b y10 = this.f16826b.y();
            this.f16828d = y10;
            if (y10 != e.b.MATCH_CONSTRAINT) {
                e.b bVar = e.b.MATCH_PARENT;
                if (y10 == bVar && (I2 = this.f16826b.I()) != null && (I2.y() == e.b.FIXED || I2.y() == bVar)) {
                    int U = (I2.U() - this.f16826b.O.e()) - this.f16826b.Q.e();
                    b(this.f16832h, I2.f16177e.f16832h, this.f16826b.O.e());
                    b(this.f16833i, I2.f16177e.f16833i, -this.f16826b.Q.e());
                    this.f16829e.d(U);
                    return;
                } else if (this.f16828d == e.b.FIXED) {
                    this.f16829e.d(this.f16826b.U());
                }
            }
        } else {
            e.b bVar2 = this.f16828d;
            e.b bVar3 = e.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (I = this.f16826b.I()) != null && (I.y() == e.b.FIXED || I.y() == bVar3)) {
                b(this.f16832h, I.f16177e.f16832h, this.f16826b.O.e());
                b(this.f16833i, I.f16177e.f16833i, -this.f16826b.Q.e());
                return;
            }
        }
        g gVar = this.f16829e;
        if (gVar.f16785j) {
            m0.e eVar2 = this.f16826b;
            if (eVar2.f16169a) {
                m0.d[] dVarArr = eVar2.W;
                if (dVarArr[0].f16159f != null && dVarArr[1].f16159f != null) {
                    if (eVar2.g0()) {
                        this.f16832h.f16781f = this.f16826b.W[0].e();
                        fVar = this.f16833i;
                        dVar = this.f16826b.W[1];
                        fVar.f16781f = -dVar.e();
                        return;
                    }
                    f h10 = h(this.f16826b.W[0]);
                    if (h10 != null) {
                        b(this.f16832h, h10, this.f16826b.W[0].e());
                    }
                    f h11 = h(this.f16826b.W[1]);
                    if (h11 != null) {
                        b(this.f16833i, h11, -this.f16826b.W[1].e());
                    }
                    this.f16832h.f16777b = true;
                    this.f16833i.f16777b = true;
                    return;
                }
                if (dVarArr[0].f16159f != null) {
                    fVar8 = h(dVarArr[0]);
                    if (fVar8 == null) {
                        return;
                    }
                    fVar7 = this.f16832h;
                    i12 = this.f16826b.W[0].e();
                } else if (dVarArr[1].f16159f != null) {
                    f h12 = h(dVarArr[1]);
                    if (h12 == null) {
                        return;
                    }
                    b(this.f16833i, h12, -this.f16826b.W[1].e());
                    fVar6 = this.f16832h;
                    fVar5 = this.f16833i;
                    i11 = -this.f16829e.f16782g;
                    b(fVar6, fVar5, i11);
                    return;
                } else if ((eVar2 instanceof m0.h) || eVar2.I() == null || this.f16826b.m(d.b.CENTER).f16159f != null) {
                    return;
                } else {
                    fVar8 = this.f16826b.I().f16177e.f16832h;
                    fVar7 = this.f16832h;
                    i12 = this.f16826b.V();
                }
                b(fVar7, fVar8, i12);
                fVar6 = this.f16833i;
                fVar5 = this.f16832h;
                i11 = this.f16829e.f16782g;
                b(fVar6, fVar5, i11);
                return;
            }
        }
        if (this.f16828d == e.b.MATCH_CONSTRAINT) {
            m0.e eVar3 = this.f16826b;
            int i13 = eVar3.f16213w;
            if (i13 == 2) {
                m0.e I3 = eVar3.I();
                if (I3 != null) {
                    g gVar2 = I3.f16179f.f16829e;
                    this.f16829e.f16787l.add(gVar2);
                    gVar2.f16786k.add(this.f16829e);
                    g gVar3 = this.f16829e;
                    gVar3.f16777b = true;
                    gVar3.f16786k.add(this.f16832h);
                    list = this.f16829e.f16786k;
                    dVar2 = this.f16833i;
                    list.add(dVar2);
                }
            } else if (i13 == 3) {
                if (eVar3.f16215x == 3) {
                    this.f16832h.f16776a = this;
                    this.f16833i.f16776a = this;
                    n nVar = eVar3.f16179f;
                    nVar.f16832h.f16776a = this;
                    nVar.f16833i.f16776a = this;
                    gVar.f16776a = this;
                    if (eVar3.i0()) {
                        this.f16829e.f16787l.add(this.f16826b.f16179f.f16829e);
                        this.f16826b.f16179f.f16829e.f16786k.add(this.f16829e);
                        n nVar2 = this.f16826b.f16179f;
                        nVar2.f16829e.f16776a = this;
                        this.f16829e.f16787l.add(nVar2.f16832h);
                        this.f16829e.f16787l.add(this.f16826b.f16179f.f16833i);
                        this.f16826b.f16179f.f16832h.f16786k.add(this.f16829e);
                        list = this.f16826b.f16179f.f16833i.f16786k;
                        dVar2 = this.f16829e;
                        list.add(dVar2);
                    } else if (this.f16826b.g0()) {
                        this.f16826b.f16179f.f16829e.f16787l.add(this.f16829e);
                        list = this.f16829e.f16786k;
                        dVar2 = this.f16826b.f16179f.f16829e;
                        list.add(dVar2);
                    } else {
                        fVar4 = this.f16826b.f16179f.f16829e;
                    }
                } else {
                    g gVar4 = eVar3.f16179f.f16829e;
                    gVar.f16787l.add(gVar4);
                    gVar4.f16786k.add(this.f16829e);
                    this.f16826b.f16179f.f16832h.f16786k.add(this.f16829e);
                    this.f16826b.f16179f.f16833i.f16786k.add(this.f16829e);
                    g gVar5 = this.f16829e;
                    gVar5.f16777b = true;
                    gVar5.f16786k.add(this.f16832h);
                    this.f16829e.f16786k.add(this.f16833i);
                    this.f16832h.f16787l.add(this.f16829e);
                    fVar4 = this.f16833i;
                }
                list = fVar4.f16787l;
                dVar2 = this.f16829e;
                list.add(dVar2);
            }
            fVar.f16781f = -dVar.e();
            return;
        }
        m0.e eVar4 = this.f16826b;
        m0.d[] dVarArr2 = eVar4.W;
        if (dVarArr2[0].f16159f != null && dVarArr2[1].f16159f != null) {
            if (eVar4.g0()) {
                this.f16832h.f16781f = this.f16826b.W[0].e();
                fVar = this.f16833i;
                dVar = this.f16826b.W[1];
                fVar.f16781f = -dVar.e();
                return;
            }
            f h13 = h(this.f16826b.W[0]);
            f h14 = h(this.f16826b.W[1]);
            if (h13 != null) {
                h13.b(this);
            }
            if (h14 != null) {
                h14.b(this);
            }
            this.f16834j = p.b.CENTER;
            return;
        }
        if (dVarArr2[0].f16159f != null) {
            fVar3 = h(dVarArr2[0]);
            if (fVar3 == null) {
                return;
            }
            fVar2 = this.f16832h;
            i10 = this.f16826b.W[0].e();
        } else if (dVarArr2[1].f16159f != null) {
            f h15 = h(dVarArr2[1]);
            if (h15 == null) {
                return;
            }
            b(this.f16833i, h15, -this.f16826b.W[1].e());
            c(this.f16832h, this.f16833i, -1, this.f16829e);
            return;
        } else if ((eVar4 instanceof m0.h) || eVar4.I() == null) {
            return;
        } else {
            fVar3 = this.f16826b.I().f16177e.f16832h;
            fVar2 = this.f16832h;
            i10 = this.f16826b.V();
        }
        b(fVar2, fVar3, i10);
        c(this.f16833i, this.f16832h, 1, this.f16829e);
    }

    @Override // n0.p
    public void e() {
        f fVar = this.f16832h;
        if (fVar.f16785j) {
            this.f16826b.j1(fVar.f16782g);
        }
    }

    @Override // n0.p
    public void f() {
        this.f16827c = null;
        this.f16832h.c();
        this.f16833i.c();
        this.f16829e.c();
        this.f16831g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // n0.p
    public boolean m() {
        return this.f16828d != e.b.MATCH_CONSTRAINT || this.f16826b.f16213w == 0;
    }

    public void r() {
        this.f16831g = false;
        this.f16832h.c();
        this.f16832h.f16785j = false;
        this.f16833i.c();
        this.f16833i.f16785j = false;
        this.f16829e.f16785j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f16826b.r();
    }
}
