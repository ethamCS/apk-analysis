package u1;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.Collections;
import java.util.List;
@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes.dex */
public abstract class t {
    public static t d(Context context) {
        return v1.i.k(context);
    }

    public static void e(Context context, b bVar) {
        v1.i.e(context, bVar);
    }

    public abstract n a(String str);

    public abstract n b(List<? extends u> list);

    public final n c(u uVar) {
        return b(Collections.singletonList(uVar));
    }
}
