package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.q0 */
/* loaded from: classes2.dex */
public abstract class AbstractC0601q0 extends AbstractC0608s0 {
    public AbstractC0601q0(AbstractC0530c abstractC0530c, int i10) {
        super(abstractC0530c, i10);
    }

    @Override // j$.util.stream.AbstractC0530c
    final boolean g1() {
        return true;
    }

    @Override // j$.util.stream.AbstractC0530c, j$.util.stream.AbstractC0555h, j$.util.stream.I
    public final /* bridge */ /* synthetic */ AbstractC0616u0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0530c, j$.util.stream.AbstractC0555h, j$.util.stream.I
    public final /* bridge */ /* synthetic */ AbstractC0616u0 sequential() {
        sequential();
        return this;
    }
}