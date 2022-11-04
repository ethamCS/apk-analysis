package ad;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import oe.a1;
import oe.e1;
import oe.r1;
import xc.d1;
import xc.f1;
/* loaded from: classes.dex */
public abstract class e extends k implements f1 {
    private final boolean U3;
    private final int V3;
    private final ne.i<e1> W3;
    private final ne.i<oe.m0> X3;
    private final ne.n Y3;

    /* renamed from: y */
    private final r1 f295y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements gc.a<e1> {

        /* renamed from: c */
        final /* synthetic */ ne.n f296c;

        /* renamed from: d */
        final /* synthetic */ d1 f297d;

        a(ne.n nVar, d1 d1Var) {
            e.this = r1;
            this.f296c = nVar;
            this.f297d = d1Var;
        }

        /* renamed from: a */
        public e1 invoke() {
            return new c(e.this, this.f296c, this.f297d);
        }
    }

    /* loaded from: classes.dex */
    public class b implements gc.a<oe.m0> {

        /* renamed from: c */
        final /* synthetic */ wd.f f299c;

        /* loaded from: classes.dex */
        public class a implements gc.a<he.h> {
            a() {
                b.this = r1;
            }

            /* renamed from: a */
            public he.h invoke() {
                return he.n.j("Scope for type parameter " + b.this.f299c.b(), e.this.getUpperBounds());
            }
        }

        b(wd.f fVar) {
            e.this = r1;
            this.f299c = fVar;
        }

        /* renamed from: a */
        public oe.m0 invoke() {
            return oe.f0.j(a1.Companion.h(), e.this.r(), Collections.emptyList(), false, new he.g(new a()));
        }
    }

    /* loaded from: classes.dex */
    public class c extends oe.g {

        /* renamed from: d */
        private final d1 f302d;

        /* renamed from: e */
        final /* synthetic */ e f303e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e eVar, ne.n nVar, d1 d1Var) {
            super(nVar);
            if (nVar == null) {
                s(0);
            }
            this.f303e = eVar;
            this.f302d = d1Var;
        }

        private static /* synthetic */ void s(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i10 == 2) {
                objArr[1] = "getParameters";
            } else if (i10 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i10 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i10 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i10 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) {
                throw new IllegalStateException(format);
            }
        }

        @Override // oe.m
        protected boolean f(xc.h hVar) {
            if (hVar == null) {
                s(9);
            }
            return (hVar instanceof f1) && ae.b.f422a.f(this.f303e, (f1) hVar, true);
        }

        @Override // oe.e1
        public List<f1> getParameters() {
            List<f1> emptyList = Collections.emptyList();
            if (emptyList == null) {
                s(2);
            }
            return emptyList;
        }

        @Override // oe.g
        protected Collection<oe.e0> i() {
            List<oe.e0> U0 = this.f303e.U0();
            if (U0 == null) {
                s(1);
            }
            return U0;
        }

        @Override // oe.g
        protected oe.e0 j() {
            return qe.k.d(qe.j.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // oe.g
        protected d1 n() {
            d1 d1Var = this.f302d;
            if (d1Var == null) {
                s(5);
            }
            return d1Var;
        }

        @Override // oe.g
        protected List<oe.e0> p(List<oe.e0> list) {
            if (list == null) {
                s(7);
            }
            List<oe.e0> M0 = this.f303e.M0(list);
            if (M0 == null) {
                s(8);
            }
            return M0;
        }

        @Override // oe.g
        protected void r(oe.e0 e0Var) {
            if (e0Var == null) {
                s(6);
            }
            this.f303e.T0(e0Var);
        }

        public String toString() {
            return this.f303e.getName().toString();
        }

        @Override // oe.e1
        public uc.h x() {
            uc.h f10 = ee.a.f(this.f303e);
            if (f10 == null) {
                s(4);
            }
            return f10;
        }

        @Override // oe.e1
        public boolean y() {
            return true;
        }

        @Override // oe.m, oe.e1
        public xc.h z() {
            e eVar = this.f303e;
            if (eVar == null) {
                s(3);
            }
            return eVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ne.n nVar, xc.m mVar, yc.g gVar, wd.f fVar, r1 r1Var, boolean z10, int i10, xc.a1 a1Var, d1 d1Var) {
        super(mVar, gVar, fVar, a1Var);
        if (nVar == null) {
            e0(0);
        }
        if (mVar == null) {
            e0(1);
        }
        if (gVar == null) {
            e0(2);
        }
        if (fVar == null) {
            e0(3);
        }
        if (r1Var == null) {
            e0(4);
        }
        if (a1Var == null) {
            e0(5);
        }
        if (d1Var == null) {
            e0(6);
        }
        this.f295y = r1Var;
        this.U3 = z10;
        this.V3 = i10;
        this.W3 = nVar.d(new a(nVar, d1Var));
        this.X3 = nVar.d(new b(fVar));
        this.Y3 = nVar;
    }

    private static /* synthetic */ void e0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // xc.f1
    public ne.n M() {
        ne.n nVar = this.Y3;
        if (nVar == null) {
            e0(14);
        }
        return nVar;
    }

    protected List<oe.e0> M0(List<oe.e0> list) {
        if (list == null) {
            e0(12);
        }
        if (list == null) {
            e0(13);
        }
        return list;
    }

    protected abstract void T0(oe.e0 e0Var);

    protected abstract List<oe.e0> U0();

    @Override // xc.f1
    public boolean Y() {
        return false;
    }

    @Override // xc.f1
    public boolean Z() {
        return this.U3;
    }

    @Override // ad.k, ad.j, xc.m, xc.h
    /* renamed from: a */
    public f1 z0() {
        f1 f1Var = (f1) super.a();
        if (f1Var == null) {
            e0(11);
        }
        return f1Var;
    }

    @Override // xc.m
    public <R, D> R g0(xc.o<R, D> oVar, D d10) {
        return oVar.k(this, d10);
    }

    @Override // xc.f1
    public List<oe.e0> getUpperBounds() {
        List<oe.e0> l10 = ((c) r()).l();
        if (l10 == null) {
            e0(8);
        }
        return l10;
    }

    @Override // xc.f1
    public int l() {
        return this.V3;
    }

    @Override // xc.f1, xc.h
    public final e1 r() {
        e1 invoke = this.W3.invoke();
        if (invoke == null) {
            e0(9);
        }
        return invoke;
    }

    @Override // xc.h
    public oe.m0 u() {
        oe.m0 invoke = this.X3.invoke();
        if (invoke == null) {
            e0(10);
        }
        return invoke;
    }

    @Override // xc.f1
    public r1 w() {
        r1 r1Var = this.f295y;
        if (r1Var == null) {
            e0(7);
        }
        return r1Var;
    }
}
