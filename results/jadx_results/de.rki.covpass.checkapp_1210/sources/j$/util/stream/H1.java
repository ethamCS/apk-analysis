package j$.util.stream;

import j$.util.function.AbstractC0501c;
/* loaded from: classes2.dex */
final class H1 extends AbstractC0523a2 {

    /* renamed from: b */
    final /* synthetic */ AbstractC0501c f13459b;

    /* renamed from: c */
    final /* synthetic */ double f13460c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1(int i10, AbstractC0501c abstractC0501c, double d10) {
        super(i10);
        this.f13459b = abstractC0501c;
        this.f13460c = d10;
    }

    @Override // j$.util.stream.AbstractC0523a2
    public final Y1 a() {
        return new I1(this.f13460c, this.f13459b);
    }
}
