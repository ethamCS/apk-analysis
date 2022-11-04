package j$.util.stream;

import j$.util.function.C0500b;
/* renamed from: j$.util.stream.o0 */
/* loaded from: classes2.dex */
final class C0591o0 extends AbstractC0578l2 {

    /* renamed from: b */
    public final /* synthetic */ int f13760b;

    /* renamed from: c */
    final /* synthetic */ Object f13761c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0591o0(AbstractC0530c abstractC0530c, AbstractC0603q2 abstractC0603q2, int i10) {
        super(abstractC0603q2);
        this.f13760b = i10;
        this.f13761c = abstractC0530c;
    }

    @Override // j$.util.stream.AbstractC0598p2, j$.util.stream.AbstractC0603q2
    public final void d(long j10) {
        switch (this.f13760b) {
            case 0:
                this.f13733a.c(j10);
                return;
            case 1:
                this.f13733a.d(((j$.util.function.C) ((B) this.f13761c).f13416v).q(j10));
                return;
            case 2:
                this.f13733a.h(((j$.util.function.y) ((C0635z) this.f13761c).f13839v).p(j10));
                return;
            case 3:
                this.f13733a.accept(((C0500b) ((j$.util.function.B) ((A) this.f13761c).f13398v)).n(j10));
                return;
            case 4:
                this.f13733a.c(((C0500b) ((j$.util.function.A) ((C0631y) this.f13761c).f13831v)).d(j10));
                return;
            case 5:
                AbstractC0616u0 abstractC0616u0 = (AbstractC0616u0) ((j$.util.function.y) ((B) this.f13761c).f13416v).p(j10);
                if (abstractC0616u0 != null) {
                    try {
                        abstractC0616u0.sequential().d(new C0586n0(this, 1));
                    } catch (Throwable th2) {
                        try {
                            ((AbstractC0530c) abstractC0616u0).close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                if (abstractC0616u0 == null) {
                    return;
                }
                ((AbstractC0530c) abstractC0616u0).close();
                return;
            case 6:
                if (!((C0500b) ((j$.util.function.z) ((B) this.f13761c).f13416v)).B(j10)) {
                    return;
                }
                this.f13733a.d(j10);
                return;
            default:
                ((j$.util.function.x) ((B) this.f13761c).f13416v).d(j10);
                this.f13733a.d(j10);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        switch (this.f13760b) {
            case 5:
                this.f13733a.u(-1L);
                return;
            case 6:
                this.f13733a.u(-1L);
                return;
            default:
                this.f13733a.u(j10);
                return;
        }
    }
}
