package ad;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xc.a;
import xc.a1;
import xc.b;
import xc.f1;
import xc.j1;
import xc.x0;
import xc.y;
import xc.z0;
/* loaded from: classes.dex */
public class g0 extends p implements z0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(xc.m mVar, z0 z0Var, yc.g gVar, wd.f fVar, b.a aVar, a1 a1Var) {
        super(mVar, z0Var, gVar, fVar, aVar, a1Var);
        if (mVar == null) {
            e0(0);
        }
        if (gVar == null) {
            e0(1);
        }
        if (fVar == null) {
            e0(2);
        }
        if (aVar == null) {
            e0(3);
        }
        if (a1Var == null) {
            e0(4);
        }
    }

    private static /* synthetic */ void e0(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 13 || i10 == 18 || i10 == 23) {
            objArr[1] = "initialize";
        } else if (i10 == 24) {
            objArr[1] = "getOriginal";
        } else if (i10 == 29) {
            objArr[1] = "copy";
        } else if (i10 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) {
            throw new IllegalStateException(format);
        }
    }

    public static g0 u1(xc.m mVar, yc.g gVar, wd.f fVar, b.a aVar, a1 a1Var) {
        if (mVar == null) {
            e0(5);
        }
        if (gVar == null) {
            e0(6);
        }
        if (fVar == null) {
            e0(7);
        }
        if (aVar == null) {
            e0(8);
        }
        if (a1Var == null) {
            e0(9);
        }
        return new g0(mVar, null, gVar, fVar, aVar, a1Var);
    }

    @Override // ad.p
    protected p U0(xc.m mVar, xc.y yVar, b.a aVar, wd.f fVar, yc.g gVar, a1 a1Var) {
        if (mVar == null) {
            e0(25);
        }
        if (aVar == null) {
            e0(26);
        }
        if (gVar == null) {
            e0(27);
        }
        if (a1Var == null) {
            e0(28);
        }
        z0 z0Var = (z0) yVar;
        if (fVar == null) {
            fVar = getName();
        }
        return new g0(mVar, z0Var, gVar, fVar, aVar, a1Var);
    }

    /* renamed from: t1 */
    public z0 n0(xc.m mVar, xc.e0 e0Var, xc.u uVar, b.a aVar, boolean z10) {
        z0 z0Var = (z0) super.n0(mVar, e0Var, uVar, aVar, z10);
        if (z0Var == null) {
            e0(29);
        }
        return z0Var;
    }

    /* renamed from: v1 */
    public z0 z0() {
        z0 z0Var = (z0) super.z0();
        if (z0Var == null) {
            e0(24);
        }
        return z0Var;
    }

    /* renamed from: w1 */
    public g0 a1(x0 x0Var, x0 x0Var2, List<x0> list, List<? extends f1> list2, List<j1> list3, oe.e0 e0Var, xc.e0 e0Var2, xc.u uVar) {
        if (list == null) {
            e0(14);
        }
        if (list2 == null) {
            e0(15);
        }
        if (list3 == null) {
            e0(16);
        }
        if (uVar == null) {
            e0(17);
        }
        g0 x12 = x1(x0Var, x0Var2, list, list2, list3, e0Var, e0Var2, uVar, null);
        if (x12 == null) {
            e0(18);
        }
        return x12;
    }

    public g0 x1(x0 x0Var, x0 x0Var2, List<x0> list, List<? extends f1> list2, List<j1> list3, oe.e0 e0Var, xc.e0 e0Var2, xc.u uVar, Map<? extends a.AbstractC0451a<?>, ?> map) {
        if (list == null) {
            e0(19);
        }
        if (list2 == null) {
            e0(20);
        }
        if (list3 == null) {
            e0(21);
        }
        if (uVar == null) {
            e0(22);
        }
        super.a1(x0Var, x0Var2, list, list2, list3, e0Var, e0Var2, uVar);
        if (map != null && !map.isEmpty()) {
            this.f362s4 = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // ad.p, xc.y, xc.z0
    public y.a<? extends z0> y() {
        y.a y10 = super.y();
        if (y10 == null) {
            e0(30);
        }
        return y10;
    }
}
