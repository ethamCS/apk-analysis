package bf;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lbf/g;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lnc/g;", "range", "<init>", "(Ljava/lang/String;Lnc/g;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a */
    private final String f6001a;

    /* renamed from: b */
    private final nc.g f6002b;

    public g(String str, nc.g gVar) {
        hc.t.e(str, "value");
        hc.t.e(gVar, "range");
        this.f6001a = str;
        this.f6002b = gVar;
    }

    public final String a() {
        return this.f6001a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return hc.t.a(this.f6001a, gVar.f6001a) && hc.t.a(this.f6002b, gVar.f6002b);
    }

    public int hashCode() {
        return (this.f6001a.hashCode() * 31) + this.f6002b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f6001a + ", range=" + this.f6002b + ')';
    }
}
