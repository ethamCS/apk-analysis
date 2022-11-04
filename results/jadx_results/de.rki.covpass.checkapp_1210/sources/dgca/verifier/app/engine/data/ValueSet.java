package dgca.verifier.app.engine.data;

import com.fasterxml.jackson.databind.JsonNode;
import hc.t;
import j$.time.LocalDate;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Ldgca/verifier/app/engine/data/ValueSet;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/String;", "getValueSetId", "()Ljava/lang/String;", "valueSetId", "j$/time/LocalDate", "b", "Lj$/time/LocalDate;", "getValueSetDate", "()Lj$/time/LocalDate;", "valueSetDate", "Lcom/fasterxml/jackson/databind/JsonNode;", "c", "Lcom/fasterxml/jackson/databind/JsonNode;", "getValueSetValues", "()Lcom/fasterxml/jackson/databind/JsonNode;", "valueSetValues", "<init>", "(Ljava/lang/String;Lj$/time/LocalDate;Lcom/fasterxml/jackson/databind/JsonNode;)V", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ValueSet {

    /* renamed from: a */
    private final String f9010a;

    /* renamed from: b */
    private final LocalDate f9011b;

    /* renamed from: c */
    private final JsonNode f9012c;

    public ValueSet(String str, LocalDate localDate, JsonNode jsonNode) {
        t.e(str, "valueSetId");
        t.e(localDate, "valueSetDate");
        t.e(jsonNode, "valueSetValues");
        this.f9010a = str;
        this.f9011b = localDate;
        this.f9012c = jsonNode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValueSet)) {
            return false;
        }
        ValueSet valueSet = (ValueSet) obj;
        return t.a(this.f9010a, valueSet.f9010a) && t.a(this.f9011b, valueSet.f9011b) && t.a(this.f9012c, valueSet.f9012c);
    }

    public final LocalDate getValueSetDate() {
        return this.f9011b;
    }

    public final String getValueSetId() {
        return this.f9010a;
    }

    public final JsonNode getValueSetValues() {
        return this.f9012c;
    }

    public int hashCode() {
        return (((this.f9010a.hashCode() * 31) + this.f9011b.hashCode()) * 31) + this.f9012c.hashCode();
    }

    public String toString() {
        String str = this.f9010a;
        LocalDate localDate = this.f9011b;
        JsonNode jsonNode = this.f9012c;
        return "ValueSet(valueSetId=" + str + ", valueSetDate=" + localDate + ", valueSetValues=" + jsonNode + ")";
    }
}
