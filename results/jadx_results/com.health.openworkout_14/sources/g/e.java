package g;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public interface e<R, T> {

    /* loaded from: classes.dex */
    public static abstract class a {
        public static Type b(int i, ParameterizedType parameterizedType) {
            return y.g(i, parameterizedType);
        }

        public static Class<?> c(Type type) {
            return y.h(type);
        }

        @Nullable
        public abstract e<?, ?> a(Type type, Annotation[] annotationArr, u uVar);
    }

    Type a();

    T b(d<R> dVar);
}
