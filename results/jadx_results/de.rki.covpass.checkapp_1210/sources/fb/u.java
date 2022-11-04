package fb;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\r"}, d2 = {"Lfb/u;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "IS_BROWSER", "Z", "a", "()Z", "IS_NATIVE", "c", "IS_DEVELOPMENT_MODE", "b", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b */
    private static final boolean f10141b = false;

    /* renamed from: d */
    private static final boolean f10143d = false;

    /* renamed from: e */
    private static final boolean f10144e;

    /* renamed from: a */
    public static final u f10140a = new u();

    /* renamed from: c */
    private static final boolean f10142c = true;

    static {
        boolean z10 = true;
        String property = System.getProperty("io.ktor.development");
        if (property == null || !Boolean.parseBoolean(property)) {
            z10 = false;
        }
        f10144e = z10;
    }

    private u() {
    }

    public final boolean a() {
        return f10141b;
    }

    public final boolean b() {
        return f10144e;
    }

    public final boolean c() {
        return f10143d;
    }
}
