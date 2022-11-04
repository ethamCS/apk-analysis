package o4;

import java.util.ArrayList;
import p4.c;
/* loaded from: classes.dex */
public class m {

    /* renamed from: a */
    private static final c.a f17519a = c.a.a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b */
    private static final c.a f17520b = c.a.a("shapes");

    public static j4.d a(p4.c cVar, e4.h hVar) {
        ArrayList arrayList = new ArrayList();
        cVar.f();
        String str = null;
        String str2 = null;
        double d10 = 0.0d;
        double d11 = 0.0d;
        char c10 = 0;
        while (cVar.j()) {
            int M = cVar.M(f17519a);
            if (M == 0) {
                c10 = cVar.u().charAt(0);
            } else if (M == 1) {
                d10 = cVar.p();
            } else if (M == 2) {
                d11 = cVar.p();
            } else if (M == 3) {
                str = cVar.u();
            } else if (M == 4) {
                str2 = cVar.u();
            } else if (M != 5) {
                cVar.V();
                cVar.W();
            } else {
                cVar.f();
                while (cVar.j()) {
                    if (cVar.M(f17520b) != 0) {
                        cVar.V();
                        cVar.W();
                    } else {
                        cVar.e();
                        while (cVar.j()) {
                            arrayList.add((l4.p) h.a(cVar, hVar));
                        }
                        cVar.h();
                    }
                }
                cVar.i();
            }
        }
        cVar.i();
        return new j4.d(arrayList, c10, d10, d11, str, str2);
    }
}
