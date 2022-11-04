package o4;

import java.util.ArrayList;
import java.util.Collections;
import l4.r;
import p4.c;
/* loaded from: classes.dex */
public class l0 {

    /* renamed from: a */
    private static final c.a f17517a = c.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final c.a f17518b = c.a.a("n", "v");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static l4.r a(p4.c cVar, e4.h hVar) {
        char c10;
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        float f10 = 0.0f;
        String str = null;
        k4.b bVar = null;
        k4.a aVar = null;
        k4.b bVar2 = null;
        r.b bVar3 = null;
        r.c cVar2 = null;
        k4.d dVar = null;
        while (cVar.j()) {
            switch (cVar.M(f17517a)) {
                case 0:
                    str = cVar.u();
                    break;
                case 1:
                    aVar = d.c(cVar, hVar);
                    break;
                case 2:
                    bVar2 = d.e(cVar, hVar);
                    break;
                case 3:
                    dVar = d.h(cVar, hVar);
                    break;
                case 4:
                    bVar3 = r.b.values()[cVar.r() - 1];
                    break;
                case 5:
                    cVar2 = r.c.values()[cVar.r() - 1];
                    break;
                case 6:
                    f10 = (float) cVar.p();
                    break;
                case 7:
                    z10 = cVar.n();
                    break;
                case 8:
                    cVar.e();
                    while (cVar.j()) {
                        cVar.f();
                        String str2 = null;
                        k4.b bVar4 = null;
                        while (cVar.j()) {
                            int M = cVar.M(f17518b);
                            if (M == 0) {
                                str2 = cVar.u();
                            } else if (M != 1) {
                                cVar.V();
                                cVar.W();
                            } else {
                                bVar4 = d.e(cVar, hVar);
                            }
                        }
                        cVar.i();
                        str2.hashCode();
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals("d")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 103:
                                if (str2.equals("g")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 111:
                                if (str2.equals("o")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                            case 1:
                                hVar.u(true);
                                arrayList.add(bVar4);
                                break;
                            case 2:
                                bVar = bVar4;
                                break;
                        }
                    }
                    cVar.h();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((k4.b) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    cVar.W();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new k4.d(Collections.singletonList(new r4.a(100)));
        }
        return new l4.r(str, bVar, arrayList, aVar, dVar, bVar2, bVar3, cVar2, f10, z10);
    }
}
