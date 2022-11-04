package j$.util.stream;

import j$.util.Collection$EL;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Collection;
/* loaded from: classes2.dex */
public final class T0 implements P0 {

    /* renamed from: a */
    private final Collection f13554a;

    public T0(Collection collection) {
        this.f13554a = collection;
    }

    @Override // j$.util.stream.P0
    public final P0 b(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.P0
    public final long count() {
        return this.f13554a.size();
    }

    @Override // j$.util.stream.P0
    public final void forEach(Consumer consumer) {
        Collection$EL.a(this.f13554a, consumer);
    }

    @Override // j$.util.stream.P0
    public final void m(Object[] objArr, int i10) {
        for (Object obj : this.f13554a) {
            objArr[i10] = obj;
            i10++;
        }
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ int p() {
        return 0;
    }

    @Override // j$.util.stream.P0
    public final Object[] q(j$.util.function.q qVar) {
        Collection collection = this.f13554a;
        return collection.toArray((Object[]) qVar.o(collection.size()));
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ P0 r(long j10, long j11, j$.util.function.q qVar) {
        return D0.e0(this, j10, j11, qVar);
    }

    @Override // j$.util.stream.P0
    /* renamed from: spliterator */
    public final Spliterator mo21spliterator() {
        return Collection$EL.stream(this.f13554a).spliterator();
    }

    public final String toString() {
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(this.f13554a.size()), this.f13554a);
    }
}
