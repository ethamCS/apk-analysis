package uc;

import ad.x;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import oe.b1;
import oe.e0;
import oe.e1;
import oe.f0;
import oe.i1;
import oe.m0;
import oe.n1;
import oe.r1;
import uc.k;
import xc.h0;
import xc.l0;
import xc.q0;
import xc.s;
import xc.u0;
import xc.v0;
import xc.w0;
import zc.a;
import zc.c;
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: g */
    public static final wd.f f23403g = wd.f.o("<built-ins module>");

    /* renamed from: a */
    private x f23404a;

    /* renamed from: b */
    private ne.i<x> f23405b;

    /* renamed from: c */
    private final ne.i<e> f23406c;

    /* renamed from: d */
    private final ne.i<Collection<q0>> f23407d;

    /* renamed from: e */
    private final ne.g<wd.f, xc.e> f23408e;

    /* renamed from: f */
    private final ne.n f23409f;

    /* loaded from: classes.dex */
    public class a implements gc.a<Collection<q0>> {
        a() {
            h.this = r1;
        }

        /* renamed from: a */
        public Collection<q0> invoke() {
            return Arrays.asList(h.this.r().F(k.f23458r), h.this.r().F(k.f23460t), h.this.r().F(k.f23461u), h.this.r().F(k.f23459s));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements gc.a<e> {
        b() {
            h.this = r1;
        }

        /* renamed from: a */
        public e invoke() {
            i[] values;
            EnumMap enumMap = new EnumMap(i.class);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (i iVar : i.values()) {
                m0 q10 = h.this.q(iVar.p().b());
                m0 q11 = h.this.q(iVar.h().b());
                enumMap.put((EnumMap) iVar, (i) q11);
                hashMap.put(q10, q11);
                hashMap2.put(q11, q10);
            }
            return new e(enumMap, hashMap, hashMap2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements gc.l<wd.f, xc.e> {
        c() {
            h.this = r1;
        }

        /* renamed from: a */
        public xc.e invoke(wd.f fVar) {
            xc.h f10 = h.this.s().f(fVar, fd.d.FROM_BUILTINS);
            if (f10 == null) {
                throw new AssertionError("Built-in class " + k.f23458r.c(fVar) + " is not found");
            } else if (f10 instanceof xc.e) {
                return (xc.e) f10;
            } else {
                throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + f10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements gc.a<Void> {

        /* renamed from: c */
        final /* synthetic */ x f23413c;

        d(x xVar) {
            h.this = r1;
            this.f23413c = xVar;
        }

        /* renamed from: a */
        public Void invoke() {
            if (h.this.f23404a == null) {
                h.this.f23404a = this.f23413c;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + h.this.f23404a + " (attempting to reset to " + this.f23413c + ")");
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public final Map<i, m0> f23415a;

        /* renamed from: b */
        public final Map<e0, m0> f23416b;

        /* renamed from: c */
        public final Map<m0, m0> f23417c;

        private e(Map<i, m0> map, Map<e0, m0> map2, Map<m0, m0> map3) {
            if (map == null) {
                a(0);
            }
            if (map2 == null) {
                a(1);
            }
            if (map3 == null) {
                a(2);
            }
            this.f23415a = map;
            this.f23416b = map2;
            this.f23417c = map3;
        }

        /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i10 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    public h(ne.n nVar) {
        if (nVar == null) {
            a(0);
        }
        this.f23409f = nVar;
        this.f23407d = nVar.d(new a());
        this.f23406c = nVar.d(new b());
        this.f23408e = nVar.b(new c());
    }

    private static e0 A(e0 e0Var, h0 h0Var) {
        wd.b g10;
        wd.b a10;
        xc.e a11;
        if (e0Var == null) {
            a(71);
        }
        if (h0Var == null) {
            a(72);
        }
        xc.h z10 = e0Var.W0().z();
        if (z10 == null) {
            return null;
        }
        o oVar = o.f23528a;
        if (oVar.b(z10.getName()) && (g10 = ee.a.g(z10)) != null && (a10 = oVar.a(g10)) != null && (a11 = xc.x.a(h0Var, a10)) != null) {
            return a11.u();
        }
        return null;
    }

    public static boolean A0(xc.m mVar) {
        if (mVar == null) {
            a(10);
        }
        while (mVar != null) {
            if (mVar instanceof l0) {
                return ((l0) mVar).d().i(k.f23457q);
            }
            mVar = mVar.b();
        }
        return false;
    }

    public static boolean B0(e0 e0Var) {
        if (e0Var == null) {
            a(142);
        }
        return l0(e0Var, k.a.f23475f);
    }

    public static boolean C0(e0 e0Var) {
        if (e0Var == null) {
            a(132);
        }
        return w0(e0Var) || z0(e0Var) || x0(e0Var) || y0(e0Var);
    }

    public static i N(e0 e0Var) {
        if (e0Var == null) {
            a(92);
        }
        xc.h z10 = e0Var.W0().z();
        if (z10 == null) {
            return null;
        }
        return P(z10);
    }

    public static i P(xc.m mVar) {
        if (mVar == null) {
            a(77);
        }
        if (k.a.H0.contains(mVar.getName())) {
            return k.a.J0.get(ae.d.m(mVar));
        }
        return null;
    }

    private xc.e Q(i iVar) {
        if (iVar == null) {
            a(16);
        }
        return p(iVar.p().b());
    }

    public static i S(xc.m mVar) {
        if (mVar == null) {
            a(76);
        }
        if (k.a.G0.contains(mVar.getName())) {
            return k.a.I0.get(ae.d.m(mVar));
        }
        return null;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i11 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 145:
            case 146:
            case 148:
            case 156:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case androidx.constraintlayout.widget.i.E2 /* 110 */:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case e.j.K0 /* 124 */:
            case e.j.L0 /* 125 */:
            case e.j.M0 /* 126 */:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 147:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 161:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case androidx.constraintlayout.widget.i.E2 /* 110 */:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case e.j.K0 /* 124 */:
                objArr[2] = "isUByte";
                break;
            case e.j.L0 /* 125 */:
                objArr[2] = "isUShort";
                break;
            case e.j.M0 /* 126 */:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 144:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 145:
                objArr[2] = "isMemberOfAny";
                break;
            case 146:
            case 147:
                objArr[2] = "isEnum";
                break;
            case 148:
            case 149:
                objArr[2] = "isComparable";
                break;
            case 150:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 151:
                objArr[2] = "isListOrNullableList";
                break;
            case 152:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 153:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 154:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 155:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 156:
                objArr[2] = "isThrowable";
                break;
            case 157:
                objArr[2] = "isKClass";
                break;
            case 158:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 159:
                objArr[2] = "isCloneable";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(format);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static boolean a0(xc.e eVar) {
        if (eVar == null) {
            a(108);
        }
        return e(eVar, k.a.f23467b);
    }

    public static boolean b0(e0 e0Var) {
        if (e0Var == null) {
            a(139);
        }
        return g0(e0Var, k.a.f23467b);
    }

    public static boolean c0(e0 e0Var) {
        if (e0Var == null) {
            a(88);
        }
        return g0(e0Var, k.a.f23481i);
    }

    public static boolean d0(e0 e0Var) {
        if (e0Var == null) {
            a(90);
        }
        return c0(e0Var) || p0(e0Var);
    }

    private static boolean e(xc.h hVar, wd.d dVar) {
        if (hVar == null) {
            a(103);
        }
        if (dVar == null) {
            a(104);
        }
        return hVar.getName().equals(dVar.i()) && dVar.equals(ae.d.m(hVar));
    }

    public static boolean e0(xc.e eVar) {
        if (eVar == null) {
            a(89);
        }
        return e(eVar, k.a.f23481i) || P(eVar) != null;
    }

    public static boolean f0(xc.m mVar) {
        if (mVar == null) {
            a(9);
        }
        return ae.d.r(mVar, uc.b.class, false) != null;
    }

    private static boolean g0(e0 e0Var, wd.d dVar) {
        if (e0Var == null) {
            a(97);
        }
        if (dVar == null) {
            a(98);
        }
        return v0(e0Var.W0(), dVar);
    }

    private static boolean h0(e0 e0Var, wd.d dVar) {
        if (e0Var == null) {
            a(134);
        }
        if (dVar == null) {
            a(135);
        }
        return g0(e0Var, dVar) && !e0Var.X0();
    }

    public static boolean i0(e0 e0Var) {
        if (e0Var == null) {
            a(141);
        }
        return o0(e0Var);
    }

    public static boolean j0(xc.m mVar) {
        if (mVar == null) {
            a(160);
        }
        if (mVar.a().j().B(k.a.f23513y)) {
            return true;
        }
        if (!(mVar instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) mVar;
        boolean Q = u0Var.Q();
        v0 i10 = u0Var.i();
        w0 n10 = u0Var.n();
        if (i10 != null && j0(i10)) {
            if (!Q) {
                return true;
            }
            if (n10 != null && j0(n10)) {
                return true;
            }
        }
        return false;
    }

    public static boolean k0(xc.e eVar) {
        if (eVar == null) {
            a(157);
        }
        return e(eVar, k.a.f23482i0);
    }

    private static boolean l0(e0 e0Var, wd.d dVar) {
        if (e0Var == null) {
            a(105);
        }
        if (dVar == null) {
            a(106);
        }
        return !e0Var.X0() && g0(e0Var, dVar);
    }

    public static boolean m0(e0 e0Var) {
        if (e0Var == null) {
            a(136);
        }
        return n0(e0Var) && !n1.l(e0Var);
    }

    public static boolean n0(e0 e0Var) {
        if (e0Var == null) {
            a(138);
        }
        return g0(e0Var, k.a.f23469c);
    }

    public static boolean o0(e0 e0Var) {
        if (e0Var == null) {
            a(140);
        }
        return b0(e0Var) && e0Var.X0();
    }

    private xc.e p(String str) {
        if (str == null) {
            a(14);
        }
        xc.e invoke = this.f23408e.invoke(wd.f.j(str));
        if (invoke == null) {
            a(15);
        }
        return invoke;
    }

    public static boolean p0(e0 e0Var) {
        if (e0Var == null) {
            a(91);
        }
        xc.h z10 = e0Var.W0().z();
        return (z10 == null || P(z10) == null) ? false : true;
    }

    public m0 q(String str) {
        if (str == null) {
            a(46);
        }
        m0 u10 = p(str).u();
        if (u10 == null) {
            a(47);
        }
        return u10;
    }

    public static boolean q0(xc.e eVar) {
        if (eVar == null) {
            a(96);
        }
        return S(eVar) != null;
    }

    public static boolean r0(e0 e0Var) {
        if (e0Var == null) {
            a(94);
        }
        return !e0Var.X0() && s0(e0Var);
    }

    public static boolean s0(e0 e0Var) {
        if (e0Var == null) {
            a(95);
        }
        xc.h z10 = e0Var.W0().z();
        return (z10 instanceof xc.e) && q0((xc.e) z10);
    }

    public static boolean t0(xc.e eVar) {
        if (eVar == null) {
            a(107);
        }
        return e(eVar, k.a.f23467b) || e(eVar, k.a.f23469c);
    }

    public static boolean u0(e0 e0Var) {
        return e0Var != null && l0(e0Var, k.a.f23479h);
    }

    public static boolean v0(e1 e1Var, wd.d dVar) {
        if (e1Var == null) {
            a(101);
        }
        if (dVar == null) {
            a(102);
        }
        xc.h z10 = e1Var.z();
        return (z10 instanceof xc.e) && e(z10, dVar);
    }

    public static boolean w0(e0 e0Var) {
        if (e0Var == null) {
            a(128);
        }
        return h0(e0Var, k.a.C0.j());
    }

    public static boolean x0(e0 e0Var) {
        if (e0Var == null) {
            a(130);
        }
        return h0(e0Var, k.a.E0.j());
    }

    public static boolean y0(e0 e0Var) {
        if (e0Var == null) {
            a(131);
        }
        return h0(e0Var, k.a.F0.j());
    }

    public static boolean z0(e0 e0Var) {
        if (e0Var == null) {
            a(129);
        }
        return h0(e0Var, k.a.D0.j());
    }

    public m0 B() {
        m0 R = R(i.FLOAT);
        if (R == null) {
            a(60);
        }
        return R;
    }

    public xc.e C(int i10) {
        return p(k.b(i10));
    }

    public m0 D() {
        m0 R = R(i.INT);
        if (R == null) {
            a(58);
        }
        return R;
    }

    public void D0(x xVar) {
        if (xVar == null) {
            a(1);
        }
        this.f23409f.a(new d(xVar));
    }

    public xc.e E() {
        xc.e o10 = o(k.a.f23482i0.l());
        if (o10 == null) {
            a(21);
        }
        return o10;
    }

    public m0 F() {
        m0 R = R(i.LONG);
        if (R == null) {
            a(59);
        }
        return R;
    }

    public xc.e G() {
        return p("Nothing");
    }

    public m0 H() {
        m0 u10 = G().u();
        if (u10 == null) {
            a(48);
        }
        return u10;
    }

    public m0 I() {
        m0 d12 = i().d1(true);
        if (d12 == null) {
            a(51);
        }
        return d12;
    }

    public m0 J() {
        m0 d12 = H().d1(true);
        if (d12 == null) {
            a(49);
        }
        return d12;
    }

    public xc.e K() {
        return p("Number");
    }

    public m0 L() {
        m0 u10 = K().u();
        if (u10 == null) {
            a(55);
        }
        return u10;
    }

    protected zc.c M() {
        c.b bVar = c.b.f26604a;
        if (bVar == null) {
            a(4);
        }
        return bVar;
    }

    public m0 O(i iVar) {
        if (iVar == null) {
            a(73);
        }
        m0 m0Var = this.f23406c.invoke().f23415a.get(iVar);
        if (m0Var == null) {
            a(74);
        }
        return m0Var;
    }

    public m0 R(i iVar) {
        if (iVar == null) {
            a(53);
        }
        m0 u10 = Q(iVar).u();
        if (u10 == null) {
            a(54);
        }
        return u10;
    }

    public m0 T() {
        m0 R = R(i.SHORT);
        if (R == null) {
            a(57);
        }
        return R;
    }

    public ne.n U() {
        ne.n nVar = this.f23409f;
        if (nVar == null) {
            a(6);
        }
        return nVar;
    }

    public xc.e V() {
        return p("String");
    }

    public m0 W() {
        m0 u10 = V().u();
        if (u10 == null) {
            a(65);
        }
        return u10;
    }

    public xc.e X(int i10) {
        xc.e o10 = o(k.f23450j.c(wd.f.j(k.d(i10))));
        if (o10 == null) {
            a(18);
        }
        return o10;
    }

    public xc.e Y() {
        return p("Unit");
    }

    public m0 Z() {
        m0 u10 = Y().u();
        if (u10 == null) {
            a(64);
        }
        return u10;
    }

    public void f(boolean z10) {
        x xVar = new x(f23403g, this.f23409f, this, null);
        this.f23404a = xVar;
        xVar.b1(uc.a.Companion.a().a(this.f23409f, this.f23404a, v(), M(), g(), z10));
        x xVar2 = this.f23404a;
        xVar2.h1(xVar2);
    }

    protected zc.a g() {
        a.C0474a c0474a = a.C0474a.f26602a;
        if (c0474a == null) {
            a(3);
        }
        return c0474a;
    }

    public xc.e h() {
        return p("Any");
    }

    public m0 i() {
        m0 u10 = h().u();
        if (u10 == null) {
            a(50);
        }
        return u10;
    }

    public xc.e j() {
        return p("Array");
    }

    public e0 k(e0 e0Var) {
        e0 A;
        if (e0Var == null) {
            a(67);
        }
        if (c0(e0Var)) {
            if (e0Var.U0().size() != 1) {
                throw new IllegalStateException();
            }
            e0 type = e0Var.U0().get(0).getType();
            if (type == null) {
                a(68);
            }
            return type;
        }
        e0 n10 = n1.n(e0Var);
        m0 m0Var = this.f23406c.invoke().f23417c.get(n10);
        if (m0Var != null) {
            return m0Var;
        }
        h0 h10 = ae.d.h(n10);
        if (h10 != null && (A = A(n10, h10)) != null) {
            return A;
        }
        throw new IllegalStateException("not array: " + e0Var);
    }

    public m0 l(r1 r1Var, e0 e0Var) {
        if (r1Var == null) {
            a(82);
        }
        if (e0Var == null) {
            a(83);
        }
        m0 m10 = m(r1Var, e0Var, yc.g.Companion.b());
        if (m10 == null) {
            a(84);
        }
        return m10;
    }

    public m0 m(r1 r1Var, e0 e0Var, yc.g gVar) {
        if (r1Var == null) {
            a(78);
        }
        if (e0Var == null) {
            a(79);
        }
        if (gVar == null) {
            a(80);
        }
        m0 g10 = f0.g(b1.b(gVar), j(), Collections.singletonList(new i1(r1Var, e0Var)));
        if (g10 == null) {
            a(81);
        }
        return g10;
    }

    public m0 n() {
        m0 R = R(i.BOOLEAN);
        if (R == null) {
            a(63);
        }
        return R;
    }

    public xc.e o(wd.c cVar) {
        if (cVar == null) {
            a(12);
        }
        xc.e c10 = s.c(r(), cVar, fd.d.FROM_BUILTINS);
        if (c10 == null) {
            a(13);
        }
        return c10;
    }

    public x r() {
        if (this.f23404a == null) {
            this.f23404a = this.f23405b.invoke();
        }
        x xVar = this.f23404a;
        if (xVar == null) {
            a(7);
        }
        return xVar;
    }

    public he.h s() {
        he.h z10 = r().F(k.f23458r).z();
        if (z10 == null) {
            a(11);
        }
        return z10;
    }

    public m0 t() {
        m0 R = R(i.BYTE);
        if (R == null) {
            a(56);
        }
        return R;
    }

    public m0 u() {
        m0 R = R(i.CHAR);
        if (R == null) {
            a(62);
        }
        return R;
    }

    public Iterable<zc.b> v() {
        List singletonList = Collections.singletonList(new vc.a(this.f23409f, r()));
        if (singletonList == null) {
            a(5);
        }
        return singletonList;
    }

    public xc.e w() {
        xc.e o10 = o(k.a.U);
        if (o10 == null) {
            a(34);
        }
        return o10;
    }

    public xc.e x() {
        return p("Comparable");
    }

    public m0 y() {
        m0 I = I();
        if (I == null) {
            a(52);
        }
        return I;
    }

    public m0 z() {
        m0 R = R(i.DOUBLE);
        if (R == null) {
            a(61);
        }
        return R;
    }
}
