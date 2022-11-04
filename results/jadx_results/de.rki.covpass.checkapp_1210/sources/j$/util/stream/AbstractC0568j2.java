package j$.util.stream;

import java.util.Objects;
/* renamed from: j$.util.stream.j2 */
/* loaded from: classes2.dex */
public abstract class AbstractC0568j2 implements AbstractC0588n2 {

    /* renamed from: a */
    protected final AbstractC0603q2 f13708a;

    public AbstractC0568j2(AbstractC0603q2 abstractC0603q2) {
        Objects.requireNonNull(abstractC0603q2);
        this.f13708a = abstractC0603q2;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void accept(int i10) {
        D0.P();
        throw null;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void d(long j10) {
        D0.Q();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        y((Double) obj);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public void t() {
        this.f13708a.t();
    }

    @Override // j$.util.stream.AbstractC0603q2
    public boolean x() {
        return this.f13708a.x();
    }

    @Override // j$.util.stream.AbstractC0588n2
    public final /* synthetic */ void y(Double d10) {
        D0.J(this, d10);
    }
}
