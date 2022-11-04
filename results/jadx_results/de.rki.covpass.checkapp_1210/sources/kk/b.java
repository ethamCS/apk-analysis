package kk;

import jk.e;
import jk.g;
import jk.i;
import jk.k;
/* loaded from: classes3.dex */
public class b<P> implements k<P> {

    /* renamed from: a */
    private e f15293a;

    /* renamed from: b */
    private P f15294b;

    /* renamed from: c */
    private double f15295c = Double.MAX_VALUE;

    /* renamed from: d */
    private double f15296d;

    /* renamed from: e */
    private int f15297e;

    /* renamed from: f */
    private int f15298f;

    /* renamed from: g */
    g<P> f15299g;

    public b(g<P> gVar) {
        this.f15299g = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(e.a aVar, ok.b<i> bVar) {
        double a10 = this.f15299g.a(aVar.f14462a, this.f15294b);
        if (a10 <= this.f15296d) {
            int i10 = 0;
            if (bVar.g() < this.f15298f) {
                i i11 = bVar.i();
                i11.f14473b = a10;
                i11.f14472a = aVar;
                if (bVar.g() != this.f15298f) {
                    return;
                }
                this.f15296d = -1.0d;
                while (i10 < this.f15298f) {
                    double d10 = bVar.c(i10).f14473b;
                    if (d10 > this.f15296d) {
                        this.f15296d = d10;
                        this.f15297e = i10;
                    }
                    i10++;
                }
                return;
            }
            for (int i12 = 0; i12 < this.f15298f; i12++) {
                if (bVar.c(i12).f14473b > this.f15296d) {
                    throw new RuntimeException("Most distant isn't the most distant");
                }
            }
            i c10 = bVar.c(this.f15297e);
            c10.f14472a = aVar;
            c10.f14473b = a10;
            this.f15296d = -1.0d;
            while (i10 < this.f15298f) {
                double d11 = bVar.c(i10).f14473b;
                if (d11 > this.f15296d) {
                    this.f15296d = d11;
                    this.f15297e = i10;
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void f(e.a aVar, ok.b<i> bVar) {
        e.a aVar2;
        e.a aVar3;
        if (aVar == null) {
            return;
        }
        e(aVar, bVar);
        if (aVar.a()) {
            return;
        }
        double b10 = this.f15299g.b(aVar.f14462a, aVar.f14464c);
        double b11 = this.f15299g.b(this.f15294b, aVar.f14464c);
        if (b11 <= b10) {
            aVar3 = aVar.f14465d;
            aVar2 = aVar.f14466e;
        } else {
            aVar3 = aVar.f14466e;
            aVar2 = aVar.f14465d;
        }
        f(aVar3, bVar);
        double d10 = b10 - b11;
        double d11 = d10 * d10;
        if (d11 > this.f15296d) {
            return;
        }
        if (bVar.g() >= this.f15298f && d11 >= this.f15296d) {
            return;
        }
        f(aVar2, bVar);
    }

    @Override // jk.k
    public k<P> a() {
        return new b(this.f15299g);
    }

    @Override // jk.k
    public void b(Object obj) {
        this.f15293a = (e) obj;
    }

    @Override // jk.k
    public void c(double d10) {
        this.f15295c = d10;
    }

    @Override // jk.k
    public void d(P p10, int i10, ok.b<i> bVar) {
        if (i10 > 0) {
            e.a aVar = this.f15293a.f14461b;
            if (aVar == null) {
                return;
            }
            this.f15298f = i10;
            this.f15294b = p10;
            this.f15296d = this.f15295c;
            f(aVar, bVar);
            return;
        }
        throw new IllegalArgumentException("I'm sorry, but I refuse to search for less than or equal to 0 neighbors.");
    }
}
