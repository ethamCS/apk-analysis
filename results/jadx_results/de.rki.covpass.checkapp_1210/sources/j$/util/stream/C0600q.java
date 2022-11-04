package j$.util.stream;
/* renamed from: j$.util.stream.q */
/* loaded from: classes2.dex */
final class C0600q extends AbstractC0583m2 {

    /* renamed from: b */
    boolean f13770b;

    /* renamed from: c */
    Object f13771c;

    public C0600q(AbstractC0603q2 abstractC0603q2) {
        super(abstractC0603q2);
    }

    @Override // j$.util.function.Consumer
    public final void h(Object obj) {
        if (obj == null) {
            if (this.f13770b) {
                return;
            }
            this.f13770b = true;
            AbstractC0603q2 abstractC0603q2 = this.f13746a;
            this.f13771c = null;
            abstractC0603q2.h(null);
            return;
        }
        Object obj2 = this.f13771c;
        if (obj2 != null && obj.equals(obj2)) {
            return;
        }
        AbstractC0603q2 abstractC0603q22 = this.f13746a;
        this.f13771c = obj;
        abstractC0603q22.h(obj);
    }

    @Override // j$.util.stream.AbstractC0583m2, j$.util.stream.AbstractC0603q2
    public final void t() {
        this.f13770b = false;
        this.f13771c = null;
        this.f13746a.t();
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        this.f13770b = false;
        this.f13771c = null;
        this.f13746a.u(-1L);
    }
}
