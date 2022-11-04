package j$.util.stream;

import j$.util.Spliterator;
/* renamed from: j$.util.stream.y2 */
/* loaded from: classes2.dex */
public final class C0634y2 extends E {

    /* renamed from: w */
    public static final /* synthetic */ int f13835w = 0;

    /* renamed from: u */
    final /* synthetic */ long f13836u;

    /* renamed from: v */
    final /* synthetic */ long f13837v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0634y2(AbstractC0530c abstractC0530c, int i10, int i11, long j10, long j11) {
        super(abstractC0530c, i11);
        this.f13836u = j10;
        this.f13837v = j11;
    }

    @Override // j$.util.stream.AbstractC0530c
    final P0 e1(D0 d02, Spliterator spliterator, j$.util.function.q qVar) {
        long x02 = d02.x0(spliterator);
        if (x02 > 0 && spliterator.hasCharacteristics(16384)) {
            return D0.n0(d02, D0.g0(d02.D0(), spliterator, this.f13836u, this.f13837v), true);
        }
        return !EnumC0539d3.ORDERED.h(d02.E0()) ? D0.n0(this, s1((j$.util.z) d02.W0(spliterator), this.f13836u, this.f13837v, x02), true) : (P0) new A2(this, d02, spliterator, qVar, this.f13836u, this.f13837v).invoke();
    }

    @Override // j$.util.stream.AbstractC0530c
    final Spliterator f1(D0 d02, Spliterator spliterator) {
        long x02 = d02.x0(spliterator);
        if (x02 > 0 && spliterator.hasCharacteristics(16384)) {
            long j10 = this.f13836u;
            return new u3((j$.util.z) d02.W0(spliterator), j10, D0.f0(j10, this.f13837v));
        }
        return !EnumC0539d3.ORDERED.h(d02.E0()) ? s1((j$.util.z) d02.W0(spliterator), this.f13836u, this.f13837v, x02) : ((P0) new A2(this, d02, spliterator, C0531c0.f13645b, this.f13836u, this.f13837v).invoke()).mo21spliterator();
    }

    @Override // j$.util.stream.AbstractC0530c
    public final AbstractC0603q2 h1(int i10, AbstractC0603q2 abstractC0603q2) {
        return new C0630x2(this, abstractC0603q2);
    }

    final j$.util.z s1(j$.util.z zVar, long j10, long j11, long j12) {
        long j13;
        long j14 = 0;
        if (j10 <= j12) {
            j13 = j11 >= 0 ? Math.min(j11, j12 - j10) : j12 - j10;
        } else {
            j14 = j10;
            j13 = j11;
        }
        return new C3(zVar, j14, j13);
    }
}
