package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class J3 extends AbstractC0549f3 {
    J3(D0 d02, Spliterator spliterator, boolean z10) {
        super(d02, spliterator, z10);
    }

    public J3(D0 d02, j$.util.function.I i10, boolean z10) {
        super(d02, i10, z10);
    }

    @Override // j$.util.Spliterator
    public final boolean b(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean a10 = a();
        if (a10) {
            C0524a3 c0524a3 = (C0524a3) this.f13699h;
            long j10 = this.f13698g;
            if (c0524a3.f13677c != 0) {
                if (j10 >= c0524a3.count()) {
                    throw new IndexOutOfBoundsException(Long.toString(j10));
                }
                for (int i10 = 0; i10 <= c0524a3.f13677c; i10++) {
                    long[] jArr = c0524a3.f13678d;
                    long j11 = jArr[i10];
                    Object[][] objArr = c0524a3.f13621f;
                    if (j10 < j11 + objArr[i10].length) {
                        obj = objArr[i10][(int) (j10 - jArr[i10])];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j10));
            } else if (j10 >= c0524a3.f13676b) {
                throw new IndexOutOfBoundsException(Long.toString(j10));
            } else {
                obj = c0524a3.f13620e[(int) j10];
            }
            consumer.h(obj);
        }
        return a10;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f13699h != null || this.f13700i) {
            do {
            } while (b(consumer));
            return;
        }
        Objects.requireNonNull(consumer);
        d();
        this.f13693b.U0(new I3(consumer, 0), this.f13695d);
        this.f13700i = true;
    }

    @Override // j$.util.stream.AbstractC0549f3
    final void h() {
        C0524a3 c0524a3 = new C0524a3();
        this.f13699h = c0524a3;
        this.f13696e = this.f13693b.V0(new I3(c0524a3, 1));
        this.f13697f = new C0525b(this, 7);
    }

    @Override // j$.util.stream.AbstractC0549f3
    final AbstractC0549f3 l(Spliterator spliterator) {
        return new J3(this.f13693b, spliterator, this.f13692a);
    }
}
