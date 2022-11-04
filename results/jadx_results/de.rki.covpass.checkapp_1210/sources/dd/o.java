package dd;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class o extends t implements nd.k {

    /* renamed from: a */
    private final Constructor<?> f8511a;

    public o(Constructor<?> constructor) {
        hc.t.e(constructor, "member");
        this.f8511a = constructor;
    }

    /* renamed from: c0 */
    public Constructor<?> a0() {
        return this.f8511a;
    }

    @Override // nd.k
    public List<nd.b0> o() {
        Object[] j10;
        Object[] j11;
        List<nd.b0> h10;
        Type[] genericParameterTypes = a0().getGenericParameterTypes();
        hc.t.d(genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            h10 = ub.u.h();
            return h10;
        }
        Class<?> declaringClass = a0().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            j11 = ub.l.j(genericParameterTypes, 1, genericParameterTypes.length);
            genericParameterTypes = (Type[]) j11;
        }
        Annotation[][] parameterAnnotations = a0().getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new IllegalStateException("Illegal generic signature: " + a0());
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            hc.t.d(parameterAnnotations, "annotations");
            j10 = ub.l.j(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
            parameterAnnotations = (Annotation[][]) j10;
        }
        hc.t.d(genericParameterTypes, "realTypes");
        hc.t.d(parameterAnnotations, "realAnnotations");
        return b0(genericParameterTypes, parameterAnnotations, a0().isVarArgs());
    }

    @Override // nd.z
    public List<a0> p() {
        TypeVariable<Constructor<?>>[] typeParameters = a0().getTypeParameters();
        hc.t.d(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new a0(typeVariable));
        }
        return arrayList;
    }
}
