package a.g.j;

import android.text.SpannableStringBuilder;
import java.util.Locale;
/* loaded from: classes.dex */
public final class a {
    static final d d = e.f235c;
    private static final String e = Character.toString(8206);
    private static final String f = Character.toString(8207);
    static final a g = new a(false, 2, d);
    static final a h = new a(true, 2, d);

    /* renamed from: a */
    private final boolean f214a;

    /* renamed from: b */
    private final int f215b;

    /* renamed from: c */
    private final d f216c;

    /* renamed from: a.g.j.a$a */
    /* loaded from: classes.dex */
    public static final class C0011a {

        /* renamed from: a */
        private boolean f217a;

        /* renamed from: b */
        private int f218b;

        /* renamed from: c */
        private d f219c;

        public C0011a() {
            b(a.a(Locale.getDefault()));
        }

        private static a a(boolean z) {
            return z ? a.h : a.g;
        }

        private void b(boolean z) {
            this.f217a = z;
            this.f219c = a.d;
            this.f218b = 2;
        }

        public a a() {
            return (this.f218b == 2 && this.f219c == a.d) ? a(this.f217a) : new a(this.f217a, this.f218b, this.f219c);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        private static final byte[] f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f220a;

        /* renamed from: b */
        private final boolean f221b;

        /* renamed from: c */
        private final int f222c;
        private int d;
        private char e;

        static {
            for (int i = 0; i < 1792; i++) {
                f[i] = Character.getDirectionality(i);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.f220a = charSequence;
            this.f221b = z;
            this.f222c = charSequence.length();
        }

        private static byte a(char c2) {
            return c2 < 1792 ? f[c2] : Character.getDirectionality(c2);
        }

        private byte e() {
            char charAt;
            int i = this.d;
            do {
                int i2 = this.d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f220a;
                int i3 = i2 - 1;
                this.d = i3;
                charAt = charSequence.charAt(i3);
                this.e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.d = i;
            this.e = ';';
            return (byte) 13;
        }

        private byte f() {
            char charAt;
            do {
                int i = this.d;
                if (i >= this.f222c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f220a;
                this.d = i + 1;
                charAt = charSequence.charAt(i);
                this.e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte g() {
            char charAt;
            int i = this.d;
            while (true) {
                int i2 = this.d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f220a;
                int i3 = i2 - 1;
                this.d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    char c2 = this.e;
                    do {
                        int i4 = this.d;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.f220a;
                            int i5 = i4 - 1;
                            this.d = i5;
                            charAt = charSequence2.charAt(i5);
                            this.e = charAt;
                        }
                    } while (charAt != c2);
                }
            }
            this.d = i;
            this.e = '>';
            return (byte) 13;
        }

        private byte h() {
            char charAt;
            int i = this.d;
            while (true) {
                int i2 = this.d;
                if (i2 >= this.f222c) {
                    this.d = i;
                    this.e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f220a;
                this.d = i2 + 1;
                char charAt2 = charSequence.charAt(i2);
                this.e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    char c2 = this.e;
                    do {
                        int i3 = this.d;
                        if (i3 < this.f222c) {
                            CharSequence charSequence2 = this.f220a;
                            this.d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.e = charAt;
                        }
                    } while (charAt != c2);
                }
            }
        }

        byte a() {
            char charAt = this.f220a.charAt(this.d - 1);
            this.e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f220a, this.d);
                this.d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.d--;
            byte a2 = a(this.e);
            if (!this.f221b) {
                return a2;
            }
            char c2 = this.e;
            return c2 == '>' ? g() : c2 == ';' ? e() : a2;
        }

        byte b() {
            char charAt = this.f220a.charAt(this.d);
            this.e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f220a, this.d);
                this.d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.d++;
            byte a2 = a(this.e);
            if (!this.f221b) {
                return a2;
            }
            char c2 = this.e;
            return c2 == '<' ? h() : c2 == '&' ? f() : a2;
        }

        int c() {
            this.d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.d < this.f222c && i == 0) {
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
            while (this.d > 0) {
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

        int d() {
            this.d = this.f222c;
            int i = 0;
            int i2 = 0;
            while (this.d > 0) {
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

    a(boolean z, int i, d dVar) {
        this.f214a = z;
        this.f215b = i;
        this.f216c = dVar;
    }

    private String a(CharSequence charSequence, d dVar) {
        boolean a2 = dVar.a(charSequence, 0, charSequence.length());
        return (this.f214a || (!a2 && c(charSequence) != 1)) ? this.f214a ? (!a2 || c(charSequence) == -1) ? f : "" : "" : e;
    }

    static boolean a(Locale locale) {
        return f.b(locale) == 1;
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).c();
    }

    public static a b() {
        return new C0011a().a();
    }

    private String b(CharSequence charSequence, d dVar) {
        boolean a2 = dVar.a(charSequence, 0, charSequence.length());
        return (this.f214a || (!a2 && b(charSequence) != 1)) ? this.f214a ? (!a2 || b(charSequence) == -1) ? f : "" : "" : e;
    }

    private static int c(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public CharSequence a(CharSequence charSequence) {
        return a(charSequence, this.f216c, true);
    }

    public CharSequence a(CharSequence charSequence, d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a2 = dVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (a() && z) {
            spannableStringBuilder.append((CharSequence) b(charSequence, a2 ? e.f234b : e.f233a));
        }
        if (a2 != this.f214a) {
            spannableStringBuilder.append(a2 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) a(charSequence, a2 ? e.f234b : e.f233a));
        }
        return spannableStringBuilder;
    }

    public boolean a() {
        return (this.f215b & 2) != 0;
    }
}
