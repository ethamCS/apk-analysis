package s7;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls7/e;", "Ljava/lang/RuntimeException;", BuildConfig.FLAVOR, "message", "<init>", "(Ljava/lang/String;)V", "kronos-java"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class e extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str) {
        super(str);
        t.e(str, "message");
    }
}
