package r7;

import android.os.SystemClock;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lr7/a;", "Lq7/b;", BuildConfig.FLAVOR, "b", "d", "<init>", "()V", "kronos-android_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class a implements q7.b {
    @Override // q7.b
    public long b() {
        return System.currentTimeMillis();
    }

    @Override // q7.b
    public long d() {
        return SystemClock.elapsedRealtime();
    }
}
