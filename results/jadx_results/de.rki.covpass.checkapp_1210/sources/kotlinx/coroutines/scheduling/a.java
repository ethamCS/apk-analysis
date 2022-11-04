package kotlinx.coroutines.scheduling;

import hc.t;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.u0;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0003U<?B+\u0012\u0006\u0010>\u001a\u00020\f\u0012\u0006\u0010@\u001a\u00020\f\u0012\b\b\u0002\u0010C\u001a\u00020\u0013\u0012\b\b\u0002\u0010F\u001a\u000207¢\u0006\u0004\bR\u0010SJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001c\u001a\u0004\u0018\u00010\u0003*\b\u0018\u00010\bR\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0018\u00010\bR\u00020\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\nJ)\u0010!\u001a\u00020\u00102\n\u0010\u000b\u001a\u00060\bR\u00020\u00002\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\bR\u00020\u0000¢\u0006\u0004\b#\u0010$J\u001b\u0010(\u001a\u00020\u00102\n\u0010'\u001a\u00060%j\u0002`&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0013¢\u0006\u0004\b-\u0010.J-\u00102\u001a\u00020\u00102\n\u0010/\u001a\u00060%j\u0002`&2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b2\u00103J!\u00104\u001a\u00020\u00032\n\u0010/\u001a\u00060%j\u0002`&2\u0006\u00101\u001a\u000200¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0010¢\u0006\u0004\b6\u0010+J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010=R\u0014\u0010C\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010F\u001a\u0002078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020G8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010IR\u001e\u0010P\u001a\f\u0012\b\u0012\u00060\bR\u00020\u00000M8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0011\u0010Q\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bQ\u0010\u0018¨\u0006V"}, d2 = {"Lkotlinx/coroutines/scheduling/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/scheduling/j;", "task", BuildConfig.FLAVOR, "b", "(Lkotlinx/coroutines/scheduling/j;)Z", "Lkotlinx/coroutines/scheduling/a$c;", "p", "()Lkotlinx/coroutines/scheduling/a$c;", "worker", BuildConfig.FLAVOR, "n", "(Lkotlinx/coroutines/scheduling/a$c;)I", "skipUnpark", "Ltb/e0;", "B", "(Z)V", BuildConfig.FLAVOR, "state", "V", "(J)Z", "e0", "()Z", "e", "()I", "tailDispatch", "M", "(Lkotlinx/coroutines/scheduling/a$c;Lkotlinx/coroutines/scheduling/j;Z)Lkotlinx/coroutines/scheduling/j;", "h", "oldIndex", "newIndex", "s", "(Lkotlinx/coroutines/scheduling/a$c;II)V", "r", "(Lkotlinx/coroutines/scheduling/a$c;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "timeout", "z", "(J)V", "block", "Lkotlinx/coroutines/scheduling/k;", "taskContext", "i", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/k;Z)V", "f", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/k;)Lkotlinx/coroutines/scheduling/j;", "G", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "u", "(Lkotlinx/coroutines/scheduling/j;)V", "c", "I", "corePoolSize", "d", "maxPoolSize", "q", "J", "idleWorkerKeepAliveNs", "x", "Ljava/lang/String;", "schedulerName", "Lkotlinx/coroutines/scheduling/e;", "y", "Lkotlinx/coroutines/scheduling/e;", "globalCpuQueue", "U3", "globalBlockingQueue", "Lkotlinx/coroutines/internal/y;", "V3", "Lkotlinx/coroutines/internal/y;", "workers", "isTerminated", "<init>", "(IIJLjava/lang/String;)V", "Companion", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class a implements Executor, Closeable {
    public final e U3;
    public final y<c> V3;
    private volatile /* synthetic */ int _isTerminated;

    /* renamed from: c */
    public final int f15513c;
    volatile /* synthetic */ long controlState;

    /* renamed from: d */
    public final int f15514d;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: q */
    public final long f15515q;

    /* renamed from: x */
    public final String f15516x;

    /* renamed from: y */
    public final e f15517y;
    public static final C0232a Companion = new C0232a(null);
    public static final b0 Z3 = new b0("NOT_IN_STACK");
    private static final /* synthetic */ AtomicLongFieldUpdater W3 = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
    static final /* synthetic */ AtomicLongFieldUpdater X3 = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");
    private static final /* synthetic */ AtomicIntegerFieldUpdater Y3 = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/scheduling/a$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "BLOCKING_MASK", "J", BuildConfig.FLAVOR, "BLOCKING_SHIFT", "I", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "Lkotlinx/coroutines/internal/b0;", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/b0;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.scheduling.a$a */
    /* loaded from: classes3.dex */
    public static final class C0232a {
        private C0232a() {
        }

        public /* synthetic */ C0232a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15518a;

        static {
            int[] iArr = new int[d.values().length];
            iArr[d.PARKING.ordinal()] = 1;
            iArr[d.BLOCKING.ordinal()] = 2;
            iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[d.DORMANT.ordinal()] = 4;
            iArr[d.TERMINATED.ordinal()] = 5;
            f15518a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bC\u0010DB\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020\u000e¢\u0006\u0004\bC\u0010EJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0007J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\u0015\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0007J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0019R*\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0011R\u0014\u0010/\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010.R\u0016\u00101\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u00103R$\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010=\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00103R\u0016\u0010?\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010)R\u0016\u0010B\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006F"}, d2 = {"Lkotlinx/coroutines/scheduling/a$c;", "Ljava/lang/Thread;", BuildConfig.FLAVOR, "q", "()Z", "Ltb/e0;", "n", "()V", "r", "j", "Lkotlinx/coroutines/scheduling/j;", "task", "d", "(Lkotlinx/coroutines/scheduling/j;)V", BuildConfig.FLAVOR, "taskMode", "c", "(I)V", "b", "l", "u", "mode", "i", "scanLocalQueue", "e", "(Z)Lkotlinx/coroutines/scheduling/j;", "m", "()Lkotlinx/coroutines/scheduling/j;", "blockingOnly", "t", "Lkotlinx/coroutines/scheduling/a$d;", "newState", "s", "(Lkotlinx/coroutines/scheduling/a$d;)Z", "run", "upperBound", "k", "(I)I", "f", "index", "indexInArray", "I", "g", "()I", "o", "Lkotlinx/coroutines/scheduling/p;", "Lkotlinx/coroutines/scheduling/p;", "localQueue", "Lkotlinx/coroutines/scheduling/a$d;", "state", BuildConfig.FLAVOR, "J", "terminationDeadline", BuildConfig.FLAVOR, "nextParkedWorker", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "p", "(Ljava/lang/Object;)V", "x", "minDelayUntilStealableTaskNs", "y", "rngState", "U3", "Z", "mayHaveLocalTasks", "<init>", "(Lkotlinx/coroutines/scheduling/a;)V", "(Lkotlinx/coroutines/scheduling/a;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class c extends Thread {
        static final /* synthetic */ AtomicIntegerFieldUpdater W3 = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        public boolean U3;

        /* renamed from: c */
        public final p f15519c;

        /* renamed from: d */
        public d f15520d;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;

        /* renamed from: q */
        private long f15521q;
        volatile /* synthetic */ int workerCtl;

        /* renamed from: x */
        private long f15522x;

        /* renamed from: y */
        private int f15523y;

        private c() {
            a.this = r1;
            setDaemon(true);
            this.f15519c = new p();
            this.f15520d = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.Z3;
            this.f15523y = lc.c.f15919c.c();
        }

        public c(a aVar, int i10) {
            this();
            o(i10);
        }

        private final void b(int i10) {
            if (i10 == 0) {
                return;
            }
            a.X3.addAndGet(a.this, -2097152L);
            if (this.f15520d == d.TERMINATED) {
                return;
            }
            this.f15520d = d.DORMANT;
        }

        private final void c(int i10) {
            if (i10 != 0 && s(d.BLOCKING)) {
                a.this.G();
            }
        }

        private final void d(j jVar) {
            int f02 = jVar.f15539d.f0();
            i(f02);
            c(f02);
            a.this.u(jVar);
            b(f02);
        }

        private final j e(boolean z10) {
            j m10;
            j m11;
            if (z10) {
                boolean z11 = k(a.this.f15513c * 2) == 0;
                if (z11 && (m11 = m()) != null) {
                    return m11;
                }
                j h10 = this.f15519c.h();
                if (h10 != null) {
                    return h10;
                }
                if (!z11 && (m10 = m()) != null) {
                    return m10;
                }
            } else {
                j m12 = m();
                if (m12 != null) {
                    return m12;
                }
            }
            return t(false);
        }

        private final void i(int i10) {
            this.f15521q = 0L;
            if (this.f15520d == d.PARKING) {
                this.f15520d = d.BLOCKING;
            }
        }

        private final boolean j() {
            return this.nextParkedWorker != a.Z3;
        }

        private final void l() {
            if (this.f15521q == 0) {
                this.f15521q = System.nanoTime() + a.this.f15515q;
            }
            LockSupport.parkNanos(a.this.f15515q);
            if (System.nanoTime() - this.f15521q >= 0) {
                this.f15521q = 0L;
                u();
            }
        }

        private final j m() {
            e eVar;
            if (k(2) == 0) {
                j d10 = a.this.f15517y.d();
                if (d10 != null) {
                    return d10;
                }
                eVar = a.this.U3;
            } else {
                j d11 = a.this.U3.d();
                if (d11 != null) {
                    return d11;
                }
                eVar = a.this.f15517y;
            }
            return eVar.d();
        }

        private final void n() {
            loop0: while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f15520d != d.TERMINATED) {
                    j f10 = f(this.U3);
                    if (f10 != null) {
                        this.f15522x = 0L;
                        d(f10);
                    } else {
                        this.U3 = false;
                        if (this.f15522x == 0) {
                            r();
                        } else if (!z10) {
                            z10 = true;
                        } else {
                            s(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f15522x);
                            this.f15522x = 0L;
                        }
                    }
                }
            }
            s(d.TERMINATED);
        }

        private final boolean q() {
            boolean z10;
            if (this.f15520d != d.CPU_ACQUIRED) {
                a aVar = a.this;
                while (true) {
                    long j10 = aVar.controlState;
                    if (((int) ((9223367638808264704L & j10) >> 42)) != 0) {
                        if (a.X3.compareAndSet(aVar, j10, j10 - 4398046511104L)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    return false;
                }
                this.f15520d = d.CPU_ACQUIRED;
            }
            return true;
        }

        private final void r() {
            if (!j()) {
                a.this.r(this);
                return;
            }
            this.workerCtl = -1;
            while (j() && this.workerCtl == -1 && !a.this.isTerminated() && this.f15520d != d.TERMINATED) {
                s(d.PARKING);
                Thread.interrupted();
                l();
            }
        }

        private final j t(boolean z10) {
            int i10 = (int) (a.this.controlState & 2097151);
            if (i10 < 2) {
                return null;
            }
            int k10 = k(i10);
            a aVar = a.this;
            long j10 = Long.MAX_VALUE;
            for (int i11 = 0; i11 < i10; i11++) {
                k10++;
                if (k10 > i10) {
                    k10 = 1;
                }
                c b10 = aVar.V3.b(k10);
                if (b10 != null && b10 != this) {
                    p pVar = this.f15519c;
                    p pVar2 = b10.f15519c;
                    long k11 = z10 ? pVar.k(pVar2) : pVar.l(pVar2);
                    if (k11 == -1) {
                        return this.f15519c.h();
                    }
                    if (k11 > 0) {
                        j10 = Math.min(j10, k11);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f15522x = j10;
            return null;
        }

        private final void u() {
            a aVar = a.this;
            synchronized (aVar.V3) {
                if (aVar.isTerminated()) {
                    return;
                }
                if (((int) (aVar.controlState & 2097151)) <= aVar.f15513c) {
                    return;
                }
                if (!W3.compareAndSet(this, -1, 1)) {
                    return;
                }
                int i10 = this.indexInArray;
                o(0);
                aVar.s(this, i10, 0);
                int andDecrement = (int) (a.X3.getAndDecrement(aVar) & 2097151);
                if (andDecrement != i10) {
                    c b10 = aVar.V3.b(andDecrement);
                    t.b(b10);
                    c cVar = b10;
                    aVar.V3.c(i10, cVar);
                    cVar.o(i10);
                    aVar.s(cVar, andDecrement, i10);
                }
                aVar.V3.c(andDecrement, null);
                e0 e0Var = e0.f22152a;
                this.f15520d = d.TERMINATED;
            }
        }

        public final j f(boolean z10) {
            j jVar;
            if (q()) {
                return e(z10);
            }
            if (!z10 || (jVar = this.f15519c.h()) == null) {
                jVar = a.this.U3.d();
            }
            return jVar == null ? t(true) : jVar;
        }

        public final int g() {
            return this.indexInArray;
        }

        public final Object h() {
            return this.nextParkedWorker;
        }

        public final int k(int i10) {
            int i11 = this.f15523y;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f15523y = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void o(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f15516x);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void p(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            n();
        }

        public final boolean s(d dVar) {
            d dVar2 = this.f15520d;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.X3.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f15520d = dVar;
            }
            return z10;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/scheduling/a$d;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i10, int i11, long j10, String str) {
        this.f15513c = i10;
        this.f15514d = i11;
        this.f15515q = j10;
        this.f15516x = str;
        boolean z10 = true;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j10 <= 0 ? false : z10)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f15517y = new e();
        this.U3 = new e();
        this.parkedWorkersStack = 0L;
        this.V3 = new y<>(i10 + 1);
        this.controlState = i10 << 42;
        this._isTerminated = 0;
    }

    private final void B(boolean z10) {
        long addAndGet = X3.addAndGet(this, 2097152L);
        if (!z10 && !e0() && !V(addAndGet)) {
            e0();
        }
    }

    private final j M(c cVar, j jVar, boolean z10) {
        if (cVar == null || cVar.f15520d == d.TERMINATED) {
            return jVar;
        }
        if (jVar.f15539d.f0() == 0 && cVar.f15520d == d.BLOCKING) {
            return jVar;
        }
        cVar.U3 = true;
        return cVar.f15519c.a(jVar, z10);
    }

    private final boolean V(long j10) {
        int b10;
        b10 = nc.m.b(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0);
        if (b10 < this.f15513c) {
            int e10 = e();
            if (e10 == 1 && this.f15513c > 1) {
                e();
            }
            if (e10 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean W(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = aVar.controlState;
        }
        return aVar.V(j10);
    }

    private final boolean b(j jVar) {
        boolean z10 = true;
        if (jVar.f15539d.f0() != 1) {
            z10 = false;
        }
        return (z10 ? this.U3 : this.f15517y).a(jVar);
    }

    private final int e() {
        int b10;
        int i10;
        synchronized (this.V3) {
            if (isTerminated()) {
                i10 = -1;
            } else {
                long j10 = this.controlState;
                int i11 = (int) (j10 & 2097151);
                boolean z10 = false;
                b10 = nc.m.b(i11 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (b10 >= this.f15513c) {
                    return 0;
                }
                if (i11 >= this.f15514d) {
                    return 0;
                }
                int i12 = ((int) (this.controlState & 2097151)) + 1;
                if (!(i12 > 0 && this.V3.b(i12) == null)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c cVar = new c(this, i12);
                this.V3.c(i12, cVar);
                if (i12 == ((int) (2097151 & X3.incrementAndGet(this)))) {
                    z10 = true;
                }
                if (!z10) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                cVar.start();
                i10 = b10 + 1;
            }
            return i10;
        }
    }

    private final boolean e0() {
        c p10;
        do {
            p10 = p();
            if (p10 == null) {
                return false;
            }
        } while (!c.W3.compareAndSet(p10, -1, 0));
        LockSupport.unpark(p10);
        return true;
    }

    private final c h() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !t.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void j(a aVar, Runnable runnable, k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            kVar = n.f15547f;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.i(runnable, kVar, z10);
    }

    private final int n(c cVar) {
        int g10;
        do {
            Object h10 = cVar.h();
            if (h10 == Z3) {
                return -1;
            }
            if (h10 == null) {
                return 0;
            }
            cVar = (c) h10;
            g10 = cVar.g();
        } while (g10 == 0);
        return g10;
    }

    private final c p() {
        while (true) {
            long j10 = this.parkedWorkersStack;
            c b10 = this.V3.b((int) (2097151 & j10));
            if (b10 == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int n10 = n(b10);
            if (n10 >= 0 && W3.compareAndSet(this, j10, n10 | j11)) {
                b10.p(Z3);
                return b10;
            }
        }
    }

    public final void G() {
        if (!e0() && !W(this, 0L, 1, null)) {
            e0();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        z(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        j(this, runnable, null, false, 6, null);
    }

    public final j f(Runnable runnable, k kVar) {
        long a10 = n.f15546e.a();
        if (runnable instanceof j) {
            j jVar = (j) runnable;
            jVar.f15538c = a10;
            jVar.f15539d = kVar;
            return jVar;
        }
        return new m(runnable, a10, kVar);
    }

    public final void i(Runnable runnable, k kVar, boolean z10) {
        kotlinx.coroutines.c.a();
        j f10 = f(runnable, kVar);
        c h10 = h();
        j M = M(h10, f10, z10);
        if (M != null && !b(M)) {
            throw new RejectedExecutionException(this.f15516x + " was terminated");
        }
        boolean z11 = z10 && h10 != null;
        if (f10.f15539d.f0() != 0) {
            B(z11);
        } else if (z11) {
        } else {
            G();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final boolean r(c cVar) {
        long j10;
        int g10;
        if (cVar.h() != Z3) {
            return false;
        }
        do {
            j10 = this.parkedWorkersStack;
            g10 = cVar.g();
            cVar.p(this.V3.b((int) (2097151 & j10)));
        } while (!W3.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | g10));
        return true;
    }

    public final void s(c cVar, int i10, int i11) {
        while (true) {
            long j10 = this.parkedWorkersStack;
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                i12 = i11 == 0 ? n(cVar) : i11;
            }
            if (i12 >= 0 && W3.compareAndSet(this, j10, j11 | i12)) {
                return;
            }
        }
    }

    public String toString() {
        char c10;
        StringBuilder sb2;
        ArrayList arrayList = new ArrayList();
        int a10 = this.V3.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            c b10 = this.V3.b(i15);
            if (b10 != null) {
                int f10 = b10.f15519c.f();
                int i16 = b.f15518a[b10.f15520d.ordinal()];
                if (i16 != 1) {
                    if (i16 == 2) {
                        i11++;
                        sb2 = new StringBuilder();
                        sb2.append(f10);
                        c10 = 'b';
                    } else if (i16 == 3) {
                        i10++;
                        sb2 = new StringBuilder();
                        sb2.append(f10);
                        c10 = 'c';
                    } else if (i16 == 4) {
                        i13++;
                        if (f10 > 0) {
                            sb2 = new StringBuilder();
                            sb2.append(f10);
                            c10 = 'd';
                        }
                    } else if (i16 == 5) {
                        i14++;
                    }
                    sb2.append(c10);
                    arrayList.add(sb2.toString());
                } else {
                    i12++;
                }
            }
        }
        long j10 = this.controlState;
        return this.f15516x + '@' + u0.b(this) + "[Pool Size {core = " + this.f15513c + ", max = " + this.f15514d + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f15517y.c() + ", global blocking queue size = " + this.U3.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f15513c - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final void u(j jVar) {
        try {
            jVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void z(long j10) {
        int i10;
        j jVar;
        if (!Y3.compareAndSet(this, 0, 1)) {
            return;
        }
        c h10 = h();
        synchronized (this.V3) {
            i10 = (int) (this.controlState & 2097151);
        }
        if (1 <= i10) {
            int i11 = 1;
            while (true) {
                c b10 = this.V3.b(i11);
                t.b(b10);
                c cVar = b10;
                if (cVar != h10) {
                    while (cVar.isAlive()) {
                        LockSupport.unpark(cVar);
                        cVar.join(j10);
                    }
                    cVar.f15519c.g(this.U3);
                }
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        this.U3.b();
        this.f15517y.b();
        while (true) {
            if (h10 != null) {
                jVar = h10.f(true);
                if (jVar != null) {
                    continue;
                    u(jVar);
                }
            }
            jVar = this.f15517y.d();
            if (jVar == null && (jVar = this.U3.d()) == null) {
                break;
            }
            u(jVar);
        }
        if (h10 != null) {
            h10.s(d.TERMINATED);
        }
        this.parkedWorkersStack = 0L;
        this.controlState = 0L;
    }
}
