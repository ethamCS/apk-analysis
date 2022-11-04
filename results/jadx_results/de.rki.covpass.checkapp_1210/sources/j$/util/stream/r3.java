package j$.util.stream;
/* loaded from: classes2.dex */
public final /* synthetic */ class r3 implements AbstractC0598p2 {

    /* renamed from: a */
    public final /* synthetic */ int f13778a;

    /* renamed from: b */
    public final /* synthetic */ Object f13779b;

    public /* synthetic */ r3(Object obj, int i10) {
        this.f13778a = i10;
        this.f13779b = obj;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void accept(int i10) {
        switch (this.f13778a) {
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
        switch (this.f13778a) {
            case 0:
                D0.I();
                throw null;
            default:
                D0.I();
                throw null;
        }
    }

    @Override // j$.util.stream.AbstractC0598p2, j$.util.stream.AbstractC0603q2
    public final void d(long j10) {
        switch (this.f13778a) {
            case 0:
                ((j$.util.function.x) this.f13779b).d(j10);
                return;
            default:
                ((X2) this.f13779b).d(j10);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        switch (this.f13778a) {
            case 0:
                n((Long) obj);
                return;
            default:
                n((Long) obj);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0598p2
    public final /* synthetic */ void n(Long l10) {
        switch (this.f13778a) {
            case 0:
                D0.N(this, l10);
                return;
            default:
                D0.N(this, l10);
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
