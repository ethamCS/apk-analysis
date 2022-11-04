package rb;

import hc.t;
import hc.y;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import rb.f;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001eB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\u000f\u0010\u000f\u001a\u00028\u0000H$¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\tJ\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0013J\u0006\u0010\u0017\u001a\u00020\fR\u0017\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lrb/c;", BuildConfig.FLAVOR, "T", "Lrb/f;", "instance", BuildConfig.FLAVOR, "r", "(Ljava/lang/Object;)Z", "p", "()Ljava/lang/Object;", BuildConfig.FLAVOR, "index", "Ltb/e0;", "n", "i", "j", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "s", "(Ljava/lang/Object;)V", "f", "c0", "B0", "g", "capacity", "I", "h", "()I", "<init>", "(I)V", "b", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class c<T> implements f<T> {
    public static final b Companion = new b(null);
    private static final AtomicLongFieldUpdater<c<?>> U3;

    /* renamed from: c */
    private final int f20580c;

    /* renamed from: d */
    private final int f20581d;

    /* renamed from: q */
    private final int f20582q;
    private volatile long top;

    /* renamed from: x */
    private final AtomicReferenceArray<T> f20583x;

    /* renamed from: y */
    private final int[] f20584y;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    /* synthetic */ class a extends y {
        public static final a W3 = new a();

        a() {
            super(c.class, "top", "getTop()J", 0);
        }

        @Override // hc.y, oc.m
        public Object get(Object obj) {
            return Long.valueOf(((c) obj).top);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lrb/c$b;", BuildConfig.FLAVOR, "Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;", "Lrb/c;", "Top", "Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        AtomicLongFieldUpdater<c<?>> newUpdater = AtomicLongFieldUpdater.newUpdater(c.class, a.W3.getName());
        t.d(newUpdater, "newUpdater(Owner::class.java, p.name)");
        U3 = newUpdater;
    }

    public c(int i10) {
        this.f20580c = i10;
        boolean z10 = false;
        if (i10 > 0) {
            if (!(i10 <= 536870911 ? true : z10)) {
                throw new IllegalArgumentException(t.l("capacity should be less or equal to 536870911 but it is ", Integer.valueOf(h())).toString());
            }
            int highestOneBit = Integer.highestOneBit((i10 * 4) - 1) * 2;
            this.f20581d = highestOneBit;
            this.f20582q = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            this.f20583x = new AtomicReferenceArray<>(highestOneBit + 1);
            this.f20584y = new int[highestOneBit + 1];
            return;
        }
        throw new IllegalArgumentException(t.l("capacity should be positive but it is ", Integer.valueOf(h())).toString());
    }

    private final int i() {
        long j10;
        long j11;
        int i10;
        do {
            j10 = this.top;
            if (j10 == 0) {
                return 0;
            }
            j11 = ((j10 >> 32) & 4294967295L) + 1;
            i10 = (int) (4294967295L & j10);
            if (i10 == 0) {
                return 0;
            }
        } while (!U3.compareAndSet(this, j10, (j11 << 32) | this.f20584y[i10]));
        return i10;
    }

    private final void n(int i10) {
        long j10;
        long j11;
        if (i10 > 0) {
            do {
                j10 = this.top;
                j11 = i10 | ((((j10 >> 32) & 4294967295L) + 1) << 32);
                this.f20584y[i10] = (int) (4294967295L & j10);
            } while (!U3.compareAndSet(this, j10, j11));
            return;
        }
        throw new IllegalArgumentException("index should be positive".toString());
    }

    private final T p() {
        int i10 = i();
        if (i10 == 0) {
            return null;
        }
        return this.f20583x.getAndSet(i10, null);
    }

    private final boolean r(T t10) {
        int identityHashCode = ((System.identityHashCode(t10) * (-1640531527)) >>> this.f20582q) + 1;
        int i10 = 0;
        while (i10 < 8) {
            i10++;
            if (this.f20583x.compareAndSet(identityHashCode, null, t10)) {
                n(identityHashCode);
                return true;
            }
            identityHashCode--;
            if (identityHashCode == 0) {
                identityHashCode = this.f20581d;
            }
        }
        return false;
    }

    @Override // rb.f
    public final void B0(T t10) {
        t.e(t10, "instance");
        s(t10);
        if (!r(t10)) {
            f(t10);
        }
    }

    @Override // rb.f
    public final T c0() {
        T p10 = p();
        T e10 = p10 == null ? null : e(p10);
        return e10 == null ? j() : e10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        f.a.a(this);
    }

    public T e(T t10) {
        t.e(t10, "instance");
        return t10;
    }

    public void f(T t10) {
        t.e(t10, "instance");
    }

    @Override // rb.f
    public final void g() {
        while (true) {
            T p10 = p();
            if (p10 == null) {
                return;
            }
            f(p10);
        }
    }

    public final int h() {
        return this.f20580c;
    }

    protected abstract T j();

    public void s(T t10) {
        t.e(t10, "instance");
    }
}
