package s9;

import hc.t;
import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001c"}, d2 = {"Ls9/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "id", "I", "b", "()I", "valueSetId", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "j$/time/LocalDate", "valueSetDate", "Lj$/time/LocalDate;", "c", "()Lj$/time/LocalDate;", "valueSetValues", "e", "hash", "a", "<init>", "(ILjava/lang/String;Lj$/time/LocalDate;Ljava/lang/String;Ljava/lang/String;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final int f21540a;

    /* renamed from: b */
    private final String f21541b;

    /* renamed from: c */
    private final LocalDate f21542c;

    /* renamed from: d */
    private final String f21543d;

    /* renamed from: e */
    private final String f21544e;

    public a(int i10, String str, LocalDate localDate, String str2, String str3) {
        t.e(str, "valueSetId");
        t.e(localDate, "valueSetDate");
        t.e(str2, "valueSetValues");
        t.e(str3, "hash");
        this.f21540a = i10;
        this.f21541b = str;
        this.f21542c = localDate;
        this.f21543d = str2;
        this.f21544e = str3;
    }

    public /* synthetic */ a(int i10, String str, LocalDate localDate, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, str, localDate, str2, str3);
    }

    public final String a() {
        return this.f21544e;
    }

    public final int b() {
        return this.f21540a;
    }

    public final LocalDate c() {
        return this.f21542c;
    }

    public final String d() {
        return this.f21541b;
    }

    public final String e() {
        return this.f21543d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f21540a == aVar.f21540a && t.a(this.f21541b, aVar.f21541b) && t.a(this.f21542c, aVar.f21542c) && t.a(this.f21543d, aVar.f21543d) && t.a(this.f21544e, aVar.f21544e);
    }

    public int hashCode() {
        return (((((((this.f21540a * 31) + this.f21541b.hashCode()) * 31) + this.f21542c.hashCode()) * 31) + this.f21543d.hashCode()) * 31) + this.f21544e.hashCode();
    }

    public String toString() {
        int i10 = this.f21540a;
        String str = this.f21541b;
        LocalDate localDate = this.f21542c;
        String str2 = this.f21543d;
        String str3 = this.f21544e;
        return "CovPassValueSetLocal(id=" + i10 + ", valueSetId=" + str + ", valueSetDate=" + localDate + ", valueSetValues=" + str2 + ", hash=" + str3 + ")";
    }
}
