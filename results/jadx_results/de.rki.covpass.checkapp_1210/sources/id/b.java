package id;

import java.util.List;
import oe.e0;
import tb.r;
import ub.u;
import xc.a;
import xc.a1;
import xc.b;
import xc.m;
import xc.x0;
import xc.y;
/* loaded from: classes.dex */
public class b extends ad.f implements a {

    /* renamed from: u4 */
    private Boolean f12487u4;

    /* renamed from: v4 */
    private Boolean f12488v4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected b(xc.e eVar, b bVar, yc.g gVar, boolean z10, b.a aVar, a1 a1Var) {
        super(eVar, bVar, gVar, z10, aVar, a1Var);
        if (eVar == null) {
            e0(0);
        }
        if (gVar == null) {
            e0(1);
        }
        if (aVar == null) {
            e0(2);
        }
        if (a1Var == null) {
            e0(3);
        }
        this.f12487u4 = null;
        this.f12488v4 = null;
    }

    public static b C1(xc.e eVar, yc.g gVar, boolean z10, a1 a1Var) {
        if (eVar == null) {
            e0(4);
        }
        if (gVar == null) {
            e0(5);
        }
        if (a1Var == null) {
            e0(6);
        }
        return new b(eVar, null, gVar, z10, b.a.DECLARATION, a1Var);
    }

    private static /* synthetic */ void e0(int i10) {
        String str = (i10 == 11 || i10 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 11 || i10 == 18) ? 2 : 3];
        switch (i10) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 11 || i10 == 18) {
            throw new IllegalStateException(format);
        }
    }

    protected b B1(xc.e eVar, b bVar, b.a aVar, a1 a1Var, yc.g gVar) {
        if (eVar == null) {
            e0(12);
        }
        if (aVar == null) {
            e0(13);
        }
        if (a1Var == null) {
            e0(14);
        }
        if (gVar == null) {
            e0(15);
        }
        return new b(eVar, bVar, gVar, this.f306t4, aVar, a1Var);
    }

    /* renamed from: D1 */
    public b x1(m mVar, y yVar, b.a aVar, wd.f fVar, yc.g gVar, a1 a1Var) {
        if (mVar == null) {
            e0(7);
        }
        if (aVar == null) {
            e0(8);
        }
        if (gVar == null) {
            e0(9);
        }
        if (a1Var == null) {
            e0(10);
        }
        if (aVar == b.a.DECLARATION || aVar == b.a.SYNTHESIZED) {
            b B1 = B1((xc.e) mVar, (b) yVar, aVar, a1Var, gVar);
            B1.h1(Z0());
            B1.i1(b0());
            return B1;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + mVar + "\nkind: " + aVar);
    }

    /* renamed from: E1 */
    public b I(e0 e0Var, List<e0> list, e0 e0Var2, r<a.AbstractC0451a<?>, ?> rVar) {
        List<x0> h10;
        if (list == null) {
            e0(16);
        }
        if (e0Var2 == null) {
            e0(17);
        }
        b x12 = x1(b(), null, h(), null, j(), m());
        x0 h11 = e0Var == null ? null : ae.c.h(x12, e0Var, yc.g.Companion.b());
        x0 J = J();
        h10 = u.h();
        x12.a1(h11, J, h10, p(), h.a(list, o(), x12), e0Var2, s(), g());
        if (rVar != null) {
            x12.d1(rVar.e(), rVar.f());
        }
        return x12;
    }

    @Override // ad.p
    public boolean Z0() {
        return this.f12487u4.booleanValue();
    }

    @Override // ad.p, xc.a
    public boolean b0() {
        return this.f12488v4.booleanValue();
    }

    @Override // ad.p
    public void h1(boolean z10) {
        this.f12487u4 = Boolean.valueOf(z10);
    }

    @Override // ad.p
    public void i1(boolean z10) {
        this.f12488v4 = Boolean.valueOf(z10);
    }
}
