package j$.util.stream;

import j$.util.function.IntConsumer;
import java.util.Objects;
/* renamed from: j$.util.stream.p3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0599p3 implements AbstractC0593o2 {

    /* renamed from: a */
    public final /* synthetic */ int f13768a;

    /* renamed from: b */
    public final /* synthetic */ Object f13769b;

    public /* synthetic */ C0599p3(Object obj, int i10) {
        this.f13768a = i10;
        this.f13769b = obj;
    }

    @Override // j$.util.stream.AbstractC0593o2, j$.util.stream.AbstractC0603q2
    public final void accept(int i10) {
        switch (this.f13768a) {
            case 0:
                ((IntConsumer) this.f13769b).accept(i10);
                return;
            default:
                ((V2) this.f13769b).accept(i10);
                return;
        }
    }

    @Override // j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f13768a) {
            case 0:
                return Objects.requireNonNull(intConsumer);
            default:
                return Objects.requireNonNull(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void c(double d10) {
        switch (this.f13768a) {
            case 0:
                D0.I();
                throw null;
            default:
                D0.I();
                throw null;
        }
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void d(long j10) {
        switch (this.f13768a) {
            case 0:
                D0.Q();
                throw null;
            default:
                D0.Q();
                throw null;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        switch (this.f13768a) {
            case 0:
                v((Integer) obj);
                return;
            default:
                v((Integer) obj);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void t() {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void u(long j10) {
    }

    @Override // j$.util.stream.AbstractC0593o2
    public final /* synthetic */ void v(Integer num) {
        switch (this.f13768a) {
            case 0:
                D0.L(this, num);
                return;
            default:
                D0.L(this, num);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ boolean x() {
        return false;
    }
}
