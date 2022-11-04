package ae;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import oe.e0;
import oe.e1;
import oe.g0;
import oe.n1;
import xc.b;
import xc.b1;
import xc.h0;
import xc.k1;
import xc.l0;
import xc.q;
import xc.q0;
import xc.t;
import xc.u;
import xc.w0;
import xc.x0;
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a */
    public static final wd.c f430a = new wd.c("kotlin.jvm.JvmName");

    public static boolean A(xc.m mVar) {
        return D(mVar, xc.f.ENUM_CLASS);
    }

    public static boolean B(xc.m mVar) {
        if (mVar == null) {
            a(36);
        }
        return D(mVar, xc.f.ENUM_ENTRY);
    }

    public static boolean C(xc.m mVar) {
        return D(mVar, xc.f.INTERFACE);
    }

    private static boolean D(xc.m mVar, xc.f fVar) {
        if (fVar == null) {
            a(37);
        }
        return (mVar instanceof xc.e) && ((xc.e) mVar).h() == fVar;
    }

    public static boolean E(xc.m mVar) {
        if (mVar == null) {
            a(1);
        }
        while (mVar != null) {
            if (u(mVar) || y(mVar)) {
                return true;
            }
            mVar = mVar.b();
        }
        return false;
    }

    private static boolean F(e0 e0Var, xc.m mVar) {
        if (e0Var == null) {
            a(30);
        }
        if (mVar == null) {
            a(31);
        }
        xc.h z10 = e0Var.W0().z();
        if (z10 != null) {
            xc.m a10 = z10.a();
            return (a10 instanceof xc.h) && (mVar instanceof xc.h) && ((xc.h) mVar).r().equals(((xc.h) a10).r());
        }
        return false;
    }

    public static boolean G(xc.m mVar) {
        return (D(mVar, xc.f.CLASS) || D(mVar, xc.f.INTERFACE)) && ((xc.e) mVar).s() == xc.e0.SEALED;
    }

    public static boolean H(xc.e eVar, xc.e eVar2) {
        if (eVar == null) {
            a(28);
        }
        if (eVar2 == null) {
            a(29);
        }
        return I(eVar.u(), eVar2.a());
    }

    public static boolean I(e0 e0Var, xc.m mVar) {
        if (e0Var == null) {
            a(32);
        }
        if (mVar == null) {
            a(33);
        }
        if (F(e0Var, mVar)) {
            return true;
        }
        for (e0 e0Var2 : e0Var.W0().l()) {
            if (I(e0Var2, mVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(xc.m mVar) {
        return mVar != null && (mVar.b() instanceof l0);
    }

    public static boolean K(k1 k1Var, e0 e0Var) {
        if (k1Var == null) {
            a(63);
        }
        if (e0Var == null) {
            a(64);
        }
        if (k1Var.Q() || g0.a(e0Var)) {
            return false;
        }
        if (n1.b(e0Var)) {
            return true;
        }
        uc.h f10 = ee.a.f(k1Var);
        if (!uc.h.r0(e0Var)) {
            pe.e eVar = pe.e.f19146a;
            if (!eVar.b(f10.W(), e0Var) && !eVar.b(f10.K().u(), e0Var) && !eVar.b(f10.i(), e0Var)) {
                uc.o oVar = uc.o.f23528a;
                if (!uc.o.d(e0Var)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static <D extends xc.b> D L(D d10) {
        if (d10 == null) {
            a(59);
        }
        while (d10.h() == b.a.FAKE_OVERRIDE) {
            Collection<? extends xc.b> f10 = d10.f();
            if (f10.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d10);
            }
            d10 = (D) f10.iterator().next();
        }
        return d10;
    }

    public static <D extends q> D M(D d10) {
        if (d10 == null) {
            a(61);
        }
        if (d10 instanceof xc.b) {
            return L((xc.b) d10);
        }
        if (d10 == null) {
            a(62);
        }
        return d10;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 79:
            case 92:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 64:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 65:
            case 66:
            case 67:
            case 74:
            case 75:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 63:
                objArr[0] = "variable";
                break;
            case 68:
                objArr[0] = "f";
                break;
            case 70:
                objArr[0] = "current";
                break;
            case 71:
                objArr[0] = "result";
                break;
            case 72:
                objArr[0] = "memberDescriptor";
                break;
            case 76:
            case 77:
            case 78:
                objArr[0] = "annotated";
                break;
            case 82:
            case 84:
            case 87:
            case 89:
                objArr[0] = "scope";
                break;
            case 85:
            case 88:
            case 90:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 69:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 73:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 80:
            case 81:
                objArr[1] = "getContainingSourceFile";
                break;
            case 83:
                objArr[1] = "getAllDescriptors";
                break;
            case 86:
                objArr[1] = "getFunctionByName";
                break;
            case 91:
                objArr[1] = "getPropertyByName";
                break;
            case 93:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 63:
            case 64:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 65:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 66:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 67:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 68:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 70:
            case 71:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 72:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 74:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 75:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 76:
                objArr[2] = "getJvmName";
                break;
            case 77:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 78:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 79:
                objArr[2] = "getContainingSourceFile";
                break;
            case 82:
                objArr[2] = "getAllDescriptors";
                break;
            case 84:
            case 85:
                objArr[2] = "getFunctionByName";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 89:
            case 90:
                objArr[2] = "getPropertyByName";
                break;
            case 92:
                objArr[2] = "getDirectMember";
                break;
            case 94:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static boolean b(xc.m mVar, xc.m mVar2) {
        if (mVar == null) {
            a(16);
        }
        if (mVar2 == null) {
            a(17);
        }
        return g(mVar).equals(g(mVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <D extends xc.a> void c(D d10, Set<D> set) {
        if (d10 == null) {
            a(70);
        }
        if (set == 0) {
            a(71);
        }
        if (set.contains(d10)) {
            return;
        }
        for (xc.a aVar : d10.a().f()) {
            xc.a a10 = aVar.a();
            c(a10, set);
            set.add(a10);
        }
    }

    public static <D extends xc.a> Set<D> d(D d10) {
        if (d10 == null) {
            a(68);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(d10.a(), linkedHashSet);
        return linkedHashSet;
    }

    public static xc.e e(e0 e0Var) {
        if (e0Var == null) {
            a(45);
        }
        return f(e0Var.W0());
    }

    public static xc.e f(e1 e1Var) {
        if (e1Var == null) {
            a(46);
        }
        xc.e eVar = (xc.e) e1Var.z();
        if (eVar == null) {
            a(47);
        }
        return eVar;
    }

    public static h0 g(xc.m mVar) {
        if (mVar == null) {
            a(21);
        }
        h0 i10 = i(mVar);
        if (i10 == null) {
            a(22);
        }
        return i10;
    }

    public static h0 h(e0 e0Var) {
        if (e0Var == null) {
            a(20);
        }
        xc.h z10 = e0Var.W0().z();
        if (z10 == null) {
            return null;
        }
        return i(z10);
    }

    public static h0 i(xc.m mVar) {
        if (mVar == null) {
            a(23);
        }
        while (mVar != null) {
            if (mVar instanceof h0) {
                return (h0) mVar;
            }
            if (mVar instanceof q0) {
                return ((q0) mVar).p0();
            }
            mVar = mVar.b();
        }
        return null;
    }

    public static b1 j(xc.m mVar) {
        if (mVar == null) {
            a(79);
        }
        if (mVar instanceof w0) {
            mVar = ((w0) mVar).C0();
        }
        if (mVar instanceof xc.p) {
            b1 a10 = ((xc.p) mVar).m().a();
            if (a10 == null) {
                a(80);
            }
            return a10;
        }
        b1 b1Var = b1.f25526a;
        if (b1Var == null) {
            a(81);
        }
        return b1Var;
    }

    public static u k(xc.e eVar, boolean z10) {
        if (eVar == null) {
            a(48);
        }
        xc.f h10 = eVar.h();
        if (h10 == xc.f.ENUM_CLASS || h10.g()) {
            u uVar = t.f25577a;
            if (uVar == null) {
                a(49);
            }
            return uVar;
        } else if (G(eVar)) {
            if (z10) {
                u uVar2 = t.f25579c;
                if (uVar2 == null) {
                    a(50);
                }
                return uVar2;
            }
            u uVar3 = t.f25577a;
            if (uVar3 == null) {
                a(51);
            }
            return uVar3;
        } else if (u(eVar)) {
            u uVar4 = t.f25588l;
            if (uVar4 == null) {
                a(52);
            }
            return uVar4;
        } else {
            u uVar5 = t.f25581e;
            if (uVar5 == null) {
                a(53);
            }
            return uVar5;
        }
    }

    public static x0 l(xc.m mVar) {
        if (mVar == null) {
            a(0);
        }
        if (mVar instanceof xc.e) {
            return ((xc.e) mVar).S0();
        }
        return null;
    }

    public static wd.d m(xc.m mVar) {
        if (mVar == null) {
            a(2);
        }
        wd.c o10 = o(mVar);
        return o10 != null ? o10.j() : p(mVar);
    }

    public static wd.c n(xc.m mVar) {
        if (mVar == null) {
            a(3);
        }
        wd.c o10 = o(mVar);
        if (o10 == null) {
            o10 = p(mVar).l();
        }
        if (o10 == null) {
            a(4);
        }
        return o10;
    }

    private static wd.c o(xc.m mVar) {
        if (mVar == null) {
            a(5);
        }
        if ((mVar instanceof h0) || qe.k.m(mVar)) {
            return wd.c.f24796c;
        }
        if (mVar instanceof q0) {
            return ((q0) mVar).d();
        }
        if (!(mVar instanceof l0)) {
            return null;
        }
        return ((l0) mVar).d();
    }

    private static wd.d p(xc.m mVar) {
        if (mVar == null) {
            a(6);
        }
        wd.d c10 = m(mVar.b()).c(mVar.getName());
        if (c10 == null) {
            a(7);
        }
        return c10;
    }

    public static <D extends xc.m> D q(xc.m mVar, Class<D> cls) {
        if (cls == null) {
            a(18);
        }
        return (D) r(mVar, cls, true);
    }

    public static <D extends xc.m> D r(xc.m mVar, Class<D> cls, boolean z10) {
        if (cls == null) {
            a(19);
        }
        if (mVar == null) {
            return null;
        }
        if (z10) {
            mVar = (D) mVar.b();
        }
        while (mVar != null) {
            if (cls.isInstance(mVar)) {
                return (D) mVar;
            }
            mVar = (D) mVar.b();
        }
        return null;
    }

    public static xc.e s(xc.e eVar) {
        if (eVar == null) {
            a(44);
        }
        for (e0 e0Var : eVar.r().l()) {
            xc.e e10 = e(e0Var);
            if (e10.h() != xc.f.INTERFACE) {
                return e10;
            }
        }
        return null;
    }

    public static boolean t(xc.m mVar) {
        return D(mVar, xc.f.ANNOTATION_CLASS);
    }

    public static boolean u(xc.m mVar) {
        if (mVar == null) {
            a(34);
        }
        return v(mVar) && mVar.getName().equals(wd.h.f24812b);
    }

    public static boolean v(xc.m mVar) {
        return D(mVar, xc.f.CLASS);
    }

    public static boolean w(xc.m mVar) {
        return v(mVar) || A(mVar);
    }

    public static boolean x(xc.m mVar) {
        return D(mVar, xc.f.OBJECT) && ((xc.e) mVar).N();
    }

    public static boolean y(xc.m mVar) {
        return (mVar instanceof q) && ((q) mVar).g() == t.f25582f;
    }

    public static boolean z(xc.e eVar, xc.e eVar2) {
        if (eVar == null) {
            a(26);
        }
        if (eVar2 == null) {
            a(27);
        }
        for (e0 e0Var : eVar.r().l()) {
            if (F(e0Var, eVar2.a())) {
                return true;
            }
        }
        return false;
    }
}
