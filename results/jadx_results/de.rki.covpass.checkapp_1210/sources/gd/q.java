package gd;

import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a */
    private final od.i f10742a;

    /* renamed from: b */
    private final Collection<b> f10743b;

    /* renamed from: c */
    private final boolean f10744c;

    /* JADX WARN: Multi-variable type inference failed */
    public q(od.i iVar, Collection<? extends b> collection, boolean z10) {
        hc.t.e(iVar, "nullabilityQualifier");
        hc.t.e(collection, "qualifierApplicabilityTypes");
        this.f10742a = iVar;
        this.f10743b = collection;
        this.f10744c = z10;
    }

    public /* synthetic */ q(od.i iVar, Collection collection, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, collection, (i10 & 4) != 0 ? iVar.c() == od.h.NOT_NULL : z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ q b(q qVar, od.i iVar, Collection collection, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = qVar.f10742a;
        }
        if ((i10 & 2) != 0) {
            collection = qVar.f10743b;
        }
        if ((i10 & 4) != 0) {
            z10 = qVar.f10744c;
        }
        return qVar.a(iVar, collection, z10);
    }

    public final q a(od.i iVar, Collection<? extends b> collection, boolean z10) {
        hc.t.e(iVar, "nullabilityQualifier");
        hc.t.e(collection, "qualifierApplicabilityTypes");
        return new q(iVar, collection, z10);
    }

    public final boolean c() {
        return this.f10744c;
    }

    public final od.i d() {
        return this.f10742a;
    }

    public final Collection<b> e() {
        return this.f10743b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return hc.t.a(this.f10742a, qVar.f10742a) && hc.t.a(this.f10743b, qVar.f10743b) && this.f10744c == qVar.f10744c;
    }

    public int hashCode() {
        int hashCode = ((this.f10742a.hashCode() * 31) + this.f10743b.hashCode()) * 31;
        boolean z10 = this.f10744c;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        return hashCode + i10;
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f10742a + ", qualifierApplicabilityTypes=" + this.f10743b + ", definitelyNotNull=" + this.f10744c + ')';
    }
}
