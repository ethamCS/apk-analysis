package j$.util.stream;
/* loaded from: classes2.dex */
abstract class E extends G {
    public E(AbstractC0530c abstractC0530c, int i10) {
        super(abstractC0530c, i10);
    }

    @Override // j$.util.stream.AbstractC0530c
    final boolean g1() {
        return true;
    }

    @Override // j$.util.stream.AbstractC0530c, j$.util.stream.AbstractC0555h, j$.util.stream.I
    public final /* bridge */ /* synthetic */ I parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0530c, j$.util.stream.AbstractC0555h, j$.util.stream.I
    public final /* bridge */ /* synthetic */ I sequential() {
        sequential();
        return this;
    }
}
