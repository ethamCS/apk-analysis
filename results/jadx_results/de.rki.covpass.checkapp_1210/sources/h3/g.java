package h3;

import java.util.List;
import java.util.Objects;
@Deprecated
/* loaded from: classes.dex */
public class g extends e {
    public g(double d10, x3.b bVar, int i10) {
        super(d10, bVar, i10);
    }

    @Override // h3.e
    public boolean a(List<ka.c> list) {
        if (list.size() <= 2) {
            return false;
        }
        this.f11243h.a(0);
        i(0, list.size() - 1);
        this.f11243h.a(list.size() - 1);
        for (int i10 = 0; i10 < this.f11236a && ((g() || j()) && this.f11243h.l() > 2 && this.f11243h.l() < this.f11246k); i10++) {
        }
        return true;
    }

    protected boolean g() {
        int i10 = 0;
        if (this.f11243h.f18610b <= 2) {
            return false;
        }
        this.f11244i.h();
        this.f11244i.a(this.f11243h.f18609a[0]);
        boolean z10 = false;
        while (true) {
            ok.g gVar = this.f11243h;
            int i11 = gVar.f18610b;
            if (i10 >= i11 - 2) {
                this.f11244i.a(gVar.f18609a[i11 - 1]);
                ok.g gVar2 = this.f11244i;
                this.f11244i = this.f11243h;
                this.f11243h = gVar2;
                return z10;
            }
            int[] iArr = gVar.f18609a;
            if (h(iArr[i10], iArr[i10 + 2]) < 0) {
                z10 = true;
            } else {
                this.f11244i.a(this.f11243h.f18609a[i10 + 1]);
            }
            i10++;
        }
    }

    protected int h(int i10, int i11) {
        Objects.requireNonNull(this.f11240e);
        ka.c cVar = this.f11240e.get(i10);
        ka.c cVar2 = this.f11240e.get(i11);
        this.f11241f.f14236c.i(cVar.f14865c, cVar.f14866d);
        this.f11241f.f14237d.i(cVar2.f14865c - cVar.f14865c, cVar2.f14866d - cVar.f14866d);
        double f10 = f(this.f11240e.get(i10), this.f11240e.get(i11));
        int max = Math.max(1, this.f11239d);
        int i12 = (i11 - i10) - max;
        int i13 = -1;
        while (max <= i12) {
            int i14 = i10 + max;
            ka.c cVar3 = this.f11240e.get(i14);
            this.f11242g.i(cVar3.f14865c, cVar3.f14866d);
            double b10 = ea.c.b(this.f11241f, this.f11242g);
            if (b10 >= f10) {
                i13 = i14;
                f10 = b10;
            }
            max++;
        }
        return i13;
    }

    protected void i(int i10, int i11) {
        int h10;
        if (i10 + 1 < i11 && (h10 = h(i10, i11)) >= 0) {
            i(i10, h10);
            this.f11243h.a(h10);
            i(h10, i11);
        }
    }

    protected boolean j() {
        this.f11244i.h();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ok.g gVar = this.f11243h;
            int i11 = gVar.f18610b;
            if (i10 >= i11 - 1) {
                this.f11244i.a(gVar.f18609a[i11 - 1]);
                ok.g gVar2 = this.f11244i;
                this.f11244i = this.f11243h;
                this.f11243h = gVar2;
                return z10;
            }
            int[] iArr = gVar.f18609a;
            int i12 = iArr[i10];
            i10++;
            int h10 = h(i12, iArr[i10]);
            if (h10 >= 0) {
                z10 |= true;
                this.f11244i.a(i12);
                this.f11244i.a(h10);
            } else {
                this.f11244i.a(i12);
            }
        }
    }
}
