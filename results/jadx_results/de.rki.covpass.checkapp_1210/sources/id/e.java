package id;

import ad.g0;
import java.util.List;
import java.util.Map;
import oe.e0;
import tb.r;
import ve.p;
import xc.a;
import xc.a1;
import xc.b;
import xc.f1;
import xc.j1;
import xc.m;
import xc.u;
import xc.x0;
import xc.y;
import xc.z0;
/* loaded from: classes.dex */
public class e extends g0 implements id.a {

    /* renamed from: v4 */
    public static final a.AbstractC0451a<j1> f12492v4 = new a();

    /* renamed from: w4 */
    public static final a.AbstractC0451a<Boolean> f12493w4 = new b();

    /* renamed from: t4 */
    private c f12494t4;

    /* renamed from: u4 */
    private final boolean f12495u4;

    /* loaded from: classes.dex */
    static class a implements a.AbstractC0451a<j1> {
        a() {
        }
    }

    /* loaded from: classes.dex */
    static class b implements a.AbstractC0451a<Boolean> {
        b() {
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        

        /* renamed from: c */
        public final boolean f12499c;

        /* renamed from: d */
        public final boolean f12500d;

        c(boolean z10, boolean z11) {
            this.f12499c = z10;
            this.f12500d = z11;
        }

        private static /* synthetic */ void b(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        public static c g(boolean z10, boolean z11) {
            c cVar = z10 ? z11 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z11 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (cVar == null) {
                b(0);
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected e(m mVar, z0 z0Var, yc.g gVar, wd.f fVar, b.a aVar, a1 a1Var, boolean z10) {
        super(mVar, z0Var, gVar, fVar, aVar, a1Var);
        if (mVar == null) {
            e0(0);
        }
        if (gVar == null) {
            e0(1);
        }
        if (fVar == null) {
            e0(2);
        }
        if (aVar == null) {
            e0(3);
        }
        if (a1Var == null) {
            e0(4);
        }
        this.f12494t4 = null;
        this.f12495u4 = z10;
    }

    private static /* synthetic */ void e0(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 21) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 13) {
            objArr[1] = "initialize";
        } else if (i10 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 13 || i10 == 18 || i10 == 21) {
            throw new IllegalStateException(format);
        }
    }

    public static e y1(m mVar, yc.g gVar, wd.f fVar, a1 a1Var, boolean z10) {
        if (mVar == null) {
            e0(5);
        }
        if (gVar == null) {
            e0(6);
        }
        if (fVar == null) {
            e0(7);
        }
        if (a1Var == null) {
            e0(8);
        }
        return new e(mVar, null, gVar, fVar, b.a.DECLARATION, a1Var, z10);
    }

    /* renamed from: A1 */
    public e I(e0 e0Var, List<e0> list, e0 e0Var2, r<a.AbstractC0451a<?>, ?> rVar) {
        if (list == null) {
            e0(19);
        }
        if (e0Var2 == null) {
            e0(20);
        }
        e eVar = (e) y().f(h.a(list, o(), this)).r(e0Var2).s(e0Var == null ? null : ae.c.h(this, e0Var, yc.g.Companion.b())).a().l().b();
        if (rVar != null) {
            eVar.d1(rVar.e(), rVar.f());
        }
        if (eVar == null) {
            e0(21);
        }
        return eVar;
    }

    public void B1(boolean z10, boolean z11) {
        this.f12494t4 = c.g(z10, z11);
    }

    @Override // ad.p
    public boolean Z0() {
        return this.f12494t4.f12499c;
    }

    @Override // ad.p, xc.a
    public boolean b0() {
        return this.f12494t4.f12500d;
    }

    @Override // ad.g0
    public g0 x1(x0 x0Var, x0 x0Var2, List<x0> list, List<? extends f1> list2, List<j1> list3, e0 e0Var, xc.e0 e0Var2, u uVar, Map<? extends a.AbstractC0451a<?>, ?> map) {
        if (list == null) {
            e0(9);
        }
        if (list2 == null) {
            e0(10);
        }
        if (list3 == null) {
            e0(11);
        }
        if (uVar == null) {
            e0(12);
        }
        g0 x12 = super.x1(x0Var, x0Var2, list, list2, list3, e0Var, e0Var2, uVar, map);
        o1(p.f24052a.a(x12).a());
        if (x12 == null) {
            e0(13);
        }
        return x12;
    }

    /* renamed from: z1 */
    public e U0(m mVar, y yVar, b.a aVar, wd.f fVar, yc.g gVar, a1 a1Var) {
        if (mVar == null) {
            e0(14);
        }
        if (aVar == null) {
            e0(15);
        }
        if (gVar == null) {
            e0(16);
        }
        if (a1Var == null) {
            e0(17);
        }
        z0 z0Var = (z0) yVar;
        if (fVar == null) {
            fVar = getName();
        }
        e eVar = new e(mVar, z0Var, gVar, fVar, aVar, a1Var, this.f12495u4);
        eVar.B1(Z0(), b0());
        return eVar;
    }
}
