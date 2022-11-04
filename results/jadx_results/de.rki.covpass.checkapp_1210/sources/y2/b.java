package y2;

import hl.c;
import java.util.List;
import ka.d;
import rk.j;
import rk.n;
/* loaded from: classes.dex */
public class b {

    /* renamed from: f */
    boolean f25768f;

    /* renamed from: g */
    private boolean f25769g;

    /* renamed from: a */
    protected n f25763a = new n(1, 9);

    /* renamed from: b */
    protected el.a<n> f25764b = new bl.a();

    /* renamed from: c */
    protected x2.a f25765c = new x2.a();

    /* renamed from: d */
    protected x2.a f25766d = new x2.a();

    /* renamed from: e */
    private a f25767e = new a();

    /* renamed from: h */
    private boolean f25770h = false;

    /* renamed from: i */
    private final j f25771i = new j();

    /* renamed from: j */
    private final j f25772j = new j();

    /* renamed from: k */
    private final j f25773k = new j();

    /* renamed from: l */
    private final j f25774l = new j();

    /* renamed from: m */
    private final j f25775m = new j();

    /* renamed from: n */
    private final j f25776n = new j();

    /* renamed from: o */
    private final j f25777o = new j();

    /* renamed from: p */
    private final j f25778p = new j();

    /* renamed from: q */
    private final j f25779q = new j();

    /* renamed from: r */
    private final j f25780r = new j();

    public b(boolean z10) {
        this.f25768f = z10;
    }

    private void e(b4.a aVar, d dVar, d dVar2) {
        if (this.f25769g) {
            this.f25765c.b(aVar.f5450a, dVar);
            this.f25766d.b(aVar.f5451b, dVar2);
            return;
        }
        dVar.h(aVar.f5450a);
        dVar2.h(aVar.f5451b);
    }

    private void f(b4.b bVar, ka.b bVar2, ka.b bVar3) {
        if (this.f25769g) {
            this.f25765c.a(bVar.f5452a, bVar2);
            this.f25766d.a(bVar.f5453b, bVar3);
            return;
        }
        bVar2.k(bVar.f5452a);
        bVar3.k(bVar.f5453b);
    }

    public static void k(n nVar, x2.a aVar, x2.a aVar2) {
        c p10 = c.p(nVar);
        nVar.g(c.p(aVar2.d(null)).i(p10).i(c.p(aVar.c(null))).e());
    }

    protected int a(b4.c cVar, b4.c cVar2, n nVar, int i10) {
        da.b.a(cVar.f5454a, this.f25771i);
        da.b.a(cVar.f5455b, this.f25772j);
        sk.a.b(this.f25771i, this.f25773k);
        sk.a.b(this.f25772j, this.f25774l);
        da.b.a(cVar2.f5454a, this.f25775m);
        da.b.a(cVar2.f5455b, this.f25776n);
        sk.a.b(this.f25775m, this.f25777o);
        sk.a.b(this.f25776n, this.f25778p);
        sk.a.c(this.f25774l, this.f25776n, this.f25779q);
        sk.a.c(this.f25773k, this.f25775m, this.f25780r);
        int i11 = i10 * 9;
        for (int i12 = 0; i12 < 3; i12++) {
            for (int i13 = 0; i13 < 3; i13++) {
                for (int i14 = 0; i14 < 3; i14++) {
                    double[] dArr = nVar.f21296c;
                    int i15 = (i14 * 3) + i11 + i13;
                    dArr[i15] = dArr[i15] + this.f25779q.d(i12, i14);
                    double[] dArr2 = nVar.f21296c;
                    int i16 = (i12 * 3) + i11 + i14;
                    dArr2[i16] = dArr2[i16] - this.f25780r.d(i14, i13);
                }
                i11 += 9;
            }
        }
        return i10 + 9;
    }

    protected int b(List<b4.c> list, n nVar, int i10) {
        int i11 = 0;
        if (!this.f25770h) {
            for (int i12 = 1; i12 < list.size(); i12++) {
                i10 = a(list.get(i12 - 1), list.get(i12), nVar, i10);
            }
            return a(list.get(0), list.get(list.size() - 1), nVar, i10);
        }
        while (i11 < list.size()) {
            int i13 = i11 + 1;
            for (int i14 = i13; i14 < list.size(); i14++) {
                i10 = a(list.get(i11), list.get(i14), nVar, i10);
            }
            i11 = i13;
        }
        return i10;
    }

