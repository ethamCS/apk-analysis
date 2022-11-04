package g;

import e.h0;
import e.j0;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public interface h<F, T> {

    /* loaded from: classes.dex */
    public static abstract class a {
        public static Type a(int i, ParameterizedType parameterizedType) {
            return y.g(i, parameterizedType);
        }

        public static Class<?> b(Type type) {
            return y.h(type);
        }

        @Nullable
        public h<?, h0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, u uVar) {
            return null;
        }

        @Nullable
        public h<j0, ?> d(Type type, Annotation[] annotationArr, u uVar) {
            return null;
        }

        @Nullable
        public h<?, String> e(Type type, Annotation[] annotationArr, u uVar) {
            return null;
        }
    }

    @Nullable
    T a(F f2);
}
