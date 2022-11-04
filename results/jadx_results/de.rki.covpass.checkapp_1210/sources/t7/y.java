package t7;

import java.util.Objects;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public class y {

    /* renamed from: b */
    public static final y f22020b = new y();

    /* renamed from: a */
    private final boolean f22021a;

    public y() {
        this(BuildConfig.FLAVOR);
    }

    public y(String str) {
        Objects.requireNonNull(str, "paramString");
        this.f22021a = new x(str).a("usecamelcase", true);
    }

    public final boolean a() {
        return this.f22021a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("usecamelcase=");
        sb2.append(a() ? "true" : "false");
        return sb2.toString();
    }
}
