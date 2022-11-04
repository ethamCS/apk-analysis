package m7;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0012\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001d\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/os/Bundle;", "Landroid/os/Parcelable;", "value", "b", "T", "a", "(Landroid/os/Bundle;)Landroid/os/Parcelable;", "navigation_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class g0 {
    public static final <T extends Parcelable> T a(Bundle bundle) {
        hc.t.e(bundle, "<this>");
        return (T) bundle.getParcelable("com.ibm.health.common.navigation.EXTRA_ARGS");
    }

    public static final Bundle b(Bundle bundle, Parcelable parcelable) {
        hc.t.e(bundle, "<this>");
        hc.t.e(parcelable, "value");
        bundle.putParcelable("com.ibm.health.common.navigation.EXTRA_ARGS", parcelable);
        return bundle;
    }
}
