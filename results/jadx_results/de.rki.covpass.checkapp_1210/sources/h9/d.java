package h9;

import de.rki.covpass.sdk.revocation.RevocationIndexByte2Entry;
import de.rki.covpass.sdk.revocation.RevocationIndexEntry;
import hc.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import nc.m;
import org.conscrypt.BuildConfig;
import t7.o;
import tb.r;
import tb.x;
import ub.p0;
import ub.v;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u001a\u0010\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002*\u00020\u0007\u001a\u0010\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u0007\u001a\u0016\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n*\u00020\u0007\u001a\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u000e0\u0002¨\u0006\u0010"}, d2 = {BuildConfig.FLAVOR, "kid", BuildConfig.FLAVOR, "Lh9/b;", "kidList", BuildConfig.FLAVOR, "e", "Lt7/o;", "c", "b", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/revocation/RevocationIndexEntry;", "a", "Li9/o;", "d", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class d {
    public static final Map<Byte, RevocationIndexEntry> a(o oVar) {
        int s10;
        int d10;
        int b10;
        byte z10;
        int s11;
        int d11;
        int b11;
        byte z11;
        t.e(oVar, "<this>");
        Collection<Map.Entry<o, o>> l12 = oVar.l1();
        t.d(l12, "entries");
        s10 = v.s(l12, 10);
        d10 = p0.d(s10);
        b10 = m.b(d10, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
        Iterator<T> it = l12.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            t.d(entry, "(key, value)");
            o oVar2 = (o) entry.getValue();
            byte[] j02 = ((o) entry.getKey()).j0();
            t.d(j02, "key.GetByteString()");
            z10 = ub.m.z(j02);
            Byte valueOf = Byte.valueOf(z10);
            Long valueOf2 = Long.valueOf(oVar2.j1(0).o());
            Integer valueOf3 = Integer.valueOf(oVar2.j1(1).j());
            Collection<Map.Entry<o, o>> l13 = oVar2.j1(2).l1();
            t.d(l13, "value[2].entries");
            s11 = v.s(l13, 10);
            d11 = p0.d(s11);
            b11 = m.b(d11, 16);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(b11);
            Iterator<T> it2 = l13.iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                t.d(entry2, "(key2, value2)");
                o oVar3 = (o) entry2.getValue();
                byte[] j03 = ((o) entry2.getKey()).j0();
                t.d(j03, "key2.GetByteString()");
                z11 = ub.m.z(j03);
                r a10 = x.a(Byte.valueOf(z11), new RevocationIndexByte2Entry(Long.valueOf(oVar3.j1(0).o()), Integer.valueOf(oVar3.j1(1).j())));
                linkedHashMap2.put(a10.e(), a10.f());
            }
            r a11 = x.a(valueOf, new RevocationIndexEntry(valueOf2, valueOf3, linkedHashMap2));
            linkedHashMap.put(a11.e(), a11.f());
        }
        return linkedHashMap;
    }

    public static final List<b> b(o oVar) {
        int s10;
        int d10;
        int b10;
        byte z10;
        t.e(oVar, "<this>");
        ArrayList arrayList = new ArrayList();
        Collection<Map.Entry<o, o>> l12 = oVar.l1();
        t.d(l12, "entries");
        Iterator<T> it = l12.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            t.d(entry, "(key, value)");
            byte[] j02 = ((o) entry.getKey()).j0();
            t.d(j02, "key.GetByteString()");
            Collection<Map.Entry<o, o>> l13 = ((o) entry.getValue()).l1();
            t.d(l13, "value.entries");
            s10 = v.s(l13, 10);
            d10 = p0.d(s10);
            b10 = m.b(d10, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
            Iterator<T> it2 = l13.iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                t.d(entry2, "(key, value)");
                byte[] j03 = ((o) entry2.getKey()).j0();
                t.d(j03, "key.GetByteString()");
                z10 = ub.m.z(j03);
                r a10 = x.a(Byte.valueOf(z10), Integer.valueOf(((o) entry2.getValue()).j()));
                linkedHashMap.put(a10.e(), a10.f());
            }
            arrayList.add(new b(j02, linkedHashMap));
        }
        return arrayList;
    }

    public static final List<byte[]> c(o oVar) {
        int s10;
        t.e(oVar, "<this>");
        Collection<o> t12 = oVar.t1();
        t.d(t12, "values");
        s10 = v.s(t12, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (o oVar2 : t12) {
            arrayList.add(oVar2.j0());
        }
        return arrayList;
    }

    public static final List<b> d(List<i9.o> list) {
        int s10;
        t.e(list, "<this>");
        s10 = v.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (i9.o oVar : list) {
            arrayList.add(new b(oVar.b(), oVar.a()));
        }
        return arrayList;
    }

    public static final boolean e(byte[] bArr, List<b> list) {
        t.e(bArr, "kid");
        t.e(list, "kidList");
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (b bVar : list) {
                if (Arrays.equals(bArr, bVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
