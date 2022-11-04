package com.zell_mbc.medilog.utility;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.preference.PreferenceManager;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import java.io.IOException;
import java.security.GeneralSecurityException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Preferences.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\nJ\b\u0010\u0010\u001a\u00020\nH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/zell_mbc/medilog/utility/Preferences;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "isEncrypted", "", "preferences", "Landroid/content/SharedPreferences;", "getPreferences", "()Landroid/content/SharedPreferences;", "setPreferences", "(Landroid/content/SharedPreferences;)V", "getManager", "getSharedPreferences", "SingletonFactory", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Preferences {
    private static Preferences instance;
    private final Context context;
    private boolean isEncrypted;
    public SharedPreferences preferences;
    public static final SingletonFactory SingletonFactory = new SingletonFactory(null);
    public static final int $stable = 8;

    public Preferences(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final Context getContext() {
        return this.context;
    }

    public final SharedPreferences getPreferences() {
        SharedPreferences sharedPreferences = this.preferences;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        Intrinsics.throwUninitializedPropertyAccessException("preferences");
        return null;
    }

    public final void setPreferences(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<set-?>");
        this.preferences = sharedPreferences;
    }

    public final SharedPreferences getManager() {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                MasterKey build = new MasterKey.Builder(this.context, MasterKey.DEFAULT_MASTER_KEY_ALIAS).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build();
                Intrinsics.checkNotNullExpressionValue(build, "Builder(context, MasterK…                 .build()");
                this.isEncrypted = true;
                SharedPreferences create = EncryptedSharedPreferences.create(this.context, "medilog_prefs", build, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
                Intrinsics.checkNotNullExpressionValue(create, "create(\n                …ryptionScheme.AES256_GCM)");
                setPreferences(create);
                return getPreferences();
            } catch (IOException e) {
                this.isEncrypted = false;
                e.printStackTrace();
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.context);
                Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(context)");
                return defaultSharedPreferences;
            } catch (GeneralSecurityException e2) {
                this.isEncrypted = false;
                e2.printStackTrace();
                SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(this.context);
                Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences2, "getDefaultSharedPreferences(context)");
                return defaultSharedPreferences2;
            }
        }
        SharedPreferences defaultSharedPreferences3 = PreferenceManager.getDefaultSharedPreferences(this.context);
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences3, "getDefaultSharedPreferences(context)");
        return defaultSharedPreferences3;
    }

    public final SharedPreferences getSharedPreferences() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.context);
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(context)");
        return defaultSharedPreferences;
    }

    /* compiled from: Preferences.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/zell_mbc/medilog/utility/Preferences$SingletonFactory;", "", "()V", "instance", "Lcom/zell_mbc/medilog/utility/Preferences;", "getEncryptedOrSharedPreferences", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "getInstance", "getSharedPreferences", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class SingletonFactory {
        public /* synthetic */ SingletonFactory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private SingletonFactory() {
        }

        private final Preferences getInstance(Context context) {
            if (Preferences.instance == null) {
                Preferences.instance = new Preferences(context);
            }
            return Preferences.instance;
        }

        public final SharedPreferences getEncryptedOrSharedPreferences(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Preferences singletonFactory = getInstance(context);
            Intrinsics.checkNotNull(singletonFactory);
            return singletonFactory.getManager();
        }

        public final SharedPreferences getSharedPreferences(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Preferences singletonFactory = getInstance(context);
            Intrinsics.checkNotNull(singletonFactory);
            return singletonFactory.getSharedPreferences();
        }
    }
}
