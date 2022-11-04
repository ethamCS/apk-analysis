package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: j$.util.stream.s */
/* loaded from: classes2.dex */
public final class C0607s extends AbstractC0553g2 {
    public C0607s(AbstractC0530c abstractC0530c, int i10, int i11) {
        super(abstractC0530c, i11);
    }

    @Override // j$.util.stream.AbstractC0530c
    final P0 e1(D0 d02, Spliterator spliterator, j$.util.function.q qVar) {
        if (EnumC0539d3.DISTINCT.h(d02.E0())) {
            return d02.w0(spliterator, false, qVar);
        }
        if (EnumC0539d3.ORDERED.h(d02.E0())) {
            return l1(d02, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new Y(new C0590o(atomicBoolean, concurrentHashMap, 0), false).e(d02, spliterator);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new T0(keySet);
    }

    @Override // j$.util.stream.AbstractC0530c
    final Spliterator f1(D0 d02, Spliterator spliterator) {
        return EnumC0539d3.DISTINCT.h(d02.E0()) ? d02.W0(spliterator) : EnumC0539d3.ORDERED.h(d02.E0()) ? ((T0) l1(d02, spliterator)).mo21spliterator() : new C0584m3(d02.W0(spliterator));
    }

    @Override // j$.util.stream.AbstractC0530c
    public final AbstractC0603q2 h1(int i10, AbstractC0603q2 abstractC0603q2) {
        Objects.requireNonNull(abstractC0603q2);
        return EnumC0539d3.DISTINCT.h(i10) ? abstractC0603q2 : EnumC0539d3.SORTED.h(i10) ? new C0600q(abstractC0603q2) : new r(this, abstractC0603q2);
    }

    final P0 l1(D0 d02, Spliterator spliterator) {
        return new T0((Collection) ((AbstractC0523a2) D0.S0(C0595p.f13762a, C0575l.f13719b, C0580m.f13736b)).e(d02, spliterator));
    }
}
