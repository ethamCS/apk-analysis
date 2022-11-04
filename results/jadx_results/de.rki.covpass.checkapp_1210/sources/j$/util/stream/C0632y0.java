package j$.util.stream;

import j$.util.function.AbstractC0505g;
import j$.util.function.C0500b;
/* renamed from: j$.util.stream.y0 */
/* loaded from: classes2.dex */
final class C0632y0 extends AbstractC0636z0 implements AbstractC0588n2 {

    /* renamed from: c */
    final /* synthetic */ A0 f13832c;

    /* renamed from: d */
    final /* synthetic */ AbstractC0505g f13833d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0632y0(A0 a02, AbstractC0505g abstractC0505g) {
        super(a02);
        this.f13832c = a02;
        this.f13833d = abstractC0505g;
    }

    @Override // j$.util.stream.AbstractC0636z0, j$.util.stream.AbstractC0603q2
    public final void c(double d10) {
        boolean z10;
        boolean z11;
        if (!this.f13840a) {
            boolean z12 = ((C0500b) this.f13833d).z(d10);
            z10 = this.f13832c.f13400a;
            if (z12 != z10) {
                return;
            }
            this.f13840a = true;
            z11 = this.f13832c.f13401b;
            this.f13841b = z11;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        y((Double) obj);
    }

    @Override // j$.util.stream.AbstractC0588n2
    public final /* synthetic */ void y(Double d10) {
        D0.J(this, d10);
    }
}
