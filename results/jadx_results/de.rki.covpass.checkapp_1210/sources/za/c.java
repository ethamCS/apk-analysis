package za;

import bb.r;
import bb.v;
import bb.w;
import kotlin.Metadata;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lza/c;", "Lbb/r;", "Lkotlinx/coroutines/q0;", BuildConfig.FLAVOR, "toString", "Loa/b;", "c", "()Loa/b;", "call", "Lbb/w;", "i", "()Lbb/w;", "status", "Lbb/v;", "j", "()Lbb/v;", "version", "Lib/b;", "f", "()Lib/b;", "requestTime", "g", "responseTime", "Lio/ktor/utils/io/h;", "d", "()Lio/ktor/utils/io/h;", "content", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class c implements r, q0 {
    public abstract oa.b c();

    public abstract io.ktor.utils.io.h d();

    public abstract ib.b f();

    public abstract ib.b g();

    public abstract w i();

    public abstract v j();

    public String toString() {
        return "HttpResponse[" + e.b(this).u0() + ", " + i() + ']';
    }
}
