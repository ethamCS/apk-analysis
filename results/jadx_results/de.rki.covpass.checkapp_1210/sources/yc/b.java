package yc;
/* loaded from: classes.dex */
public class b implements a {

    /* renamed from: c */
    private final g f26024c;

    public b(g gVar) {
        if (gVar == null) {
            e0(0);
        }
        this.f26024c = gVar;
    }

    private static /* synthetic */ void e0(int i10) {
        String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 1 ? 3 : 2];
        if (i10 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i10 != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 != 1) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // yc.a
    public g j() {
        g gVar = this.f26024c;
        if (gVar == null) {
            e0(1);
        }
        return gVar;
    }
}
