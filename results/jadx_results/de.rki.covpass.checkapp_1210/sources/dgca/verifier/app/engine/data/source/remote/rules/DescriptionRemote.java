package dgca.verifier.app.engine.data.source.remote.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0005\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Ldgca/verifier/app/engine/data/source/remote/rules/DescriptionRemote;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "lang", "desc", "copy", "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/String;", "getLang", "()Ljava/lang/String;", "b", "getDesc", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class DescriptionRemote {

    /* renamed from: a */
    private final String f9015a;

    /* renamed from: b */
    private final String f9016b;

    public DescriptionRemote(@JsonProperty("lang") String str, @JsonProperty("desc") String str2) {
        t.e(str, "lang");
        t.e(str2, "desc");
        this.f9015a = str;
        this.f9016b = str2;
    }

    public final DescriptionRemote copy(@JsonProperty("lang") String str, @JsonProperty("desc") String str2) {
        t.e(str, "lang");
        t.e(str2, "desc");
        return new DescriptionRemote(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DescriptionRemote)) {
            return false;
        }
        DescriptionRemote descriptionRemote = (DescriptionRemote) obj;
        return t.a(this.f9015a, descriptionRemote.f9015a) && t.a(this.f9016b, descriptionRemote.f9016b);
    }

    public final String getDesc() {
        return this.f9016b;
    }

    public final String getLang() {
        return this.f9015a;
    }

    public int hashCode() {
        return (this.f9015a.hashCode() * 31) + this.f9016b.hashCode();
    }

    public String toString() {
        String str = this.f9015a;
        String str2 = this.f9016b;
        return "DescriptionRemote(lang=" + str + ", desc=" + str2 + ")";
    }
}
