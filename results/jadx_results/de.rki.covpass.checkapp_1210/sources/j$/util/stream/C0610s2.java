package j$.util.stream;

import j$.util.Spliterator;
/* renamed from: j$.util.stream.s2 */
/* loaded from: classes2.dex */
public final class C0610s2 extends AbstractC0553g2 {

    /* renamed from: u */
    final /* synthetic */ long f13786u;

    /* renamed from: v */
    final /* synthetic */ long f13787v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0610s2(AbstractC0530c abstractC0530c, int i10, int i11, long j10, long j11) {
        super(abstractC0530c, i11);
        this.f13786u = j10;
        this.f13787v = j11;
    }

    @Override // j$.util.stream.AbstractC0530c
    final P0 e1(D0 d02, Spliterator spliterator, j$.util.function.q qVar) {
        long x02 = d02.x0(spliterator);
        if (x02 > 0 && spliterator.hasCharacteristics(16384)) {
            return D0.m0(d02, D0.g0(d02.D0(), spliterator, this.f13786u, this.f13787v), true, qVar);
        }
        return !EnumC0539d3.ORDERED.h(d02.E0()) ? D0.m0(this, l1(d02.W0(spliterator), this.f13786u, this.f13787v, x02), true, qVar) : (P0) new A2(this, d02, spliterator, qVar, this.f13786u, this.f13787v).invoke();
    }

    @Override // j$.util.stream.AbstractC0530c
    final Spliterator f1(D0 d02, Spliterator spliterator) {
        long x02 = d02.x0(spliterator);
        if (x02 > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator W0 = d02.W0(spliterator);
            long j10 = this.f13786u;
            return new A3(W0, j10, D0.f0(j10, this.f13787v));
        }
        return !EnumC0539d3.ORDERED.h(d02.E0()) ? l1(d02.W0(spliterator), this.f13786u, this.f13787v, x02) : ((P0) new A2(this, d02, spliterator, K.f13479c, this.f13786u, this.f13787v).invoke()).mo21spliterator();
    }

    @Override // j$.util.stream.AbstractC0530c
    public final AbstractC0603q2 h1(int i10, AbstractC0603q2 abstractC0603q2) {
        return new C0606r2(this, abstractC0603q2);
    }

    final Spliterator l1(Spliterator spliterator, long j10, long j11, long j12) {
        long j13;
        long j14 = 0;
        if (j10 <= j12) {
            j13 = j11 >= 0 ? Math.min(j11, j12 - j10) : j12 - j10;
        } else {
            j14 = j10;
            j13 = j11;
        }
        return new G3(spliterator, j14, j13);
    }
}
