package pd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.conscrypt.BuildConfig;
import ub.c0;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a */
    public static final x f19141a = new x();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<String, CharSequence> {

        /* renamed from: c */
        public static final a f19142c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final CharSequence invoke(String str) {
            hc.t.e(str, "it");
            return x.f19141a.c(str);
        }
    }

    private x() {
    }

    public final String c(String str) {
        if (str.length() > 1) {
            return 'L' + str + ';';
        }
        return str;
    }

    public final String[] b(String... strArr) {
        hc.t.e(strArr, "signatures");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        Object[] array = arrayList.toArray(new String[0]);
        hc.t.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    public final Set<String> d(String str, String... strArr) {
        hc.t.e(str, "internalName");
        hc.t.e(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public final Set<String> e(String str, String... strArr) {
        hc.t.e(str, "name");
        hc.t.e(strArr, "signatures");
        return d(h(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final Set<String> f(String str, String... strArr) {
        hc.t.e(str, "name");
        hc.t.e(strArr, "signatures");
        return d(i(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final String g(String str) {
        hc.t.e(str, "name");
        return "java/util/function/" + str;
    }

    public final String h(String str) {
        hc.t.e(str, "name");
        return "java/lang/" + str;
    }

    public final String i(String str) {
        hc.t.e(str, "name");
        return "java/util/" + str;
    }

    public final String j(String str, List<String> list, String str2) {
        String e02;
        hc.t.e(str, "name");
        hc.t.e(list, "parameters");
        hc.t.e(str2, "ret");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('(');
        e02 = c0.e0(list, BuildConfig.FLAVOR, null, null, 0, null, a.f19142c, 30, null);
        sb2.append(e02);
        sb2.append(')');
        sb2.append(c(str2));
        return sb2.toString();
    }

    public final String k(String str, String str2) {
        hc.t.e(str, "internalName");
        hc.t.e(str2, "jvmDescriptor");
        return str + '.' + str2;
    }
}
