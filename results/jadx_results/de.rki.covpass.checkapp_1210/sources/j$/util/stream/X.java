package j$.util.stream;
/* loaded from: classes2.dex */
public final class X extends Z implements AbstractC0598p2 {

    /* renamed from: b */
    final j$.util.function.x f13575b;

    public X(j$.util.function.x xVar, boolean z10) {
        super(z10);
        this.f13575b = xVar;
    }

    @Override // j$.util.stream.Z, j$.util.stream.AbstractC0603q2
    public final void d(long j10) {
        this.f13575b.d(j10);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        n((Long) obj);
    }

    @Override // j$.util.stream.AbstractC0598p2
    public final /* synthetic */ void n(Long l10) {
        D0.N(this, l10);
    }
}
