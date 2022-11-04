package j$.util.stream;

import j$.util.function.AbstractC0503e;
import j$.util.function.AbstractC0504f;
import j$.util.function.AbstractC0505g;
import j$.util.function.AbstractC0506h;
import j$.util.function.AbstractC0507i;
import j$.util.function.C0500b;
/* renamed from: j$.util.stream.x */
/* loaded from: classes2.dex */
final class C0627x extends AbstractC0568j2 {

    /* renamed from: b */
    public final /* synthetic */ int f13821b;

    /* renamed from: c */
    final /* synthetic */ Object f13822c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0627x(AbstractC0530c abstractC0530c, AbstractC0603q2 abstractC0603q2, int i10) {
        super(abstractC0603q2);
        this.f13821b = i10;
        this.f13822c = abstractC0530c;
    }

    @Override // j$.util.stream.AbstractC0588n2, j$.util.stream.AbstractC0603q2
    public final void c(double d10) {
        switch (this.f13821b) {
            case 0:
                this.f13708a.c(((C0500b) ((j$.util.function.j) ((C0631y) this.f13822c).f13831v)).a(d10));
                return;
            case 1:
                this.f13708a.h(((AbstractC0504f) ((C0635z) this.f13822c).f13839v).r(d10));
                return;
            case 2:
                this.f13708a.accept(((C0500b) ((AbstractC0506h) ((A) this.f13822c).f13398v)).h(d10));
                return;
            case 3:
                this.f13708a.d(((AbstractC0507i) ((B) this.f13822c).f13416v).k(d10));
                return;
            case 4:
                I i10 = (I) ((AbstractC0504f) ((C0631y) this.f13822c).f13831v).r(d10);
                if (i10 != null) {
                    try {
                        i10.sequential().h(new C0623w(this, 1));
                    } catch (Throwable th2) {
                        try {
                            ((AbstractC0530c) i10).close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                if (i10 == null) {
                    return;
                }
                ((AbstractC0530c) i10).close();
                return;
            case 5:
                if (!((C0500b) ((AbstractC0505g) ((C0631y) this.f13822c).f13831v)).z(d10)) {
                    return;
                }
                this.f13708a.c(d10);
                return;
            default:
                ((AbstractC0503e) ((C0631y) this.f13822c).f13831v).c(d10);
                this.f13708a.c(d10);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        switch (this.f13821b) {
            case 4:
                this.f13708a.u(-1L);
                return;
            case 5:
                this.f13708a.u(-1L);
                return;
            default:
                this.f13708a.u(j10);
                return;
        }
    }
}
