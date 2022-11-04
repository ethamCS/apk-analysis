package bf;

import hc.p0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.k0;
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0004\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\f\u0010\r\u001a\u00020\u0000*\u00020\fH\u0007\u001a \u0010\u0011\u001a\u00020\u0000*\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007\u001a\f\u0010\u0013\u001a\u00020\u0000*\u00020\u0012H\u0007\u001a\f\u0010\u0014\u001a\u00020\u0012*\u00020\u0000H\u0007\u001a\u001c\u0010\u0016\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a$\u0010\u0017\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\u001c\u0010\u0019\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\n\u0010\u001b\u001a\u00020\u0002*\u00020\u001a\u001a4\u0010\u001f\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001a\u0012\u0010!\u001a\u00020\u0000*\u00020\u001a2\u0006\u0010 \u001a\u00020\u000e\"%\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00000#j\b\u0012\u0004\u0012\u00020\u0000`$*\u00020\"8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "ignoreCase", "v", BuildConfig.FLAVOR, "oldChar", "newChar", "B", "oldValue", "newValue", "C", BuildConfig.FLAVOR, "p", BuildConfig.FLAVOR, "startIndex", "endIndex", "q", BuildConfig.FLAVOR, "r", "s", "prefix", "G", "F", "suffix", "t", BuildConfig.FLAVOR, "x", "thisOffset", "otherOffset", "length", "y", "n", "A", "Lkotlin/String$Companion;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "w", "(Lhc/p0;)Ljava/util/Comparator;", "CASE_INSENSITIVE_ORDER", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class x extends w {
    public static String A(CharSequence charSequence, int i10) {
        hc.t.e(charSequence, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        } else if (i10 == 0) {
            return BuildConfig.FLAVOR;
        } else {
            if (i10 == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return BuildConfig.FLAVOR;
            }
            if (length == 1) {
                char charAt = charSequence.charAt(0);
                char[] cArr = new char[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    cArr[i11] = charAt;
                }
                return new String(cArr);
            }
            StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
            k0 it = new nc.g(1, i10).iterator();
            while (it.hasNext()) {
                it.b();
                sb2.append(charSequence);
            }
            String sb3 = sb2.toString();
            hc.t.d(sb3, "{\n                    va…tring()\n                }");
            return sb3;
        }
    }

    public static final String B(String str, char c10, char c11, boolean z10) {
        String sb2;
        String str2;
        hc.t.e(str, "<this>");
        if (!z10) {
            sb2 = str.replace(c10, c11);
            str2 = "this as java.lang.String…replace(oldChar, newChar)";
        } else {
            StringBuilder sb3 = new StringBuilder(str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (c.e(charAt, c10, z10)) {
                    charAt = c11;
                }
                sb3.append(charAt);
            }
            sb2 = sb3.toString();
            str2 = "StringBuilder(capacity).…builderAction).toString()";
        }
        hc.t.d(sb2, str2);
        return sb2;
    }

    public static String C(String str, String str2, String str3, boolean z10) {
        int b10;
        hc.t.e(str, "<this>");
        hc.t.e(str2, "oldValue");
        hc.t.e(str3, "newValue");
        int i10 = 0;
        int W = y.W(str, str2, 0, z10);
        if (W < 0) {
            return str;
        }
        int length = str2.length();
        b10 = nc.m.b(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, W);
            sb2.append(str3);
            i10 = W + length;
            if (W >= str.length()) {
                break;
            }
            W = y.W(str, str2, W + b10, z10);
        } while (W > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String sb3 = sb2.toString();
        hc.t.d(sb3, "stringBuilder.append(this, i, length).toString()");
        return sb3;
    }

    public static /* synthetic */ String D(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return B(str, c10, c11, z10);
    }

    public static /* synthetic */ String E(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        String C;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        C = C(str, str2, str3, z10);
        return C;
    }

    public static boolean F(String str, String str2, int i10, boolean z10) {
        hc.t.e(str, "<this>");
        hc.t.e(str2, "prefix");
        return !z10 ? str.startsWith(str2, i10) : y(str, i10, str2, 0, str2.length(), z10);
    }

    public static boolean G(String str, String str2, boolean z10) {
        hc.t.e(str, "<this>");
        hc.t.e(str2, "prefix");
        return !z10 ? str.startsWith(str2) : y(str, 0, str2, 0, str2.length(), z10);
    }

    public static /* synthetic */ boolean H(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        boolean F;
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        F = F(str, str2, i10, z10);
        return F;
    }

    public static /* synthetic */ boolean I(String str, String str2, boolean z10, int i10, Object obj) {
        boolean G;
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        G = G(str, str2, z10);
        return G;
    }

    public static String p(char[] cArr) {
        hc.t.e(cArr, "<this>");
        return new String(cArr);
    }

    public static String q(char[] cArr, int i10, int i11) {
        hc.t.e(cArr, "<this>");
        ub.c.Companion.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static String r(byte[] bArr) {
        hc.t.e(bArr, "<this>");
        return new String(bArr, d.f5986b);
    }

    public static byte[] s(String str) {
        hc.t.e(str, "<this>");
        byte[] bytes = str.getBytes(d.f5986b);
        hc.t.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final boolean t(String str, String str2, boolean z10) {
        hc.t.e(str, "<this>");
        hc.t.e(str2, "suffix");
        return !z10 ? str.endsWith(str2) : y(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean u(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return t(str, str2, z10);
    }

    public static boolean v(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static Comparator<String> w(p0 p0Var) {
        hc.t.e(p0Var, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        hc.t.d(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    public static boolean x(CharSequence charSequence) {
        nc.g T;
        boolean z10;
        boolean c10;
        hc.t.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            T = y.T(charSequence);
            if (!(T instanceof Collection) || !((Collection) T).isEmpty()) {
                Iterator<Integer> it = T.iterator();
                while (it.hasNext()) {
                    c10 = b.c(charSequence.charAt(((k0) it).b()));
                    if (!c10) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public static final boolean y(String str, int i10, String str2, int i11, int i12, boolean z10) {
        hc.t.e(str, "<this>");
        hc.t.e(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static /* synthetic */ boolean z(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return y(str, i10, str2, i11, i12, z10);
    }
}
