package io.ktor.utils.io.jvm.javaio;

import hc.t;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/c;", "Lio/ktor/utils/io/jvm/javaio/e;", "Ljava/lang/Thread;", BuildConfig.FLAVOR, "timeNanos", "Ltb/e0;", "a", "token", "c", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class c implements e<Thread> {

    /* renamed from: a */
    public static final c f12931a = new c();

    private c() {
    }

    @Override // io.ktor.utils.io.jvm.javaio.e
    public void a(long j10) {
        if (j10 >= 0) {
            LockSupport.parkNanos(j10);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: c */
    public void b(Thread thread) {
        t.e(thread, "token");
        LockSupport.unpark(thread);
    }
}
