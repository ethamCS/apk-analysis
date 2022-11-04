package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.Spliterator;
import j$.util.function.AbstractC0503e;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
final class C3 extends F3 implements j$.util.z, AbstractC0503e {

    /* renamed from: e */
    double f13429e;

    public C3(j$.util.z zVar, long j10, long j11) {
        super(zVar, j10, j11);
    }

    C3(j$.util.z zVar, C3 c32) {
        super(zVar, c32);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.m(this, consumer);
    }

    @Override // j$.util.function.AbstractC0503e
    public final void c(double d10) {
        this.f13429e = d10;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.a(this, consumer);
    }

    @Override // j$.util.stream.H3
    protected final Spliterator o(Spliterator spliterator) {
        return new C3((j$.util.z) spliterator, this);
    }

    @Override // j$.util.stream.F3
    protected final void q(Object obj) {
        ((AbstractC0503e) obj).c(this.f13429e);
    }

    @Override // j$.util.stream.F3
    protected final AbstractC0569j3 r() {
        return new C0554g3();
    }
}
