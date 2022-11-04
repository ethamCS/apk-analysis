package dd;

import java.lang.reflect.Modifier;
import xc.m1;
import xc.n1;
/* loaded from: classes.dex */
public interface v extends nd.s {

    /* loaded from: classes.dex */
    public static final class a {
        public static n1 a(v vVar) {
            int y10 = vVar.y();
            return Modifier.isPublic(y10) ? m1.h.f25566c : Modifier.isPrivate(y10) ? m1.e.f25563c : Modifier.isProtected(y10) ? Modifier.isStatic(y10) ? bd.c.f5975c : bd.b.f5974c : bd.a.f5973c;
        }

        public static boolean b(v vVar) {
            return Modifier.isAbstract(vVar.y());
        }

        public static boolean c(v vVar) {
            return Modifier.isFinal(vVar.y());
        }

        public static boolean d(v vVar) {
            return Modifier.isStatic(vVar.y());
        }
    }

    int y();
}
