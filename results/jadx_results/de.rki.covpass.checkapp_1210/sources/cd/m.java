package cd;

import hc.t;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
final class m {

    /* renamed from: a */
    public static final m f6445a = new m();

    private m() {
    }

    public final String a(Constructor<?> constructor) {
        t.e(constructor, "constructor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        t.d(parameterTypes, "constructor.parameterTypes");
        for (Class<?> cls : parameterTypes) {
            t.d(cls, "parameterType");
            sb2.append(dd.d.b(cls));
        }
        sb2.append(")V");
        String sb3 = sb2.toString();
        t.d(sb3, "sb.toString()");
        return sb3;
    }

    public final String b(Field field) {
        t.e(field, "field");
        Class<?> type = field.getType();
        t.d(type, "field.type");
        return dd.d.b(type);
    }

    public final String c(Method method) {
        t.e(method, "method");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        t.d(parameterTypes, "method.parameterTypes");
        for (Class<?> cls : parameterTypes) {
            t.d(cls, "parameterType");
            sb2.append(dd.d.b(cls));
        }
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        t.d(returnType, "method.returnType");
        sb2.append(dd.d.b(returnType));
        String sb3 = sb2.toString();
        t.d(sb3, "sb.toString()");
        return sb3;
    }
}
