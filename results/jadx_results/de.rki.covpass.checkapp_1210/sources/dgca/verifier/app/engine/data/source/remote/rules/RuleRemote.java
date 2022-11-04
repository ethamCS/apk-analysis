package dgca.verifier.app.engine.data.source.remote.rules;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import hc.t;
import j$.time.ZonedDateTime;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u000f\u001a\u00020\r\u0012\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b@\u0010AJ£\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\u000e\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\b\b\u0003\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u0013\u001a\u00020\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u0010/R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010\u001d\u001a\u0004\b=\u0010\u001fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010\u001d\u001a\u0004\b?\u0010\u001f¨\u0006B"}, d2 = {"Ldgca/verifier/app/engine/data/source/remote/rules/RuleRemote;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "identifier", "type", "version", "schemaVersion", "engine", "engineVersion", "certificateType", BuildConfig.FLAVOR, "Ldgca/verifier/app/engine/data/source/remote/rules/DescriptionRemote;", "descriptions", "j$/time/ZonedDateTime", "validFrom", "validTo", "affectedString", "Lcom/fasterxml/jackson/databind/JsonNode;", "logic", "countryCode", "region", "copy", "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "b", "getType", "c", "getVersion", "d", "getSchemaVersion", "e", "getEngine", "f", "getEngineVersion", "g", "getCertificateType", "h", "Ljava/util/List;", "getDescriptions", "()Ljava/util/List;", "i", "Lj$/time/ZonedDateTime;", "getValidFrom", "()Lj$/time/ZonedDateTime;", "j", "getValidTo", "k", "getAffectedString", "l", "Lcom/fasterxml/jackson/databind/JsonNode;", "getLogic", "()Lcom/fasterxml/jackson/databind/JsonNode;", "m", "getCountryCode", "n", "getRegion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;Ljava/util/List;Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;Ljava/lang/String;)V", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class RuleRemote {

    /* renamed from: a */
    private final String f9021a;

    /* renamed from: b */
    private final String f9022b;

    /* renamed from: c */
    private final String f9023c;

    /* renamed from: d */
    private final String f9024d;

    /* renamed from: e */
    private final String f9025e;

    /* renamed from: f */
    private final String f9026f;

    /* renamed from: g */
    private final String f9027g;

    /* renamed from: h */
    private final List<DescriptionRemote> f9028h;

    /* renamed from: i */
    private final ZonedDateTime f9029i;

    /* renamed from: j */
    private final ZonedDateTime f9030j;

    /* renamed from: k */
    private final List<String> f9031k;

    /* renamed from: l */
    private final JsonNode f9032l;

    /* renamed from: m */
    private final String f9033m;

    /* renamed from: n */
    private final String f9034n;

    public RuleRemote(@JsonProperty("Identifier") String str, @JsonProperty("Type") String str2, @JsonProperty("Version") String str3, @JsonProperty("SchemaVersion") String str4, @JsonProperty("Engine") String str5, @JsonProperty("EngineVersion") String str6, @JsonProperty("CertificateType") String str7, @JsonProperty("Description") List<DescriptionRemote> list, @JsonProperty("ValidFrom") ZonedDateTime zonedDateTime, @JsonProperty("ValidTo") ZonedDateTime zonedDateTime2, @JsonProperty("AffectedFields") List<String> list2, @JsonProperty("Logic") JsonNode jsonNode, @JsonProperty("Country") String str8, @JsonProperty("Region") String str9) {
        t.e(str, "identifier");
        t.e(str2, "type");
        t.e(str3, "version");
        t.e(str4, "schemaVersion");
        t.e(str5, "engine");
        t.e(str6, "engineVersion");
        t.e(str7, "certificateType");
        t.e(list, "descriptions");
        t.e(zonedDateTime, "validFrom");
        t.e(zonedDateTime2, "validTo");
        t.e(list2, "affectedString");
        t.e(jsonNode, "logic");
        t.e(str8, "countryCode");
        this.f9021a = str;
        this.f9022b = str2;
        this.f9023c = str3;
        this.f9024d = str4;
        this.f9025e = str5;
        this.f9026f = str6;
        this.f9027g = str7;
        this.f9028h = list;
        this.f9029i = zonedDateTime;
        this.f9030j = zonedDateTime2;
        this.f9031k = list2;
        this.f9032l = jsonNode;
        this.f9033m = str8;
        this.f9034n = str9;
    }

    public final RuleRemote copy(@JsonProperty("Identifier") String str, @JsonProperty("Type") String str2, @JsonProperty("Version") String str3, @JsonProperty("SchemaVersion") String str4, @JsonProperty("Engine") String str5, @JsonProperty("EngineVersion") String str6, @JsonProperty("CertificateType") String str7, @JsonProperty("Description") List<DescriptionRemote> list, @JsonProperty("ValidFrom") ZonedDateTime zonedDateTime, @JsonProperty("ValidTo") ZonedDateTime zonedDateTime2, @JsonProperty("AffectedFields") List<String> list2, @JsonProperty("Logic") JsonNode jsonNode, @JsonProperty("Country") String str8, @JsonProperty("Region") String str9) {
        t.e(str, "identifier");
        t.e(str2, "type");
        t.e(str3, "version");
        t.e(str4, "schemaVersion");
        t.e(str5, "engine");
        t.e(str6, "engineVersion");
        t.e(str7, "certificateType");
        t.e(list, "descriptions");
        t.e(zonedDateTime, "validFrom");
        t.e(zonedDateTime2, "validTo");
        t.e(list2, "affectedString");
        t.e(jsonNode, "logic");
        t.e(str8, "countryCode");
        return new RuleRemote(str, str2, str3, str4, str5, str6, str7, list, zonedDateTime, zonedDateTime2, list2, jsonNode, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleRemote)) {
            return false;
        }
        RuleRemote ruleRemote = (RuleRemote) obj;
        return t.a(this.f9021a, ruleRemote.f9021a) && t.a(this.f9022b, ruleRemote.f9022b) && t.a(this.f9023c, ruleRemote.f9023c) && t.a(this.f9024d, ruleRemote.f9024d) && t.a(this.f9025e, ruleRemote.f9025e) && t.a(this.f9026f, ruleRemote.f9026f) && t.a(this.f9027g, ruleRemote.f9027g) && t.a(this.f9028h, ruleRemote.f9028h) && t.a(this.f9029i, ruleRemote.f9029i) && t.a(this.f9030j, ruleRemote.f9030j) && t.a(this.f9031k, ruleRemote.f9031k) && t.a(this.f9032l, ruleRemote.f9032l) && t.a(this.f9033m, ruleRemote.f9033m) && t.a(this.f9034n, ruleRemote.f9034n);
    }

    public final List<String> getAffectedString() {
        return this.f9031k;
    }

    public final String getCertificateType() {
        return this.f9027g;
    }

    public final String getCountryCode() {
        return this.f9033m;
    }

    public final List<DescriptionRemote> getDescriptions() {
        return this.f9028h;
    }

    public final String getEngine() {
        return this.f9025e;
    }

    public final String getEngineVersion() {
        return this.f9026f;
    }

    public final String getIdentifier() {
        return this.f9021a;
    }

    public final JsonNode getLogic() {
        return this.f9032l;
    }

    public final String getRegion() {
        return this.f9034n;
    }

    public final String getSchemaVersion() {
        return this.f9024d;
    }

    public final String getType() {
        return this.f9022b;
    }

    public final ZonedDateTime getValidFrom() {
        return this.f9029i;
    }

    public final ZonedDateTime getValidTo() {
        return this.f9030j;
    }

    public final String getVersion() {
        return this.f9023c;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((this.f9021a.hashCode() * 31) + this.f9022b.hashCode()) * 31) + this.f9023c.hashCode()) * 31) + this.f9024d.hashCode()) * 31) + this.f9025e.hashCode()) * 31) + this.f9026f.hashCode()) * 31) + this.f9027g.hashCode()) * 31) + this.f9028h.hashCode()) * 31) + this.f9029i.hashCode()) * 31) + this.f9030j.hashCode()) * 31) + this.f9031k.hashCode()) * 31) + this.f9032l.hashCode()) * 31) + this.f9033m.hashCode()) * 31;
        String str = this.f9034n;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f9021a;
        String str2 = this.f9022b;
        String str3 = this.f9023c;
        String str4 = this.f9024d;
        String str5 = this.f9025e;
        String str6 = this.f9026f;
        String str7 = this.f9027g;
        List<DescriptionRemote> list = this.f9028h;
        ZonedDateTime zonedDateTime = this.f9029i;
        ZonedDateTime zonedDateTime2 = this.f9030j;
        List<String> list2 = this.f9031k;
        JsonNode jsonNode = this.f9032l;
        String str8 = this.f9033m;
        String str9 = this.f9034n;
        return "RuleRemote(identifier=" + str + ", type=" + str2 + ", version=" + str3 + ", schemaVersion=" + str4 + ", engine=" + str5 + ", engineVersion=" + str6 + ", certificateType=" + str7 + ", descriptions=" + list + ", validFrom=" + zonedDateTime + ", validTo=" + zonedDateTime2 + ", affectedString=" + list2 + ", logic=" + jsonNode + ", countryCode=" + str8 + ", region=" + str9 + ")";
    }
}
