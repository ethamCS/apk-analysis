package b.e.b.k.m;

import b.e.b.k.e;
import b.e.b.k.m.f;
import b.e.b.k.m.p;
/* loaded from: classes.dex */
public class n extends p {
    public f k;
    g l = null;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2316a;

        static {
            int[] iArr = new int[p.b.values().length];
            f2316a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2316a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2316a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(b.e.b.k.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.k = fVar;
        this.f2330h.f2299e = f.a.TOP;
        this.i.f2299e = f.a.BOTTOM;
        fVar.f2299e = f.a.BASELINE;
        this.f2328f = 1;
    }

    @Override // b.e.b.k.m.p, b.e.b.k.m.d
    public void a(d dVar) {
        int i;
        float f2;
        int i2 = a.f2316a[this.j.ordinal()];
        if (i2 == 1) {
            p(dVar);
        } else if (i2 == 2) {
            o(dVar);
        } else if (i2 == 3) {
            b.e.b.k.e eVar = this.f2324b;
            n(dVar, eVar.G, eVar.I, 1);
            return;
        }
        g gVar = this.f2327e;
        if (gVar.f2297c && !gVar.j && this.f2326d == e.b.MATCH_CONSTRAINT) {
            b.e.b.k.e eVar2 = this.f2324b;
            int i3 = eVar2.o;
            if (i3 == 2) {
                b.e.b.k.e I = eVar2.I();
                if (I != null) {
                    g gVar2 = I.f2263e.f2327e;
                    if (gVar2.j) {
                        i = (int) ((gVar2.f2301g * this.f2324b.v) + 0.5f);
                        this.f2327e.d(i);
                    }
                }
            } else if (i3 == 3 && eVar2.f2262d.f2327e.j) {
                int u = eVar2.u();
                if (u != -1) {
                    if (u == 0) {
                        b.e.b.k.e eVar3 = this.f2324b;
                        f2 = eVar3.f2262d.f2327e.f2301g * eVar3.t();
                        i = (int) (f2 + 0.5f);
                        this.f2327e.d(i);
                    } else if (u != 1) {
                        i = 0;
                        this.f2327e.d(i);
                    }
                }
                b.e.b.k.e eVar4 = this.f2324b;
                f2 = eVar4.f2262d.f2327e.f2301g / eVar4.t();
                i = (int) (f2 + 0.5f);
                this.f2327e.d(i);
            }
        }
        f fVar = this.f2330h;
        if (fVar.f2297c) {
            f fVar2 = this.i;
            if (!fVar2.f2297c) {
                return;
            }
            if (fVar.j && fVar2.j && this.f2327e.j) {
                return;
            }
            if (!this.f2327e.j && this.f2326d == e.b.MATCH_CONSTRAINT) {
                b.e.b.k.e eVar5 = this.f2324b;
                if (eVar5.n == 0 && !eVar5.b0()) {
                    int i4 = this.f2330h.l.get(0).f2301g;
                    f fVar3 = this.f2330h;
                    int i5 = i4 + fVar3.f2300f;
                    int i6 = this.i.l.get(0).f2301g + this.i.f2300f;
                    fVar3.d(i5);
                    this.i.d(i6);
                    this.f2327e.d(i6 - i5);
                    return;
                }
            }
            if (!this.f2327e.j && this.f2326d == e.b.MATCH_CONSTRAINT && this.f2323a == 1 && this.f2330h.l.size() > 0 && this.i.l.size() > 0) {
                int i7 = (this.i.l.get(0).f2301g + this.i.f2300f) - (this.f2330h.l.get(0).f2301g + this.f2330h.f2300f);
                g gVar3 = this.f2327e;
                int i8 = gVar3.m;
                if (i7 < i8) {
                    gVar3.d(i7);
                } else {
                    gVar3.d(i8);
                }
            }
            if (!this.f2327e.j || this.f2330h.l.size() <= 0 || this.i.l.size() <= 0) {
                return;
            }
            f fVar4 = this.f2330h.l.get(0);
            f fVar5 = this.i.l.get(0);
            int i9 = fVar4.f2301g + this.f2330h.f2300f;
            int i10 = fVar5.f2301g + this.i.f2300f;
            float M = this.f2324b.M();
            if (fVar4 == fVar5) {
                i9 = fVar4.f2301g;
                i10 = fVar5.f2301g;
                M = 0.5f;
            }
            this.f2330h.d((int) (i9 + 0.5f + (((i10 - i9) - this.f2327e.f2301g) * M)));
            this.i.d(this.f2330h.f2301g + this.f2327e.f2301g);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02e3, code lost:
        if (r9.f2324b.U() != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02e5, code lost:
        r0 = r9.k;
        r1 = r9.f2330h;
        r2 = r9.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x033e, code lost:
        if (r0.f2326d == r1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0370, code lost:
        if (r9.f2324b.U() != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03e7, code lost:
        if (r0.f2326d == r1) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03e9, code lost:
        r0.f2327e.k.add(r9.f2327e);
        r9.f2327e.l.add(r9.f2324b.f2262d.f2327e);
        r9.f2327e.f2295a = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    @Override // b.e.b.k.m.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.b.k.m.n.d():void");
    }

    @Override // b.e.b.k.m.p
    public void e() {
        f fVar = this.f2330h;
        if (fVar.j) {
            this.f2324b.W0(fVar.f2301g);
        }
    }

    @Override // b.e.b.k.m.p
    public void f() {
        this.f2325c = null;
        this.f2330h.c();
        this.i.c();
        this.k.c();
        this.f2327e.c();
        this.f2329g = false;
    }

    @Override // b.e.b.k.m.p
    public boolean m() {
        return this.f2326d != e.b.MATCH_CONSTRAINT || this.f2324b.o == 0;
    }

    public void q() {
        this.f2329g = false;
        this.f2330h.c();
        this.f2330h.j = false;
        this.i.c();
        this.i.j = false;
        this.k.c();
        this.k.j = false;
        this.f2327e.j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f2324b.r();
    }
}
