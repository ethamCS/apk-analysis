package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Deque;
/* renamed from: j$.util.stream.r1 */
/* loaded from: classes2.dex */
final class C0605r1 extends AbstractC0609s1 {
    public C0605r1(P0 p02) {
        super(p02);
    }

    @Override // j$.util.Spliterator
    public final boolean b(Consumer consumer) {
        P0 a10;
        if (!d()) {
            return false;
        }
        boolean b10 = this.f13784d.b(consumer);
        if (!b10) {
            if (this.f13783c == null && (a10 = a(this.f13785e)) != null) {
                Spliterator mo21spliterator = a10.mo21spliterator();
                this.f13784d = mo21spliterator;
                return mo21spliterator.b(consumer);
            }
            this.f13781a = null;
        }
        return b10;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f13781a == null) {
            return;
        }
        if (this.f13784d != null) {
            do {
            } while (b(consumer));
            return;
        }
        Spliterator spliterator = this.f13783c;
        if (spliterator != null) {
            spliterator.forEachRemaining(consumer);
            return;
        }
        Deque c10 = c();
        while (true) {
            P0 a10 = a(c10);
            if (a10 == null) {
                this.f13781a = null;
                return;
            }
            a10.forEach(consumer);
        }
    }
}
