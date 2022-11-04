package vd;

import bf.x;
import hc.t;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nc.m;
import org.conscrypt.BuildConfig;
import ub.c0;
import ub.h0;
import ub.p0;
import ub.u;
import ub.v;
import ud.a;
/* loaded from: classes.dex */
public class g implements td.c {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private static final String f24011d;

    /* renamed from: e */
    private static final List<String> f24012e;

    /* renamed from: f */
    private static final Map<String, Integer> f24013f;

    /* renamed from: a */
    private final String[] f24014a;

    /* renamed from: b */
    private final Set<Integer> f24015b;

    /* renamed from: c */
    private final List<a.e.c> f24016c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24017a;

        static {
            int[] iArr = new int[a.e.c.EnumC0416c.values().length];
            iArr[a.e.c.EnumC0416c.NONE.ordinal()] = 1;
            iArr[a.e.c.EnumC0416c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            iArr[a.e.c.EnumC0416c.DESC_TO_CLASS_ID.ordinal()] = 3;
            f24017a = iArr;
        }
    }

    static {
        List k10;
        String e02;
        List<String> k11;
        Iterable<h0> L0;
        int s10;
        int d10;
        int b10;
        k10 = u.k('k', 'o', 't', 'l', 'i', 'n');
        e02 = c0.e0(k10, BuildConfig.FLAVOR, null, null, 0, null, null, 62, null);
        f24011d = e02;
        k11 = u.k(e02 + "/Any", e02 + "/Nothing", e02 + "/Unit", e02 + "/Throwable", e02 + "/Number", e02 + "/Byte", e02 + "/Double", e02 + "/Float", e02 + "/Int", e02 + "/Long", e02 + "/Short", e02 + "/Boolean", e02 + "/Char", e02 + "/CharSequence", e02 + "/String", e02 + "/Comparable", e02 + "/Enum", e02 + "/Array", e02 + "/ByteArray", e02 + "/DoubleArray", e02 + "/FloatArray", e02 + "/IntArray", e02 + "/LongArray", e02 + "/ShortArray", e02 + "/BooleanArray", e02 + "/CharArray", e02 + "/Cloneable", e02 + "/Annotation", e02 + "/collections/Iterable", e02 + "/collections/MutableIterable", e02 + "/collections/Collection", e02 + "/collections/MutableCollection", e02 + "/collections/List", e02 + "/collections/MutableList", e02 + "/collections/Set", e02 + "/collections/MutableSet", e02 + "/collections/Map", e02 + "/collections/MutableMap", e02 + "/collections/Map.Entry", e02 + "/collections/MutableMap.MutableEntry", e02 + "/collections/Iterator", e02 + "/collections/MutableIterator", e02 + "/collections/ListIterator", e02 + "/collections/MutableListIterator");
        f24012e = k11;
        L0 = c0.L0(k11);
        s10 = v.s(L0, 10);
        d10 = p0.d(s10);
        b10 = m.b(d10, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
        for (h0 h0Var : L0) {
            linkedHashMap.put((String) h0Var.d(), Integer.valueOf(h0Var.c()));
        }
        f24013f = linkedHashMap;
    }

    public g(String[] strArr, Set<Integer> set, List<a.e.c> list) {
        t.e(strArr, "strings");
        t.e(set, "localNameIndices");
        t.e(list, "records");
        this.f24014a = strArr;
        this.f24015b = set;
        this.f24016c = list;
    }

    @Override // td.c
    public boolean a(int i10) {
        return this.f24015b.contains(Integer.valueOf(i10));
    }

    @Override // td.c
    public String b(int i10) {
        return getString(i10);
    }

    @Override // td.c
    public String getString(int i10) {
        String str;
        a.e.c cVar = this.f24016c.get(i10);
        if (cVar.r0()) {
            str = cVar.k0();
        } else {
            if (cVar.p0()) {
                List<String> list = f24012e;
                int size = list.size();
                int g02 = cVar.g0();
                if (g02 >= 0 && g02 < size) {
                    str = list.get(cVar.g0());
                }
            }
            str = this.f24014a[i10];
        }
        if (cVar.m0() >= 2) {
            List<Integer> n02 = cVar.n0();
            t.d(n02, "substringIndexList");
            Integer num = n02.get(0);
            Integer num2 = n02.get(1);
            t.d(num, "begin");
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                t.d(num2, "end");
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    t.d(str, "string");
                    str = str.substring(num.intValue(), num2.intValue());
                    t.d(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        String str2 = str;
        if (cVar.i0() >= 2) {
            List<Integer> j02 = cVar.j0();
            t.d(j02, "replaceCharList");
            t.d(str2, "string");
            str2 = x.D(str2, (char) j02.get(0).intValue(), (char) j02.get(1).intValue(), false, 4, null);
        }
        String str3 = str2;
        a.e.c.EnumC0416c f02 = cVar.f0();
        if (f02 == null) {
            f02 = a.e.c.EnumC0416c.NONE;
        }
        int i11 = b.f24017a[f02.ordinal()];
        if (i11 == 2) {
            t.d(str3, "string");
            str3 = x.D(str3, '$', '.', false, 4, null);
        } else if (i11 == 3) {
            if (str3.length() >= 2) {
                t.d(str3, "string");
                str3 = str3.substring(1, str3.length() - 1);
                t.d(str3, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            String str4 = str3;
            t.d(str4, "string");
            str3 = x.D(str4, '$', '.', false, 4, null);
        }
        t.d(str3, "string");
        return str3;
    }
}
