package i9;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.rki.covpass.sdk.revocation.RevocationIndexEntry;
import hc.k0;
import hc.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.SerializersKt;
import oc.p;
import org.conscrypt.BuildConfig;
import ub.u;
import ub.v;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0007J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u0005H\u0007J\u001c\u0010\u000e\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007J\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u0007\u001a\u00020\u0005H\u0007J\u001c\u0010\u0011\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\tH\u0007¨\u0006\u0014"}, d2 = {"Li9/g;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "list", BuildConfig.FLAVOR, "a", "value", "d", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "e", "map", "b", "Lde/rki/covpass/sdk/revocation/RevocationIndexEntry;", "f", "c", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class g {
    public final String a(List<byte[]> list) {
        List list2;
        int s10;
        if (list != null) {
            s10 = v.s(list, 10);
            list2 = new ArrayList(s10);
            for (byte[] bArr : list) {
                list2.add(z9.k.c(bArr));
            }
        } else {
            list2 = null;
        }
        ObjectMapper objectMapper = new ObjectMapper();
        if (list2 == null) {
            list2 = u.h();
        }
        String writeValueAsString = objectMapper.writeValueAsString(list2);
        t.d(writeValueAsString, "objectMapper.writeValueA…t ?: emptyList<String>())");
        return writeValueAsString;
    }

    public final String b(Map<Byte, Integer> map) {
        t.e(map, "map");
        lf.a c10 = f9.b.c();
        nf.d a10 = c10.a();
        p.a aVar = p.Companion;
        return c10.d(SerializersKt.serializer(a10, k0.l(Map.class, aVar.d(k0.j(Byte.TYPE)), aVar.d(k0.j(Integer.TYPE)))), map);
    }

    public final String c(Map<Byte, RevocationIndexEntry> map) {
        t.e(map, "map");
        lf.a c10 = f9.b.c();
        nf.d a10 = c10.a();
        p.a aVar = p.Companion;
        return c10.d(SerializersKt.serializer(a10, k0.l(Map.class, aVar.d(k0.j(Byte.TYPE)), aVar.d(k0.j(RevocationIndexEntry.class)))), map);
    }

    public final List<byte[]> d(String str) {
        List<String> i02;
        int s10;
        Object readValue = new ObjectMapper().readValue(str, String[].class);
        t.d(readValue, "objectMap.readValue(valu…rray<String>::class.java)");
        i02 = ub.m.i0((Object[]) readValue);
        s10 = v.s(i02, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (String str2 : i02) {
            arrayList.add(z9.k.a(str2));
        }
        return arrayList;
    }

    public final Map<Byte, Integer> e(String str) {
        t.e(str, "value");
        lf.a c10 = f9.b.c();
        nf.d a10 = c10.a();
        p.a aVar = p.Companion;
        return (Map) c10.c(SerializersKt.serializer(a10, k0.l(Map.class, aVar.d(k0.j(Byte.TYPE)), aVar.d(k0.j(Integer.TYPE)))), str);
    }

    public final Map<Byte, RevocationIndexEntry> f(String str) {
        t.e(str, "value");
        lf.a c10 = f9.b.c();
        nf.d a10 = c10.a();
        p.a aVar = p.Companion;
        return (Map) c10.c(SerializersKt.serializer(a10, k0.l(Map.class, aVar.d(k0.j(Byte.TYPE)), aVar.d(k0.j(RevocationIndexEntry.class)))), str);
    }
}
