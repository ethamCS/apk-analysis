package n0;

import m0.d;
import m0.e;
/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a */
    public int f16825a;

    /* renamed from: b */
    m0.e f16826b;

    /* renamed from: c */
    m f16827c;

    /* renamed from: d */
    protected e.b f16828d;

    /* renamed from: e */
    g f16829e = new g(this);

    /* renamed from: f */
    public int f16830f = 0;

    /* renamed from: g */
    boolean f16831g = false;

    /* renamed from: h */
    public f f16832h = new f(this);

    /* renamed from: i */
    public f f16833i = new f(this);

    /* renamed from: j */
    protected b f16834j = b.NONE;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16835a;

        static {
            int[] iArr = new int[d.b.values().length];
            f16835a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16835a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16835a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16835a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16835a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(m0.e eVar) {
        this.f16826b = eVar;
    }

    private void l(int i10, int i11) {
        int i12;
        g gVar;
        int i13 = this.f16825a;
        if (i13 != 0) {
            if (i13 == 1) {
                int g10 = g(this.f16829e.f16793m, i10);
                gVar = this.f16829e;
                i12 = Math.min(g10, i11);
                gVar.d(i12);
            } else if (i13 != 2) {
                if (i13 != 3) {
                    return;
                }
                m0.e eVar = this.f16826b;
                p pVar = eVar.f16177e;
                e.b bVar = pVar.f16828d;
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && pVar.f16825a == 3) {
                    n nVar = eVar.f16179f;
                    if (nVar.f16828d == bVar2 && nVar.f16825a == 3) {
                        return;
                    }
                }
                if (i10 == 0) {
                    pVar = eVar.f16179f;
                }
                if (!pVar.f16829e.f16785j) {
                    return;
                }
                float t10 = eVar.t();
                this.f16829e.d(i10 == 1 ? (int) ((pVar.f16829e.f16782g / t10) + 0.5f) : (int) ((t10 * pVar.f16829e.f16782g) + 0.5f));
                return;
            } else {
                m0.e I = this.f16826b.I();
                if (I == null) {
                    return;
                }
                g gVar2 = (i10 == 0 ? I.f16177e : I.f16179f).f16829e;
                if (!gVar2.f16785j) {
                    return;
                }
                m0.e eVar2 = this.f16826b;
                i11 = (int) ((gVar2.f16782g * (i10 == 0 ? eVar2.B : eVar2.E)) + 0.5f);
            }
        }
        gVar = this.f16829e;
        i12 = g(i11, i10);
        gVar.d(i12);
    }

    @Override // n0.d
    public void a(d dVar) {
    }

    public final void b(f fVar, f fVar2, int i10) {
        fVar.f16787l.add(fVar2);
        fVar.f16781f = i10;
        fVar2.f16786k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f16787l.add(fVar2);
        fVar.f16787l.add(this.f16829e);
        fVar.f16783h = i10;
        fVar.f16784i = gVar;
        fVar2.f16786k.add(fVar);
        gVar.f16786k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int i12;
        if (i11 == 0) {
            m0.e eVar = this.f16826b;
            int i13 = eVar.A;
            i12 = Math.max(eVar.f16219z, i10);
            if (i13 > 0) {
                i12 = Math.min(i13, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        } else {
            m0.e eVar2 = this.f16826b;
            int i14 = eVar2.D;
            i12 = Math.max(eVar2.C, i10);
            if (i14 > 0) {
                i12 = Math.min(i14, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        }
        return i12;
    }

    public final f h(m0.d dVar) {
        p pVar;
        p pVar2;
        m0.d dVar2 = dVar.f16159f;
        if (dVar2 == null) {
            return null;
        }
        m0.e eVar = dVar2.f16157d;
        int i10 = a.f16835a[dVar2.f16158e.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                pVar2 = eVar.f16177e;
            } else if (i10 == 3) {
                pVar = eVar.f16179f;
            } else if (i10 == 4) {
                return eVar.f16179f.f16807k;
            } else {
                if (i10 != 5) {
                    return null;
                }
                pVar2 = eVar.f16179f;
            }
            return pVar2.f16833i;
        }
        pVar = eVar.f16177e;
        return pVar.f16832h;
    }

    public final f i(m0.d dVar, int i10) {
        m0.d dVar2 = dVar.f16159f;
        if (dVar2 == null) {
            return null;
        }
        m0.e eVar = dVar2.f16157d;
        p pVar = i10 == 0 ? eVar.f16177e : eVar.f16179f;
        int i11 = a.f16835a[dVar2.f16158e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f16833i;
        }
        return pVar.f16832h;
    }

    public long j() {
        g gVar = this.f16829e;
        if (gVar.f16785j) {
            return gVar.f16782g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f16831g;
    }

    public abstract boolean m();

    public void n(d dVar, m0.d dVar2, m0.d dVar3, int i10) {
        f fVar;
        f h10 = h(dVar2);
        f h11 = h(dVar3);
        if (!h10.f16785j || !h11.f16785j) {
            return;
        }
        int e10 = h10.f16782g + dVar2.e();
        int e11 = h11.f16782g - dVar3.e();
        int i11 = e11 - e10;
        if (!this.f16829e.f16785j && this.f16828d == e.b.MATCH_CONSTRAINT) {
            l(i10, i11);
        }
        g gVar = this.f16829e;
        if (!gVar.f16785j) {
            return;
        }
        if (gVar.f16782g == i11) {
            this.f16832h.d(e10);
            fVar = this.f16833i;
        } else {
            m0.e eVar = this.f16826b;
            float w9 = i10 == 0 ? eVar.w() : eVar.P();
            if (h10 == h11) {
                e10 = h10.f16782g;
                e11 = h11.f16782g;
                w9 = 0.5f;
            }
            this.f16832h.d((int) (e10 + 0.5f + (((e11 - e10) - this.f16829e.f16782g) * w9)));
            fVar = this.f16833i;
            e11 = this.f16832h.f16782g + this.f16829e.f16782g;
        }
        fVar.d(e11);
    }

    public void o(d dVar) {
    }

    public void p(d dVar) {
    }
}
