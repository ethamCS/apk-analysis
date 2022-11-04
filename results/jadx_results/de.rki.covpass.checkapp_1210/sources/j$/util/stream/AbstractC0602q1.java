package j$.util.stream;

import j$.util.Spliterator;
import java.util.Deque;
/* renamed from: j$.util.stream.q1 */
/* loaded from: classes2.dex */
abstract class AbstractC0602q1 extends AbstractC0609s1 implements j$.util.F {
    public AbstractC0602q1(O0 o02) {
        super(o02);
    }

    @Override // j$.util.F
    /* renamed from: forEachRemaining */
    public final void k(Object obj) {
        if (this.f13781a == null) {
            return;
        }
        if (this.f13784d != null) {
            do {
            } while (j(obj));
            return;
        }
        Spliterator spliterator = this.f13783c;
        if (spliterator != null) {
            ((j$.util.F) spliterator).forEachRemaining(obj);
            return;
        }
        Deque c10 = c();
        while (true) {
            O0 o02 = (O0) a(c10);
            if (o02 == null) {
                this.f13781a = null;
                return;
            }
            o02.j(obj);
        }
    }

    @Override // j$.util.F
    /* renamed from: tryAdvance */
    public final boolean j(Object obj) {
        O0 o02;
        if (!d()) {
            return false;
        }
        boolean tryAdvance = ((j$.util.F) this.f13784d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.f13783c == null && (o02 = (O0) a(this.f13785e)) != null) {
                j$.util.F mo21spliterator = o02.mo21spliterator();
                this.f13784d = mo21spliterator;
                return mo21spliterator.tryAdvance(obj);
            }
            this.f13781a = null;
        }
        return tryAdvance;
    }
}
