package v2;

import c4.e;
import c4.k;
import c4.l;
import z3.d;
/* loaded from: classes.dex */
public class a {
    public static void a(z3.b bVar, c4.a aVar, c4.a aVar2) {
        int a10 = bVar.a();
        int p10 = aVar.p();
        int g10 = aVar.g();
        for (int i10 = 0; i10 < g10; i10++) {
            for (int i11 = 0; i11 < p10; i11++) {
                int i12 = i11 - a10;
                int c10 = bVar.c() + i12;
                if (i12 < 0) {
                    i12 = 0;
                }
                if (c10 > p10) {
                    c10 = p10;
                }
                float f10 = 0.0f;
                float f11 = 0.0f;
                while (i12 < c10) {
                    float f12 = bVar.f((i12 - i11) + a10);
                    f10 += aVar.d(i12, i10) * f12;
                    f11 += f12;
                    i12++;
                }
                aVar2.d0(i11, i10, f10 / f11);
            }
        }
    }

    public static void b(d dVar, k kVar, c4.d dVar2) {
        int a10 = dVar.a();
        int p10 = kVar.p();
        int g10 = kVar.g();
        for (int i10 = 0; i10 < g10; i10++) {
            for (int i11 = 0; i11 < p10; i11++) {
                int i12 = i11 - a10;
                int c10 = dVar.c() + i12;
                if (i12 < 0) {
                    i12 = 0;
                }
                if (c10 > p10) {
                    c10 = p10;
                }
                int i13 = 0;
                int i14 = 0;
                while (i12 < c10) {
                    int e10 = dVar.e((i12 - i11) + a10);
                    i13 += kVar.c0(i12, i10) * e10;
                    i14 += e10;
                    i12++;
                }
                dVar2.e0(i11, i10, (i13 + (i14 / 2)) / i14);
            }
        }
    }

    public static void c(d dVar, l lVar, e eVar) {
        int a10 = dVar.a();
        int p10 = lVar.p();
        int g10 = lVar.g();
        for (int i10 = 0; i10 < g10; i10++) {
            for (int i11 = 0; i11 < p10; i11++) {
                int i12 = i11 - a10;
                int c10 = dVar.c() + i12;
                if (i12 < 0) {
                    i12 = 0;
                }
                if (c10 > p10) {
                    c10 = p10;
                }
                int i13 = 0;
                int i14 = 0;
                while (i12 < c10) {
                    int e10 = dVar.e((i12 - i11) + a10);
                    i13 += lVar.c0(i12, i10) * e10;
                    i14 += e10;
                    i12++;
                }
                eVar.e0(i11, i10, (i13 + (i14 / 2)) / i14);
            }
        }
    }

    public static void d(z3.b bVar, c4.a aVar, c4.a aVar2) {
        int a10 = bVar.a();
        int p10 = aVar.p();
        int g10 = aVar.g();
        for (int i10 = 0; i10 < g10; i10++) {
            for (int i11 = 0; i11 < p10; i11++) {
                int i12 = i10 - a10;
                int c10 = bVar.c() + i12;
                if (i12 < 0) {
                    i12 = 0;
                }
                if (c10 > g10) {
                    c10 = g10;
                }
                float f10 = 0.0f;
                float f11 = 0.0f;
                while (i12 < c10) {
                    float f12 = bVar.f((i12 - i10) + a10);
                    f10 += aVar.d(i11, i12) * f12;
                    f11 += f12;
                    i12++;
                }
                aVar2.d0(i11, i10, f10 / f11);
            }
        }
    }

    public static void e(d dVar, k kVar, c4.d dVar2) {
        int a10 = dVar.a();
        int p10 = kVar.p();
        int g10 = kVar.g();
        for (int i10 = 0; i10 < g10; i10++) {
            for (int i11 = 0; i11 < p10; i11++) {
                int i12 = i10 - a10;
                int c10 = dVar.c() + i12;
                if (i12 < 0) {
                    i12 = 0;
                }
                if (c10 > g10) {
                    c10 = g10;
                }
                int i13 = 0;
                int i14 = 0;
                while (i12 < c10) {
                    int e10 = dVar.e((i12 - i10) + a10);
                    i13 += kVar.c0(i11, i12) * e10;
                    i14 += e10;
                    i12++;
                }
                dVar2.e0(i11, i10, (i13 + (i14 / 2)) / i14);
            }
        }
    }

    public static void f(d dVar, l lVar, e eVar) {
        int a10 = dVar.a();
        int p10 = lVar.p();
        int g10 = lVar.g();
        for (int i10 = 0; i10 < g10; i10++) {
            for (int i11 = 0; i11 < p10; i11++) {
                int i12 = i10 - a10;
                int c10 = dVar.c() + i12;
                if (i12 < 0) {
                    i12 = 0;
                }
                if (c10 > g10) {
                    c10 = g10;
                }
                int i13 = 0;
                int i14 = 0;
                while (i12 < c10) {
                    int e10 = dVar.e((i12 - i10) + a10);
                    i13 += lVar.c0(i11, i12) * e10;
                    i14 += e10;
                    i12++;
                }
                eVar.e0(i11, i10, (i13 + (i14 / 2)) / i14);
            }
        }
    }
}
