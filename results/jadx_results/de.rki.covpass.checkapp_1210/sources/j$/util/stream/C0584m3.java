package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer;
import java.util.Comparator;
/* renamed from: j$.util.stream.m3 */
/* loaded from: classes2.dex */
final class C0584m3 implements Spliterator, Consumer {

    /* renamed from: d */
    private static final Object f13747d = new Object();

    /* renamed from: a */
    private final Spliterator f13748a;

    /* renamed from: b */
    private final ConcurrentHashMap f13749b;

    /* renamed from: c */
    private Object f13750c;

    public C0584m3(Spliterator spliterator) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f13748a = spliterator;
        this.f13749b = concurrentHashMap;
    }

    private C0584m3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f13748a = spliterator;
        this.f13749b = concurrentHashMap;
    }

    @Override // j$.util.Spliterator
    public final boolean b(Consumer consumer) {
        while (this.f13748a.b(this)) {
            ConcurrentHashMap concurrentHashMap = this.f13749b;
            Object obj = this.f13750c;
            if (obj == null) {
                obj = f13747d;
            }
            if (concurrentHashMap.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.h(this.f13750c);
                this.f13750c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f13748a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f13748a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f13748a.forEachRemaining(new C0590o(this, consumer, 6));
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f13748a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0516o.h(this);
    }

    @Override // j$.util.function.Consumer
    public final void h(Object obj) {
        this.f13750c = obj;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0516o.l(this, i10);
    }

    public final void m(Consumer consumer, Object obj) {
        if (this.f13749b.putIfAbsent(obj != null ? obj : f13747d, Boolean.TRUE) == null) {
            consumer.h(obj);
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.f13748a.trySplit();
        if (trySplit != null) {
            return new C0584m3(trySplit, this.f13749b);
        }
        return null;
    }
}
