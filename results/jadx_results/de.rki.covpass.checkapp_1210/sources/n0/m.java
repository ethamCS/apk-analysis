package n0;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class m {

    /* renamed from: h */
    public static int f16799h;

    /* renamed from: c */
    p f16802c;

    /* renamed from: d */
    p f16803d;

    /* renamed from: f */
    int f16805f;

    /* renamed from: g */
    int f16806g;

    /* renamed from: a */
    public int f16800a = 0;

    /* renamed from: b */
    public boolean f16801b = false;

    /* renamed from: e */
    ArrayList<p> f16804e = new ArrayList<>();

    public m(p pVar, int i10) {
        this.f16802c = null;
        this.f16803d = null;
        int i11 = f16799h;
        this.f16805f = i11;
        f16799h = i11 + 1;
        this.f16802c = pVar;
        this.f16803d = pVar;
        this.f16806g = i10;
    }

    private long c(f fVar, long j10) {
        p pVar = fVar.f16779d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f16786k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f16786k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f16779d != pVar) {
                    j11 = Math.min(j11, c(fVar2, fVar2.f16781f + j10));
                }
            }
        }
        if (fVar != pVar.f16833i) {
            return j11;
        }
        long j12 = j10 - pVar.j();
        return Math.min(Math.min(j11, c(pVar.f16832h, j12)), j12 - pVar.f16832h.f16781f);
    }

    private long d(f fVar, long j10) {
        p pVar = fVar.f16779d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f16786k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = fVar.f16786k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f16779d != pVar) {
                    j11 = Math.max(j11, d(fVar2, fVar2.f16781f + j10));
                }
            }
        }
        if (fVar != pVar.f16832h) {
            return j11;
        }
        long j12 = j10 + pVar.j();
        return Math.max(Math.max(j11, d(pVar.f16833i, j12)), j12 - pVar.f16833i.f16781f);
    }

    public void a(p pVar) {
        this.f16804e.add(pVar);
        this.f16803d = pVar;
    }

    public long b(m0.f fVar, int i10) {
        p pVar;
        long j10;
        p pVar2;
        f fVar2;
        long j11;
        long j12;
        f fVar3;
        p pVar3 = this.f16802c;
        long j13 = 0;
        if (pVar3 instanceof c) {
            if (((c) pVar3).f16830f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar3 instanceof l)) {
                return 0L;
            }
        } else if (!(pVar3 instanceof n)) {
            return 0L;
        }
        f fVar4 = (i10 == 0 ? fVar.f16177e : fVar.f16179f).f16832h;
        f fVar5 = (i10 == 0 ? fVar.f16177e : fVar.f16179f).f16833i;
        boolean contains = pVar3.f16832h.f16787l.contains(fVar4);
        boolean contains2 = this.f16802c.f16833i.f16787l.contains(fVar5);
        long j14 = this.f16802c.j();
        if (!contains || !contains2) {
            if (contains) {
                j12 = d(this.f16802c.f16832h, fVar3.f16781f);
                j11 = this.f16802c.f16832h.f16781f + j14;
            } else if (contains2) {
                j11 = (-this.f16802c.f16833i.f16781f) + j14;
                j12 = -c(this.f16802c.f16833i, fVar2.f16781f);
            } else {
                j10 = pVar2.f16832h.f16781f + this.f16802c.j();
                pVar = this.f16802c;
            }
            return Math.max(j12, j11);
        }
        long d10 = d(this.f16802c.f16832h, 0L);
        long c10 = c(this.f16802c.f16833i, 0L);
        long j15 = d10 - j14;
        p pVar4 = this.f16802c;
        int i11 = pVar4.f16833i.f16781f;
        if (j15 >= (-i11)) {
            j15 += i11;
        }
        int i12 = pVar4.f16832h.f16781f;
        long j16 = ((-c10) - j14) - i12;
        if (j16 >= i12) {
            j16 -= i12;
        }
        float o10 = pVar4.f16826b.o(i10);
        if (o10 > 0.0f) {
            j13 = (((float) j16) / o10) + (((float) j15) / (1.0f - o10));
        }
        float f10 = (float) j13;
        long j17 = (f10 * o10) + 0.5f + j14 + (f10 * (1.0f - o10)) + 0.5f;
        pVar = this.f16802c;
        j10 = pVar.f16832h.f16781f + j17;
        return j10 - pVar.f16833i.f16781f;
    }
}
