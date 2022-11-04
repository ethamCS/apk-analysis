package j$.util.stream;
/* renamed from: j$.util.stream.x2 */
/* loaded from: classes2.dex */
final class C0630x2 extends AbstractC0568j2 {

    /* renamed from: b */
    long f13826b;

    /* renamed from: c */
    long f13827c;

    /* renamed from: d */
    final /* synthetic */ C0634y2 f13828d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0630x2(C0634y2 c0634y2, AbstractC0603q2 abstractC0603q2) {
        super(abstractC0603q2);
        this.f13828d = c0634y2;
        this.f13826b = c0634y2.f13836u;
        long j10 = c0634y2.f13837v;
        this.f13827c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.stream.AbstractC0588n2, j$.util.stream.AbstractC0603q2
    public final void c(double d10) {
        long j10 = this.f13826b;
        if (j10 != 0) {
            this.f13826b = j10 - 1;
            return;
        }
        long j11 = this.f13827c;
        if (j11 <= 0) {
            return;
        }
        this.f13827c = j11 - 1;
        this.f13708a.c(d10);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        this.f13708a.u(D0.h0(j10, this.f13828d.f13836u, this.f13827c));
    }

    @Override // j$.util.stream.AbstractC0568j2, j$.util.stream.AbstractC0603q2
    public final boolean x() {
        return this.f13827c == 0 || this.f13708a.x();
    }
}
