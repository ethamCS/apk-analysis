package of;

import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\tJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\n"}, d2 = {"Lof/n;", BuildConfig.FLAVOR, "Lof/u;", "url", BuildConfig.FLAVOR, "Lof/m;", "cookies", "Ltb/e0;", "b", "a", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface n {
    public static final a Companion = a.f18277a;

    /* renamed from: a */
    public static final n f18276a = new a.C0288a();

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\b"}, d2 = {"Lof/n$a;", BuildConfig.FLAVOR, "Lof/n;", "NO_COOKIES", "Lof/n;", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f18277a = new a();

        @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lof/n$a$a;", "Lof/n;", "Lof/u;", "url", BuildConfig.FLAVOR, "Lof/m;", "cookies", "Ltb/e0;", "b", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
        /* renamed from: of.n$a$a */
        /* loaded from: classes3.dex */
        private static final class C0288a implements n {
            @Override // of.n
            public List<m> a(u uVar) {
                List<m> h10;
                hc.t.e(uVar, "url");
                h10 = ub.u.h();
                return h10;
            }

            @Override // of.n
            public void b(u uVar, List<m> list) {
                hc.t.e(uVar, "url");
                hc.t.e(list, "cookies");
            }
        }

        private a() {
        }
    }

    List<m> a(u uVar);

    void b(u uVar, List<m> list);
}
