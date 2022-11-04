package j$.util.stream;

import j$.util.Comparator;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class L2 extends AbstractC0553g2 {

    /* renamed from: u */
    private final boolean f13492u;

    /* renamed from: v */
    private final Comparator f13493v;

    public L2(AbstractC0530c abstractC0530c) {
        super(abstractC0530c, EnumC0539d3.f13664q | EnumC0539d3.f13662o);
        this.f13492u = true;
        this.f13493v = Comparator.CC.a();
    }

    public L2(AbstractC0530c abstractC0530c, java.util.Comparator comparator) {
        super(abstractC0530c, EnumC0539d3.f13664q | EnumC0539d3.f13663p);
        this.f13492u = false;
        Objects.requireNonNull(comparator);
        this.f13493v = comparator;
    }

    @Override // j$.util.stream.AbstractC0530c
    public final P0 e1(D0 d02, Spliterator spliterator, j$.util.function.q qVar) {
        if (!EnumC0539d3.SORTED.h(d02.E0()) || !this.f13492u) {
            Object[] q10 = d02.w0(spliterator, true, qVar).q(qVar);
            Arrays.sort(q10, this.f13493v);
            return new S0(q10);
        }
        return d02.w0(spliterator, false, qVar);
    }

    @Override // j$.util.stream.AbstractC0530c
    public final AbstractC0603q2 h1(int i10, AbstractC0603q2 abstractC0603q2) {
        Objects.requireNonNull(abstractC0603q2);
        return (!EnumC0539d3.SORTED.h(i10) || !this.f13492u) ? EnumC0539d3.SIZED.h(i10) ? new Q2(abstractC0603q2, this.f13493v) : new M2(abstractC0603q2, this.f13493v) : abstractC0603q2;
    }
}
