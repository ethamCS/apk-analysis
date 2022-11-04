package ad;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import xc.a1;
import xc.b;
import xc.j1;
import xc.t0;
import xc.u0;
import xc.w0;
/* loaded from: classes.dex */
public class e0 extends b0 implements w0 {

    /* renamed from: b4 */
    private j1 f304b4;

    /* renamed from: c4 */
    private final w0 f305c4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(u0 u0Var, yc.g gVar, xc.e0 e0Var, xc.u uVar, boolean z10, boolean z11, boolean z12, b.a aVar, w0 w0Var, a1 a1Var) {
        super(e0Var, uVar, u0Var, gVar, wd.f.o("<set-" + u0Var.getName() + ">"), z10, z11, z12, aVar, a1Var);
        e0 e0Var2;
        e0 e0Var3;
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
        if (w0Var != 0) {
            e0Var2 = this;
            e0Var3 = w0Var;
        } else {
            e0Var3 = this;
            e0Var2 = e0Var3;
        }
        e0Var2.f305c4 = e0Var3;
    }

    public static l0 Y0(w0 w0Var, oe.e0 e0Var, yc.g gVar) {
        if (w0Var == null) {
            e0(7);
        }
        if (e0Var == null) {
            e0(8);
        }
        if (gVar == null) {
            e0(9);
        }
        return new l0(w0Var, null, 0, gVar, wd.h.f24824n, e0Var, false, false, false, null, a1.f25519a);
    }

    private static /* synthetic */ void e0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: Z0 */
    public w0 z0() {
        w0 w0Var = this.f305c4;
        if (w0Var == null) {
            e0(13);
        }
        return w0Var;
    }

    public void a1(j1 j1Var) {
        if (j1Var == null) {
            e0(6);
        }
        this.f304b4 = j1Var;
    }

    @Override // xc.a
    public oe.e0 e() {
        oe.m0 Z = ee.a.f(this).Z();
        if (Z == null) {
            e0(12);
        }
        return Z;
    }

    @Override // xc.y, xc.b, xc.a
    public Collection<? extends w0> f() {
        Collection<t0> U0 = super.U0(false);
        if (U0 == null) {
            e0(10);
        }
        return U0;
    }

    @Override // xc.m
    public <R, D> R g0(xc.o<R, D> oVar, D d10) {
        return oVar.e(this, d10);
    }

    @Override // xc.a
    public List<j1> o() {
        j1 j1Var = this.f304b4;
        if (j1Var != null) {
            List<j1> singletonList = Collections.singletonList(j1Var);
            if (singletonList == null) {
                e0(11);
            }
            return singletonList;
        }
        throw new IllegalStateException();
    }
}
