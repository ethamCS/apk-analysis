package q7;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lq7/f;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "posixTimeMs", "J", "a", "()J", "timeSinceLastNtpSyncMs", "<init>", "(JLjava/lang/Long;)V", "kronos-java"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private final long f19701a;

    /* renamed from: b */
    private final Long f19702b;

    public f(long j10, Long l10) {
        this.f19701a = j10;
        this.f19702b = l10;
    }

    public final long a() {
        return this.f19701a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f19701a == fVar.f19701a && t.a(this.f19702b, fVar.f19702b);
        }
        return true;
    }

    public int hashCode() {
        long j10 = this.f19701a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        Long l10 = this.f19702b;
        return i10 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "KronosTime(posixTimeMs=" + this.f19701a + ", timeSinceLastNtpSyncMs=" + this.f19702b + ")";
    }
}
