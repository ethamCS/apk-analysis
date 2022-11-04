package l9;

import hc.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\t\u0010\t\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, d2 = {"Ll9/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "descriptionId", "ruleContainerId", BuildConfig.FLAVOR, "lang", "desc", "a", "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "J", "d", "()J", "f", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "c", "<init>", "(JJLjava/lang/String;Ljava/lang/String;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final long f15865a;

    /* renamed from: b */
    private final long f15866b;

    /* renamed from: c */
    private final String f15867c;

    /* renamed from: d */
    private final String f15868d;

    public a(long j10, long j11, String str, String str2) {
        t.e(str, "lang");
        t.e(str2, "desc");
        this.f15865a = j10;
        this.f15866b = j11;
        this.f15867c = str;
        this.f15868d = str2;
    }

    public /* synthetic */ a(long j10, long j11, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11, str, str2);
    }

    public static /* synthetic */ a b(a aVar, long j10, long j11, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = aVar.f15865a;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = aVar.f15866b;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            str = aVar.f15867c;
        }
        String str3 = str;
        if ((i10 & 8) != 0) {
            str2 = aVar.f15868d;
        }
        return aVar.a(j12, j13, str3, str2);
    }

    public final a a(long j10, long j11, String str, String str2) {
        t.e(str, "lang");
        t.e(str2, "desc");
        return new a(j10, j11, str, str2);
    }

    public final String c() {
        return this.f15868d;
    }

    public final long d() {
        return this.f15865a;
    }

    public final String e() {
        return this.f15867c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15865a == aVar.f15865a && this.f15866b == aVar.f15866b && t.a(this.f15867c, aVar.f15867c) && t.a(this.f15868d, aVar.f15868d);
    }

    public final long f() {
        return this.f15866b;
    }

    public int hashCode() {
        return (((((de.rki.covpass.sdk.cert.models.d.a(this.f15865a) * 31) + de.rki.covpass.sdk.cert.models.d.a(this.f15866b)) * 31) + this.f15867c.hashCode()) * 31) + this.f15868d.hashCode();
    }

    public String toString() {
        long j10 = this.f15865a;
        long j11 = this.f15866b;
        String str = this.f15867c;
        String str2 = this.f15868d;
        return "BoosterDescriptionLocal(descriptionId=" + j10 + ", ruleContainerId=" + j11 + ", lang=" + str + ", desc=" + str2 + ")";
    }
}
