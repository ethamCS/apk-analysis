package of;

import java.nio.charset.Charset;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lof/o;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "username", "password", "Ljava/nio/charset/Charset;", "charset", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a */
    public static final o f18278a = new o();

    private o() {
    }

    @fc.c
    public static final String a(String str, String str2, Charset charset) {
        hc.t.e(str, "username");
        hc.t.e(str2, "password");
        hc.t.e(charset, "charset");
        return hc.t.l("Basic ", eg.f.Companion.c(str + ':' + str2, charset).b());
    }
}
