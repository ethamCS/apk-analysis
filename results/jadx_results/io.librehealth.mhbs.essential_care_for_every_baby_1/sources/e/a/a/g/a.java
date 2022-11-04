package e.a.a.g;

import android.content.Context;
/* loaded from: classes.dex */
public class a extends l {
    public static int e(Context context, String str) {
        String[] split = l.a(str).split("\\/");
        try {
            String str2 = split[0];
            String str3 = split[1];
            int identifier = context.getResources().getIdentifier(String.format("res_%1s", str3), str2, context.getPackageName());
            return identifier == 0 ? context.getResources().getIdentifier(str3, str2, context.getPackageName()) : identifier;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static Boolean f(Context context, String str) {
        Boolean bool = Boolean.FALSE;
        if (str != null) {
            if (l.c("^resource?:\\/\\/", str).booleanValue()) {
                return g(context, str);
            }
            if (!l.d("^https?:\\/\\/", str, bool).booleanValue() && !l.c("^file?:\\/\\/", str).booleanValue() && l.c("^asset?:\\/\\/", str).booleanValue()) {
            }
        }
        return bool;
    }

    private static Boolean g(Context context, String str) {
        if (str != null) {
            return Boolean.valueOf(e(context, str) > 0);
        }
        return Boolean.FALSE;
    }
}
