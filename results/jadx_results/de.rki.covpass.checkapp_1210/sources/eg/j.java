package eg;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0017J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001J\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0001H\u0016J\b\u0010\u0010\u001a\u00020\u0001H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Leg/j;", "Leg/b0;", "delegate", "j", BuildConfig.FLAVOR, "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "g", "h", BuildConfig.FLAVOR, "e", "c", "deadlineNanoTime", "d", "b", "a", "Ltb/e0;", "f", "Leg/b0;", "i", "()Leg/b0;", "setDelegate", "(Leg/b0;)V", "<init>", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public class j extends b0 {

    /* renamed from: e */
    private b0 f9621e;

    public j(b0 b0Var) {
        hc.t.e(b0Var, "delegate");
        this.f9621e = b0Var;
    }

    @Override // eg.b0
    public b0 a() {
        return this.f9621e.a();
    }

    @Override // eg.b0
    public b0 b() {
        return this.f9621e.b();
    }

    @Override // eg.b0
    public long c() {
        return this.f9621e.c();
    }

    @Override // eg.b0
    public b0 d(long j10) {
        return this.f9621e.d(j10);
    }

    @Override // eg.b0
    public boolean e() {
        return this.f9621e.e();
    }

    @Override // eg.b0
    public void f() {
        this.f9621e.f();
    }

    @Override // eg.b0
    public b0 g(long j10, TimeUnit timeUnit) {
        hc.t.e(timeUnit, "unit");
        return this.f9621e.g(j10, timeUnit);
    }

    @Override // eg.b0
    public long h() {
        return this.f9621e.h();
    }

    public final b0 i() {
        return this.f9621e;
    }

    public final j j(b0 b0Var) {
        hc.t.e(b0Var, "delegate");
        this.f9621e = b0Var;
        return this;
    }
}
