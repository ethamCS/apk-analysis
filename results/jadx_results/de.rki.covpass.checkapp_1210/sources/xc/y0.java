package xc;

import he.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes.dex */
public final class y0<T extends he.h> {

    /* renamed from: a */
    private final e f25597a;

    /* renamed from: b */
    private final gc.l<pe.g, T> f25598b;

    /* renamed from: c */
    private final pe.g f25599c;

    /* renamed from: d */
    private final ne.i f25600d;

    /* renamed from: e */
    static final /* synthetic */ oc.k<Object>[] f25596e = {hc.k0.g(new hc.e0(hc.k0.b(y0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    public static final a Companion = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T extends he.h> y0<T> a(e eVar, ne.n nVar, pe.g gVar, gc.l<? super pe.g, ? extends T> lVar) {
            hc.t.e(eVar, "classDescriptor");
            hc.t.e(nVar, "storageManager");
            hc.t.e(gVar, "kotlinTypeRefinerForOwnerModule");
            hc.t.e(lVar, "scopeFactory");
            return new y0<>(eVar, nVar, lVar, gVar, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.a<T> {

        /* renamed from: c */
        final /* synthetic */ y0<T> f25601c;

        /* renamed from: d */
        final /* synthetic */ pe.g f25602d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y0<T> y0Var, pe.g gVar) {
            super(0);
            this.f25601c = y0Var;
            this.f25602d = gVar;
        }

        /* renamed from: b */
        public final T invoke() {
            return (T) ((y0) this.f25601c).f25598b.invoke(this.f25602d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends hc.v implements gc.a<T> {

        /* renamed from: c */
        final /* synthetic */ y0<T> f25603c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y0<T> y0Var) {
            super(0);
            this.f25603c = y0Var;
        }

        /* renamed from: b */
        public final T invoke() {
            return (T) ((y0) this.f25603c).f25598b.invoke(((y0) this.f25603c).f25599c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private y0(e eVar, ne.n nVar, gc.l<? super pe.g, ? extends T> lVar, pe.g gVar) {
        this.f25597a = eVar;
        this.f25598b = lVar;
        this.f25599c = gVar;
        this.f25600d = nVar.d(new c(this));
    }

    public /* synthetic */ y0(e eVar, ne.n nVar, gc.l lVar, pe.g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, nVar, lVar, gVar);
    }

    private final T d() {
        return (T) ne.m.a(this.f25600d, this, f25596e[0]);
    }

    public final T c(pe.g gVar) {
        hc.t.e(gVar, "kotlinTypeRefiner");
        if (!gVar.d(ee.a.l(this.f25597a))) {
            return d();
        }
        oe.e1 r10 = this.f25597a.r();
        hc.t.d(r10, "classDescriptor.typeConstructor");
        return !gVar.e(r10) ? d() : (T) gVar.c(this.f25597a, new b(this, gVar));
    }
}
