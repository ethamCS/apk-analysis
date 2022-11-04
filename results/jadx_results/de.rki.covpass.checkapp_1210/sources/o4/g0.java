package o4;

import p4.c;
/* loaded from: classes.dex */
public class g0 implements n0<r4.d> {

    /* renamed from: a */
    public static final g0 f17495a = new g0();

    private g0() {
    }

    /* renamed from: b */
    public r4.d a(p4.c cVar, float f10) {
        boolean z10 = cVar.B() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.e();
        }
        float p10 = (float) cVar.p();
        float p11 = (float) cVar.p();
        while (cVar.j()) {
            cVar.W();
        }
        if (z10) {
            cVar.h();
        }
        return new r4.d((p10 / 100.0f) * f10, (p11 / 100.0f) * f10);
    }
}
