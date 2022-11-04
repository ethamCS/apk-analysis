package o4;

import j4.b;
import p4.c;
/* loaded from: classes.dex */
public class i implements n0<j4.b> {

    /* renamed from: a */
    public static final i f17499a = new i();

    /* renamed from: b */
    private static final c.a f17500b = c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private i() {
    }

    /* renamed from: b */
    public j4.b a(p4.c cVar, float f10) {
        b.a aVar = b.a.CENTER;
        cVar.f();
        b.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        boolean z10 = true;
        while (cVar.j()) {
            switch (cVar.M(f17500b)) {
                case 0:
                    str = cVar.u();
                    break;
                case 1:
                    str2 = cVar.u();
                    break;
                case 2:
                    f11 = (float) cVar.p();
                    break;
                case 3:
                    int r10 = cVar.r();
                    aVar2 = b.a.CENTER;
                    if (r10 <= aVar2.ordinal() && r10 >= 0) {
                        aVar2 = b.a.values()[r10];
                        break;
                    }
                    break;
                case 4:
                    i10 = cVar.r();
                    break;
                case 5:
                    f12 = (float) cVar.p();
                    break;
                case 6:
                    f13 = (float) cVar.p();
                    break;
                case 7:
                    i11 = s.d(cVar);
                    break;
                case 8:
                    i12 = s.d(cVar);
                    break;
                case 9:
                    f14 = (float) cVar.p();
                    break;
                case 10:
                    z10 = cVar.n();
                    break;
                default:
                    cVar.V();
                    cVar.W();
                    break;
            }
        }
        cVar.i();
        return new j4.b(str, str2, f11, aVar2, i10, f12, f13, i11, i12, f14, z10);
    }
}
