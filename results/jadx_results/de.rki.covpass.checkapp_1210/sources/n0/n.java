package n0;

import m0.e;
import n0.f;
import n0.p;
/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: k */
    public f f16807k;

    /* renamed from: l */
    g f16808l = null;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16809a;

        static {
            int[] iArr = new int[p.b.values().length];
            f16809a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16809a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16809a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(m0.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f16807k = fVar;
        this.f16832h.f16780e = f.a.TOP;
        this.f16833i.f16780e = f.a.BOTTOM;
        fVar.f16780e = f.a.BASELINE;
        this.f16830f = 1;
    }

    @Override // n0.p, n0.d
    public void a(d dVar) {
        g gVar;
        int i10;
        float f10;
        m0.e eVar;
        m0.e eVar2;
        int i11 = a.f16809a[this.f16834j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            m0.e eVar3 = this.f16826b;
            n(dVar, eVar3.P, eVar3.R, 1);
            return;
        }
        g gVar2 = this.f16829e;
        if (gVar2.f16778c && !gVar2.f16785j && this.f16828d == e.b.MATCH_CONSTRAINT) {
            m0.e eVar4 = this.f16826b;
            int i12 = eVar4.f16215x;
            if (i12 == 2) {
                m0.e I = eVar4.I();
                if (I != null) {
                    if (I.f16179f.f16829e.f16785j) {
                        i10 = (int) ((gVar.f16782g * this.f16826b.E) + 0.5f);
                        this.f16829e.d(i10);
                    }
                }
            } else if (i12 == 3 && eVar4.f16177e.f16829e.f16785j) {
                int u10 = eVar4.u();
                if (u10 != -1) {
                    if (u10 == 0) {
                        f10 = eVar2.f16177e.f16829e.f16782g * this.f16826b.t();
                        i10 = (int) (f10 + 0.5f);
                        this.f16829e.d(i10);
                    } else if (u10 != 1) {
                        i10 = 0;
                        this.f16829e.d(i10);
                    }
                }
                f10 = eVar.f16177e.f16829e.f16782g / this.f16826b.t();
                i10 = (int) (f10 + 0.5f);
                this.f16829e.d(i10);
            }
        }
        f fVar = this.f16832h;
        if (fVar.f16778c) {
            f fVar2 = this.f16833i;
            if (!fVar2.f16778c) {
                return;
            }
            if (fVar.f16785j && fVar2.f16785j && this.f16829e.f16785j) {
                return;
            }
            if (!this.f16829e.f16785j && this.f16828d == e.b.MATCH_CONSTRAINT) {
                m0.e eVar5 = this.f16826b;
                if (eVar5.f16213w == 0 && !eVar5.i0()) {
                    int i13 = this.f16832h.f16787l.get(0).f16782g;
                    f fVar3 = this.f16832h;
                    int i14 = i13 + fVar3.f16781f;
                    int i15 = this.f16833i.f16787l.get(0).f16782g + this.f16833i.f16781f;
                    fVar3.d(i14);
                    this.f16833i.d(i15);
                    this.f16829e.d(i15 - i14);
                    return;
                }
            }
            if (!this.f16829e.f16785j && this.f16828d == e.b.MATCH_CONSTRAINT && this.f16825a == 1 && this.f16832h.f16787l.size() > 0 && this.f16833i.f16787l.size() > 0) {
                int i16 = (this.f16833i.f16787l.get(0).f16782g + this.f16833i.f16781f) - (this.f16832h.f16787l.get(0).f16782g + this.f16832h.f16781f);
                g gVar3 = this.f16829e;
                int i17 = gVar3.f16793m;
                if (i16 < i17) {
                    gVar3.d(i16);
                } else {
                    gVar3.d(i17);
                }
            }
            if (!this.f16829e.f16785j || this.f16832h.f16787l.size() <= 0 || this.f16833i.f16787l.size() <= 0) {
                return;
            }
            f fVar4 = this.f16832h.f16787l.get(0);
            f fVar5 = this.f16833i.f16787l.get(0);
            int i18 = fVar4.f16782g + this.f16832h.f16781f;
            int i19 = fVar5.f16782g + this.f16833i.f16781f;
            float P = this.f16826b.P();
            if (fVar4 == fVar5) {
                i18 = fVar4.f16782g;
                i19 = fVar5.f16782g;
                P = 0.5f;
            }
            this.f16832h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f16829e.f16782g) * P)));
            this.f16833i.d(this.f16832h.f16782g + this.f16829e.f16782g);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x02e7, code lost:
        if (r9.f16826b.X() != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02e9, code lost:
        r0 = r9.f16807k;
        r1 = r9.f16832h;
        r2 = r9.f16808l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0342, code lost:
        if (r0.f16828d == r1) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0374, code lost:
        if (r9.f16826b.X() != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03eb, code lost:
        if (r0.f16828d == r1) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03ed, code lost:
        r0.f16829e.f16786k.add(r9.f16829e);
        r9.f16829e.f16787l.add(r9.f16826b.f16177e.f16829e);
        r9.f16829e.f16776a = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    @Override // n0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.n.d():void");
    }

    @Override // n0.p
    public void e() {
        f fVar = this.f16832h;
        if (fVar.f16785j) {
            this.f16826b.k1(fVar.f16782g);
        }
    }

    @Override // n0.p
    public void f() {
        this.f16827c = null;
        this.f16832h.c();
        this.f16833i.c();
        this.f16807k.c();
        this.f16829e.c();
        this.f16831g = false;
    }

    @Override // n0.p
    public boolean m() {
        return this.f16828d != e.b.MATCH_CONSTRAINT || this.f16826b.f16215x == 0;
    }

    public void q() {
        this.f16831g = false;
        this.f16832h.c();
        this.f16832h.f16785j = false;
        this.f16833i.c();
        this.f16833i.f16785j = false;
        this.f16807k.c();
        this.f16807k.f16785j = false;
        this.f16829e.f16785j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f16826b.r();
    }
}
