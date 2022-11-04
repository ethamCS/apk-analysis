package fe;

import hc.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ub.z;
import xc.z0;
/* loaded from: classes3.dex */
public final class a implements f {

    /* renamed from: a */
    private final List<f> f10180a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends f> list) {
        t.e(list, "inner");
        this.f10180a = list;
    }

    @Override // fe.f
    public void a(xc.e eVar, wd.f fVar, Collection<z0> collection) {
        t.e(eVar, "thisDescriptor");
        t.e(fVar, "name");
        t.e(collection, "result");
        for (f fVar2 : this.f10180a) {
            fVar2.a(eVar, fVar, collection);
        }
    }

    @Override // fe.f
    public void b(xc.e eVar, List<xc.d> list) {
        t.e(eVar, "thisDescriptor");
        t.e(list, "result");
        for (f fVar : this.f10180a) {
            fVar.b(eVar, list);
        }
    }

    @Override // fe.f
    public List<wd.f> c(xc.e eVar) {
        t.e(eVar, "thisDescriptor");
        List<f> list = this.f10180a;
        ArrayList arrayList = new ArrayList();
        for (f fVar : list) {
            z.x(arrayList, fVar.c(eVar));
        }
        return arrayList;
    }

    @Override // fe.f
    public List<wd.f> d(xc.e eVar) {
        t.e(eVar, "thisDescriptor");
        List<f> list = this.f10180a;
        ArrayList arrayList = new ArrayList();
        for (f fVar : list) {
            z.x(arrayList, fVar.d(eVar));
        }
        return arrayList;
    }

    @Override // fe.f
    public void e(xc.e eVar, wd.f fVar, Collection<z0> collection) {
        t.e(eVar, "thisDescriptor");
        t.e(fVar, "name");
        t.e(collection, "result");
        for (f fVar2 : this.f10180a) {
            fVar2.e(eVar, fVar, collection);
        }
    }
}
