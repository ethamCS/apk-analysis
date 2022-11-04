package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntConsumer;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class q3 extends AbstractC0549f3 implements j$.util.B {
    q3(D0 d02, Spliterator spliterator, boolean z10) {
        super(d02, spliterator, z10);
    }

    public q3(D0 d02, j$.util.function.I i10, boolean z10) {
        super(d02, i10, z10);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.n(this, consumer);
    }

    @Override // j$.util.B
    /* renamed from: e */
    public final boolean tryAdvance(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        boolean a10 = a();
        if (a10) {
            V2 v22 = (V2) this.f13699h;
            long j10 = this.f13698g;
            int B = v22.B(j10);
            intConsumer.accept((v22.f13677c == 0 && B == 0) ? ((int[]) v22.f13588e)[(int) j10] : ((int[][]) v22.f13589f)[B][(int) (j10 - v22.f13678d[B])]);
        }
        return a10;
    }

    @Override // j$.util.B
    /* renamed from: f */
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f13699h != null || this.f13700i) {
            do {
            } while (tryAdvance(intConsumer));
            return;
        }
        Objects.requireNonNull(intConsumer);
        d();
        this.f13693b.U0(new C0599p3(intConsumer, 0), this.f13695d);
        this.f13700i = true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.c(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0549f3
    final void h() {
        V2 v22 = new V2();
        this.f13699h = v22;
        this.f13696e = this.f13693b.V0(new C0599p3(v22, 1));
        this.f13697f = new C0525b(this, 5);
    }

    @Override // j$.util.stream.AbstractC0549f3
    final AbstractC0549f3 l(Spliterator spliterator) {
        return new q3(this.f13693b, spliterator, this.f13692a);
    }

    @Override // j$.util.stream.AbstractC0549f3, j$.util.Spliterator
    public final j$.util.B trySplit() {
        return (j$.util.B) super.trySplit();
    }
}
