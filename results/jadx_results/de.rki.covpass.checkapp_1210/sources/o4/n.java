package o4;

import p4.c;
/* loaded from: classes.dex */
class n {

    /* renamed from: a */
    private static final c.a f17522a = c.a.a("fFamily", "fName", "fStyle", "ascent");

    public static j4.c a(p4.c cVar) {
        cVar.f();
        String str = null;
        String str2 = null;
        float f10 = 0.0f;
        String str3 = null;
        while (cVar.j()) {
            int M = cVar.M(f17522a);
            if (M == 0) {
                str = cVar.u();
            } else if (M == 1) {
                str3 = cVar.u();
            } else if (M == 2) {
                str2 = cVar.u();
            } else if (M != 3) {
                cVar.V();
                cVar.W();
            } else {
                f10 = (float) cVar.p();
            }
        }
        cVar.i();
        return new j4.c(str, str3, str2, f10);
    }
}
