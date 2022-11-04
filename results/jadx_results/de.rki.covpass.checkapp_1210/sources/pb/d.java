package pb;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpb/d;", "Ljava/lang/Exception;", "Lkotlin/Exception;", BuildConfig.FLAVOR, "message", "<init>", "(Ljava/lang/String;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str) {
        super(str);
        t.e(str, "message");
    }
}
