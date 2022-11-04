package j$.util;

import j$.util.Iterator;
import j$.util.function.C0502d;
import j$.util.function.Consumer;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* renamed from: j$.util.p */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0517p implements PrimitiveIterator.OfDouble {

    /* renamed from: a */
    final /* synthetic */ AbstractC0518q f13394a;

    private /* synthetic */ C0517p(AbstractC0518q abstractC0518q) {
        this.f13394a = abstractC0518q;
    }

    public static /* synthetic */ PrimitiveIterator.OfDouble a(AbstractC0518q abstractC0518q) {
        return new C0517p(abstractC0518q);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        ((J) this.f13394a).forEachRemaining(doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        ((J) this.f13394a).forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        ((J) this.f13394a).forEachRemaining(C0502d.b(doubleConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return ((J) this.f13394a).hasNext();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return ((J) this.f13394a).nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        Objects.requireNonNull((J) this.f13394a);
        Iterator.CC.a();
        throw null;
    }
}
