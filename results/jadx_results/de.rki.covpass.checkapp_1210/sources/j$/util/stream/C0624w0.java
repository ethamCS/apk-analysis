package j$.util.stream;

import j$.util.function.C0500b;
import j$.util.function.IntConsumer;
import java.util.Objects;
/* renamed from: j$.util.stream.w0 */
/* loaded from: classes2.dex */
final class C0624w0 extends AbstractC0636z0 implements AbstractC0593o2 {

    /* renamed from: c */
    final /* synthetic */ A0 f13815c;

    /* renamed from: d */
    final /* synthetic */ j$.util.function.r f13816d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0624w0(A0 a02, j$.util.function.r rVar) {
        super(a02);
        this.f13815c = a02;
        this.f13816d = rVar;
    }

    @Override // j$.util.stream.AbstractC0636z0, j$.util.stream.AbstractC0603q2
    public final void accept(int i10) {
        boolean z10;
        boolean z11;
        if (!this.f13840a) {
            boolean A = ((C0500b) this.f13816d).A(i10);
            z10 = this.f13815c.f13400a;
            if (A != z10) {
                return;
            }
            this.f13840a = true;
            z11 = this.f13815c.f13401b;
            this.f13841b = z11;
        }
    }

    @Override // j$.util.function.IntConsumer
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return Objects.requireNonNull(intConsumer);
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        v((Integer) obj);
    }

    @Override // j$.util.stream.AbstractC0593o2
    public final /* synthetic */ void v(Integer num) {
        D0.L(this, num);
    }
}
