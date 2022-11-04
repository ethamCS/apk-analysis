package bb;

import fb.v;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lbb/b0;", "Lfb/v;", "Lbb/q0;", "f", "()Lbb/q0;", "urlEncodingOption", "a", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface b0 extends fb.v {
    public static final a Companion = a.f5787a;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbb/b0$a;", BuildConfig.FLAVOR, "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f5787a = new a();

        /* renamed from: b */
        private static final b0 f5788b = g.f5834a;

        private a() {
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b {
        public static void a(b0 b0Var, gc.p<? super String, ? super List<String>, tb.e0> pVar) {
            hc.t.e(b0Var, "this");
            hc.t.e(pVar, "body");
            v.b.a(b0Var, pVar);
        }

        public static q0 b(b0 b0Var) {
            hc.t.e(b0Var, "this");
            return q0.DEFAULT;
        }
    }

    q0 f();
}
