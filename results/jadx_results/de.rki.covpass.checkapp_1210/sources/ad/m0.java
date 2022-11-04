package ad;

import java.util.Collections;
import java.util.List;
import xc.a1;
import xc.f1;
import xc.j1;
import xc.k1;
import xc.x0;
/* loaded from: classes.dex */
public abstract class m0 extends k implements k1 {

    /* renamed from: y */
    protected oe.e0 f330y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(xc.m mVar, yc.g gVar, wd.f fVar, oe.e0 e0Var, a1 a1Var) {
        super(mVar, gVar, fVar, a1Var);
        if (mVar == null) {
            e0(0);
        }
        if (gVar == null) {
            e0(1);
        }
        if (fVar == null) {
            e0(2);
        }
        if (a1Var == null) {
            e0(3);
        }
        this.f330y = e0Var;
    }

    private static /* synthetic */ void e0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public x0 J() {
        return null;
    }

    public void M0(oe.e0 e0Var) {
        this.f330y = e0Var;
    }

    public x0 U() {
        return null;
    }

    @Override // xc.a
    public boolean b0() {
        return false;
    }

    public oe.e0 e() {
        oe.e0 type = getType();
        if (type == null) {
            e0(10);
        }
        return type;
    }

    @Override // xc.i1
    public oe.e0 getType() {
        oe.e0 e0Var = this.f330y;
        if (e0Var == null) {
            e0(4);
        }
        return e0Var;
    }

    @Override // xc.a
    public List<j1> o() {
        List<j1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            e0(6);
        }
        return emptyList;
    }

    public List<f1> p() {
        List<f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            e0(8);
        }
        return emptyList;
    }
}
