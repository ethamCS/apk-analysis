package j$.util.stream;

import j$.util.AbstractC0516o;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s3 extends AbstractC0549f3 implements j$.util.D {
    s3(D0 d02, Spliterator spliterator, boolean z10) {
        super(d02, spliterator, z10);
    }

    public s3(D0 d02, j$.util.function.I i10, boolean z10) {
        super(d02, i10, z10);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b(Consumer consumer) {
        return AbstractC0516o.o(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC0516o.d(this, consumer);
    }

    @Override // j$.util.D
    /* renamed from: g */
    public final void forEachRemaining(j$.util.function.x xVar) {
        if (this.f13699h != null || this.f13700i) {
            do {
            } while (tryAdvance(xVar));
            return;
        }
        Objects.requireNonNull(xVar);
        d();
        this.f13693b.U0(new r3(xVar, 0), this.f13695d);
        this.f13700i = true;
    }

    @Override // j$.util.stream.AbstractC0549f3
    final void h() {
        X2 x22 = new X2();
        this.f13699h = x22;
        this.f13696e = this.f13693b.V0(new r3(x22, 1));
        this.f13697f = new C0525b(this, 6);
    }

    @Override // j$.util.D
    /* renamed from: i */
    public final boolean tryAdvance(j$.util.function.x xVar) {
        Objects.requireNonNull(xVar);
        boolean a10 = a();
        if (a10) {
            X2 x22 = (X2) this.f13699h;
            long j10 = this.f13698g;
            int B = x22.B(j10);
            xVar.d((x22.f13677c == 0 && B == 0) ? ((long[]) x22.f13588e)[(int) j10] : ((long[][]) x22.f13589f)[B][(int) (j10 - x22.f13678d[B])]);
        }
        return a10;
    }

    @Override // j$.util.stream.AbstractC0549f3
    final AbstractC0549f3 l(Spliterator spliterator) {
        return new s3(this.f13693b, spliterator, this.f13692a);
    }

    @Override // j$.util.stream.AbstractC0549f3, j$.util.Spliterator
    public final j$.util.D trySplit() {
        return (j$.util.D) super.trySplit();
    }
}
