package ak;
/* loaded from: classes3.dex */
public class f {
    private static boolean a(String str, int i10) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt >= 0 && parseInt <= i10;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean b(String str) {
        int indexOf;
        if (str.length() == 0) {
            return false;
        }
        String str2 = str + ".";
        int i10 = 0;
        int i11 = 0;
        while (i10 < str2.length() && (indexOf = str2.indexOf(46, i10)) > i10) {
            if (i11 == 4) {
                return false;
            }
            try {
                int parseInt = Integer.parseInt(str2.substring(i10, indexOf));
                if (parseInt >= 0 && parseInt <= 255) {
                    i10 = indexOf + 1;
                    i11++;
                }
            } catch (NumberFormatException unused) {
            }
            return false;
        }
        return i11 == 4;
    }

    public static boolean c(String str) {
        int indexOf = str.indexOf("/");
        String substring = str.substring(indexOf + 1);
        if (indexOf <= 0 || !b(str.substring(0, indexOf))) {
            return false;
        }
        return b(substring) || a(substring, 32);
    }

    public static boolean d(String str) {
        int indexOf;
        if (str.length() == 0) {
            return false;
        }
        String str2 = str + ":";
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (i10 < str2.length() && (indexOf = str2.indexOf(58, i10)) >= i10) {
            if (i11 == 8) {
                return false;
            }
            if (i10 != indexOf) {
                String substring = str2.substring(i10, indexOf);
                if (indexOf != str2.length() - 1 || substring.indexOf(46) <= 0) {
                    try {
                        int parseInt = Integer.parseInt(str2.substring(i10, indexOf), 16);
                        if (parseInt >= 0 && parseInt <= 65535) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    return false;
                } else if (!b(substring)) {
                    return false;
                } else {
                    i11++;
                }
            } else if (indexOf != 1 && indexOf != str2.length() - 1 && z10) {
                return false;
            } else {
                z10 = true;
            }
            i10 = indexOf + 1;
            i11++;
        }
        return i11 == 8 || z10;
    }

    public static boolean e(String str) {
        int indexOf = str.indexOf("/");
        String substring = str.substring(indexOf + 1);
        if (indexOf <= 0 || !d(str.substring(0, indexOf))) {
            return false;
        }
        return d(substring) || a(substring, 128);
    }
}
