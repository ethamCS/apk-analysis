package e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class q {
    private static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    private final String f4379a;

    /* renamed from: b */
    private final String f4380b;

    /* renamed from: c */
    private final long f4381c;

    /* renamed from: d */
    private final String f4382d;

    /* renamed from: e */
    private final String f4383e;

    /* renamed from: f */
    private final boolean f4384f;

    /* renamed from: g */
    private final boolean f4385g;

    /* renamed from: h */
    private final boolean f4386h;
    private final boolean i;

    private q(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f4379a = str;
        this.f4380b = str2;
        this.f4381c = j2;
        this.f4382d = str3;
        this.f4383e = str4;
        this.f4384f = z;
        this.f4385g = z2;
        this.i = z3;
        this.f4386h = z4;
    }

    private static int a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static boolean b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !e.m0.e.K(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0128  */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static e.q d(long r23, e.z r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.q.d(long, e.z, java.lang.String):e.q");
    }

    @Nullable
    public static q e(z zVar, String str) {
        return d(System.currentTimeMillis(), zVar, str);
    }

    public static List<q> f(z zVar, y yVar) {
        List<String> j2 = yVar.j("Set-Cookie");
        int size = j2.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            q e2 = e(zVar, j2.get(i));
            if (e2 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(e2);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    private static String g(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String c2 = e.m0.e.c(str);
            if (c2 == null) {
                throw new IllegalArgumentException();
            }
            return c2;
        }
        throw new IllegalArgumentException();
    }

    private static long h(String str, int i, int i2) {
        int a2 = a(str, i, i2, false);
        Matcher matcher = m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a2 < i2) {
            int a3 = a(str, a2 + 1, i2, true);
            matcher.region(a2, a3);
            if (i4 == -1 && matcher.usePattern(m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 != -1 || !matcher.usePattern(l).matches()) {
                if (i6 == -1) {
                    Pattern pattern = k;
                    if (matcher.usePattern(pattern).matches()) {
                        i6 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i5 = Integer.parseInt(matcher.group(1));
            }
            a2 = a(str, a3 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 >= 1601) {
            if (i6 == -1) {
                throw new IllegalArgumentException();
            }
            if (i5 < 1 || i5 > 31) {
                throw new IllegalArgumentException();
            }
            if (i4 < 0 || i4 > 23) {
                throw new IllegalArgumentException();
            }
            if (i7 < 0 || i7 > 59) {
                throw new IllegalArgumentException();
            }
            if (i8 < 0 || i8 > 59) {
                throw new IllegalArgumentException();
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(e.m0.e.f4069h);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
        throw new IllegalArgumentException();
    }

    private static long i(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 0) {
                return parseLong;
            }
            return Long.MIN_VALUE;
        } catch (NumberFormatException e2) {
            if (!str.matches("-?\\d+")) {
                throw e2;
            }
            return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }

    public String c() {
        return this.f4379a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f4379a.equals(this.f4379a) && qVar.f4380b.equals(this.f4380b) && qVar.f4382d.equals(this.f4382d) && qVar.f4383e.equals(this.f4383e) && qVar.f4381c == this.f4381c && qVar.f4384f == this.f4384f && qVar.f4385g == this.f4385g && qVar.f4386h == this.f4386h && qVar.i == this.i;
    }

    public int hashCode() {
        long j2 = this.f4381c;
        return ((((((((((((((((527 + this.f4379a.hashCode()) * 31) + this.f4380b.hashCode()) * 31) + this.f4382d.hashCode()) * 31) + this.f4383e.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (!this.f4384f ? 1 : 0)) * 31) + (!this.f4385g ? 1 : 0)) * 31) + (!this.f4386h ? 1 : 0)) * 31) + (!this.i ? 1 : 0);
    }

    String j(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4379a);
        sb.append('=');
        sb.append(this.f4380b);
        if (this.f4386h) {
            if (this.f4381c == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb.append("; expires=");
                str = e.m0.i.d.a(new Date(this.f4381c));
            }
            sb.append(str);
        }
        if (!this.i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f4382d);
        }
        sb.append("; path=");
        sb.append(this.f4383e);
        if (this.f4384f) {
            sb.append("; secure");
        }
        if (this.f4385g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public String k() {
        return this.f4380b;
    }

    public String toString() {
        return j(false);
    }
}
