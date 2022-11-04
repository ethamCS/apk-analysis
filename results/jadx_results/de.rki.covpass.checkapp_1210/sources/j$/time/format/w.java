package j$.time.format;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
/* loaded from: classes2.dex */
public final class w extends v {

    /* renamed from: i */
    private static final ConcurrentHashMap f13118i = new ConcurrentHashMap();

    /* renamed from: e */
    private final E f13119e;

    /* renamed from: f */
    private HashSet f13120f;

    /* renamed from: g */
    private final HashMap f13121g = new HashMap();

    /* renamed from: h */
    private final HashMap f13122h = new HashMap();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(j$.time.format.E r4) {
        /*
            r3 = this;
            j$.time.temporal.q r0 = j$.time.temporal.q.f13176a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ZoneText("
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r3.<init>(r0, r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.f13121g = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.f13122h = r0
            java.lang.String r0 = "textStyle"
            java.util.Objects.requireNonNull(r4, r0)
            r3.f13119e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.w.<init>(j$.time.format.E):void");
    }

    @Override // j$.time.format.v
    public final p a(x xVar) {
        p pVar;
        if (this.f13119e == E.NARROW) {
            return super.a(xVar);
        }
        Locale i10 = xVar.i();
        boolean k10 = xVar.k();
        HashSet hashSet = (HashSet) j$.time.zone.f.a();
        int size = hashSet.size();
        HashMap hashMap = k10 ? this.f13121g : this.f13122h;
        Map.Entry entry = (Map.Entry) hashMap.get(i10);
        if (entry == null || ((Integer) entry.getKey()).intValue() != size || (pVar = (p) ((SoftReference) entry.getValue()).get()) == null) {
            pVar = p.f(xVar);
            String[][] zoneStrings = DateFormatSymbols.getInstance(i10).getZoneStrings();
            int length = zoneStrings.length;
            int i11 = 0;
            while (true) {
                int i12 = 2;
                if (i11 >= length) {
                    break;
                }
                String[] strArr = zoneStrings[i11];
                String str = strArr[0];
                if (hashSet.contains(str)) {
                    pVar.a(str, str);
                    String a10 = F.a(str, i10);
                    if (this.f13119e == E.FULL) {
                        i12 = 1;
                    }
                    while (i12 < strArr.length) {
                        pVar.a(strArr[i12], a10);
                        i12 += 2;
                    }
                }
                i11++;
            }
            if (this.f13120f != null) {
                for (String[] strArr2 : zoneStrings) {
                    String str2 = strArr2[0];
                    if (this.f13120f.contains(str2) && hashSet.contains(str2)) {
                        for (int i13 = this.f13119e == E.FULL ? 1 : 2; i13 < strArr2.length; i13 += 2) {
                            pVar.a(strArr2[i13], str2);
                        }
                    }
                }
            }
            hashMap.put(i10, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(pVar)));
        }
        return pVar;
    }

    @Override // j$.time.format.v, j$.time.format.g
    public final boolean b(z zVar, StringBuilder sb2) {
        String[] strArr;
        ZoneId zoneId = (ZoneId) zVar.f(j$.time.temporal.m.f13172a);
        if (zoneId == null) {
            return false;
        }
        String p10 = zoneId.p();
        if (!(zoneId instanceof ZoneOffset)) {
            TemporalAccessor d10 = zVar.d();
            Object[] objArr = d10.c(ChronoField.INSTANT_SECONDS) ? zoneId.getRules().h(Instant.from(d10)) ? 1 : null : 2;
            Locale c10 = zVar.c();
            String str = null;
            Map map = null;
            if (this.f13119e != E.NARROW) {
                ConcurrentHashMap concurrentHashMap = f13118i;
                SoftReference softReference = (SoftReference) concurrentHashMap.get(p10);
                if (softReference == null || (map = (Map) softReference.get()) == null || (strArr = (String[]) map.get(c10)) == null) {
                    TimeZone timeZone = TimeZone.getTimeZone(p10);
                    String[] strArr2 = {p10, timeZone.getDisplayName(false, 1, c10), timeZone.getDisplayName(false, 0, c10), timeZone.getDisplayName(true, 1, c10), timeZone.getDisplayName(true, 0, c10), p10, p10};
                    if (map == null) {
                        map = new ConcurrentHashMap();
                    }
                    map.put(c10, strArr2);
                    concurrentHashMap.put(p10, new SoftReference(map));
                    strArr = strArr2;
                }
                int b10 = this.f13119e.b();
                str = objArr != null ? objArr != 1 ? strArr[b10 + 5] : strArr[b10 + 3] : strArr[b10 + 1];
            }
            if (str != null) {
                p10 = str;
            }
        }
        sb2.append(p10);
        return true;
    }
}
