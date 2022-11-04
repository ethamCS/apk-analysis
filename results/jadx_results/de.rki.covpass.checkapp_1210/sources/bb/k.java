package bb;

import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.y0;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\u0018\u0010\t\u001a\u00020\b*\u00020\u00002\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¨\u0006\n"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "c", "d", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "Ltb/e0;", "e", "ktor-http"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    private static final Set<Character> f5842a;

    static {
        Set<Character> e10;
        e10 = y0.e('(', ')', '<', '>', '@', ',', ';', ':', '\\', '\"', '/', '[', ']', '?', '=', '{', '}', ' ', '\t', '\n', '\r');
        f5842a = e10;
    }

    public static final /* synthetic */ boolean a(String str) {
        return b(str);
    }

    public static final boolean b(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (c(str)) {
            return false;
        }
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            if (f5842a.contains(Character.valueOf(str.charAt(i10)))) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }

    private static final boolean c(String str) {
        char V0;
        char W0;
        int Z;
        int U;
        if (str.length() < 2) {
            return false;
        }
        V0 = bf.a0.V0(str);
        if (V0 == '\"') {
            W0 = bf.a0.W0(str);
            if (W0 == '\"') {
                int i10 = 1;
                do {
                    Z = bf.y.Z(str, '\"', i10, false, 4, null);
                    U = bf.y.U(str);
                    if (Z == U) {
                        break;
                    }
                    int i11 = 0;
                    for (int i12 = Z - 1; str.charAt(i12) == '\\'; i12--) {
                        i11++;
                    }
                    if (i11 % 2 == 0) {
                        return false;
                    }
                    i10 = Z + 1;
                } while (i10 < str.length());
                return true;
            }
        }
        return false;
    }

    public static final String d(String str) {
        hc.t.e(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        e(str, sb2);
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    private static final void e(String str, StringBuilder sb2) {
        String str2;
        sb2.append("\"");
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char charAt = str.charAt(i10);
            if (charAt == '\\') {
                str2 = "\\\\";
            } else if (charAt == '\n') {
                str2 = "\\n";
            } else if (charAt == '\r') {
                str2 = "\\r";
            } else if (charAt == '\t') {
                str2 = "\\t";
            } else if (charAt == '\"') {
                str2 = "\\\"";
            } else {
                sb2.append(charAt);
                i10 = i11;
            }
            sb2.append(str2);
            i10 = i11;
        }
        sb2.append("\"");
    }
}
