package pe;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.e0;
import oe.g1;
import oe.q1;
import xc.f1;
/* loaded from: classes3.dex */
public final class j implements be.b {

    /* renamed from: a */
    private final g1 f19154a;

    /* renamed from: b */
    private gc.a<? extends List<? extends q1>> f19155b;

    /* renamed from: c */
    private final j f19156c;

    /* renamed from: d */
    private final f1 f19157d;

    /* renamed from: e */
    private final Lazy f19158e;

    /* renamed from: f */
    private q1 f19159f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends hc.v implements gc.a<List<? extends q1>> {

        /* renamed from: c */
        final /* synthetic */ List<q1> f19160c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends q1> list) {
            super(0);
            this.f19160c = list;
        }

        @Override // gc.a
        public final List<? extends q1> invoke() {
            return this.f19160c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends hc.v implements gc.a<List<? extends q1>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            j.this = r1;
        }

        @Override // gc.a
        public final List<? extends q1> invoke() {
            gc.a aVar = j.this.f19155b;
            if (aVar != null) {
                return (List) aVar.invoke();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c extends hc.v implements gc.a<List<? extends q1>> {

        /* renamed from: c */
        final /* synthetic */ List<q1> f19162c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends q1> list) {
            super(0);
            this.f19162c = list;
        }

        @Override // gc.a
        public final List<? extends q1> invoke() {
            return this.f19162c;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends hc.v implements gc.a<List<? extends q1>> {

        /* renamed from: d */
        final /* synthetic */ g f19164d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(0);
            j.this = r1;
            this.f19164d = gVar;
        }

        @Override // gc.a
        public final List<? extends q1> invoke() {
            int s10;
            List<q1> l10 = j.this.l();
            g gVar = this.f19164d;
            s10 = ub.v.s(l10, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (q1 q1Var : l10) {
                arrayList.add(q1Var.b1(gVar));
            }
            return arrayList;
        }
    }

    public j(g1 g1Var, gc.a<? extends List<? extends q1>> aVar, j jVar, f1 f1Var) {
        Lazy b10;
        hc.t.e(g1Var, "projection");
        this.f19154a = g1Var;
        this.f19155b = aVar;
        this.f19156c = jVar;
        this.f19157d = f1Var;
        b10 = tb.m.b(tb.o.PUBLICATION, new b());
        this.f19158e = b10;
    }

    public /* synthetic */ j(g1 g1Var, gc.a aVar, j jVar, f1 f1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(g1Var, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : jVar, (i10 & 8) != 0 ? null : f1Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(g1 g1Var, List<? extends q1> list, j jVar) {
        this(g1Var, new a(list), jVar, null, 8, null);
        hc.t.e(g1Var, "projection");
        hc.t.e(list, "supertypes");
    }

    public /* synthetic */ j(g1 g1Var, List list, j jVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(g1Var, list, (i10 & 4) != 0 ? null : jVar);
    }

    private final List<q1> e() {
        return (List) this.f19158e.getValue();
    }

    @Override // be.b
    public g1 b() {
        return this.f19154a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hc.t.a(j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        hc.t.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        j jVar = (j) obj;
        j jVar2 = this.f19156c;
        if (jVar2 == null) {
            jVar2 = this;
        }
        j jVar3 = jVar.f19156c;
        if (jVar3 != null) {
            jVar = jVar3;
        }
        return jVar2 == jVar;
    }

    /* renamed from: f */
    public List<q1> l() {
        List c10;
        List<q1> a10;
        c10 = ub.t.c();
        q1 q1Var = this.f19159f;
        if (q1Var != null) {
            c10.add(q1Var);
        }
        List<q1> e10 = e();
        if (e10 != null) {
            c10.addAll(e10);
        }
        a10 = ub.t.a(c10);
        return a10;
    }

    public final void g(q1 q1Var, List<? extends q1> list) {
        hc.t.e(list, "boundSupertypes");
        this.f19159f = q1Var;
        this.f19155b = new c(list);
    }

    @Override // oe.e1
    public List<f1> getParameters() {
        List<f1> h10;
        h10 = ub.u.h();
        return h10;
    }

    /* renamed from: h */
    public j a(g gVar) {
        hc.t.e(gVar, "kotlinTypeRefiner");
        g1 a10 = b().a(gVar);
        hc.t.d(a10, "projection.refine(kotlinTypeRefiner)");
        d dVar = this.f19155b != null ? new d(gVar) : null;
        j jVar = this.f19156c;
        if (jVar == null) {
            jVar = this;
        }
        return new j(a10, dVar, jVar, this.f19157d);
    }

    public int hashCode() {
        j jVar = this.f19156c;
        return jVar != null ? jVar.hashCode() : super.hashCode();
    }

    public String toString() {
        return "CapturedType(" + b() + ')';
    }

    @Override // oe.e1
    public uc.h x() {
        e0 type = b().getType();
        hc.t.d(type, "projection.type");
        return te.a.h(type);
    }

    @Override // oe.e1
    public boolean y() {
        return false;
    }

    @Override // oe.e1
    public xc.h z() {
        return null;
    }
}
