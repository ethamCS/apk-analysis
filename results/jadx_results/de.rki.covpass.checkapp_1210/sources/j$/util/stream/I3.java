package j$.util.stream;

import j$.util.function.Consumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class I3 implements AbstractC0603q2 {

    /* renamed from: a */
    public final /* synthetic */ int f13470a;

    /* renamed from: b */
    public final /* synthetic */ Object f13471b;

    public /* synthetic */ I3(Object obj, int i10) {
        this.f13470a = i10;
        this.f13471b = obj;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void accept(int i10) {
        switch (this.f13470a) {
            case 0:
                D0.P();
                throw null;
            default:
                D0.P();
                throw null;
        }
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void c(double d10) {
        switch (this.f13470a) {
            case 0:
                D0.I();
                throw null;
            default:
                D0.I();
                throw null;
        }
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void d(long j10) {
        switch (this.f13470a) {
            case 0:
                D0.Q();
                throw null;
            default:
                D0.Q();
                throw null;
        }
    }

    @Override // j$.util.function.Consumer
    public final void h(Object obj) {
        switch (this.f13470a) {
            case 0:
                ((Consumer) this.f13471b).h(obj);
                return;
            default:
                ((C0524a3) this.f13471b).h(obj);
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
}
