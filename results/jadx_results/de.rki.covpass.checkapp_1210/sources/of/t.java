package of;

import hc.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u0005\bB\u0017\b\u0002\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0004\u001a\u00020\u0003J\u001b\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u000eH\u0096\u0002J\u0006\u0010\u0011\u001a\u00020\u0010J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f0\u0018R\u0011\u0010\u001a\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lof/t;", BuildConfig.FLAVOR, "Ltb/r;", BuildConfig.FLAVOR, "name", "a", BuildConfig.FLAVOR, "index", "b", "i", BuildConfig.FLAVOR, "d", BuildConfig.FLAVOR, "k", BuildConfig.FLAVOR, "iterator", "Lof/t$a;", "e", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "hashCode", "toString", BuildConfig.FLAVOR, "f", "size", "()I", BuildConfig.FLAVOR, "namesAndValues", "<init>", "([Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class t implements Iterable<tb.r<? extends String, ? extends String>>, ic.a {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private final String[] f18296c;

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u001f\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002J\u0019\u0010\f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002J\u0013\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u000f\u001a\u00020\u000eR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lof/t$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "line", "b", "(Ljava/lang/String;)Lof/t$a;", "name", "value", "a", "c", "(Ljava/lang/String;Ljava/lang/String;)Lof/t$a;", "g", "h", "e", "Lof/t;", "d", BuildConfig.FLAVOR, "namesAndValues", "Ljava/util/List;", "f", "()Ljava/util/List;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final List<String> f18297a = new ArrayList(20);

        public final a a(String str, String str2) {
            hc.t.e(str, "name");
            hc.t.e(str2, "value");
            b bVar = t.Companion;
            bVar.d(str);
            bVar.e(str2, str);
            c(str, str2);
            return this;
        }

        public final a b(String str) {
            int Z;
            hc.t.e(str, "line");
            Z = bf.y.Z(str, ':', 1, false, 4, null);
            if (Z != -1) {
                String substring = str.substring(0, Z);
                hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = str.substring(Z + 1);
                hc.t.d(substring2, "this as java.lang.String).substring(startIndex)");
                c(substring, substring2);
            } else {
                if (str.charAt(0) == ':') {
                    str = str.substring(1);
                    hc.t.d(str, "this as java.lang.String).substring(startIndex)");
                }
                c(BuildConfig.FLAVOR, str);
            }
            return this;
        }

        public final a c(String str, String str2) {
            CharSequence S0;
            hc.t.e(str, "name");
            hc.t.e(str2, "value");
            f().add(str);
            List<String> f10 = f();
            S0 = bf.y.S0(str2);
            f10.add(S0.toString());
            return this;
        }

        public final t d() {
            Object[] array = this.f18297a.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return new t((String[]) array, null);
        }

        public final String e(String str) {
            boolean v10;
            hc.t.e(str, "name");
            int size = this.f18297a.size() - 2;
            int c10 = ac.c.c(size, 0, -2);
            if (c10 <= size) {
                while (true) {
                    int i10 = size - 2;
                    v10 = bf.x.v(str, this.f18297a.get(size), true);
                    if (v10) {
                        return this.f18297a.get(size + 1);
                    }
                    if (size == c10) {
                        return null;
                    }
                    size = i10;
                }
            } else {
                return null;
            }
        }

        public final List<String> f() {
            return this.f18297a;
        }

        public final a g(String str) {
            boolean v10;
            hc.t.e(str, "name");
            int i10 = 0;
            while (i10 < f().size()) {
                v10 = bf.x.v(str, f().get(i10), true);
                if (v10) {
                    f().remove(i10);
                    f().remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final a h(String str, String str2) {
            hc.t.e(str, "name");
            hc.t.e(str2, "value");
            b bVar = t.Companion;
            bVar.d(str);
            bVar.e(str2, str);
            g(str);
            c(str, str2);
            return this;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J#\u0010\r\u001a\u00020\f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lof/t$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "namesAndValues", "name", "f", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ltb/e0;", "d", "value", "e", "Lof/t;", "g", "([Ljava/lang/String;)Lof/t;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void d(String str) {
            if (str.length() > 0) {
                int length = str.length();
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    char charAt = str.charAt(i10);
                    if (!('!' <= charAt && charAt < 127)) {
                        throw new IllegalArgumentException(pf.d.t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str).toString());
                    }
                    i10 = i11;
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[LOOP:0: B:3:0x0006->B:22:0x005b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0026 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void e(java.lang.String r8, java.lang.String r9) {
            /*
                r7 = this;
                int r0 = r8.length()
                r1 = 0
                r2 = r1
            L6:
                if (r2 >= r0) goto L5d
                int r3 = r2 + 1
                char r4 = r8.charAt(r2)
                r5 = 9
                r6 = 1
                if (r4 == r5) goto L23
                r5 = 32
                if (r5 > r4) goto L1d
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 >= r5) goto L1d
                r5 = r6
                goto L1e
            L1d:
                r5 = r1
            L1e:
                if (r5 == 0) goto L21
                goto L23
            L21:
                r5 = r1
                goto L24
            L23:
                r5 = r6
            L24:
                if (r5 != 0) goto L5b
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                r0[r1] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0[r6] = r1
                r1 = 2
                r0[r1] = r9
                java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r0 = pf.d.t(r1, r0)
                boolean r9 = pf.d.H(r9)
                if (r9 == 0) goto L47
                java.lang.String r8 = ""
                goto L4d
            L47:
                java.lang.String r9 = ": "
                java.lang.String r8 = hc.t.l(r9, r8)
            L4d:
                java.lang.String r8 = hc.t.l(r0, r8)
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
            L5b:
                r2 = r3
                goto L6
            L5d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: of.t.b.e(java.lang.String, java.lang.String):void");
        }

        public final String f(String[] strArr, String str) {
            boolean v10;
            int length = strArr.length - 2;
            int c10 = ac.c.c(length, 0, -2);
            if (c10 <= length) {
                while (true) {
                    int i10 = length - 2;
                    v10 = bf.x.v(str, strArr[length], true);
                    if (v10) {
                        return strArr[length + 1];
                    }
                    if (length == c10) {
                        return null;
                    }
                    length = i10;
                }
            } else {
                return null;
            }
        }

        @fc.c
        public final t g(String... strArr) {
            CharSequence S0;
            hc.t.e(strArr, "namesAndValues");
            int i10 = 0;
            if (strArr.length % 2 == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                int length = strArr2.length;
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    if (!(strArr2[i11] != null)) {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                    S0 = bf.y.S0(strArr2[i11]);
                    strArr2[i11] = S0.toString();
                    i11 = i12;
                }
                int c10 = ac.c.c(0, strArr2.length - 1, 2);
                if (c10 >= 0) {
                    while (true) {
                        int i13 = i10 + 2;
                        String str = strArr2[i10];
                        String str2 = strArr2[i10 + 1];
                        d(str);
                        e(str2, str);
                        if (i10 == c10) {
                            break;
                        }
                        i10 = i13;
                    }
                }
                return new t(strArr2, null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    private t(String[] strArr) {
        this.f18296c = strArr;
    }

    public /* synthetic */ t(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    public final String a(String str) {
        hc.t.e(str, "name");
        return Companion.f(this.f18296c, str);
    }

    public final String b(int i10) {
        return this.f18296c[i10 * 2];
    }

    public final Set<String> d() {
        Comparator w9;
        w9 = bf.x.w(p0.f11777a);
        TreeSet treeSet = new TreeSet(w9);
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(b(i10));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        hc.t.d(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final a e() {
        a aVar = new a();
        ub.z.y(aVar.f(), this.f18296c);
        return aVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && Arrays.equals(this.f18296c, ((t) obj).f18296c);
    }

    public final Map<String, List<String>> f() {
        Comparator w9;
        w9 = bf.x.w(p0.f11777a);
        TreeMap treeMap = new TreeMap(w9);
        int size = size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            String b10 = b(i10);
            Locale locale = Locale.US;
            hc.t.d(locale, "US");
            String lowerCase = b10.toLowerCase(locale);
            hc.t.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(i(i10));
            i10 = i11;
        }
        return treeMap;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f18296c);
    }

    public final String i(int i10) {
        return this.f18296c[(i10 * 2) + 1];
    }

    @Override // java.lang.Iterable
    public Iterator<tb.r<? extends String, ? extends String>> iterator() {
        int size = size();
        tb.r[] rVarArr = new tb.r[size];
        for (int i10 = 0; i10 < size; i10++) {
            rVarArr[i10] = tb.x.a(b(i10), i(i10));
        }
        return hc.d.a(rVarArr);
    }

    public final List<String> k(String str) {
        List<String> h10;
        boolean v10;
        hc.t.e(str, "name");
        int size = size();
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            v10 = bf.x.v(str, b(i10), true);
            if (v10) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(i(i10));
            }
            i10 = i11;
        }
        if (arrayList == null) {
            h10 = ub.u.h();
            return h10;
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        hc.t.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return unmodifiableList;
    }

    public final int size() {
        return this.f18296c.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            String b10 = b(i10);
            String i12 = i(i10);
            sb2.append(b10);
            sb2.append(": ");
            if (pf.d.H(b10)) {
                i12 = "██";
            }
            sb2.append(i12);
            sb2.append("\n");
            i10 = i11;
        }
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
