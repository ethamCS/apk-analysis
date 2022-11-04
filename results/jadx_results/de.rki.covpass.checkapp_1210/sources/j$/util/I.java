package j$.util;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes2.dex */
final class I implements AbstractC0642w, j$.util.function.x, Iterator {

    /* renamed from: a */
    boolean f13243a = false;

    /* renamed from: b */
    long f13244b;

    /* renamed from: c */
    final /* synthetic */ D f13245c;

    public I(D d10) {
        this.f13245c = d10;
    }

    /* renamed from: b */
    public final void forEachRemaining(j$.util.function.x xVar) {
        Objects.requireNonNull(xVar);
        while (hasNext()) {
            xVar.d(nextLong());
        }
    }

    @Override // j$.util.function.x
    public final void d(long j10) {
        this.f13243a = true;
        this.f13244b = j10;
    }

    @Override // j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof j$.util.function.x) {
            forEachRemaining((j$.util.function.x) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (!X.f13281a) {
            while (hasNext()) {
                consumer.h(Long.valueOf(nextLong()));
            }
            return;
        }
        X.a(I.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
        throw null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (!this.f13243a) {
            this.f13245c.i(this);
        }
        return this.f13243a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Long next() {
        if (!X.f13281a) {
            return Long.valueOf(nextLong());
        }
        X.a(I.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    public final long nextLong() {
        if (this.f13243a || hasNext()) {
            this.f13243a = false;
            return this.f13244b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void remove() {
        Iterator.CC.a();
        throw null;
    }
}
