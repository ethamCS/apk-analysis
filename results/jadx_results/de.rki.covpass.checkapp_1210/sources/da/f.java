package da;
/* loaded from: classes.dex */
public class f {
    public static boolean a(la.a aVar) {
        int f10 = aVar.f();
        int i10 = 0;
        int i11 = 0;
        while (i10 < f10) {
            int i12 = i10 + 1;
            ka.b[] bVarArr = aVar.f15915c.f18622c;
            ka.b bVar = bVarArr[i10];
            ka.b bVar2 = bVarArr[i12 % f10];
            ka.b bVar3 = bVarArr[(i10 + 2) % f10];
            double d10 = bVar.f10622c;
            double d11 = bVar2.f10622c;
            double d12 = bVar.f10623d;
            double d13 = bVar2.f10623d;
            if (((d10 - d11) * (bVar3.f10623d - d13)) - ((d12 - d13) * (bVar3.f10622c - d11)) > 0.0d) {
                i11++;
            }
            i10 = i12;
        }
        return i11 == 0 || i11 == f10;
    }

    public static void b(la.a aVar, double d10) {
        int i10 = 0;
        for (int g10 = aVar.f15915c.g() - 1; g10 >= 0 && aVar.f() > 1; g10--) {
            if (aVar.b(g10).g(aVar.b(i10), d10)) {
                aVar.f15915c.k(g10);
            }
            i10 = g10;
        }
    }

    public static void c(la.a aVar) {
        int f10 = aVar.f() - 1;
        ka.b b10 = aVar.b(f10);
        while (f10 > 0) {
            ka.b[] bVarArr = aVar.f15915c.f18622c;
            bVarArr[f10] = bVarArr[f10 - 1];
            f10--;
        }
        aVar.f15915c.f18622c[0] = b10;
    }
}
