package j$.util.stream;

import j$.util.Spliterator;
/* loaded from: classes2.dex */
final class C0 extends AbstractC0535d {

    /* renamed from: j */
    private final B0 f13427j;

    public C0(B0 b02, D0 d02, Spliterator spliterator) {
        super(d02, spliterator);
        this.f13427j = b02;
    }

    C0(C0 c02, Spliterator spliterator) {
        super(c02, spliterator);
        this.f13427j = c02.f13427j;
    }

    @Override // j$.util.stream.AbstractC0545f
    public final Object a() {
        boolean z10;
        D0 d02 = this.f13685a;
        AbstractC0636z0 abstractC0636z0 = (AbstractC0636z0) this.f13427j.f13419c.get();
        d02.U0(abstractC0636z0, this.f13686b);
        boolean z11 = abstractC0636z0.f13841b;
        z10 = this.f13427j.f13418b.f13401b;
        if (z11 == z10) {
            l(Boolean.valueOf(z11));
            return null;
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0545f
    public final AbstractC0545f f(Spliterator spliterator) {
        return new C0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0535d
    protected final Object k() {
        boolean z10;
        z10 = this.f13427j.f13418b.f13401b;
        return Boolean.valueOf(!z10);
    }
}
