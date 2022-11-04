package g3;

import ja.e;
import java.util.List;
import ok.g;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a */
    private int f10375a;

    /* renamed from: c */
    protected int f10377c;

    /* renamed from: g */
    boolean f10381g;

    /* renamed from: b */
    private final int f10376b = 20;

    /* renamed from: d */
    private final e f10378d = new e();

    /* renamed from: e */
    ja.b f10379e = new ja.b();

    /* renamed from: f */
    ja.b f10380f = new ja.b();

    public c(boolean z10, int i10) {
        this.f10375a = 10;
        this.f10381g = z10;
        this.f10375a = i10;
    }

    private void b(int i10, int i11, List<ka.c> list, ja.b bVar) {
        if (i11 < 0) {
            System.out.println("SHIT");
        }
        ka.c cVar = list.get(i10);
        ka.c cVar2 = list.get(i11);
        this.f10378d.f14240c.i(cVar.f14865c, cVar.f14866d);
        this.f10378d.f14241d.i(cVar2.f14865c, cVar2.f14866d);
        da.c.b(this.f10378d, bVar);
        bVar.b();
    }

    protected static double c(ja.b bVar, ka.c cVar) {
        return Math.abs((bVar.f14233c * cVar.f14865c) + (bVar.f14234d * cVar.f14866d) + bVar.f14235q);
    }

    protected double a(List<ka.c> list, int i10, int i11, int i12, int i13) {
        int a10 = v3.b.a(i11, i13, list.size());
        b(i10, a10, list, this.f10379e);
        b(a10, i12, list, this.f10380f);
        return d(this.f10379e, i10, a10, list) + d(this.f10380f, a10, i12, list);
    }

    protected double d(ja.b bVar, int i10, int i11, List<ka.c> list) {
        int i12 = 0;
        double d10 = 0.0d;
        if (i10 < i11) {
            int i13 = (i11 - i10) + 1;
            int min = Math.min(20, i13);
            while (i12 < min) {
                d10 += c(bVar, list.get((((i13 - 1) * i12) / (min - 1)) + i10));
                i12++;
            }
        } else {
            int size = list.size() - i10;
            int i14 = i11 + 1;
            int i15 = i11 + size + 1;
            int min2 = Math.min(20, i15);
            int i16 = (min2 * size) / i15;
            int i17 = (min2 * i14) / i15;
            for (int i18 = 0; i18 < i16; i18++) {
                d10 += c(bVar, list.get(((i18 * size) / (min2 - 1)) + i10));
            }
            while (i12 < i17) {
                d10 += c(bVar, list.get((i12 * i14) / (min2 - 1)));
                i12++;
            }
        }
        return d10;
    }

    public boolean e(List<ka.c> list, g gVar) {
        int i10;
        int i11;
        if (gVar.l() < 3) {
            return false;
        }
        this.f10377c = Math.min(6, Math.max(list.size() / 12, 3));
        if (this.f10381g) {
            i11 = gVar.f18610b;
            i10 = 0;
        } else {
            i11 = gVar.f18610b - 1;
            i10 = 1;
        }
        boolean z10 = true;
        for (int i12 = 0; i12 < this.f10375a && z10; i12++) {
            z10 = false;
            for (int i13 = i10; i13 < i11; i13++) {
                int f10 = f(list, gVar.d(v3.b.c(i13, 1, gVar.l())), gVar.d(i13), gVar.d(v3.b.d(i13, 1, gVar.l())));
                if (f10 != gVar.d(i13)) {
                    gVar.j(i13, f10);
                    z10 = true;
                }
            }
        }
        return true;
    }

    protected int f(List<ka.c> list, int i10, int i11, int i12) {
        double a10 = a(list, i10, i11, i12, 0);
        int i13 = 0;
        for (int i14 = -this.f10377c; i14 <= this.f10377c; i14++) {
            if (i14 != 0) {
                double a11 = a(list, i10, i11, i12, i14);
                if (a11 < a10) {
                    a10 = a11;
                    i13 = i14;
                }
            } else if (i13 != 0) {
                break;
            }
        }
        return v3.b.a(i11, i13, list.size());
    }
}
