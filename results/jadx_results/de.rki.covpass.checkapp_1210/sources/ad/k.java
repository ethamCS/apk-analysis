package ad;

import xc.a1;
/* loaded from: classes.dex */
public abstract class k extends j implements xc.n {

    /* renamed from: q */
    private final xc.m f324q;

    /* renamed from: x */
    private final a1 f325x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(xc.m mVar, yc.g gVar, wd.f fVar, a1 a1Var) {
        super(gVar, fVar);
        if (mVar == null) {
            e0(0);
        }
        if (gVar == null) {
            e0(1);
        }
        if (fVar == null) {
            e0(2);
        }
        if (a1Var == null) {
            e0(3);
        }
        this.f324q = mVar;
        this.f325x = a1Var;
    }

    private static /* synthetic */ void e0(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 4 || i10 == 5 || i10 == 6) {
            throw new IllegalStateException(format);
        }
    }

    public xc.m b() {
        xc.m mVar = this.f324q;
        if (mVar == null) {
            e0(5);
        }
        return mVar;
    }

    @Override // xc.p
    public a1 m() {
        a1 a1Var = this.f325x;
        if (a1Var == null) {
            e0(6);
        }
        return a1Var;
    }

    /* renamed from: z0 */
    public xc.p a() {
        xc.p pVar = (xc.p) super.a();
        if (pVar == null) {
            e0(4);
        }
        return pVar;
    }
}
