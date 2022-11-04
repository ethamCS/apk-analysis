package ad;

import he.h;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import oe.e1;
import xc.a1;
import xc.f1;
import xc.h1;
/* loaded from: classes.dex */
public class h extends g {
    private final xc.e0 W3;
    private final xc.f X3;
    private final e1 Y3;
    private he.h Z3;

    /* renamed from: a4 */
    private Set<xc.d> f310a4;

    /* renamed from: b4 */
    private xc.d f311b4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(xc.m mVar, wd.f fVar, xc.e0 e0Var, xc.f fVar2, Collection<oe.e0> collection, a1 a1Var, boolean z10, ne.n nVar) {
        super(nVar, mVar, fVar, a1Var, z10);
        if (mVar == null) {
            z0(0);
        }
        if (fVar == null) {
            z0(1);
        }
        if (e0Var == null) {
            z0(2);
        }
        if (fVar2 == null) {
            z0(3);
        }
        if (collection == null) {
            z0(4);
        }
        if (a1Var == null) {
            z0(5);
        }
        if (nVar == null) {
            z0(6);
        }
        this.W3 = e0Var;
        this.X3 = fVar2;
        this.Y3 = new oe.l(this, Collections.emptyList(), collection, nVar);
    }

    private static /* synthetic */ void z0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // xc.e, xc.i
    public List<f1> A() {
        List<f1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            z0(18);
        }
        return emptyList;
    }

    @Override // xc.e
    public xc.d A0() {
        return this.f311b4;
    }

    @Override // xc.e
    public he.h B0() {
        h.b bVar = h.b.f11873a;
        if (bVar == null) {
            z0(14);
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

    public final void T0(he.h hVar, Set<xc.d> set, xc.d dVar) {
        if (hVar == null) {
            z0(7);
        }
        if (set == null) {
            z0(8);
        }
        this.Z3 = hVar;
        this.f310a4 = set;
        this.f311b4 = dVar;
    }

    @Override // xc.e
    public boolean V() {
        return false;
    }

    @Override // xc.e, xc.q, xc.d0
    public xc.u g() {
        xc.u uVar = xc.t.f25581e;
        if (uVar == null) {
            z0(17);
        }
        return uVar;
    }

    @Override // xc.e
    public xc.f h() {
        xc.f fVar = this.X3;
        if (fVar == null) {
            z0(15);
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
            z0(9);
        }
        return b10;
    }

    @Override // xc.e
    public boolean j0() {
        return false;
    }

    @Override // xc.e
    public Collection<xc.d> k() {
        Set<xc.d> set = this.f310a4;
        if (set == null) {
            z0(11);
        }
        return set;
    }

    @Override // xc.d0
    public boolean l0() {
        return false;
    }

    @Override // xc.i
    public boolean m0() {
        return false;
    }

    @Override // xc.h
    public e1 r() {
        e1 e1Var = this.Y3;
        if (e1Var == null) {
            z0(10);
        }
        return e1Var;
    }

    @Override // xc.e, xc.d0
    public xc.e0 s() {
        xc.e0 e0Var = this.W3;
        if (e0Var == null) {
            z0(16);
        }
        return e0Var;
    }

    public String toString() {
        return "class " + getName();
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
            z0(12);
        }
        he.h hVar = this.Z3;
        if (hVar == null) {
            z0(13);
        }
        return hVar;
    }
}
