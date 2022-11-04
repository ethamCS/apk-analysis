package w7;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw7/b;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", BuildConfig.FLAVOR, "message", "<init>", "(Ljava/lang/String;)V", "covpass-base45"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super(str);
        t.e(str, "message");
    }
}
