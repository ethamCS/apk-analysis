package io.ktor.utils.io;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lio/ktor/utils/io/g;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "closed", "Z", "a", "()Z", "e", "(Z)V", BuildConfig.FLAVOR, "totalBytesRead", "J", "c", "()J", "g", "(J)V", "totalBytesWritten", "d", "h", BuildConfig.FLAVOR, "closedCause", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "f", "(Ljava/lang/Throwable;)V", BuildConfig.FLAVOR, "lastReadAvailable", "I", "getLastReadAvailable", "()I", "setLastReadAvailable", "(I)V", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class g {
    private volatile boolean closed;
    private volatile Throwable closedCause;
    private volatile int lastReadAvailable;
    private volatile pb.a lastReadView = pb.a.Companion.a();
    private volatile ob.p readByteOrder;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;
    private volatile ob.p writeByteOrder;

    public g() {
        ob.p pVar = ob.p.BIG_ENDIAN;
        this.readByteOrder = pVar;
        this.writeByteOrder = pVar;
    }

    public final boolean a() {
        return this.closed;
    }

    public final Throwable b() {
        return this.closedCause;
    }

    public final long c() {
        return this.totalBytesRead;
    }

    public final long d() {
        return this.totalBytesWritten;
    }

    public final void e(boolean z10) {
        this.closed = z10;
    }

    public final void f(Throwable th2) {
        this.closedCause = th2;
    }

    public final void g(long j10) {
        this.totalBytesRead = j10;
    }

    public final void h(long j10) {
        this.totalBytesWritten = j10;
    }
}
