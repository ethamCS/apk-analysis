package j$.util.stream;

import j$.util.function.AbstractC0503e;
import j$.util.function.Function;
import j$.util.function.IntConsumer;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes2.dex */
final class r extends AbstractC0583m2 {

    /* renamed from: b */
    public final /* synthetic */ int f13772b = 2;

    /* renamed from: c */
    Object f13773c;

    /* renamed from: d */
    final /* synthetic */ Object f13774d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0607s c0607s, AbstractC0603q2 abstractC0603q2) {
        super(abstractC0603q2);
        this.f13774d = c0607s;
    }

    @Override // j$.util.function.Consumer
    public final void h(Object obj) {
        AbstractC0616u0 abstractC0616u0;
        switch (this.f13772b) {
            case 0:
                if (((Set) this.f13773c).contains(obj)) {
                    return;
                }
                ((Set) this.f13773c).add(obj);
                this.f13746a.h(obj);
                return;
            case 1:
                abstractC0616u0 = (AbstractC0616u0) ((Function) ((B) this.f13774d).f13416v).apply(obj);
                if (abstractC0616u0 != null) {
                    try {
                        abstractC0616u0.sequential().d((j$.util.function.x) this.f13773c);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (abstractC0616u0 == null) {
                    return;
                }
                ((AbstractC0530c) abstractC0616u0).close();
                return;
            case 2:
                IntStream intStream = (IntStream) ((Function) ((A) this.f13774d).f13398v).apply(obj);
                if (intStream != null) {
                    try {
                        intStream.sequential().forEach((IntConsumer) this.f13773c);
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (intStream == null) {
                    return;
                }
                intStream.close();
                return;
            default:
                abstractC0616u0 = (I) ((Function) ((C0631y) this.f13774d).f13831v).apply(obj);
                if (abstractC0616u0 != null) {
                    try {
                        abstractC0616u0.sequential().h((AbstractC0503e) this.f13773c);
                    } finally {
                        try {
                            ((AbstractC0530c) abstractC0616u0).close();
                        } catch (Throwable th5) {
                            th2.addSuppressed(th5);
                        }
                    }
                }
                if (abstractC0616u0 == null) {
                    return;
                }
                ((AbstractC0530c) abstractC0616u0).close();
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0583m2, j$.util.stream.AbstractC0603q2
    public final void t() {
        switch (this.f13772b) {
            case 0:
                this.f13773c = null;
                this.f13746a.t();
                return;
            default:
                super.t();
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        switch (this.f13772b) {
            case 0:
                this.f13773c = new HashSet();
                this.f13746a.u(-1L);
                return;
            case 1:
                this.f13746a.u(-1L);
                return;
            case 2:
                this.f13746a.u(-1L);
                return;
            default:
                this.f13746a.u(-1L);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0631y c0631y, AbstractC0603q2 abstractC0603q2) {
        super(abstractC0603q2);
        this.f13774d = c0631y;
        AbstractC0603q2 abstractC0603q22 = this.f13746a;
        Objects.requireNonNull(abstractC0603q22);
        this.f13773c = new C0623w(abstractC0603q22, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(A a10, AbstractC0603q2 abstractC0603q2) {
        super(abstractC0603q2);
        this.f13774d = a10;
        AbstractC0603q2 abstractC0603q22 = this.f13746a;
        Objects.requireNonNull(abstractC0603q22);
        this.f13773c = new C0536d0(abstractC0603q22, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(B b10, AbstractC0603q2 abstractC0603q2) {
        super(abstractC0603q2);
        this.f13774d = b10;
        AbstractC0603q2 abstractC0603q22 = this.f13746a;
        Objects.requireNonNull(abstractC0603q22);
        this.f13773c = new C0586n0(abstractC0603q22, 0);
    }
}
