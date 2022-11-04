package oe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
/* loaded from: classes3.dex */
public final class d0 implements e1, se.h {

    /* renamed from: a */
    private e0 f17924a;

    /* renamed from: b */
    private final LinkedHashSet<e0> f17925b;

    /* renamed from: c */
    private final int f17926c;

    /* loaded from: classes3.dex */
    public static final class a extends hc.v implements gc.l<pe.g, m0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(1);
            d0.this = r1;
        }

        /* renamed from: b */
        public final m0 invoke(pe.g gVar) {
            hc.t.e(gVar, "kotlinTypeRefiner");
            return d0.this.a(gVar).e();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b<T> implements Comparator {

        /* renamed from: c */
        final /* synthetic */ gc.l f17928c;

        public b(gc.l lVar) {
            this.f17928c = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int a10;
            e0 e0Var = (e0) t10;
            gc.l lVar = this.f17928c;
            hc.t.d(e0Var, "it");
            String obj = lVar.invoke(e0Var).toString();
            e0 e0Var2 = (e0) t11;
            gc.l lVar2 = this.f17928c;
            hc.t.d(e0Var2, "it");
            a10 = wb.b.a(obj, lVar2.invoke(e0Var2).toString());
            return a10;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends hc.v implements gc.l<e0, String> {

        /* renamed from: c */
        public static final c f17929c = new c();

        c() {
            super(1);
        }

        /* renamed from: b */
        public final String invoke(e0 e0Var) {
            hc.t.e(e0Var, "it");
            return e0Var.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends hc.v implements gc.l<e0, CharSequence> {

        /* renamed from: c */
        final /* synthetic */ gc.l<e0, Object> f17930c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(gc.l<? super e0, ? extends Object> lVar) {
            super(1);
            this.f17930c = lVar;
        }

        /* renamed from: b */
        public final CharSequence invoke(e0 e0Var) {
            gc.l<e0, Object> lVar = this.f17930c;
            hc.t.d(e0Var, "it");
            return lVar.invoke(e0Var).toString();
        }
    }

    public d0(Collection<? extends e0> collection) {
        hc.t.e(collection, "typesToIntersect");
        collection.isEmpty();
        LinkedHashSet<e0> linkedHashSet = new LinkedHashSet<>(collection);
        this.f17925b = linkedHashSet;
        this.f17926c = linkedHashSet.hashCode();
    }

    private d0(Collection<? extends e0> collection, e0 e0Var) {
        this(collection);
        this.f17924a = e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String h(d0 d0Var, gc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = c.f17929c;
        }
        return d0Var.g(lVar);
    }

    public final he.h d() {
        return he.n.Companion.a("member scope for intersection type", this.f17925b);
    }

    public final m0 e() {
        List h10;
        a1 h11 = a1.Companion.h();
        h10 = ub.u.h();
        return f0.k(h11, this, h10, false, d(), new a());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return hc.t.a(this.f17925b, ((d0) obj).f17925b);
        }
        return false;
    }

    public final e0 f() {
        return this.f17924a;
    }

    public final String g(gc.l<? super e0, ? extends Object> lVar) {
        List w02;
        String e02;
        hc.t.e(lVar, "getProperTypeRelatedToStringify");
        w02 = ub.c0.w0(this.f17925b, new b(lVar));
        e02 = ub.c0.e0(w02, " & ", "{", "}", 0, null, new d(lVar), 24, null);
        return e02;
    }

    @Override // oe.e1
    public List<xc.f1> getParameters() {
        List<xc.f1> h10;
        h10 = ub.u.h();
        return h10;
    }

    public int hashCode() {
        return this.f17926c;
    }

    /* renamed from: i */
    public d0 a(pe.g gVar) {
        int s10;
        hc.t.e(gVar, "kotlinTypeRefiner");
        Collection<e0> l10 = l();
        s10 = ub.v.s(l10, 10);
        ArrayList arrayList = new ArrayList(s10);
        boolean z10 = false;
        for (e0 e0Var : l10) {
            arrayList.add(e0Var.Y0(gVar));
            z10 = true;
        }
        d0 d0Var = null;
        e0 e0Var2 = null;
        if (z10) {
            e0 f10 = f();
            if (f10 != null) {
                e0Var2 = f10.Y0(gVar);
            }
            d0Var = new d0(arrayList).j(e0Var2);
        }
        return d0Var == null ? this : d0Var;
    }

    public final d0 j(e0 e0Var) {
        return new d0(this.f17925b, e0Var);
    }

    @Override // oe.e1
    public Collection<e0> l() {
        return this.f17925b;
    }

    public String toString() {
        return h(this, null, 1, null);
    }

    @Override // oe.e1
    public uc.h x() {
        uc.h x10 = this.f17925b.iterator().next().W0().x();
        hc.t.d(x10, "intersectedTypes.iterato…xt().constructor.builtIns");
        return x10;
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
