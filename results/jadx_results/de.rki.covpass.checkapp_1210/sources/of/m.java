package of;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001'BQ\b\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003¢\u0006\u0004\b%\u0010&J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0017J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0019\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u001b\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010!\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010#\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001e¨\u0006("}, d2 = {"Lof/m;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "forObsoleteRfc2965", "m", "(Z)Ljava/lang/String;", "name", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "value", "n", BuildConfig.FLAVOR, "expiresAt", "J", "f", "()J", "domain", "e", "path", "j", "secure", "Z", "l", "()Z", "httpOnly", "h", "persistent", "k", "hostOnly", "g", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "a", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class m {
    public static final a Companion = new a(null);

    /* renamed from: j */
    private static final Pattern f18263j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    private static final Pattern f18264k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    private static final Pattern f18265l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    private static final Pattern f18266m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    private final String f18267a;

    /* renamed from: b */
    private final String f18268b;

    /* renamed from: c */
    private final long f18269c;

    /* renamed from: d */
    private final String f18270d;

    /* renamed from: e */
    private final String f18271e;

    /* renamed from: f */
    private final boolean f18272f;

    /* renamed from: g */
    private final boolean f18273g;

    /* renamed from: h */
    private final boolean f18274h;

    /* renamed from: i */
    private final boolean f18275i;

    @Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0007J)\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0007R\u001c\u0010 \u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010#\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u001c\u0010$\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010!¨\u0006'"}, d2 = {"Lof/m$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "urlHost", "domain", BuildConfig.FLAVOR, "b", "s", BuildConfig.FLAVOR, "pos", "limit", BuildConfig.FLAVOR, "g", "input", "invert", "a", "h", "f", "Lof/u;", "url", "setCookie", "Lof/m;", "c", "currentTimeMillis", "d", "(JLof/u;Ljava/lang/String;)Lof/m;", "Lof/t;", "headers", BuildConfig.FLAVOR, "e", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x003f, code lost:
            if (r1 != ':') goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final int a(java.lang.String r6, int r7, int r8, boolean r9) {
            /*
                r5 = this;
            L0:
                if (r7 >= r8) goto L49
                int r0 = r7 + 1
                char r1 = r6.charAt(r7)
                r2 = 32
                r3 = 1
                r4 = 0
                if (r1 >= r2) goto L12
                r2 = 9
                if (r1 != r2) goto L41
            L12:
                r2 = 127(0x7f, float:1.78E-43)
                if (r1 >= r2) goto L41
                r2 = 57
                if (r1 > r2) goto L20
                r2 = 48
                if (r2 > r1) goto L20
                r2 = r3
                goto L21
            L20:
                r2 = r4
            L21:
                if (r2 != 0) goto L41
                r2 = 122(0x7a, float:1.71E-43)
                if (r1 > r2) goto L2d
                r2 = 97
                if (r2 > r1) goto L2d
                r2 = r3
                goto L2e
            L2d:
                r2 = r4
            L2e:
                if (r2 != 0) goto L41
                r2 = 90
                if (r1 > r2) goto L3a
                r2 = 65
                if (r2 > r1) goto L3a
                r2 = r3
                goto L3b
            L3a:
                r2 = r4
            L3b:
                if (r2 != 0) goto L41
                r2 = 58
                if (r1 != r2) goto L42
            L41:
                r4 = r3
            L42:
                r1 = r9 ^ 1
                if (r4 != r1) goto L47
                return r7
            L47:
                r7 = r0
                goto L0
            L49:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: of.m.a.a(java.lang.String, int, int, boolean):int");
        }

        private final boolean b(String str, String str2) {
            boolean u10;
            if (hc.t.a(str, str2)) {
                return true;
            }
            u10 = bf.x.u(str, str2, false, 2, null);
            return u10 && str.charAt((str.length() - str2.length()) - 1) == '.' && !pf.d.i(str);
        }

        private final String f(String str) {
            boolean u10;
            String p02;
            u10 = bf.x.u(str, ".", false, 2, null);
            if (!u10) {
                p02 = bf.y.p0(str, ".");
                String e10 = pf.a.e(p02);
                if (e10 == null) {
                    throw new IllegalArgumentException();
                }
                return e10;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long g(String str, int i10, int i11) {
            int a02;
            int a10 = a(str, i10, i11, false);
            Matcher matcher = m.f18266m.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            while (a10 < i11) {
                int a11 = a(str, a10 + 1, i11, true);
                matcher.region(a10, a11);
                if (i13 == -1 && matcher.usePattern(m.f18266m).matches()) {
                    String group = matcher.group(1);
                    hc.t.d(group, "matcher.group(1)");
                    i13 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    hc.t.d(group2, "matcher.group(2)");
                    i16 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    hc.t.d(group3, "matcher.group(3)");
                    i17 = Integer.parseInt(group3);
                } else if (i14 == -1 && matcher.usePattern(m.f18265l).matches()) {
                    String group4 = matcher.group(1);
                    hc.t.d(group4, "matcher.group(1)");
                    i14 = Integer.parseInt(group4);
                } else if (i15 == -1 && matcher.usePattern(m.f18264k).matches()) {
                    String group5 = matcher.group(1);
                    hc.t.d(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    hc.t.d(locale, "US");
                    String lowerCase = group5.toLowerCase(locale);
                    hc.t.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String pattern = m.f18264k.pattern();
                    hc.t.d(pattern, "MONTH_PATTERN.pattern()");
                    a02 = bf.y.a0(pattern, lowerCase, 0, false, 6, null);
                    i15 = a02 / 4;
                } else if (i12 == -1 && matcher.usePattern(m.f18263j).matches()) {
                    String group6 = matcher.group(1);
                    hc.t.d(group6, "matcher.group(1)");
                    i12 = Integer.parseInt(group6);
                }
                a10 = a(str, a11 + 1, i11, false);
            }
            if (70 <= i12 && i12 < 100) {
                i12 += 1900;
            }
            if (i12 >= 0 && i12 < 70) {
                i12 += 2000;
            }
            if (i12 >= 1601) {
                if (!(i15 != -1)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (!(1 <= i14 && i14 < 32)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (!(i13 >= 0 && i13 < 24)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (!(i16 >= 0 && i16 < 60)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                if (!(i17 >= 0 && i17 < 60)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(pf.d.f19193f);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, i12);
                gregorianCalendar.set(2, i15 - 1);
                gregorianCalendar.set(5, i14);
                gregorianCalendar.set(11, i13);
                gregorianCalendar.set(12, i16);
                gregorianCalendar.set(13, i17);
                gregorianCalendar.set(14, 0);
                return gregorianCalendar.getTimeInMillis();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long h(String str) {
            boolean I;
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 0) {
                    return parseLong;
                }
                return Long.MIN_VALUE;
            } catch (NumberFormatException e10) {
                if (!new bf.k("-?\\d+").h(str)) {
                    throw e10;
                }
                I = bf.x.I(str, "-", false, 2, null);
                return I ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
        }

        @fc.c
        public final m c(u uVar, String str) {
            hc.t.e(uVar, "url");
            hc.t.e(str, "setCookie");
            return d(System.currentTimeMillis(), uVar, str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x0102, code lost:
            if (r1 > 253402300799999L) goto L56;
         */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x015a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final of.m d(long r26, of.u r28, java.lang.String r29) {
            /*
                Method dump skipped, instructions count: 368
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: of.m.a.d(long, of.u, java.lang.String):of.m");
        }

        @fc.c
        public final List<m> e(u uVar, t tVar) {
            List<m> h10;
            hc.t.e(uVar, "url");
            hc.t.e(tVar, "headers");
            List<String> k10 = tVar.k("Set-Cookie");
            int size = k10.size();
            ArrayList arrayList = null;
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                m c10 = c(uVar, k10.get(i10));
                if (c10 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c10);
                }
                i10 = i11;
            }
            if (arrayList == null) {
                h10 = ub.u.h();
                return h10;
            }
            List<m> unmodifiableList = Collections.unmodifiableList(arrayList);
            hc.t.d(unmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return unmodifiableList;
        }
    }

    private m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f18267a = str;
        this.f18268b = str2;
        this.f18269c = j10;
        this.f18270d = str3;
        this.f18271e = str4;
        this.f18272f = z10;
        this.f18273g = z11;
        this.f18274h = z12;
        this.f18275i = z13;
    }

    public /* synthetic */ m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }

    public final String e() {
        return this.f18270d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (hc.t.a(mVar.f18267a, this.f18267a) && hc.t.a(mVar.f18268b, this.f18268b) && mVar.f18269c == this.f18269c && hc.t.a(mVar.f18270d, this.f18270d) && hc.t.a(mVar.f18271e, this.f18271e) && mVar.f18272f == this.f18272f && mVar.f18273g == this.f18273g && mVar.f18274h == this.f18274h && mVar.f18275i == this.f18275i) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return this.f18269c;
    }

    public final boolean g() {
        return this.f18275i;
    }

    public final boolean h() {
        return this.f18273g;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.f18267a.hashCode()) * 31) + this.f18268b.hashCode()) * 31) + de.rki.covpass.sdk.cert.models.d.a(this.f18269c)) * 31) + this.f18270d.hashCode()) * 31) + this.f18271e.hashCode()) * 31) + fb.x.a(this.f18272f)) * 31) + fb.x.a(this.f18273g)) * 31) + fb.x.a(this.f18274h)) * 31) + fb.x.a(this.f18275i);
    }

    public final String i() {
        return this.f18267a;
    }

    public final String j() {
        return this.f18271e;
    }

    public final boolean k() {
        return this.f18274h;
    }

    public final boolean l() {
        return this.f18272f;
    }

    public final String m(boolean z10) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i());
        sb2.append('=');
        sb2.append(n());
        if (k()) {
            if (f() == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb2.append("; expires=");
                str = uf.c.b(new Date(f()));
            }
            sb2.append(str);
        }
        if (!g()) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(e());
        }
        sb2.append("; path=");
        sb2.append(j());
        if (l()) {
            sb2.append("; secure");
        }
        if (h()) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        hc.t.d(sb3, "toString()");
        return sb3;
    }

    public final String n() {
        return this.f18268b;
    }

    public String toString() {
        return m(false);
    }
}
