package m7;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/fragment/app/Fragment;", "T", "Landroid/os/Parcelable;", "value", "c", "(Landroidx/fragment/app/Fragment;Landroid/os/Parcelable;)Landroidx/fragment/app/Fragment;", "a", "(Landroidx/fragment/app/Fragment;)Landroid/os/Parcelable;", "b", "navigation_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class k {
    public static final <T extends Parcelable> T a(Fragment fragment) {
        hc.t.e(fragment, "<this>");
        T t10 = (T) b(fragment);
        if (t10 != null) {
            return t10;
        }
        String simpleName = fragment.getClass().getSimpleName();
        throw new IllegalStateException("No args were passed to " + simpleName);
    }

    public static final <T extends Parcelable> T b(Fragment fragment) {
        hc.t.e(fragment, "<this>");
        Bundle Q = fragment.Q();
        if (Q != null) {
            return (T) g0.a(Q);
        }
        return null;
    }

    public static final <T extends Fragment> T c(T t10, Parcelable parcelable) {
        hc.t.e(t10, "<this>");
        hc.t.e(parcelable, "value");
        t10.Y1(g0.b(new Bundle(), parcelable));
        return t10;
    }
}
