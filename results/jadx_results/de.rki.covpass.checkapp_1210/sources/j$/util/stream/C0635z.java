package j$.util.stream;
/* renamed from: j$.util.stream.z */
/* loaded from: classes2.dex */
public final class C0635z extends AbstractC0558h2 {

    /* renamed from: u */
    public final /* synthetic */ int f13838u;

    /* renamed from: v */
    final /* synthetic */ Object f13839v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0635z(AbstractC0530c abstractC0530c, int i10, int i11, Object obj, int i12) {
        super(abstractC0530c, i11);
        this.f13838u = i12;
        this.f13839v = obj;
    }

    @Override // j$.util.stream.AbstractC0530c
    public final AbstractC0603q2 h1(int i10, AbstractC0603q2 abstractC0603q2) {
        switch (this.f13838u) {
            case 0:
                return new C0627x(this, abstractC0603q2, 1);
            case 1:
                return new C0541e0(this, abstractC0603q2, 4);
            case 2:
                return new C0591o0(this, abstractC0603q2, 2);
            case 3:
                return new C0533c2(this, abstractC0603q2, 0);
            default:
                return new C0533c2(this, abstractC0603q2, 1);
        }
    }
}
