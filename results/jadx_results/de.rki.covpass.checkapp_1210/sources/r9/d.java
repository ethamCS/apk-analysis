package r9;

import hc.t;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lr9/d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "Lr9/b;", "rule", "Lr9/b;", "b", "()Lr9/b;", BuildConfig.FLAVOR, "Lr9/a;", "descriptions", "Ljava/util/List;", "a", "()Ljava/util/List;", "<init>", "(Lr9/b;Ljava/util/List;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private final b f20525a;

    /* renamed from: b */
    private final List<a> f20526b;

    public d(b bVar, List<a> list) {
        t.e(bVar, "rule");
        t.e(list, "descriptions");
        this.f20525a = bVar;
        this.f20526b = list;
    }

    public final List<a> a() {
        return this.f20526b;
    }

    public final b b() {
        return this.f20525a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return t.a(this.f20525a, dVar.f20525a) && t.a(this.f20526b, dVar.f20526b);
    }

    public int hashCode() {
        return (this.f20525a.hashCode() * 31) + this.f20526b.hashCode();
    }

    public String toString() {
        b bVar = this.f20525a;
        List<a> list = this.f20526b;
        return "CovPassEuRuleWithDescriptionsLocal(rule=" + bVar + ", descriptions=" + list + ")";
    }
}