package ne;

import hc.t;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes3.dex */
public class d implements k {

    /* renamed from: a */
    private final Lock f16974a;

    public d(Lock lock) {
        t.e(lock, "lock");
        this.f16974a = lock;
    }

    public /* synthetic */ d(Lock lock, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ReentrantLock() : lock);
    }

    @Override // ne.k
    public void a() {
        this.f16974a.unlock();
    }

    @Override // ne.k
    public void b() {
        this.f16974a.lock();
    }

    public final Lock c() {
        return this.f16974a;
    }
}
