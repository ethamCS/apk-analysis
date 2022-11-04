package j$.util;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* renamed from: j$.util.s */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0519s implements PrimitiveIterator.OfInt {

    /* renamed from: a */
    final /* synthetic */ AbstractC0639t f13396a;

    private /* synthetic */ C0519s(AbstractC0639t abstractC0639t) {
        this.f13396a = abstractC0639t;
    }

    public static /* synthetic */ PrimitiveIterator.OfInt a(AbstractC0639t abstractC0639t) {
        if (abstractC0639t == null) {
            return null;
        }
        return new C0519s(abstractC0639t);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        ((H) this.f13396a).forEachRemaining(intConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        ((H) this.f13396a).forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        ((H) this.f13396a).forEachRemaining(j$.util.function.o.b(intConsumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return ((H) this.f13396a).hasNext();
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return ((H) this.f13396a).nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        Objects.requireNonNull((H) this.f13396a);
        Iterator.CC.a();
        throw null;
    }
}
