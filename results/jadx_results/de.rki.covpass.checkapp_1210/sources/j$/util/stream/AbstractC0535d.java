package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: j$.util.stream.d */
/* loaded from: classes2.dex */
public abstract class AbstractC0535d extends AbstractC0545f {

    /* renamed from: h */
    protected final AtomicReference f13649h;

    /* renamed from: i */
    protected volatile boolean f13650i;

    public AbstractC0535d(D0 d02, Spliterator spliterator) {
        super(d02, spliterator);
        this.f13649h = new AtomicReference(null);
    }

    public AbstractC0535d(AbstractC0535d abstractC0535d, Spliterator spliterator) {
        super(abstractC0535d, spliterator);
        this.f13649h = abstractC0535d.f13649h;
    }

    @Override // j$.util.stream.AbstractC0545f
    public final Object b() {
        if (e()) {
            Object obj = this.f13649h.get();
            return obj == null ? k() : obj;
        }
        return super.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
        r8 = r7.a();
     */
    @Override // j$.util.stream.AbstractC0545f, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void compute() {
        /*
            r10 = this;
            j$.util.Spliterator r0 = r10.f13686b
            long r1 = r0.estimateSize()
            long r3 = r10.f13687c
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto Lf
            goto L15
        Lf:
            long r3 = j$.util.stream.AbstractC0545f.h(r1)
            r10.f13687c = r3
        L15:
            r5 = 0
            java.util.concurrent.atomic.AtomicReference r6 = r10.f13649h
            r7 = r10
        L19:
            java.lang.Object r8 = r6.get()
            if (r8 != 0) goto L6f
            boolean r8 = r7.f13650i
            if (r8 != 0) goto L34
            j$.util.stream.f r9 = r7.c()
        L27:
            j$.util.stream.d r9 = (j$.util.stream.AbstractC0535d) r9
            if (r8 != 0) goto L34
            if (r9 == 0) goto L34
            boolean r8 = r9.f13650i
            j$.util.stream.f r9 = r9.c()
            goto L27
        L34:
            if (r8 == 0) goto L3b
            java.lang.Object r8 = r7.k()
            goto L6f
        L3b:
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L6b
            j$.util.Spliterator r1 = r0.trySplit()
            if (r1 != 0) goto L46
            goto L6b
        L46:
            j$.util.stream.f r2 = r7.f(r1)
            j$.util.stream.d r2 = (j$.util.stream.AbstractC0535d) r2
            r7.f13688d = r2
            j$.util.stream.f r8 = r7.f(r0)
            j$.util.stream.d r8 = (j$.util.stream.AbstractC0535d) r8
            r7.f13689e = r8
            r9 = 1
            r7.setPendingCount(r9)
            if (r5 == 0) goto L60
            r0 = r1
            r7 = r2
            r2 = r8
            goto L61
        L60:
            r7 = r8
        L61:
            r5 = r5 ^ 1
            r2.fork()
            long r1 = r0.estimateSize()
            goto L19
        L6b:
            java.lang.Object r8 = r7.a()
        L6f:
            r7.g(r8)
            r7.tryComplete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.AbstractC0535d.compute():void");
    }

    @Override // j$.util.stream.AbstractC0545f
    public final void g(Object obj) {
        if (!e()) {
            super.g(obj);
        } else if (obj == null) {
        } else {
            this.f13649h.compareAndSet(null, obj);
        }
    }

    @Override // j$.util.stream.AbstractC0545f, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return b();
    }

    protected void i() {
        this.f13650i = true;
    }

    public final void j() {
        AbstractC0535d abstractC0535d = this;
        for (AbstractC0535d abstractC0535d2 = (AbstractC0535d) c(); abstractC0535d2 != null; abstractC0535d2 = (AbstractC0535d) abstractC0535d2.c()) {
            if (abstractC0535d2.f13688d == abstractC0535d) {
                AbstractC0535d abstractC0535d3 = (AbstractC0535d) abstractC0535d2.f13689e;
                if (!abstractC0535d3.f13650i) {
                    abstractC0535d3.i();
                }
            }
            abstractC0535d = abstractC0535d2;
        }
    }

    protected abstract Object k();

    public final void l(Object obj) {
        if (obj != null) {
            this.f13649h.compareAndSet(null, obj);
        }
    }
}