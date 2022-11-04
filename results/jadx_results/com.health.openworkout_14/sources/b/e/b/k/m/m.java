package b.e.b.k.m;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class m {

    /* renamed from: d */
    public static int f2312d;

    /* renamed from: a */
    public boolean f2313a;

    /* renamed from: b */
    p f2314b;

    /* renamed from: c */
    ArrayList<p> f2315c = new ArrayList<>();

    public m(p pVar, int i) {
        this.f2314b = null;
        f2312d++;
        this.f2314b = pVar;
    }

    private long c(f fVar, long j) {
        p pVar = fVar.f2298d;
        if (pVar instanceof k) {
            return j;
        }
        int size = fVar.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            d dVar = fVar.k.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f2298d != pVar) {
                    j2 = Math.min(j2, c(fVar2, fVar2.f2300f + j));
                }
            }
        }
        if (fVar != pVar.i) {
            return j2;
        }
        long j3 = j - pVar.j();
        return Math.min(Math.min(j2, c(pVar.f2330h, j3)), j3 - pVar.f2330h.f2300f);
    }

    private long d(f fVar, long j) {
        p pVar = fVar.f2298d;
        if (pVar instanceof k) {
            return j;
        }
        int size = fVar.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            d dVar = fVar.k.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f2298d != pVar) {
                    j2 = Math.max(j2, d(fVar2, fVar2.f2300f + j));
                }
            }
        }
        if (fVar != pVar.f2330h) {
            return j2;
        }
        long j3 = j + pVar.j();
        return Math.max(Math.max(j2, d(pVar.i, j3)), j3 - pVar.i.f2300f);
    }

    public void a(p pVar) {
        this.f2315c.add(pVar);
    }

    public long b(b.e.b.k.f fVar, int i) {
        p pVar;
        long j;
        p pVar2;
        f fVar2;
        long j2;
        long j3;
        f fVar3;
        p pVar3 = this.f2314b;
        long j4 = 0;
        if (pVar3 instanceof c) {
            if (((c) pVar3).f2328f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(pVar3 instanceof l)) {
                return 0L;
            }
        } else if (!(pVar3 instanceof n)) {
            return 0L;
        }
        f fVar4 = (i == 0 ? fVar.f2262d : fVar.f2263e).f2330h;
        f fVar5 = (i == 0 ? fVar.f2262d : fVar.f2263e).i;
        boolean contains = pVar3.f2330h.l.contains(fVar4);
        boolean contains2 = this.f2314b.i.l.contains(fVar5);
        long j5 = this.f2314b.j();
        if (!contains || !contains2) {
            if (contains) {
                j3 = d(this.f2314b.f2330h, fVar3.f2300f);
                j2 = this.f2314b.f2330h.f2300f + j5;
            } else if (contains2) {
                j2 = (-this.f2314b.i.f2300f) + j5;
                j3 = -c(this.f2314b.i, fVar2.f2300f);
            } else {
                j = pVar2.f2330h.f2300f + this.f2314b.j();
                pVar = this.f2314b;
            }
            return Math.max(j3, j2);
        }
        long d2 = d(this.f2314b.f2330h, 0L);
        long c2 = c(this.f2314b.i, 0L);
        long j6 = d2 - j5;
        p pVar4 = this.f2314b;
        int i2 = pVar4.i.f2300f;
        if (j6 >= (-i2)) {
            j6 += i2;
        }
        int i3 = pVar4.f2330h.f2300f;
        long j7 = ((-c2) - j5) - i3;
        if (j7 >= i3) {
            j7 -= i3;
        }
        float o = pVar4.f2324b.o(i);
        if (o > 0.0f) {
            j4 = (((float) j7) / o) + (((float) j6) / (1.0f - o));
        }
        float f2 = (float) j4;
        long j8 = (f2 * o) + 0.5f + j5 + (f2 * (1.0f - o)) + 0.5f;
        pVar = this.f2314b;
        j = pVar.f2330h.f2300f + j8;
        return j - pVar.i.f2300f;
    }
}
