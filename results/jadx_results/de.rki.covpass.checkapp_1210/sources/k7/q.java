package k7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u000b"}, d2 = {"Lk7/q;", BuildConfig.FLAVOR, "Ljava/util/Locale;", "e", BuildConfig.FLAVOR, "f", "Landroid/content/SharedPreferences;", "prefs", "<init>", "(Landroid/content/SharedPreferences;)V", "a", "android-utils_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class q {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private static String f14673b;

    /* renamed from: c */
    private static List<String> f14674c;

    /* renamed from: d */
    private static q f14675d;

    /* renamed from: a */
    private SharedPreferences f14676a;

    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lk7/q$a;", BuildConfig.FLAVOR, "Landroid/content/Context;", "baseContext", "Lk7/q;", "a", "newBase", "b", "Ljava/util/Locale;", "locale", "c", BuildConfig.FLAVOR, "DEBUG_LANGUAGE", "Ljava/lang/String;", "KEY_IS_DEBUG_MODE", "KEY_ORIGINAL_LANGUAGE", "PREFS_NAME", "instance", "Lk7/q;", "<init>", "()V", "android-utils_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final q a(Context context) {
            q qVar = q.f14675d;
            if (qVar == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("debug_language_preferences", 0);
                hc.t.d(sharedPreferences, "baseContext.getSharedPre…ME, Context.MODE_PRIVATE)");
                q qVar2 = new q(sharedPreferences);
                a aVar = q.Companion;
                q.f14675d = qVar2;
                return qVar2;
            }
            return qVar;
        }

        public final Context b(Context context) {
            hc.t.e(context, "newBase");
            q a10 = a(context);
            return q.Companion.c(context, (!c.d() || !a10.f()) ? a10.e() : new Locale("zu"));
        }

        public final Context c(Context context, Locale locale) {
            hc.t.e(context, "baseContext");
            hc.t.e(locale, "locale");
            Locale.setDefault(locale);
            Configuration configuration = context.getResources().getConfiguration();
            configuration.setLocale(locale);
            Context createConfigurationContext = context.createConfigurationContext(configuration);
            hc.t.d(createConfigurationContext, "baseContext.createConfig…         },\n            )");
            return createConfigurationContext;
        }
    }

    static {
        List<String> d10;
        String language = Locale.GERMANY.getLanguage();
        hc.t.d(language, "GERMANY.language");
        f14673b = language;
        d10 = ub.t.d(language);
        f14674c = d10;
    }

    public q(SharedPreferences sharedPreferences) {
        hc.t.e(sharedPreferences, "prefs");
        this.f14676a = sharedPreferences;
    }

    public final Locale e() {
        String string = this.f14676a.getString("original_language", null);
        Locale locale = string != null ? new Locale(string) : Locale.getDefault();
        List<String> list = f14674c;
        boolean z10 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (hc.t.a((String) it.next(), locale.getLanguage())) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z10) {
            hc.t.d(locale, "{\n            originalLocale\n        }");
            return locale;
        }
        return new Locale(f14673b);
    }

    public final boolean f() {
        return this.f14676a.getBoolean("is_debug_mode", false);
    }
}
