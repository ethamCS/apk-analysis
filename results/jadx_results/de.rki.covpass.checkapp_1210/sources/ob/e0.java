package ob;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lob/e0;", "Ljava/lang/Exception;", "Lkotlin/Exception;", BuildConfig.FLAVOR, "message", "<init>", "(Ljava/lang/String;)V", "name", BuildConfig.FLAVOR, "size", "availableSpace", "(Ljava/lang/String;II)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class e0 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(String str) {
        super(str);
        hc.t.e(str, "message");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(String str, int i10, int i11) {
        this("Not enough free space to write " + str + " of " + i10 + " bytes, available " + i11 + " bytes.");
        hc.t.e(str, "name");
    }
}
