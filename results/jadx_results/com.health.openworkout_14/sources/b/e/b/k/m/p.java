package b.e.b.k.m;

import b.e.b.k.d;
import b.e.b.k.e;
/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a */
    public int f2323a;

    /* renamed from: b */
    b.e.b.k.e f2324b;

    /* renamed from: c */
    m f2325c;

    /* renamed from: d */
    protected e.b f2326d;

    /* renamed from: e */
    g f2327e = new g(this);

    /* renamed from: f */
    public int f2328f = 0;

    /* renamed from: g */
    boolean f2329g = false;

    /* renamed from: h */
    public f f2330h = new f(this);
    public f i = new f(this);
    protected b j = b.NONE;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2331a;

        static {
            int[] iArr = new int[d.b.values().length];
            f2331a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2331a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2331a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2331a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2331a[d.b.BOTTOM.ordinal()] = 5;
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

    public p(b.e.b.k.e eVar) {
        this.f2324b = eVar;
    }

    private void l(int i, int i2) {
        int i3;
        g gVar;
        int i4 = this.f2323a;
        if (i4 != 0) {
            if (i4 == 1) {
                int g2 = g(this.f2327e.m, i);
                gVar = this.f2327e;
                i3 = Math.min(g2, i2);
                gVar.d(i3);
            } else if (i4 != 2) {
                if (i4 != 3) {
                    return;
                }
                b.e.b.k.e eVar = this.f2324b;
                p pVar = eVar.f2262d;
                e.b bVar = pVar.f2326d;
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && pVar.f2323a == 3) {
                    n nVar = eVar.f2263e;
                    if (nVar.f2326d == bVar2 && nVar.f2323a == 3) {
                        return;
                    }
                }
                if (i == 0) {
                    pVar = eVar.f2263e;
                }
                if (!pVar.f2327e.j) {
                    return;
                }
                float t = eVar.t();
                this.f2327e.d(i == 1 ? (int) ((pVar.f2327e.f2301g / t) + 0.5f) : (int) ((t * pVar.f2327e.f2301g) + 0.5f));
                return;
            } else {
                b.e.b.k.e I = this.f2324b.I();
                if (I == null) {
                    return;
                }
                g gVar2 = (i == 0 ? I.f2262d : I.f2263e).f2327e;
                if (!gVar2.j) {
                    return;
                }
                b.e.b.k.e eVar2 = this.f2324b;
                i2 = (int) ((gVar2.f2301g * (i == 0 ? eVar2.s : eVar2.v)) + 0.5f);
            }
        }
        gVar = this.f2327e;
        i3 = g(i2, i);
        gVar.d(i3);
    }

    @Override // b.e.b.k.m.d
    public void a(d dVar) {
    }

    public final void b(f fVar, f fVar2, int i) {
        fVar.l.add(fVar2);
        fVar.f2300f = i;
        fVar2.k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.l.add(fVar2);
        fVar.l.add(this.f2327e);
        fVar.f2302h = i;
        fVar.i = gVar;
        fVar2.k.add(fVar);
        gVar.k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int i3;
        if (i2 == 0) {
            b.e.b.k.e eVar = this.f2324b;
            int i4 = eVar.r;
            i3 = Math.max(eVar.q, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            b.e.b.k.e eVar2 = this.f2324b;
            int i5 = eVar2.u;
            i3 = Math.max(eVar2.t, i);
            if (i5 > 0) {
                i3 = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    public final f h(b.e.b.k.d dVar) {
        p pVar;
        p pVar2;
        b.e.b.k.d dVar2 = dVar.f2248f;
        if (dVar2 == null) {
            return null;
        }
        b.e.b.k.e eVar = dVar2.f2246d;
        int i = a.f2331a[dVar2.f2247e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                pVar2 = eVar.f2262d;
            } else if (i == 3) {
                pVar = eVar.f2263e;
            } else if (i == 4) {
                return eVar.f2263e.k;
            } else {
                if (i != 5) {
                    return null;
                }
                pVar2 = eVar.f2263e;
            }
            return pVar2.i;
        }
        pVar = eVar.f2262d;
        return pVar.f2330h;
    }

    public final f i(b.e.b.k.d dVar, int i) {
        b.e.b.k.d dVar2 = dVar.f2248f;
        if (dVar2 == null) {
            return null;
        }
        b.e.b.k.e eVar = dVar2.f2246d;
        p pVar = i == 0 ? eVar.f2262d : eVar.f2263e;
        int i2 = a.f2331a[dVar2.f2247e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return pVar.i;
        }
        return pVar.f2330h;
    }

    public long j() {
        g gVar = this.f2327e;
        if (gVar.j) {
            return gVar.f2301g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f2329g;
    }

    public abstract boolean m();

    public void n(d dVar, b.e.b.k.d dVar2, b.e.b.k.d dVar3, int i) {
        f fVar;
        f h2 = h(dVar2);
        f h3 = h(dVar3);
        if (!h2.j || !h3.j) {
            return;
        }
        int e2 = h2.f2301g + dVar2.e();
        int e3 = h3.f2301g - dVar3.e();
        int i2 = e3 - e2;
        if (!this.f2327e.j && this.f2326d == e.b.MATCH_CONSTRAINT) {
            l(i, i2);
        }
        g gVar = this.f2327e;
        if (!gVar.j) {
            return;
        }
        if (gVar.f2301g == i2) {
            this.f2330h.d(e2);
            fVar = this.i;
        } else {
            b.e.b.k.e eVar = this.f2324b;
            float w = i == 0 ? eVar.w() : eVar.M();
            if (h2 == h3) {
                e2 = h2.f2301g;
                e3 = h3.f2301g;
                w = 0.5f;
            }
            this.f2330h.d((int) (e2 + 0.5f + (((e3 - e2) - this.f2327e.f2301g) * w)));
            fVar = this.i;
            e3 = this.f2330h.f2301g + this.f2327e.f2301g;
        }
        fVar.d(e3);
    }

    public void o(d dVar) {
    }

    public void p(d dVar) {
    }
}
