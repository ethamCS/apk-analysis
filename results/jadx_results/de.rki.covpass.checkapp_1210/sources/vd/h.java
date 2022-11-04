package vd;

import hc.t;
import java.util.ArrayList;
import java.util.List;
import ud.a;
/* loaded from: classes.dex */
public final class h {
    public static final List<a.e.c> a(List<a.e.c> list) {
        t.e(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (a.e.c cVar : list) {
            int h02 = cVar.h0();
            for (int i10 = 0; i10 < h02; i10++) {
                arrayList.add(cVar);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
