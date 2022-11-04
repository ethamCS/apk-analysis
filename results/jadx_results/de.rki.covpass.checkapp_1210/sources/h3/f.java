package h3;

import java.util.List;
import java.util.Objects;
@Deprecated
/* loaded from: classes.dex */
public class f extends e {

    /* renamed from: l */
    protected int f11247l;

    public f(double d10, x3.b bVar, int i10) {
        super(d10, bVar, i10);
    }

    private boolean g(boolean z10, int i10, int i11) {
        int[] iArr = this.f11243h.f18609a;
        int i12 = iArr[i10];
        int k10 = k(i12, h(i12, iArr[i11]));
        if (k10 < 0) {
            this.f11244i.a(i12);
            return z10;
        }
        this.f11244i.a(i12);
        this.f11244i.a((i12 + k10) % this.f11247l);
        return true;
    }

    @Override // h3.e
    public boolean a(List<ka.c> list) {
        int size = list.size();
        this.f11247l = size;
        if (size <= 1) {
            return false;
        }
        int j10 = j(list);
        int i10 = this.f11247l;
        int i11 = ((i10 / 2) + j10) % i10;
        this.f11243h.a(j10);
        l(j10, this.f11247l / 2);
        this.f11243h.a(i11);
        int i12 = this.f11247l;
        l(i11, i12 - (i12 / 2));
        if (this.f11243h.f18610b <= 2) {
            return false;
        }
        for (int i13 = 0; i13 < this.f11236a; i13++) {
            boolean i14 = i();
            if (this.f11243h.l() <= 0) {
                return false;
            }
            if (!i14 && !m()) {
                break;
            } else if (this.f11243h.l() <= 2 || this.f11243h.l() >= this.f11246k) {
                return false;
            }
        }
        return true;
    }

    protected int h(int i10, int i11) {
        return i11 >= i10 ? i11 - i10 : (this.f11247l - i10) + i11;
    }

    protected boolean i() {
        int i10 = 0;
        if (this.f11243h.l() <= 3) {
            return false;
        }
        this.f11244i.h();
        boolean z10 = false;
        while (true) {
            ok.g gVar = this.f11243h;
            int i11 = gVar.f18610b;
            if (i10 >= i11) {
                ok.g gVar2 = this.f11244i;
                this.f11244i = gVar;
                this.f11243h = gVar2;
                return z10;
            }
            int[] iArr = gVar.f18609a;
            int i12 = iArr[i10];
            if (k(i12, h(i12, iArr[(i10 + 2) % i11])) < 0) {
                z10 = true;
            } else {
                ok.g gVar3 = this.f11244i;
                ok.g gVar4 = this.f11243h;
                gVar3.a(gVar4.f18609a[(i10 + 1) % gVar4.f18610b]);
            }
            i10++;
        }
    }

    protected int j(List<ka.c> list) {
        int size = list.size();
        int i10 = size / 2;
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            ka.c cVar = list.get(i13);
            ka.c cVar2 = list.get((i13 + i10) % size);
            int a10 = da.e.a(cVar.f14865c, cVar.f14866d, cVar2.f14865c, cVar2.f14866d);
            if (i12 < a10) {
                i11 = i13;
                i12 = a10;
            }
        }
        return i11;
    }

    protected int k(int i10, int i11) {
        Objects.requireNonNull(this.f11240e);
        int i12 = (i10 + i11) % this.f11247l;
        ka.c cVar = this.f11240e.get(i10);
        ka.c cVar2 = this.f11240e.get(i12);
        this.f11241f.f14236c.i(cVar.f14865c, cVar.f14866d);
        this.f11241f.f14237d.i(cVar2.f14865c - cVar.f14865c, cVar2.f14866d - cVar.f14866d);
        double f10 = f(this.f11240e.get(i10), this.f11240e.get(i12));
        int max = Math.max(1, this.f11239d);
        int i13 = i11 - max;
        int i14 = -1;
        while (max <= i13) {
            ka.c cVar3 = this.f11240e.get((i10 + max) % this.f11247l);
            this.f11242g.i(cVar3.f14865c, cVar3.f14866d);
            double b10 = ea.c.b(this.f11241f, this.f11242g);
            if (b10 >= f10) {
                i14 = max;
                f10 = b10;
            }
            max++;
        }
        return i14;
    }

    protected void l(int i10, int i11) {
        if (i11 < this.f11239d) {
            return;
        }
        int i12 = (i10 + i11) % this.f11247l;
        int k10 = k(i10, i11);
        if (k10 < 0) {
            return;
        }
        l(i10, k10);
        int i13 = (i10 + k10) % this.f11247l;
        this.f11243h.a(i13);
        l(i13, h(i13, i12));
    }

    protected boolean m() {
        this.f11244i.h();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            int i11 = this.f11243h.f18610b;
            if (i10 >= i11 - 1) {
                boolean g10 = g(z10, i11 - 1, 0) | z10;
                ok.g gVar = this.f11244i;
                this.f11244i = this.f11243h;
                this.f11243h = gVar;
                return g10;
            }
            int i12 = i10 + 1;
            z10 |= g(z10, i10, i12);
            i10 = i12;
        }
    }
}
