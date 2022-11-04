package od;

import hc.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    private final h f17846a;

    /* renamed from: b */
    private final boolean f17847b;

    public i(h hVar, boolean z10) {
        t.e(hVar, "qualifier");
        this.f17846a = hVar;
        this.f17847b = z10;
    }

    public /* synthetic */ i(h hVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, (i10 & 2) != 0 ? false : z10);
    }

    public static /* synthetic */ i b(i iVar, h hVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hVar = iVar.f17846a;
        }
        if ((i10 & 2) != 0) {
            z10 = iVar.f17847b;
        }
        return iVar.a(hVar, z10);
    }

    public final i a(h hVar, boolean z10) {
        t.e(hVar, "qualifier");
        return new i(hVar, z10);
    }

    public final h c() {
        return this.f17846a;
    }

    public final boolean d() {
        return this.f17847b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f17846a == iVar.f17846a && this.f17847b == iVar.f17847b;
    }

    public int hashCode() {
        int hashCode = this.f17846a.hashCode() * 31;
        boolean z10 = this.f17847b;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        return hashCode + i10;
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f17846a + ", isForWarningOnly=" + this.f17847b + ')';
    }
}
