package j$.util.stream;
/* renamed from: j$.util.stream.j0 */
/* loaded from: classes2.dex */
public abstract class AbstractC0566j0 extends AbstractC0571k0 {
    public AbstractC0566j0(AbstractC0530c abstractC0530c, int i10) {
        super(abstractC0530c, i10);
    }

    @Override // j$.util.stream.AbstractC0530c
    final boolean g1() {
        return false;
    }

    @Override // j$.util.stream.AbstractC0530c, j$.util.stream.AbstractC0555h, j$.util.stream.I
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0530c, j$.util.stream.AbstractC0555h, j$.util.stream.I
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }
}
