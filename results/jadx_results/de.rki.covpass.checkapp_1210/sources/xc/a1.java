package xc;
/* loaded from: classes.dex */
public interface a1 {

    /* renamed from: a */
    public static final a1 f25519a = new a();

    /* loaded from: classes.dex */
    static class a implements a1 {
        a() {
        }

        private static /* synthetic */ void d(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // xc.a1
        public b1 a() {
            b1 b1Var = b1.f25526a;
            if (b1Var == null) {
                d(0);
            }
            return b1Var;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    b1 a();
}
