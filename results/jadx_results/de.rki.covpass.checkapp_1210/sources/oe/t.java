package oe;

import java.util.HashMap;
import java.util.List;
/* loaded from: classes3.dex */
public class t {
    private static /* synthetic */ void a(int i10) {
        String str = i10 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 4 ? 3 : 2];
        switch (i10) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i10 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i10 != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static l1 b(List<xc.f1> list, j1 j1Var, xc.m mVar, List<xc.f1> list2) {
        if (list == null) {
            a(0);
        }
        if (j1Var == null) {
            a(1);
        }
        if (mVar == null) {
            a(2);
        }
        if (list2 == null) {
            a(3);
        }
        l1 c10 = c(list, j1Var, mVar, list2, null);
        if (c10 != null) {
            return c10;
        }
        throw new AssertionError("Substitution failed");
    }

    public static l1 c(List<xc.f1> list, j1 j1Var, xc.m mVar, List<xc.f1> list2, boolean[] zArr) {
        if (list == null) {
            a(5);
        }
        if (j1Var == null) {
            a(6);
        }
        if (mVar == null) {
            a(7);
        }
        if (list2 == null) {
            a(8);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i10 = 0;
        for (xc.f1 f1Var : list) {
            ad.k0 Z0 = ad.k0.Z0(mVar, f1Var.j(), f1Var.Z(), f1Var.w(), f1Var.getName(), i10, xc.a1.f25519a, f1Var.M());
            hashMap.put(f1Var.r(), new i1(Z0.u()));
            hashMap2.put(f1Var, Z0);
            list2.add(Z0);
            i10++;
        }
        f1 j10 = f1.j(hashMap);
        l1 h10 = l1.h(j1Var, j10);
        l1 h11 = l1.h(j1Var.h(), j10);
        for (xc.f1 f1Var2 : list) {
            ad.k0 k0Var = (ad.k0) hashMap2.get(f1Var2);
            for (e0 e0Var : f1Var2.getUpperBounds()) {
                xc.h z10 = e0Var.W0().z();
                e0 p10 = ((!(z10 instanceof xc.f1) || !te.a.j((xc.f1) z10)) ? h11 : h10).p(e0Var, r1.OUT_VARIANCE);
                if (p10 == null) {
                    return null;
                }
                if (p10 != e0Var && zArr != null) {
                    zArr[0] = true;
                }
                k0Var.V0(p10);
            }
            k0Var.e1();
        }
        return h10;
    }
}
