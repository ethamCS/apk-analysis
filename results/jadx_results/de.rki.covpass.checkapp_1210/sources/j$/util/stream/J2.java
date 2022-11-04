package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes2.dex */
final class J2 extends AbstractC0561i0 {
    public J2(AbstractC0530c abstractC0530c) {
        super(abstractC0530c, EnumC0539d3.f13664q | EnumC0539d3.f13662o);
    }

    @Override // j$.util.stream.AbstractC0530c
    public final P0 e1(D0 d02, Spliterator spliterator, j$.util.function.q qVar) {
        if (EnumC0539d3.SORTED.h(d02.E0())) {
            return d02.w0(spliterator, false, qVar);
        }
        int[] iArr = (int[]) ((L0) d02.w0(spliterator, true, qVar)).i();
        Arrays.sort(iArr);
        return new C0572k1(iArr);
    }

    @Override // j$.util.stream.AbstractC0530c
    public final AbstractC0603q2 h1(int i10, AbstractC0603q2 abstractC0603q2) {
        Objects.requireNonNull(abstractC0603q2);
        return EnumC0539d3.SORTED.h(i10) ? abstractC0603q2 : EnumC0539d3.SIZED.h(i10) ? new O2(abstractC0603q2) : new G2(abstractC0603q2);
    }
}
