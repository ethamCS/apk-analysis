package j$.util.stream;
/* loaded from: classes2.dex */
abstract class T implements N3 {

    /* renamed from: a */
    boolean f13552a;

    /* renamed from: b */
    Object f13553b;

    @Override // j$.util.stream.AbstractC0603q2
    public /* synthetic */ void accept(int i10) {
        D0.P();
        throw null;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public /* synthetic */ void c(double d10) {
        D0.I();
        throw null;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public /* synthetic */ void d(long j10) {
        D0.Q();
        throw null;
    }

    @Override // j$.util.function.Consumer
    /* renamed from: h */
    public final void y(Object obj) {
        if (!this.f13552a) {
            this.f13552a = true;
            this.f13553b = obj;
        }
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void t() {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void u(long j10) {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final boolean x() {
        return this.f13552a;
    }
}
