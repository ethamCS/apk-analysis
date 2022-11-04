package c.b.b.y;

import c.b.b.w.f;
import c.b.b.w.n.e;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
/* loaded from: classes.dex */
public class a implements Closeable {
    private static final char[] p = ")]}'\n".toCharArray();

    /* renamed from: a */
    private final Reader f593a;
    private long i;
    private int j;
    private String k;
    private int[] l;
    private int m;

    /* renamed from: b */
    private boolean f594b = false;

    /* renamed from: c */
    private final char[] f595c = new char[1024];

    /* renamed from: d */
    private int f596d = 0;

    /* renamed from: e */
    private int f597e = 0;
    private int f = 0;
    private int g = 0;
    int h = 0;
    private String[] n = new String[32];
    private int[] o = new int[32];

    /* renamed from: c.b.b.y.a$a */
    /* loaded from: classes.dex */
    static class C0032a extends f {
        C0032a() {
        }

        @Override // c.b.b.w.f
        public void a(a aVar) {
            int i;
            if (aVar instanceof e) {
                ((e) aVar).M();
                return;
            }
            int i2 = aVar.h;
            if (i2 == 0) {
                i2 = aVar.e();
            }
            if (i2 == 13) {
                i = 9;
            } else if (i2 == 12) {
                i = 8;
            } else if (i2 != 14) {
                throw new IllegalStateException("Expected a name but was " + aVar.x() + aVar.m());
            } else {
                i = 10;
            }
            aVar.h = i;
        }
    }

    static {
        f.f495a = new C0032a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.l = iArr;
        this.m = 0;
        this.m = 0 + 1;
        iArr[0] = 6;
        if (reader != null) {
            this.f593a = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    private void A(int i) {
        int i2 = this.m;
        int[] iArr = this.l;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 * 2];
            int[] iArr3 = new int[i2 * 2];
            String[] strArr = new String[i2 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.o, 0, iArr3, 0, this.m);
            System.arraycopy(this.n, 0, strArr, 0, this.m);
            this.l = iArr2;
            this.o = iArr3;
            this.n = strArr;
        }
        int[] iArr4 = this.l;
        int i3 = this.m;
        this.m = i3 + 1;
        iArr4[i3] = i;
    }

