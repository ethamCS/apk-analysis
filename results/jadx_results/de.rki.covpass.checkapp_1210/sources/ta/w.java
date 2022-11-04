package ta;

import hc.e0;
import hc.k0;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\b\u001a\u0004\u0018\u00010\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000f"}, d2 = {"Lta/w;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lza/c;", "_response$delegate", "Lkc/c;", "c", "()Lza/c;", "_response", "b", "response", BuildConfig.FLAVOR, "cachedResponseText", "<init>", "(Lza/c;Ljava/lang/String;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class w extends IllegalStateException {

    /* renamed from: d */
    static final /* synthetic */ oc.k<Object>[] f22140d = {k0.g(new e0(w.class, "_response", "get_response()Lio/ktor/client/statement/HttpResponse;", 0))};

    /* renamed from: c */
    private final transient kc.c f22141c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(za.c cVar, String str) {
        super("Bad response: " + cVar + ". Text: \"" + str + '\"');
        hc.t.e(cVar, "response");
        hc.t.e(str, "cachedResponseText");
        this.f22141c = nb.c.b(cVar);
    }

    private final za.c c() {
        return (za.c) this.f22141c.a(this, f22140d[0]);
    }

    public final za.c b() {
        za.c c10 = c();
        if (c10 != null) {
            return c10;
        }
        throw new IllegalStateException("Failed to access response from a different native thread".toString());
    }
}
