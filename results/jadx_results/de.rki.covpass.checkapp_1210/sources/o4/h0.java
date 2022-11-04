package o4;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p4.c;
/* loaded from: classes.dex */
public class h0 implements n0<l4.n> {

    /* renamed from: a */
    public static final h0 f17497a = new h0();

    /* renamed from: b */
    private static final c.a f17498b = c.a.a("c", "v", "i", "o");

    private h0() {
    }

    /* renamed from: b */
    public l4.n a(p4.c cVar, float f10) {
        if (cVar.B() == c.b.BEGIN_ARRAY) {
            cVar.e();
        }
        cVar.f();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z10 = false;
        while (cVar.j()) {
            int M = cVar.M(f17498b);
            if (M == 0) {
                z10 = cVar.n();
            } else if (M == 1) {
                list = s.f(cVar, f10);
            } else if (M == 2) {
                list2 = s.f(cVar, f10);
            } else if (M != 3) {
                cVar.V();
                cVar.W();
            } else {
                list3 = s.f(cVar, f10);
            }
        }
        cVar.i();
        if (cVar.B() == c.b.END_ARRAY) {
            cVar.h();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new l4.n(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = list.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new j4.a(q4.g.a(list.get(i11), list3.get(i11)), q4.g.a(pointF2, list2.get(i10)), pointF2));
        }
        if (z10) {
            PointF pointF3 = list.get(0);
            int i12 = size - 1;
            arrayList.add(new j4.a(q4.g.a(list.get(i12), list3.get(i12)), q4.g.a(pointF3, list2.get(0)), pointF3));
        }
        return new l4.n(pointF, z10, arrayList);
    }
}
