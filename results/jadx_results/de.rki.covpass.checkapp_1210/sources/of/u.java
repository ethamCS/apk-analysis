package of;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0002;1Bc\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u00103\u001a\u00020\b\u0012\u0006\u00104\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\u0012\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u00020\b0)\u0012\u0010\u00106\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010)\u0012\b\u00107\u001a\u0004\u0018\u00010\b\u0012\u0006\u00108\u001a\u00020\b¢\u0006\u0004\b9\u0010:J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\bJ\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016R\u0017\u0010\u0015\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00128\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b#\u0010\u0018R\u0011\u0010&\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b%\u0010\u0018R\u0011\u0010(\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b'\u0010\u0018R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0)8G¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010.\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b-\u0010\u0018R\u0013\u00100\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b/\u0010\u0018R\u0013\u00102\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b1\u0010\u0018¨\u0006<"}, d2 = {"Lof/u;", BuildConfig.FLAVOR, "Ljava/net/URL;", "r", "()Ljava/net/URL;", "Ljava/net/URI;", "q", "()Ljava/net/URI;", BuildConfig.FLAVOR, "n", "link", "o", "Lof/u$a;", "j", "k", "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", "toString", "scheme", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "host", "h", "port", "I", "l", "()I", "isHttps", "Z", "i", "()Z", "g", "encodedUsername", "c", "encodedPassword", "d", "encodedPath", BuildConfig.FLAVOR, "e", "()Ljava/util/List;", "encodedPathSegments", "f", "encodedQuery", "m", "query", "b", "encodedFragment", "username", "password", "pathSegments", "queryNamesAndValues", "fragment", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "a", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class u {
    public static final b Companion = new b(null);

    /* renamed from: k */
    private static final char[] f18298k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    private final String f18299a;

    /* renamed from: b */
    private final String f18300b;

    /* renamed from: c */
    private final String f18301c;

    /* renamed from: d */
    private final String f18302d;

    /* renamed from: e */
    private final int f18303e;

    /* renamed from: f */
    private final List<String> f18304f;

    /* renamed from: g */
    private final List<String> f18305g;

    /* renamed from: h */
    private final String f18306h;

    /* renamed from: i */
    private final String f18307i;

    /* renamed from: j */
    private final boolean f18308j;

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\bD\u0010EJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J0\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\bH\u0002J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0002J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004J\u000f\u0010\u001e\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010!\u001a\u00020 J\b\u0010\"\u001a\u00020\u0004H\u0016J!\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010 2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b$\u0010%R$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\"\u0010.\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010&\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R$\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010&\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R\"\u0010\u001a\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R \u00109\u001a\b\u0012\u0004\u0012\u00020\u0004088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R,\u0010=\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<\"\u0004\b?\u0010@R$\u0010A\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010&\u001a\u0004\bB\u0010(\"\u0004\bC\u0010*¨\u0006F"}, d2 = {"Lof/u$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", BuildConfig.FLAVOR, "input", "startPos", "limit", "Ltb/e0;", "u", "pos", BuildConfig.FLAVOR, "addTrailingSlash", "alreadyEncoded", "s", "m", "n", "q", "scheme", "v", "username", "D", "password", "p", "host", "l", "port", "r", "encodedQuery", "c", "t", "()Lof/u$a;", "Lof/u;", "a", "toString", "base", "o", "(Lof/u;Ljava/lang/String;)Lof/u$a;", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "C", "(Ljava/lang/String;)V", "encodedUsername", "h", "z", "encodedPassword", "e", "x", "i", "A", "I", "j", "()I", "B", "(I)V", BuildConfig.FLAVOR, "encodedPathSegments", "Ljava/util/List;", "f", "()Ljava/util/List;", "encodedQueryNamesAndValues", "g", "y", "(Ljava/util/List;)V", "encodedFragment", "d", "w", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        public static final C0291a Companion = new C0291a(null);

        /* renamed from: a */
        private String f18309a;

        /* renamed from: d */
        private String f18312d;

        /* renamed from: f */
        private final List<String> f18314f;

        /* renamed from: g */
        private List<String> f18315g;

        /* renamed from: h */
        private String f18316h;

        /* renamed from: b */
        private String f18310b = BuildConfig.FLAVOR;

        /* renamed from: c */
        private String f18311c = BuildConfig.FLAVOR;

        /* renamed from: e */
        private int f18313e = -1;

        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u001c\u0010\b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002R\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lof/u$a$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "input", BuildConfig.FLAVOR, "pos", "limit", "g", "h", "f", "e", "INVALID_HOST", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
        /* renamed from: of.u$a$a */
        /* loaded from: classes3.dex */
        public static final class C0291a {
            private C0291a() {
            }

            public /* synthetic */ C0291a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int e(String str, int i10, int i11) {
                try {
                    int parseInt = Integer.parseInt(b.b(u.Companion, str, i10, i11, BuildConfig.FLAVOR, false, false, false, false, null, 248, null));
                    boolean z10 = false;
                    if (1 <= parseInt && parseInt < 65536) {
                        z10 = true;
                    }
                    if (!z10) {
                        return -1;
                    }
                    return parseInt;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public final int f(String str, int i10, int i11) {
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt == '[') {
                        do {
                            i10++;
                            if (i10 < i11) {
                            }
                        } while (str.charAt(i10) != ']');
                    } else if (charAt == ':') {
                        return i10;
                    }
                    i10++;
                }
                return i11;
            }

            public final int g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i10);
                if ((hc.t.f(charAt, 97) < 0 || hc.t.f(charAt, 122) > 0) && (hc.t.f(charAt, 65) < 0 || hc.t.f(charAt, 90) > 0)) {
                    return -1;
                }
                int i12 = i10 + 1;
                while (i12 < i11) {
                    int i13 = i12 + 1;
                    char charAt2 = str.charAt(i12);
                    boolean z10 = false;
                    if (((((('a' <= charAt2 && charAt2 < '{') || ('A' <= charAt2 && charAt2 < '[')) || ('0' <= charAt2 && charAt2 < ':')) || charAt2 == '+') || charAt2 == '-') || charAt2 == '.') {
                        z10 = true;
                    }
                    if (!z10) {
                        if (charAt2 != ':') {
                            return -1;
                        }
                        return i12;
                    }
                    i12 = i13;
                }
                return -1;
            }

            public final int h(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    int i13 = i10 + 1;
                    char charAt = str.charAt(i10);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i12++;
                    i10 = i13;
                }
                return i12;
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f18314f = arrayList;
            arrayList.add(BuildConfig.FLAVOR);
        }

        private final int b() {
            int i10 = this.f18313e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = u.Companion;
            String str = this.f18309a;
            hc.t.b(str);
            return bVar.c(str);
        }

        private final boolean m(String str) {
            boolean v10;
            if (!hc.t.a(str, ".")) {
                v10 = bf.x.v(str, "%2e", true);
                return v10;
            }
            return true;
        }

        private final boolean n(String str) {
            boolean v10;
            boolean v11;
            boolean v12;
            if (!hc.t.a(str, "..")) {
                v10 = bf.x.v(str, "%2e.", true);
                if (v10) {
                    return true;
                }
                v11 = bf.x.v(str, ".%2e", true);
                if (v11) {
                    return true;
                }
                v12 = bf.x.v(str, "%2e%2e", true);
                return v12;
            }
            return true;
        }

        private final void q() {
            List<String> list = this.f18314f;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.f18314f.isEmpty())) {
                this.f18314f.add(BuildConfig.FLAVOR);
                return;
            }
            List<String> list2 = this.f18314f;
            list2.set(list2.size() - 1, BuildConfig.FLAVOR);
        }

        private final void s(String str, int i10, int i11, boolean z10, boolean z11) {
            String b10 = b.b(u.Companion, str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, null, 240, null);
            if (m(b10)) {
                return;
            }
            if (n(b10)) {
                q();
                return;
            }
            List<String> list = this.f18314f;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.f18314f;
                list2.set(list2.size() - 1, b10);
            } else {
                this.f18314f.add(b10);
            }
            if (!z10) {
                return;
            }
            this.f18314f.add(BuildConfig.FLAVOR);
        }

        private final void u(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char charAt = str.charAt(i10);
            if (charAt == '/' || charAt == '\\') {
                this.f18314f.clear();
                this.f18314f.add(BuildConfig.FLAVOR);
                i10++;
            } else {
                List<String> list = this.f18314f;
                list.set(list.size() - 1, BuildConfig.FLAVOR);
            }
            while (true) {
                int i12 = i10;
                while (i12 < i11) {
                    i10 = pf.d.q(str, "/\\", i12, i11);
                    boolean z10 = i10 < i11;
                    s(str, i12, i10, z10, true);
                    if (z10) {
                        i12 = i10 + 1;
                    }
                }
                return;
            }
        }

        public final void A(String str) {
            this.f18312d = str;
        }

        public final void B(int i10) {
            this.f18313e = i10;
        }

        public final void C(String str) {
            this.f18309a = str;
        }

        public final a D(String str) {
            hc.t.e(str, "username");
            z(b.b(u.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final u a() {
            int s10;
            ArrayList arrayList;
            int s11;
            String str = this.f18309a;
            if (str != null) {
                b bVar = u.Companion;
                String h10 = b.h(bVar, this.f18310b, 0, 0, false, 7, null);
                String h11 = b.h(bVar, this.f18311c, 0, 0, false, 7, null);
                String str2 = this.f18312d;
                if (str2 == null) {
                    throw new IllegalStateException("host == null");
                }
                int b10 = b();
                List<String> list = this.f18314f;
                s10 = ub.v.s(list, 10);
                ArrayList arrayList2 = new ArrayList(s10);
                for (String str3 : list) {
                    arrayList2.add(b.h(u.Companion, str3, 0, 0, false, 7, null));
                }
                List<String> list2 = this.f18315g;
                if (list2 == null) {
                    arrayList = null;
                } else {
                    s11 = ub.v.s(list2, 10);
                    arrayList = new ArrayList(s11);
                    for (String str4 : list2) {
                        arrayList.add(str4 == null ? null : b.h(u.Companion, str4, 0, 0, true, 3, null));
                    }
                }
                String str5 = this.f18316h;
                return new u(str, h10, h11, str2, b10, arrayList2, arrayList, str5 == null ? null : b.h(u.Companion, str5, 0, 0, false, 7, null), toString());
            }
            throw new IllegalStateException("scheme == null");
        }

        public final a c(String str) {
            List<String> list = null;
            if (str != null) {
                b bVar = u.Companion;
                String b10 = b.b(bVar, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                if (b10 != null) {
                    list = bVar.j(b10);
                }
            }
            y(list);
            return this;
        }

        public final String d() {
            return this.f18316h;
        }

        public final String e() {
            return this.f18311c;
        }

        public final List<String> f() {
            return this.f18314f;
        }

        public final List<String> g() {
            return this.f18315g;
        }

        public final String h() {
            return this.f18310b;
        }

        public final String i() {
            return this.f18312d;
        }

        public final int j() {
            return this.f18313e;
        }

        public final String k() {
            return this.f18309a;
        }

        public final a l(String str) {
            hc.t.e(str, "host");
            String e10 = pf.a.e(b.h(u.Companion, str, 0, 0, false, 7, null));
            if (e10 != null) {
                A(e10);
                return this;
            }
            throw new IllegalArgumentException(hc.t.l("unexpected host: ", str));
        }

        public final a o(u uVar, String str) {
            int i10;
            int q10;
            int i11;
            String str2;
            int i12;
            boolean z10;
            String str3;
            int i13;
            boolean z11;
            String Y0;
            boolean F;
            boolean F2;
            String str4 = str;
            hc.t.e(str4, "input");
            int A = pf.d.A(str4, 0, 0, 3, null);
            int C = pf.d.C(str4, A, 0, 2, null);
            C0291a c0291a = Companion;
            int g10 = c0291a.g(str4, A, C);
            String str5 = "this as java.lang.String…ing(startIndex, endIndex)";
            char c10 = 65535;
            boolean z12 = true;
            if (g10 != -1) {
                F = bf.x.F(str4, "https:", A, true);
                if (F) {
                    this.f18309a = "https";
                    A += 6;
                } else {
                    F2 = bf.x.F(str4, "http:", A, true);
                    if (!F2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = str4.substring(0, g10);
                        hc.t.d(substring, str5);
                        sb2.append(substring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f18309a = "http";
                    A += 5;
                }
            } else if (uVar == null) {
                if (str.length() > 6) {
                    Y0 = bf.a0.Y0(str4, 6);
                    str4 = hc.t.l(Y0, "...");
                }
                throw new IllegalArgumentException(hc.t.l("Expected URL scheme 'http' or 'https' but no scheme was found for ", str4));
            } else {
                this.f18309a = uVar.p();
            }
            int h10 = c0291a.h(str4, A, C);
            char c11 = '?';
            char c12 = '#';
            if (h10 >= 2 || uVar == null || !hc.t.a(uVar.p(), this.f18309a)) {
                int i14 = A + h10;
                boolean z13 = false;
                boolean z14 = false;
                while (true) {
                    q10 = pf.d.q(str4, "@/\\?#", i14, C);
                    char charAt = q10 != C ? str4.charAt(q10) : c10;
                    if (charAt == c10 || charAt == c12 || charAt == '/' || charAt == '\\' || charAt == c11) {
                        break;
                    } else if (charAt == '@') {
                        if (!z13) {
                            int p10 = pf.d.p(str4, ':', i14, q10);
                            b bVar = u.Companion;
                            z10 = z12;
                            i12 = C;
                            String str6 = str5;
                            String b10 = b.b(bVar, str, i14, p10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z14) {
                                b10 = this.f18310b + "%40" + b10;
                            }
                            this.f18310b = b10;
                            if (p10 != q10) {
                                this.f18311c = b.b(bVar, str, p10 + 1, q10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z11 = z10;
                            } else {
                                z11 = z13;
                            }
                            z13 = z11;
                            str3 = str6;
                            z14 = z10;
                            i13 = q10;
                        } else {
                            z10 = z12;
                            i12 = C;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f18311c);
                            sb3.append("%40");
                            str3 = str5;
                            i13 = q10;
                            sb3.append(b.b(u.Companion, str, i14, q10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f18311c = sb3.toString();
                        }
                        i14 = i13 + 1;
                        str5 = str3;
                        z12 = z10;
                        C = i12;
                        c12 = '#';
                        c11 = '?';
                        c10 = 65535;
                    }
                }
                boolean z15 = z12;
                String str7 = str5;
                i10 = C;
                C0291a c0291a2 = Companion;
                int f10 = c0291a2.f(str4, i14, q10);
                int i15 = f10 + 1;
                if (i15 < q10) {
                    i11 = i14;
                    this.f18312d = pf.a.e(b.h(u.Companion, str, i14, f10, false, 4, null));
                    int e10 = c0291a2.e(str4, i15, q10);
                    this.f18313e = e10;
                    if (!(e10 != -1 ? z15 : false)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = str4.substring(i15, q10);
                        hc.t.d(substring2, str7);
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                    str2 = str7;
                } else {
                    i11 = i14;
                    str2 = str7;
                    b bVar2 = u.Companion;
                    this.f18312d = pf.a.e(b.h(bVar2, str, i11, f10, false, 4, null));
                    String str8 = this.f18309a;
                    hc.t.b(str8);
                    this.f18313e = bVar2.c(str8);
                }
                if (!(this.f18312d != null ? z15 : false)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = str4.substring(i11, f10);
                    hc.t.d(substring3, str2);
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                A = q10;
            } else {
                this.f18310b = uVar.g();
                this.f18311c = uVar.c();
                this.f18312d = uVar.h();
                this.f18313e = uVar.l();
                this.f18314f.clear();
                this.f18314f.addAll(uVar.e());
                if (A == C || str4.charAt(A) == '#') {
                    c(uVar.f());
                }
                i10 = C;
            }
            int i16 = i10;
            int q11 = pf.d.q(str4, "?#", A, i16);
            u(str4, A, q11);
            if (q11 < i16 && str4.charAt(q11) == '?') {
                int p11 = pf.d.p(str4, '#', q11, i16);
                b bVar3 = u.Companion;
                this.f18315g = bVar3.j(b.b(bVar3, str, q11 + 1, p11, " \"'<>#", true, false, true, false, null, 208, null));
                q11 = p11;
            }
            if (q11 < i16 && str4.charAt(q11) == '#') {
                this.f18316h = b.b(u.Companion, str, q11 + 1, i16, BuildConfig.FLAVOR, true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final a p(String str) {
            hc.t.e(str, "password");
            x(b.b(u.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final a r(int i10) {
            boolean z10 = false;
            if (1 <= i10 && i10 < 65536) {
                z10 = true;
            }
            if (z10) {
                B(i10);
                return this;
            }
            throw new IllegalArgumentException(hc.t.l("unexpected port: ", Integer.valueOf(i10)).toString());
        }

        public final a t() {
            String i10 = i();
            String str = null;
            A(i10 == null ? null : new bf.k("[\"<>^`{|}]").j(i10, BuildConfig.FLAVOR));
            int size = f().size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                f().set(i12, b.b(u.Companion, f().get(i12), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> g10 = g();
            if (g10 != null) {
                int size2 = g10.size();
                while (i11 < size2) {
                    int i13 = i11 + 1;
                    String str2 = g10.get(i11);
                    g10.set(i11, str2 == null ? null : b.b(u.Companion, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null));
                    i11 = i13;
                }
            }
            String d10 = d();
            if (d10 != null) {
                str = b.b(u.Companion, d10, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null);
            }
            w(str);
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
            if ((e().length() > 0) != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
            if (r1 != r2.c(r3)) goto L37;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.k()
                if (r1 == 0) goto L15
                java.lang.String r1 = r6.k()
                r0.append(r1)
                java.lang.String r1 = "://"
                goto L17
            L15:
                java.lang.String r1 = "//"
            L17:
                r0.append(r1)
                java.lang.String r1 = r6.h()
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L28
                r1 = r2
                goto L29
            L28:
                r1 = r3
            L29:
                r4 = 58
                if (r1 != 0) goto L3c
                java.lang.String r1 = r6.e()
                int r1 = r1.length()
                if (r1 <= 0) goto L39
                r1 = r2
                goto L3a
            L39:
                r1 = r3
            L3a:
                if (r1 == 0) goto L60
            L3c:
                java.lang.String r1 = r6.h()
                r0.append(r1)
                java.lang.String r1 = r6.e()
                int r1 = r1.length()
                if (r1 <= 0) goto L4e
                goto L4f
            L4e:
                r2 = r3
            L4f:
                if (r2 == 0) goto L5b
                r0.append(r4)
                java.lang.String r1 = r6.e()
                r0.append(r1)
            L5b:
                r1 = 64
                r0.append(r1)
            L60:
                java.lang.String r1 = r6.i()
                if (r1 == 0) goto L8e
                java.lang.String r1 = r6.i()
                hc.t.b(r1)
                r2 = 2
                r5 = 0
                boolean r1 = bf.o.M(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L87
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.i()
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L8e
            L87:
                java.lang.String r1 = r6.i()
                r0.append(r1)
            L8e:
                int r1 = r6.j()
                r2 = -1
                if (r1 != r2) goto L9b
                java.lang.String r1 = r6.k()
                if (r1 == 0) goto Lba
            L9b:
                int r1 = r6.b()
                java.lang.String r2 = r6.k()
                if (r2 == 0) goto Lb4
                of.u$b r2 = of.u.Companion
                java.lang.String r3 = r6.k()
                hc.t.b(r3)
                int r2 = r2.c(r3)
                if (r1 == r2) goto Lba
            Lb4:
                r0.append(r4)
                r0.append(r1)
            Lba:
                of.u$b r1 = of.u.Companion
                java.util.List r2 = r6.f()
                r1.i(r2, r0)
                java.util.List r2 = r6.g()
                if (r2 == 0) goto Ld8
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.g()
                hc.t.b(r2)
                r1.k(r2, r0)
            Ld8:
                java.lang.String r1 = r6.d()
                if (r1 == 0) goto Lea
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.d()
                r0.append(r1)
            Lea:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                hc.t.d(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: of.u.a.toString():java.lang.String");
        }

        public final a v(String str) {
            boolean v10;
            boolean v11;
            hc.t.e(str, "scheme");
            String str2 = "http";
            v10 = bf.x.v(str, str2, true);
            if (!v10) {
                str2 = "https";
                v11 = bf.x.v(str, str2, true);
                if (!v11) {
                    throw new IllegalArgumentException(hc.t.l("unexpected scheme: ", str));
                }
            }
            C(str2);
            return this;
        }

        public final void w(String str) {
            this.f18316h = str;
        }

        public final void x(String str) {
            hc.t.e(str, "<set-?>");
            this.f18311c = str;
        }

        public final void y(List<String> list) {
            this.f18315g = list;
        }

        public final void z(String str) {
            hc.t.e(str, "<set-?>");
            this.f18310b = str;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0019\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u00109J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\f\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002JV\u0010\u0014\u001a\u00020\n*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0003H\u0007J%\u0010\u001b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u001b\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e*\u00020\u0003H\u0000¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020!*\u00020\u0003H\u0007¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u0004\u0018\u00010!*\u00020\u0003H\u0007¢\u0006\u0004\b$\u0010#J1\u0010%\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b%\u0010&Jc\u0010'\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010*R\u0014\u00101\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010*R\u0014\u00102\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u0010*R\u0014\u00103\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u0010*R\u0014\u00104\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u0010*R\u0014\u00105\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u0010*R\u0014\u00106\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u0010*R\u0014\u00107\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u0010*¨\u0006:"}, d2 = {"Lof/u$b;", BuildConfig.FLAVOR, "Leg/c;", BuildConfig.FLAVOR, "encoded", BuildConfig.FLAVOR, "pos", "limit", BuildConfig.FLAVOR, "plusIsSpace", "Ltb/e0;", "m", "e", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "l", "scheme", "c", BuildConfig.FLAVOR, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "i", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "k", BuildConfig.FLAVOR, "j", "(Ljava/lang/String;)Ljava/util/List;", "Lof/u;", "d", "(Ljava/lang/String;)Lof/u;", "f", "g", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "a", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", BuildConfig.FLAVOR, "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String b(b bVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            return bVar.a(str, (i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? str.length() : i11, str2, (i12 & 8) != 0 ? false : z10, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? null : charset);
        }

        private final boolean e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && pf.d.I(str.charAt(i10 + 1)) != -1 && pf.d.I(str.charAt(i12)) != -1;
        }

        public static /* synthetic */ String h(b bVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return bVar.g(str, i10, i11, z10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
            if (e(r16, r5, r18) == false) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void l(eg.c r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lb9
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L28
                r8 = 9
                if (r7 == r8) goto L23
                r8 = 10
                if (r7 == r8) goto L23
                r8 = 12
                if (r7 == r8) goto L23
                r8 = 13
                if (r7 != r8) goto L28
            L23:
                r8 = r14
                r12 = r19
                goto Lb2
            L28:
                r8 = 43
                if (r7 != r8) goto L39
                if (r22 == 0) goto L39
                if (r20 == 0) goto L33
                java.lang.String r8 = "+"
                goto L35
            L33:
                java.lang.String r8 = "%2B"
            L35:
                r15.Q0(r8)
                goto L23
            L39:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L69
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L69
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L49
                if (r23 == 0) goto L69
            L49:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = bf.o.M(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L67
                if (r7 != r9) goto L62
                if (r20 == 0) goto L67
                if (r21 == 0) goto L62
                r8 = r14
                boolean r10 = r14.e(r1, r5, r2)
                if (r10 != 0) goto L63
                goto L6c
            L62:
                r8 = r14
            L63:
                r15.v1(r7)
                goto Lb2
            L67:
                r8 = r14
                goto L6c
            L69:
                r8 = r14
                r12 = r19
            L6c:
                if (r6 != 0) goto L73
                eg.c r6 = new eg.c
                r6.<init>()
            L73:
                if (r3 == 0) goto L87
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = hc.t.a(r3, r10)
                if (r10 == 0) goto L7e
                goto L87
            L7e:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.s1(r1, r5, r10, r3)
                goto L8a
            L87:
                r6.v1(r7)
            L8a:
                boolean r10 = r6.g0()
                if (r10 != 0) goto Lb2
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.i0(r9)
                char[] r11 = of.u.a()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.i0(r11)
                char[] r11 = of.u.a()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.i0(r10)
                goto L8a
            Lb2:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lb9:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: of.u.b.l(eg.c, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void m(eg.c cVar, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                int codePointAt = str.codePointAt(i10);
                if (codePointAt != 37 || (i12 = i10 + 2) >= i11) {
                    if (codePointAt == 43 && z10) {
                        cVar.i0(32);
                        i10++;
                    }
                    cVar.v1(codePointAt);
                    i10 += Character.charCount(codePointAt);
                } else {
                    int I = pf.d.I(str.charAt(i10 + 1));
                    int I2 = pf.d.I(str.charAt(i12));
                    if (I != -1 && I2 != -1) {
                        cVar.i0((I << 4) + I2);
                        i10 = Character.charCount(codePointAt) + i12;
                    }
                    cVar.v1(codePointAt);
                    i10 += Character.charCount(codePointAt);
                }
            }
        }

        public final String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            boolean M;
            hc.t.e(str, "<this>");
            hc.t.e(str2, "encodeSet");
            int i12 = i10;
            while (i12 < i11) {
                int codePointAt = str.codePointAt(i12);
                if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z13)) {
                    M = bf.y.M(str2, (char) codePointAt, false, 2, null);
                    if (!M) {
                        if (codePointAt == 37) {
                            if (z10) {
                                if (z11) {
                                    if (!e(str, i12, i11)) {
                                        eg.c cVar = new eg.c();
                                        cVar.x(str, i10, i12);
                                        l(cVar, str, i12, i11, str2, z10, z11, z12, z13, charset);
                                        return cVar.O0();
                                    }
                                    if (codePointAt != 43 && z12) {
                                        eg.c cVar2 = new eg.c();
                                        cVar2.x(str, i10, i12);
                                        l(cVar2, str, i12, i11, str2, z10, z11, z12, z13, charset);
                                        return cVar2.O0();
                                    }
                                    i12 += Character.charCount(codePointAt);
                                }
                            }
                        }
                        if (codePointAt != 43) {
                        }
                        i12 += Character.charCount(codePointAt);
                    }
                }
                eg.c cVar22 = new eg.c();
                cVar22.x(str, i10, i12);
                l(cVar22, str, i12, i11, str2, z10, z11, z12, z13, charset);
                return cVar22.O0();
            }
            String substring = str.substring(i10, i11);
            hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        @fc.c
        public final int c(String str) {
            hc.t.e(str, "scheme");
            if (hc.t.a(str, "http")) {
                return 80;
            }
            return hc.t.a(str, "https") ? 443 : -1;
        }

        @fc.c
        public final u d(String str) {
            hc.t.e(str, "<this>");
            return new a().o(null, str).a();
        }

        @fc.c
        public final u f(String str) {
            hc.t.e(str, "<this>");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String g(String str, int i10, int i11, boolean z10) {
            hc.t.e(str, "<this>");
            int i12 = i10;
            while (i12 < i11) {
                int i13 = i12 + 1;
                char charAt = str.charAt(i12);
                if (charAt == '%' || (charAt == '+' && z10)) {
                    eg.c cVar = new eg.c();
                    cVar.x(str, i10, i12);
                    m(cVar, str, i12, i11, z10);
                    return cVar.O0();
                }
                i12 = i13;
            }
            String substring = str.substring(i10, i11);
            hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final void i(List<String> list, StringBuilder sb2) {
            hc.t.e(list, "<this>");
            hc.t.e(sb2, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append(list.get(i10));
            }
        }

        public final List<String> j(String str) {
            int Z;
            int Z2;
            String str2;
            hc.t.e(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                Z = bf.y.Z(str, '&', i10, false, 4, null);
                if (Z == -1) {
                    Z = str.length();
                }
                int i11 = Z;
                Z2 = bf.y.Z(str, '=', i10, false, 4, null);
                if (Z2 == -1 || Z2 > i11) {
                    String substring = str.substring(i10, i11);
                    hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    str2 = null;
                } else {
                    String substring2 = str.substring(i10, Z2);
                    hc.t.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    str2 = str.substring(Z2 + 1, i11);
                    hc.t.d(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(str2);
                i10 = i11 + 1;
            }
            return arrayList;
        }

        public final void k(List<String> list, StringBuilder sb2) {
            nc.g i10;
            nc.e h10;
            hc.t.e(list, "<this>");
            hc.t.e(sb2, "out");
            i10 = nc.m.i(0, list.size());
            h10 = nc.m.h(i10, 2);
            int a10 = h10.a();
            int b10 = h10.b();
            int d10 = h10.d();
            if ((d10 <= 0 || a10 > b10) && (d10 >= 0 || b10 > a10)) {
                return;
            }
            while (true) {
                int i11 = a10 + d10;
                String str = list.get(a10);
                String str2 = list.get(a10 + 1);
                if (a10 > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (a10 == b10) {
                    return;
                }
                a10 = i11;
            }
        }
    }

    public u(String str, String str2, String str3, String str4, int i10, List<String> list, List<String> list2, String str5, String str6) {
        hc.t.e(str, "scheme");
        hc.t.e(str2, "username");
        hc.t.e(str3, "password");
        hc.t.e(str4, "host");
        hc.t.e(list, "pathSegments");
        hc.t.e(str6, "url");
        this.f18299a = str;
        this.f18300b = str2;
        this.f18301c = str3;
        this.f18302d = str4;
        this.f18303e = i10;
        this.f18304f = list;
        this.f18305g = list2;
        this.f18306h = str5;
        this.f18307i = str6;
        this.f18308j = hc.t.a(str, "https");
    }

    public final String b() {
        int Z;
        if (this.f18306h == null) {
            return null;
        }
        Z = bf.y.Z(this.f18307i, '#', 0, false, 6, null);
        String substring = this.f18307i.substring(Z + 1);
        hc.t.d(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String c() {
        int Z;
        int Z2;
        if (this.f18301c.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        Z = bf.y.Z(this.f18307i, ':', this.f18299a.length() + 3, false, 4, null);
        Z2 = bf.y.Z(this.f18307i, '@', 0, false, 6, null);
        String substring = this.f18307i.substring(Z + 1, Z2);
        hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String d() {
        int Z;
        Z = bf.y.Z(this.f18307i, '/', this.f18299a.length() + 3, false, 4, null);
        String str = this.f18307i;
        String substring = this.f18307i.substring(Z, pf.d.q(str, "?#", Z, str.length()));
        hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final List<String> e() {
        int Z;
        Z = bf.y.Z(this.f18307i, '/', this.f18299a.length() + 3, false, 4, null);
        String str = this.f18307i;
        int q10 = pf.d.q(str, "?#", Z, str.length());
        ArrayList arrayList = new ArrayList();
        while (Z < q10) {
            int i10 = Z + 1;
            int p10 = pf.d.p(this.f18307i, '/', i10, q10);
            String substring = this.f18307i.substring(i10, p10);
            hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            Z = p10;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && hc.t.a(((u) obj).f18307i, this.f18307i);
    }

    public final String f() {
        int Z;
        if (this.f18305g == null) {
            return null;
        }
        Z = bf.y.Z(this.f18307i, '?', 0, false, 6, null);
        int i10 = Z + 1;
        String str = this.f18307i;
        String substring = this.f18307i.substring(i10, pf.d.p(str, '#', i10, str.length()));
        hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String g() {
        if (this.f18300b.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        int length = this.f18299a.length() + 3;
        String str = this.f18307i;
        String substring = this.f18307i.substring(length, pf.d.q(str, ":@", length, str.length()));
        hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String h() {
        return this.f18302d;
    }

    public int hashCode() {
        return this.f18307i.hashCode();
    }

    public final boolean i() {
        return this.f18308j;
    }

    public final a j() {
        a aVar = new a();
        aVar.C(this.f18299a);
        aVar.z(g());
        aVar.x(c());
        aVar.A(this.f18302d);
        aVar.B(this.f18303e != Companion.c(this.f18299a) ? this.f18303e : -1);
        aVar.f().clear();
        aVar.f().addAll(e());
        aVar.c(f());
        aVar.w(b());
        return aVar;
    }

    public final a k(String str) {
        hc.t.e(str, "link");
        try {
            return new a().o(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int l() {
        return this.f18303e;
    }

    public final String m() {
        if (this.f18305g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Companion.k(this.f18305g, sb2);
        return sb2.toString();
    }

    public final String n() {
        a k10 = k("/...");
        hc.t.b(k10);
        return k10.D(BuildConfig.FLAVOR).p(BuildConfig.FLAVOR).a().toString();
    }

    public final u o(String str) {
        hc.t.e(str, "link");
        a k10 = k(str);
        if (k10 == null) {
            return null;
        }
        return k10.a();
    }

    public final String p() {
        return this.f18299a;
    }

    public final URI q() {
        String aVar = j().t().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e10) {
            try {
                URI create = URI.create(new bf.k("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").j(aVar, BuildConfig.FLAVOR));
                hc.t.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL r() {
        try {
            return new URL(this.f18307i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f18307i;
    }
}
