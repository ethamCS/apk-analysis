package androidx.biometric;

import android.os.Build;
import android.os.CancellationSignal;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CancellationSignalProvider {
    private static final String TAG = "CancelSignalProvider";
    private CancellationSignal mBiometricCancellationSignal;
    private androidx.core.os.CancellationSignal mFingerprintCancellationSignal;
    private final Injector mInjector;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface Injector {
        CancellationSignal getBiometricCancellationSignal();

        androidx.core.os.CancellationSignal getFingerprintCancellationSignal();
    }

    public CancellationSignalProvider() {
        this.mInjector = new Injector() { // from class: androidx.biometric.CancellationSignalProvider.1
            @Override // androidx.biometric.CancellationSignalProvider.Injector
            public CancellationSignal getBiometricCancellationSignal() {
                return Api16Impl.create();
            }

            @Override // androidx.biometric.CancellationSignalProvider.Injector
            public androidx.core.os.CancellationSignal getFingerprintCancellationSignal() {
                return new androidx.core.os.CancellationSignal();
            }
        };
    }

    CancellationSignalProvider(Injector injector) {
        this.mInjector = injector;
    }

    public CancellationSignal getBiometricCancellationSignal() {
        if (this.mBiometricCancellationSignal == null) {
            this.mBiometricCancellationSignal = this.mInjector.getBiometricCancellationSignal();
        }
        return this.mBiometricCancellationSignal;
    }

    public androidx.core.os.CancellationSignal getFingerprintCancellationSignal() {
        if (this.mFingerprintCancellationSignal == null) {
            this.mFingerprintCancellationSignal = this.mInjector.getFingerprintCancellationSignal();
        }
        return this.mFingerprintCancellationSignal;
    }

    public void cancel() {
        CancellationSignal cancellationSignal;
        if (Build.VERSION.SDK_INT >= 16 && (cancellationSignal = this.mBiometricCancellationSignal) != null) {
            try {
                Api16Impl.cancel(cancellationSignal);
            } catch (NullPointerException e) {
                Log.e(TAG, "Got NPE while canceling biometric authentication.", e);
            }
            this.mBiometricCancellationSignal = null;
        }
        androidx.core.os.CancellationSignal cancellationSignal2 = this.mFingerprintCancellationSignal;
        if (cancellationSignal2 != null) {
            try {
                cancellationSignal2.cancel();
            } catch (NullPointerException e2) {
                Log.e(TAG, "Got NPE while canceling fingerprint authentication.", e2);
            }
            this.mFingerprintCancellationSignal = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class Api16Impl {
        private Api16Impl() {
        }

        static CancellationSignal create() {
            return new CancellationSignal();
        }

        static void cancel(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }
    }
}
