package bb;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0013"}, d2 = {"Lbb/i;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "a", "b", "toString", "name", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "value", "d", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    private final String f5838a;

    /* renamed from: b */
    private final String f5839b;

    public i(String str, String str2) {
        hc.t.e(str, "name");
        hc.t.e(str2, "value");
        this.f5838a = str;
        this.f5839b = str2;
    }

    public final String a() {
        return this.f5838a;
    }

    public final String b() {
        return this.f5839b;
    }

    public final String c() {
        return this.f5838a;
    }

    public final String d() {
        return this.f5839b;
    }

    public boolean equals(Object obj) {
        boolean v10;
        boolean v11;
        if (obj instanceof i) {
            i iVar = (i) obj;
            v10 = bf.x.v(iVar.f5838a, this.f5838a, true);
            if (v10) {
                v11 = bf.x.v(iVar.f5839b, this.f5839b, true);
                if (v11) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String lowerCase = this.f5838a.toLowerCase();
        hc.t.d(lowerCase, "this as java.lang.String).toLowerCase()");
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.f5839b.toLowerCase();
        hc.t.d(lowerCase2, "this as java.lang.String).toLowerCase()");
        return hashCode + (hashCode * 31) + lowerCase2.hashCode();
    }

    public String toString() {
        return "HeaderValueParam(name=" + this.f5838a + ", value=" + this.f5839b + ')';
    }
}
