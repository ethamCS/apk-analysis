package ae;

import ad.d0;
import ad.f0;
import ad.g0;
import ad.l0;
import java.util.Collections;
import oe.e0;
import oe.r1;
import xc.a1;
import xc.b;
import xc.t;
import xc.u;
import xc.u0;
import xc.x0;
import xc.y;
import xc.z0;
import yc.g;
/* loaded from: classes3.dex */
public class c {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a extends ad.f {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xc.e eVar, a1 a1Var, boolean z10) {
            super(eVar, null, yc.g.Companion.b(), true, b.a.DECLARATION, a1Var);
            if (eVar == null) {
                e0(0);
            }
            if (a1Var == null) {
                e0(1);
            }
            z1(Collections.emptyList(), d.k(eVar, z10));
        }

        private static /* synthetic */ void e0(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 12 || i10 == 23 || i10 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 12 || i10 == 23 || i10 == 25) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 30:
            case 32:
            case 34:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
                objArr[0] = "enumClass";
                break;
            case 26:
            case 27:
            case 28:
                objArr[0] = "descriptor";
                break;
            case 29:
            case 31:
            case 33:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 27:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 28:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 29:
            case 30:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 31:
            case 32:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 33:
            case 34:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 12 || i10 == 23 || i10 == 25) {
            throw new IllegalStateException(format);
        }
    }

    public static x0 b(xc.a aVar, e0 e0Var, yc.g gVar) {
        if (aVar == null) {
            a(31);
        }
        if (gVar == null) {
            a(32);
        }
        if (e0Var == null) {
            return null;
        }
        return new f0(aVar, new ie.c(aVar, e0Var, null), gVar);
    }

    public static x0 c(xc.e eVar, e0 e0Var, yc.g gVar) {
        if (eVar == null) {
            a(33);
        }
        if (gVar == null) {
            a(34);
        }
        if (e0Var == null) {
            return null;
        }
        return new f0(eVar, new ie.b(eVar, e0Var, null), gVar);
    }

    public static d0 d(u0 u0Var, yc.g gVar) {
        if (u0Var == null) {
            a(13);
        }
        if (gVar == null) {
            a(14);
        }
        return i(u0Var, gVar, true, false, false);
    }

    public static ad.e0 e(u0 u0Var, yc.g gVar, yc.g gVar2) {
        if (u0Var == null) {
            a(0);
        }
        if (gVar == null) {
            a(1);
        }
        if (gVar2 == null) {
            a(2);
        }
        return m(u0Var, gVar, gVar2, true, false, false, u0Var.m());
    }

    public static z0 f(xc.e eVar) {
        if (eVar == null) {
            a(24);
        }
        g.a aVar = yc.g.Companion;
        g0 u12 = g0.u1(eVar, aVar.b(), uc.k.f23445e, b.a.SYNTHESIZED, eVar.m());
        g0 a12 = u12.a1(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new l0(u12, null, 0, aVar.b(), wd.f.j("value"), ee.a.f(eVar).W(), false, false, false, null, eVar.m())), eVar.u(), xc.e0.FINAL, t.f25581e);
        if (a12 == null) {
            a(25);
        }
        return a12;
    }

    public static z0 g(xc.e eVar) {
        if (eVar == null) {
            a(22);
        }
        g0 a12 = g0.u1(eVar, yc.g.Companion.b(), uc.k.f23444d, b.a.SYNTHESIZED, eVar.m()).a1(null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), ee.a.f(eVar).l(r1.INVARIANT, eVar.u()), xc.e0.FINAL, t.f25581e);
        if (a12 == null) {
            a(23);
        }
        return a12;
    }

    public static x0 h(xc.a aVar, e0 e0Var, yc.g gVar) {
        if (aVar == null) {
            a(29);
        }
        if (gVar == null) {
            a(30);
        }
        if (e0Var == null) {
            return null;
        }
        return new f0(aVar, new ie.d(aVar, e0Var, null), gVar);
    }

    public static d0 i(u0 u0Var, yc.g gVar, boolean z10, boolean z11, boolean z12) {
        if (u0Var == null) {
            a(15);
        }
        if (gVar == null) {
            a(16);
        }
        return j(u0Var, gVar, z10, z11, z12, u0Var.m());
    }

    public static d0 j(u0 u0Var, yc.g gVar, boolean z10, boolean z11, boolean z12, a1 a1Var) {
        if (u0Var == null) {
            a(17);
        }
        if (gVar == null) {
            a(18);
        }
        if (a1Var == null) {
            a(19);
        }
        return new d0(u0Var, gVar, u0Var.s(), u0Var.g(), z10, z11, z12, b.a.DECLARATION, null, a1Var);
    }

    public static ad.f k(xc.e eVar, a1 a1Var) {
        if (eVar == null) {
            a(20);
        }
        if (a1Var == null) {
            a(21);
        }
        return new a(eVar, a1Var, false);
    }

    public static ad.e0 l(u0 u0Var, yc.g gVar, yc.g gVar2, boolean z10, boolean z11, boolean z12, u uVar, a1 a1Var) {
        if (u0Var == null) {
            a(7);
        }
        if (gVar == null) {
            a(8);
        }
        if (gVar2 == null) {
            a(9);
        }
        if (uVar == null) {
            a(10);
        }
        if (a1Var == null) {
            a(11);
        }
        ad.e0 e0Var = new ad.e0(u0Var, gVar, u0Var.s(), uVar, z10, z11, z12, b.a.DECLARATION, null, a1Var);
        e0Var.a1(ad.e0.Y0(e0Var, u0Var.getType(), gVar2));
        return e0Var;
    }

    public static ad.e0 m(u0 u0Var, yc.g gVar, yc.g gVar2, boolean z10, boolean z11, boolean z12, a1 a1Var) {
        if (u0Var == null) {
            a(3);
        }
        if (gVar == null) {
            a(4);
        }
        if (gVar2 == null) {
            a(5);
        }
        if (a1Var == null) {
            a(6);
        }
        return l(u0Var, gVar, gVar2, z10, z11, z12, u0Var.g(), a1Var);
    }

    private static boolean n(y yVar) {
        if (yVar == null) {
            a(28);
        }
        return yVar.h() == b.a.SYNTHESIZED && d.A(yVar.b());
    }

    public static boolean o(y yVar) {
        if (yVar == null) {
            a(27);
        }
        return yVar.getName().equals(uc.k.f23445e) && n(yVar);
    }

    public static boolean p(y yVar) {
        if (yVar == null) {
            a(26);
        }
        return yVar.getName().equals(uc.k.f23444d) && n(yVar);
    }
}
