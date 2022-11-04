package e.a.a.g;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class g {
    public static String a(String str) {
        if (!m.c(str).booleanValue()) {
            Matcher matcher = Pattern.compile("(<(\\S+\\s+)*)(color=)('|\")([^'\"]+)('|\")((\\s+[^\\s>]+)*\\/?>)", 8).matcher(str);
            Boolean bool = Boolean.FALSE;
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                try {
                    String group = matcher.group(1);
                    String group2 = matcher.group(3);
                    String group3 = matcher.group(4);
                    Long valueOf = Long.valueOf(Long.parseLong(matcher.group(5)));
                    String group4 = matcher.group(6);
                    String group5 = matcher.group(7);
                    Integer valueOf2 = Integer.valueOf(valueOf.intValue());
                    matcher.appendReplacement(stringBuffer, group + group2 + group3 + valueOf2.toString() + group4 + group5);
                    bool = Boolean.TRUE;
                } catch (Exception unused) {
                }
            }
            if (!bool.booleanValue()) {
                return str;
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        }
        return str;
    }

    public static Spanned b(String str) {
        if (m.c(str).booleanValue()) {
            return null;
        }
        String a2 = a(str);
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(a2, 0) : Html.fromHtml(a2);
    }
}
