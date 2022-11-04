package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\b \u0018\u00002\u00020\u00012\u00020\u0002:\u00035\u001c6B\u0007¢\u0006\u0004\b4\u0010\rJ\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\rJ%\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\n\u0010\"\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\u000b2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000bH\u0004¢\u0006\u0004\b)\u0010\rR$\u0010/\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00068B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b0\u0010,R\u0014\u00103\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001f¨\u00067"}, d2 = {"Lkotlinx/coroutines/l1;", "Lkotlinx/coroutines/m1;", "Lkotlinx/coroutines/z0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", BuildConfig.FLAVOR, "A1", "(Ljava/lang/Runnable;)Z", "y1", "()Ljava/lang/Runnable;", "Ltb/e0;", "x1", "()V", "Lkotlinx/coroutines/l1$b;", "H1", "(Lkotlinx/coroutines/l1$b;)Z", BuildConfig.FLAVOR, "now", "delayedTask", BuildConfig.FLAVOR, "F1", "(JLkotlinx/coroutines/l1$b;)I", "C1", "shutdown", "timeMillis", "Lkotlinx/coroutines/p;", "continuation", "b", "(JLkotlinx/coroutines/p;)V", "q1", "()J", "Lxb/g;", "context", "block", "u0", "(Lxb/g;Ljava/lang/Runnable;)V", "z1", "(Ljava/lang/Runnable;)V", "E1", "(JLkotlinx/coroutines/l1$b;)V", "D1", "value", "p", "()Z", "G1", "(Z)V", "isCompleted", "B1", "isEmpty", "l1", "nextTime", "<init>", "a", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class l1 extends m1 implements z0 {
    private static final /* synthetic */ AtomicReferenceFieldUpdater U3 = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_queue");
    private static final /* synthetic */ AtomicReferenceFieldUpdater V3 = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/l1$a;", "Lkotlinx/coroutines/l1$b;", "Ltb/e0;", "run", BuildConfig.FLAVOR, "toString", "Lkotlinx/coroutines/p;", "q", "Lkotlinx/coroutines/p;", "cont", BuildConfig.FLAVOR, "nanoTime", "<init>", "(Lkotlinx/coroutines/l1;JLkotlinx/coroutines/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class a extends b {

        /* renamed from: q */
        private final p<tb.e0> f15485q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(long j10, p<? super tb.e0> pVar) {
            super(j10);
            l1.this = r1;
            this.f15485q = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15485q.v(l1.this, tb.e0.f22152a);
        }

        @Override // kotlinx.coroutines.l1.b
        public String toString() {
            return super.toString() + this.f15485q;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0016\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R0\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010#2\f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010#8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lkotlinx/coroutines/l1$b;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/h1;", "Lkotlinx/coroutines/internal/j0;", "other", BuildConfig.FLAVOR, "b", BuildConfig.FLAVOR, "now", BuildConfig.FLAVOR, "q", "Lkotlinx/coroutines/l1$c;", "delayed", "Lkotlinx/coroutines/l1;", "eventLoop", "j", "Ltb/e0;", "g", BuildConfig.FLAVOR, "toString", "c", "J", "nanoTime", BuildConfig.FLAVOR, "_heap", "Ljava/lang/Object;", "d", "I", "l", "()I", "m", "(I)V", "index", "Lkotlinx/coroutines/internal/i0;", "value", "p", "()Lkotlinx/coroutines/internal/i0;", "o", "(Lkotlinx/coroutines/internal/i0;)V", "heap", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static abstract class b implements Runnable, Comparable<b>, h1, kotlinx.coroutines.internal.j0 {
        private volatile Object _heap;

        /* renamed from: c */
        public long f15487c;

        /* renamed from: d */
        private int f15488d = -1;

        public b(long j10) {
            this.f15487c = j10;
        }

        /* renamed from: b */
        public int compareTo(b bVar) {
            int i10 = ((this.f15487c - bVar.f15487c) > 0L ? 1 : ((this.f15487c - bVar.f15487c) == 0L ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            return i10 < 0 ? -1 : 0;
        }

        @Override // kotlinx.coroutines.h1
        public final synchronized void g() {
            kotlinx.coroutines.internal.b0 b0Var;
            kotlinx.coroutines.internal.b0 b0Var2;
            Object obj = this._heap;
            b0Var = o1.f15494a;
            if (obj == b0Var) {
                return;
            }
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar != null) {
                cVar.g(this);
            }
            b0Var2 = o1.f15494a;
            this._heap = b0Var2;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0040 A[Catch: all -> 0x0048, TryCatch #1 {, blocks: (B:3:0x0001, B:8:0x000c, B:12:0x001a, B:29:0x0045, B:9:0x000d, B:17:0x0021, B:18:0x0024, B:22:0x002e, B:25:0x0037, B:27:0x0040, B:28:0x0042), top: B:33:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized int j(long r8, kotlinx.coroutines.l1.c r10, kotlinx.coroutines.l1 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch: java.lang.Throwable -> L4b
                kotlinx.coroutines.internal.b0 r1 = kotlinx.coroutines.o1.b()     // Catch: java.lang.Throwable -> L4b
                if (r0 != r1) goto Lc
                r8 = 2
            La:
                monitor-exit(r7)
                return r8
            Lc:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L4b
                kotlinx.coroutines.internal.j0 r0 = r10.b()     // Catch: java.lang.Throwable -> L48
                kotlinx.coroutines.l1$b r0 = (kotlinx.coroutines.l1.b) r0     // Catch: java.lang.Throwable -> L48
                boolean r11 = kotlinx.coroutines.l1.w1(r11)     // Catch: java.lang.Throwable -> L48
                if (r11 == 0) goto L1d
                r8 = 1
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                monitor-exit(r7)
                return r8
            L1d:
                r1 = 0
                if (r0 != 0) goto L24
            L21:
                r10.f15489b = r8     // Catch: java.lang.Throwable -> L48
                goto L37
            L24:
                long r3 = r0.f15487c     // Catch: java.lang.Throwable -> L48
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L2d
                goto L2e
            L2d:
                r8 = r3
            L2e:
                long r3 = r10.f15489b     // Catch: java.lang.Throwable -> L48
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L37
                goto L21
            L37:
                long r8 = r7.f15487c     // Catch: java.lang.Throwable -> L48
                long r3 = r10.f15489b     // Catch: java.lang.Throwable -> L48
                long r8 = r8 - r3
                int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r8 >= 0) goto L42
                r7.f15487c = r3     // Catch: java.lang.Throwable -> L48
            L42:
                r10.a(r7)     // Catch: java.lang.Throwable -> L48
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                r8 = 0
                goto La
            L48:
                r8 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                throw r8     // Catch: java.lang.Throwable -> L4b
            L4b:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.l1.b.j(long, kotlinx.coroutines.l1$c, kotlinx.coroutines.l1):int");
        }

        @Override // kotlinx.coroutines.internal.j0
        public int l() {
            return this.f15488d;
        }

        @Override // kotlinx.coroutines.internal.j0
        public void m(int i10) {
            this.f15488d = i10;
        }

        @Override // kotlinx.coroutines.internal.j0
        public void o(kotlinx.coroutines.internal.i0<?> i0Var) {
            kotlinx.coroutines.internal.b0 b0Var;
            Object obj = this._heap;
            b0Var = o1.f15494a;
            if (obj != b0Var) {
                this._heap = i0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // kotlinx.coroutines.internal.j0
        public kotlinx.coroutines.internal.i0<?> p() {
            Object obj = this._heap;
            if (obj instanceof kotlinx.coroutines.internal.i0) {
                return (kotlinx.coroutines.internal.i0) obj;
            }
            return null;
        }

        public final boolean q(long j10) {
            return j10 - this.f15487c >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f15487c + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/l1$c;", "Lkotlinx/coroutines/internal/i0;", "Lkotlinx/coroutines/l1$b;", BuildConfig.FLAVOR, "b", "J", "timeNow", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class c extends kotlinx.coroutines.internal.i0<b> {

        /* renamed from: b */
        public long f15489b;

        public c(long j10) {
            this.f15489b = j10;
        }
    }

    private final boolean A1(Runnable runnable) {
        kotlinx.coroutines.internal.b0 b0Var;
        while (true) {
            Object obj = this._queue;
            if (p()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(U3, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.q) {
                kotlinx.coroutines.internal.q qVar = (kotlinx.coroutines.internal.q) obj;
                int a10 = qVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    androidx.concurrent.futures.b.a(U3, this, obj, qVar.i());
                } else if (a10 == 2) {
                    return false;
                }
            } else {
                b0Var = o1.f15495b;
                if (obj == b0Var) {
                    return false;
                }
                kotlinx.coroutines.internal.q qVar2 = new kotlinx.coroutines.internal.q(8, true);
                qVar2.a((Runnable) obj);
                qVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(U3, this, obj, qVar2)) {
                    return true;
                }
            }
        }
    }

    private final void C1() {
        b i10;
        kotlinx.coroutines.c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            c cVar = (c) this._delayed;
            if (cVar == null || (i10 = cVar.i()) == null) {
                return;
            }
            u1(nanoTime, i10);
        }
    }

    private final int F1(long j10, b bVar) {
        if (p()) {
            return 1;
        }
        c cVar = (c) this._delayed;
        if (cVar == null) {
            androidx.concurrent.futures.b.a(V3, this, null, new c(j10));
            Object obj = this._delayed;
            hc.t.b(obj);
            cVar = (c) obj;
        }
        return bVar.j(j10, cVar, this);
    }

    private final void G1(boolean z10) {
        this._isCompleted = z10 ? 1 : 0;
    }

    private final boolean H1(b bVar) {
        c cVar = (c) this._delayed;
        return (cVar != null ? cVar.e() : null) == bVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean p() {
        return this._isCompleted;
    }

    private final void x1() {
        kotlinx.coroutines.internal.b0 b0Var;
        kotlinx.coroutines.internal.b0 b0Var2;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = U3;
                b0Var = o1.f15495b;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, null, b0Var)) {
                    return;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.q) {
                ((kotlinx.coroutines.internal.q) obj).d();
                return;
            } else {
                b0Var2 = o1.f15495b;
                if (obj == b0Var2) {
                    return;
                }
                kotlinx.coroutines.internal.q qVar = new kotlinx.coroutines.internal.q(8, true);
                qVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(U3, this, obj, qVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable y1() {
        kotlinx.coroutines.internal.b0 b0Var;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof kotlinx.coroutines.internal.q) {
                kotlinx.coroutines.internal.q qVar = (kotlinx.coroutines.internal.q) obj;
                Object j10 = qVar.j();
                if (j10 != kotlinx.coroutines.internal.q.f15450g) {
                    return (Runnable) j10;
                }
                androidx.concurrent.futures.b.a(U3, this, obj, qVar.i());
            } else {
                b0Var = o1.f15495b;
                if (obj == b0Var) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(U3, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    public boolean B1() {
        kotlinx.coroutines.internal.b0 b0Var;
        if (!p1()) {
            return false;
        }
        c cVar = (c) this._delayed;
        if (cVar != null && !cVar.d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.q) {
                return ((kotlinx.coroutines.internal.q) obj).g();
            }
            b0Var = o1.f15495b;
            if (obj != b0Var) {
                return false;
            }
        }
        return true;
    }

    public final void D1() {
        this._queue = null;
        this._delayed = null;
    }

    public final void E1(long j10, b bVar) {
        int F1 = F1(j10, bVar);
        if (F1 == 0) {
            if (!H1(bVar)) {
                return;
            }
            v1();
        } else if (F1 == 1) {
            u1(j10, bVar);
        } else if (F1 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    @Override // kotlinx.coroutines.z0
    public void b(long j10, p<? super tb.e0> pVar) {
        long c10 = o1.c(j10);
        if (c10 < 4611686018427387903L) {
            kotlinx.coroutines.c.a();
            long nanoTime = System.nanoTime();
            a aVar = new a(c10 + nanoTime, pVar);
            E1(nanoTime, aVar);
            s.a(pVar, aVar);
        }
    }

    @Override // kotlinx.coroutines.k1
    public long l1() {
        b e10;
        long c10;
        kotlinx.coroutines.internal.b0 b0Var;
        if (super.l1() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.q)) {
                b0Var = o1.f15495b;
                return obj == b0Var ? Long.MAX_VALUE : 0L;
            } else if (!((kotlinx.coroutines.internal.q) obj).g()) {
                return 0L;
            }
        }
        c cVar = (c) this._delayed;
        if (cVar == null || (e10 = cVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = e10.f15487c;
        kotlinx.coroutines.c.a();
        c10 = nc.m.c(j10 - System.nanoTime(), 0L);
        return c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    @Override // kotlinx.coroutines.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long q1() {
        /*
            r9 = this;
            boolean r0 = r9.r1()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r9._delayed
            kotlinx.coroutines.l1$c r0 = (kotlinx.coroutines.l1.c) r0
            if (r0 == 0) goto L45
            boolean r3 = r0.d()
            if (r3 != 0) goto L45
            kotlinx.coroutines.c.a()
            long r3 = java.lang.System.nanoTime()
        L1c:
            monitor-enter(r0)
            kotlinx.coroutines.internal.j0 r5 = r0.b()     // Catch: java.lang.Throwable -> L42
            r6 = 0
            if (r5 != 0) goto L26
        L24:
            monitor-exit(r0)
            goto L3d
        L26:
            kotlinx.coroutines.l1$b r5 = (kotlinx.coroutines.l1.b) r5     // Catch: java.lang.Throwable -> L42
            boolean r7 = r5.q(r3)     // Catch: java.lang.Throwable -> L42
            r8 = 0
            if (r7 == 0) goto L34
            boolean r5 = r9.A1(r5)     // Catch: java.lang.Throwable -> L42
            goto L35
        L34:
            r5 = r8
        L35:
            if (r5 == 0) goto L24
            kotlinx.coroutines.internal.j0 r5 = r0.h(r8)     // Catch: java.lang.Throwable -> L42
            r6 = r5
            goto L24
        L3d:
            kotlinx.coroutines.l1$b r6 = (kotlinx.coroutines.l1.b) r6
            if (r6 != 0) goto L1c
            goto L45
        L42:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L45:
            java.lang.Runnable r0 = r9.y1()
            if (r0 == 0) goto L4f
            r0.run()
            return r1
        L4f:
            long r0 = r9.l1()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.l1.q1():long");
    }

    @Override // kotlinx.coroutines.k1
    public void shutdown() {
        b3.f15314a.c();
        G1(true);
        x1();
        do {
        } while (q1() <= 0);
        C1();
    }

    @Override // kotlinx.coroutines.l0
    public final void u0(xb.g gVar, Runnable runnable) {
        z1(runnable);
    }

    public void z1(Runnable runnable) {
        if (A1(runnable)) {
            v1();
        } else {
            v0.W3.z1(runnable);
        }
    }
}
