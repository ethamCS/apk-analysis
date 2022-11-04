package j$.util.stream;

import j$.util.Spliterator;
/* loaded from: classes2.dex */
final class A2 extends AbstractC0535d {

    /* renamed from: j */
    private final AbstractC0530c f13409j;

    /* renamed from: k */
    private final j$.util.function.q f13410k;

    /* renamed from: l */
    private final long f13411l;

    /* renamed from: m */
    private final long f13412m;

    /* renamed from: n */
    private long f13413n;

    /* renamed from: o */
    private volatile boolean f13414o;

    A2(A2 a22, Spliterator spliterator) {
        super(a22, spliterator);
        this.f13409j = a22.f13409j;
        this.f13410k = a22.f13410k;
        this.f13411l = a22.f13411l;
        this.f13412m = a22.f13412m;
    }

    public A2(AbstractC0530c abstractC0530c, D0 d02, Spliterator spliterator, j$.util.function.q qVar, long j10, long j11) {
        super(d02, spliterator);
        this.f13409j = abstractC0530c;
        this.f13410k = qVar;
        this.f13411l = j10;
        this.f13412m = j11;
    }

    private long m(long j10) {
        if (this.f13414o) {
            return this.f13413n;
        }
        A2 a22 = (A2) this.f13688d;
        A2 a23 = (A2) this.f13689e;
        if (a22 == null || a23 == null) {
            return this.f13413n;
        }
        long m10 = a22.m(j10);
        return m10 >= j10 ? m10 : m10 + a23.m(j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0545f
    public final Object a() {
        long j10 = -1;
        if (e()) {
            if (EnumC0539d3.SIZED.i(this.f13409j.f13635j)) {
                j10 = this.f13409j.x0(this.f13686b);
            }
            H0 P0 = this.f13409j.P0(j10, this.f13410k);
            AbstractC0603q2 h12 = this.f13409j.h1(this.f13685a.E0(), P0);
            D0 d02 = this.f13685a;
            d02.s0(d02.V0(h12), this.f13686b);
            return P0.mo22a();
        }
        D0 d03 = this.f13685a;
        H0 P02 = d03.P0(-1L, this.f13410k);
        d03.U0(P02, this.f13686b);
        P0 mo22a = P02.mo22a();
        this.f13413n = mo22a.count();
        this.f13414o = true;
        this.f13686b = null;
        return mo22a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0545f
    public final AbstractC0545f f(Spliterator spliterator) {
        return new A2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0535d
    protected final void i() {
        this.f13650i = true;
        if (this.f13414o) {
            g(k());
        }
    }

    /* renamed from: n */
    public final P0 k() {
        return D0.v0(this.f13409j.b1());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    @Override // j$.util.stream.AbstractC0545f, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r13) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.A2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
