package ad;

import xc.a1;
/* loaded from: classes.dex */
public abstract class g extends a {
    private final a1 U3;
    private final boolean V3;

    /* renamed from: y */
    private final xc.m f309y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ne.n nVar, xc.m mVar, wd.f fVar, a1 a1Var, boolean z10) {
        super(nVar, fVar);
        if (nVar == null) {
            z0(0);
        }
        if (mVar == null) {
            z0(1);
        }
        if (fVar == null) {
            z0(2);
        }
        if (a1Var == null) {
            z0(3);
        }
        this.f309y = mVar;
        this.U3 = a1Var;
        this.V3 = z10;
    }

    private static /* synthetic */ void z0(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 4 || i10 == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // xc.d0
    public boolean H() {
        return this.V3;
    }

    @Override // xc.e, xc.n, xc.y, xc.l
    public xc.m b() {
        xc.m mVar = this.f309y;
        if (mVar == null) {
            z0(4);
        }
        return mVar;
    }

    @Override // xc.p
    public a1 m() {
        a1 a1Var = this.U3;
        if (a1Var == null) {
            z0(5);
        }
        return a1Var;
    }
}
