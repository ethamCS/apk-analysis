package ec;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.f;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001¨\u0006\u0005"}, d2 = {"Ljava/lang/AutoCloseable;", BuildConfig.FLAVOR, "cause", "Ltb/e0;", "a", "kotlin-stdlib-jdk7"}, k = 2, mv = {1, 7, 1}, pn = "kotlin")
/* loaded from: classes.dex */
public final class a {
    public static final void a(AutoCloseable autoCloseable, Throwable th2) {
        if (autoCloseable != null) {
            if (th2 == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th3) {
                f.a(th2, th3);
            }
        }
    }
}
