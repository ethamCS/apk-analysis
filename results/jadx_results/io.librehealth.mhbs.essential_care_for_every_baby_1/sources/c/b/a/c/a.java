package c.b.a.c;

import c.b.a.a.i;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* loaded from: classes.dex */
abstract class a<T> {
    public final Type a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        i.e(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
