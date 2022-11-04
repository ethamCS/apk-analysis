package j$.util.stream;

import j$.util.Spliterator;
import java.util.Objects;
/* renamed from: j$.util.stream.c */
/* loaded from: classes2.dex */
public abstract class AbstractC0530c extends D0 implements AbstractC0555h {

    /* renamed from: s */
    public static final /* synthetic */ int f13632s = 0;

    /* renamed from: h */
    private final AbstractC0530c f13633h;

    /* renamed from: i */
    private final AbstractC0530c f13634i;

    /* renamed from: j */
    protected final int f13635j;

    /* renamed from: k */
    private AbstractC0530c f13636k;

    /* renamed from: l */
    private int f13637l;

    /* renamed from: m */
    private int f13638m;

    /* renamed from: n */
    private Spliterator f13639n;

    /* renamed from: o */
    private boolean f13640o;

    /* renamed from: p */
    private boolean f13641p;

    /* renamed from: q */
    private Runnable f13642q;

    /* renamed from: r */
    private boolean f13643r;

    public AbstractC0530c(Spliterator spliterator, int i10, boolean z10) {
        this.f13634i = null;
        this.f13639n = spliterator;
        this.f13633h = this;
        int i11 = EnumC0539d3.f13654g & i10;
        this.f13635j = i11;
        this.f13638m = (~(i11 << 1)) & EnumC0539d3.f13659l;
        this.f13637l = 0;
        this.f13643r = z10;
    }

