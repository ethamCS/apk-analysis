package id;

import ad.c0;
import ad.d0;
import java.util.List;
import ne.j;
import oe.e0;
import tb.r;
import xc.a;
import xc.a1;
import xc.b;
import xc.f1;
import xc.m;
import xc.u;
import xc.u0;
import xc.w0;
import xc.x0;
/* loaded from: classes.dex */
public class f extends c0 implements a {

    /* renamed from: r4 */
    private final boolean f12501r4;

    /* renamed from: s4 */
    private final r<a.AbstractC0451a<?>, ?> f12502s4;

    /* renamed from: t4 */
    private e0 f12503t4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, yc.g gVar, xc.e0 e0Var, u uVar, boolean z10, wd.f fVar, a1 a1Var, u0 u0Var, b.a aVar, boolean z11, r<a.AbstractC0451a<?>, ?> rVar) {
        super(mVar, u0Var, gVar, e0Var, uVar, z10, fVar, aVar, a1Var, false, false, false, false, false, false);
        if (mVar == null) {
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
        if (fVar == null) {
            e0(4);
        }
        if (a1Var == null) {
            e0(5);
        }
        if (aVar == null) {
            e0(6);
        }
        this.f12503t4 = null;
        this.f12501r4 = z11;
        this.f12502s4 = rVar;
    }

    private static /* synthetic */ void e0(int i10) {
        String str = i10 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 21 ? 3 : 2];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 21) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static f o1(m mVar, yc.g gVar, xc.e0 e0Var, u uVar, boolean z10, wd.f fVar, a1 a1Var, boolean z11) {
        if (mVar == null) {
            e0(7);
        }
        if (gVar == null) {
            e0(8);
        }
        if (e0Var == null) {
            e0(9);
        }
        if (uVar == null) {
            e0(10);
        }
        if (fVar == null) {
            e0(11);
        }
        if (a1Var == null) {
            e0(12);
        }
        return new f(mVar, gVar, e0Var, uVar, z10, fVar, a1Var, null, b.a.DECLARATION, z11, null);
    }

    @Override // ad.c0, xc.a
    public <V> V D(a.AbstractC0451a<V> abstractC0451a) {
        r<a.AbstractC0451a<?>, ?> rVar = this.f12502s4;
        if (rVar == null || !rVar.e().equals(abstractC0451a)) {
            return null;
        }
        return (V) this.f12502s4.f();
    }

    @Override // id.a
    public a I(e0 e0Var, List<e0> list, e0 e0Var2, r<a.AbstractC0451a<?>, ?> rVar) {
        d0 d0Var;
        ad.e0 e0Var3;
        List<x0> h10;
        if (list == null) {
            e0(19);
        }
        if (e0Var2 == null) {
            e0(20);
        }
        u0 z02 = z0() == this ? null : z0();
        f fVar = new f(b(), j(), s(), g(), Q(), getName(), m(), z02, h(), this.f12501r4, rVar);
        d0 i10 = i();
        if (i10 != null) {
            d0Var = r15;
            d0 d0Var2 = new d0(fVar, i10.j(), i10.s(), i10.g(), i10.F0(), i10.H(), i10.isInline(), h(), z02 == null ? null : z02.i(), i10.m());
            d0Var.W0(i10.G());
            d0Var.Z0(e0Var2);
        } else {
            d0Var = null;
        }
        w0 n10 = n();
        if (n10 != null) {
            ad.e0 e0Var4 = new ad.e0(fVar, n10.j(), n10.s(), n10.g(), n10.F0(), n10.H(), n10.isInline(), h(), z02 == null ? null : z02.n(), n10.m());
            e0Var4.W0(e0Var4.G());
            e0Var4.a1(n10.o().get(0));
            e0Var3 = e0Var4;
        } else {
            e0Var3 = null;
        }
        fVar.e1(d0Var, e0Var3, c0(), W());
        fVar.j1(f1());
        gc.a<j<ce.g<?>>> aVar = this.W3;
        if (aVar != null) {
            fVar.T0(this.V3, aVar);
        }
        fVar.t0(f());
        x0 h11 = e0Var == null ? null : ae.c.h(this, e0Var, yc.g.Companion.b());
        List<f1> p10 = p();
        x0 J = J();
        h10 = ub.u.h();
        fVar.k1(e0Var2, p10, J, h11, h10);
        return fVar;
    }

    @Override // ad.c0, xc.k1
    public boolean P() {
        e0 type = getType();
        return this.f12501r4 && xc.j.a(type) && (!od.r.i(type) || uc.h.u0(type));
    }

    @Override // ad.c0
    protected c0 Y0(m mVar, xc.e0 e0Var, u uVar, u0 u0Var, b.a aVar, wd.f fVar, a1 a1Var) {
        if (mVar == null) {
            e0(13);
        }
        if (e0Var == null) {
            e0(14);
        }
        if (uVar == null) {
            e0(15);
        }
        if (aVar == null) {
            e0(16);
        }
        if (fVar == null) {
            e0(17);
        }
        if (a1Var == null) {
            e0(18);
        }
        return new f(mVar, j(), e0Var, uVar, Q(), fVar, a1Var, u0Var, aVar, this.f12501r4, this.f12502s4);
    }

    @Override // ad.m0, xc.a
    public boolean b0() {
        return false;
    }

    @Override // ad.c0
    public void i1(e0 e0Var) {
        if (e0Var == null) {
            e0(22);
        }
        this.f12503t4 = e0Var;
    }
}
