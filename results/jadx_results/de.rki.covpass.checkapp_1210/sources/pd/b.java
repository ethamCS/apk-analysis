package pd;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ke.z;
import pd.b.a;
import pd.q;
import pd.t;
import rd.c;
import ud.a;
import vd.d;
import xc.a1;
import yd.i;
/* loaded from: classes.dex */
public abstract class b<A, S extends a<? extends A>> implements ke.f<A> {

    /* renamed from: a */
    private final o f19067a;

    /* loaded from: classes.dex */
    public static abstract class a<A> {
        public abstract Map<t, List<A>> a();
    }

    /* renamed from: pd.b$b */
    /* loaded from: classes.dex */
    public enum EnumC0304b {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19072a;

        static {
            int[] iArr = new int[ke.b.values().length];
            iArr[ke.b.PROPERTY_GETTER.ordinal()] = 1;
            iArr[ke.b.PROPERTY_SETTER.ordinal()] = 2;
            iArr[ke.b.PROPERTY.ordinal()] = 3;
            f19072a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements q.c {

        /* renamed from: a */
        final /* synthetic */ b<A, S> f19073a;

        /* renamed from: b */
        final /* synthetic */ ArrayList<A> f19074b;

        d(b<A, S> bVar, ArrayList<A> arrayList) {
            this.f19073a = bVar;
            this.f19074b = arrayList;
        }

        @Override // pd.q.c
        public void a() {
        }

        @Override // pd.q.c
        public q.a c(wd.b bVar, a1 a1Var) {
            hc.t.e(bVar, "classId");
            hc.t.e(a1Var, "source");
            return this.f19073a.y(bVar, a1Var, this.f19074b);
        }
    }

    public b(o oVar) {
        hc.t.e(oVar, "kotlinClassFinder");
        this.f19067a = oVar;
    }

    private final q B(z.a aVar) {
        a1 c10 = aVar.c();
        s sVar = c10 instanceof s ? (s) c10 : null;
        if (sVar != null) {
            return sVar.d();
        }
        return null;
    }

    private final int l(ke.z zVar, yd.q qVar) {
        if (qVar instanceof rd.i) {
            if (td.f.d((rd.i) qVar)) {
                return 1;
            }
        } else if (qVar instanceof rd.n) {
            if (td.f.e((rd.n) qVar)) {
                return 1;
            }
        } else if (!(qVar instanceof rd.d)) {
            throw new UnsupportedOperationException("Unsupported message: " + qVar.getClass());
        } else {
            hc.t.c(zVar, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            z.a aVar = (z.a) zVar;
            if (aVar.g() == c.EnumC0343c.ENUM_CLASS) {
                return 2;
            }
            if (aVar.i()) {
                return 1;
            }
        }
        return 0;
    }

    private final List<A> m(ke.z zVar, t tVar, boolean z10, boolean z11, Boolean bool, boolean z12) {
        List<A> h10;
        List<A> h11;
        q o10 = o(zVar, v(zVar, z10, z11, bool, z12));
        if (o10 == null) {
            h11 = ub.u.h();
            return h11;
        }
        List<A> list = p(o10).a().get(tVar);
        if (list != null) {
            return list;
        }
        h10 = ub.u.h();
        return h10;
    }

    static /* synthetic */ List n(b bVar, ke.z zVar, t tVar, boolean z10, boolean z11, Boolean bool, boolean z12, int i10, Object obj) {
        if (obj == null) {
            return bVar.m(zVar, tVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? false : z12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    public static /* synthetic */ t s(b bVar, yd.q qVar, td.c cVar, td.g gVar, ke.b bVar2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 16) != 0) {
                z10 = false;
            }
            return bVar.r(qVar, cVar, gVar, bVar2, z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    public static /* synthetic */ t u(b bVar, rd.n nVar, td.c cVar, td.g gVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if (obj == null) {
            return bVar.t(nVar, cVar, gVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? true : z12);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPropertySignature");
    }

    private final List<A> z(ke.z zVar, rd.n nVar, EnumC0304b enumC0304b) {
        boolean N;
        List<A> h10;
        List<A> h11;
        List<A> h12;
        Boolean d10 = td.b.A.d(nVar.C0());
        hc.t.d(d10, "IS_CONST.get(proto.flags)");
        boolean booleanValue = d10.booleanValue();
        boolean f10 = vd.i.f(nVar);
        EnumC0304b enumC0304b2 = EnumC0304b.PROPERTY;
        td.c b10 = zVar.b();
        td.g d11 = zVar.d();
        if (enumC0304b == enumC0304b2) {
            t u10 = u(this, nVar, b10, d11, false, true, false, 40, null);
            if (u10 != null) {
                return n(this, zVar, u10, true, false, Boolean.valueOf(booleanValue), f10, 8, null);
            }
            h12 = ub.u.h();
            return h12;
        }
        t u11 = u(this, nVar, b10, d11, true, false, false, 48, null);
        if (u11 == null) {
            h11 = ub.u.h();
            return h11;
        }
        boolean z10 = false;
        N = bf.y.N(u11.a(), "$delegate", false, 2, null);
        if (enumC0304b == EnumC0304b.DELEGATE_FIELD) {
            z10 = true;
        }
        if (N == z10) {
            return m(zVar, u11, true, true, Boolean.valueOf(booleanValue), f10);
        }
        h10 = ub.u.h();
        return h10;
    }

    protected abstract A A(rd.b bVar, td.c cVar);

    @Override // ke.f
    public List<A> a(ke.z zVar, rd.n nVar) {
        hc.t.e(zVar, "container");
        hc.t.e(nVar, "proto");
        return z(zVar, nVar, EnumC0304b.DELEGATE_FIELD);
    }

    @Override // ke.f
    public List<A> b(rd.q qVar, td.c cVar) {
        int s10;
        hc.t.e(qVar, "proto");
        hc.t.e(cVar, "nameResolver");
        Object I = qVar.I(ud.a.f23540f);
        hc.t.d(I, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<rd.b> iterable = (Iterable) I;
        s10 = ub.v.s(iterable, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (rd.b bVar : iterable) {
            hc.t.d(bVar, "it");
            arrayList.add(A(bVar, cVar));
        }
        return arrayList;
    }

    @Override // ke.f
    public List<A> c(ke.z zVar, yd.q qVar, ke.b bVar) {
        List<A> h10;
        hc.t.e(zVar, "container");
        hc.t.e(qVar, "proto");
        hc.t.e(bVar, "kind");
        t s10 = s(this, qVar, zVar.b(), zVar.d(), bVar, false, 16, null);
        if (s10 != null) {
            return n(this, zVar, t.Companion.e(s10, 0), false, false, null, false, 60, null);
        }
        h10 = ub.u.h();
        return h10;
    }

    @Override // ke.f
    public List<A> d(ke.z zVar, rd.g gVar) {
        hc.t.e(zVar, "container");
        hc.t.e(gVar, "proto");
        t.a aVar = t.Companion;
        String string = zVar.b().getString(gVar.h0());
        String c10 = ((z.a) zVar).e().c();
        hc.t.d(c10, "container as ProtoContai…Class).classId.asString()");
        return n(this, zVar, aVar.a(string, vd.b.b(c10)), false, false, null, false, 60, null);
    }

    @Override // ke.f
    public List<A> f(ke.z zVar, rd.n nVar) {
        hc.t.e(zVar, "container");
        hc.t.e(nVar, "proto");
        return z(zVar, nVar, EnumC0304b.BACKING_FIELD);
    }

    @Override // ke.f
    public List<A> g(ke.z zVar, yd.q qVar, ke.b bVar, int i10, rd.u uVar) {
        List<A> h10;
        hc.t.e(zVar, "container");
        hc.t.e(qVar, "callableProto");
        hc.t.e(bVar, "kind");
        hc.t.e(uVar, "proto");
        t s10 = s(this, qVar, zVar.b(), zVar.d(), bVar, false, 16, null);
        if (s10 != null) {
            return n(this, zVar, t.Companion.e(s10, i10 + l(zVar, qVar)), false, false, null, false, 60, null);
        }
        h10 = ub.u.h();
        return h10;
    }

    @Override // ke.f
    public List<A> i(rd.s sVar, td.c cVar) {
        int s10;
        hc.t.e(sVar, "proto");
        hc.t.e(cVar, "nameResolver");
        Object I = sVar.I(ud.a.f23542h);
        hc.t.d(I, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<rd.b> iterable = (Iterable) I;
        s10 = ub.v.s(iterable, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (rd.b bVar : iterable) {
            hc.t.d(bVar, "it");
            arrayList.add(A(bVar, cVar));
        }
        return arrayList;
    }

    @Override // ke.f
    public List<A> j(ke.z zVar, yd.q qVar, ke.b bVar) {
        List<A> h10;
        hc.t.e(zVar, "container");
        hc.t.e(qVar, "proto");
        hc.t.e(bVar, "kind");
        if (bVar == ke.b.PROPERTY) {
            return z(zVar, (rd.n) qVar, EnumC0304b.PROPERTY);
        }
        t s10 = s(this, qVar, zVar.b(), zVar.d(), bVar, false, 16, null);
        if (s10 != null) {
            return n(this, zVar, s10, false, false, null, false, 60, null);
        }
        h10 = ub.u.h();
        return h10;
    }

    @Override // ke.f
    public List<A> k(z.a aVar) {
        hc.t.e(aVar, "container");
        q B = B(aVar);
        if (B != null) {
            ArrayList arrayList = new ArrayList(1);
            B.d(new d(this, arrayList), q(B));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + aVar.a()).toString());
    }

    public final q o(ke.z zVar, q qVar) {
        hc.t.e(zVar, "container");
        if (qVar == null) {
            if (!(zVar instanceof z.a)) {
                return null;
            }
            return B((z.a) zVar);
        }
        return qVar;
    }

    protected abstract S p(q qVar);

    public byte[] q(q qVar) {
        hc.t.e(qVar, "kotlinClass");
        return null;
    }

    public final t r(yd.q qVar, td.c cVar, td.g gVar, ke.b bVar, boolean z10) {
        String str;
        a.c cVar2;
        t.a aVar;
        t.a aVar2;
        d.b e10;
        hc.t.e(qVar, "proto");
        hc.t.e(cVar, "nameResolver");
        hc.t.e(gVar, "typeTable");
        hc.t.e(bVar, "kind");
        if (qVar instanceof rd.d) {
            aVar2 = t.Companion;
            e10 = vd.i.f24018a.b((rd.d) qVar, cVar, gVar);
            if (e10 == null) {
                return null;
            }
        } else if (!(qVar instanceof rd.i)) {
            if (!(qVar instanceof rd.n)) {
                return null;
            }
            i.f<rd.n, a.d> fVar = ud.a.f23538d;
            hc.t.d(fVar, "propertySignature");
            a.d dVar = (a.d) td.e.a((i.d) qVar, fVar);
            if (dVar == null) {
                return null;
            }
            int i10 = c.f19072a[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return t((rd.n) qVar, cVar, gVar, true, true, z10);
                    }
                    return null;
                } else if (!dVar.j0()) {
                    return null;
                } else {
                    aVar = t.Companion;
                    cVar2 = dVar.e0();
                    str = "signature.setter";
                }
            } else if (!dVar.i0()) {
                return null;
            } else {
                aVar = t.Companion;
                cVar2 = dVar.d0();
                str = "signature.getter";
            }
            hc.t.d(cVar2, str);
            return aVar.c(cVar, cVar2);
        } else {
            aVar2 = t.Companion;
            e10 = vd.i.f24018a.e((rd.i) qVar, cVar, gVar);
            if (e10 == null) {
                return null;
            }
        }
        return aVar2.b(e10);
    }

    protected final t t(rd.n nVar, td.c cVar, td.g gVar, boolean z10, boolean z11, boolean z12) {
        hc.t.e(nVar, "proto");
        hc.t.e(cVar, "nameResolver");
        hc.t.e(gVar, "typeTable");
        i.f<rd.n, a.d> fVar = ud.a.f23538d;
        hc.t.d(fVar, "propertySignature");
        a.d dVar = (a.d) td.e.a(nVar, fVar);
        if (dVar == null) {
            return null;
        }
        if (z10) {
            d.a c10 = vd.i.f24018a.c(nVar, cVar, gVar, z12);
            if (c10 != null) {
                return t.Companion.b(c10);
            }
            return null;
        } else if (!z11 || !dVar.k0()) {
            return null;
        } else {
            t.a aVar = t.Companion;
            a.c f02 = dVar.f0();
            hc.t.d(f02, "signature.syntheticMethod");
            return aVar.c(cVar, f02);
        }
    }

    public final q v(ke.z zVar, boolean z10, boolean z11, Boolean bool, boolean z12) {
        z.a h10;
        o oVar;
        String D;
        wd.b m10;
        String str;
        hc.t.e(zVar, "container");
        if (z10) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + zVar + ')').toString());
            }
            if (zVar instanceof z.a) {
                z.a aVar = (z.a) zVar;
                if (aVar.g() == c.EnumC0343c.INTERFACE) {
                    oVar = this.f19067a;
                    m10 = aVar.e().d(wd.f.j("DefaultImpls"));
                    str = "container.classId.create…EFAULT_IMPLS_CLASS_NAME))";
                    hc.t.d(m10, str);
                    return p.b(oVar, m10);
                }
            }
            if (bool.booleanValue() && (zVar instanceof z.b)) {
                a1 c10 = zVar.c();
                k kVar = c10 instanceof k ? (k) c10 : null;
                fe.d f10 = kVar != null ? kVar.f() : null;
                if (f10 != null) {
                    oVar = this.f19067a;
                    String f11 = f10.f();
                    hc.t.d(f11, "facadeClassName.internalName");
                    D = bf.x.D(f11, '/', '.', false, 4, null);
                    m10 = wd.b.m(new wd.c(D));
                    str = "topLevel(FqName(facadeCl…lName.replace('/', '.')))";
                    hc.t.d(m10, str);
                    return p.b(oVar, m10);
                }
            }
        }
        if (z11 && (zVar instanceof z.a)) {
            z.a aVar2 = (z.a) zVar;
            if (aVar2.g() == c.EnumC0343c.COMPANION_OBJECT && (h10 = aVar2.h()) != null && (h10.g() == c.EnumC0343c.CLASS || h10.g() == c.EnumC0343c.ENUM_CLASS || (z12 && (h10.g() == c.EnumC0343c.INTERFACE || h10.g() == c.EnumC0343c.ANNOTATION_CLASS)))) {
                return B(h10);
            }
        }
        if (!(zVar instanceof z.b) || !(zVar.c() instanceof k)) {
            return null;
        }
        a1 c11 = zVar.c();
        hc.t.c(c11, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        k kVar2 = (k) c11;
        q g10 = kVar2.g();
        return g10 == null ? p.b(this.f19067a, kVar2.d()) : g10;
    }

    public final boolean w(wd.b bVar) {
        q b10;
        hc.t.e(bVar, "classId");
        return bVar.g() != null && hc.t.a(bVar.j().b(), "Container") && (b10 = p.b(this.f19067a, bVar)) != null && tc.a.f22183a.c(b10);
    }

    protected abstract q.a x(wd.b bVar, a1 a1Var, List<A> list);

    public final q.a y(wd.b bVar, a1 a1Var, List<A> list) {
        hc.t.e(bVar, "annotationClassId");
        hc.t.e(a1Var, "source");
        hc.t.e(list, "result");
        if (tc.a.f22183a.b().contains(bVar)) {
            return null;
        }
        return x(bVar, a1Var, list);
    }
}
