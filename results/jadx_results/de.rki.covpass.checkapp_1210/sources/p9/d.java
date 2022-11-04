package p9;

import hc.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lp9/d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "countryId", "J", "b", "()J", "countryCode", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "(JLjava/lang/String;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private final long f19015a;

    /* renamed from: b */
    private final String f19016b;

    public d(long j10, String str) {
        t.e(str, "countryCode");
        this.f19015a = j10;
        this.f19016b = str;
    }

    public /* synthetic */ d(long j10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, str);
    }

    public final String a() {
        return this.f19016b;
    }

    public final long b() {
        return this.f19015a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f19015a == dVar.f19015a && t.a(this.f19016b, dVar.f19016b);
    }

    public int hashCode() {
        return (de.rki.covpass.sdk.cert.models.d.a(this.f19015a) * 31) + this.f19016b.hashCode();
    }

    public String toString() {
        long j10 = this.f19015a;
        String str = this.f19016b;
        return "CountryLocal(countryId=" + j10 + ", countryCode=" + str + ")";
    }
}
