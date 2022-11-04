package fb;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0000¨\u0006\u0007"}, d2 = {BuildConfig.FLAVOR, "c", BuildConfig.FLAVOR, "ch", "b", "Lfb/i;", "a", "ktor-utils"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a0 {
    public static final i a(String str) {
        hc.t.e(str, "<this>");
        return new i(str);
    }

    private static final char b(char c10) {
        boolean z10 = true;
        if ('A' <= c10 && c10 < '[') {
            return (char) (c10 + ' ');
        }
        if (c10 < 0 || c10 >= 128) {
            z10 = false;
        }
        return z10 ? c10 : Character.toLowerCase(c10);
    }

    public static final String c(String str) {
        int U;
        hc.t.e(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            int i11 = i10 + 1;
            char charAt = str.charAt(i10);
            if (b(charAt) != charAt) {
                break;
            }
            i10 = i11;
        }
        if (i10 == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append((CharSequence) str, 0, i10);
        U = bf.y.U(str);
        if (i10 <= U) {
            while (true) {
                int i12 = i10 + 1;
                sb2.append(b(str.charAt(i10)));
                if (i10 == U) {
                    break;
                }
                i10 = i12;
            }
        }
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
