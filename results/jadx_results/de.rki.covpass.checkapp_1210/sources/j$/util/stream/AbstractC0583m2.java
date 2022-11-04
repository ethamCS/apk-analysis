package j$.util.stream;

import java.util.Objects;
/* renamed from: j$.util.stream.m2 */
/* loaded from: classes2.dex */
public abstract class AbstractC0583m2 implements AbstractC0603q2 {

    /* renamed from: a */
    protected final AbstractC0603q2 f13746a;

    public AbstractC0583m2(AbstractC0603q2 abstractC0603q2) {
        Objects.requireNonNull(abstractC0603q2);
        this.f13746a = abstractC0603q2;
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

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void d(long j10) {
        D0.Q();
        throw null;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public void t() {
        this.f13746a.t();
    }

    @Override // j$.util.stream.AbstractC0603q2
    public boolean x() {
        return this.f13746a.x();
    }
}
