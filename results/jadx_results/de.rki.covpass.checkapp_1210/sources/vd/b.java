package vd;

import bf.x;
import hc.t;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;
import ub.c0;
import ub.u;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public static final b f23996a = new b();

    /* renamed from: b */
    private static final String f23997b;

    /* renamed from: c */
    private static final Map<String, String> f23998c;

    static {
        List k10;
        String e02;
        List k11;
        List<String> k12;
        List<String> k13;
        List<String> k14;
        int i10;
        k10 = u.k('k', 'o', 't', 'l', 'i', 'n');
        e02 = c0.e0(k10, BuildConfig.FLAVOR, null, null, 0, null, null, 62, null);
        f23997b = e02;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        k11 = u.k("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int c10 = ac.c.c(0, k11.size() - 1, 2);
        if (c10 >= 0) {
            int i11 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f23997b;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) k11.get(i11));
                linkedHashMap.put(sb2.toString(), k11.get(i11 + 1));
                linkedHashMap.put(str + '/' + ((String) k11.get(i11)) + "Array", '[' + ((String) k11.get(i10)));
                if (i11 == c10) {
                    break;
                }
                i11 += 2;
            }
        }
        linkedHashMap.put(f23997b + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        k12 = u.k("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum");
        for (String str2 : k12) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        k13 = u.k("Iterator", "Collection", "List", "Set", "Map", "ListIterator");
        for (String str3 : k13) {
            a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i12 = 0; i12 < 23; i12++) {
            StringBuilder sb3 = new StringBuilder();
            String str4 = f23997b;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i12);
            a(linkedHashMap, "Function" + i12, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i12, str4 + "/reflect/KFunction");
        }
        k14 = u.k("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum");
        for (String str5 : k14) {
            a(linkedHashMap, str5 + ".Companion", f23997b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f23998c = linkedHashMap;
    }

    private b() {
    }

    private static final void a(Map<String, String> map, String str, String str2) {
        map.put(f23997b + '/' + str, 'L' + str2 + ';');
    }

    @fc.c
    public static final String b(String str) {
        String D;
        t.e(str, "classId");
        String str2 = f23998c.get(str);
        if (str2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('L');
            D = x.D(str, '.', '$', false, 4, null);
            sb2.append(D);
            sb2.append(';');
            return sb2.toString();
        }
        return str2;
    }
}
