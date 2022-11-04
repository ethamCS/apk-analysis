package kotlinx.serialization;

import hc.k0;
import hc.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kf.e1;
import kf.h0;
import kf.j0;
import kf.u0;
import kf.v0;
import kf.x;
import kf.z;
import kotlin.Metadata;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import oc.n;
import oc.p;
import org.conscrypt.BuildConfig;
import tb.r;
import tb.w;
import ub.v;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0086\b\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0003H\u0086\b\u001a\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00012\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0001*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u001c\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004\u001a-\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001aA\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0001*\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aB\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0006*\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0014\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00010\fH\u0000\u001a\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0007\u001a$\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0007\u001a3\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"T", "Lkotlinx/serialization/KSerializer;", "serializer", "Lnf/d;", "Loc/n;", "type", BuildConfig.FLAVOR, "e", BuildConfig.FLAVOR, "failOnMissingTypeArgSerializer", "d", "(Lnf/d;Loc/n;Z)Lkotlinx/serialization/KSerializer;", BuildConfig.FLAVOR, "typeArguments", "Loc/d;", "rootClass", "a", "(Lnf/d;Ljava/util/List;Loc/d;Z)Lkotlinx/serialization/KSerializer;", "kClass", "typeArgumentsSerializers", "c", "f", "shouldBeNullable", "b", "(Lkotlinx/serialization/KSerializer;Z)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/serialization/SerializersKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class SerializersKt__SerializersKt {
    private static final KSerializer<? extends Object> a(nf.d dVar, List<? extends n> list, oc.d<Object> dVar2, boolean z10) {
        ArrayList arrayList;
        int s10;
        int s11;
        if (z10) {
            s11 = v.s(list, 10);
            arrayList = new ArrayList(s11);
            for (n nVar : list) {
                arrayList.add(SerializersKt.serializer(dVar, nVar));
            }
        } else {
            s10 = v.s(list, 10);
            arrayList = new ArrayList(s10);
            for (n nVar2 : list) {
                KSerializer<Object> c10 = SerializersKt.c(dVar, nVar2);
                if (c10 == null) {
                    return null;
                }
                arrayList.add(c10);
            }
        }
        if (t.a(dVar2, k0.b(Collection.class)) ? true : t.a(dVar2, k0.b(List.class)) ? true : t.a(dVar2, k0.b(List.class)) ? true : t.a(dVar2, k0.b(ArrayList.class))) {
            return new kf.f((KSerializer) arrayList.get(0));
        }
        if (t.a(dVar2, k0.b(HashSet.class))) {
            return new z((KSerializer) arrayList.get(0));
        }
        if (t.a(dVar2, k0.b(Set.class)) ? true : t.a(dVar2, k0.b(Set.class)) ? true : t.a(dVar2, k0.b(LinkedHashSet.class))) {
            return new j0((KSerializer) arrayList.get(0));
        }
        if (t.a(dVar2, k0.b(HashMap.class))) {
            return new x((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (t.a(dVar2, k0.b(Map.class)) ? true : t.a(dVar2, k0.b(Map.class)) ? true : t.a(dVar2, k0.b(LinkedHashMap.class))) {
            return new h0((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (t.a(dVar2, k0.b(Map.Entry.class))) {
            return BuiltinSerializersKt.j((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (t.a(dVar2, k0.b(r.class))) {
            return BuiltinSerializersKt.l((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (t.a(dVar2, k0.b(w.class))) {
            return BuiltinSerializersKt.o((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), (KSerializer) arrayList.get(2));
        }
        if (u0.k(dVar2)) {
            oc.e f10 = list.get(0).f();
            Objects.requireNonNull(f10, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            return BuiltinSerializersKt.a((oc.d) f10, (KSerializer) arrayList.get(0));
        }
        Object[] array = arrayList.toArray(new KSerializer[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        KSerializer[] kSerializerArr = (KSerializer[]) array;
        KSerializer<? extends Object> d10 = u0.d(dVar2, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        return d10 == null ? SerializersKt.a(dVar, dVar2, arrayList) : d10;
    }

    private static final <T> KSerializer<T> b(KSerializer<T> kSerializer, boolean z10) {
        return z10 ? BuiltinSerializersKt.p(kSerializer) : kSerializer;
    }

    public static final <T> KSerializer<T> c(nf.d dVar, oc.d<T> dVar2, List<? extends KSerializer<Object>> list) {
        t.e(dVar, "<this>");
        t.e(dVar2, "kClass");
        t.e(list, "typeArgumentsSerializers");
        KSerializer<T> d10 = SerializersKt.d(dVar2);
        return d10 == null ? dVar.b(dVar2, list) : d10;
    }

    private static final KSerializer<Object> d(nf.d dVar, n nVar, boolean z10) {
        int s10;
        KSerializer<? extends Object> kSerializer;
        oc.d<Object> c10 = v0.c(nVar);
        boolean t10 = nVar.t();
        List<p> c11 = nVar.c();
        s10 = v.s(c11, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (p pVar : c11) {
            n c12 = pVar.c();
            if (c12 == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + nVar).toString());
            }
            arrayList.add(c12);
        }
        if (arrayList.isEmpty()) {
            kSerializer = SerializersKt.d(c10);
            if (kSerializer == null) {
                kSerializer = nf.d.c(dVar, c10, null, 2, null);
            }
        } else {
            kSerializer = a(dVar, arrayList, c10, z10);
        }
        if (kSerializer == null) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return b(kSerializer, t10);
        }
        return null;
    }

    public static final KSerializer<Object> e(nf.d dVar, n nVar) {
        t.e(dVar, "<this>");
        t.e(nVar, "type");
        return d(dVar, nVar, false);
    }

    public static final <T> KSerializer<T> f(oc.d<T> dVar) {
        t.e(dVar, "<this>");
        KSerializer<T> b10 = u0.b(dVar);
        return b10 == null ? e1.b(dVar) : b10;
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer() {
        t.i(6, "T");
        return (KSerializer<T>) SerializersKt.serializer((n) null);
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer(nf.d dVar) {
        t.e(dVar, "<this>");
        t.i(6, "T");
        return (KSerializer<T>) SerializersKt.serializer(dVar, (n) null);
    }

    public static final KSerializer<Object> serializer(nf.d dVar, n nVar) {
        t.e(dVar, "<this>");
        t.e(nVar, "type");
        KSerializer<Object> d10 = d(dVar, nVar, true);
        if (d10 != null) {
            return d10;
        }
        u0.l(v0.c(nVar));
        throw new tb.i();
    }

    public static final <T> KSerializer<T> serializer(oc.d<T> dVar) {
        t.e(dVar, "<this>");
        KSerializer<T> d10 = SerializersKt.d(dVar);
        if (d10 != null) {
            return d10;
        }
        v0.d(dVar);
        throw new tb.i();
    }

    public static final KSerializer<Object> serializer(n nVar) {
        t.e(nVar, "type");
        return SerializersKt.serializer(nf.g.a(), nVar);
    }
}
