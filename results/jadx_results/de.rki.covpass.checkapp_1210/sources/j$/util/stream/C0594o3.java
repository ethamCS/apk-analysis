package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.Spliterator;
import j$.util.function.AbstractC0503e;
import j$.util.function.Consumer;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.o3 */
/* loaded from: classes2.dex */
public final class C0594o3 extends AbstractC0549f3 implements j$.util.z {
    C0594o3(D0 d02, Spliterator spliterator, boolean z10) {
        super(d02, spliterator, z10);
    }

    public C0594o3(D0 d02, j$.util.function.I i10, boolean z10) {
        super(d02, i10, z10);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.m(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.a(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0549f3
    final void h() {
        T2 t22 = new T2();
        this.f13699h = t22;
        this.f13696e = this.f13693b.V0(new C0589n3(t22, 1));
        this.f13697f = new C0525b(this, 4);
    }

    @Override // j$.util.z
    /* renamed from: j */
    public final boolean tryAdvance(AbstractC0503e abstractC0503e) {
        Objects.requireNonNull(abstractC0503e);
        boolean a10 = a();
        if (a10) {
            T2 t22 = (T2) this.f13699h;
            long j10 = this.f13698g;
            int B = t22.B(j10);
            abstractC0503e.c((t22.f13677c == 0 && B == 0) ? ((double[]) t22.f13588e)[(int) j10] : ((double[][]) t22.f13589f)[B][(int) (j10 - t22.f13678d[B])]);
        }
        return a10;
    }

    @Override // j$.util.z
    /* renamed from: k */
    public final void forEachRemaining(AbstractC0503e abstractC0503e) {
        if (this.f13699h != null || this.f13700i) {
            do {
            } while (tryAdvance(abstractC0503e));
            return;
        }
        Objects.requireNonNull(abstractC0503e);
        d();
        this.f13693b.U0(new C0589n3(abstractC0503e, 0), this.f13695d);
        this.f13700i = true;
    }

    @Override // j$.util.stream.AbstractC0549f3
    final AbstractC0549f3 l(Spliterator spliterator) {
        return new C0594o3(this.f13693b, spliterator, this.f13692a);
    }

    @Override // j$.util.stream.AbstractC0549f3, j$.util.Spliterator
    public final j$.util.z trySplit() {
        return (j$.util.z) super.trySplit();
    }
}
