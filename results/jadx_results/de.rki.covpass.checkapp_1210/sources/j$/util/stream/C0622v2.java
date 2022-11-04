package j$.util.stream;
/* renamed from: j$.util.stream.v2 */
/* loaded from: classes2.dex */
final class C0622v2 extends AbstractC0578l2 {

    /* renamed from: b */
    long f13809b;

    /* renamed from: c */
    long f13810c;

    /* renamed from: d */
    final /* synthetic */ C0626w2 f13811d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0622v2(C0626w2 c0626w2, AbstractC0603q2 abstractC0603q2) {
        super(abstractC0603q2);
        this.f13811d = c0626w2;
        this.f13809b = c0626w2.f13819u;
        long j10 = c0626w2.f13820v;
        this.f13810c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.AbstractC0598p2, j$.util.stream.AbstractC0603q2
    public final void d(long j10) {
        long j11 = this.f13809b;
        if (j11 != 0) {
            this.f13809b = j11 - 1;
            return;
        }
        long j12 = this.f13810c;
        if (j12 <= 0) {
            return;
        }
        this.f13810c = j12 - 1;
        this.f13733a.d(j10);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        this.f13733a.u(D0.h0(j10, this.f13811d.f13819u, this.f13810c));
    }

    @Override // j$.util.stream.AbstractC0578l2, j$.util.stream.AbstractC0603q2
    public final boolean x() {
        return this.f13810c == 0 || this.f13733a.x();
    }
}
