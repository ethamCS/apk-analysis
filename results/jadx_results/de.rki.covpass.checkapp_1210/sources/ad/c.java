package ad;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import oe.l1;
import oe.r1;
import xc.a1;
import xc.f1;
import xc.j1;
import xc.r0;
import xc.x0;
/* loaded from: classes.dex */
public abstract class c extends j implements x0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yc.g gVar) {
        super(gVar, wd.h.f24818h);
        if (gVar == null) {
            e0(0);
        }
    }

    private static /* synthetic */ void e0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case 2:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 3:
                objArr[1] = "getTypeParameters";
                break;
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getValueParameters";
                break;
            case 6:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 7:
                objArr[1] = "getVisibility";
                break;
            case 8:
                objArr[1] = "getOriginal";
                break;
            case 9:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // xc.a
    public x0 J() {
        return null;
    }

    @Override // xc.a
    public x0 U() {
        return null;
    }

    @Override // xc.a
    public boolean b0() {
        return false;
    }

    @Override // xc.x0, xc.c1
    public x0 c(l1 l1Var) {
        r1 r1Var;
        oe.e0 e0Var;
        if (l1Var == null) {
            e0(1);
        }
        if (l1Var.k()) {
            return this;
        }
        if (b() instanceof xc.e) {
            e0Var = getType();
            r1Var = r1.OUT_VARIANCE;
        } else {
            e0Var = getType();
            r1Var = r1.INVARIANT;
        }
        oe.e0 p10 = l1Var.p(e0Var, r1Var);
        if (p10 == null) {
            return null;
        }
        return p10 == getType() ? this : new f0(b(), new ie.i(p10), j());
    }

    @Override // xc.a
    public oe.e0 e() {
        return getType();
    }

    @Override // xc.a
    public Collection<? extends xc.a> f() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            e0(6);
        }
        return emptySet;
    }

    @Override // xc.q, xc.d0
    public xc.u g() {
        xc.u uVar = xc.t.f25582f;
        if (uVar == null) {
            e0(7);
        }
        return uVar;
    }

    @Override // xc.m
    public <R, D> R g0(xc.o<R, D> oVar, D d10) {
        return oVar.i(this, d10);
    }

    @Override // xc.i1
    public oe.e0 getType() {
        oe.e0 type = getValue().getType();
        if (type == null) {
            e0(4);
        }
        return type;
    }

    @Override // xc.p
    public a1 m() {
        a1 a1Var = a1.f25519a;
        if (a1Var == null) {
            e0(9);
        }
        return a1Var;
    }

    @Override // xc.a
    public List<j1> o() {
        List<j1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            e0(5);
        }
        return emptyList;
    }

    @Override // xc.a
    public List<f1> p() {
        List<f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            e0(3);
        }
        return emptyList;
    }

    /* renamed from: z0 */
    public r0 a() {
        return this;
    }
}
