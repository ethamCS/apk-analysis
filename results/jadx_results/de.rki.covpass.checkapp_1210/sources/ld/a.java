package ld;

import hc.t;
import hd.k;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.m0;
import ub.x0;
import ub.z0;
import xc.f1;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final k f15921a;

    /* renamed from: b */
    private final b f15922b;

    /* renamed from: c */
    private final boolean f15923c;

    /* renamed from: d */
    private final Set<f1> f15924d;

    /* renamed from: e */
    private final m0 f15925e;

    /* JADX WARN: Multi-variable type inference failed */
    public a(k kVar, b bVar, boolean z10, Set<? extends f1> set, m0 m0Var) {
        t.e(kVar, "howThisTypeIsUsed");
        t.e(bVar, "flexibility");
        this.f15921a = kVar;
        this.f15922b = bVar;
        this.f15923c = z10;
        this.f15924d = set;
        this.f15925e = m0Var;
    }

    public /* synthetic */ a(k kVar, b bVar, boolean z10, Set set, m0 m0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, (i10 & 2) != 0 ? b.INFLEXIBLE : bVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : set, (i10 & 16) != 0 ? null : m0Var);
    }

    public static /* synthetic */ a b(a aVar, k kVar, b bVar, boolean z10, Set set, m0 m0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kVar = aVar.f15921a;
        }
        if ((i10 & 2) != 0) {
            bVar = aVar.f15922b;
        }
        b bVar2 = bVar;
        if ((i10 & 4) != 0) {
            z10 = aVar.f15923c;
        }
        boolean z11 = z10;
        Set<f1> set2 = set;
        if ((i10 & 8) != 0) {
            set2 = aVar.f15924d;
        }
        Set set3 = set2;
        if ((i10 & 16) != 0) {
            m0Var = aVar.f15925e;
        }
        return aVar.a(kVar, bVar2, z11, set3, m0Var);
    }

    public final a a(k kVar, b bVar, boolean z10, Set<? extends f1> set, m0 m0Var) {
        t.e(kVar, "howThisTypeIsUsed");
        t.e(bVar, "flexibility");
        return new a(kVar, bVar, z10, set, m0Var);
    }

    public final m0 c() {
        return this.f15925e;
    }

    public final b d() {
        return this.f15922b;
    }

    public final k e() {
        return this.f15921a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15921a == aVar.f15921a && this.f15922b == aVar.f15922b && this.f15923c == aVar.f15923c && t.a(this.f15924d, aVar.f15924d) && t.a(this.f15925e, aVar.f15925e);
    }

    public final Set<f1> f() {
        return this.f15924d;
    }

    public final boolean g() {
        return this.f15923c;
    }

    public final a h(m0 m0Var) {
        return b(this, null, null, false, null, m0Var, 15, null);
    }

    public int hashCode() {
        int hashCode = ((this.f15921a.hashCode() * 31) + this.f15922b.hashCode()) * 31;
        boolean z10 = this.f15923c;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        int i12 = (hashCode + i10) * 31;
        Set<f1> set = this.f15924d;
        int i13 = 0;
        int hashCode2 = (i12 + (set == null ? 0 : set.hashCode())) * 31;
        m0 m0Var = this.f15925e;
        if (m0Var != null) {
            i13 = m0Var.hashCode();
        }
        return hashCode2 + i13;
    }

    public final a i(b bVar) {
        t.e(bVar, "flexibility");
        return b(this, null, bVar, false, null, null, 29, null);
    }

    public final a j(f1 f1Var) {
        t.e(f1Var, "typeParameter");
        Set<f1> set = this.f15924d;
        return b(this, null, null, false, set != null ? z0.i(set, f1Var) : x0.a(f1Var), null, 23, null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f15921a + ", flexibility=" + this.f15922b + ", isForAnnotationParameter=" + this.f15923c + ", visitedTypeParameters=" + this.f15924d + ", defaultType=" + this.f15925e + ')';
    }
}
