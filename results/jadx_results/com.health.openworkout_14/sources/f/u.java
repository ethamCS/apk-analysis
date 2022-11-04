package f;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class u {

    /* renamed from: d */
    public static final u f4481d = new a();

    /* renamed from: a */
    private boolean f4482a;

    /* renamed from: b */
    private long f4483b;

    /* renamed from: c */
    private long f4484c;

    /* loaded from: classes.dex */
    final class a extends u {
        a() {
        }

        @Override // f.u
        public u d(long j) {
            return this;
        }

        @Override // f.u
        public void f() {
        }

        @Override // f.u
        public u g(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    public u a() {
        this.f4482a = false;
        return this;
    }

    public u b() {
        this.f4484c = 0L;
        return this;
    }

    public long c() {
        if (this.f4482a) {
            return this.f4483b;
        }
        throw new IllegalStateException("No deadline");
    }

    public u d(long j) {
        this.f4482a = true;
        this.f4483b = j;
        return this;
    }

    public boolean e() {
        return this.f4482a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f4482a && this.f4483b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public u g(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            if (timeUnit == null) {
                throw new IllegalArgumentException("unit == null");
            }
            this.f4484c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException("timeout < 0: " + j);
    }

    public long h() {
        return this.f4484c;
    }
}
