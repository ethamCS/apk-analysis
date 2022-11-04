package wc;

import gc.l;
import hc.e0;
import hc.k0;
import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ne.n;
import oc.k;
import ub.c0;
import ub.x0;
import ub.y0;
import uc.k;
import xc.a1;
import xc.h0;
import xc.l0;
import xc.m;
/* loaded from: classes.dex */
public final class e implements zc.b {

    /* renamed from: f */
    private static final wd.f f24730f;

    /* renamed from: g */
    private static final wd.b f24731g;

    /* renamed from: a */
    private final h0 f24732a;

    /* renamed from: b */
    private final l<h0, m> f24733b;

    /* renamed from: c */
    private final ne.i f24734c;

    /* renamed from: d */
    static final /* synthetic */ k<Object>[] f24728d = {k0.g(new e0(k0.b(e.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
    public static final b Companion = new b(null);

    /* renamed from: e */
    private static final wd.c f24729e = uc.k.f23458r;

    /* loaded from: classes.dex */
    public static final class a extends v implements l<h0, uc.b> {

        /* renamed from: c */
        public static final a f24735c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final uc.b invoke(h0 h0Var) {
            Object V;
            t.e(h0Var, "module");
            List<l0> f02 = h0Var.F(e.f24729e).f0();
            ArrayList arrayList = new ArrayList();
            for (Object obj : f02) {
                if (obj instanceof uc.b) {
                    arrayList.add(obj);
                }
            }
            V = c0.V(arrayList);
            return (uc.b) V;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wd.b a() {
            return e.f24731g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.a<ad.h> {

        /* renamed from: d */
        final /* synthetic */ n f24737d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(0);
            e.this = r1;
            this.f24737d = nVar;
        }

        /* renamed from: b */
        public final ad.h invoke() {
            List d10;
            Set<xc.d> b10;
            m mVar = (m) e.this.f24733b.invoke(e.this.f24732a);
            wd.f fVar = e.f24730f;
            xc.e0 e0Var = xc.e0.ABSTRACT;
            xc.f fVar2 = xc.f.INTERFACE;
            d10 = ub.t.d(e.this.f24732a.x().i());
            ad.h hVar = new ad.h(mVar, fVar, e0Var, fVar2, d10, a1.f25519a, false, this.f24737d);
            wc.a aVar = new wc.a(this.f24737d, hVar);
            b10 = y0.b();
            hVar.T0(aVar, b10, null);
            return hVar;
        }
    }

    static {
        wd.d dVar = k.a.f23471d;
        wd.f i10 = dVar.i();
        t.d(i10, "cloneable.shortName()");
        f24730f = i10;
        wd.b m10 = wd.b.m(dVar.l());
        t.d(m10, "topLevel(StandardNames.FqNames.cloneable.toSafe())");
        f24731g = m10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(n nVar, h0 h0Var, l<? super h0, ? extends m> lVar) {
        t.e(nVar, "storageManager");
        t.e(h0Var, "moduleDescriptor");
        t.e(lVar, "computeContainingDeclaration");
        this.f24732a = h0Var;
        this.f24733b = lVar;
        this.f24734c = nVar.d(new c(nVar));
    }

    public /* synthetic */ e(n nVar, h0 h0Var, l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, h0Var, (i10 & 4) != 0 ? a.f24735c : lVar);
    }

    private final ad.h i() {
        return (ad.h) ne.m.a(this.f24734c, this, f24728d[0]);
    }

    @Override // zc.b
    public xc.e a(wd.b bVar) {
        t.e(bVar, "classId");
        if (t.a(bVar, f24731g)) {
            return i();
        }
        return null;
    }

    @Override // zc.b
    public Collection<xc.e> b(wd.c cVar) {
        Set b10;
        Set a10;
        t.e(cVar, "packageFqName");
        if (t.a(cVar, f24729e)) {
            a10 = x0.a(i());
            return a10;
        }
        b10 = y0.b();
        return b10;
    }

    @Override // zc.b
    public boolean c(wd.c cVar, wd.f fVar) {
        t.e(cVar, "packageFqName");
        t.e(fVar, "name");
        return t.a(fVar, f24730f) && t.a(cVar, f24729e);
    }
}
