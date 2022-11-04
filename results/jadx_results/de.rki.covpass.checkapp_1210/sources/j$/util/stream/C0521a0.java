package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.a0 */
/* loaded from: classes2.dex */
public final class C0521a0 extends CountedCompleter {

    /* renamed from: h */
    public static final /* synthetic */ int f13611h = 0;

    /* renamed from: a */
    private final D0 f13612a;

    /* renamed from: b */
    private Spliterator f13613b;

    /* renamed from: c */
    private final long f13614c;

    /* renamed from: d */
    private final ConcurrentHashMap f13615d;

    /* renamed from: e */
    private final AbstractC0603q2 f13616e;

    /* renamed from: f */
    private final C0521a0 f13617f;

    /* renamed from: g */
    private P0 f13618g;

    public C0521a0(D0 d02, Spliterator spliterator, AbstractC0603q2 abstractC0603q2) {
        super(null);
        this.f13612a = d02;
        this.f13613b = spliterator;
        this.f13614c = AbstractC0545f.h(spliterator.estimateSize());
        this.f13615d = new ConcurrentHashMap(Math.max(16, AbstractC0545f.f13684g << 1));
        this.f13616e = abstractC0603q2;
        this.f13617f = null;
    }

    C0521a0(C0521a0 c0521a0, Spliterator spliterator, C0521a0 c0521a02) {
        super(c0521a0);
        this.f13612a = c0521a0.f13612a;
        this.f13613b = spliterator;
        this.f13614c = c0521a0.f13614c;
        this.f13615d = c0521a0.f13615d;
        this.f13616e = c0521a0.f13616e;
        this.f13617f = c0521a02;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f13613b;
        long j10 = this.f13614c;
        boolean z10 = false;
        C0521a0 c0521a0 = this;
        while (spliterator.estimateSize() > j10 && (trySplit = spliterator.trySplit()) != null) {
            C0521a0 c0521a02 = new C0521a0(c0521a0, trySplit, c0521a0.f13617f);
            C0521a0 c0521a03 = new C0521a0(c0521a0, spliterator, c0521a02);
            c0521a0.addToPendingCount(1);
            c0521a03.addToPendingCount(1);
            c0521a0.f13615d.put(c0521a02, c0521a03);
            if (c0521a0.f13617f != null) {
                c0521a02.addToPendingCount(1);
                if (c0521a0.f13615d.replace(c0521a0.f13617f, c0521a0, c0521a02)) {
                    c0521a0.addToPendingCount(-1);
                } else {
                    c0521a02.addToPendingCount(-1);
                }
            }
            if (z10) {
                spliterator = trySplit;
                c0521a0 = c0521a02;
                c0521a02 = c0521a03;
            } else {
                c0521a0 = c0521a03;
            }
            z10 = !z10;
            c0521a02.fork();
        }
        if (c0521a0.getPendingCount() > 0) {
            C0580m c0580m = C0580m.f13739e;
            D0 d02 = c0521a0.f13612a;
            H0 P0 = d02.P0(d02.x0(spliterator), c0580m);
            c0521a0.f13612a.U0(P0, spliterator);
            c0521a0.f13618g = P0.mo22a();
            c0521a0.f13613b = null;
        }
        c0521a0.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        P0 p02 = this.f13618g;
        if (p02 != null) {
            p02.forEach(this.f13616e);
            this.f13618g = null;
        } else {
            Spliterator spliterator = this.f13613b;
            if (spliterator != null) {
                this.f13612a.U0(this.f13616e, spliterator);
                this.f13613b = null;
            }
        }
        C0521a0 c0521a0 = (C0521a0) this.f13615d.remove(this);
        if (c0521a0 != null) {
            c0521a0.tryComplete();
        }
    }
}
