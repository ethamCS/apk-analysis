package j$.util.stream;

import j$.util.function.IntConsumer;
import java.util.Objects;
/* renamed from: j$.util.stream.k2 */
/* loaded from: classes2.dex */
public abstract class AbstractC0573k2 implements AbstractC0593o2 {

    /* renamed from: a */
    protected final AbstractC0603q2 f13716a;

    public AbstractC0573k2(AbstractC0603q2 abstractC0603q2) {
        Objects.requireNonNull(abstractC0603q2);
        this.f13716a = abstractC0603q2;
    }

    @Override // j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return Objects.requireNonNull(intConsumer);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void c(double d10) {
        D0.I();
        throw null;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void d(long j10) {
        D0.Q();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        v((Integer) obj);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public void t() {
        this.f13716a.t();
    }

    @Override // j$.util.stream.AbstractC0593o2
    public final /* synthetic */ void v(Integer num) {
        D0.L(this, num);
    }

    @Override // j$.util.stream.AbstractC0603q2
    public boolean x() {
        return this.f13716a.x();
    }
}
