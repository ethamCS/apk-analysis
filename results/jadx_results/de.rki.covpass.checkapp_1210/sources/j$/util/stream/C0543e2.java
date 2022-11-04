package j$.util.stream;

import j$.util.function.Function;
/* renamed from: j$.util.stream.e2 */
/* loaded from: classes2.dex */
final class C0543e2 extends AbstractC0558h2 {

    /* renamed from: u */
    public final /* synthetic */ int f13681u;

    /* renamed from: v */
    final /* synthetic */ Function f13682v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0543e2(AbstractC0530c abstractC0530c, int i10, int i11, Function function, int i12) {
        super(abstractC0530c, i11);
        this.f13681u = i12;
        this.f13682v = function;
    }

    @Override // j$.util.stream.AbstractC0530c
    public final AbstractC0603q2 h1(int i10, AbstractC0603q2 abstractC0603q2) {
        switch (this.f13681u) {
            case 0:
                return new C0533c2(this, abstractC0603q2, 2);
            default:
                return new C0533c2(this, abstractC0603q2, 6);
        }
    }
}
