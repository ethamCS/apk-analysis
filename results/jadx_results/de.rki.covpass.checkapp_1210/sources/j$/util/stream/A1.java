package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
/* loaded from: classes2.dex */
public abstract class A1 extends CountedCompleter implements AbstractC0603q2 {

    /* renamed from: a */
    protected final Spliterator f13402a;

    /* renamed from: b */
    protected final D0 f13403b;

    /* renamed from: c */
    protected final long f13404c;

    /* renamed from: d */
    protected long f13405d;

    /* renamed from: e */
    protected long f13406e;

    /* renamed from: f */
    protected int f13407f;

    /* renamed from: g */
    protected int f13408g;

    public A1(Spliterator spliterator, D0 d02, int i10) {
        this.f13402a = spliterator;
        this.f13403b = d02;
        this.f13404c = AbstractC0545f.h(spliterator.estimateSize());
        this.f13405d = 0L;
        this.f13406e = i10;
    }

    public A1(A1 a12, Spliterator spliterator, long j10, long j11, int i10) {
        super(a12);
        this.f13402a = spliterator;
        this.f13403b = a12.f13403b;
        this.f13404c = a12.f13404c;
        this.f13405d = j10;
        this.f13406e = j11;
        if (j10 < 0 || j11 < 0 || (j10 + j11) - 1 >= i10) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j10), Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10)));
        }
    }

    @Override // j$.util.stream.AbstractC0603q2
    public /* synthetic */ void accept(int i10) {
        D0.P();
        throw null;
    }

    abstract A1 b(Spliterator spliterator, long j10, long j11);

    @Override // j$.util.stream.AbstractC0603q2
    public /* synthetic */ void c(double d10) {
        D0.I();
        throw null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f13402a;
        A1 a12 = this;
        while (spliterator.estimateSize() > a12.f13404c && (trySplit = spliterator.trySplit()) != null) {
            a12.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            a12.b(trySplit, a12.f13405d, estimateSize).fork();
            a12 = a12.b(spliterator, a12.f13405d + estimateSize, a12.f13406e - estimateSize);
        }
        a12.f13403b.U0(a12, spliterator);
        a12.propagateCompletion();
    }

    @Override // j$.util.stream.AbstractC0603q2
    public /* synthetic */ void d(long j10) {
        D0.Q();
        throw null;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ void t() {
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        long j11 = this.f13406e;
        if (j10 <= j11) {
            int i10 = (int) this.f13405d;
            this.f13407f = i10;
            this.f13408g = i10 + ((int) j11);
            return;
        }
        throw new IllegalStateException("size passed to Sink.begin exceeds array length");
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final /* synthetic */ boolean x() {
        return false;
    }
}
