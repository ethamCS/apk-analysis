package dd;

import dd.f;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class j extends f implements nd.e {

    /* renamed from: c */
    private final Object[] f8499c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(wd.f fVar, Object[] objArr) {
        super(fVar, null);
        hc.t.e(objArr, "values");
        this.f8499c = objArr;
    }

    @Override // nd.e
    public List<f> c() {
        Object[] objArr = this.f8499c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            f.a aVar = f.f8496b;
            hc.t.b(obj);
            arrayList.add(aVar.a(obj, null));
        }
        return arrayList;
    }
}
