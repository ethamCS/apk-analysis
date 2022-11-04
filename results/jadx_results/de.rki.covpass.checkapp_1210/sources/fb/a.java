package fb;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Lfb/a;", "T", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", "name", "<init>", "(Ljava/lang/String;)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a */
    private final String f10116a;

    public a(String str) {
        hc.t.e(str, "name");
        this.f10116a = str;
    }

    public String toString() {
        return this.f10116a.length() == 0 ? super.toString() : hc.t.l("AttributeKey: ", this.f10116a);
    }
}
