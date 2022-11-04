package x6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
/* loaded from: classes.dex */
public final class p extends r {

    /* renamed from: b */
    private static final r[] f25431b = new r[0];

    /* renamed from: a */
    private final r[] f25432a;

    public p(Map<h6.e, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(h6.e.POSSIBLE_FORMATS);
        boolean z10 = (map == null || map.get(h6.e.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(h6.a.EAN_13) || collection.contains(h6.a.UPC_A) || collection.contains(h6.a.EAN_8) || collection.contains(h6.a.UPC_E)) {
                arrayList.add(new q(map));
            }
            if (collection.contains(h6.a.CODE_39)) {
                arrayList.add(new e(z10));
            }
            if (collection.contains(h6.a.CODE_93)) {
                arrayList.add(new g());
            }
            if (collection.contains(h6.a.CODE_128)) {
                arrayList.add(new c());
            }
            if (collection.contains(h6.a.ITF)) {
                arrayList.add(new n());
            }
            if (collection.contains(h6.a.CODABAR)) {
                arrayList.add(new a());
            }
            if (collection.contains(h6.a.RSS_14)) {
                arrayList.add(new y6.e());
            }
            if (collection.contains(h6.a.RSS_EXPANDED)) {
                arrayList.add(new z6.d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new q(map));
            arrayList.add(new e());
            arrayList.add(new a());
            arrayList.add(new g());
            arrayList.add(new c());
            arrayList.add(new n());
            arrayList.add(new y6.e());
            arrayList.add(new z6.d());
        }
        this.f25432a = (r[]) arrayList.toArray(f25431b);
    }

    @Override // x6.r
    public h6.q c(int i10, o6.a aVar, Map<h6.e, ?> map) {
        for (r rVar : this.f25432a) {
            try {
                return rVar.c(i10, aVar, map);
            } catch (h6.p unused) {
            }
        }
        throw h6.m.b();
    }

    @Override // x6.r, h6.o
    public void reset() {
        for (r rVar : this.f25432a) {
            rVar.reset();
        }
    }
}
