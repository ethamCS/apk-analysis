package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b0 */
/* loaded from: classes2.dex */
public final class C0526b0 extends CountedCompleter {

    /* renamed from: a */
    private Spliterator f13624a;

    /* renamed from: b */
    private final AbstractC0603q2 f13625b;

    /* renamed from: c */
    private final D0 f13626c;

    /* renamed from: d */
    private long f13627d;

    public C0526b0(D0 d02, Spliterator spliterator, AbstractC0603q2 abstractC0603q2) {
        super(null);
        this.f13625b = abstractC0603q2;
        this.f13626c = d02;
        this.f13624a = spliterator;
        this.f13627d = 0L;
    }

    C0526b0(C0526b0 c0526b0, Spliterator spliterator) {
        super(c0526b0);
        this.f13624a = spliterator;
        this.f13625b = c0526b0.f13625b;
        this.f13627d = c0526b0.f13627d;
        this.f13626c = c0526b0.f13626c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f13624a;
        long estimateSize = spliterator.estimateSize();
        long j10 = this.f13627d;
        if (j10 == 0) {
            j10 = AbstractC0545f.h(estimateSize);
            this.f13627d = j10;
        }
        boolean h10 = EnumC0539d3.SHORT_CIRCUIT.h(this.f13626c.E0());
        boolean z10 = false;
        AbstractC0603q2 abstractC0603q2 = this.f13625b;
        C0526b0 c0526b0 = this;
        while (true) {
            if (h10 && abstractC0603q2.x()) {
                break;
            } else if (estimateSize <= j10 || (trySplit = spliterator.trySplit()) == null) {
                break;
            } else {
                C0526b0 c0526b02 = new C0526b0(c0526b0, trySplit);
                c0526b0.addToPendingCount(1);
                if (z10) {
                    spliterator = trySplit;
                } else {
                    C0526b0 c0526b03 = c0526b0;
                    c0526b0 = c0526b02;
                    c0526b02 = c0526b03;
                }
                z10 = !z10;
                c0526b0.fork();
                c0526b0 = c0526b02;
                estimateSize = spliterator.estimateSize();
            }
        }
        c0526b0.f13626c.r0(abstractC0603q2, spliterator);
        c0526b0.f13624a = null;
        c0526b0.propagateCompletion();
    }
}
