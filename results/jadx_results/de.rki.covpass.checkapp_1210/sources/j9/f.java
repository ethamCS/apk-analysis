package j9;

import hc.t;
import j$.time.LocalDate;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f¨\u0006\u0018"}, d2 = {"Lj9/f;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "valueSetId", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "j$/time/LocalDate", "valueSetDate", "Lj$/time/LocalDate;", "b", "()Lj$/time/LocalDate;", "valueSetValues", "d", "hash", "a", "<init>", "(Ljava/lang/String;Lj$/time/LocalDate;Ljava/lang/String;Ljava/lang/String;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private final String f14219a;

    /* renamed from: b */
    private final LocalDate f14220b;

    /* renamed from: c */
    private final String f14221c;

    /* renamed from: d */
    private final String f14222d;

    public f(String str, LocalDate localDate, String str2, String str3) {
        t.e(str, "valueSetId");
        t.e(localDate, "valueSetDate");
        t.e(str2, "valueSetValues");
        t.e(str3, "hash");
        this.f14219a = str;
        this.f14220b = localDate;
        this.f14221c = str2;
        this.f14222d = str3;
    }

    public final String a() {
        return this.f14222d;
    }

    public final LocalDate b() {
        return this.f14220b;
    }

    public final String c() {
        return this.f14219a;
    }

    public final String d() {
        return this.f14221c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return t.a(this.f14219a, fVar.f14219a) && t.a(this.f14220b, fVar.f14220b) && t.a(this.f14221c, fVar.f14221c) && t.a(this.f14222d, fVar.f14222d);
    }

    public int hashCode() {
        return (((((this.f14219a.hashCode() * 31) + this.f14220b.hashCode()) * 31) + this.f14221c.hashCode()) * 31) + this.f14222d.hashCode();
    }

    public String toString() {
        String str = this.f14219a;
        LocalDate localDate = this.f14220b;
        String str2 = this.f14221c;
        String str3 = this.f14222d;
        return "CovPassValueSet(valueSetId=" + str + ", valueSetDate=" + localDate + ", valueSetValues=" + str2 + ", hash=" + str3 + ")";
    }
}
