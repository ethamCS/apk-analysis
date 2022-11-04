package bb;

import fb.v;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lbb/l;", "Lfb/v;", "a", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface l extends fb.v {
    public static final a Companion = a.f5843a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR\u001d\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lbb/l$a;", BuildConfig.FLAVOR, "Lbb/l;", "Empty", "Lbb/l;", "a", "()Lbb/l;", "getEmpty$annotations", "()V", "<init>", "ktor-http"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f5843a = new a();

        /* renamed from: b */
        private static final l f5844b = f.f5824a;

        private a() {
        }

        public final l a() {
            return f5844b;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b {
        public static void a(l lVar, gc.p<? super String, ? super List<String>, tb.e0> pVar) {
            hc.t.e(lVar, "this");
            hc.t.e(pVar, "body");
            v.b.a(lVar, pVar);
        }

        public static String b(l lVar, String str) {
            hc.t.e(lVar, "this");
            hc.t.e(str, "name");
            return v.b.b(lVar, str);
        }
    }
}
