package j$.util;

import j$.util.Iterator;
import j$.util.function.Consumer;
import j$.util.function.IntConsumer;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class H implements AbstractC0639t, IntConsumer, Iterator {

    /* renamed from: a */
    boolean f13240a = false;

    /* renamed from: b */
    int f13241b;

    /* renamed from: c */
    final /* synthetic */ B f13242c;

    public H(B b10) {
        this.f13242c = b10;
    }

    @Override // j$.util.function.IntConsumer
    public final void accept(int i10) {
        this.f13240a = true;
        this.f13241b = i10;
    }

    @Override // j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return Objects.requireNonNull(intConsumer);
    }

    /* renamed from: b */
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }

    @Override // j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (!X.f13281a) {
            while (hasNext()) {
                consumer.h(Integer.valueOf(nextInt()));
            }
            return;
        }
        X.a(H.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
        throw null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (!this.f13240a) {
            this.f13242c.e(this);
        }
        return this.f13240a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Integer next() {
        if (!X.f13281a) {
            return Integer.valueOf(nextInt());
        }
        X.a(H.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    public final int nextInt() {
        if (this.f13240a || hasNext()) {
            this.f13240a = false;
            return this.f13241b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void remove() {
        Iterator.CC.a();
        throw null;
    }
}
