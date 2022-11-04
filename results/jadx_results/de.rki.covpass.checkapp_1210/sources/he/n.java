package he;

import hc.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.e0;
import tb.r;
import ub.c0;
import ub.v;
import xc.u0;
import xc.z0;
/* loaded from: classes3.dex */
public final class n extends he.a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f11883a;

    /* renamed from: b */
    private final h f11884b;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fc.c
        public final h a(String str, Collection<? extends e0> collection) {
            int s10;
            t.e(str, "message");
            t.e(collection, "types");
            s10 = v.s(collection, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (e0 e0Var : collection) {
                arrayList.add(e0Var.z());
            }
            ye.e<h> b10 = xe.a.b(arrayList);
            h b11 = he.b.Companion.b(str, b10);
            return b10.size() <= 1 ? b11 : new n(str, b11, null);
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends hc.v implements gc.l<xc.a, xc.a> {

        /* renamed from: c */
        public static final b f11885c = new b();

        b() {
            super(1);
        }

        /* renamed from: b */
        public final xc.a invoke(xc.a aVar) {
            t.e(aVar, "$this$selectMostSpecificInEachOverridableGroup");
            return aVar;
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends hc.v implements gc.l<z0, xc.a> {

        /* renamed from: c */
        public static final c f11886c = new c();

        c() {
            super(1);
        }

        /* renamed from: b */
        public final xc.a invoke(z0 z0Var) {
            t.e(z0Var, "$this$selectMostSpecificInEachOverridableGroup");
            return z0Var;
        }
    }

    /* loaded from: classes3.dex */
    static final class d extends hc.v implements gc.l<u0, xc.a> {

        /* renamed from: c */
        public static final d f11887c = new d();

        d() {
            super(1);
        }

        /* renamed from: b */
        public final xc.a invoke(u0 u0Var) {
            t.e(u0Var, "$this$selectMostSpecificInEachOverridableGroup");
            return u0Var;
        }
    }

    private n(String str, h hVar) {
        this.f11883a = str;
        this.f11884b = hVar;
    }

    public /* synthetic */ n(String str, h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, hVar);
    }

    @fc.c
    public static final h j(String str, Collection<? extends e0> collection) {
        return Companion.a(str, collection);
    }

    @Override // he.a, he.h
    public Collection<u0> a(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        return ae.l.a(super.a(fVar, bVar), d.f11887c);
    }

    @Override // he.a, he.h
    public Collection<z0> b(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        return ae.l.a(super.b(fVar, bVar), c.f11886c);
    }

    @Override // he.a, he.k
    public Collection<xc.m> e(he.d dVar, gc.l<? super wd.f, Boolean> lVar) {
        List o02;
        t.e(dVar, "kindFilter");
        t.e(lVar, "nameFilter");
        Collection<xc.m> e10 = super.e(dVar, lVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : e10) {
            if (((xc.m) obj) instanceof xc.a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        r rVar = new r(arrayList, arrayList2);
        List list = (List) rVar.b();
        t.c(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        o02 = c0.o0(ae.l.a(list, b.f11885c), (List) rVar.c());
        return o02;
    }

    @Override // he.a
    protected h i() {
        return this.f11884b;
    }
}
