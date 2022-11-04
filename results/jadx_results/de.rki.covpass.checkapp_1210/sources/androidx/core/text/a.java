package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d */
    static final d f3553d;

    /* renamed from: e */
    private static final String f3554e = Character.toString(8206);

    /* renamed from: f */
    private static final String f3555f = Character.toString(8207);

    /* renamed from: g */
    static final a f3556g;

    /* renamed from: h */
    static final a f3557h;

    /* renamed from: a */
    private final boolean f3558a;

    /* renamed from: b */
    private final int f3559b;

    /* renamed from: c */
    private final d f3560c;

    /* renamed from: androidx.core.text.a$a */
    /* loaded from: classes.dex */
    public static final class C0035a {

        /* renamed from: a */
        private boolean f3561a;

        /* renamed from: b */
        private int f3562b;

        /* renamed from: c */
        private d f3563c;

        public C0035a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z10) {
            return z10 ? a.f3557h : a.f3556g;
        }

        private void c(boolean z10) {
            this.f3561a = z10;
            this.f3563c = a.f3553d;
            this.f3562b = 2;
        }

        public a a() {
            return (this.f3562b == 2 && this.f3563c == a.f3553d) ? b(this.f3561a) : new a(this.f3561a, this.f3562b, this.f3563c);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: f */
        private static final byte[] f3564f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f3565a;

        /* renamed from: b */
        private final boolean f3566b;

        /* renamed from: c */
        private final int f3567c;

        /* renamed from: d */
        private int f3568d;

        /* renamed from: e */
        private char f3569e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f3564f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f3565a = charSequence;
            this.f3566b = z10;
            this.f3567c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f3564f[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char charAt;
            int i10 = this.f3568d;
            do {
                int i11 = this.f3568d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3565a;
                int i12 = i11 - 1;
                this.f3568d = i12;
                charAt = charSequence.charAt(i12);
                this.f3569e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f3568d = i10;
            this.f3569e = ';';
            return (byte) 13;
        }

        private byte g() {
            char charAt;
            do {
                int i10 = this.f3568d;
                if (i10 >= this.f3567c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f3565a;
                this.f3568d = i10 + 1;
                charAt = charSequence.charAt(i10);
                this.f3569e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char charAt;
            int i10 = this.f3568d;
            while (true) {
                int i11 = this.f3568d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f3565a;
                int i12 = i11 - 1;
                this.f3568d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f3569e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f3568d;
                        if (i13 > 0) {
                            CharSequence charSequence2 = this.f3565a;
                            int i14 = i13 - 1;
                            this.f3568d = i14;
                            charAt = charSequence2.charAt(i14);
                            this.f3569e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f3568d = i10;
            this.f3569e = '>';
            return (byte) 13;
        }

        private byte i() {
            char charAt;
            int i10 = this.f3568d;
            while (true) {
                int i11 = this.f3568d;
                if (i11 >= this.f3567c) {
                    this.f3568d = i10;
                    this.f3569e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f3565a;
                this.f3568d = i11 + 1;
                char charAt2 = charSequence.charAt(i11);
                this.f3569e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i12 = this.f3568d;
                        if (i12 < this.f3567c) {
                            CharSequence charSequence2 = this.f3565a;
                            this.f3568d = i12 + 1;
                            charAt = charSequence2.charAt(i12);
                            this.f3569e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }

        byte a() {
            char charAt = this.f3565a.charAt(this.f3568d - 1);
            this.f3569e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f3565a, this.f3568d);
                this.f3568d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f3568d--;
            byte c10 = c(this.f3569e);
            if (!this.f3566b) {
                return c10;
            }
            char c11 = this.f3569e;
            return c11 == '>' ? h() : c11 == ';' ? f() : c10;
        }

        byte b() {
            char charAt = this.f3565a.charAt(this.f3568d);
            this.f3569e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f3565a, this.f3568d);
                this.f3568d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f3568d++;
            byte c10 = c(this.f3569e);
            if (!this.f3566b) {
                return c10;
            }
            char c11 = this.f3569e;
            return c11 == '<' ? i() : c11 == '&' ? g() : c10;
        }

        int d() {
            this.f3568d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f3568d < this.f3567c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                break;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                break;
                            case 18:
                                i12--;
                                i11 = 0;
                                break;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f3568d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        int e() {
            this.f3568d = this.f3567c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f3568d > 0) {
                    byte a10 = a();
                    if (a10 != 0) {
                        if (a10 == 1 || a10 == 2) {
                            if (i10 == 0) {
                                return 1;
                            }
                            if (i11 == 0) {
                                break;
                            }
                        } else if (a10 != 9) {
                            switch (a10) {
                                case 14:
                                case 15:
                                    if (i11 == i10) {
                                        return -1;
                                    }
                                    i10--;
                                    break;
                                case 16:
                                case 17:
                                    if (i11 == i10) {
                                        return 1;
                                    }
                                    i10--;
                                    break;
                                case 18:
                                    i10++;
                                    break;
                                default:
                                    if (i11 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else if (i10 == 0) {
                        return -1;
                    } else {
                        if (i11 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        d dVar = e.f3585c;
        f3553d = dVar;
        f3556g = new a(false, 2, dVar);
        f3557h = new a(true, 2, dVar);
    }

    a(boolean z10, int i10, d dVar) {
        this.f3558a = z10;
        this.f3559b = i10;
        this.f3560c = dVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0035a().a();
    }

    static boolean e(Locale locale) {
        return f.a(locale) == 1;
    }

    private String f(CharSequence charSequence, d dVar) {
        boolean a10 = dVar.a(charSequence, 0, charSequence.length());
        return (this.f3558a || (!a10 && b(charSequence) != 1)) ? this.f3558a ? (!a10 || b(charSequence) == -1) ? f3555f : BuildConfig.FLAVOR : BuildConfig.FLAVOR : f3554e;
    }

    private String g(CharSequence charSequence, d dVar) {
        boolean a10 = dVar.a(charSequence, 0, charSequence.length());
        return (this.f3558a || (!a10 && a(charSequence) != 1)) ? this.f3558a ? (!a10 || a(charSequence) == -1) ? f3555f : BuildConfig.FLAVOR : BuildConfig.FLAVOR : f3554e;
    }

    public boolean d() {
        return (this.f3559b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f3560c, true);
    }

    public CharSequence i(CharSequence charSequence, d dVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean a10 = dVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z10) {
            spannableStringBuilder.append((CharSequence) g(charSequence, a10 ? e.f3584b : e.f3583a));
        }
        if (a10 != this.f3558a) {
            spannableStringBuilder.append(a10 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) f(charSequence, a10 ? e.f3584b : e.f3583a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f3560c, true);
    }

    public String k(String str, d dVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return i(str, dVar, z10).toString();
    }
}
