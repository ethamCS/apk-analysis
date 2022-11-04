package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Objects;
/* renamed from: j$.util.stream.a1 */
/* loaded from: classes2.dex */
public final class C0522a1 extends R0 {
    public C0522a1(P0 p02, P0 p03) {
        super(p02, p03);
    }

    @Override // j$.util.stream.P0
    public final void forEach(Consumer consumer) {
        this.f13534a.forEach(consumer);
        this.f13535b.forEach(consumer);
    }

    @Override // j$.util.stream.P0
    public final void m(Object[] objArr, int i10) {
        Objects.requireNonNull(objArr);
        this.f13534a.m(objArr, i10);
        this.f13535b.m(objArr, i10 + ((int) this.f13534a.count()));
    }

    @Override // j$.util.stream.P0
    public final Object[] q(j$.util.function.q qVar) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) qVar.o((int) count);
            m(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.P0
    public final P0 r(long j10, long j11, j$.util.function.q qVar) {
        if (j10 == 0 && j11 == count()) {
            return this;
        }
        long count = this.f13534a.count();
        return j10 >= count ? this.f13535b.r(j10 - count, j11 - count, qVar) : j11 <= count ? this.f13534a.r(j10, j11, qVar) : D0.q0(1, this.f13534a.r(j10, count, qVar), this.f13535b.r(0L, j11 - count, qVar));
    }

    @Override // j$.util.stream.P0
    /* renamed from: spliterator */
    public final Spliterator mo21spliterator() {
        return new C0605r1(this);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.f13534a, this.f13535b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
