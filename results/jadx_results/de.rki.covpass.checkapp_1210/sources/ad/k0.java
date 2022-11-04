package ad;

import java.util.ArrayList;
import java.util.List;
import oe.r1;
import xc.a1;
import xc.d1;
import xc.f1;
/* loaded from: classes.dex */
public class k0 extends e {
    private final gc.l<oe.e0, Void> Z3;

    /* renamed from: a4 */
    private final List<oe.e0> f326a4;

    /* renamed from: b4 */
    private boolean f327b4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private k0(xc.m mVar, yc.g gVar, boolean z10, r1 r1Var, wd.f fVar, int i10, a1 a1Var, gc.l<oe.e0, Void> lVar, d1 d1Var, ne.n nVar) {
        super(nVar, mVar, gVar, fVar, r1Var, z10, i10, a1Var, d1Var);
        if (mVar == null) {
            e0(19);
        }
        if (gVar == null) {
            e0(20);
        }
        if (r1Var == null) {
            e0(21);
        }
        if (fVar == null) {
            e0(22);
        }
        if (a1Var == null) {
            e0(23);
        }
        if (d1Var == null) {
            e0(24);
        }
        if (nVar == null) {
            e0(25);
        }
        this.f326a4 = new ArrayList(1);
        this.f327b4 = false;
        this.Z3 = lVar;
    }

    private void W0() {
        if (this.f327b4) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + d1());
    }

    private void X0() {
        if (!this.f327b4) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + d1());
    }

    public static k0 Y0(xc.m mVar, yc.g gVar, boolean z10, r1 r1Var, wd.f fVar, int i10, a1 a1Var, gc.l<oe.e0, Void> lVar, d1 d1Var, ne.n nVar) {
        if (mVar == null) {
            e0(12);
        }
        if (gVar == null) {
            e0(13);
        }
        if (r1Var == null) {
            e0(14);
        }
        if (fVar == null) {
            e0(15);
        }
        if (a1Var == null) {
            e0(16);
        }
        if (d1Var == null) {
            e0(17);
        }
        if (nVar == null) {
            e0(18);
        }
        return new k0(mVar, gVar, z10, r1Var, fVar, i10, a1Var, lVar, d1Var, nVar);
    }

    public static k0 Z0(xc.m mVar, yc.g gVar, boolean z10, r1 r1Var, wd.f fVar, int i10, a1 a1Var, ne.n nVar) {
        if (mVar == null) {
            e0(6);
        }
        if (gVar == null) {
            e0(7);
        }
        if (r1Var == null) {
            e0(8);
        }
        if (fVar == null) {
            e0(9);
        }
        if (a1Var == null) {
            e0(10);
        }
        if (nVar == null) {
            e0(11);
        }
        return Y0(mVar, gVar, z10, r1Var, fVar, i10, a1Var, null, d1.a.f25530a, nVar);
    }

    public static f1 a1(xc.m mVar, yc.g gVar, boolean z10, r1 r1Var, wd.f fVar, int i10, ne.n nVar) {
        if (mVar == null) {
            e0(0);
        }
        if (gVar == null) {
            e0(1);
        }
        if (r1Var == null) {
            e0(2);
        }
        if (fVar == null) {
            e0(3);
        }
        if (nVar == null) {
            e0(4);
        }
        k0 Z0 = Z0(mVar, gVar, z10, r1Var, fVar, i10, a1.f25519a, nVar);
        Z0.V0(ee.a.f(mVar).y());
        Z0.e1();
        return Z0;
    }

    private void b1(oe.e0 e0Var) {
        if (oe.g0.a(e0Var)) {
            return;
        }
        this.f326a4.add(e0Var);
    }

    private String d1() {
        return getName() + " declared in " + ae.d.m(b());
    }

    private static /* synthetic */ void e0(int i10) {
        String str = (i10 == 5 || i10 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 28) ? 2 : 3];
        switch (i10) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i10 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i10) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 5 || i10 == 28) {
            throw new IllegalStateException(format);
        }
    }

    @Override // ad.e
    protected void T0(oe.e0 e0Var) {
        if (e0Var == null) {
            e0(27);
        }
        gc.l<oe.e0, Void> lVar = this.Z3;
        if (lVar == null) {
            return;
        }
        lVar.invoke(e0Var);
    }

    @Override // ad.e
    protected List<oe.e0> U0() {
        W0();
        List<oe.e0> list = this.f326a4;
        if (list == null) {
            e0(28);
        }
        return list;
    }

    public void V0(oe.e0 e0Var) {
        if (e0Var == null) {
            e0(26);
        }
        X0();
        b1(e0Var);
    }

    public boolean c1() {
        return this.f327b4;
    }

    public void e1() {
        X0();
        this.f327b4 = true;
    }
}
