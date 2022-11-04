package tk;
/* loaded from: classes3.dex */
public class a {
    public static void a(rk.c cVar, float f10, float f11) {
        int q10 = cVar.q();
        for (int i10 = 0; i10 < q10; i10 += 2) {
            float[] fArr = cVar.f21267c;
            fArr[i10] = f10;
            fArr[i10 + 1] = f11;
        }
    }

    public static void b(rk.d dVar, rk.d dVar2, rk.d dVar3) {
        if (dVar2.f21269q >= pk.a.f19252h) {
            dl.a.a(dVar, dVar2, dVar3);
        } else {
            dl.a.b(dVar, dVar2, dVar3);
        }
    }
}
