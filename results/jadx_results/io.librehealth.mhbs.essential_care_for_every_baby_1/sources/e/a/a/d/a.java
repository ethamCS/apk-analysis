package e.a.a.d;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
/* loaded from: classes.dex */
public class a implements Serializable, Cloneable {
    protected static final Map<String, Integer> q;
    protected static final Map<String, Integer> r;

    /* renamed from: a */
    private final String f727a;

    /* renamed from: c */
    protected transient TreeSet<Integer> f729c;

    /* renamed from: d */
    protected transient TreeSet<Integer> f730d;

    /* renamed from: e */
    protected transient TreeSet<Integer> f731e;
    protected transient TreeSet<Integer> f;
    protected transient TreeSet<Integer> g;
    protected transient TreeSet<Integer> h;
    protected transient TreeSet<Integer> i;
    protected static final Integer o = 99;
    protected static final Integer p = 98;
    public static final int s = Calendar.getInstance().get(1) + 100;

    /* renamed from: b */
    private TimeZone f728b = null;
    protected transient boolean j = false;
    protected transient int k = 0;
    protected transient boolean l = false;
    protected transient boolean m = false;
    protected transient int n = 0;

    static {
        HashMap hashMap = new HashMap(20);
        q = hashMap;
        HashMap hashMap2 = new HashMap(60);
        r = hashMap2;
        hashMap.put("JAN", 0);
        hashMap.put("FEB", 1);
        hashMap.put("MAR", 2);
        hashMap.put("APR", 3);
        hashMap.put("MAY", 4);
        hashMap.put("JUN", 5);
        hashMap.put("JUL", 6);
        hashMap.put("AUG", 7);
        hashMap.put("SEP", 8);
        hashMap.put("OCT", 9);
        hashMap.put("NOV", 10);
        hashMap.put("DEC", 11);
        hashMap2.put("SUN", 1);
        hashMap2.put("MON", 2);
        hashMap2.put("TUE", 3);
        hashMap2.put("WED", 4);
        hashMap2.put("THU", 5);
        hashMap2.put("FRI", 6);
        hashMap2.put("SAT", 7);
    }

    public a(a aVar) {
        String f = aVar.f();
        this.f727a = f;
        try {
            b(f);
            if (aVar.n() == null) {
                return;
            }
            s((TimeZone) aVar.n().clone());
        } catch (ParseException unused) {
            throw new AssertionError();
        }
    }

