package ad;

import oe.r1;
import org.conscrypt.BuildConfig;
import xc.a1;
import xc.d1;
/* loaded from: classes.dex */
public abstract class b extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ne.n nVar, xc.m mVar, yc.g gVar, wd.f fVar, r1 r1Var, boolean z10, int i10, a1 a1Var, d1 d1Var) {
        super(nVar, mVar, gVar, fVar, r1Var, z10, i10, a1Var, d1Var);
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
    }

    private static /* synthetic */ void e0(int i10) {
        Object[] objArr = new Object[3];
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
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // ad.j
    public String toString() {
        Object[] objArr = new Object[3];
        boolean Z = Z();
        String str = BuildConfig.FLAVOR;
        objArr[0] = Z ? "reified " : str;
        if (w() != r1.INVARIANT) {
            str = w() + " ";
        }
        objArr[1] = str;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}
