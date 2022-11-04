package com.zell_mbc.medilog.utility;

import android.content.Context;
import androidx.biometric.BiometricManager;
import com.zell_mbc.medilog.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BiometricHelper.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/zell_mbc/medilog/utility/BiometricHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "biometricManager", "Landroidx/biometric/BiometricManager;", "getContext", "()Landroid/content/Context;", "setContext", "userOutputService", "Lcom/zell_mbc/medilog/utility/UserOutputService;", "canAuthenticate", "", "notify", "", "hasHardware", "app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class BiometricHelper {
    public static final int $stable = 8;
    private BiometricManager biometricManager;
    private Context context;
    private UserOutputService userOutputService;

    public BiometricHelper(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        BiometricManager from = BiometricManager.from(context);
        Intrinsics.checkNotNullExpressionValue(from, "from(context)");
        this.biometricManager = from;
        this.userOutputService = new UserOutputServiceImpl(this.context, null);
    }

    public final Context getContext() {
        return this.context;
    }

    public final void setContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final int canAuthenticate(boolean z) {
        int canAuthenticate = this.biometricManager.canAuthenticate(255);
        if (canAuthenticate != 0) {
            if (canAuthenticate == 1) {
                UserOutputService userOutputService = this.userOutputService;
                String string = this.context.getString(R.string.biometricHardwareUnavailable);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…etricHardwareUnavailable)");
                userOutputService.showAndHideMessageForLong(string);
                return -2;
            } else if (canAuthenticate == 11) {
                if (!z) {
                    return -3;
                }
                UserOutputService userOutputService2 = this.userOutputService;
                String string2 = this.context.getString(R.string.noCredentials);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.noCredentials)");
                userOutputService2.showAndHideMessageForLong(string2);
                return -3;
            } else if (canAuthenticate != 12) {
                return -4;
            } else {
                if (!z) {
                    return -1;
                }
                UserOutputService userOutputService3 = this.userOutputService;
                String string3 = this.context.getString(R.string.noBiometricHardware);
                Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.string.noBiometricHardware)");
                userOutputService3.showAndHideMessageForLong(string3);
                return -1;
            }
        }
        return 0;
    }

    public final boolean hasHardware(boolean z) {
        int canAuthenticate = this.biometricManager.canAuthenticate(255);
        if (canAuthenticate == 1) {
            if (z) {
                UserOutputService userOutputService = this.userOutputService;
                String string = this.context.getString(R.string.biometricHardwareUnavailable);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…etricHardwareUnavailable)");
                userOutputService.showAndHideMessageForLong(string);
            }
            return false;
        } else if (canAuthenticate != 12 || !z) {
            return true;
        } else {
            UserOutputService userOutputService2 = this.userOutputService;
            String string2 = this.context.getString(R.string.noBiometricHardware);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.noBiometricHardware)");
            userOutputService2.showAndHideMessageForLong(string2);
            return false;
        }
    }
}
