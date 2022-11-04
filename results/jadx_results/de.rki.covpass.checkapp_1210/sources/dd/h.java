package dd;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;
/* loaded from: classes.dex */
public interface h extends nd.d {

    /* loaded from: classes.dex */
    public static final class a {
        public static e a(h hVar, wd.c cVar) {
            Annotation[] declaredAnnotations;
            hc.t.e(cVar, "fqName");
            AnnotatedElement U = hVar.U();
            if (U == null || (declaredAnnotations = U.getDeclaredAnnotations()) == null) {
                return null;
            }
            return i.a(declaredAnnotations, cVar);
        }

        public static List<e> b(h hVar) {
            List<e> h10;
            Annotation[] declaredAnnotations;
            List<e> b10;
            AnnotatedElement U = hVar.U();
            if (U == null || (declaredAnnotations = U.getDeclaredAnnotations()) == null || (b10 = i.b(declaredAnnotations)) == null) {
                h10 = ub.u.h();
                return h10;
            }
            return b10;
        }

        public static boolean c(h hVar) {
            return false;
        }
    }

    AnnotatedElement U();
}
