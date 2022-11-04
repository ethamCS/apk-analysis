package kotlinx.serialization;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import oc.n;
@Metadata(d1 = {"kotlinx/serialization/SerializersKt__SerializersJvmKt", "kotlinx/serialization/SerializersKt__SerializersKt"}, k = 4, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SerializersKt {
    public static final <T> KSerializer<T> a(nf.d dVar, oc.d<T> dVar2, List<? extends KSerializer<Object>> list) {
        return SerializersKt__SerializersKt.c(dVar, dVar2, list);
    }

    public static final KSerializer<Object> b(nf.d dVar, Type type) {
        return SerializersKt__SerializersJvmKt.f(dVar, type);
    }

    public static final KSerializer<Object> c(nf.d dVar, n nVar) {
        return SerializersKt__SerializersKt.e(dVar, nVar);
    }

    public static final <T> KSerializer<T> d(oc.d<T> dVar) {
        return SerializersKt__SerializersKt.f(dVar);
    }

    public static final KSerializer<Object> serializer(Type type) {
        return SerializersKt__SerializersJvmKt.serializer(type);
    }

    public static final KSerializer<Object> serializer(nf.d dVar, Type type) {
        return SerializersKt__SerializersJvmKt.serializer(dVar, type);
    }

    public static final KSerializer<Object> serializer(nf.d dVar, n nVar) {
        return SerializersKt__SerializersKt.serializer(dVar, nVar);
    }

    public static final <T> KSerializer<T> serializer(oc.d<T> dVar) {
        return SerializersKt__SerializersKt.serializer(dVar);
    }

    public static final KSerializer<Object> serializer(n nVar) {
        return SerializersKt__SerializersKt.serializer(nVar);
    }
}
