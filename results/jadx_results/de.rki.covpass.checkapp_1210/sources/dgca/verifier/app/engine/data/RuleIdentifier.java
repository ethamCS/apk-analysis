package dgca.verifier.app.engine.data;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f¨\u0006\u0017"}, d2 = {"Ldgca/verifier/app/engine/data/RuleIdentifier;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "b", "getVersion", "version", "c", "getCountry", "country", "d", "getHash", "hash", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class RuleIdentifier {

    /* renamed from: a */
    private final String f9001a;

    /* renamed from: b */
    private final String f9002b;

    /* renamed from: c */
    private final String f9003c;

    /* renamed from: d */
    private final String f9004d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleIdentifier)) {
            return false;
        }
        RuleIdentifier ruleIdentifier = (RuleIdentifier) obj;
        return t.a(this.f9001a, ruleIdentifier.f9001a) && t.a(this.f9002b, ruleIdentifier.f9002b) && t.a(this.f9003c, ruleIdentifier.f9003c) && t.a(this.f9004d, ruleIdentifier.f9004d);
    }

    public final String getCountry() {
        return this.f9003c;
    }

    public final String getHash() {
        return this.f9004d;
    }

    public final String getIdentifier() {
        return this.f9001a;
    }

    public final String getVersion() {
        return this.f9002b;
    }

    public int hashCode() {
        return (((((this.f9001a.hashCode() * 31) + this.f9002b.hashCode()) * 31) + this.f9003c.hashCode()) * 31) + this.f9004d.hashCode();
    }

    public String toString() {
        String str = this.f9001a;
        String str2 = this.f9002b;
        String str3 = this.f9003c;
        String str4 = this.f9004d;
        return "RuleIdentifier(identifier=" + str + ", version=" + str2 + ", country=" + str3 + ", hash=" + str4 + ")";
    }
}
