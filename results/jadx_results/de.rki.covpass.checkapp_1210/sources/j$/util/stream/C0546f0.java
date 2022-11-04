package j$.util.stream;
/* renamed from: j$.util.stream.f0 */
/* loaded from: classes2.dex */
public final class C0546f0 extends AbstractC0604r0 {

    /* renamed from: u */
    public final /* synthetic */ int f13691u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0546f0(AbstractC0530c abstractC0530c, int i10, int i11, int i12) {
        super(abstractC0530c, i11);
        this.f13691u = i12;
    }

    @Override // j$.util.stream.AbstractC0530c
    public final AbstractC0603q2 h1(int i10, AbstractC0603q2 abstractC0603q2) {
        switch (this.f13691u) {
            case 0:
                return new C0541e0(this, abstractC0603q2, 0);
            default:
                return abstractC0603q2;
        }
    }
}
