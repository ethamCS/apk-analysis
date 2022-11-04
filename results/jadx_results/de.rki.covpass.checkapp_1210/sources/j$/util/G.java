package j$.util;

import j$.util.function.Consumer;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
final class G implements java.util.Iterator, Consumer {

    /* renamed from: a */
    boolean f13237a = false;

    /* renamed from: b */
    Object f13238b;

    /* renamed from: c */
    final /* synthetic */ Spliterator f13239c;

    public G(Spliterator spliterator) {
        this.f13239c = spliterator;
    }

    @Override // j$.util.function.Consumer
    public final void h(Object obj) {
        this.f13237a = true;
        this.f13238b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f13237a) {
            this.f13239c.b(this);
        }
        return this.f13237a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f13237a || hasNext()) {
            this.f13237a = false;
            return this.f13238b;
        }
        throw new NoSuchElementException();
    }
}
