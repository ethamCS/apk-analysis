package dgca.verifier.app.engine.data;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0011"}, d2 = {"Ldgca/verifier/app/engine/data/Description;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/String;", "getLang", "()Ljava/lang/String;", "lang", "b", "getDesc", "desc", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class Description {

    /* renamed from: a */
    private final String f8972a;

    /* renamed from: b */
    private final String f8973b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Description)) {
            return false;
        }
        Description description = (Description) obj;
        return t.a(this.f8972a, description.f8972a) && t.a(this.f8973b, description.f8973b);
    }

    public final String getDesc() {
        return this.f8973b;
    }

    public final String getLang() {
        return this.f8972a;
    }

    public int hashCode() {
        return (this.f8972a.hashCode() * 31) + this.f8973b.hashCode();
    }

    public String toString() {
        String str = this.f8972a;
        String str2 = this.f8973b;
        return "Description(lang=" + str + ", desc=" + str2 + ")";
    }
}
