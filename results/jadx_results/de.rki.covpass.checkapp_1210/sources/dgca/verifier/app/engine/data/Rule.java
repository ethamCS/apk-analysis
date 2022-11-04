package dgca.verifier.app.engine.data;

import com.fasterxml.jackson.databind.JsonNode;
import hc.t;
import j$.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020 \u0012\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&\u0012\u0006\u00101\u001a\u00020,\u0012\u0006\u00104\u001a\u00020,\u0012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000205\u0012\u0006\u0010@\u001a\u00020;\u0012\u0006\u0010C\u001a\u00020\u0002\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bG\u0010HJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00104\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u00100R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010C\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\bB\u0010\fR\u0019\u0010F\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u0010\n\u001a\u0004\bE\u0010\f¨\u0006I"}, d2 = {"Ldgca/verifier/app/engine/data/Rule;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Ldgca/verifier/app/engine/data/Type;", "b", "Ldgca/verifier/app/engine/data/Type;", "getType", "()Ldgca/verifier/app/engine/data/Type;", "type", "c", "getVersion", "version", "d", "getSchemaVersion", "schemaVersion", "e", "getEngine", "engine", "f", "getEngineVersion", "engineVersion", "Ldgca/verifier/app/engine/data/RuleCertificateType;", "g", "Ldgca/verifier/app/engine/data/RuleCertificateType;", "getRuleCertificateType", "()Ldgca/verifier/app/engine/data/RuleCertificateType;", "ruleCertificateType", BuildConfig.FLAVOR, "h", "Ljava/util/Map;", "getDescriptions", "()Ljava/util/Map;", "descriptions", "j$/time/ZonedDateTime", "i", "Lj$/time/ZonedDateTime;", "getValidFrom", "()Lj$/time/ZonedDateTime;", "validFrom", "j", "getValidTo", "validTo", BuildConfig.FLAVOR, "k", "Ljava/util/List;", "getAffectedString", "()Ljava/util/List;", "affectedString", "Lcom/fasterxml/jackson/databind/JsonNode;", "l", "Lcom/fasterxml/jackson/databind/JsonNode;", "getLogic", "()Lcom/fasterxml/jackson/databind/JsonNode;", "logic", "m", "getCountryCode", "countryCode", "n", "getRegion", "region", "<init>", "(Ljava/lang/String;Ldgca/verifier/app/engine/data/Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldgca/verifier/app/engine/data/RuleCertificateType;Ljava/util/Map;Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;Ljava/util/List;Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;Ljava/lang/String;)V", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class Rule {

    /* renamed from: a */
    private final String f8982a;

    /* renamed from: b */
    private final Type f8983b;

    /* renamed from: c */
    private final String f8984c;

    /* renamed from: d */
    private final String f8985d;

    /* renamed from: e */
    private final String f8986e;

    /* renamed from: f */
    private final String f8987f;

    /* renamed from: g */
    private final RuleCertificateType f8988g;

    /* renamed from: h */
    private final Map<String, String> f8989h;

    /* renamed from: i */
    private final ZonedDateTime f8990i;

    /* renamed from: j */
    private final ZonedDateTime f8991j;

    /* renamed from: k */
    private final List<String> f8992k;

    /* renamed from: l */
    private final JsonNode f8993l;

    /* renamed from: m */
    private final String f8994m;

    /* renamed from: n */
    private final String f8995n;

    public Rule(String str, Type type, String str2, String str3, String str4, String str5, RuleCertificateType ruleCertificateType, Map<String, String> map, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, List<String> list, JsonNode jsonNode, String str6, String str7) {
        t.e(str, "identifier");
        t.e(type, "type");
        t.e(str2, "version");
        t.e(str3, "schemaVersion");
        t.e(str4, "engine");
        t.e(str5, "engineVersion");
        t.e(ruleCertificateType, "ruleCertificateType");
        t.e(map, "descriptions");
        t.e(zonedDateTime, "validFrom");
        t.e(zonedDateTime2, "validTo");
        t.e(list, "affectedString");
        t.e(jsonNode, "logic");
        t.e(str6, "countryCode");
        this.f8982a = str;
        this.f8983b = type;
        this.f8984c = str2;
        this.f8985d = str3;
        this.f8986e = str4;
        this.f8987f = str5;
        this.f8988g = ruleCertificateType;
        this.f8989h = map;
        this.f8990i = zonedDateTime;
        this.f8991j = zonedDateTime2;
        this.f8992k = list;
        this.f8993l = jsonNode;
        this.f8994m = str6;
        this.f8995n = str7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rule)) {
            return false;
        }
        Rule rule = (Rule) obj;
        return t.a(this.f8982a, rule.f8982a) && this.f8983b == rule.f8983b && t.a(this.f8984c, rule.f8984c) && t.a(this.f8985d, rule.f8985d) && t.a(this.f8986e, rule.f8986e) && t.a(this.f8987f, rule.f8987f) && this.f8988g == rule.f8988g && t.a(this.f8989h, rule.f8989h) && t.a(this.f8990i, rule.f8990i) && t.a(this.f8991j, rule.f8991j) && t.a(this.f8992k, rule.f8992k) && t.a(this.f8993l, rule.f8993l) && t.a(this.f8994m, rule.f8994m) && t.a(this.f8995n, rule.f8995n);
    }

    public final List<String> getAffectedString() {
        return this.f8992k;
    }

    public final String getCountryCode() {
        return this.f8994m;
    }

    public final Map<String, String> getDescriptions() {
        return this.f8989h;
    }

    public final String getEngine() {
        return this.f8986e;
    }

    public final String getEngineVersion() {
        return this.f8987f;
    }

    public final String getIdentifier() {
        return this.f8982a;
    }

    public final JsonNode getLogic() {
        return this.f8993l;
    }

    public final String getRegion() {
        return this.f8995n;
    }

    public final RuleCertificateType getRuleCertificateType() {
        return this.f8988g;
    }

    public final String getSchemaVersion() {
        return this.f8985d;
    }

    public final Type getType() {
        return this.f8983b;
    }

    public final ZonedDateTime getValidFrom() {
        return this.f8990i;
    }

    public final ZonedDateTime getValidTo() {
        return this.f8991j;
    }

    public final String getVersion() {
        return this.f8984c;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((this.f8982a.hashCode() * 31) + this.f8983b.hashCode()) * 31) + this.f8984c.hashCode()) * 31) + this.f8985d.hashCode()) * 31) + this.f8986e.hashCode()) * 31) + this.f8987f.hashCode()) * 31) + this.f8988g.hashCode()) * 31) + this.f8989h.hashCode()) * 31) + this.f8990i.hashCode()) * 31) + this.f8991j.hashCode()) * 31) + this.f8992k.hashCode()) * 31) + this.f8993l.hashCode()) * 31) + this.f8994m.hashCode()) * 31;
        String str = this.f8995n;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f8982a;
        Type type = this.f8983b;
        String str2 = this.f8984c;
        String str3 = this.f8985d;
        String str4 = this.f8986e;
        String str5 = this.f8987f;
        RuleCertificateType ruleCertificateType = this.f8988g;
        Map<String, String> map = this.f8989h;
        ZonedDateTime zonedDateTime = this.f8990i;
        ZonedDateTime zonedDateTime2 = this.f8991j;
        List<String> list = this.f8992k;
        JsonNode jsonNode = this.f8993l;
        String str6 = this.f8994m;
        String str7 = this.f8995n;
        return "Rule(identifier=" + str + ", type=" + type + ", version=" + str2 + ", schemaVersion=" + str3 + ", engine=" + str4 + ", engineVersion=" + str5 + ", ruleCertificateType=" + ruleCertificateType + ", descriptions=" + map + ", validFrom=" + zonedDateTime + ", validTo=" + zonedDateTime2 + ", affectedString=" + list + ", logic=" + jsonNode + ", countryCode=" + str6 + ", region=" + str7 + ")";
    }
}
