package e.a.a.g;

import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class l {
    public static String a(String str) {
        if (str != null) {
            Pattern compile = Pattern.compile("^https?:\\/\\/", 2);
            Pattern compile2 = Pattern.compile("^(asset:\\/\\/)(.*)", 2);
            Pattern compile3 = Pattern.compile("^(file:\\/\\/)(.*)", 2);
            Pattern compile4 = Pattern.compile("^(resource:\\/\\/)(.*)", 2);
            if (compile.matcher(str).find()) {
                return str;
            }
            if (compile2.matcher(str).find()) {
                return compile2.matcher(str).replaceAll("$2");
            }
            if (compile3.matcher(str).find()) {
                return compile3.matcher(str).replaceAll("/$2");
            }
            if (!compile4.matcher(str).find()) {
                return null;
            }
            return compile4.matcher(str).replaceAll("$2");
        }
        return null;
    }

    public static e.a.a.e.e.e b(String str) {
        if (str != null) {
            if (d("^https?:\\/\\/", str, Boolean.FALSE).booleanValue()) {
                return e.a.a.e.e.e.Network;
            }
            if (c("^file?:\\/\\/", str).booleanValue()) {
                return e.a.a.e.e.e.File;
            }
            if (c("^resource?:\\/\\/", str).booleanValue()) {
                return e.a.a.e.e.e.Resource;
            }
            if (c("^asset?:\\/\\/", str).booleanValue()) {
                return e.a.a.e.e.e.Asset;
            }
        }
        return e.a.a.e.e.e.Unknown;
    }

    public static Boolean c(String str, String str2) {
        return d(str, str2, Boolean.TRUE);
    }

    public static Boolean d(String str, String str2, Boolean bool) {
        return Boolean.valueOf(Pattern.compile(str, 2).matcher(str2).find() && (!bool.booleanValue() || !str2.replaceFirst(str, "").isEmpty()));
    }
}
