package j$.util;

import j$.util.Iterator;
import j$.util.function.AbstractC0503e;
import j$.util.function.Consumer;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes2.dex */
final class J implements AbstractC0518q, AbstractC0503e, Iterator {

    /* renamed from: a */
    boolean f13246a = false;

    /* renamed from: b */
    double f13247b;

    /* renamed from: c */
    final /* synthetic */ z f13248c;

    public J(z zVar) {
        this.f13248c = zVar;
    }

    /* renamed from: b */
    public final void forEachRemaining(AbstractC0503e abstractC0503e) {
        Objects.requireNonNull(abstractC0503e);
        while (hasNext()) {
            abstractC0503e.c(nextDouble());
        }
    }

    @Override // j$.util.function.AbstractC0503e
    public final void c(double d10) {
        this.f13246a = true;
        this.f13247b = d10;
    }

    @Override // j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof AbstractC0503e) {
            forEachRemaining((AbstractC0503e) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (!X.f13281a) {
            while (hasNext()) {
                consumer.h(Double.valueOf(nextDouble()));
            }
            return;
        }
        X.a(J.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
        throw null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (!this.f13246a) {
            this.f13248c.j(this);
        }
        return this.f13246a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Double next() {
        if (!X.f13281a) {
            return Double.valueOf(nextDouble());
        }
        X.a(J.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    public final double nextDouble() {
        if (this.f13246a || hasNext()) {
            this.f13246a = false;
            return this.f13247b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void remove() {
        Iterator.CC.a();
        throw null;
    }
}
