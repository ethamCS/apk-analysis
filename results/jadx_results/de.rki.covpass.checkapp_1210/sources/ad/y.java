package ad;

import he.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import oe.e1;
import xc.a1;
import xc.f1;
import xc.h1;
/* loaded from: classes.dex */
public class y extends g {
    private final xc.f W3;
    private final boolean X3;
    private xc.e0 Y3;
    private xc.u Z3;

    /* renamed from: a4 */
    private e1 f416a4;

    /* renamed from: b4 */
    private List<f1> f417b4;

    /* renamed from: c4 */
    private final Collection<oe.e0> f418c4;

    /* renamed from: d4 */
    private final ne.n f419d4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(xc.m mVar, xc.f fVar, boolean z10, boolean z11, wd.f fVar2, a1 a1Var, ne.n nVar) {
        super(nVar, mVar, fVar2, a1Var, z11);
        if (mVar == null) {
            z0(0);
        }
        if (fVar == null) {
            z0(1);
        }
        if (fVar2 == null) {
            z0(2);
        }
        if (a1Var == null) {
            z0(3);
        }
        if (nVar == null) {
            z0(4);
        }
        this.f418c4 = new ArrayList();
        this.f419d4 = nVar;
        this.W3 = fVar;
        this.X3 = z10;
    }

    private static /* synthetic */ void z0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // xc.e, xc.i
    public List<f1> A() {
        List<f1> list = this.f417b4;
        if (list == null) {
            z0(15);
        }
        return list;
    }

    @Override // xc.e
    public xc.d A0() {
        return null;
    }

    @Override // xc.e
    public he.h B0() {
        h.b bVar = h.b.f11873a;
        if (bVar == null) {
            z0(18);
        }
        return bVar;
    }

    @Override // xc.e
    public xc.e E0() {
        return null;
    }

    @Override // xc.d0
    public boolean L0() {
        return false;
    }

    @Override // xc.e
    public boolean N() {
        return false;
    }

    @Override // xc.e
    public boolean R0() {
        return false;
    }

    public void T0() {
        this.f416a4 = new oe.l(this, this.f417b4, this.f418c4, this.f419d4);
        Iterator<xc.d> it = k().iterator();
        while (it.hasNext()) {
            ((f) it.next()).p1(u());
        }
    }

    /* renamed from: U0 */
    public Set<xc.d> k() {
        Set<xc.d> emptySet = Collections.emptySet();
        if (emptySet == null) {
            z0(13);
        }
        return emptySet;
    }

    @Override // xc.e
    public boolean V() {
        return false;
    }

    public void V0(xc.e0 e0Var) {
        if (e0Var == null) {
            z0(6);
        }
        this.Y3 = e0Var;
    }

    public void W0(List<f1> list) {
        if (list == null) {
            z0(14);
        }
        if (this.f417b4 == null) {
            this.f417b4 = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    public void X0(xc.u uVar) {
        if (uVar == null) {
            z0(9);
        }
        this.Z3 = uVar;
    }

    @Override // xc.e, xc.q, xc.d0
    public xc.u g() {
        xc.u uVar = this.Z3;
        if (uVar == null) {
            z0(10);
        }
        return uVar;
    }

    @Override // xc.e
    public xc.f h() {
        xc.f fVar = this.W3;
        if (fVar == null) {
            z0(8);
        }
        return fVar;
    }

    @Override // xc.e
    public boolean isInline() {
        return false;
    }

    @Override // yc.a
    public yc.g j() {
        yc.g b10 = yc.g.Companion.b();
        if (b10 == null) {
            z0(5);
        }
        return b10;
    }

    @Override // xc.e
    public boolean j0() {
        return false;
    }

    @Override // xc.d0
    public boolean l0() {
        return false;
    }

    @Override // xc.i
    public boolean m0() {
        return this.X3;
    }

    @Override // xc.h
    public e1 r() {
        e1 e1Var = this.f416a4;
        if (e1Var == null) {
            z0(11);
        }
        return e1Var;
    }

    @Override // xc.e, xc.d0
    public xc.e0 s() {
        xc.e0 e0Var = this.Y3;
        if (e0Var == null) {
            z0(7);
        }
        return e0Var;
    }

    public String toString() {
        return j.y0(this);
    }

    @Override // xc.e
    public Collection<xc.e> v() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            z0(19);
        }
        return emptyList;
    }

    @Override // xc.e
    public h1<oe.m0> x0() {
        return null;
    }

    @Override // ad.t
    public he.h y0(pe.g gVar) {
        if (gVar == null) {
            z0(16);
        }
        h.b bVar = h.b.f11873a;
        if (bVar == null) {
            z0(17);
        }
        return bVar;
    }
}
