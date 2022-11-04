package o2;

import java.util.ArrayDeque;
import java.util.Deque;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    protected ok.b<a> f17347a = new ok.b<>(c.f17346a, b.f17345c);

    /* renamed from: b */
    protected Deque<a> f17348b = new ArrayDeque();

    /* renamed from: c */
    ka.e f17349c = new ka.e();

    /* renamed from: d */
    ka.e f17350d = new ka.e();

    /* renamed from: e */
    double f17351e = ea.e.d(45.0f);

    private static int b(int i10, int i11) {
        return v3.b.a(i10, i11, 4);
    }

    public static void e(e eVar) {
        int i10 = 3;
        if (ea.d.c(eVar.f17352a.b(0), eVar.f17352a.b(2), eVar.f17352a.b(1), eVar.f17352a.b(3), eVar.f17354c) != null) {
            eVar.f17356e = 0.0d;
            eVar.f17357f = Double.MAX_VALUE;
            for (int i11 = 0; i11 < 4; i11++) {
                double c10 = eVar.f17352a.b(i11).c(eVar.f17352a.b(i10));
                eVar.f17355d[i10] = c10;
                eVar.f17356e = Math.max(eVar.f17356e, c10);
                eVar.f17357f = Math.min(eVar.f17357f, c10);
                i10 = i11;
            }
            return;
        }
        throw new RuntimeException("BAD");
    }

    private a i() {
        return !this.f17348b.isEmpty() ? this.f17348b.remove() : this.f17347a.i();
    }

    public double a(e eVar, int i10, e eVar2, int i11) {
        ka.b b10 = eVar.f17352a.b(i10);
        ka.b b11 = eVar.f17352a.b(b(i10, 1));
        ka.b b12 = eVar2.f17352a.b(i11);
        ka.b b13 = eVar2.f17352a.b(b(i11, 1));
        this.f17349c.i(b11.f10622c - b10.f10622c, b11.f10623d - b10.f10623d);
        this.f17350d.i(b13.f10622c - b12.f10622c, b13.f10623d - b12.f10623d);
        double k10 = this.f17349c.k(this.f17350d);
        return Math.min(ea.e.b(3.141592653589793d, k10), k10);
    }

    public boolean c(e eVar, int i10, e eVar2, int i11) {
        return a(eVar, i10, eVar2, i11) <= this.f17351e;
    }

    public void d(e eVar, int i10, e eVar2, int i11, double d10) {
        a[] aVarArr = eVar.f17359h;
        if (aVarArr[i10] != null && aVarArr[i10].f17344e > d10) {
            g(aVarArr[i10]);
        }
        a[] aVarArr2 = eVar2.f17359h;
        if (aVarArr2[i11] != null && aVarArr2[i11].f17344e > d10) {
            g(aVarArr2[i11]);
        }
        if (eVar.f17359h[i10] == null && eVar2.f17359h[i11] == null) {
            f(eVar, i10, eVar2, i11, d10);
        }
    }

    void f(e eVar, int i10, e eVar2, int i11, double d10) {
        a i12 = i();
        i12.f17340a = eVar;
        i12.f17342c = i10;
        i12.f17341b = eVar2;
        i12.f17343d = i11;
        i12.f17344e = d10;
        eVar.f17359h[i10] = i12;
        eVar2.f17359h[i11] = i12;
    }

    public void g(a aVar) {
        aVar.f17340a.f17359h[aVar.f17342c] = null;
        aVar.f17341b.f17359h[aVar.f17343d] = null;
        aVar.c();
        this.f17348b.add(aVar);
    }

    public int h(e eVar, ja.e eVar2, ka.b bVar, ja.e eVar3) {
        int i10 = 3;
        for (int i11 = 0; i11 < 4; i11++) {
            eVar3.f14240c = eVar.f17352a.b(i10);
            eVar3.f14241d = eVar.f17352a.b(i11);
            if (ea.d.b(eVar2, eVar3, bVar) != null) {
                return i10;
            }
            i10 = i11;
        }
        return -1;
    }

    public void j() {
        int i10 = 0;
        while (true) {
            ok.b<a> bVar = this.f17347a;
            if (i10 >= bVar.f18623d) {
                this.f17348b.clear();
                this.f17348b.addAll(this.f17347a.t());
                return;
            }
            bVar.c(i10).c();
            i10++;
        }
    }
}
