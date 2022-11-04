package wd;

import bf.x;
import hc.t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24806a;

        static {
            int[] iArr = new int[k.values().length];
            iArr[k.BEGINNING.ordinal()] = 1;
            iArr[k.AFTER_DOT.ordinal()] = 2;
            iArr[k.MIDDLE.ordinal()] = 3;
            f24806a = iArr;
        }
    }

    public static final <V> V a(c cVar, Map<c, ? extends V> map) {
        Object obj;
        t.e(cVar, "<this>");
        t.e(map, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<c, ? extends V>> it = map.entrySet().iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<c, ? extends V> next = it.next();
            c key = next.getKey();
            if (!t.a(cVar, key) && !b(cVar, key)) {
                z10 = false;
            }
            if (z10) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        if (!it2.hasNext()) {
            obj = null;
        } else {
            obj = it2.next();
            if (it2.hasNext()) {
                int length = g((c) ((Map.Entry) obj).getKey(), cVar).b().length();
                do {
                    Object next2 = it2.next();
                    int length2 = g((c) ((Map.Entry) next2).getKey(), cVar).b().length();
                    if (length > length2) {
                        obj = next2;
                        length = length2;
                    }
                } while (it2.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (V) entry.getValue();
    }

    public static final boolean b(c cVar, c cVar2) {
        t.e(cVar, "<this>");
        t.e(cVar2, "packageName");
        return t.a(f(cVar), cVar2);
    }

    private static final boolean c(String str, String str2) {
        boolean I;
        I = x.I(str, str2, false, 2, null);
        return I && str.charAt(str2.length()) == '.';
    }

    public static final boolean d(c cVar, c cVar2) {
        t.e(cVar, "<this>");
        t.e(cVar2, "packageName");
        if (!t.a(cVar, cVar2) && !cVar2.d()) {
            String b10 = cVar.b();
            t.d(b10, "this.asString()");
            String b11 = cVar2.b();
            t.d(b11, "packageName.asString()");
            return c(b10, b11);
        }
        return true;
    }

    public static final boolean e(String str) {
        if (str == null) {
            return false;
        }
        k kVar = k.BEGINNING;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            int i11 = a.f24806a[kVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                if (!Character.isJavaIdentifierPart(charAt)) {
                    return false;
                }
                kVar = k.MIDDLE;
            } else if (i11 != 3) {
                continue;
            } else if (charAt == '.') {
                kVar = k.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            }
        }
        return kVar != k.AFTER_DOT;
    }

    public static final c f(c cVar) {
        t.e(cVar, "<this>");
        if (cVar.d()) {
            return null;
        }
        return cVar.e();
    }

    public static final c g(c cVar, c cVar2) {
        t.e(cVar, "<this>");
        t.e(cVar2, "prefix");
        if (!d(cVar, cVar2) || cVar2.d()) {
            return cVar;
        }
        if (t.a(cVar, cVar2)) {
            c cVar3 = c.f24796c;
            t.d(cVar3, "ROOT");
            return cVar3;
        }
        String b10 = cVar.b();
        t.d(b10, "asString()");
        String substring = b10.substring(cVar2.b().length() + 1);
        t.d(substring, "this as java.lang.String).substring(startIndex)");
        return new c(substring);
    }
}
