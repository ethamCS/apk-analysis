package ta;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lta/x;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", BuildConfig.FLAVOR, "message", "<init>", "(Ljava/lang/String;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class x extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str) {
        super(str);
        hc.t.e(str, "message");
    }
}
