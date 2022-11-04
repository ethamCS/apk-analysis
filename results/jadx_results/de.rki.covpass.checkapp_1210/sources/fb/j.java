package fb;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0007¨\u0006\u0006"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "ktor-utils"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class j {
    public static final boolean a(char c10) {
        return Character.toLowerCase(c10) == c10;
    }

    public static final char[] b(String str) {
        hc.t.e(str, "<this>");
        int length = str.length();
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = str.charAt(i10);
        }
        return cArr;
    }
}
