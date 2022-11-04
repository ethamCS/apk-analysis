package dd;

import hc.k0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ub.q0;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private static final List<oc.d<? extends Object>> f8489a;

    /* renamed from: b */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f8490b;

    /* renamed from: c */
    private static final Map<Class<? extends Object>, Class<? extends Object>> f8491c;

    /* renamed from: d */
    private static final Map<Class<? extends tb.g<?>>, Integer> f8492d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<ParameterizedType, ParameterizedType> {

        /* renamed from: c */
        public static final a f8493c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final ParameterizedType invoke(ParameterizedType parameterizedType) {
            hc.t.e(parameterizedType, "it");
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.l<ParameterizedType, af.h<? extends Type>> {

        /* renamed from: c */
        public static final b f8494c = new b();

        b() {
            super(1);
        }

        /* renamed from: b */
        public final af.h<Type> invoke(ParameterizedType parameterizedType) {
            af.h<Type> t10;
            hc.t.e(parameterizedType, "it");
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            hc.t.d(actualTypeArguments, "it.actualTypeArguments");
            t10 = ub.m.t(actualTypeArguments);
            return t10;
        }
    }

    static {
        List<oc.d<? extends Object>> k10;
        int s10;
        Map<Class<? extends Object>, Class<? extends Object>> q10;
        int s11;
        Map<Class<? extends Object>, Class<? extends Object>> q11;
        List k11;
        int s12;
        Map<Class<? extends tb.g<?>>, Integer> q12;
        int i10 = 0;
        k10 = ub.u.k(k0.b(Boolean.TYPE), k0.b(Byte.TYPE), k0.b(Character.TYPE), k0.b(Double.TYPE), k0.b(Float.TYPE), k0.b(Integer.TYPE), k0.b(Long.TYPE), k0.b(Short.TYPE));
        f8489a = k10;
        s10 = ub.v.s(k10, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator<T> it = k10.iterator();
        while (it.hasNext()) {
            oc.d dVar = (oc.d) it.next();
            arrayList.add(tb.x.a(fc.a.c(dVar), fc.a.d(dVar)));
        }
        q10 = q0.q(arrayList);
        f8490b = q10;
        List<oc.d<? extends Object>> list = f8489a;
        s11 = ub.v.s(list, 10);
        ArrayList arrayList2 = new ArrayList(s11);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            oc.d dVar2 = (oc.d) it2.next();
            arrayList2.add(tb.x.a(fc.a.d(dVar2), fc.a.c(dVar2)));
        }
        q11 = q0.q(arrayList2);
        f8491c = q11;
        k11 = ub.u.k(gc.a.class, gc.l.class, gc.p.class, gc.q.class, gc.r.class, gc.s.class, gc.t.class, gc.u.class, gc.v.class, gc.w.class, gc.b.class, gc.c.class, gc.d.class, gc.e.class, gc.f.class, gc.g.class, gc.h.class, gc.i.class, gc.j.class, gc.k.class, gc.m.class, gc.n.class, gc.o.class);
        s12 = ub.v.s(k11, 10);
        ArrayList arrayList3 = new ArrayList(s12);
        for (Object obj : k11) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ub.u.r();
            }
            arrayList3.add(tb.x.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        q12 = q0.q(arrayList3);
        f8492d = q12;
    }

    public static final wd.b a(Class<?> cls) {
        wd.b bVar;
        wd.b a10;
        hc.t.e(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        } else if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        } else {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                String simpleName = cls.getSimpleName();
                hc.t.d(simpleName, "simpleName");
                if (!(simpleName.length() == 0)) {
                    Class<?> declaringClass = cls.getDeclaringClass();
                    if (declaringClass == null || (a10 = a(declaringClass)) == null || (bVar = a10.d(wd.f.j(cls.getSimpleName()))) == null) {
                        bVar = wd.b.m(new wd.c(cls.getName()));
                    }
                    hc.t.d(bVar, "declaringClass?.classId?…Id.topLevel(FqName(name))");
                    return bVar;
                }
            }
            wd.c cVar = new wd.c(cls.getName());
            return new wd.b(cVar.e(), wd.c.k(cVar.g()), true);
        }
    }

    public static final String b(Class<?> cls) {
        String D;
        String D2;
        hc.t.e(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                hc.t.d(name, "name");
                D2 = bf.x.D(name, '.', '/', false, 4, null);
                return D2;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('L');
            String name2 = cls.getName();
            hc.t.d(name2, "name");
            D = bf.x.D(name2, '.', '/', false, 4, null);
            sb2.append(D);
            sb2.append(';');
            return sb2.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final Integer c(Class<?> cls) {
        hc.t.e(cls, "<this>");
        return f8492d.get(cls);
    }

    public static final List<Type> d(Type type) {
        af.h k10;
        af.h u10;
        List<Type> F;
        List<Type> i02;
        List<Type> h10;
        hc.t.e(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            h10 = ub.u.h();
            return h10;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() == null) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            hc.t.d(actualTypeArguments, "actualTypeArguments");
            i02 = ub.m.i0(actualTypeArguments);
            return i02;
        }
        k10 = af.n.k(type, a.f8493c);
        u10 = af.p.u(k10, b.f8494c);
        F = af.p.F(u10);
        return F;
    }

    public static final Class<?> e(Class<?> cls) {
        hc.t.e(cls, "<this>");
        return f8490b.get(cls);
    }

    public static final ClassLoader f(Class<?> cls) {
        hc.t.e(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            hc.t.d(systemClassLoader, "getSystemClassLoader()");
            return systemClassLoader;
        }
        return classLoader;
    }

    public static final Class<?> g(Class<?> cls) {
        hc.t.e(cls, "<this>");
        return f8491c.get(cls);
    }

    public static final boolean h(Class<?> cls) {
        hc.t.e(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
