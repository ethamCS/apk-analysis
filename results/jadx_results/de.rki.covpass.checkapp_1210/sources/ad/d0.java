package ad;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import xc.a1;
import xc.b;
import xc.j1;
import xc.t0;
import xc.u0;
import xc.v0;
/* loaded from: classes.dex */
public class d0 extends b0 implements v0 {

    /* renamed from: b4 */
    private oe.e0 f293b4;

    /* renamed from: c4 */
    private final v0 f294c4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(u0 u0Var, yc.g gVar, xc.e0 e0Var, xc.u uVar, boolean z10, boolean z11, boolean z12, b.a aVar, v0 v0Var, a1 a1Var) {
        super(e0Var, uVar, u0Var, gVar, wd.f.o("<get-" + u0Var.getName() + ">"), z10, z11, z12, aVar, a1Var);
        d0 d0Var;
        d0 d0Var2;
        if (u0Var == null) {
            e0(0);
        }
        if (gVar == null) {
            e0(1);
        }
        if (e0Var == null) {
            e0(2);
        }
        if (uVar == null) {
            e0(3);
        }
        if (aVar == null) {
            e0(4);
        }
        if (a1Var == null) {
            e0(5);
        }
        if (v0Var != 0) {
            d0Var = this;
            d0Var2 = v0Var;
        } else {
            d0Var2 = this;
            d0Var = d0Var2;
        }
        d0Var.f294c4 = d0Var2;
    }

    private static /* synthetic */ void e0(int i10) {
        String str = (i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: Y0 */
    public v0 z0() {
        v0 v0Var = this.f294c4;
        if (v0Var == null) {
            e0(8);
        }
        return v0Var;
    }

    public void Z0(oe.e0 e0Var) {
        if (e0Var == null) {
            e0Var = C0().getType();
        }
        this.f293b4 = e0Var;
    }

    @Override // xc.a
    public oe.e0 e() {
        return this.f293b4;
    }

    @Override // xc.y, xc.b, xc.a
    public Collection<? extends v0> f() {
        Collection<t0> U0 = super.U0(true);
        if (U0 == null) {
            e0(6);
        }
        return U0;
    }

    @Override // xc.m
    public <R, D> R g0(xc.o<R, D> oVar, D d10) {
        return oVar.c(this, d10);
    }

    @Override // xc.a
    public List<j1> o() {
        List<j1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            e0(7);
        }
        return emptyList;
    }
}
