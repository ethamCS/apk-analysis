package fb;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lfb/i;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "content", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    private final String f10123a;

    /* renamed from: b */
    private final int f10124b;

    public i(String str) {
        hc.t.e(str, "content");
        this.f10123a = str;
        String lowerCase = str.toLowerCase();
        hc.t.d(lowerCase, "this as java.lang.String).toLowerCase()");
        this.f10124b = lowerCase.hashCode();
    }

    public final String a() {
        return this.f10123a;
    }

    public boolean equals(Object obj) {
        String str;
        boolean v10;
        i iVar = obj instanceof i ? (i) obj : null;
        if (iVar != null && (str = iVar.f10123a) != null) {
            v10 = bf.x.v(str, this.f10123a, true);
            if (v10) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f10124b;
    }

    public String toString() {
        return this.f10123a;
    }
}
