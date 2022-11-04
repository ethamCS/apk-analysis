package h6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
/* loaded from: classes.dex */
public final class k implements o {

    /* renamed from: c */
    private static final o[] f11348c = new o[0];

    /* renamed from: a */
    private Map<e, ?> f11349a;

    /* renamed from: b */
    private o[] f11350b;

    private q c(c cVar) {
        o[] oVarArr = this.f11350b;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                try {
                    return oVar.b(cVar, this.f11349a);
                } catch (p unused) {
                }
            }
        }
        throw m.b();
    }

    @Override // h6.o
    public q a(c cVar) {
        e(null);
        return c(cVar);
    }

    @Override // h6.o
    public q b(c cVar, Map<e, ?> map) {
        e(map);
        return c(cVar);
    }

    public q d(c cVar) {
        if (this.f11350b == null) {
            e(null);
        }
        return c(cVar);
    }

    public void e(Map<e, ?> map) {
        this.f11349a = map;
        boolean z10 = true;
        boolean z11 = map != null && map.containsKey(e.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(a.UPC_A) && !collection.contains(a.UPC_E) && !collection.contains(a.EAN_13) && !collection.contains(a.EAN_8) && !collection.contains(a.CODABAR) && !collection.contains(a.CODE_39) && !collection.contains(a.CODE_93) && !collection.contains(a.CODE_128) && !collection.contains(a.ITF) && !collection.contains(a.RSS_14) && !collection.contains(a.RSS_EXPANDED)) {
                z10 = false;
            }
            if (z10 && !z11) {
                arrayList.add(new x6.p(map));
            }
            if (collection.contains(a.QR_CODE)) {
                arrayList.add(new g7.a());
            }
            if (collection.contains(a.DATA_MATRIX)) {
                arrayList.add(new r6.a());
            }
            if (collection.contains(a.AZTEC)) {
                arrayList.add(new i6.b());
            }
            if (collection.contains(a.PDF_417)) {
                arrayList.add(new b7.b());
            }
            if (collection.contains(a.MAXICODE)) {
                arrayList.add(new v6.a());
            }
            if (z10 && z11) {
                arrayList.add(new x6.p(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z11) {
                arrayList.add(new x6.p(map));
            }
            arrayList.add(new g7.a());
            arrayList.add(new r6.a());
            arrayList.add(new i6.b());
            arrayList.add(new b7.b());
            arrayList.add(new v6.a());
            if (z11) {
                arrayList.add(new x6.p(map));
            }
        }
        this.f11350b = (o[]) arrayList.toArray(f11348c);
    }

    @Override // h6.o
    public void reset() {
        o[] oVarArr = this.f11350b;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                oVar.reset();
            }
        }
    }
}
