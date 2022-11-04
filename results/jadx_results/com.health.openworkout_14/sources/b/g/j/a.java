package b.g.j;

import android.text.SpannableStringBuilder;
import java.util.Locale;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d */
    static final d f2450d;

    /* renamed from: e */
    private static final String f2451e = Character.toString(8206);

    /* renamed from: f */
    private static final String f2452f = Character.toString(8207);

    /* renamed from: g */
    static final a f2453g;

    /* renamed from: h */
    static final a f2454h;

    /* renamed from: a */
    private final boolean f2455a;

    /* renamed from: b */
    private final int f2456b;

    /* renamed from: c */
    private final d f2457c;

    /* renamed from: b.g.j.a$a */
    /* loaded from: classes.dex */
    public static final class C0048a {

        /* renamed from: a */
        private boolean f2458a;

        /* renamed from: b */
        private int f2459b;

        /* renamed from: c */
        private d f2460c;

        public C0048a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z) {
            return z ? a.f2454h : a.f2453g;
        }

        private void c(boolean z) {
            this.f2458a = z;
            this.f2460c = a.f2450d;
            this.f2459b = 2;
        }

        public a a() {
            return (this.f2459b == 2 && this.f2460c == a.f2450d) ? b(this.f2458a) : new a(this.f2458a, this.f2459b, this.f2460c);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: f */
        private static final byte[] f2461f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f2462a;

        /* renamed from: b */
        private final boolean f2463b;

        /* renamed from: c */
        private final int f2464c;

        /* renamed from: d */
        private int f2465d;

        /* renamed from: e */
        private char f2466e;

        static {
            for (int i = 0; i < 1792; i++) {
                f2461f[i] = Character.getDirectionality(i);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.f2462a = charSequence;
            this.f2463b = z;
            this.f2464c = charSequence.length();
        }

        private static byte c(char c2) {
            return c2 < 1792 ? f2461f[c2] : Character.getDirectionality(c2);
        }

        private byte f() {
            char charAt;
            int i = this.f2465d;
            do {
                int i2 = this.f2465d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2462a;
                int i3 = i2 - 1;
                this.f2465d = i3;
                charAt = charSequence.charAt(i3);
                this.f2466e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f2465d = i;
            this.f2466e = ';';
            return (byte) 13;
        }

        private byte g() {
            char charAt;
            do {
                int i = this.f2465d;
                if (i >= this.f2464c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f2462a;
                this.f2465d = i + 1;
                charAt = charSequence.charAt(i);
                this.f2466e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char charAt;
            int i = this.f2465d;
            while (true) {
                int i2 = this.f2465d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2462a;
                int i3 = i2 - 1;
                this.f2465d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f2466e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f2465d;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.f2462a;
                            int i5 = i4 - 1;
                            this.f2465d = i5;
                            charAt = charSequence2.charAt(i5);
                            this.f2466e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f2465d = i;
            this.f2466e = '>';
            return (byte) 13;
        }

        private byte i() {
            char charAt;
            int i = this.f2465d;
            while (true) {
                int i2 = this.f2465d;
                if (i2 >= this.f2464c) {
                    this.f2465d = i;
                    this.f2466e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f2462a;
                this.f2465d = i2 + 1;
                char charAt2 = charSequence.charAt(i2);
                this.f2466e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i3 = this.f2465d;
                        if (i3 < this.f2464c) {
                            CharSequence charSequence2 = this.f2462a;
                            this.f2465d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f2466e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }

        byte a() {
            char charAt = this.f2462a.charAt(this.f2465d - 1);
            this.f2466e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f2462a, this.f2465d);
                this.f2465d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2465d--;
            byte c2 = c(this.f2466e);
            if (!this.f2463b) {
                return c2;
            }
            char c3 = this.f2466e;
            return c3 == '>' ? h() : c3 == ';' ? f() : c2;
        }

        byte b() {
            char charAt = this.f2462a.charAt(this.f2465d);
            this.f2466e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f2462a, this.f2465d);
                this.f2465d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f2465d++;
            byte c2 = c(this.f2466e);
            if (!this.f2463b) {
                return c2;
            }
            char c3 = this.f2466e;
            return c3 == '<' ? i() : c3 == '&' ? g() : c2;
        }

        int d() {
            this.f2465d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f2465d < this.f2464c && i == 0) {
                byte b2 = b();
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                break;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                break;
                            case 18:
                                i3--;
                                i2 = 0;
                                break;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f2465d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        int e() {
            this.f2465d = this.f2464c;
            int i = 0;
            int i2 = 0;
            while (this.f2465d > 0) {
                byte a2 = a();
                if (a2 != 0) {
                    if (a2 == 1 || a2 == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                            i2 = i;
                        }
                    } else if (a2 != 9) {
                        switch (a2) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    i2 = i;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else if (i == 0) {
                    return -1;
                } else {
                    if (i2 == 0) {
                        i2 = i;
                    }
                }
            }
            return 0;
        }
    }

    static {
        d dVar = e.f2482c;
        f2450d = dVar;
        f2453g = new a(false, 2, dVar);
        f2454h = new a(true, 2, dVar);
    }

    a(boolean z, int i, d dVar) {
        this.f2455a = z;
        this.f2456b = i;
        this.f2457c = dVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0048a().a();
    }

    static boolean e(Locale locale) {
        return f.b(locale) == 1;
    }

    private String f(CharSequence charSequence, d dVar) {
        boolean a2 = dVar.a(charSequence, 0, charSequence.length());
        return (this.f2455a || (!a2 && b(charSequence) != 1)) ? this.f2455a ? (!a2 || b(charSequence) == -1) ? f2452f : "" : "" : f2451e;
    }

    private String g(CharSequence charSequence, d dVar) {
        boolean a2 = dVar.a(charSequence, 0, charSequence.length());
        return (this.f2455a || (!a2 && a(charSequence) != 1)) ? this.f2455a ? (!a2 || a(charSequence) == -1) ? f2452f : "" : "" : f2451e;
    }

    public boolean d() {
        return (this.f2456b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f2457c, true);
    }

    public CharSequence i(CharSequence charSequence, d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a2 = dVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z) {
            spannableStringBuilder.append((CharSequence) g(charSequence, a2 ? e.f2481b : e.f2480a));
        }
        if (a2 != this.f2455a) {
            spannableStringBuilder.append(a2 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) f(charSequence, a2 ? e.f2481b : e.f2480a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f2457c, true);
    }

    public String k(String str, d dVar, boolean z) {
        if (str == null) {
            return null;
        }
        return i(str, dVar, z).toString();
    }
}
