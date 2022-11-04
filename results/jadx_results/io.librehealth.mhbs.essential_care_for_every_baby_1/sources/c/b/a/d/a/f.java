package c.b.a.d.a;

import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
final class f {
    public static void a(Object obj, long j) {
        LockSupport.parkNanos(obj, Math.min(j, 2147483647999999999L));
    }
}
