package gd;

import xc.b;
import xc.u0;
/* loaded from: classes.dex */
public final class k {
    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "companionObject";
        } else if (i10 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i10 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i10 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i10 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(xc.b bVar) {
        xc.w c02;
        if (bVar == null) {
            a(3);
        }
        if (!(bVar instanceof u0) || (c02 = ((u0) bVar).c0()) == null || !c02.j().B(z.f10769b)) {
            return bVar.j().B(z.f10769b);
        }
        return true;
    }

    public static boolean c(xc.m mVar) {
        if (mVar == null) {
            a(1);
        }
        return ae.d.x(mVar) && ae.d.w(mVar.b()) && !d((xc.e) mVar);
    }

    public static boolean d(xc.e eVar) {
        if (eVar == null) {
            a(2);
        }
        return uc.d.a(uc.c.f23400a, eVar);
    }

    public static boolean e(u0 u0Var) {
        if (u0Var == null) {
            a(0);
        }
        if (u0Var.h() == b.a.FAKE_OVERRIDE) {
            return false;
        }
        if (c(u0Var.b())) {
            return true;
        }
        return ae.d.x(u0Var.b()) && b(u0Var);
    }
}
