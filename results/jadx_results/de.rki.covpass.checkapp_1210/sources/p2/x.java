package p2;

import c4.q;
import f3.g;
import java.io.PrintStream;
import java.util.List;
/* loaded from: classes.dex */
public class x<T extends c4.q<T>> {

    /* renamed from: a */
    a3.d<T> f18859a;

    /* renamed from: c */
    f3.d<T> f18861c;

    /* renamed from: b */
    double f18860b = 1.3333333333333333d;

    /* renamed from: d */
    ok.b<e> f18862d = new ok.b<>(w.f18858a, v.f18857c);

    /* renamed from: e */
    protected v3.c f18863e = new v3.c(0.8d);

    /* renamed from: f */
    PrintStream f18864f = null;

    /* renamed from: g */
    ja.e f18865g = new ja.e();

    /* renamed from: h */
    ja.c f18866h = new ja.c();

    /* renamed from: i */
    float[] f18867i = new float[46];

    /* renamed from: j */
    int[] f18868j = new int[12];

    /* renamed from: k */
    int[] f18869k = new int[12];

    public x(f3.d<T> dVar) {
        this.f18861c = dVar;
        dVar.a().o(true);
        dVar.a().q(false);
        dVar.a().p(4, 4);
        this.f18859a = t3.a.a(dVar.b(), y3.b.EXTENDED);
    }

    private boolean a(la.a aVar, float f10, int i10) {
        int length;
        float[] fArr;
        int i11;
        int i12;
        da.d.b(aVar.b(i10), aVar.b((i10 + 1) % 4), this.f18865g.f14240c);
        da.d.b(aVar.b((i10 + 2) % 4), aVar.b((i10 + 3) % 4), this.f18865g.f14241d);
        da.c.d(this.f18865g, this.f18866h);
        float[] fArr2 = this.f18867i;
        double length2 = (fArr2.length - ((fArr2.length / 9) * 2)) - 1;
        int i13 = 0;
        while (true) {
            fArr = this.f18867i;
            if (i13 >= fArr.length) {
                break;
            }
            double d10 = (i13 - length) / length2;
            ja.c cVar = this.f18866h;
            ka.b bVar = cVar.f14236c;
            double d11 = bVar.f10622c;
            ka.e eVar = cVar.f14237d;
            fArr[i13] = this.f18859a.b((float) (d11 + (eVar.f10622c * d10)), (float) (bVar.f10623d + (d10 * eVar.f10623d)));
            i13++;
        }
        int i14 = fArr[0] < f10 ? 1 : 0;
        this.f18869k[0] = i14 ^ 1;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            float[] fArr3 = this.f18867i;
            if (i15 >= fArr3.length) {
                i11 = 1;
                break;
            }
            int i17 = fArr3[i15] < f10 ? 1 : 0;
            if (i14 != i17) {
                i11 = 1;
                int[] iArr = this.f18869k;
                if (i16 >= iArr.length - 1) {
                    break;
                }
                i16++;
                iArr[i16] = i17 ^ 1;
                this.f18868j[i16] = 1;
                i14 = i17;
            } else {
                int[] iArr2 = this.f18868j;
                iArr2[i16] = iArr2[i16] + 1;
            }
            i15++;
        }
        int i18 = i16 + i11;
        if (i18 >= 5 && i18 <= 9) {
            for (int i19 = 0; i19 + 5 <= i18; i19++) {
                if (this.f18869k[i19] == 0) {
                    int[] iArr3 = this.f18868j;
                    int i20 = iArr3[i19];
                    int i21 = iArr3[i19 + 2];
                    int i22 = iArr3[i19 + 4];
                    int i23 = iArr3[i19 + 1];
                    int i24 = iArr3[i19 + 3];
                    if (i20 >= i23 * 0.4d && i20 <= i23 * 3 && i22 >= i24 * 0.4d && i22 <= i24 * 3 && i21 >= (i12 = i20 + i22) && i21 <= i12 * 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void c(T t10) {
        int min = (int) (Math.min(t10.f6220q, t10.f6221x) * this.f18860b);
        h2.a f10 = this.f18861c.a().f();
        f10.e(min);
        f10.j(false);
    }

    private void h() {
        this.f18862d.r();
        List<g.a> e10 = this.f18861c.e();
        for (int i10 = 0; i10 < e10.size(); i10++) {
            g.a aVar = e10.get(i10);
            double d10 = (aVar.f9777b + aVar.f9778c) / 2.0d;
            if (b(aVar.f9781f, (float) d10)) {
                this.f18861c.g(aVar);
                e i11 = this.f18862d.i();
                i11.f17352a = aVar.f9781f;
                i11.f18744i = d10;
                o2.d.e(i11);
            }
        }
    }

    boolean b(la.a aVar, float f10) {
        return a(aVar, f10, 0) || a(aVar, f10, 1);
    }

    public ok.b<e> d() {
        return this.f18862d;
    }

    public v3.c e() {
        return this.f18863e;
    }

    public f3.d<T> f() {
        return this.f18861c;
    }

    public void g(T t10, c4.l lVar) {
        c(t10);
        this.f18859a.c(t10);
        this.f18861c.f(t10, lVar);
        long nanoTime = System.nanoTime();
        h();
        long nanoTime2 = System.nanoTime();
        PrintStream printStream = this.f18864f;
        if (printStream != null) {
            printStream.printf("squares=%d position_pattern=%d\n", Integer.valueOf(this.f18861c.e().size()), Integer.valueOf(this.f18862d.f18623d));
        }
        this.f18863e.d((nanoTime2 - nanoTime) * 1.0E-6d);
    }
}
