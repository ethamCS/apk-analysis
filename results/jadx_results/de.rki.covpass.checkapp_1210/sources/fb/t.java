package fb;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Lfb/t;", BuildConfig.FLAVOR, "Ltb/e0;", "a", "b", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a */
    private final ReentrantLock f10139a = new ReentrantLock();

    public final void a() {
        this.f10139a.lock();
    }

    public final void b() {
        this.f10139a.unlock();
    }
}
