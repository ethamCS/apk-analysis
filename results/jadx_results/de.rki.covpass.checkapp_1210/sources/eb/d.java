package eb;

import fb.b0;
import gc.l;
import hc.t;
import hc.v;
import io.ktor.utils.io.e;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ta.u;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0004"}, d2 = {"Lya/d;", "request", "Lio/ktor/utils/io/c;", "a", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {BuildConfig.FLAVOR, "cause", "b", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends v implements l<Throwable, Throwable> {

        /* renamed from: c */
        final /* synthetic */ ya.d f9548c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ya.d dVar) {
            super(1);
            this.f9548c = dVar;
        }

        /* renamed from: b */
        public final Throwable invoke(Throwable th2) {
            return (th2 == null ? null : b0.a(th2)) instanceof SocketTimeoutException ? u.b(this.f9548c, th2) : th2;
        }
    }

    public static final io.ktor.utils.io.c a(ya.d dVar) {
        t.e(dVar, "request");
        return e.d(false, new a(dVar), 1, null);
    }
}