    public a(String str) {
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.US);
            this.f727a = upperCase;
            b(upperCase);
            return;
        }
        throw new IllegalArgumentException("cronExpression cannot be null");
    }

    private void c(int i, int i2, int i3) {
        if (i > 59 && (i2 == 0 || i2 == 1)) {
            throw new ParseException("Increment > 60 : " + i, i3);
        } else if (i > 23 && i2 == 2) {
            throw new ParseException("Increment > 24 : " + i, i3);
        } else if (i > 31 && i2 == 3) {
            throw new ParseException("Increment > 31 : " + i, i3);
        } else if (i > 7 && i2 == 5) {
            throw new ParseException("Increment > 7 : " + i, i3);
        } else if (i <= 12 || i2 != 4) {
        } else {
            throw new ParseException("Increment > 12 : " + i, i3);
        }
    }

    public static boolean q(String str) {
        try {
            new a(str);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b1, code lost:
        if (r0 != 99) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bc, code lost:
        if (r0 != 99) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c8, code lost:
        if (r0 != 99) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d2, code lost:
        if (r0 != 99) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00e9, code lost:
        if (r0 != 99) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void a(int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.d.a.a(int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0092, code lost:
        if (r3.indexOf(76) == (-1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
        if (r3.length() <= 1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009e, code lost:
        if (r3.contains(",") != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a8, code lost:
        throw new java.text.ParseException("Support for specifying 'L' with other days of the week is not implemented", -1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void b(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.d.a.b(java.lang.String):void");
    }

    @Deprecated
    public Object clone() {
        return new a(this);
    }

    protected int d(int i, String str, int i2, int i3) {
        if (i >= str.length()) {
            a(i2, -1, -1, i3);
            return i;
        }
        char charAt = str.charAt(i);
        if (charAt == 'L') {
            if (i3 != 5) {
                throw new ParseException("'L' option is not valid here. (pos=" + i + ")", i);
            } else if (i2 < 1 || i2 > 7) {
                throw new ParseException("Day-of-Week values must be between 1 and 7", -1);
            } else {
                this.j = true;
                l(i3).add(Integer.valueOf(i2));
                return i + 1;
            }
        } else if (charAt == 'W') {
            if (i3 == 3) {
                this.m = true;
                if (i2 > 31) {
                    throw new ParseException("The 'W' option does not make sense with values larger than 31 (max number of days in a month)", i);
                }
                l(i3).add(Integer.valueOf(i2));
                return i + 1;
            }
            throw new ParseException("'W' option is not valid here. (pos=" + i + ")", i);
        } else if (charAt == '#') {
            if (i3 != 5) {
                throw new ParseException("'#' option is not valid here. (pos=" + i + ")", i);
            }
            int i4 = i + 1;
            try {
                int parseInt = Integer.parseInt(str.substring(i4));
                this.k = parseInt;
                if (parseInt < 1 || parseInt > 5) {
                    throw new Exception();
                }
                l(i3).add(Integer.valueOf(i2));
                return i4 + 1;
            } catch (Exception unused) {
                throw new ParseException("A numeric value between 1 and 5 must follow the '#' option", i4);
            }
        } else if (charAt != '-') {
            if (charAt != '/') {
                a(i2, -1, 0, i3);
                return i + 1;
            }
            int i5 = i + 1;
            if (i5 >= str.length() || str.charAt(i5) == ' ' || str.charAt(i5) == '\t') {
                throw new ParseException("'/' must be followed by an integer.", i);
            }
            int parseInt2 = Integer.parseInt(String.valueOf(str.charAt(i5)));
            int i6 = i5 + 1;
            if (i6 >= str.length()) {
                c(parseInt2, i3, i6);
                a(i2, -1, parseInt2, i3);
                return i6;
            }
            char charAt2 = str.charAt(i6);
            if (charAt2 < '0' || charAt2 > '9') {
                throw new ParseException("Unexpected character '" + charAt2 + "' after '/'", i6);
            }
            b o2 = o(parseInt2, str, i6);
            int i7 = o2.f732a;
            c(i7, i3, i6);
            a(i2, -1, i7, i3);
            return o2.f733b;
        } else {
            int i8 = i + 1;
            int parseInt3 = Integer.parseInt(String.valueOf(str.charAt(i8)));
            int i9 = i8 + 1;
            if (i9 >= str.length()) {
                a(i2, parseInt3, 1, i3);
                return i9;
            }
            char charAt3 = str.charAt(i9);
            if (charAt3 >= '0' && charAt3 <= '9') {
                b o3 = o(parseInt3, str, i9);
                parseInt3 = o3.f732a;
                i9 = o3.f733b;
            }
            if (i9 >= str.length() || str.charAt(i9) != '/') {
                a(i2, parseInt3, 1, i3);
                return i9;
            }
            int i10 = i9 + 1;
            int parseInt4 = Integer.parseInt(String.valueOf(str.charAt(i10)));
            int i11 = i10 + 1;
            if (i11 >= str.length()) {
                a(i2, parseInt3, parseInt4, i3);
                return i11;
            }
            char charAt4 = str.charAt(i11);
            if (charAt4 < '0' || charAt4 > '9') {
                a(i2, parseInt3, parseInt4, i3);
                return i11;
            }
            b o4 = o(parseInt4, str, i11);
            a(i2, parseInt3, o4.f732a, i3);
            return o4.f733b;
        }
    }

    protected int e(int i, String str) {
        while (i < str.length() && (str.charAt(i) != ' ' || str.charAt(i) != '\t')) {
            i++;
        }
        return i;
    }

    public String f() {
        return this.f727a;
    }

    protected int g(String str) {
        Integer num = r.get(str);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    protected int h(int i, int i2) {
        switch (i) {
            case 1:
                return 31;
            case 2:
                return p(i2) ? 29 : 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                throw new IllegalArgumentException("Illegal month number: " + i);
        }
    }

    protected int i(String str) {
        Integer num = q.get(str);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public Date j(Date date) {
        return m(date);
    }

    protected int k(String str, int i) {
        return Integer.parseInt(str.substring(i, e(i, str)));
    }

    TreeSet<Integer> l(int i) {
        switch (i) {
            case 0:
                return this.f729c;
            case 1:
                return this.f730d;
            case 2:
                return this.f731e;
            case 3:
                return this.f;
            case 4:
                return this.g;
            case 5:
                return this.h;
            case 6:
                return this.i;
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x024c, code lost:
        if (r6.getTime().before(r2) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0269, code lost:
        if (r4 > h(r15, r1.get(1))) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x026b, code lost:
        r4 = r17.f.first().intValue();
        r6 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x027a, code lost:
        r6 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0420 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Date m(java.util.Date r18) {
        /*
            Method dump skipped, instructions count: 1229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.d.a.m(java.util.Date):java.util.Date");
    }

    public TimeZone n() {
        if (this.f728b == null) {
            this.f728b = TimeZone.getDefault();
        }
        return this.f728b;
    }

    protected b o(int i, String str, int i2) {
        char charAt = str.charAt(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(i));
        while (charAt >= '0' && charAt <= '9') {
            sb.append(charAt);
            i2++;
            if (i2 >= str.length()) {
                break;
            }
            charAt = str.charAt(i2);
        }
        b bVar = new b();
        if (i2 >= str.length()) {
            i2++;
        }
        bVar.f733b = i2;
        bVar.f732a = Integer.parseInt(sb.toString());
        return bVar;
    }

    protected boolean p(int i) {
        return (i % 4 == 0 && i % 100 != 0) || i % 400 == 0;
    }

    protected void r(Calendar calendar, int i) {
        calendar.set(11, i);
        if (calendar.get(11) == i || i == 24) {
            return;
        }
        calendar.set(11, i + 1);
    }

    public void s(TimeZone timeZone) {
        this.f728b = timeZone;
    }

    protected int t(int i, String str) {
        while (i < str.length() && (str.charAt(i) == ' ' || str.charAt(i) == '\t')) {
            i++;
        }
        return i;
    }

    public String toString() {
        return this.f727a;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected int u(int r13, java.lang.String r14, int r15) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.d.a.u(int, java.lang.String, int):int");
    }
}
