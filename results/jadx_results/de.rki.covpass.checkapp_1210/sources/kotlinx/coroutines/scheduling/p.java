package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0011J!\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010%\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006*"}, d2 = {"Lkotlinx/coroutines/scheduling/p;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/scheduling/j;", "task", "c", "(Lkotlinx/coroutines/scheduling/j;)Lkotlinx/coroutines/scheduling/j;", "victim", BuildConfig.FLAVOR, "blockingOnly", BuildConfig.FLAVOR, "m", "(Lkotlinx/coroutines/scheduling/p;Z)J", "Lkotlinx/coroutines/scheduling/e;", "queue", "j", "(Lkotlinx/coroutines/scheduling/e;)Z", "i", "()Lkotlinx/coroutines/scheduling/j;", "Ltb/e0;", "d", "(Lkotlinx/coroutines/scheduling/j;)V", "h", "fair", "a", "(Lkotlinx/coroutines/scheduling/j;Z)Lkotlinx/coroutines/scheduling/j;", "l", "(Lkotlinx/coroutines/scheduling/p;)J", "k", "globalQueue", "g", "(Lkotlinx/coroutines/scheduling/e;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", BuildConfig.FLAVOR, "e", "()I", "bufferSize", "f", "size", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f15550b = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f15551c = AtomicIntegerFieldUpdater.newUpdater(p.class, "producerIndex");

    /* renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f15552d = AtomicIntegerFieldUpdater.newUpdater(p.class, "consumerIndex");

    /* renamed from: e */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f15553e = AtomicIntegerFieldUpdater.newUpdater(p.class, "blockingTasksInBuffer");

    /* renamed from: a */
    private final AtomicReferenceArray<j> f15554a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ j b(p pVar, j jVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return pVar.a(jVar, z10);
    }

    private final j c(j jVar) {
        boolean z10 = true;
        if (jVar.f15539d.f0() != 1) {
            z10 = false;
        }
        if (z10) {
            f15553e.incrementAndGet(this);
        }
        if (e() == 127) {
            return jVar;
        }
        int i10 = this.producerIndex & 127;
        while (this.f15554a.get(i10) != null) {
            Thread.yield();
        }
        this.f15554a.lazySet(i10, jVar);
        f15551c.incrementAndGet(this);
        return null;
    }

    private final void d(j jVar) {
        if (jVar != null) {
            boolean z10 = true;
            if (jVar.f15539d.f0() != 1) {
                z10 = false;
            }
            if (!z10) {
                return;
            }
            f15553e.decrementAndGet(this);
        }
    }

    private final j i() {
        j andSet;
        while (true) {
            int i10 = this.consumerIndex;
            if (i10 - this.producerIndex == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f15552d.compareAndSet(this, i10, i10 + 1) && (andSet = this.f15554a.getAndSet(i11, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(e eVar) {
        j i10 = i();
        if (i10 == null) {
            return false;
        }
        eVar.a(i10);
        return true;
    }

    private final long m(p pVar, boolean z10) {
        j jVar;
        do {
            jVar = (j) pVar.lastScheduledTask;
            if (jVar == null) {
                return -2L;
            }
            if (z10) {
                boolean z11 = true;
                if (jVar.f15539d.f0() != 1) {
                    z11 = false;
                }
                if (!z11) {
                    return -2L;
                }
            }
            long a10 = n.f15546e.a() - jVar.f15538c;
            long j10 = n.f15542a;
            if (a10 < j10) {
                return j10 - a10;
            }
        } while (!androidx.concurrent.futures.b.a(f15550b, pVar, jVar, null));
        b(this, jVar, false, 2, null);
        return -1L;
    }

    public final j a(j jVar, boolean z10) {
        if (z10) {
            return c(jVar);
        }
        j jVar2 = (j) f15550b.getAndSet(this, jVar);
        if (jVar2 != null) {
            return c(jVar2);
        }
        return null;
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final void g(e eVar) {
        j jVar = (j) f15550b.getAndSet(this, null);
        if (jVar != null) {
            eVar.a(jVar);
        }
        do {
        } while (j(eVar));
    }

    public final j h() {
        j jVar = (j) f15550b.getAndSet(this, null);
        return jVar == null ? i() : jVar;
    }

    public final long k(p pVar) {
        int i10 = pVar.consumerIndex;
        int i11 = pVar.producerIndex;
        AtomicReferenceArray<j> atomicReferenceArray = pVar.f15554a;
        while (true) {
            boolean z10 = true;
            if (i10 == i11) {
                break;
            }
            int i12 = i10 & 127;
            if (pVar.blockingTasksInBuffer == 0) {
                break;
            }
            j jVar = atomicReferenceArray.get(i12);
            if (jVar != null) {
                if (jVar.f15539d.f0() != 1) {
                    z10 = false;
                }
                if (z10 && atomicReferenceArray.compareAndSet(i12, jVar, null)) {
                    f15553e.decrementAndGet(pVar);
                    b(this, jVar, false, 2, null);
                    return -1L;
                }
            }
            i10++;
        }
        return m(pVar, true);
    }

    public final long l(p pVar) {
        j i10 = pVar.i();
        if (i10 != null) {
            b(this, i10, false, 2, null);
            return -1L;
        }
        return m(pVar, false);
    }
}
