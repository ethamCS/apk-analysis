package of;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\t\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lof/k;", BuildConfig.FLAVOR, "Ltb/e0;", "a", "Ltf/g;", "delegate", "Ltf/g;", "b", "()Ltf/g;", "<init>", "(Ltf/g;)V", BuildConfig.FLAVOR, "maxIdleConnections", BuildConfig.FLAVOR, "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(IJLjava/util/concurrent/TimeUnit;)V", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a */
    private final tf.g f18248a;

    public k() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i10, long j10, TimeUnit timeUnit) {
        this(new tf.g(sf.e.f21693h, i10, j10, timeUnit));
        hc.t.e(timeUnit, "timeUnit");
    }

    public k(tf.g gVar) {
        hc.t.e(gVar, "delegate");
        this.f18248a = gVar;
    }

    public final void a() {
        this.f18248a.d();
    }

    public final tf.g b() {
        return this.f18248a;
    }
}
