package sc;

import gc.l;
import hc.t;
import hc.v;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import rc.b0;
import ub.c0;
import ub.m;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001a$\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001aK\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016²\u0006\u0016\u0010\u0014\u001a\u00020\u0004\"\b\b\u0000\u0010\u000b*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0016\u0010\u0015\u001a\u00020\u0006\"\b\b\u0000\u0010\u000b*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {BuildConfig.FLAVOR, "Ljava/lang/Class;", "expectedType", "l", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "name", "expectedJvmType", BuildConfig.FLAVOR, "k", "T", "annotationClass", BuildConfig.FLAVOR, "values", BuildConfig.FLAVOR, "Ljava/lang/reflect/Method;", "methods", "f", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "hashCode", "toString", "kotlin-reflection"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<Integer> {

        /* renamed from: c */
        final /* synthetic */ Map<String, Object> f21624c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Map<String, ? extends Object> map) {
            super(0);
            this.f21624c = map;
        }

        /* renamed from: b */
        public final Integer invoke() {
            Iterator<T> it = this.f21624c.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                i10 += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
            }
            return Integer.valueOf(i10);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00012\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062,\u0010\u0007\u001a(\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\b0\bH\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "kotlin.jvm.PlatformType", "T", "<anonymous parameter 0>", "method", "Ljava/lang/reflect/Method;", "args", BuildConfig.FLAVOR, "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: sc.b$b */
    /* loaded from: classes.dex */
    public static final class C0364b implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ Class<T> f21625a;

        /* renamed from: b */
        final /* synthetic */ Map<String, Object> f21626b;

        /* renamed from: c */
        final /* synthetic */ Lazy<String> f21627c;

        /* renamed from: d */
        final /* synthetic */ Lazy<Integer> f21628d;

        /* renamed from: e */
        final /* synthetic */ List<Method> f21629e;

        C0364b(Class<T> cls, Map<String, ? extends Object> map, Lazy<String> lazy, Lazy<Integer> lazy2, List<Method> list) {
            this.f21625a = cls;
            this.f21626b = map;
            this.f21627c = lazy;
            this.f21628d = lazy2;
            this.f21629e = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            List i02;
            Object U;
            String name = method.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != -1776922004) {
                    if (hashCode != 147696667) {
                        if (hashCode == 1444986633 && name.equals("annotationType")) {
                            return this.f21625a;
                        }
                    } else if (name.equals("hashCode")) {
                        return Integer.valueOf(b.i(this.f21628d));
                    }
                } else if (name.equals("toString")) {
                    return b.j(this.f21627c);
                }
            }
            if (t.a(name, "equals")) {
                boolean z10 = true;
                if (objArr == null || objArr.length != 1) {
                    z10 = false;
                }
                if (z10) {
                    Class<T> cls = this.f21625a;
                    List<Method> list = this.f21629e;
                    Map<String, Object> map = this.f21626b;
                    t.d(objArr, "args");
                    U = m.U(objArr);
                    return Boolean.valueOf(b.h(cls, list, map, U));
                }
            }
            if (this.f21626b.containsKey(name)) {
                return this.f21626b.get(name);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Method is not supported: ");
            sb2.append(method);
            sb2.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            i02 = m.i0(objArr);
            sb2.append(i02);
            sb2.append(')');
            throw new b0(sb2.toString());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.a<String> {

        /* renamed from: c */
        final /* synthetic */ Class<T> f21630c;

        /* renamed from: d */
        final /* synthetic */ Map<String, Object> f21631d;

        @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "entry", BuildConfig.FLAVOR, "b", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class a extends v implements l<Map.Entry<? extends String, ? extends Object>, CharSequence> {

            /* renamed from: c */
            public static final a f21632c = new a();

            a() {
                super(1);
            }

            /* renamed from: b */
            public final CharSequence invoke(Map.Entry<String, ? extends Object> entry) {
                String str;
                t.e(entry, "entry");
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    str = Arrays.toString((boolean[]) value);
                } else if (value instanceof char[]) {
                    str = Arrays.toString((char[]) value);
                } else if (value instanceof byte[]) {
                    str = Arrays.toString((byte[]) value);
                } else if (value instanceof short[]) {
                    str = Arrays.toString((short[]) value);
                } else if (value instanceof int[]) {
                    str = Arrays.toString((int[]) value);
                } else if (value instanceof float[]) {
                    str = Arrays.toString((float[]) value);
                } else if (value instanceof long[]) {
                    str = Arrays.toString((long[]) value);
                } else if (value instanceof double[]) {
                    str = Arrays.toString((double[]) value);
                } else if (!(value instanceof Object[])) {
                    str = value.toString();
                    return key + '=' + str;
                } else {
                    str = Arrays.toString((Object[]) value);
                }
                t.d(str, "toString(this)");
                return key + '=' + str;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Class<T> cls, Map<String, ? extends Object> map) {
            super(0);
            this.f21630c = cls;
            this.f21631d = map;
        }

        /* renamed from: b */
        public final String invoke() {
            Class<T> cls = this.f21630c;
            Map<String, Object> map = this.f21631d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('@');
            sb2.append(cls.getCanonicalName());
            c0.c0(map.entrySet(), sb2, ", ", "(", ")", 0, null, a.f21632c, 48, null);
            String sb3 = sb2.toString();
            t.d(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
    }

    public static final <T> T f(Class<T> cls, Map<String, ? extends Object> map, List<Method> list) {
        Lazy a10;
        Lazy a11;
        t.e(cls, "annotationClass");
        t.e(map, "values");
        t.e(list, "methods");
        a10 = tb.m.a(new a(map));
        a11 = tb.m.a(new c(cls, map));
        T t10 = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0364b(cls, map, a11, a10, list));
        t.c(t10, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return t10;
    }

    public static /* synthetic */ Object g(Class cls, Map map, List list, int i10, Object obj) {
        int s10;
        if ((i10 & 4) != 0) {
            Set<String> keySet = map.keySet();
            s10 = ub.v.s(keySet, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (String str : keySet) {
                arrayList.add(cls.getDeclaredMethod(str, new Class[0]));
            }
            list = arrayList;
        }
        return f(cls, map, list);
    }

    public static final <T> boolean h(Class<T> cls, List<Method> list, Map<String, ? extends Object> map, Object obj) {
        boolean z10;
        boolean z11;
        oc.d a10;
        Class cls2 = null;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (annotation != null && (a10 = fc.a.a(annotation)) != null) {
            cls2 = fc.a.b(a10);
        }
        if (t.a(cls2, cls)) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Method method : list) {
                    Object obj2 = map.get(method.getName());
                    Object invoke = method.invoke(obj, new Object[0]);
                    if (obj2 instanceof boolean[]) {
                        t.c(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        z11 = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                        continue;
                    } else if (obj2 instanceof char[]) {
                        t.c(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                        z11 = Arrays.equals((char[]) obj2, (char[]) invoke);
                        continue;
                    } else if (obj2 instanceof byte[]) {
                        t.c(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        z11 = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                        continue;
                    } else if (obj2 instanceof short[]) {
                        t.c(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        z11 = Arrays.equals((short[]) obj2, (short[]) invoke);
                        continue;
                    } else if (obj2 instanceof int[]) {
                        t.c(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                        z11 = Arrays.equals((int[]) obj2, (int[]) invoke);
                        continue;
                    } else if (obj2 instanceof float[]) {
                        t.c(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        z11 = Arrays.equals((float[]) obj2, (float[]) invoke);
                        continue;
                    } else if (obj2 instanceof long[]) {
                        t.c(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                        z11 = Arrays.equals((long[]) obj2, (long[]) invoke);
                        continue;
                    } else if (obj2 instanceof double[]) {
                        t.c(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        z11 = Arrays.equals((double[]) obj2, (double[]) invoke);
                        continue;
                    } else if (obj2 instanceof Object[]) {
                        t.c(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        z11 = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                        continue;
                    } else {
                        z11 = t.a(obj2, invoke);
                        continue;
                    }
                    if (!z11) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public static final int i(Lazy<Integer> lazy) {
        return lazy.getValue().intValue();
    }

    public static final String j(Lazy<String> lazy) {
        return lazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Void k(int r3, java.lang.String r4, java.lang.Class<?> r5) {
        /*
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            boolean r0 = hc.t.a(r5, r0)
            if (r0 == 0) goto Lf
            java.lang.Class<oc.d> r5 = oc.d.class
        La:
            oc.d r5 = hc.k0.b(r5)
            goto L28
        Lf:
            boolean r0 = r5.isArray()
            if (r0 == 0) goto L24
            java.lang.Class r0 = r5.getComponentType()
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            boolean r0 = hc.t.a(r0, r1)
            if (r0 == 0) goto L24
            java.lang.Class<oc.d[]> r5 = oc.d[].class
            goto La
        L24:
            oc.d r5 = fc.a.e(r5)
        L28:
            java.lang.String r0 = r5.y()
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            oc.d r1 = hc.k0.b(r1)
            java.lang.String r1 = r1.y()
            boolean r0 = hc.t.a(r0, r1)
            if (r0 == 0) goto L6f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.y()
            r0.append(r1)
            r1 = 60
            r0.append(r1)
            java.lang.Class r5 = fc.a.b(r5)
            java.lang.Class r5 = r5.getComponentType()
            java.lang.String r1 = "kotlinClass.java.componentType"
            hc.t.d(r5, r1)
            oc.d r5 = fc.a.e(r5)
            java.lang.String r5 = r5.y()
            r0.append(r5)
            r5 = 62
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            goto L73
        L6f:
            java.lang.String r5 = r5.y()
        L73:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Argument #"
            r1.append(r2)
            r1.append(r3)
            r3 = 32
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = " is not of the required type "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.b.k(int, java.lang.String, java.lang.Class):java.lang.Void");
    }

    public static final Object l(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof oc.d) {
            obj = fc.a.b((oc.d) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof oc.d[]) {
                t.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                oc.d[] dVarArr = (oc.d[]) obj;
                ArrayList arrayList = new ArrayList(dVarArr.length);
                for (oc.d dVar : dVarArr) {
                    arrayList.add(fc.a.b(dVar));
                }
                obj = arrayList.toArray(new Class[0]);
                t.c(obj, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            } else {
                obj = objArr;
            }
        }
        if (!cls.isInstance(obj)) {
            return null;
        }
        return obj;
    }
}
