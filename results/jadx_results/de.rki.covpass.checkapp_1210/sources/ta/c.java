package ta;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lta/c;", "Lta/w;", BuildConfig.FLAVOR, "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Lza/c;", "response", "cachedResponseText", "<init>", "(Lza/c;Ljava/lang/String;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c extends w {

    /* renamed from: q */
    private final String f22040q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(za.c cVar, String str) {
        super(cVar, str);
        hc.t.e(cVar, "response");
        hc.t.e(str, "cachedResponseText");
        this.f22040q = "Client request(" + cVar.c().f().u0() + ") invalid: " + cVar.i() + ". Text: \"" + str + '\"';
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f22040q;
    }
}
