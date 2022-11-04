package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.profileinstaller.ProfileInstaller;
/* loaded from: classes2.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    public static final String ACTION_INSTALL_PROFILE = "androidx.profileinstaller.action.INSTALL_PROFILE";
    public static final String ACTION_SKIP_FILE = "androidx.profileinstaller.action.SKIP_FILE";
    private static final String EXTRA_SKIP_FILE_OPERATION = "EXTRA_SKIP_FILE_OPERATION";
    private static final String EXTRA_SKIP_FILE_OPERATION_DELETE = "DELETE_SKIP_FILE";
    private static final String EXTRA_SKIP_FILE_OPERATION_WRITE = "WRITE_SKIP_FILE";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (ACTION_INSTALL_PROFILE.equals(action)) {
            ProfileInstaller.writeProfile(context, ProfileInstallReceiver$$ExternalSyntheticLambda0.INSTANCE, new ResultDiagnostics(), true);
        } else if (!ACTION_SKIP_FILE.equals(action)) {
        } else {
            String string = intent.getExtras().getString(EXTRA_SKIP_FILE_OPERATION);
            if (EXTRA_SKIP_FILE_OPERATION_WRITE.equals(string)) {
                ProfileInstaller.writeSkipFile(context, ProfileInstallReceiver$$ExternalSyntheticLambda0.INSTANCE, new ResultDiagnostics());
            } else if (!EXTRA_SKIP_FILE_OPERATION_DELETE.equals(string)) {
            } else {
                ProfileInstaller.deleteSkipFile(context, ProfileInstallReceiver$$ExternalSyntheticLambda0.INSTANCE, new ResultDiagnostics());
            }
        }
    }

    /* loaded from: classes2.dex */
    class ResultDiagnostics implements ProfileInstaller.DiagnosticsCallback {
        ResultDiagnostics() {
            ProfileInstallReceiver.this = r1;
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onDiagnosticReceived(int i, Object obj) {
            ProfileInstaller.LOG_DIAGNOSTICS.onDiagnosticReceived(i, obj);
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onResultReceived(int i, Object obj) {
            ProfileInstaller.LOG_DIAGNOSTICS.onResultReceived(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }
    }
}
