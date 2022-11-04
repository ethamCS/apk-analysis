package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;
/* renamed from: j$.util.stream.f */
/* loaded from: classes2.dex */
public abstract class AbstractC0545f extends CountedCompleter {

    /* renamed from: g */
    static final int f13684g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a */
    protected final D0 f13685a;

    /* renamed from: b */
    protected Spliterator f13686b;

    /* renamed from: c */
    protected long f13687c;

    /* renamed from: d */
    protected AbstractC0545f f13688d;

    /* renamed from: e */
    protected AbstractC0545f f13689e;

    /* renamed from: f */
    private Object f13690f;

    public AbstractC0545f(D0 d02, Spliterator spliterator) {
        super(null);
        this.f13685a = d02;
        this.f13686b = spliterator;
        this.f13687c = 0L;
    }

    public AbstractC0545f(AbstractC0545f abstractC0545f, Spliterator spliterator) {
        super(abstractC0545f);
        this.f13686b = spliterator;
        this.f13685a = abstractC0545f.f13685a;
        this.f13687c = abstractC0545f.f13687c;
    }

    public static long h(long j10) {
        long j11 = j10 / f13684g;
        if (j11 > 0) {
            return j11;
        }
        return 1L;
    }

    public abstract Object a();

    public Object b() {
        return this.f13690f;
    }

    public final AbstractC0545f c() {
        return (AbstractC0545f) getCompleter();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f13686b;
        long estimateSize = spliterator.estimateSize();
        long j10 = this.f13687c;
        if (j10 == 0) {
            j10 = h(estimateSize);
            this.f13687c = j10;
        }
        boolean z10 = false;
        AbstractC0545f abstractC0545f = this;
        while (estimateSize > j10 && (trySplit = spliterator.trySplit()) != null) {
            AbstractC0545f f10 = abstractC0545f.f(trySplit);
            abstractC0545f.f13688d = f10;
            AbstractC0545f f11 = abstractC0545f.f(spliterator);
            abstractC0545f.f13689e = f11;
            abstractC0545f.setPendingCount(1);
            if (z10) {
                spliterator = trySplit;
                abstractC0545f = f10;
                f10 = f11;
            } else {
                abstractC0545f = f11;
            }
            z10 = !z10;
            f10.fork();
            estimateSize = spliterator.estimateSize();
        }
        abstractC0545f.g(abstractC0545f.a());
        abstractC0545f.tryComplete();
    }

    public final boolean d() {
        return this.f13688d == null;
    }

    public final boolean e() {
        return c() == null;
    }

    public abstract AbstractC0545f f(Spliterator spliterator);

    public void g(Object obj) {
        this.f13690f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f13690f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f13686b = null;
        this.f13689e = null;
        this.f13688d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj == null) {
            return;
        }
        throw new IllegalStateException();
    }
}
