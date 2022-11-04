package com.zell_mbc.medilog;

import android.app.Application;
import android.content.SharedPreferences;
import com.zell_mbc.medilog.settings.SettingsActivity;
import com.zell_mbc.medilog.utility.BiometricHelper;
import com.zell_mbc.medilog.utility.Preferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MediLog.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/zell_mbc/medilog/MediLog;", "Landroid/app/Application;", "()V", "authenticated", "", "hasBiometric", "preferences", "Landroid/content/SharedPreferences;", "isAuthenticated", "onCreate", "", "setAuthenticated", "b", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class MediLog extends Application {
    public static final int $stable = 8;
    private boolean authenticated;
    private boolean hasBiometric = true;
    private SharedPreferences preferences;

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        MediLog mediLog = this;
        SharedPreferences sharedPreferences = Preferences.SingletonFactory.getSharedPreferences(mediLog);
        this.preferences = sharedPreferences;
        SharedPreferences sharedPreferences2 = null;
        if (!this.authenticated) {
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preferences");
                sharedPreferences = null;
            }
            if (!sharedPreferences.getBoolean(SettingsActivity.KEY_PREF_BIOMETRIC, false)) {
                this.authenticated = true;
            } else if (new BiometricHelper(mediLog).hasHardware(false)) {
                this.authenticated = false;
            } else {
                this.authenticated = true;
                this.hasBiometric = false;
            }
        }
        SharedPreferences sharedPreferences3 = this.preferences;
        if (sharedPreferences3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preferences");
            sharedPreferences3 = null;
        }
        if (Intrinsics.areEqual(sharedPreferences3.getString(SettingsActivity.KEY_PREF_COLOUR_STYLE, getString(R.string.blue)), "")) {
            SharedPreferences sharedPreferences4 = this.preferences;
            if (sharedPreferences4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("preferences");
            } else {
                sharedPreferences2 = sharedPreferences4;
            }
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            edit.putString(SettingsActivity.KEY_PREF_COLOUR_STYLE, getString(R.string.blue));
            edit.apply();
        }
    }

    public final void setAuthenticated(boolean z) {
        this.authenticated = z;
    }

    public final boolean isAuthenticated() {
        return this.authenticated;
    }
}
