package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes2.dex */
final class I2 extends E {
    public I2(AbstractC0530c abstractC0530c) {
        super(abstractC0530c, EnumC0539d3.f13664q | EnumC0539d3.f13662o);
    }

    @Override // j$.util.stream.AbstractC0530c
    public final P0 e1(D0 d02, Spliterator spliterator, j$.util.function.q qVar) {
        if (EnumC0539d3.SORTED.h(d02.E0())) {
            return d02.w0(spliterator, false, qVar);
        }
        double[] dArr = (double[]) ((J0) d02.w0(spliterator, true, qVar)).i();
        Arrays.sort(dArr);
        return new C0527b1(dArr);
    }

    @Override // j$.util.stream.AbstractC0530c
    public final AbstractC0603q2 h1(int i10, AbstractC0603q2 abstractC0603q2) {
        Objects.requireNonNull(abstractC0603q2);
        return EnumC0539d3.SORTED.h(i10) ? abstractC0603q2 : EnumC0539d3.SIZED.h(i10) ? new N2(abstractC0603q2) : new F2(abstractC0603q2);
    }
}
