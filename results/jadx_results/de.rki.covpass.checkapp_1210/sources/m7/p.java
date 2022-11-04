package m7;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u000b"}, d2 = {"Lm7/p;", BuildConfig.FLAVOR, "Landroidx/fragment/app/f0;", "transaction", "Landroidx/fragment/app/Fragment;", "fragment", "Ltb/e0;", "b", "a", "c", "d", "navigation_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface p {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(p pVar, androidx.fragment.app.f0 f0Var, Fragment fragment) {
            hc.t.e(f0Var, "transaction");
            hc.t.e(fragment, "fragment");
            q.a(f0Var, fragment);
        }
    }

    void a(androidx.fragment.app.f0 f0Var, Fragment fragment);

    void b(androidx.fragment.app.f0 f0Var, Fragment fragment);

    void c(Fragment fragment);

    void d(Fragment fragment);
}
