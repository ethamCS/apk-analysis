package ae;

import hc.t;
import he.k;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import ub.c0;
import ub.u;
import xc.e0;
import xc.e1;
import xc.l0;
/* loaded from: classes3.dex */
public final class a extends o {

    /* renamed from: a */
    public static final a f421a = new a();

    /* renamed from: ae.a$a */
    /* loaded from: classes3.dex */
    public static final class C0007a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int a10;
            a10 = wb.b.a(ee.a.h((xc.e) t10).b(), ee.a.h((xc.e) t11).b());
            return a10;
        }
    }

    private a() {
    }

    private static final void b(xc.e eVar, LinkedHashSet<xc.e> linkedHashSet, he.h hVar, boolean z10) {
        for (xc.m mVar : k.a.a(hVar, he.d.f11850s, null, 2, null)) {
            if (mVar instanceof xc.e) {
                xc.e eVar2 = (xc.e) mVar;
                if (eVar2.l0()) {
                    wd.f name = eVar2.getName();
                    t.d(name, "descriptor.name");
                    xc.h f10 = hVar.f(name, fd.d.WHEN_GET_ALL_DESCRIPTORS);
                    eVar2 = f10 instanceof xc.e ? (xc.e) f10 : f10 instanceof e1 ? ((e1) f10).q() : null;
                }
                if (eVar2 != null) {
                    if (d.z(eVar2, eVar)) {
                        linkedHashSet.add(eVar2);
                    }
                    if (z10) {
                        he.h w02 = eVar2.w0();
                        t.d(w02, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        b(eVar, linkedHashSet, w02, z10);
                    }
                }
            }
        }
    }

    public Collection<xc.e> a(xc.e eVar, boolean z10) {
        xc.m mVar;
        List w02;
        xc.m mVar2;
        List h10;
        t.e(eVar, "sealedClass");
        if (eVar.s() != e0.SEALED) {
            h10 = u.h();
            return h10;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!z10) {
            mVar = eVar.b();
        } else {
            Iterator<xc.m> it = ee.a.m(eVar).iterator();
            while (true) {
                if (!it.hasNext()) {
                    mVar2 = null;
                    break;
                }
                mVar2 = it.next();
                if (mVar2 instanceof l0) {
                    break;
                }
            }
            mVar = mVar2;
        }
        if (mVar instanceof l0) {
            b(eVar, linkedHashSet, ((l0) mVar).z(), z10);
        }
        he.h w03 = eVar.w0();
        t.d(w03, "sealedClass.unsubstitutedInnerClassesScope");
        b(eVar, linkedHashSet, w03, true);
        w02 = c0.w0(linkedHashSet, new C0007a());
        return w02;
    }
}
