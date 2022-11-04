package io.ktor.utils.io.jvm.javaio;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/g;", "Lio/ktor/utils/io/jvm/javaio/e;", "Ljava/lang/Thread;", BuildConfig.FLAVOR, "c", BuildConfig.FLAVOR, "timeNanos", "Ltb/e0;", "a", "token", "d", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class g implements e<Thread> {

    /* renamed from: a */
    public static final g f12941a = new g();

    private g() {
    }

    private final Void c() {
        throw new UnsupportedOperationException("Parking is prohibited on this thread. Most likely you are using blocking operation on the wrong thread/dispatcher that doesn't allow blocking. Consider wrapping you blocking code withContext(Dispatchers.IO) {...}.");
    }

    @Override // io.ktor.utils.io.jvm.javaio.e
    public void a(long j10) {
        c();
        throw new tb.i();
    }

    /* renamed from: d */
    public void b(Thread thread) {
        t.e(thread, "token");
        c.f12931a.b(thread);
    }
}
