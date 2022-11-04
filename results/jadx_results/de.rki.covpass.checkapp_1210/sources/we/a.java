package we;

import bf.y;
import hc.t;
import java.util.Iterator;
import java.util.Locale;
import nc.g;
/* loaded from: classes3.dex */
public final class a {
    public static final String a(String str) {
        t.e(str, "<this>");
        boolean z10 = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            z10 = true;
        }
        if (!z10) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        t.d(substring, "this as java.lang.String).substring(startIndex)");
        return upperCase + substring;
    }

    public static final String b(String str) {
        t.e(str, "<this>");
        boolean z10 = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' <= charAt && charAt < '[') {
            z10 = true;
        }
        if (!z10) {
            return str;
        }
        char lowerCase = Character.toLowerCase(charAt);
        String substring = str.substring(1);
        t.d(substring, "this as java.lang.String).substring(startIndex)");
        return lowerCase + substring;
    }

    public static final String c(String str, boolean z10) {
        g T;
        Integer num;
        t.e(str, "<this>");
        if ((str.length() == 0) || !d(str, 0, z10)) {
            return str;
        }
        if (str.length() == 1 || !d(str, 1, z10)) {
            if (z10) {
                return b(str);
            }
            if (!(str.length() > 0)) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String substring = str.substring(1);
            t.d(substring, "this as java.lang.String).substring(startIndex)");
            return lowerCase + substring;
        }
        T = y.T(str);
        Iterator<Integer> it = T.iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = it.next();
            if (!d(str, num.intValue(), z10)) {
                break;
            }
        }
        Integer num2 = num;
        if (num2 == null) {
            return e(str, z10);
        }
        int intValue = num2.intValue() - 1;
        StringBuilder sb2 = new StringBuilder();
        String substring2 = str.substring(0, intValue);
        t.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(e(substring2, z10));
        String substring3 = str.substring(intValue);
        t.d(substring3, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring3);
        return sb2.toString();
    }

    private static final boolean d(String str, int i10, boolean z10) {
        char charAt = str.charAt(i10);
        return z10 ? 'A' <= charAt && charAt < '[' : Character.isUpperCase(charAt);
    }

    private static final String e(String str, boolean z10) {
        if (z10) {
            return f(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        t.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public static final String f(String str) {
        t.e(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        t.d(sb3, "builder.toString()");
        return sb3;
    }
}
