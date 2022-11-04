package j$.util.stream;

import java.util.Objects;
/* renamed from: j$.util.stream.l2 */
/* loaded from: classes2.dex */
public abstract class AbstractC0578l2 implements AbstractC0598p2 {

    /* renamed from: a */
    protected final AbstractC0603q2 f13733a;

    public AbstractC0578l2(AbstractC0603q2 abstractC0603q2) {
        Objects.requireNonNull(abstractC0603q2);
        this.f13733a = abstractC0603q2;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void accept(int i10) {
        D0.P();
        throw null;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void c(double d10) {
        D0.I();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        n((Long) obj);
    }

    @Override // j$.util.stream.AbstractC0598p2
    public final /* synthetic */ void n(Long l10) {
        D0.N(this, l10);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public void t() {
        this.f13733a.t();
    }

    @Override // j$.util.stream.AbstractC0603q2
    public boolean x() {
        return this.f13733a.x();
    }
}