    private char B() {
        int i;
        int i2;
        if (this.f596d == this.f597e && !h(1)) {
            I("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.f595c;
        int i3 = this.f596d;
        int i4 = i3 + 1;
        this.f596d = i4;
        char c2 = cArr[i3];
        if (c2 == '\n') {
            this.f++;
            this.g = i4;
        } else if (c2 != '\"' && c2 != '\'' && c2 != '/' && c2 != '\\') {
            if (c2 == 'b') {
                return '\b';
            }
            if (c2 == 'f') {
                return '\f';
            }
            if (c2 == 'n') {
                return '\n';
            }
            if (c2 == 'r') {
                return '\r';
            }
            if (c2 == 't') {
                return '\t';
            }
            if (c2 != 'u') {
                I("Invalid escape sequence");
                throw null;
            } else if (i4 + 4 > this.f597e && !h(4)) {
                I("Unterminated escape sequence");
                throw null;
            } else {
                char c3 = 0;
                int i5 = this.f596d;
                int i6 = i5 + 4;
                while (i5 < i6) {
                    char c4 = this.f595c[i5];
                    char c5 = (char) (c3 << 4);
                    if (c4 < '0' || c4 > '9') {
                        if (c4 >= 'a' && c4 <= 'f') {
                            i = c4 - 'a';
                        } else if (c4 < 'A' || c4 > 'F') {
                            throw new NumberFormatException("\\u" + new String(this.f595c, this.f596d, 4));
                        } else {
                            i = c4 - 'A';
                        }
                        i2 = i + 10;
                    } else {
                        i2 = c4 - '0';
                    }
                    c3 = (char) (c5 + i2);
                    i5++;
                }
                this.f596d += 4;
                return c3;
            }
        }
        return c2;
    }

    private void D(char c2) {
        char[] cArr = this.f595c;
        while (true) {
            int i = this.f596d;
            int i2 = this.f597e;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c3 = cArr[i];
                    if (c3 == c2) {
                        this.f596d = i3;
                        return;
                    } else if (c3 == '\\') {
                        this.f596d = i3;
                        B();
                        break;
                    } else {
                        if (c3 == '\n') {
                            this.f++;
                            this.g = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f596d = i;
                    if (!h(1)) {
                        I("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    private boolean E(String str) {
        int length = str.length();
        while (true) {
            if (this.f596d + length <= this.f597e || h(length)) {
                char[] cArr = this.f595c;
                int i = this.f596d;
                if (cArr[i] != '\n') {
                    for (int i2 = 0; i2 < length; i2++) {
                        if (this.f595c[this.f596d + i2] != str.charAt(i2)) {
                            break;
                        }
                    }
                    return true;
                }
                this.f++;
                this.g = i + 1;
                this.f596d++;
            } else {
                return false;
            }
        }
    }

    private void F() {
        char c2;
        do {
            if (this.f596d >= this.f597e && !h(1)) {
                return;
            }
            char[] cArr = this.f595c;
            int i = this.f596d;
            int i2 = i + 1;
            this.f596d = i2;
            c2 = cArr[i];
            if (c2 == '\n') {
                this.f++;
                this.g = i2;
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        c();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void G() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f596d
            int r2 = r1 + r0
            int r3 = r4.f597e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f595c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.c()
        L4b:
            int r1 = r4.f596d
            int r1 = r1 + r0
            r4.f596d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f596d = r1
            r0 = 1
            boolean r0 = r4.h(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.y.a.G():void");
    }

    private IOException I(String str) {
        throw new d(str + m());
    }

    private void c() {
        if (this.f594b) {
            return;
        }
        I("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    private void d() {
        s(true);
        int i = this.f596d - 1;
        this.f596d = i;
        char[] cArr = p;
        if (i + cArr.length <= this.f597e || h(cArr.length)) {
            int i2 = 0;
            while (true) {
                char[] cArr2 = p;
                if (i2 >= cArr2.length) {
                    this.f596d += cArr2.length;
                    return;
                } else if (this.f595c[this.f596d + i2] != cArr2[i2]) {
                    return;
                } else {
                    i2++;
                }
            }
        }
    }

    private boolean h(int i) {
        int i2;
        int i3;
        char[] cArr = this.f595c;
        int i4 = this.g;
        int i5 = this.f596d;
        this.g = i4 - i5;
        int i6 = this.f597e;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f597e = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f597e = 0;
        }
        this.f596d = 0;
        do {
            Reader reader = this.f593a;
            int i8 = this.f597e;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f597e + read;
            this.f597e = i2;
            if (this.f == 0 && (i3 = this.g) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f596d++;
                this.g = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    private boolean l(char c2) {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        c();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (r1 != '/') goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        r7.f596d = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        if (r4 != r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
        r7.f596d = r4 - 1;
        r2 = h(2);
        r7.f596d++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
        if (r2 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
        c();
        r2 = r7.f596d;
        r3 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r3 == '*') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        if (r3 == '/') goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
        r7.f596d = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        r7.f596d = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (E("*\/") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
        I("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
        r7.f596d = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
        if (r1 != '#') goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int s(boolean r8) {
        /*
            r7 = this;
            char[] r0 = r7.f595c
        L2:
            int r1 = r7.f596d
        L4:
            int r2 = r7.f597e
        L6:
            r3 = 1
            if (r1 != r2) goto L34
            r7.f596d = r1
            boolean r1 = r7.h(r3)
            if (r1 != 0) goto L30
            if (r8 != 0) goto L15
            r8 = -1
            return r8
        L15:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r7.m()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L30:
            int r1 = r7.f596d
            int r2 = r7.f597e
        L34:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L44
            int r1 = r7.f
            int r1 = r1 + r3
            r7.f = r1
            r7.g = r4
            goto La3
        L44:
            r5 = 32
            if (r1 == r5) goto La3
            r5 = 13
            if (r1 == r5) goto La3
            r5 = 9
            if (r1 != r5) goto L51
            goto La3
        L51:
            r5 = 47
            if (r1 != r5) goto L98
            r7.f596d = r4
            r6 = 2
            if (r4 != r2) goto L6a
            int r4 = r4 + (-1)
            r7.f596d = r4
            boolean r2 = r7.h(r6)
            int r4 = r7.f596d
            int r4 = r4 + r3
            r7.f596d = r4
            if (r2 != 0) goto L6a
            return r1
        L6a:
            r7.c()
            int r2 = r7.f596d
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L80
            if (r3 == r5) goto L78
            return r1
        L78:
            int r2 = r2 + 1
            r7.f596d = r2
        L7c:
            r7.F()
            goto L2
        L80:
            int r2 = r2 + 1
            r7.f596d = r2
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r7.E(r1)
            if (r1 == 0) goto L91
            int r1 = r7.f596d
            int r1 = r1 + r6
            goto L4
        L91:
            java.lang.String r8 = "Unterminated comment"
            r7.I(r8)
            r8 = 0
            throw r8
        L98:
            r2 = 35
            r7.f596d = r4
            if (r1 != r2) goto La2
            r7.c()
            goto L7c
        La2:
            return r1
        La3:
            r1 = r4
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.y.a.s(boolean):int");
    }

    private String u(char c2) {
        char[] cArr = this.f595c;
        StringBuilder sb = null;
        while (true) {
            int i = this.f596d;
            int i2 = this.f597e;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c3 = cArr[i];
                    if (c3 == c2) {
                        this.f596d = i3;
                        int i4 = (i3 - i) - 1;
                        if (sb == null) {
                            return new String(cArr, i, i4);
                        }
                        sb.append(cArr, i, i4);
                        return sb.toString();
                    } else if (c3 == '\\') {
                        this.f596d = i3;
                        int i5 = (i3 - i) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i5 + 1) * 2, 16));
                        }
                        sb.append(cArr, i, i5);
                        sb.append(B());
                    } else {
                        if (c3 == '\n') {
                            this.f++;
                            this.g = i3;
                        }
                        i = i3;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i - i) * 2, 16));
                    }
                    sb.append(cArr, i, i - i);
                    this.f596d = i;
                    if (!h(1)) {
                        I("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        c();
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String w() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f596d
            int r4 = r3 + r2
            int r5 = r6.f597e
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f595c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.c()
            goto L5c
        L4e:
            char[] r3 = r6.f595c
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.h(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f595c
            int r4 = r6.f596d
            r1.append(r3, r4, r2)
            int r3 = r6.f596d
            int r3 = r3 + r2
            r6.f596d = r3
            r2 = 1
            boolean r2 = r6.h(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f595c
            int r3 = r6.f596d
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f595c
            int r3 = r6.f596d
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f596d
            int r2 = r2 + r0
            r6.f596d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.y.a.w():java.lang.String");
    }

    private int y() {
        String str;
        String str2;
        int i;
        char c2 = this.f595c[this.f596d];
        if (c2 == 't' || c2 == 'T') {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (c2 == 'f' || c2 == 'F') {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c2 != 'n' && c2 != 'N') {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f596d + i2 >= this.f597e && !h(i2 + 1)) {
                return 0;
            }
            char c3 = this.f595c[this.f596d + i2];
            if (c3 != str2.charAt(i2) && c3 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f596d + length < this.f597e || h(length + 1)) && l(this.f595c[this.f596d + length])) {
            return 0;
        }
        this.f596d += length;
        this.h = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
        if (l(r14) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
        if (r9 != 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009b, code lost:
        if (r10 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a1, code lost:
        if (r11 != Long.MIN_VALUE) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a3, code lost:
        if (r13 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a9, code lost:
        if (r11 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ab, code lost:
        if (r13 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ad, code lost:
        if (r13 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b0, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b1, code lost:
        r18.i = r11;
        r18.f596d += r8;
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ba, code lost:
        r18.h = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bc, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00bd, code lost:
        if (r9 == 2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c0, code lost:
        if (r9 == 4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c3, code lost:
        if (r9 != 7) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c6, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c8, code lost:
        r18.j = r8;
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00cd, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int z() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.y.a.z():int");
    }

    public final void C(boolean z) {
        this.f594b = z;
    }

    public void H() {
        char c2;
        int i = 0;
        do {
            int i2 = this.h;
            if (i2 == 0) {
                i2 = e();
            }
            if (i2 == 3) {
                A(1);
            } else if (i2 == 1) {
                A(3);
            } else {
                if (i2 == 4 || i2 == 2) {
                    this.m--;
                    i--;
                } else if (i2 == 14 || i2 == 10) {
                    G();
                } else {
                    if (i2 == 8 || i2 == 12) {
                        c2 = '\'';
                    } else if (i2 == 9 || i2 == 13) {
                        c2 = '\"';
                    } else if (i2 == 16) {
                        this.f596d += this.j;
                    }
                    D(c2);
                }
                this.h = 0;
            }
            i++;
            this.h = 0;
        } while (i != 0);
        int[] iArr = this.o;
        int i3 = this.m;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.n[i3 - 1] = "null";
    }

    public void a() {
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 3) {
            A(1);
            this.o[this.m - 1] = 0;
            this.h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + x() + m());
    }

    public void b() {
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 1) {
            A(3);
            this.h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + x() + m());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.h = 0;
        this.l[0] = 8;
        this.m = 1;
        this.f593a.close();
    }

    int e() {
        int i;
        int s;
        int[] iArr = this.l;
        int i2 = this.m;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 != 2) {
            if (i3 == 3 || i3 == 5) {
                iArr[i2 - 1] = 4;
                if (i3 == 5 && (s = s(true)) != 44) {
                    if (s != 59) {
                        if (s != 125) {
                            I("Unterminated object");
                            throw null;
                        }
                        i = 2;
                    } else {
                        c();
                    }
                }
                int s2 = s(true);
                if (s2 == 34) {
                    i = 13;
                } else if (s2 == 39) {
                    c();
                    i = 12;
                } else if (s2 != 125) {
                    c();
                    this.f596d--;
                    if (!l((char) s2)) {
                        I("Expected name");
                        throw null;
                    }
                    i = 14;
                } else {
                    if (i3 == 5) {
                        I("Expected name");
                        throw null;
                    }
                    i = 2;
                }
            } else if (i3 == 4) {
                iArr[i2 - 1] = 5;
                int s3 = s(true);
                if (s3 != 58) {
                    if (s3 != 61) {
                        I("Expected ':'");
                        throw null;
                    }
                    c();
                    if (this.f596d < this.f597e || h(1)) {
                        char[] cArr = this.f595c;
                        int i4 = this.f596d;
                        if (cArr[i4] == '>') {
                            this.f596d = i4 + 1;
                        }
                    }
                }
            } else if (i3 == 6) {
                if (this.f594b) {
                    d();
                }
                this.l[this.m - 1] = 7;
            } else if (i3 == 7) {
                if (s(false) == -1) {
                    i = 17;
                } else {
                    c();
                    this.f596d--;
                }
            } else if (i3 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
            this.h = i;
            return i;
        } else {
            int s4 = s(true);
            if (s4 != 44) {
                if (s4 != 59) {
                    if (s4 == 93) {
                        this.h = 4;
                        return 4;
                    }
                    I("Unterminated array");
                    throw null;
                }
                c();
            }
        }
        int s5 = s(true);
        if (s5 != 34) {
            if (s5 == 39) {
                c();
                this.h = 8;
                return 8;
            }
            if (s5 != 44 && s5 != 59) {
                if (s5 == 91) {
                    this.h = 3;
                    return 3;
                } else if (s5 != 93) {
                    if (s5 == 123) {
                        this.h = 1;
                        return 1;
                    }
                    this.f596d--;
                    int y = y();
                    if (y != 0) {
                        return y;
                    }
                    int z = z();
                    if (z != 0) {
                        return z;
                    }
                    if (!l(this.f595c[this.f596d])) {
                        I("Expected value");
                        throw null;
                    }
                    c();
                    i = 10;
                } else if (i3 == 1) {
                    this.h = 4;
                    return 4;
                }
            }
            if (i3 != 1 && i3 != 2) {
                I("Unexpected value");
                throw null;
            }
            c();
            this.f596d--;
            this.h = 7;
            return 7;
        }
        i = 9;
        this.h = i;
        return i;
    }

    public void f() {
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + x() + m());
        }
        int i2 = this.m - 1;
        this.m = i2;
        int[] iArr = this.o;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.h = 0;
    }

    public void g() {
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + x() + m());
        }
        int i2 = this.m - 1;
        this.m = i2;
        this.n[i2] = null;
        int[] iArr = this.o;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.h = 0;
    }

    public String i() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.m;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.l[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.o[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.n;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    public boolean j() {
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public final boolean k() {
        return this.f594b;
    }

    String m() {
        return " at line " + (this.f + 1) + " column " + ((this.f596d - this.g) + 1) + " path " + i();
    }

    public boolean n() {
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 5) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.h = 0;
            int[] iArr2 = this.o;
            int i3 = this.m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + x() + m());
        }
    }

    public double o() {
        String str;
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 15) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.i;
        }
        if (i == 16) {
            this.k = new String(this.f595c, this.f596d, this.j);
            this.f596d += this.j;
        } else {
            if (i == 8 || i == 9) {
                str = u(i == 8 ? '\'' : '\"');
            } else if (i == 10) {
                str = w();
            } else if (i != 11) {
                throw new IllegalStateException("Expected a double but was " + x() + m());
            }
            this.k = str;
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.k);
        if (!this.f594b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new d("JSON forbids NaN and infinities: " + parseDouble + m());
        }
        this.k = null;
        this.h = 0;
        int[] iArr2 = this.o;
        int i3 = this.m - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public int p() {
        String u;
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 15) {
            long j = this.i;
            int i2 = (int) j;
            if (j == i2) {
                this.h = 0;
                int[] iArr = this.o;
                int i3 = this.m - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.i + m());
        }
        if (i == 16) {
            this.k = new String(this.f595c, this.f596d, this.j);
            this.f596d += this.j;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException("Expected an int but was " + x() + m());
        } else {
            if (i == 10) {
                u = w();
            } else {
                u = u(i == 8 ? '\'' : '\"');
            }
            this.k = u;
            try {
                int parseInt = Integer.parseInt(this.k);
                this.h = 0;
                int[] iArr2 = this.o;
                int i4 = this.m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.k);
        int i5 = (int) parseDouble;
        if (i5 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.k + m());
        }
        this.k = null;
        this.h = 0;
        int[] iArr3 = this.o;
        int i6 = this.m - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    public long q() {
        String u;
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 15) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.i;
        }
        if (i == 16) {
            this.k = new String(this.f595c, this.f596d, this.j);
            this.f596d += this.j;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException("Expected a long but was " + x() + m());
        } else {
            if (i == 10) {
                u = w();
            } else {
                u = u(i == 8 ? '\'' : '\"');
            }
            this.k = u;
            try {
                long parseLong = Long.parseLong(this.k);
                this.h = 0;
                int[] iArr2 = this.o;
                int i3 = this.m - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.k);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.k + m());
        }
        this.k = null;
        this.h = 0;
        int[] iArr3 = this.o;
        int i4 = this.m - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j;
    }

    public String r() {
        String str;
        char c2;
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 14) {
            str = w();
        } else {
            if (i == 12) {
                c2 = '\'';
            } else if (i != 13) {
                throw new IllegalStateException("Expected a name but was " + x() + m());
            } else {
                c2 = '\"';
            }
            str = u(c2);
        }
        this.h = 0;
        this.n[this.m - 1] = str;
        return str;
    }

    public void t() {
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 7) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + x() + m());
    }

    public String toString() {
        return getClass().getSimpleName() + m();
    }

    public String v() {
        String str;
        char c2;
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 10) {
            str = w();
        } else {
            if (i == 8) {
                c2 = '\'';
            } else if (i == 9) {
                c2 = '\"';
            } else if (i == 11) {
                str = this.k;
                this.k = null;
            } else if (i == 15) {
                str = Long.toString(this.i);
            } else if (i != 16) {
                throw new IllegalStateException("Expected a string but was " + x() + m());
            } else {
                str = new String(this.f595c, this.f596d, this.j);
                this.f596d += this.j;
            }
            str = u(c2);
        }
        this.h = 0;
        int[] iArr = this.o;
        int i2 = this.m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public b x() {
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        switch (i) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }
}
