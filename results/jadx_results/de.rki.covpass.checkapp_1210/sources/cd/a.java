package cd;

import hc.t;
import he.b;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import pd.p;
import pd.q;
import qd.a;
import ub.c0;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final pd.g f6428a;

    /* renamed from: b */
    private final g f6429b;

    /* renamed from: c */
    private final ConcurrentHashMap<wd.b, he.h> f6430c = new ConcurrentHashMap<>();

    public a(pd.g gVar, g gVar2) {
        t.e(gVar, "resolver");
        t.e(gVar2, "kotlinClassFinder");
        this.f6428a = gVar;
        this.f6429b = gVar2;
    }

    public final he.h a(f fVar) {
        Collection<q> collection;
        List F0;
        t.e(fVar, "fileClass");
        ConcurrentHashMap<wd.b, he.h> concurrentHashMap = this.f6430c;
        wd.b i10 = fVar.i();
        he.h hVar = concurrentHashMap.get(i10);
        if (hVar == null) {
            wd.c h10 = fVar.i().h();
            t.d(h10, "fileClass.classId.packageFqName");
            if (fVar.a().c() == a.EnumC0322a.MULTIFILE_CLASS) {
                List<String> f10 = fVar.a().f();
                collection = new ArrayList();
                for (String str : f10) {
                    wd.b m10 = wd.b.m(fe.d.d(str).e());
                    t.d(m10, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                    q b10 = p.b(this.f6429b, m10);
                    if (b10 != null) {
                        collection.add(b10);
                    }
                }
            } else {
                collection = ub.t.d(fVar);
            }
            ad.m mVar = new ad.m(this.f6428a.d().p(), h10);
            ArrayList arrayList = new ArrayList();
            for (q qVar : collection) {
                he.h b11 = this.f6428a.b(mVar, qVar);
                if (b11 != null) {
                    arrayList.add(b11);
                }
            }
            F0 = c0.F0(arrayList);
            b.a aVar = he.b.Companion;
            he.h a10 = aVar.a("package " + h10 + " (" + fVar + ')', F0);
            he.h putIfAbsent = concurrentHashMap.putIfAbsent(i10, a10);
            hVar = putIfAbsent == null ? a10 : putIfAbsent;
        }
        t.d(hVar, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
        return hVar;
    }
}
