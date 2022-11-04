package j$.util.stream;

import j$.util.function.C0500b;
/* renamed from: j$.util.stream.x0 */
/* loaded from: classes2.dex */
final class C0628x0 extends AbstractC0636z0 implements AbstractC0598p2 {

    /* renamed from: c */
    final /* synthetic */ A0 f13823c;

    /* renamed from: d */
    final /* synthetic */ j$.util.function.z f13824d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0628x0(A0 a02, j$.util.function.z zVar) {
        super(a02);
        this.f13823c = a02;
        this.f13824d = zVar;
    }

    @Override // j$.util.stream.AbstractC0636z0, j$.util.stream.AbstractC0603q2
    public final void d(long j10) {
        boolean z10;
        boolean z11;
        if (!this.f13840a) {
            boolean B = ((C0500b) this.f13824d).B(j10);
            z10 = this.f13823c.f13400a;
            if (B != z10) {
                return;
            }
            this.f13840a = true;
            z11 = this.f13823c.f13401b;
            this.f13841b = z11;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        n((Long) obj);
    }

    @Override // j$.util.stream.AbstractC0598p2
    public final /* synthetic */ void n(Long l10) {
        D0.N(this, l10);
    }
}
