package oe;
/* loaded from: classes3.dex */
public class i1 extends h1 {

    /* renamed from: a */
    private final r1 f18002a;

    /* renamed from: b */
    private final e0 f18003b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i1(e0 e0Var) {
        this(r1.INVARIANT, e0Var);
        if (e0Var == null) {
            d(2);
        }
    }

    public i1(r1 r1Var, e0 e0Var) {
        if (r1Var == null) {
            d(0);
        }
        if (e0Var == null) {
            d(1);
        }
        this.f18002a = r1Var;
        this.f18003b = e0Var;
    }

    private static /* synthetic */ void d(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i10 == 3) {
            objArr[2] = "replaceType";
        } else if (i10 != 4 && i10 != 5) {
            if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        if (i10 == 4 || i10 == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // oe.g1
    public g1 a(pe.g gVar) {
        if (gVar == null) {
            d(6);
        }
        return new i1(this.f18002a, gVar.h(this.f18003b));
    }

    @Override // oe.g1
    public r1 b() {
        r1 r1Var = this.f18002a;
        if (r1Var == null) {
            d(4);
        }
        return r1Var;
    }

    @Override // oe.g1
    public boolean c() {
        return false;
    }

    @Override // oe.g1
    public e0 getType() {
        e0 e0Var = this.f18003b;
        if (e0Var == null) {
            d(5);
        }
        return e0Var;
    }
}
