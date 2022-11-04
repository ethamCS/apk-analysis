package eg;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\b\u0010\u000e\u001a\u00020\u0000H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0013"}, d2 = {"Leg/b0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "h", BuildConfig.FLAVOR, "e", "c", "deadlineNanoTime", "d", "b", "a", "Ltb/e0;", "f", "<init>", "()V", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public class b0 {
    public static final b Companion = new b(null);

    /* renamed from: d */
    public static final b0 f9596d = new a();

    /* renamed from: a */
    private boolean f9597a;

    /* renamed from: b */
    private long f9598b;

    /* renamed from: c */
    private long f9599c;

    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"eg/b0$a", "Leg/b0;", BuildConfig.FLAVOR, "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "deadlineNanoTime", "d", "Ltb/e0;", "f", "okio"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a extends b0 {
        a() {
        }

        @Override // eg.b0
        public b0 d(long j10) {
            return this;
        }

        @Override // eg.b0
        public void f() {
        }

        @Override // eg.b0
        public b0 g(long j10, TimeUnit timeUnit) {
            hc.t.e(timeUnit, "unit");
            return this;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Leg/b0$b;", BuildConfig.FLAVOR, "Leg/b0;", "NONE", "Leg/b0;", "<init>", "()V", "okio"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b0 a() {
        this.f9597a = false;
        return this;
    }

    public b0 b() {
        this.f9599c = 0L;
        return this;
    }

    public long c() {
        if (this.f9597a) {
            return this.f9598b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public b0 d(long j10) {
        this.f9597a = true;
        this.f9598b = j10;
        return this;
    }

    public boolean e() {
        return this.f9597a;
    }

    public void f() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.f9597a && this.f9598b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public b0 g(long j10, TimeUnit timeUnit) {
        hc.t.e(timeUnit, "unit");
        if (j10 >= 0) {
            this.f9599c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(hc.t.l("timeout < 0: ", Long.valueOf(j10)).toString());
    }

    public long h() {
        return this.f9599c;
    }
}
