package va;

import hc.k0;
import hc.p0;
import hc.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.JsonElement;
import nf.d;
import org.conscrypt.BuildConfig;
import ub.c0;
import ub.m;
import ub.v;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\u001a\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u001c\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004*\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\b"}, d2 = {BuildConfig.FLAVOR, "value", "Lnf/d;", "module", "Lkotlinx/serialization/KSerializer;", "b", BuildConfig.FLAVOR, "c", "ktor-client-serialization"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b {
    public static final /* synthetic */ KSerializer a(Object obj, d dVar) {
        return b(obj, dVar);
    }

    public static final KSerializer<Object> b(Object obj, d dVar) {
        Object B;
        KSerializer serializer;
        if (obj instanceof JsonElement) {
            return JsonElement.Companion.serializer();
        }
        if (obj instanceof List) {
            serializer = c((Collection) obj, dVar);
        } else if (!(obj instanceof Object[])) {
            if (obj instanceof Set) {
                return BuiltinSerializersKt.m(c((Collection) obj, dVar));
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                return BuiltinSerializersKt.k(c(map.keySet(), dVar), c(map.values(), dVar));
            }
            KSerializer<Object> c10 = d.c(dVar, k0.b(obj.getClass()), null, 2, null);
            return c10 == null ? SerializersKt.serializer(k0.b(obj.getClass())) : c10;
        } else {
            B = m.B((Object[]) obj);
            KSerializer<Object> b10 = B == null ? null : b(B, dVar);
            if (b10 != null) {
                return b10;
            }
            serializer = BuiltinSerializersKt.serializer(p0.f11777a);
        }
        return BuiltinSerializersKt.h(serializer);
    }

    private static final KSerializer<?> c(Collection<?> collection, d dVar) {
        List<Object> S;
        int s10;
        Object u02;
        boolean z10;
        int s11;
        S = c0.S(collection);
        s10 = v.s(S, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (Object obj : S) {
            arrayList.add(b(obj, dVar));
        }
        HashSet hashSet = new HashSet();
        ArrayList<KSerializer> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((KSerializer) obj2).getDescriptor().l())) {
                arrayList2.add(obj2);
            }
        }
        boolean z11 = true;
        if (arrayList2.size() > 1) {
            s11 = v.s(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(s11);
            for (KSerializer kSerializer : arrayList2) {
                arrayList3.add(kSerializer.getDescriptor().l());
            }
            throw new IllegalStateException(t.l("Serializing collections of different element types is not yet supported. Selected serializers: ", arrayList3).toString());
        }
        u02 = c0.u0(arrayList2);
        KSerializer<String> kSerializer2 = (KSerializer) u02;
        if (kSerializer2 == null) {
            kSerializer2 = BuiltinSerializersKt.serializer(p0.f11777a);
        }
        if (kSerializer2.getDescriptor().o()) {
            return kSerializer2;
        }
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
        }
        z11 = false;
        return z11 ? BuiltinSerializersKt.p(kSerializer2) : kSerializer2;
    }
}
