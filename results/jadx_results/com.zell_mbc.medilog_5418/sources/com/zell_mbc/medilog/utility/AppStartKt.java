package com.zell_mbc.medilog.utility;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.zell_mbc.medilog.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppStart.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LAST_APP_VERSION", "", "checkAppStart", "Lcom/zell_mbc/medilog/utility/AppStart;", "c", "Landroid/content/Context;", "app_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppStartKt {
    private static final String LAST_APP_VERSION = "last_app_version";

    public static final AppStart checkAppStart(Context c) {
        Intrinsics.checkNotNullParameter(c, "c");
        SharedPreferences sharedPreferences = Preferences.SingletonFactory.getSharedPreferences(c);
        int i = sharedPreferences.getInt(LAST_APP_VERSION, -1);
        if (i == -1 && sharedPreferences.getBoolean("DISCLAIMERCONFIRMED", false)) {
            i = 0;
        }
        sharedPreferences.edit().putInt(LAST_APP_VERSION, BuildConfig.VERSION_CODE).apply();
        if (i == -1) {
            return AppStart.FIRST_TIME;
        }
        if (i < 5418) {
            return AppStart.FIRST_TIME_VERSION;
        }
        if (i > 5418) {
            Log.w("Warning", "Current version code (" + BuildConfig.VERSION_CODE + ") is less then the one recognized on last startup (" + i + "$). Defensively assuming normal app start.");
            return AppStart.NORMAL;
        }
        return AppStart.NORMAL;
    }
}
