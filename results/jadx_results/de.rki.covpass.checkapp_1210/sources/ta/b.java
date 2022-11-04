package ta;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a@\u0010\u0007\u001a\u00020\u0000*\u00020\u00002(\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Loa/b;", "Lkotlin/Function3;", BuildConfig.FLAVOR, "Lxb/d;", "Ltb/e0;", BuildConfig.FLAVOR, "listener", "c", "(Loa/b;Lgc/q;)Loa/b;", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private static final fb.a<gc.q<Long, Long, xb.d<? super e0>, Object>> f22038a = new fb.a<>("UploadProgressListenerAttributeKey");

    /* renamed from: b */
    private static final fb.a<gc.q<Long, Long, xb.d<? super e0>, Object>> f22039b = new fb.a<>("DownloadProgressListenerAttributeKey");

    public static final /* synthetic */ fb.a a() {
        return f22039b;
    }

    public static final /* synthetic */ fb.a b() {
        return f22038a;
    }

    public static final oa.b c(oa.b bVar, gc.q<? super Long, ? super Long, ? super xb.d<? super e0>, ? extends Object> qVar) {
        hc.t.e(bVar, "<this>");
        hc.t.e(qVar, "listener");
        return wa.b.a(bVar, ab.a.a(bVar.g().d(), bVar.h(), bb.t.b(bVar.g()), qVar));
    }
}
