package j$.util.stream;

import j$.util.function.C0500b;
import j$.util.function.IntConsumer;
/* renamed from: j$.util.stream.e0 */
/* loaded from: classes2.dex */
final class C0541e0 extends AbstractC0573k2 {

    /* renamed from: b */
    public final /* synthetic */ int f13679b;

    /* renamed from: c */
    final /* synthetic */ Object f13680c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0541e0(AbstractC0530c abstractC0530c, AbstractC0603q2 abstractC0603q2, int i10) {
        super(abstractC0603q2);
        this.f13679b = i10;
        this.f13680c = abstractC0530c;
    }

    @Override // j$.util.stream.AbstractC0593o2, j$.util.stream.AbstractC0603q2
    public final void accept(int i10) {
        switch (this.f13679b) {
            case 0:
                this.f13716a.d(i10);
                return;
            case 1:
                ((IntConsumer) ((A) this.f13680c).f13398v).accept(i10);
                this.f13716a.accept(i10);
                return;
            case 2:
                this.f13716a.c(i10);
                return;
            case 3:
                this.f13716a.accept(((C0500b) ((j$.util.function.u) ((A) this.f13680c).f13398v)).m(i10));
                return;
            case 4:
                this.f13716a.h(((j$.util.function.q) ((C0635z) this.f13680c).f13839v).o(i10));
                return;
            case 5:
                this.f13716a.d(((j$.util.function.t) ((B) this.f13680c).f13416v).s(i10));
                return;
            case 6:
                this.f13716a.c(((C0500b) ((j$.util.function.s) ((C0631y) this.f13680c).f13831v)).c(i10));
                return;
            case 7:
                IntStream intStream = (IntStream) ((j$.util.function.q) ((A) this.f13680c).f13398v).o(i10);
                if (intStream != null) {
                    try {
                        intStream.sequential().forEach(new C0536d0(this, 1));
                    } catch (Throwable th2) {
                        try {
                            intStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                if (intStream == null) {
                    return;
                }
                intStream.close();
                return;
            default:
                if (!((C0500b) ((j$.util.function.r) ((A) this.f13680c).f13398v)).A(i10)) {
                    return;
                }
                this.f13716a.accept(i10);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        switch (this.f13679b) {
            case 7:
                this.f13716a.u(-1L);
                return;
            case 8:
                this.f13716a.u(-1L);
                return;
            default:
                this.f13716a.u(j10);
                return;
        }
    }
}
