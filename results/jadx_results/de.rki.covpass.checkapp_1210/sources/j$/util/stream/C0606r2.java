package j$.util.stream;
/* renamed from: j$.util.stream.r2 */
/* loaded from: classes2.dex */
final class C0606r2 extends AbstractC0583m2 {

    /* renamed from: b */
    long f13775b;

    /* renamed from: c */
    long f13776c;

    /* renamed from: d */
    final /* synthetic */ C0610s2 f13777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0606r2(C0610s2 c0610s2, AbstractC0603q2 abstractC0603q2) {
        super(abstractC0603q2);
        this.f13777d = c0610s2;
        this.f13775b = c0610s2.f13786u;
        long j10 = c0610s2.f13787v;
        this.f13776c = j10 < 0 ? Long.MAX_VALUE : j10;
    }

    @Override // j$.util.function.Consumer
    public final void h(Object obj) {
        long j10 = this.f13775b;
        if (j10 != 0) {
            this.f13775b = j10 - 1;
            return;
        }
        long j11 = this.f13776c;
        if (j11 <= 0) {
            return;
        }
        this.f13776c = j11 - 1;
        this.f13746a.h(obj);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        this.f13746a.u(D0.h0(j10, this.f13777d.f13786u, this.f13776c));
    }

    @Override // j$.util.stream.AbstractC0583m2, j$.util.stream.AbstractC0603q2
    public final boolean x() {
        return this.f13776c == 0 || this.f13746a.x();
    }
}
