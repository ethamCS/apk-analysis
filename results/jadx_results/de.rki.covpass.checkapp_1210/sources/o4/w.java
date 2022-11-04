package o4;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m4.e;
import p4.c;
/* loaded from: classes.dex */
public class w {

    /* renamed from: a */
    private static final c.a f17541a = c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b */
    static c.a f17542b = c.a.a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c */
    private static final c.a f17543c = c.a.a("list");

    /* renamed from: d */
    private static final c.a f17544d = c.a.a("cm", "tm", "dr");

    public static e4.h a(p4.c cVar) {
        ArrayList arrayList;
        HashMap hashMap;
        p4.c cVar2 = cVar;
        float e10 = q4.h.e();
        i0.d<m4.e> dVar = new i0.d<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        i0.h<j4.d> hVar = new i0.h<>();
        e4.h hVar2 = new e4.h();
        cVar.f();
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        while (cVar.j()) {
            switch (cVar2.M(f17541a)) {
                case 0:
                    i10 = cVar.r();
                    continue;
                    cVar2 = cVar;
                case 1:
                    i11 = cVar.r();
                    continue;
                    cVar2 = cVar;
                case 2:
                    f10 = (float) cVar.p();
                    continue;
                    cVar2 = cVar;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f11 = ((float) cVar.p()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f12 = (float) cVar.p();
                    break;
                case 5:
                    String[] split = cVar.u().split("\\.");
                    if (!q4.h.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        hVar2.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 6:
                    e(cVar2, hVar2, arrayList2, dVar);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 7:
                    b(cVar2, hVar2, hashMap2, hashMap3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 8:
                    d(cVar2, hashMap4);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 9:
                    c(cVar2, hVar2, hVar);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 10:
                    f(cVar2, arrayList3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    cVar.V();
                    cVar.W();
                    break;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            cVar2 = cVar;
        }
        hVar2.s(new Rect(0, 0, (int) (i10 * e10), (int) (i11 * e10)), f10, f11, f12, arrayList2, dVar, hashMap2, hashMap3, hVar, hashMap4, arrayList3);
        return hVar2;
    }

    private static void b(p4.c cVar, e4.h hVar, Map<String, List<m4.e>> map, Map<String, e4.q> map2) {
        cVar.e();
        while (cVar.j()) {
            ArrayList arrayList = new ArrayList();
            i0.d dVar = new i0.d();
            cVar.f();
            int i10 = 0;
            int i11 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (cVar.j()) {
                int M = cVar.M(f17542b);
                if (M == 0) {
                    str = cVar.u();
                } else if (M == 1) {
                    cVar.e();
                    while (cVar.j()) {
                        m4.e b10 = v.b(cVar, hVar);
                        dVar.l(b10.d(), b10);
                        arrayList.add(b10);
                    }
                    cVar.h();
                } else if (M == 2) {
                    i10 = cVar.r();
                } else if (M == 3) {
                    i11 = cVar.r();
                } else if (M == 4) {
                    str2 = cVar.u();
                } else if (M != 5) {
                    cVar.V();
                    cVar.W();
                } else {
                    str3 = cVar.u();
                }
            }
            cVar.i();
            if (str2 != null) {
                e4.q qVar = new e4.q(i10, i11, str, str2, str3);
                map2.put(qVar.d(), qVar);
            } else {
                map.put(str, arrayList);
            }
        }
        cVar.h();
    }

    private static void c(p4.c cVar, e4.h hVar, i0.h<j4.d> hVar2) {
        cVar.e();
        while (cVar.j()) {
            j4.d a10 = m.a(cVar, hVar);
            hVar2.j(a10.hashCode(), a10);
        }
        cVar.h();
    }

    private static void d(p4.c cVar, Map<String, j4.c> map) {
        cVar.f();
        while (cVar.j()) {
            if (cVar.M(f17543c) != 0) {
                cVar.V();
                cVar.W();
            } else {
                cVar.e();
                while (cVar.j()) {
                    j4.c a10 = n.a(cVar);
                    map.put(a10.b(), a10);
                }
                cVar.h();
            }
        }
        cVar.i();
    }

    private static void e(p4.c cVar, e4.h hVar, List<m4.e> list, i0.d<m4.e> dVar) {
        cVar.e();
        int i10 = 0;
        while (cVar.j()) {
            m4.e b10 = v.b(cVar, hVar);
            if (b10.f() == e.a.IMAGE) {
                i10++;
            }
            list.add(b10);
            dVar.l(b10.d(), b10);
            if (i10 > 4) {
                q4.d.c("You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.h();
    }

    private static void f(p4.c cVar, List<j4.h> list) {
        cVar.e();
        while (cVar.j()) {
            String str = null;
            cVar.f();
            float f10 = 0.0f;
            float f11 = 0.0f;
            while (cVar.j()) {
                int M = cVar.M(f17544d);
                if (M == 0) {
                    str = cVar.u();
                } else if (M == 1) {
                    f10 = (float) cVar.p();
                } else if (M != 2) {
                    cVar.V();
                    cVar.W();
                } else {
                    f11 = (float) cVar.p();
                }
            }
            cVar.i();
            list.add(new j4.h(str, f10, f11));
        }
        cVar.h();
    }
}
