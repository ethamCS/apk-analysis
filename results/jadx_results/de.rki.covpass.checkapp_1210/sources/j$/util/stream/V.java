package j$.util.stream;

import j$.util.function.AbstractC0503e;
/* loaded from: classes2.dex */
public final class V extends Z implements AbstractC0588n2 {

    /* renamed from: b */
    final AbstractC0503e f13564b;

    public V(AbstractC0503e abstractC0503e, boolean z10) {
        super(z10);
        this.f13564b = abstractC0503e;
    }

    @Override // j$.util.stream.Z, j$.util.stream.AbstractC0603q2
    public final void c(double d10) {
        this.f13564b.c(d10);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        y((Double) obj);
    }

    @Override // j$.util.stream.AbstractC0588n2
    public final /* synthetic */ void y(Double d10) {
        D0.J(this, d10);
    }
}
