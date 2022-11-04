package j$.util.stream;

import j$.util.function.AbstractC0503e;
/* renamed from: j$.util.stream.n3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0589n3 implements AbstractC0588n2 {

    /* renamed from: a */
    public final /* synthetic */ int f13755a;

    /* renamed from: b */
    public final /* synthetic */ Object f13756b;

    public /* synthetic */ C0589n3(Object obj, int i10) {
        this.f13755a = i10;
        this.f13756b = obj;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void accept(int i10) {
        switch (this.f13755a) {
            case 0:
                D0.P();
                throw null;
            default:
                D0.P();
                throw null;
        }
    }

    @Override // j$.util.stream.AbstractC0588n2, j$.util.stream.AbstractC0603q2
    public final void c(double d10) {
        switch (this.f13755a) {
            case 0:
                ((AbstractC0503e) this.f13756b).c(d10);
                return;
            default:
                ((T2) this.f13756b).c(d10);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void d(long j10) {
        switch (this.f13755a) {
            case 0:
                D0.Q();
                throw null;
            default:
                D0.Q();
                throw null;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        switch (this.f13755a) {
            case 0:
                y((Double) obj);
                return;
            default:
                y((Double) obj);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void t() {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void u(long j10) {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // j$.util.stream.AbstractC0588n2
    public final /* synthetic */ void y(Double d10) {
        switch (this.f13755a) {
            case 0:
                D0.J(this, d10);
                return;
            default:
                D0.J(this, d10);
                return;
        }
    }
}
