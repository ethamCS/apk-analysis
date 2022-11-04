package ad;
/* loaded from: classes.dex */
public class f0 extends c {

    /* renamed from: q */
    private final xc.m f307q;

    /* renamed from: x */
    private ie.f f308x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(xc.m mVar, ie.f fVar, yc.g gVar) {
        super(gVar);
        if (mVar == null) {
            e0(0);
        }
        if (fVar == null) {
            e0(1);
        }
        if (gVar == null) {
            e0(2);
        }
        this.f307q = mVar;
        this.f308x = fVar;
    }

    private static /* synthetic */ void e0(int i10) {
        String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "value";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 5:
                objArr[0] = "newOwner";
                break;
            case 6:
                objArr[0] = "outType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "getValue";
        } else if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 3 && i10 != 4) {
            if (i10 == 5) {
                objArr[2] = "copy";
            } else if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "setOutType";
            }
        }
        String format = String.format(str, objArr);
        if (i10 == 3 || i10 == 4) {
            throw new IllegalStateException(format);
        }
    }

    @Override // xc.m, xc.n, xc.y, xc.l
    public xc.m b() {
        xc.m mVar = this.f307q;
        if (mVar == null) {
            e0(4);
        }
        return mVar;
    }

    @Override // xc.x0
    public ie.f getValue() {
        ie.f fVar = this.f308x;
        if (fVar == null) {
            e0(3);
        }
        return fVar;
    }
}
