package ae;

import hc.t;
import hc.v;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedList;
import tb.e0;
import ub.c0;
/* loaded from: classes3.dex */
public final class l {

    /* loaded from: classes3.dex */
    public static final class a extends v implements gc.l<H, e0> {

        /* renamed from: c */
        final /* synthetic */ ye.f<H> f470c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ye.f<H> fVar) {
            super(1);
            this.f470c = fVar;
        }

        public final void b(H h10) {
            AbstractCollection abstractCollection = this.f470c;
            t.d(h10, "it");
            abstractCollection.add(h10);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(Object obj) {
            b(obj);
            return e0.f22152a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> a(Collection<? extends H> collection, gc.l<? super H, ? extends xc.a> lVar) {
        Object V;
        Object r02;
        t.e(collection, "<this>");
        t.e(lVar, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        ye.f a10 = ye.f.Companion.a();
        while (!linkedList.isEmpty()) {
            V = c0.V(linkedList);
            ye.f a11 = ye.f.Companion.a();
            Collection<? super H> p10 = j.p(V, linkedList, lVar, new a(a11));
            t.d(p10, "val conflictedHandles = …nflictedHandles.add(it) }");
            if (p10.size() != 1 || !a11.isEmpty()) {
                Object obj = (Object) j.L(p10, lVar);
                t.d(obj, "selectMostSpecificMember…roup, descriptorByHandle)");
                xc.a invoke = lVar.invoke(obj);
                for (Object obj2 : p10) {
                    t.d(obj2, "it");
                    if (!j.B(invoke, lVar.invoke(obj2))) {
                        a11.add(obj2);
                    }
                }
                if (!a11.isEmpty()) {
                    a10.addAll(a11);
                }
                a10.add(obj);
            } else {
                r02 = c0.r0(p10);
                t.d(r02, "overridableGroup.single()");
                a10.add(r02);
            }
        }
        return a10;
    }
}
