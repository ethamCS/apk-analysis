package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes2.dex */
final class K2 extends AbstractC0601q0 {
    public K2(AbstractC0530c abstractC0530c) {
        super(abstractC0530c, EnumC0539d3.f13664q | EnumC0539d3.f13662o);
    }

    @Override // j$.util.stream.AbstractC0530c
    public final P0 e1(D0 d02, Spliterator spliterator, j$.util.function.q qVar) {
        if (EnumC0539d3.SORTED.h(d02.E0())) {
            return d02.w0(spliterator, false, qVar);
        }
        long[] jArr = (long[]) ((N0) d02.w0(spliterator, true, qVar)).i();
        Arrays.sort(jArr);
        return new C0613t1(jArr);
    }

    @Override // j$.util.stream.AbstractC0530c
    public final AbstractC0603q2 h1(int i10, AbstractC0603q2 abstractC0603q2) {
        Objects.requireNonNull(abstractC0603q2);
        return EnumC0539d3.SORTED.h(i10) ? abstractC0603q2 : EnumC0539d3.SIZED.h(i10) ? new P2(abstractC0603q2) : new H2(abstractC0603q2);
    }
}
