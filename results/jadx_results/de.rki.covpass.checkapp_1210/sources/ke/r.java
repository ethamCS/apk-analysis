package ke;

import java.util.List;
/* loaded from: classes3.dex */
public interface r {

    /* renamed from: a */
    public static final r f15098a = new a();

    /* loaded from: classes3.dex */
    static class a implements r {
        a() {
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i10 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // ke.r
        public void a(xc.b bVar) {
            if (bVar == null) {
                c(2);
            }
        }

        @Override // ke.r
        public void b(xc.e eVar, List<String> list) {
            if (eVar == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }
    }

    void a(xc.b bVar);

    void b(xc.e eVar, List<String> list);
}
