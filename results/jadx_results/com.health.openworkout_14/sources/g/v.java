package g;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class v<T> {
    public static <T> v<T> b(u uVar, Method method) {
        s b2 = s.b(uVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (!y.j(genericReturnType)) {
            if (genericReturnType == Void.TYPE) {
                throw y.m(method, "Service methods cannot return void.", new Object[0]);
            }
            return k.f(uVar, method, b2);
        }
        throw y.m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
    }

    @Nullable
    public abstract T a(Object[] objArr);
}
