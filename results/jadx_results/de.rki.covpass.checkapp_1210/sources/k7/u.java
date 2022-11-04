package k7;

import android.app.Activity;
import android.content.Context;
import java.util.Arrays;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J-\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lk7/u;", "Lk7/t;", "Landroid/content/Context;", "b", BuildConfig.FLAVOR, "resId", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "formatArgs", BuildConfig.FLAVOR, "a", "(I[Ljava/lang/Object;)Ljava/lang/String;", "context", "<init>", "(Landroid/content/Context;)V", "android-utils_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a */
    private final Context f14677a;

    public u(Context context) {
        hc.t.e(context, "context");
        this.f14677a = context;
    }

    private final Context b() {
        Activity a10 = b.a().a();
        return a10 != null ? a10 : this.f14677a;
    }

    @Override // k7.t
    public String a(int i10, Object... objArr) {
        hc.t.e(objArr, "formatArgs");
        String string = objArr.length == 0 ? b().getResources().getString(i10) : b().getResources().getString(i10, Arrays.copyOf(objArr, objArr.length));
        hc.t.d(string, "if (formatArgs.isEmpty()…d, *formatArgs)\n        }");
        return string;
    }
}
