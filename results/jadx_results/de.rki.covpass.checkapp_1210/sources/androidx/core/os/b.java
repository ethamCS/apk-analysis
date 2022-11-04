package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\f"}, d2 = {"Landroidx/core/os/b;", BuildConfig.FLAVOR, "Landroid/os/Bundle;", "bundle", BuildConfig.FLAVOR, "key", "Landroid/os/IBinder;", "value", "Ltb/e0;", "a", "<init>", "()V", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class b {

    /* renamed from: a */
    public static final b f3493a = new b();

    private b() {
    }

    @fc.c
    public static final void a(Bundle bundle, String str, IBinder iBinder) {
        t.e(bundle, "bundle");
        t.e(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
