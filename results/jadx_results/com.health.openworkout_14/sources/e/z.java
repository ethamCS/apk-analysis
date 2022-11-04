package e;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class z {
    private static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    final String f4409a;

    /* renamed from: b */
    private final String f4410b;

    /* renamed from: c */
    private final String f4411c;

    /* renamed from: d */
    final String f4412d;

    /* renamed from: e */
    final int f4413e;

    /* renamed from: f */
    private final List<String> f4414f;
    @Nullable

    /* renamed from: g */
    private final List<String> f4415g;
    @Nullable

    /* renamed from: h */
    private final String f4416h;
    private final String i;

    /* loaded from: classes.dex */
    public static final class a {
        @Nullable

        /* renamed from: a */
        String f4417a;
        @Nullable

        /* renamed from: d */
        String f4420d;

        /* renamed from: f */
        final List<String> f4422f;
        @Nullable

        /* renamed from: g */
        List<String> f4423g;
        @Nullable

        /* renamed from: h */
        String f4424h;

        /* renamed from: b */
        String f4418b = "";

        /* renamed from: c */
        String f4419c = "";

        /* renamed from: e */
        int f4421e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f4422f = arrayList;
            arrayList.add("");
        }

        @Nullable
        private static String d(String str, int i, int i2) {
            return e.m0.e.c(z.t(str, i, i2, false));
        }

        private boolean h(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean i(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private static int k(String str, int i, int i2) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(z.a(str, i, i2, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        private void m() {
            List<String> list = this.f4422f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f4422f.isEmpty()) {
                this.f4422f.add("");
                return;
            }
            List<String> list2 = this.f4422f;
            list2.set(list2.size() - 1, "");
        }

        private static int o(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        private void p(String str, int i, int i2, boolean z, boolean z2) {
            String a2 = z.a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (h(a2)) {
                return;
            }
            if (i(a2)) {
                m();
                return;
            }
            List<String> list = this.f4422f;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.f4422f;
                list2.set(list2.size() - 1, a2);
            } else {
                this.f4422f.add(a2);
            }
            if (!z) {
                return;
            }
            this.f4422f.add("");
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0041 -> B:10:0x0029). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void r(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L3
                return
            L3:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L1e
                r1 = 92
                if (r0 != r1) goto L13
                goto L1e
            L13:
                java.util.List<java.lang.String> r0 = r10.f4422f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L29
            L1e:
                java.util.List<java.lang.String> r0 = r10.f4422f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f4422f
                r0.add(r2)
                goto L41
            L29:
                r6 = r12
                if (r6 >= r13) goto L44
                java.lang.String r12 = "/\\"
                int r12 = e.m0.e.m(r11, r6, r13, r12)
                if (r12 >= r13) goto L36
                r0 = 1
                goto L37
            L36:
                r0 = 0
            L37:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.p(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L29
            L41:
                int r12 = r12 + 1
                goto L29
            L44:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.z.a.r(java.lang.String, int, int):void");
        }

        private static int t(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int u(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        public a a(String str, @Nullable String str2) {
            Objects.requireNonNull(str, "encodedName == null");
            if (this.f4423g == null) {
                this.f4423g = new ArrayList();
            }
            this.f4423g.add(z.b(str, " \"'<>#&=", true, false, true, true));
            this.f4423g.add(str2 != null ? z.b(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        public a b(String str, @Nullable String str2) {
            Objects.requireNonNull(str, "name == null");
            if (this.f4423g == null) {
                this.f4423g = new ArrayList();
            }
            this.f4423g.add(z.b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            this.f4423g.add(str2 != null ? z.b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
            return this;
        }

        public z c() {
            if (this.f4417a != null) {
                if (this.f4420d == null) {
                    throw new IllegalStateException("host == null");
                }
                return new z(this);
            }
            throw new IllegalStateException("scheme == null");
        }

        int e() {
            int i = this.f4421e;
            return i != -1 ? i : z.e(this.f4417a);
        }

        public a f(@Nullable String str) {
            this.f4423g = str != null ? z.A(z.b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public a g(String str) {
            Objects.requireNonNull(str, "host == null");
            String d2 = d(str, 0, str.length());
            if (d2 != null) {
                this.f4420d = d2;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        a j(@Nullable z zVar, String str) {
            int t;
            int m;
            int i;
            int E = e.m0.e.E(str, 0, str.length());
            int F = e.m0.e.F(str, E, str.length());
            if (t(str, E, F) != -1) {
                if (str.regionMatches(true, E, "https:", 0, 6)) {
                    this.f4417a = "https";
                    E += 6;
                } else if (!str.regionMatches(true, E, "http:", 0, 5)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, t) + "'");
                } else {
                    this.f4417a = "http";
                    E += 5;
                }
            } else if (zVar == null) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            } else {
                this.f4417a = zVar.f4409a;
            }
            int u = u(str, E, F);
            char c2 = '?';
            char c3 = '#';
            if (u >= 2 || zVar == null || !zVar.f4409a.equals(this.f4417a)) {
                int i2 = E + u;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    m = e.m0.e.m(str, i2, F, "@/\\?#");
                    char charAt = m != F ? str.charAt(m) : (char) 65535;
                    if (charAt == 65535 || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        break;
                    }
                    if (charAt == '@') {
                        if (!z) {
                            int l = e.m0.e.l(str, i2, m, ':');
                            i = m;
                            String a2 = z.a(str, i2, l, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                a2 = this.f4418b + "%40" + a2;
                            }
                            this.f4418b = a2;
                            if (l != i) {
                                this.f4419c = z.a(str, l + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            i = m;
                            this.f4419c += "%40" + z.a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i2 = i + 1;
                    }
                    c2 = '?';
                    c3 = '#';
                }
                int o = o(str, i2, m);
                int i3 = o + 1;
                if (i3 < m) {
                    this.f4420d = d(str, i2, o);
                    int k = k(str, i3, m);
                    this.f4421e = k;
                    if (k == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i3, m) + '\"');
                    }
                } else {
                    this.f4420d = d(str, i2, o);
                    this.f4421e = z.e(this.f4417a);
                }
                if (this.f4420d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i2, o) + '\"');
                }
                E = m;
            } else {
                this.f4418b = zVar.k();
                this.f4419c = zVar.g();
                this.f4420d = zVar.f4412d;
                this.f4421e = zVar.f4413e;
                this.f4422f.clear();
                this.f4422f.addAll(zVar.i());
                if (E == F || str.charAt(E) == '#') {
                    f(zVar.j());
                }
            }
            int m2 = e.m0.e.m(str, E, F, "?#");
            r(str, E, m2);
            if (m2 < F && str.charAt(m2) == '?') {
                int l2 = e.m0.e.l(str, m2, F, '#');
                this.f4423g = z.A(z.a(str, m2 + 1, l2, " \"'<>#", true, false, true, true, null));
                m2 = l2;
            }
            if (m2 < F && str.charAt(m2) == '#') {
                this.f4424h = z.a(str, 1 + m2, F, "", true, false, false, false, null);
            }
            return this;
        }

        public a l(String str) {
            Objects.requireNonNull(str, "password == null");
            this.f4419c = z.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public a n(int i) {
            if (i > 0 && i <= 65535) {
                this.f4421e = i;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i);
        }

        a q() {
            int size = this.f4422f.size();
            for (int i = 0; i < size; i++) {
                this.f4422f.set(i, z.b(this.f4422f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.f4423g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.f4423g.get(i2);
                    if (str != null) {
                        this.f4423g.set(i2, z.b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f4424h;
            if (str2 != null) {
                this.f4424h = z.b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a s(String str) {
            Objects.requireNonNull(str, "scheme == null");
            String str2 = "http";
            if (!str.equalsIgnoreCase(str2)) {
                str2 = "https";
                if (!str.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
            }
            this.f4417a = str2;
            return this;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.f4417a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (!this.f4418b.isEmpty() || !this.f4419c.isEmpty()) {
                sb.append(this.f4418b);
                if (!this.f4419c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f4419c);
                }
                sb.append('@');
            }
            String str3 = this.f4420d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f4420d);
                    sb.append(']');
                } else {
                    sb.append(this.f4420d);
                }
            }
            if (this.f4421e != -1 || this.f4417a != null) {
                int e2 = e();
                String str4 = this.f4417a;
                if (str4 == null || e2 != z.e(str4)) {
                    sb.append(':');
                    sb.append(e2);
                }
            }
            z.s(sb, this.f4422f);
            if (this.f4423g != null) {
                sb.append('?');
                z.o(sb, this.f4423g);
            }
            if (this.f4424h != null) {
                sb.append('#');
                sb.append(this.f4424h);
            }
            return sb.toString();
        }

        public a v(String str) {
            Objects.requireNonNull(str, "username == null");
            this.f4418b = z.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }
    }

    z(a aVar) {
        this.f4409a = aVar.f4417a;
        this.f4410b = u(aVar.f4418b, false);
        this.f4411c = u(aVar.f4419c, false);
        this.f4412d = aVar.f4420d;
        this.f4413e = aVar.e();
        this.f4414f = v(aVar.f4422f, false);
        List<String> list = aVar.f4423g;
        String str = null;
        this.f4415g = list != null ? v(list, true) : null;
        String str2 = aVar.f4424h;
        this.f4416h = str2 != null ? u(str2, false) : str;
        this.i = aVar.toString();
    }

    static List<String> A(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i = indexOf + 1;
        }
        return arrayList;
    }

    static String a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z4)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || x(str, i3, i2)))) && (codePointAt != 43 || !z3))) {
                    i3 += Character.charCount(codePointAt);
                }
            }
            f.c cVar = new f.c();
            cVar.K0(str, i, i3);
            d(cVar, str, i3, i2, str2, z, z2, z3, z4, charset);
            return cVar.r0();
        }
        return str.substring(i, i2);
    }

    static String b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    public static String c(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    static void d(f.c cVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
        f.c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z3) {
                    cVar.J0(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !x(str, i, i2)))))) {
                    if (cVar2 == null) {
                        cVar2 = new f.c();
                    }
                    if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                        cVar2.L0(codePointAt);
                    } else {
                        cVar2.I0(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!cVar2.S()) {
                        int d0 = cVar2.d0() & 255;
                        cVar.D0(37);
                        char[] cArr = j;
                        cVar.D0(cArr[(d0 >> 4) & 15]);
                        cVar.D0(cArr[d0 & 15]);
                    }
                } else {
                    cVar.L0(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    public static int e(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static z l(String str) {
        a aVar = new a();
        aVar.j(null, str);
        return aVar.c();
    }

    static void o(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static void s(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    static String t(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                f.c cVar = new f.c();
                cVar.K0(str, i, i3);
                w(cVar, str, i3, i2, z);
                return cVar.r0();
            }
        }
        return str.substring(i, i2);
    }

    static String u(String str, boolean z) {
        return t(str, 0, str.length(), z);
    }

    private List<String> v(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? u(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static void w(f.c cVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt != 37 || (i3 = i + 2) >= i2) {
                if (codePointAt == 43 && z) {
                    cVar.D0(32);
                    i += Character.charCount(codePointAt);
                }
                cVar.L0(codePointAt);
                i += Character.charCount(codePointAt);
            } else {
                int i4 = e.m0.e.i(str.charAt(i + 1));
                int i5 = e.m0.e.i(str.charAt(i3));
                if (i4 != -1 && i5 != -1) {
                    cVar.D0((i4 << 4) + i5);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
                cVar.L0(codePointAt);
                i += Character.charCount(codePointAt);
            }
        }
    }

    static boolean x(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && e.m0.e.i(str.charAt(i + 1)) != -1 && e.m0.e.i(str.charAt(i3)) != -1;
    }

    public String B() {
        a q = q("/...");
        q.v("");
        q.l("");
        return q.c().toString();
    }

    @Nullable
    public z C(String str) {
        a q = q(str);
        if (q != null) {
            return q.c();
        }
        return null;
    }

    public String D() {
        return this.f4409a;
    }

    public URI E() {
        a p = p();
        p.q();
        String aVar = p.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof z) && ((z) obj).i.equals(this.i);
    }

    @Nullable
    public String f() {
        if (this.f4416h == null) {
            return null;
        }
        return this.i.substring(this.i.indexOf(35) + 1);
    }

    public String g() {
        if (this.f4411c.isEmpty()) {
            return "";
        }
        int indexOf = this.i.indexOf(64);
        return this.i.substring(this.i.indexOf(58, this.f4409a.length() + 3) + 1, indexOf);
    }

    public String h() {
        int indexOf = this.i.indexOf(47, this.f4409a.length() + 3);
        String str = this.i;
        return this.i.substring(indexOf, e.m0.e.m(str, indexOf, str.length(), "?#"));
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    public List<String> i() {
        int indexOf = this.i.indexOf(47, this.f4409a.length() + 3);
        String str = this.i;
        int m = e.m0.e.m(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < m) {
            int i = indexOf + 1;
            int l = e.m0.e.l(this.i, i, m, '/');
            arrayList.add(this.i.substring(i, l));
            indexOf = l;
        }
        return arrayList;
    }

    @Nullable
    public String j() {
        if (this.f4415g == null) {
            return null;
        }
        int indexOf = this.i.indexOf(63) + 1;
        String str = this.i;
        return this.i.substring(indexOf, e.m0.e.l(str, indexOf, str.length(), '#'));
    }

    public String k() {
        if (this.f4410b.isEmpty()) {
            return "";
        }
        int length = this.f4409a.length() + 3;
        String str = this.i;
        return this.i.substring(length, e.m0.e.m(str, length, str.length(), ":@"));
    }

    public String m() {
        return this.f4412d;
    }

    public boolean n() {
        return this.f4409a.equals("https");
    }

    public a p() {
        a aVar = new a();
        aVar.f4417a = this.f4409a;
        aVar.f4418b = k();
        aVar.f4419c = g();
        aVar.f4420d = this.f4412d;
        aVar.f4421e = this.f4413e != e(this.f4409a) ? this.f4413e : -1;
        aVar.f4422f.clear();
        aVar.f4422f.addAll(i());
        aVar.f(j());
        aVar.f4424h = f();
        return aVar;
    }

    @Nullable
    public a q(String str) {
        try {
            a aVar = new a();
            aVar.j(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public List<String> r() {
        return this.f4414f;
    }

    public String toString() {
        return this.i;
    }

    public int y() {
        return this.f4413e;
    }

    @Nullable
    public String z() {
        if (this.f4415g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        o(sb, this.f4415g);
        return sb.toString();
    }
}
