package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private static final Locale f3595a = new Locale(BuildConfig.FLAVOR, BuildConfig.FLAVOR);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static int a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    public static int a(Locale locale) {
        return a.a(locale);
    }
}
