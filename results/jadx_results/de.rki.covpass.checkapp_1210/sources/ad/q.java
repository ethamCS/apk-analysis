package ad;
/* loaded from: classes.dex */
public class q extends c {

    /* renamed from: q */
    private final xc.e f391q;

    /* renamed from: x */
    private final ie.e f392x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(xc.e eVar) {
        super(yc.g.Companion.b());
        if (eVar == null) {
            e0(0);
        }
        this.f391q = eVar;
        this.f392x = new ie.e(eVar, null);
    }

    private static /* synthetic */ void e0(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i10 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i10 == 1) {
            objArr[1] = "getValue";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i10 == 1 || i10 == 2) {
            throw new IllegalStateException(format);
        }
    }

    @Override // xc.m, xc.n, xc.y, xc.l
    public xc.m b() {
        xc.e eVar = this.f391q;
        if (eVar == null) {
            e0(2);
        }
        return eVar;
    }

    @Override // xc.x0
    public ie.f getValue() {
        ie.e eVar = this.f392x;
        if (eVar == null) {
            e0(1);
        }
        return eVar;
    }

    @Override // ad.j
    public String toString() {
        return "class " + this.f391q.getName() + "::this";
    }
}