    public AbstractC0530c(AbstractC0530c abstractC0530c, int i10) {
        if (!abstractC0530c.f13640o) {
            abstractC0530c.f13640o = true;
            abstractC0530c.f13636k = this;
            this.f13634i = abstractC0530c;
            this.f13635j = EnumC0539d3.f13655h & i10;
            this.f13638m = EnumC0539d3.b(i10, abstractC0530c.f13638m);
            AbstractC0530c abstractC0530c2 = abstractC0530c.f13633h;
            this.f13633h = abstractC0530c2;
            if (g1()) {
                abstractC0530c2.f13641p = true;
            }
            this.f13637l = abstractC0530c.f13637l + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    private Spliterator i1(int i10) {
        int i11;
        int i12;
        AbstractC0530c abstractC0530c = this.f13633h;
        Spliterator spliterator = abstractC0530c.f13639n;
        if (spliterator != null) {
            abstractC0530c.f13639n = null;
            if (abstractC0530c.f13643r && abstractC0530c.f13641p) {
                AbstractC0530c abstractC0530c2 = abstractC0530c.f13636k;
                int i13 = 1;
                while (abstractC0530c != this) {
                    int i14 = abstractC0530c2.f13635j;
                    if (abstractC0530c2.g1()) {
                        i13 = 0;
                        if (EnumC0539d3.SHORT_CIRCUIT.h(i14)) {
                            i14 &= ~EnumC0539d3.f13668u;
                        }
                        spliterator = abstractC0530c2.f1(abstractC0530c, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i12 = i14 & (~EnumC0539d3.f13667t);
                            i11 = EnumC0539d3.f13666s;
                        } else {
                            i12 = i14 & (~EnumC0539d3.f13666s);
                            i11 = EnumC0539d3.f13667t;
                        }
                        i14 = i12 | i11;
                    }
                    abstractC0530c2.f13637l = i13;
                    abstractC0530c2.f13638m = EnumC0539d3.b(i14, abstractC0530c.f13638m);
                    i13++;
                    AbstractC0530c abstractC0530c3 = abstractC0530c2;
                    abstractC0530c2 = abstractC0530c2.f13636k;
                    abstractC0530c = abstractC0530c3;
                }
            }
            if (i10 != 0) {
                this.f13638m = EnumC0539d3.b(i10, this.f13638m);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.D0
    public final int D0() {
        AbstractC0530c abstractC0530c = this;
        while (abstractC0530c.f13637l > 0) {
            abstractC0530c = abstractC0530c.f13634i;
        }
        return abstractC0530c.b1();
    }

    @Override // j$.util.stream.D0
    public final int E0() {
        return this.f13638m;
    }

    @Override // j$.util.stream.D0
    public final AbstractC0603q2 U0(AbstractC0603q2 abstractC0603q2, Spliterator spliterator) {
        Objects.requireNonNull(abstractC0603q2);
        r0(V0(abstractC0603q2), spliterator);
        return abstractC0603q2;
    }

    @Override // j$.util.stream.D0
    public final AbstractC0603q2 V0(AbstractC0603q2 abstractC0603q2) {
        Objects.requireNonNull(abstractC0603q2);
        for (AbstractC0530c abstractC0530c = this; abstractC0530c.f13637l > 0; abstractC0530c = abstractC0530c.f13634i) {
            abstractC0603q2 = abstractC0530c.h1(abstractC0530c.f13634i.f13638m, abstractC0603q2);
        }
        return abstractC0603q2;
    }

    @Override // j$.util.stream.D0
    public final Spliterator W0(Spliterator spliterator) {
        return this.f13637l == 0 ? spliterator : k1(this, new C0525b(spliterator, 0), this.f13633h.f13643r);
    }

    public final Object X0(M3 m32) {
        if (!this.f13640o) {
            this.f13640o = true;
            return this.f13633h.f13643r ? m32.e(this, i1(m32.b())) : m32.f(this, i1(m32.b()));
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    public final P0 Y0(j$.util.function.q qVar) {
        if (!this.f13640o) {
            this.f13640o = true;
            if (!this.f13633h.f13643r || this.f13634i == null || !g1()) {
                return w0(i1(0), true, qVar);
            }
            this.f13637l = 0;
            AbstractC0530c abstractC0530c = this.f13634i;
            return e1(abstractC0530c, abstractC0530c.i1(0), qVar);
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    abstract P0 Z0(D0 d02, Spliterator spliterator, boolean z10, j$.util.function.q qVar);

    abstract void a1(Spliterator spliterator, AbstractC0603q2 abstractC0603q2);

    public abstract int b1();

    public final boolean c1() {
        return EnumC0539d3.ORDERED.h(this.f13638m);
    }

    @Override // j$.util.stream.AbstractC0555h, java.lang.AutoCloseable
    public final void close() {
        this.f13640o = true;
        this.f13639n = null;
        AbstractC0530c abstractC0530c = this.f13633h;
        Runnable runnable = abstractC0530c.f13642q;
        if (runnable != null) {
            abstractC0530c.f13642q = null;
            runnable.run();
        }
    }

    public final /* synthetic */ Spliterator d1() {
        return i1(0);
    }

    P0 e1(D0 d02, Spliterator spliterator, j$.util.function.q qVar) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator f1(D0 d02, Spliterator spliterator) {
        return e1(d02, spliterator, C0520a.f13590a).mo21spliterator();
    }

    abstract boolean g1();

    public abstract AbstractC0603q2 h1(int i10, AbstractC0603q2 abstractC0603q2);

    @Override // j$.util.stream.AbstractC0555h
    public final boolean isParallel() {
        return this.f13633h.f13643r;
    }

    public final Spliterator j1() {
        AbstractC0530c abstractC0530c = this.f13633h;
        if (this == abstractC0530c) {
            if (this.f13640o) {
                throw new IllegalStateException("stream has already been operated upon or closed");
            }
            this.f13640o = true;
            Spliterator spliterator = abstractC0530c.f13639n;
            if (spliterator == null) {
                throw new IllegalStateException("source already consumed or closed");
            }
            abstractC0530c.f13639n = null;
            return spliterator;
        }
        throw new IllegalStateException();
    }

    abstract Spliterator k1(D0 d02, j$.util.function.I i10, boolean z10);

    @Override // j$.util.stream.AbstractC0555h
    public final AbstractC0555h onClose(Runnable runnable) {
        AbstractC0530c abstractC0530c = this.f13633h;
        Runnable runnable2 = abstractC0530c.f13642q;
        if (runnable2 != null) {
            runnable = new K3(runnable2, runnable);
        }
        abstractC0530c.f13642q = runnable;
        return this;
    }

    public final AbstractC0555h parallel() {
        this.f13633h.f13643r = true;
        return this;
    }

    @Override // j$.util.stream.D0
    public final void r0(AbstractC0603q2 abstractC0603q2, Spliterator spliterator) {
        Objects.requireNonNull(abstractC0603q2);
        if (EnumC0539d3.SHORT_CIRCUIT.h(this.f13638m)) {
            s0(abstractC0603q2, spliterator);
            return;
        }
        abstractC0603q2.u(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(abstractC0603q2);
        abstractC0603q2.t();
    }

    @Override // j$.util.stream.D0
    public final void s0(AbstractC0603q2 abstractC0603q2, Spliterator spliterator) {
        AbstractC0530c abstractC0530c = this;
        while (abstractC0530c.f13637l > 0) {
            abstractC0530c = abstractC0530c.f13634i;
        }
        abstractC0603q2.u(spliterator.getExactSizeIfKnown());
        abstractC0530c.a1(spliterator, abstractC0603q2);
        abstractC0603q2.t();
    }

    public final AbstractC0555h sequential() {
        this.f13633h.f13643r = false;
        return this;
    }

    public Spliterator spliterator() {
        if (!this.f13640o) {
            this.f13640o = true;
            AbstractC0530c abstractC0530c = this.f13633h;
            if (this != abstractC0530c) {
                return k1(this, new C0525b(this, 1), abstractC0530c.f13643r);
            }
            Spliterator spliterator = abstractC0530c.f13639n;
            if (spliterator == null) {
                throw new IllegalStateException("source already consumed or closed");
            }
            abstractC0530c.f13639n = null;
            return spliterator;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    @Override // j$.util.stream.D0
    public final P0 w0(Spliterator spliterator, boolean z10, j$.util.function.q qVar) {
        if (this.f13633h.f13643r) {
            return Z0(this, spliterator, z10, qVar);
        }
        H0 P0 = P0(x0(spliterator), qVar);
        U0(P0, spliterator);
        return P0.mo22a();
    }

    @Override // j$.util.stream.D0
    public final long x0(Spliterator spliterator) {
        if (EnumC0539d3.SIZED.h(this.f13638m)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }
}
