package cd;

import hc.t;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import pd.q;
import uc.k;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static final c f6432a = new c();

    private c() {
    }

    private final ce.f a(Class<?> cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
            t.d(cls, "currentClass.componentType");
        }
        if (!cls.isPrimitive()) {
            wd.b a10 = dd.d.a(cls);
            wc.c cVar = wc.c.f24707a;
            wd.c b10 = a10.b();
            t.d(b10, "javaClassId.asSingleFqName()");
            wd.b m10 = cVar.m(b10);
            if (m10 != null) {
                a10 = m10;
            }
            return new ce.f(a10, i10);
        } else if (t.a(cls, Void.TYPE)) {
            wd.b m11 = wd.b.m(k.a.f23475f.l());
            t.d(m11, "topLevel(StandardNames.FqNames.unit.toSafe())");
            return new ce.f(m11, i10);
        } else {
            uc.i r10 = fe.e.g(cls.getName()).r();
            t.d(r10, "get(currentClass.name).primitiveType");
            if (i10 > 0) {
                wd.b m12 = wd.b.m(r10.g());
                t.d(m12, "topLevel(primitiveType.arrayTypeFqName)");
                return new ce.f(m12, i10 - 1);
            }
            wd.b m13 = wd.b.m(r10.j());
            t.d(m13, "topLevel(primitiveType.typeFqName)");
            return new ce.f(m13, i10);
        }
    }

    private final void c(Class<?> cls, q.d dVar) {
        int i10;
        Constructor<?>[] constructorArr;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        t.d(declaredConstructors, "klass.declaredConstructors");
        int length = declaredConstructors.length;
        int i11 = 0;
        while (i11 < length) {
            Constructor<?> constructor = declaredConstructors[i11];
            wd.f fVar = wd.h.f24819i;
            m mVar = m.f6445a;
            t.d(constructor, "constructor");
            q.e b10 = dVar.b(fVar, mVar.a(constructor));
            if (b10 == null) {
                constructorArr = declaredConstructors;
                i10 = length;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                t.d(declaredAnnotations, "constructor.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    t.d(annotation, "annotation");
                    f(b10, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                t.d(parameterAnnotations, "parameterAnnotations");
                if (!(parameterAnnotations.length == 0)) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i12 = 0; i12 < length3; i12++) {
                        Annotation[] annotationArr = parameterAnnotations[i12];
                        t.d(annotationArr, "annotations");
                        int length4 = annotationArr.length;
                        int i13 = 0;
                        while (i13 < length4) {
                            Annotation annotation2 = annotationArr[i13];
                            Class<?> b11 = fc.a.b(fc.a.a(annotation2));
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            int i14 = length;
                            wd.b a10 = dd.d.a(b11);
                            int i15 = length2;
                            t.d(annotation2, "annotation");
                            q.a b12 = b10.b(i12 + length2, a10, new b(annotation2));
                            if (b12 != null) {
                                f6432a.h(b12, annotation2, b11);
                            }
                            i13++;
                            declaredConstructors = constructorArr2;
                            length = i14;
                            length2 = i15;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i10 = length;
                b10.a();
            }
            i11++;
            declaredConstructors = constructorArr;
            length = i10;
        }
    }

    private final void d(Class<?> cls, q.d dVar) {
        Field[] declaredFields = cls.getDeclaredFields();
        t.d(declaredFields, "klass.declaredFields");
        for (Field field : declaredFields) {
            wd.f j10 = wd.f.j(field.getName());
            t.d(j10, "identifier(field.name)");
            m mVar = m.f6445a;
            t.d(field, "field");
            q.c a10 = dVar.a(j10, mVar.b(field), null);
            if (a10 != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                t.d(declaredAnnotations, "field.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    t.d(annotation, "annotation");
                    f(a10, annotation);
                }
                a10.a();
            }
        }
    }

    private final void e(Class<?> cls, q.d dVar) {
        Method[] methodArr;
        Method[] declaredMethods = cls.getDeclaredMethods();
        t.d(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i10 = 0;
        while (i10 < length) {
            Method method = declaredMethods[i10];
            wd.f j10 = wd.f.j(method.getName());
            t.d(j10, "identifier(method.name)");
            m mVar = m.f6445a;
            t.d(method, "method");
            q.e b10 = dVar.b(j10, mVar.c(method));
            if (b10 == null) {
                methodArr = declaredMethods;
            } else {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                t.d(declaredAnnotations, "method.declaredAnnotations");
                for (Annotation annotation : declaredAnnotations) {
                    t.d(annotation, "annotation");
                    f(b10, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                t.d(parameterAnnotations, "method.parameterAnnotations");
                Annotation[][] annotationArr = parameterAnnotations;
                int length2 = annotationArr.length;
                for (int i11 = 0; i11 < length2; i11++) {
                    Annotation[] annotationArr2 = annotationArr[i11];
                    t.d(annotationArr2, "annotations");
                    int length3 = annotationArr2.length;
                    int i12 = 0;
                    while (i12 < length3) {
                        Annotation annotation2 = annotationArr2[i12];
                        Class<?> b11 = fc.a.b(fc.a.a(annotation2));
                        wd.b a10 = dd.d.a(b11);
                        Method[] methodArr2 = declaredMethods;
                        t.d(annotation2, "annotation");
                        q.a b12 = b10.b(i11, a10, new b(annotation2));
                        if (b12 != null) {
                            f6432a.h(b12, annotation2, b11);
                        }
                        i12++;
                        declaredMethods = methodArr2;
                    }
                }
                methodArr = declaredMethods;
                b10.a();
            }
            i10++;
            declaredMethods = methodArr;
        }
    }

    private final void f(q.c cVar, Annotation annotation) {
        Class<?> b10 = fc.a.b(fc.a.a(annotation));
        q.a c10 = cVar.c(dd.d.a(b10), new b(annotation));
        if (c10 != null) {
            f6432a.h(c10, annotation, b10);
        }
    }

    private final void g(q.a aVar, wd.f fVar, Object obj) {
        Set set;
        Object U;
        Class<?> cls = obj.getClass();
        if (t.a(cls, Class.class)) {
            t.c(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            aVar.b(fVar, a((Class) obj));
            return;
        }
        set = i.f6439a;
        if (set.contains(cls)) {
            aVar.c(fVar, obj);
        } else if (dd.d.h(cls)) {
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            t.d(cls, "if (clazz.isEnum) clazz else clazz.enclosingClass");
            wd.b a10 = dd.d.a(cls);
            t.c(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            wd.f j10 = wd.f.j(((Enum) obj).name());
            t.d(j10, "identifier((value as Enum<*>).name)");
            aVar.d(fVar, a10, j10);
        } else if (Annotation.class.isAssignableFrom(cls)) {
            Class<?>[] interfaces = cls.getInterfaces();
            t.d(interfaces, "clazz.interfaces");
            U = ub.m.U(interfaces);
            Class<?> cls2 = (Class) U;
            t.d(cls2, "annotationClass");
            q.a e10 = aVar.e(fVar, dd.d.a(cls2));
            if (e10 == null) {
                return;
            }
            t.c(obj, "null cannot be cast to non-null type kotlin.Annotation");
            h(e10, (Annotation) obj, cls2);
        } else if (!cls.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls + "): " + obj);
        } else {
            q.b f10 = aVar.f(fVar);
            if (f10 == null) {
                return;
            }
            Class<?> componentType = cls.getComponentType();
            int i10 = 0;
            if (componentType.isEnum()) {
                t.d(componentType, "componentType");
                wd.b a11 = dd.d.a(componentType);
                t.c(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                while (i10 < length) {
                    Object obj2 = objArr[i10];
                    t.c(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                    wd.f j11 = wd.f.j(((Enum) obj2).name());
                    t.d(j11, "identifier((element as Enum<*>).name)");
                    f10.b(a11, j11);
                    i10++;
                }
            } else if (t.a(componentType, Class.class)) {
                t.c(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                Object[] objArr2 = (Object[]) obj;
                int length2 = objArr2.length;
                while (i10 < length2) {
                    Object obj3 = objArr2[i10];
                    t.c(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                    f10.c(a((Class) obj3));
                    i10++;
                }
            } else {
                boolean isAssignableFrom = Annotation.class.isAssignableFrom(componentType);
                t.c(obj, "null cannot be cast to non-null type kotlin.Array<*>");
                Object[] objArr3 = (Object[]) obj;
                if (isAssignableFrom) {
                    int length3 = objArr3.length;
                    while (i10 < length3) {
                        Object obj4 = objArr3[i10];
                        t.d(componentType, "componentType");
                        q.a e11 = f10.e(dd.d.a(componentType));
                        if (e11 != null) {
                            t.c(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                            h(e11, (Annotation) obj4, componentType);
                        }
                        i10++;
                    }
                } else {
                    int length4 = objArr3.length;
                    while (i10 < length4) {
                        f10.d(objArr3[i10]);
                        i10++;
                    }
                }
            }
            f10.a();
        }
    }

    private final void h(q.a aVar, Annotation annotation, Class<?> cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        t.d(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                t.b(invoke);
                wd.f j10 = wd.f.j(method.getName());
                t.d(j10, "identifier(method.name)");
                g(aVar, j10, invoke);
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }

    public final void b(Class<?> cls, q.c cVar) {
        t.e(cls, "klass");
        t.e(cVar, "visitor");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        t.d(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            t.d(annotation, "annotation");
            f(cVar, annotation);
        }
        cVar.a();
    }

    public final void i(Class<?> cls, q.d dVar) {
        t.e(cls, "klass");
        t.e(dVar, "memberVisitor");
        e(cls, dVar);
        c(cls, dVar);
        d(cls, dVar);
    }
}
