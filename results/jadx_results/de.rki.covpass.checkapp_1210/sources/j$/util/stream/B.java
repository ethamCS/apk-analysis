package j$.util.stream;
/* loaded from: classes2.dex */
public final class B extends AbstractC0604r0 {

    /* renamed from: u */
    public final /* synthetic */ int f13415u;

    /* renamed from: v */
    final /* synthetic */ Object f13416v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(AbstractC0530c abstractC0530c, int i10, int i11, Object obj, int i12) {
        super(abstractC0530c, i11);
        this.f13415u = i12;
        this.f13416v = obj;
    }

    @Override // j$.util.stream.AbstractC0530c
    public final AbstractC0603q2 h1(int i10, AbstractC0603q2 abstractC0603q2) {
        switch (this.f13415u) {
            case 0:
                return new C0627x(this, abstractC0603q2, 3);
            case 1:
                return new C0541e0(this, abstractC0603q2, 5);
            case 2:
                return new C0591o0(this, abstractC0603q2, 1);
            case 3:
                return new C0591o0(this, abstractC0603q2, 5);
            case 4:
                return new C0591o0(this, abstractC0603q2, 6);
            case 5:
                return new C0591o0(this, abstractC0603q2, 7);
            case 6:
                return new r(this, abstractC0603q2);
            default:
                return new C0533c2(this, abstractC0603q2, 4);
        }
    }
}
