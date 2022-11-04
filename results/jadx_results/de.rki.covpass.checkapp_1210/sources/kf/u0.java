package kf;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\u001a$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u001aM\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0005*\u0004\u0018\u00018\u0000*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0010\u0010\r\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u0002H\u0000\u001a\u0010\u0010\u000f\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u000eH\u0000\u001aO\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0010\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\t\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aO\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\"\u0010\u0010\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\t\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0016\u001a\u00020\u0015\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002\u001a$\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002\u001a$\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002\u001aQ\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u000e2\"\u0010\u0010\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00030\t\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u0014\u001a\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0000*\u0006\u0012\u0002\b\u00030\u000eH\u0002\u001a$\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002\u001a$\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002\u001a\u0018\u0010\u001f\u001a\u00020\u0015*\u00020\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000\u001a\u0016\u0010!\u001a\u00020\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0000¨\u0006\""}, d2 = {BuildConfig.FLAVOR, "T", "Loc/d;", "Lkotlinx/serialization/KSerializer;", "b", "E", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "eClass", BuildConfig.FLAVOR, "o", "(Ljava/util/ArrayList;Loc/d;)[Ljava/lang/Object;", BuildConfig.FLAVOR, "l", "Ljava/lang/Class;", "n", "args", "d", "(Loc/d;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "c", "(Ljava/lang/Class;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", BuildConfig.FLAVOR, "j", "m", "g", "jClass", "h", "a", "e", "f", "kclass", "i", "rootClass", "k", "kotlinx-serialization-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class u0 {
    private static final Object a(Class<?> cls) {
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> KSerializer<T> b(oc.d<T> dVar) {
        hc.t.e(dVar, "<this>");
        return d(dVar, new KSerializer[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        if (r3 == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> kotlinx.serialization.KSerializer<T> c(java.lang.Class<T> r8, kotlinx.serialization.KSerializer<java.lang.Object>... r9) {
        /*
            java.lang.String r0 = "<this>"
            hc.t.e(r8, r0)
            java.lang.String r0 = "args"
            hc.t.e(r9, r0)
            boolean r0 = r8.isEnum()
            if (r0 == 0) goto L1b
            boolean r0 = j(r8)
            if (r0 == 0) goto L1b
            kotlinx.serialization.KSerializer r8 = e(r8)
            return r8
        L1b:
            boolean r0 = r8.isInterface()
            if (r0 == 0) goto L26
            kotlinx.serialization.KSerializer r8 = g(r8)
            return r8
        L26:
            int r0 = r9.length
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r0)
            kotlinx.serialization.KSerializer[] r9 = (kotlinx.serialization.KSerializer[]) r9
            kotlinx.serialization.KSerializer r9 = h(r8, r9)
            if (r9 == 0) goto L34
            return r9
        L34:
            kotlinx.serialization.KSerializer r9 = f(r8)
            if (r9 == 0) goto L3b
            return r9
        L3b:
            r9 = 0
            java.lang.Class[] r0 = r8.getDeclaredClasses()     // Catch: java.lang.NoSuchFieldException -> L7d
            java.lang.String r1 = "declaredClasses"
            hc.t.d(r0, r1)     // Catch: java.lang.NoSuchFieldException -> L7d
            int r1 = r0.length     // Catch: java.lang.NoSuchFieldException -> L7d
            r2 = 0
            r4 = r9
            r3 = r2
        L49:
            if (r2 >= r1) goto L61
            r5 = r0[r2]     // Catch: java.lang.NoSuchFieldException -> L7d
            java.lang.String r6 = r5.getSimpleName()     // Catch: java.lang.NoSuchFieldException -> L7d
            java.lang.String r7 = "$serializer"
            boolean r6 = hc.t.a(r6, r7)     // Catch: java.lang.NoSuchFieldException -> L7d
            if (r6 == 0) goto L5e
            if (r3 == 0) goto L5c
            goto L63
        L5c:
            r3 = 1
            r4 = r5
        L5e:
            int r2 = r2 + 1
            goto L49
        L61:
            if (r3 != 0) goto L64
        L63:
            r4 = r9
        L64:
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.NoSuchFieldException -> L7d
            if (r4 == 0) goto L75
            java.lang.String r0 = "INSTANCE"
            java.lang.reflect.Field r0 = r4.getField(r0)     // Catch: java.lang.NoSuchFieldException -> L7d
            if (r0 == 0) goto L75
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.NoSuchFieldException -> L7d
            goto L76
        L75:
            r0 = r9
        L76:
            boolean r1 = r0 instanceof kotlinx.serialization.KSerializer     // Catch: java.lang.NoSuchFieldException -> L7d
            if (r1 == 0) goto L7d
            kotlinx.serialization.KSerializer r0 = (kotlinx.serialization.KSerializer) r0     // Catch: java.lang.NoSuchFieldException -> L7d
            r9 = r0
        L7d:
            if (r9 == 0) goto L80
            return r9
        L80:
            kotlinx.serialization.KSerializer r8 = m(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.u0.c(java.lang.Class, kotlinx.serialization.KSerializer[]):kotlinx.serialization.KSerializer");
    }

    public static final <T> KSerializer<T> d(oc.d<T> dVar, KSerializer<Object>... kSerializerArr) {
        hc.t.e(dVar, "<this>");
        hc.t.e(kSerializerArr, "args");
        return c(fc.a.b(dVar), (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    private static final <T> KSerializer<T> e(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        hc.t.d(canonicalName, "canonicalName");
        Objects.requireNonNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new s(canonicalName, (Enum[]) enumConstants);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r5 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
        if (r5 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0096, code lost:
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final <T> kotlinx.serialization.KSerializer<T> f(java.lang.Class<T> r11) {
        /*
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r1 = "declaredFields"
            hc.t.d(r0, r1)
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r4
            r6 = r3
        Lf:
            r7 = 1
            if (r4 >= r1) goto L41
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = hc.t.a(r9, r10)
            if (r9 == 0) goto L36
            java.lang.Class r9 = r8.getType()
            boolean r9 = hc.t.a(r9, r11)
            if (r9 == 0) goto L36
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L36
            r9 = r7
            goto L37
        L36:
            r9 = r2
        L37:
            if (r9 == 0) goto L3e
            if (r5 == 0) goto L3c
            goto L43
        L3c:
            r5 = r7
            r6 = r8
        L3e:
            int r4 = r4 + 1
            goto Lf
        L41:
            if (r5 != 0) goto L44
        L43:
            r6 = r3
        L44:
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            if (r6 != 0) goto L49
            return r3
        L49:
            java.lang.Object r0 = r6.get(r3)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            java.lang.String r1 = "methods"
            hc.t.d(r11, r1)
            int r1 = r11.length
            r4 = r2
            r5 = r4
            r6 = r3
        L5a:
            if (r4 >= r1) goto L94
            r8 = r11[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "serializer"
            boolean r9 = hc.t.a(r9, r10)
            if (r9 == 0) goto L89
            java.lang.Class[] r9 = r8.getParameterTypes()
            java.lang.String r10 = "it.parameterTypes"
            hc.t.d(r9, r10)
            int r9 = r9.length
            if (r9 != 0) goto L78
            r9 = r7
            goto L79
        L78:
            r9 = r2
        L79:
            if (r9 == 0) goto L89
            java.lang.Class r9 = r8.getReturnType()
            java.lang.Class<kotlinx.serialization.KSerializer> r10 = kotlinx.serialization.KSerializer.class
            boolean r9 = hc.t.a(r9, r10)
            if (r9 == 0) goto L89
            r9 = r7
            goto L8a
        L89:
            r9 = r2
        L8a:
            if (r9 == 0) goto L91
            if (r5 == 0) goto L8f
            goto L96
        L8f:
            r5 = r7
            r6 = r8
        L91:
            int r4 = r4 + 1
            goto L5a
        L94:
            if (r5 != 0) goto L97
        L96:
            r6 = r3
        L97:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 != 0) goto L9c
            return r3
        L9c:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Object r11 = r6.invoke(r0, r11)
            boolean r0 = r11 instanceof kotlinx.serialization.KSerializer
            if (r0 == 0) goto La9
            r3 = r11
            kotlinx.serialization.KSerializer r3 = (kotlinx.serialization.KSerializer) r3
        La9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.u0.f(java.lang.Class):kotlinx.serialization.KSerializer");
    }

    private static final <T> KSerializer<T> g(Class<T> cls) {
        kotlinx.serialization.h hVar = (kotlinx.serialization.h) cls.getAnnotation(kotlinx.serialization.h.class);
        if (hVar == null || hc.t.a(hc.k0.b(hVar.with()), hc.k0.b(kotlinx.serialization.e.class))) {
            return new kotlinx.serialization.e(fc.a.e(cls));
        }
        return null;
    }

    private static final <T> KSerializer<T> h(Class<?> cls, KSerializer<Object>... kSerializerArr) {
        Class[] clsArr;
        Object a10 = a(cls);
        if (a10 == null) {
            return null;
        }
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = a10.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(a10, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (!(invoke instanceof KSerializer)) {
                return null;
            }
            return (KSerializer) invoke;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                throw e10;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e10.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean i(Object obj, oc.d<?> dVar) {
        hc.t.e(obj, "<this>");
        hc.t.e(dVar, "kclass");
        return fc.a.c(dVar).isInstance(obj);
    }

    private static final <T> boolean j(Class<T> cls) {
        return cls.getAnnotation(kotlinx.serialization.h.class) == null && cls.getAnnotation(kotlinx.serialization.d.class) == null;
    }

    public static final boolean k(oc.d<Object> dVar) {
        hc.t.e(dVar, "rootClass");
        return fc.a.b(dVar).isArray();
    }

    public static final Void l(oc.d<?> dVar) {
        hc.t.e(dVar, "<this>");
        v0.d(dVar);
        throw new tb.i();
    }

    private static final <T> KSerializer<T> m(Class<T> cls) {
        if (cls.getAnnotation(kotlinx.serialization.d.class) != null) {
            return new kotlinx.serialization.e(fc.a.e(cls));
        }
        kotlinx.serialization.h hVar = (kotlinx.serialization.h) cls.getAnnotation(kotlinx.serialization.h.class);
        if (hVar != null && hc.t.a(hc.k0.b(hVar.with()), hc.k0.b(kotlinx.serialization.e.class))) {
            return new kotlinx.serialization.e(fc.a.e(cls));
        }
        return null;
    }

    public static final Void n(Class<?> cls) {
        hc.t.e(cls, "<this>");
        throw new kotlinx.serialization.i("Serializer for class '" + cls.getSimpleName() + "' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
    }

    public static final <T, E extends T> E[] o(ArrayList<E> arrayList, oc.d<T> dVar) {
        hc.t.e(arrayList, "<this>");
        hc.t.e(dVar, "eClass");
        Object newInstance = Array.newInstance(fc.a.b(dVar), arrayList.size());
        Objects.requireNonNull(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) newInstance);
        hc.t.d(eArr, "toArray(java.lang.reflec….java, size) as Array<E>)");
        return eArr;
    }
}
