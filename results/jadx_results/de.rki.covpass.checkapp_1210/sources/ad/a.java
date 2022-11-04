package ad;

import java.util.Collections;
import java.util.List;
import oe.j1;
import oe.l1;
import oe.n1;
import xc.e1;
import xc.x0;
/* loaded from: classes.dex */
public abstract class a extends t {

    /* renamed from: c */
    private final wd.f f246c;

    /* renamed from: d */
    protected final ne.i<oe.m0> f247d;

    /* renamed from: q */
    private final ne.i<he.h> f248q;

    /* renamed from: x */
    private final ne.i<x0> f249x;

    /* renamed from: ad.a$a */
    /* loaded from: classes.dex */
    public class C0004a implements gc.a<oe.m0> {

        /* renamed from: ad.a$a$a */
        /* loaded from: classes.dex */
        public class C0005a implements gc.l<pe.g, oe.m0> {
            C0005a() {
                C0004a.this = r1;
            }

            /* renamed from: a */
            public oe.m0 invoke(pe.g gVar) {
                xc.h f10 = gVar.f(a.this);
                return f10 == null ? a.this.f247d.invoke() : f10 instanceof e1 ? oe.f0.b((e1) f10, n1.g(f10.r().getParameters())) : f10 instanceof t ? n1.t(f10.r().a(gVar), ((t) f10).y0(gVar), this) : f10.u();
            }
        }

        C0004a() {
            a.this = r1;
        }

        /* renamed from: a */
        public oe.m0 invoke() {
            a aVar = a.this;
            return n1.u(aVar, aVar.I0(), new C0005a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements gc.a<he.h> {
        b() {
            a.this = r1;
        }

        /* renamed from: a */
        public he.h invoke() {
            return new he.f(a.this.I0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements gc.a<x0> {
        c() {
            a.this = r1;
        }

        /* renamed from: a */
        public x0 invoke() {
            return new q(a.this);
        }
    }

    public a(ne.n nVar, wd.f fVar) {
        if (nVar == null) {
            z0(0);
        }
        if (fVar == null) {
            z0(1);
        }
        this.f246c = fVar;
        this.f247d = nVar.d(new C0004a());
        this.f248q = nVar.d(new b());
        this.f249x = nVar.d(new c());
    }

    private static /* synthetic */ void z0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i10 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i10 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i10 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i10 == 19) {
            objArr[1] = "substitute";
        } else if (i10 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) {
            throw new IllegalStateException(format);
        }
    }

    @Override // xc.e
    public he.h I0() {
        he.h y02 = y0(ee.a.k(ae.d.g(this)));
        if (y02 == null) {
            z0(17);
        }
        return y02;
    }

    @Override // xc.e
    public he.h K(j1 j1Var) {
        if (j1Var == null) {
            z0(15);
        }
        he.h e02 = e0(j1Var, ee.a.k(ae.d.g(this)));
        if (e02 == null) {
            z0(16);
        }
        return e02;
    }

    /* renamed from: M0 */
    public xc.e c(l1 l1Var) {
        if (l1Var == null) {
            z0(18);
        }
        return l1Var.k() ? this : new s(this, l1Var);
    }

    @Override // xc.e
    public List<x0> O0() {
        List<x0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            z0(6);
        }
        return emptyList;
    }

    @Override // xc.e
    public x0 S0() {
        x0 invoke = this.f249x.invoke();
        if (invoke == null) {
            z0(5);
        }
        return invoke;
    }

    @Override // xc.e, xc.m, xc.h
    public xc.e a() {
        return this;
    }

    @Override // ad.t
    public he.h e0(j1 j1Var, pe.g gVar) {
        if (j1Var == null) {
            z0(10);
        }
        if (gVar == null) {
            z0(11);
        }
        if (!j1Var.f()) {
            return new he.m(y0(gVar), l1.g(j1Var));
        }
        he.h y02 = y0(gVar);
        if (y02 == null) {
            z0(12);
        }
        return y02;
    }

    @Override // xc.m
    public <R, D> R g0(xc.o<R, D> oVar, D d10) {
        return oVar.d(this, d10);
    }

    @Override // xc.j0
    public wd.f getName() {
        wd.f fVar = this.f246c;
        if (fVar == null) {
            z0(2);
        }
        return fVar;
    }

    @Override // xc.e, xc.h
    public oe.m0 u() {
        oe.m0 invoke = this.f247d.invoke();
        if (invoke == null) {
            z0(20);
        }
        return invoke;
    }

    @Override // xc.e
    public he.h w0() {
        he.h invoke = this.f248q.invoke();
        if (invoke == null) {
            z0(4);
        }
        return invoke;
    }
}
