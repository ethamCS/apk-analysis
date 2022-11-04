package dgca.verifier.app.engine.data.source.remote.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u001a"}, d2 = {"Ldgca/verifier/app/engine/data/source/remote/rules/RuleIdentifierRemote;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "identifier", "version", "country", "hash", "copy", "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "b", "getVersion", "c", "getCountry", "d", "getHash", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class RuleIdentifierRemote {

    /* renamed from: a */
    private final String f9017a;

    /* renamed from: b */
    private final String f9018b;

    /* renamed from: c */
    private final String f9019c;

    /* renamed from: d */
    private final String f9020d;

    public RuleIdentifierRemote(@JsonProperty("identifier") String str, @JsonProperty("version") String str2, @JsonProperty("country") String str3, @JsonProperty("hash") String str4) {
        t.e(str, "identifier");
        t.e(str2, "version");
        t.e(str3, "country");
        t.e(str4, "hash");
        this.f9017a = str;
        this.f9018b = str2;
        this.f9019c = str3;
        this.f9020d = str4;
    }

    public final RuleIdentifierRemote copy(@JsonProperty("identifier") String str, @JsonProperty("version") String str2, @JsonProperty("country") String str3, @JsonProperty("hash") String str4) {
        t.e(str, "identifier");
        t.e(str2, "version");
        t.e(str3, "country");
        t.e(str4, "hash");
        return new RuleIdentifierRemote(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleIdentifierRemote)) {
            return false;
        }
        RuleIdentifierRemote ruleIdentifierRemote = (RuleIdentifierRemote) obj;
        return t.a(this.f9017a, ruleIdentifierRemote.f9017a) && t.a(this.f9018b, ruleIdentifierRemote.f9018b) && t.a(this.f9019c, ruleIdentifierRemote.f9019c) && t.a(this.f9020d, ruleIdentifierRemote.f9020d);
    }

    public final String getCountry() {
        return this.f9019c;
    }

    public final String getHash() {
        return this.f9020d;
    }

    public final String getIdentifier() {
        return this.f9017a;
    }

    public final String getVersion() {
        return this.f9018b;
    }

    public int hashCode() {
        return (((((this.f9017a.hashCode() * 31) + this.f9018b.hashCode()) * 31) + this.f9019c.hashCode()) * 31) + this.f9020d.hashCode();
    }

    public String toString() {
        String str = this.f9017a;
        String str2 = this.f9018b;
        String str3 = this.f9019c;
        String str4 = this.f9020d;
        return "RuleIdentifierRemote(identifier=" + str + ", version=" + str2 + ", country=" + str3 + ", hash=" + str4 + ")";
    }
}
