package dd;

import dd.z;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import nd.r;
/* loaded from: classes.dex */
public final class u extends t implements nd.r {

    /* renamed from: a */
    private final Method f8515a;

    public u(Method method) {
        hc.t.e(method, "member");
        this.f8515a = method;
    }

    @Override // nd.r
    public nd.b F() {
        Object defaultValue = a0().getDefaultValue();
        if (defaultValue != null) {
            return f.f8496b.a(defaultValue, null);
        }
        return null;
    }

    @Override // nd.r
    public boolean N() {
        return r.a.a(this);
    }

    /* renamed from: c0 */
    public Method a0() {
        return this.f8515a;
    }

    /* renamed from: d0 */
    public z e() {
        z.a aVar = z.f8521a;
        Type genericReturnType = a0().getGenericReturnType();
        hc.t.d(genericReturnType, "member.genericReturnType");
        return aVar.a(genericReturnType);
    }

    @Override // nd.r
    public List<nd.b0> o() {
        Type[] genericParameterTypes = a0().getGenericParameterTypes();
        hc.t.d(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = a0().getParameterAnnotations();
        hc.t.d(parameterAnnotations, "member.parameterAnnotations");
        return b0(genericParameterTypes, parameterAnnotations, a0().isVarArgs());
    }

    @Override // nd.z
    public List<a0> p() {
        TypeVariable<Method>[] typeParameters = a0().getTypeParameters();
        hc.t.d(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new a0(typeVariable));
        }
        return arrayList;
    }
}
