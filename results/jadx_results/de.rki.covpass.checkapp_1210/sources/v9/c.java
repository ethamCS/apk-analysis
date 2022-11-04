package v9;

import android.content.Context;
import android.content.SharedPreferences;
import hc.t;
import kotlin.Metadata;
import l1.a;
import l1.b;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0007"}, d2 = {BuildConfig.FLAVOR, "preferencesName", "Landroid/content/SharedPreferences;", "b", "Landroid/content/Context;", "context", "a", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c {
    public static final SharedPreferences a(Context context, String str) {
        t.e(context, "context");
        t.e(str, "preferencesName");
        l1.b a10 = new b.C0238b(context, "_androidx_security_master_key_").c(b.c.AES256_GCM).a();
        t.d(a10, "Builder(context, MasterK…256_GCM)\n        .build()");
        SharedPreferences a11 = l1.a.a(context, str, a10, a.d.AES256_SIV, a.e.AES256_GCM);
        t.d(a11, "create(\n        context,…nScheme.AES256_GCM,\n    )");
        return a11;
    }

    public static final SharedPreferences b(String str) {
        t.e(str, "preferencesName");
        return a(f9.d.a().K(), str);
    }
}