    protected int c(List<b4.b> list, n nVar, int i10) {
        ka.b bVar = new ka.b();
        ka.b bVar2 = new ka.b();
        for (int i11 = 0; i11 < list.size(); i11++) {
            f(list.get(i11), bVar, bVar2);
            nVar.F(i10, 3, -bVar.f10622c);
            nVar.F(i10, 4, -bVar.f10623d);
            nVar.F(i10, 5, -1.0d);
            nVar.F(i10, 6, bVar2.f10623d * bVar.f10622c);
            nVar.F(i10, 7, bVar2.f10623d * bVar.f10623d);
            nVar.F(i10, 8, bVar2.f10623d);
            int i12 = i10 + 1;
            nVar.F(i12, 0, bVar.f10622c);
            nVar.F(i12, 1, bVar.f10623d);
            nVar.F(i12, 2, 1.0d);
            nVar.F(i12, 6, (-bVar2.f10622c) * bVar.f10622c);
            nVar.F(i12, 7, (-bVar2.f10622c) * bVar.f10623d);
            nVar.F(i12, 8, -bVar2.f10622c);
            i10 = i12 + 1;
        }
        return i10;
    }

    protected int d(List<b4.a> list, n nVar, int i10) {
        d dVar = new d();
        d dVar2 = new d();
        int i11 = i10;
        for (int i12 = 0; i12 < list.size(); i12++) {
            e(list.get(i12), dVar, dVar2);
            nVar.F(i11, 3, (-dVar2.f10626q) * dVar.f10624c);
            nVar.F(i11, 4, (-dVar2.f10626q) * dVar.f10625d);
            nVar.F(i11, 5, (-dVar2.f10626q) * dVar.f10626q);
            nVar.F(i11, 6, dVar2.f10625d * dVar.f10624c);
            nVar.F(i11, 7, dVar2.f10625d * dVar.f10625d);
            nVar.F(i11, 8, dVar2.f10625d * dVar.f10626q);
            int i13 = i11 + 1;
            nVar.F(i13, 0, dVar2.f10626q * dVar.f10624c);
            nVar.F(i13, 1, dVar2.f10626q * dVar.f10625d);
            nVar.F(i13, 2, dVar2.f10626q * dVar.f10626q);
            nVar.F(i13, 6, (-dVar2.f10624c) * dVar.f10624c);
            nVar.F(i13, 7, (-dVar2.f10624c) * dVar.f10625d);
            nVar.F(i13, 8, (-dVar2.f10624c) * dVar.f10626q);
            i11 = i13 + 1;
        }
        return i11;
    }

    protected boolean g(n nVar, n nVar2) {
        if (!this.f25764b.a(nVar.a(), 1, nVar2)) {
            return true;
        }
        nVar2.f21297d = 3;
        nVar2.f21298q = 3;
        return false;
    }

    int h(int i10, int i11, int i12) {
        return (i10 * 2) + (i11 * 2) + (i12 * 9);
    }

    public boolean i(List<b4.b> list, List<b4.a> list2, List<b4.c> list3, n nVar) {
        int h10 = h(list != null ? list.size() : 0, list2 != null ? list2.size() : 0, list3 != null ? list3.size() : 0);
        this.f25769g = false;
        this.f25763a.U(h10, 9);
        this.f25763a.k();
        int c10 = list != null ? c(list, this.f25763a, 0) : 0;
        if (list2 != null) {
            c10 = d(list2, this.f25763a, c10);
        }
        if (list3 != null) {
            b(list3, this.f25763a, c10);
        }
        if (g(this.f25763a, nVar)) {
            return false;
        }
        if (this.f25769g) {
            k(nVar, this.f25765c, this.f25766d);
        }
        if (list == null) {
            return true;
        }
        this.f25767e.a(nVar, list.get(0));
        return true;
    }

    public boolean j(List<b4.b> list, n nVar) {
        return i(list, null, null, nVar);
    }
}
