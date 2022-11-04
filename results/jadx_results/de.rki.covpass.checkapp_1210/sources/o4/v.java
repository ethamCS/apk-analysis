package o4;

import android.graphics.Color;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import m4.e;
import p4.c;
/* loaded from: classes.dex */
public class v {

    /* renamed from: a */
    private static final c.a f17537a = c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b */
    private static final c.a f17538b = c.a.a("d", "a");

    /* renamed from: c */
    private static final c.a f17539c = c.a.a("ty", "nm");

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17540a;

        static {
            int[] iArr = new int[e.b.values().length];
            f17540a = iArr;
            try {
                iArr[e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17540a[e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static m4.e a(e4.h hVar) {
        Rect b10 = hVar.b();
        return new m4.e(Collections.emptyList(), hVar, "__container", -1L, e.a.PRE_COMP, -1L, null, Collections.emptyList(), new k4.l(), 0, 0, 0, 0.0f, 0.0f, b10.width(), b10.height(), null, null, Collections.emptyList(), e.b.NONE, null, false, null, null);
    }

    public static m4.e b(p4.c cVar, e4.h hVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        float f10;
        StringBuilder sb2;
        String str;
        e.b bVar = e.b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        cVar.f();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        e.b bVar2 = bVar;
        float f11 = 1.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        boolean z10 = false;
        e.a aVar = null;
        String str2 = null;
        k4.l lVar = null;
        k4.j jVar = null;
        k4.k kVar = null;
        k4.b bVar3 = null;
        l4.a aVar2 = null;
        j jVar2 = null;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        long j10 = -1;
        long j11 = 0;
        String str3 = null;
        String str4 = "UNSET";
        while (cVar.j()) {
            switch (cVar.M(f17537a)) {
                case 0:
                    str4 = cVar.u();
                    break;
                case 1:
                    j11 = cVar.r();
                    break;
                case 2:
                    str2 = cVar.u();
                    break;
                case 3:
                    int r10 = cVar.r();
                    aVar = e.a.UNKNOWN;
                    if (r10 >= aVar.ordinal()) {
                        break;
                    } else {
                        aVar = e.a.values()[r10];
                        break;
                    }
                case 4:
                    j10 = cVar.r();
                    break;
                case 5:
                    i10 = (int) (cVar.r() * q4.h.e());
                    break;
                case 6:
                    i11 = (int) (cVar.r() * q4.h.e());
                    break;
                case 7:
                    i12 = Color.parseColor(cVar.u());
                    break;
                case 8:
                    lVar = c.g(cVar, hVar);
                    break;
                case 9:
                    int r11 = cVar.r();
                    if (r11 >= e.b.values().length) {
                        sb2 = new StringBuilder();
                        sb2.append("Unsupported matte type: ");
                        sb2.append(r11);
                        hVar.a(sb2.toString());
                        break;
                    } else {
                        bVar2 = e.b.values()[r11];
                        int i15 = a.f17540a[bVar2.ordinal()];
                        if (i15 != 1) {
                            if (i15 == 2) {
                                str = "Unsupported matte type: Luma Inverted";
                            }
                            hVar.r(1);
                            break;
                        } else {
                            str = "Unsupported matte type: Luma";
                        }
                        hVar.a(str);
                        hVar.r(1);
                    }
                case 10:
                    cVar.e();
                    while (cVar.j()) {
                        arrayList3.add(x.a(cVar, hVar));
                    }
                    hVar.r(arrayList3.size());
                    cVar.h();
                    break;
                case 11:
                    cVar.e();
                    while (cVar.j()) {
                        l4.c a10 = h.a(cVar, hVar);
                        if (a10 != null) {
                            arrayList4.add(a10);
                        }
                    }
                    cVar.h();
                    break;
                case 12:
                    cVar.f();
                    while (cVar.j()) {
                        int M = cVar.M(f17538b);
                        if (M == 0) {
                            jVar = d.d(cVar, hVar);
                        } else if (M != 1) {
                            cVar.V();
                            cVar.W();
                        } else {
                            cVar.e();
                            if (cVar.j()) {
                                kVar = b.a(cVar, hVar);
                            }
                            while (cVar.j()) {
                                cVar.W();
                            }
                            cVar.h();
                        }
                    }
                    cVar.i();
                    break;
                case 13:
                    cVar.e();
                    ArrayList arrayList5 = new ArrayList();
                    while (cVar.j()) {
                        cVar.f();
                        while (cVar.j()) {
                            int M2 = cVar.M(f17539c);
                            if (M2 == 0) {
                                int r12 = cVar.r();
                                if (r12 == 29) {
                                    aVar2 = e.b(cVar, hVar);
                                } else if (r12 == 25) {
                                    jVar2 = new k().b(cVar, hVar);
                                }
                            } else if (M2 != 1) {
                                cVar.V();
                                cVar.W();
                            } else {
                                arrayList5.add(cVar.u());
                            }
                        }
                        cVar.i();
                    }
                    cVar.h();
                    sb2 = new StringBuilder();
                    sb2.append("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ");
                    sb2.append(arrayList5);
                    hVar.a(sb2.toString());
                    break;
                case 14:
                    f11 = (float) cVar.p();
                    break;
                case 15:
                    f13 = (float) cVar.p();
                    break;
                case 16:
                    i13 = (int) (cVar.r() * q4.h.e());
                    break;
                case 17:
                    i14 = (int) (cVar.r() * q4.h.e());
                    break;
                case 18:
                    f12 = (float) cVar.p();
                    break;
                case 19:
                    f14 = (float) cVar.p();
                    break;
                case 20:
                    bVar3 = d.f(cVar, hVar, false);
                    break;
                case 21:
                    str3 = cVar.u();
                    break;
                case 22:
                    z10 = cVar.n();
                    break;
                default:
                    cVar.V();
                    cVar.W();
                    break;
            }
        }
        cVar.i();
        ArrayList arrayList6 = new ArrayList();
        if (f12 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new r4.a(hVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f12)));
            f10 = 0.0f;
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            f10 = 0.0f;
        }
        if (f14 <= f10) {
            f14 = hVar.f();
        }
        arrayList2.add(new r4.a(hVar, valueOf, valueOf, null, f12, Float.valueOf(f14)));
        arrayList2.add(new r4.a(hVar, valueOf2, valueOf2, null, f14, Float.valueOf(Float.MAX_VALUE)));
        if (str4.endsWith(".ai") || "ai".equals(str3)) {
            hVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new m4.e(arrayList4, hVar, str4, j11, aVar, j10, str2, arrayList, lVar, i10, i11, i12, f11, f13, i13, i14, jVar, kVar, arrayList2, bVar2, bVar3, z10, aVar2, jVar2);
    }
}
