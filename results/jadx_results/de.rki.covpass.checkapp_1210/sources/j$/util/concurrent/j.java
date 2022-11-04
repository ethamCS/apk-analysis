package j$.util.concurrent;

import j$.util.AbstractC0491a;
import j$.util.Collection$CC;
import j$.util.Collection$EL;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.D0;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;
/* loaded from: classes2.dex */
public final class j extends c implements Set, AbstractC0491a {
    public j(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.concurrent.c, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f13304a.containsKey(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
    }

    @Override // j$.util.AbstractC0491a, j$.lang.Iterable
    public final void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        m[] mVarArr = this.f13304a.table;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m a10 = qVar.a();
                if (a10 == null) {
                    return;
                }
                consumer.h(a10.f13315b);
            }
        }
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (((AbstractC0495b) it).hasNext()) {
            i10 += ((i) it).next().hashCode();
        }
        return i10;
    }

    @Override // j$.util.concurrent.c, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f13304a;
        m[] mVarArr = concurrentHashMap.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        return new i(mVarArr, length, length, concurrentHashMap, 0);
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        j$.util.stream.Stream T0;
        T0 = D0.T0(Collection$EL.b(this), true);
        return Stream.Wrapper.convert(T0);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.f13304a.remove(obj) != null;
    }

    @Override // j$.util.AbstractC0491a
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection$CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return Collection$CC.$default$removeIf(this, Predicate.VivifiedWrapper.convert(predicate));
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.AbstractC0491a, j$.util.List, j$.lang.Iterable
    /* renamed from: spliterator */
    public final Spliterator mo23spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f13304a;
        long sumCount = concurrentHashMap.sumCount();
        m[] mVarArr = concurrentHashMap.table;
        int length = mVarArr == null ? 0 : mVarArr.length;
        long j10 = 0;
        if (sumCount >= 0) {
            j10 = sumCount;
        }
        return new k(mVarArr, length, 0, length, j10, 0);
    }
}
