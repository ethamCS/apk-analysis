package o5;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import androidx.core.graphics.d;
import q5.b;
/* loaded from: classes.dex */
public class a {
    private static float a(String[] strArr, int i10) {
        float parseFloat = Float.parseFloat(strArr[i10]);
        if (parseFloat < 0.0f || parseFloat > 1.0f) {
            throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
        }
        return parseFloat;
    }

    private static String b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static boolean c(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("(");
        return str.startsWith(sb2.toString()) && str.endsWith(")");
    }

    public static int d(Context context, int i10, int i11) {
        return b.c(context, i10, i11);
    }

    public static TimeInterpolator e(Context context, int i10, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            if (typedValue.type != 3) {
                throw new IllegalArgumentException("Motion easing theme attribute must be a string");
            }
            String valueOf = String.valueOf(typedValue.string);
            if (!c(valueOf, "cubic-bezier")) {
                if (c(valueOf, "path")) {
                    return androidx.core.view.animation.a.b(d.e(b(valueOf, "path")));
                }
                throw new IllegalArgumentException("Invalid motion easing type: " + valueOf);
            }
            String[] split = b(valueOf, "cubic-bezier").split(",");
            if (split.length == 4) {
                return androidx.core.view.animation.a.a(a(split, 0), a(split, 1), a(split, 2), a(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        return timeInterpolator;
    }
}
