package fb;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H&J \u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\t0\u0007H&J(\u0010\u000e\u001a\u00020\f2\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH&R\u0014\u0010\u0013\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lfb/v;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "name", "e", BuildConfig.FLAVOR, "b", BuildConfig.FLAVOR, "names", BuildConfig.FLAVOR, "a", "Lkotlin/Function2;", "Ltb/e0;", "body", "c", BuildConfig.FLAVOR, "isEmpty", "d", "()Z", "caseInsensitiveName", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface v {
    public static final a Companion = a.f10145a;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfb/v$a;", BuildConfig.FLAVOR, "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f10145a = new a();

        /* renamed from: b */
        private static final v f10146b = new y(false, null, 3, null);

        private a() {
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b {
        public static void a(v vVar, gc.p<? super String, ? super List<String>, e0> pVar) {
            hc.t.e(vVar, "this");
            hc.t.e(pVar, "body");
            Iterator<T> it = vVar.a().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                pVar.u((String) entry.getKey(), (List) entry.getValue());
            }
        }

        public static String b(v vVar, String str) {
            Object X;
            hc.t.e(vVar, "this");
            hc.t.e(str, "name");
            List<String> b10 = vVar.b(str);
            if (b10 == null) {
                return null;
            }
            X = c0.X(b10);
            return (String) X;
        }
    }

    Set<Map.Entry<String, List<String>>> a();

    List<String> b(String str);

    void c(gc.p<? super String, ? super List<String>, e0> pVar);

    boolean d();

    String e(String str);

    boolean isEmpty();

    Set<String> names();
}
