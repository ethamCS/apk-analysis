package dgca.verifier.app.engine.data.source.remote.valuesets;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import hc.t;
import j$.time.LocalDate;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Ldgca/verifier/app/engine/data/source/remote/valuesets/ValueSetRemote;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "valueSetId", "j$/time/LocalDate", "valueSetDate", "Lcom/fasterxml/jackson/databind/JsonNode;", "valueSetValues", "copy", "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/String;", "getValueSetId", "()Ljava/lang/String;", "b", "Lj$/time/LocalDate;", "getValueSetDate", "()Lj$/time/LocalDate;", "c", "Lcom/fasterxml/jackson/databind/JsonNode;", "getValueSetValues", "()Lcom/fasterxml/jackson/databind/JsonNode;", "<init>", "(Ljava/lang/String;Lj$/time/LocalDate;Lcom/fasterxml/jackson/databind/JsonNode;)V", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ValueSetRemote {

    /* renamed from: a */
    private final String f9037a;

    /* renamed from: b */
    private final LocalDate f9038b;

    /* renamed from: c */
    private final JsonNode f9039c;

    public ValueSetRemote(@JsonProperty("valueSetId") String str, @JsonProperty("valueSetDate") LocalDate localDate, @JsonProperty("valueSetValues") JsonNode jsonNode) {
        t.e(str, "valueSetId");
        t.e(localDate, "valueSetDate");
        t.e(jsonNode, "valueSetValues");
        this.f9037a = str;
        this.f9038b = localDate;
        this.f9039c = jsonNode;
    }

    public final ValueSetRemote copy(@JsonProperty("valueSetId") String str, @JsonProperty("valueSetDate") LocalDate localDate, @JsonProperty("valueSetValues") JsonNode jsonNode) {
        t.e(str, "valueSetId");
        t.e(localDate, "valueSetDate");
        t.e(jsonNode, "valueSetValues");
        return new ValueSetRemote(str, localDate, jsonNode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValueSetRemote)) {
            return false;
        }
        ValueSetRemote valueSetRemote = (ValueSetRemote) obj;
        return t.a(this.f9037a, valueSetRemote.f9037a) && t.a(this.f9038b, valueSetRemote.f9038b) && t.a(this.f9039c, valueSetRemote.f9039c);
    }

    public final LocalDate getValueSetDate() {
        return this.f9038b;
    }

    public final String getValueSetId() {
        return this.f9037a;
    }

    public final JsonNode getValueSetValues() {
        return this.f9039c;
    }

    public int hashCode() {
        return (((this.f9037a.hashCode() * 31) + this.f9038b.hashCode()) * 31) + this.f9039c.hashCode();
    }

    public String toString() {
        String str = this.f9037a;
        LocalDate localDate = this.f9038b;
        JsonNode jsonNode = this.f9039c;
        return "ValueSetRemote(valueSetId=" + str + ", valueSetDate=" + localDate + ", valueSetValues=" + jsonNode + ")";
    }
}
