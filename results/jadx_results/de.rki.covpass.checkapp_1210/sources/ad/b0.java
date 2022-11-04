package ad;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import oe.l1;
import xc.a;
import xc.a1;
import xc.b;
import xc.f1;
import xc.t0;
import xc.u0;
import xc.x0;
/* loaded from: classes.dex */
public abstract class b0 extends k implements t0 {
    private final boolean U3;
    private final xc.e0 V3;
    private final u0 W3;
    private final boolean X3;
    private final b.a Y3;
    private xc.u Z3;

    /* renamed from: a4 */
    private xc.y f257a4;

    /* renamed from: y */
    private boolean f258y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(xc.e0 e0Var, xc.u uVar, u0 u0Var, yc.g gVar, wd.f fVar, boolean z10, boolean z11, boolean z12, b.a aVar, a1 a1Var) {
        super(u0Var.b(), gVar, fVar, a1Var);
        if (e0Var == null) {
            e0(0);
        }
        if (uVar == null) {
            e0(1);
        }
        if (u0Var == null) {
            e0(2);
        }
        if (gVar == null) {
            e0(3);
        }
        if (fVar == null) {
            e0(4);
        }
        if (a1Var == null) {
            e0(5);
        }
        this.f257a4 = null;
        this.V3 = e0Var;
        this.Z3 = uVar;
        this.W3 = u0Var;
        this.f258y = z10;
        this.U3 = z11;
        this.X3 = z12;
        this.Y3 = aVar;
    }

    private static /* synthetic */ void e0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                i11 = 2;
                break;
            case 7:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 15:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getModality";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 12:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 15:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 7:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // xc.t0
    public u0 C0() {
        u0 u0Var = this.W3;
        if (u0Var == null) {
            e0(12);
        }
        return u0Var;
    }

    @Override // xc.a
    public <V> V D(a.AbstractC0451a<V> abstractC0451a) {
        return null;
    }

    @Override // xc.t0
    public boolean F0() {
        return this.f258y;
    }

    @Override // xc.y
    public xc.y G() {
        return this.f257a4;
    }

    @Override // xc.y
    public boolean G0() {
        return false;
    }

    @Override // xc.d0
    public boolean H() {
        return this.U3;
    }

    @Override // xc.a
    public x0 J() {
        return C0().J();
    }

    @Override // xc.d0
    public boolean L0() {
        return false;
    }

    /* renamed from: M0 */
    public t0 n0(xc.m mVar, xc.e0 e0Var, xc.u uVar, b.a aVar, boolean z10) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // xc.y
    public boolean P0() {
        return false;
    }

    /* renamed from: T0 */
    public abstract t0 z0();

    @Override // xc.a
    public x0 U() {
        return C0().U();
    }

    public Collection<t0> U0(boolean z10) {
        ArrayList arrayList = new ArrayList(0);
        for (u0 u0Var : C0().f()) {
            Object i10 = z10 ? u0Var.i() : u0Var.n();
            if (i10 != null) {
                arrayList.add(i10);
            }
        }
        return arrayList;
    }

    public void V0(boolean z10) {
        this.f258y = z10;
    }

    public void W0(xc.y yVar) {
        this.f257a4 = yVar;
    }

    public void X0(xc.u uVar) {
        this.Z3 = uVar;
    }

    @Override // xc.a
    public boolean b0() {
        return false;
    }

    @Override // xc.y, xc.c1
    public xc.y c(l1 l1Var) {
        if (l1Var == null) {
            e0(7);
        }
        throw new UnsupportedOperationException();
    }

    @Override // xc.a
    public List<x0> d0() {
        List<x0> d02 = C0().d0();
        if (d02 == null) {
            e0(13);
        }
        return d02;
    }

    @Override // xc.q, xc.d0
    public xc.u g() {
        xc.u uVar = this.Z3;
        if (uVar == null) {
            e0(10);
        }
        return uVar;
    }

    @Override // xc.b
    public b.a h() {
        b.a aVar = this.Y3;
        if (aVar == null) {
            e0(6);
        }
        return aVar;
    }

    @Override // xc.y
    public boolean isInline() {
        return this.X3;
    }

    @Override // xc.d0
    public boolean l0() {
        return false;
    }

    @Override // xc.a
    public List<f1> p() {
        List<f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            e0(8);
        }
        return emptyList;
    }

    @Override // xc.y
    public boolean r0() {
        return false;
    }

    @Override // xc.d0
    public xc.e0 s() {
        xc.e0 e0Var = this.V3;
        if (e0Var == null) {
            e0(9);
        }
        return e0Var;
    }

    @Override // xc.y
    public boolean s0() {
        return false;
    }

    @Override // xc.b
    public void t0(Collection<? extends xc.b> collection) {
        if (collection == null) {
            e0(15);
        }
    }

    @Override // xc.y
    public boolean u0() {
        return false;
    }

    @Override // xc.y
    public boolean v0() {
        return false;
    }
}
