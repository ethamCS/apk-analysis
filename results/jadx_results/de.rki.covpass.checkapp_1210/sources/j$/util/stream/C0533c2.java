package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
/* renamed from: j$.util.stream.c2 */
/* loaded from: classes2.dex */
final class C0533c2 extends AbstractC0583m2 {

    /* renamed from: b */
    public final /* synthetic */ int f13646b;

    /* renamed from: c */
    final /* synthetic */ Object f13647c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0533c2(AbstractC0530c abstractC0530c, AbstractC0603q2 abstractC0603q2, int i10) {
        super(abstractC0603q2);
        this.f13646b = i10;
        this.f13647c = abstractC0530c;
    }

    @Override // j$.util.function.Consumer
    public final void h(Object obj) {
        switch (this.f13646b) {
            case 0:
                ((Consumer) ((C0635z) this.f13647c).f13839v).h(obj);
                this.f13746a.h(obj);
                return;
            case 1:
                if (!((Predicate) ((C0635z) this.f13647c).f13839v).test(obj)) {
                    return;
                }
                this.f13746a.h(obj);
                return;
            case 2:
                this.f13746a.h(((C0543e2) this.f13647c).f13682v.apply(obj));
                return;
            case 3:
                this.f13746a.accept(((ToIntFunction) ((A) this.f13647c).f13398v).applyAsInt(obj));
                return;
            case 4:
                this.f13746a.d(((ToLongFunction) ((B) this.f13647c).f13416v).applyAsLong(obj));
                return;
            case 5:
                this.f13746a.c(((ToDoubleFunction) ((C0631y) this.f13647c).f13831v).m(obj));
                return;
            default:
                Stream stream = (Stream) ((C0543e2) this.f13647c).f13682v.apply(obj);
                if (stream != null) {
                    try {
                        ((Stream) stream.sequential()).forEach(this.f13746a);
                    } catch (Throwable th2) {
                        try {
                            stream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                if (stream == null) {
                    return;
                }
                stream.close();
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        switch (this.f13646b) {
            case 1:
                this.f13746a.u(-1L);
                return;
            case 6:
                this.f13746a.u(-1L);
                return;
            default:
                this.f13746a.u(j10);
                return;
        }
    }
}
