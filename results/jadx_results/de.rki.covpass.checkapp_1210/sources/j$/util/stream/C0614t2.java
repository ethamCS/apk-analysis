package j$.util.stream;
/* renamed from: j$.util.stream.t2 */
/* loaded from: classes2.dex */
final class C0614t2 extends AbstractC0573k2 {

    /* renamed from: b */
    long f13795b;

    /* renamed from: c */
    long f13796c;

    /* renamed from: d */
    final /* synthetic */ C0618u2 f13797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0614t2(C0618u2 c0618u2, AbstractC0603q2 abstractC0603q2) {
        super(abstractC0603q2);
        this.f13797d = c0618u2;
        this.f13795b = c0618u2.f13803u;
        long j10 = c0618u2.f13804v;
        this.f13796c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.AbstractC0593o2, j$.util.stream.AbstractC0603q2
    public final void accept(int i10) {
        long j10 = this.f13795b;
        if (j10 != 0) {
            this.f13795b = j10 - 1;
            return;
        }
        long j11 = this.f13796c;
        if (j11 <= 0) {
            return;
        }
        this.f13796c = j11 - 1;
        this.f13716a.accept(i10);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        this.f13716a.u(D0.h0(j10, this.f13797d.f13803u, this.f13796c));
    }

    @Override // j$.util.stream.AbstractC0573k2, j$.util.stream.AbstractC0603q2
    public final boolean x() {
        return this.f13796c == 0 || this.f13716a.x();
    }
}
