package ad;
/* loaded from: classes.dex */
public abstract class j extends yc.b implements xc.m {

    /* renamed from: d */
    private final wd.f f316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yc.g gVar, wd.f fVar) {
        super(gVar);
        if (gVar == null) {
            e0(0);
        }
        if (fVar == null) {
            e0(1);
        }
        this.f316d = fVar;
    }

    private static /* synthetic */ void e0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5 || i10 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                objArr[2] = "toString";
            } else if (i10 != 5 && i10 != 6) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        if (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) {
            throw new IllegalStateException(format);
        }
    }

    public static String y0(xc.m mVar) {
        if (mVar == null) {
            e0(4);
        }
        try {
            String str = zd.c.f26623i.q(mVar) + "[" + mVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(mVar)) + "]";
            if (str == null) {
                e0(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = mVar.getClass().getSimpleName() + " " + mVar.getName();
            if (str2 == null) {
                e0(6);
            }
            return str2;
        }
    }

    public xc.m a() {
        return this;
    }

    @Override // xc.j0
    public wd.f getName() {
        wd.f fVar = this.f316d;
        if (fVar == null) {
            e0(2);
        }
        return fVar;
    }

    public String toString() {
        return y0(this);
    }
}
