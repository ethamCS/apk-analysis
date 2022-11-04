package kotlinx.serialization;

import hc.k0;
import hc.t;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kf.e1;
import kf.u0;
import kotlin.Metadata;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.conscrypt.BuildConfig;
import tb.r;
import tb.w;
import ub.m;
import ub.u;
import ub.v;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a-\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\r\u001aI\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\b\b\u0000\u0010\u000e*\u00020\u0003*\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u000b*\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ljava/lang/reflect/Type;", "type", "Lkotlinx/serialization/KSerializer;", BuildConfig.FLAVOR, "serializer", "Lnf/d;", "f", BuildConfig.FLAVOR, "failOnMissingTypeArgSerializer", "d", "(Lnf/d;Ljava/lang/reflect/Type;Z)Lkotlinx/serialization/KSerializer;", "Ljava/lang/Class;", "g", "(Lnf/d;Ljava/lang/Class;Z)Lkotlinx/serialization/KSerializer;", "T", "jClass", BuildConfig.FLAVOR, "typeArgumentsSerializers", "c", "(Lnf/d;Ljava/lang/Class;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "Ljava/lang/reflect/GenericArrayType;", "a", "(Lnf/d;Ljava/lang/reflect/GenericArrayType;Z)Lkotlinx/serialization/KSerializer;", "b", "(Ljava/lang/reflect/Type;)Ljava/lang/Class;", "kotlinx-serialization-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/serialization/SerializersKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class SerializersKt__SerializersJvmKt {
    private static final KSerializer<Object> a(nf.d dVar, GenericArrayType genericArrayType, boolean z10) {
        KSerializer<Object> kSerializer;
        oc.d dVar2;
        Object A;
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
            t.d(upperBounds, "it.upperBounds");
            A = m.A(upperBounds);
            genericComponentType = (Type) A;
        }
        t.d(genericComponentType, "eType");
        if (z10) {
            kSerializer = SerializersKt.serializer(dVar, genericComponentType);
        } else {
            kSerializer = SerializersKt.b(dVar, genericComponentType);
            if (kSerializer == null) {
                return null;
            }
        }
        if (genericComponentType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) genericComponentType).getRawType();
            Objects.requireNonNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            dVar2 = fc.a.e((Class) rawType);
        } else if (!(genericComponentType instanceof oc.d)) {
            throw new IllegalStateException("unsupported type in GenericArray: " + k0.b(genericComponentType.getClass()));
        } else {
            dVar2 = (oc.d) genericComponentType;
        }
        return BuiltinSerializersKt.a(dVar2, kSerializer);
    }

    private static final Class<?> b(Type type) {
        Type genericComponentType;
        String str;
        Object A;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            genericComponentType = ((ParameterizedType) type).getRawType();
            str = "it.rawType";
        } else if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            t.d(upperBounds, "it.upperBounds");
            A = m.A(upperBounds);
            t.d(A, "it.upperBounds.first()");
            genericComponentType = (Type) A;
            return b(genericComponentType);
        } else if (!(type instanceof GenericArrayType)) {
            throw new IllegalArgumentException("typeToken should be an instance of Class<?>, GenericArray, ParametrizedType or WildcardType, but actual type is " + type + ' ' + k0.b(type.getClass()));
        } else {
            genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            str = "it.genericComponentType";
        }
        t.d(genericComponentType, str);
        return b(genericComponentType);
    }

    private static final <T> KSerializer<T> c(nf.d dVar, Class<T> cls, List<? extends KSerializer<Object>> list) {
        Object[] array = list.toArray(new KSerializer[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        KSerializer[] kSerializerArr = (KSerializer[]) array;
        KSerializer<T> c10 = u0.c(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (c10 != null) {
            return c10;
        }
        oc.d<T> e10 = fc.a.e(cls);
        KSerializer<T> b10 = e1.b(e10);
        return b10 == null ? dVar.b(e10, list) : b10;
    }

    private static final KSerializer<Object> d(nf.d dVar, Type type, boolean z10) {
        Object A;
        ArrayList<KSerializer> arrayList;
        int s10;
        if (type instanceof GenericArrayType) {
            return a(dVar, (GenericArrayType) type, z10);
        }
        if (type instanceof Class) {
            return g(dVar, (Class) type, z10);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type).getUpperBounds();
                t.d(upperBounds, "type.upperBounds");
                A = m.A(upperBounds);
                t.d(A, "type.upperBounds.first()");
                return e(dVar, (Type) A, false, 2, null);
            }
            throw new IllegalArgumentException("typeToken should be an instance of Class<?>, GenericArray, ParametrizedType or WildcardType, but actual type is " + type + ' ' + k0.b(type.getClass()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        Objects.requireNonNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls = (Class) rawType;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        t.d(actualTypeArguments, "args");
        if (z10) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                t.d(type2, "it");
                arrayList.add(SerializersKt.serializer(dVar, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                t.d(type3, "it");
                KSerializer<Object> b10 = SerializersKt.b(dVar, type3);
                if (b10 == null) {
                    return null;
                }
                arrayList.add(b10);
            }
        }
        if (Set.class.isAssignableFrom(cls)) {
            return BuiltinSerializersKt.m((KSerializer) arrayList.get(0));
        }
        if (List.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) {
            return BuiltinSerializersKt.h((KSerializer) arrayList.get(0));
        }
        if (Map.class.isAssignableFrom(cls)) {
            return BuiltinSerializersKt.k((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Map.Entry.class.isAssignableFrom(cls)) {
            return BuiltinSerializersKt.j((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (r.class.isAssignableFrom(cls)) {
            return BuiltinSerializersKt.l((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (w.class.isAssignableFrom(cls)) {
            return BuiltinSerializersKt.o((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
        }
        s10 = v.s(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(s10);
        for (KSerializer kSerializer : arrayList) {
            arrayList2.add(kSerializer);
        }
        return c(dVar, cls, arrayList2);
    }

    static /* synthetic */ KSerializer e(nf.d dVar, Type type, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return d(dVar, type, z10);
    }

    public static final KSerializer<Object> f(nf.d dVar, Type type) {
        t.e(dVar, "<this>");
        t.e(type, "type");
        return d(dVar, type, false);
    }

    private static final KSerializer<Object> g(nf.d dVar, Class<?> cls, boolean z10) {
        List h10;
        KSerializer<Object> kSerializer;
        if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
            h10 = u.h();
            return c(dVar, cls, h10);
        }
        Class<?> componentType = cls.getComponentType();
        t.d(componentType, "type.componentType");
        if (z10) {
            kSerializer = SerializersKt.serializer(dVar, componentType);
        } else {
            kSerializer = SerializersKt.b(dVar, componentType);
            if (kSerializer == null) {
                return null;
            }
        }
        return BuiltinSerializersKt.a(fc.a.e(componentType), kSerializer);
    }

    public static final KSerializer<Object> serializer(Type type) {
        t.e(type, "type");
        return SerializersKt.serializer(nf.g.a(), type);
    }

    public static final KSerializer<Object> serializer(nf.d dVar, Type type) {
        t.e(dVar, "<this>");
        t.e(type, "type");
        KSerializer<Object> d10 = d(dVar, type, true);
        if (d10 != null) {
            return d10;
        }
        u0.n(b(type));
        throw new tb.i();
    }
}
