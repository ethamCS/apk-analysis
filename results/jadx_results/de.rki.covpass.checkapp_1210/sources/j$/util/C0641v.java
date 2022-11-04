package j$.util;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* renamed from: j$.util.v */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0641v implements PrimitiveIterator.OfLong {

    /* renamed from: a */
    final /* synthetic */ AbstractC0642w f13845a;

    private /* synthetic */ C0641v(AbstractC0642w abstractC0642w) {
        this.f13845a = abstractC0642w;
    }

    public static /* synthetic */ PrimitiveIterator.OfLong a(AbstractC0642w abstractC0642w) {
        return new C0641v(abstractC0642w);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        ((I) this.f13845a).forEachRemaining(longConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        ((I) this.f13845a).forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        ((I) this.f13845a).forEachRemaining(j$.util.function.w.b(longConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return ((I) this.f13845a).hasNext();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return ((I) this.f13845a).nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        Objects.requireNonNull((I) this.f13845a);
        Iterator.CC.a();
        throw null;
    }
}
