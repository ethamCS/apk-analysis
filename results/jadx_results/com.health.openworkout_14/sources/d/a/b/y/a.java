package d.a.b.y;

import androidx.constraintlayout.widget.j;
import d.a.b.w.f;
import d.a.b.w.n.e;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Objects;
/* loaded from: classes.dex */
public class a implements Closeable {
    private static final char[] q = ")]}'\n".toCharArray();

    /* renamed from: b */
    private final Reader f3892b;
    private long j;
    private int k;
    private String l;
    private int[] m;
    private int n;

    /* renamed from: c */
    private boolean f3893c = false;

    /* renamed from: d */
    private final char[] f3894d = new char[1024];

    /* renamed from: e */
    private int f3895e = 0;

    /* renamed from: f */
    private int f3896f = 0;

    /* renamed from: g */
    private int f3897g = 0;

    /* renamed from: h */
    private int f3898h = 0;
    int i = 0;
    private String[] o = new String[32];
    private int[] p = new int[32];

    /* renamed from: d.a.b.y.a$a */
    /* loaded from: classes.dex */
    static class C0112a extends f {
        C0112a() {
        }

        @Override // d.a.b.w.f
        public void a(a aVar) {
            int i;
            if (aVar instanceof e) {
                ((e) aVar).L0();
                return;
            }
            int i2 = aVar.i;
            if (i2 == 0) {
                i2 = aVar.N();
            }
            if (i2 == 13) {
                i = 9;
            } else if (i2 == 12) {
                i = 8;
            } else if (i2 != 14) {
                throw new IllegalStateException("Expected a name but was " + aVar.w0() + aVar.l0());
            } else {
                i = 10;
            }
            aVar.i = i;
        }
    }

    static {
        f.f3782a = new C0112a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.m = iArr;
        this.n = 0;
        this.n = 0 + 1;
        iArr[0] = 6;
        Objects.requireNonNull(reader, "in == null");
        this.f3892b = reader;
    }

    private char A0() {
        int i;
        int i2;
        if (this.f3895e == this.f3896f && !h0(1)) {
            H0("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.f3894d;
        int i3 = this.f3895e;
        int i4 = i3 + 1;
        this.f3895e = i4;
        char c2 = cArr[i3];
        if (c2 == '\n') {
            this.f3897g++;
            this.f3898h = i4;
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
                H0("Invalid escape sequence");
                throw null;
            } else if (i4 + 4 > this.f3896f && !h0(4)) {
                H0("Unterminated escape sequence");
                throw null;
            } else {
                char c3 = 0;
                int i5 = this.f3895e;
                int i6 = i5 + 4;
                while (i5 < i6) {
                    char c4 = this.f3894d[i5];
                    char c5 = (char) (c3 << 4);
                    if (c4 < '0' || c4 > '9') {
                        if (c4 >= 'a' && c4 <= 'f') {
                            i = c4 - 'a';
                        } else if (c4 < 'A' || c4 > 'F') {
                            throw new NumberFormatException("\\u" + new String(this.f3894d, this.f3895e, 4));
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
                this.f3895e += 4;
                return c3;
            }
        }
        return c2;
    }

    private void C0(char c2) {
        char[] cArr = this.f3894d;
        while (true) {
            int i = this.f3895e;
            int i2 = this.f3896f;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c3 = cArr[i];
                    if (c3 == c2) {
                        this.f3895e = i3;
                        return;
                    } else if (c3 == '\\') {
                        this.f3895e = i3;
                        A0();
                        break;
                    } else {
                        if (c3 == '\n') {
                            this.f3897g++;
                            this.f3898h = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f3895e = i;
                    if (!h0(1)) {
                        H0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    private boolean D0(String str) {
        int length = str.length();
        while (true) {
            if (this.f3895e + length <= this.f3896f || h0(length)) {
                char[] cArr = this.f3894d;
                int i = this.f3895e;
                if (cArr[i] != '\n') {
                    for (int i2 = 0; i2 < length; i2++) {
                        if (this.f3894d[this.f3895e + i2] != str.charAt(i2)) {
                            break;
                        }
                    }
                    return true;
                }
                this.f3897g++;
                this.f3898h = i + 1;
                this.f3895e++;
            } else {
                return false;
            }
        }
    }

    private void E0() {
        char c2;
        do {
            if (this.f3895e >= this.f3896f && !h0(1)) {
                return;
            }
            char[] cArr = this.f3894d;
            int i = this.f3895e;
            int i2 = i + 1;
            this.f3895e = i2;
            c2 = cArr[i];
            if (c2 == '\n') {
                this.f3897g++;
                this.f3898h = i2;
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        k();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void F0() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f3895e
            int r2 = r1 + r0
            int r3 = r4.f3896f
            if (r2 >= r3) goto L51
            char[] r2 = r4.f3894d
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
            r4.k()
        L4b:
            int r1 = r4.f3895e
            int r1 = r1 + r0
            r4.f3895e = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f3895e = r1
            r0 = 1
            boolean r0 = r4.h0(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.b.y.a.F0():void");
    }

    private IOException H0(String str) {
        throw new d(str + l0());
    }

    private void I() {
        r0(true);
        int i = this.f3895e - 1;
        this.f3895e = i;
        char[] cArr = q;
        if (i + cArr.length <= this.f3896f || h0(cArr.length)) {
            int i2 = 0;
            while (true) {
                char[] cArr2 = q;
                if (i2 >= cArr2.length) {
                    this.f3895e += cArr2.length;
                    return;
                } else if (this.f3894d[this.f3895e + i2] != cArr2[i2]) {
                    return;
                } else {
                    i2++;
                }
            }
        }
    }

    private boolean h0(int i) {
        int i2;
        int i3;
        char[] cArr = this.f3894d;
        int i4 = this.f3898h;
        int i5 = this.f3895e;
        this.f3898h = i4 - i5;
        int i6 = this.f3896f;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f3896f = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f3896f = 0;
        }
        this.f3895e = 0;
        do {
            Reader reader = this.f3892b;
            int i8 = this.f3896f;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f3896f + read;
            this.f3896f = i2;
            if (this.f3897g == 0 && (i3 = this.f3898h) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f3895e++;
                this.f3898h = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    private void k() {
        if (this.f3893c) {
            return;
        }
        H0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    private boolean k0(char c2) {
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
                        case j.r0 /* 91 */:
                        case j.t0 /* 93 */:
                            return false;
                        case j.s0 /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        k();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (r1 != '/') goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        r7.f3895e = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        if (r4 != r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
        r7.f3895e = r4 - 1;
        r2 = h0(2);
        r7.f3895e++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
        if (r2 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
        k();
        r2 = r7.f3895e;
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
        r7.f3895e = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        r7.f3895e = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (D0("*\/") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
        H0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
        r7.f3895e = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
        if (r1 != '#') goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
        k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int r0(boolean r8) {
        /*
            r7 = this;
            char[] r0 = r7.f3894d
        L2:
            int r1 = r7.f3895e
        L4:
            int r2 = r7.f3896f
        L6:
            r3 = 1
            if (r1 != r2) goto L34
            r7.f3895e = r1
            boolean r1 = r7.h0(r3)
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
            java.lang.String r1 = r7.l0()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L30:
            int r1 = r7.f3895e
            int r2 = r7.f3896f
        L34:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L44
            int r1 = r7.f3897g
            int r1 = r1 + r3
            r7.f3897g = r1
            r7.f3898h = r4
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
            r7.f3895e = r4
            r6 = 2
            if (r4 != r2) goto L6a
            int r4 = r4 + (-1)
            r7.f3895e = r4
            boolean r2 = r7.h0(r6)
            int r4 = r7.f3895e
            int r4 = r4 + r3
            r7.f3895e = r4
            if (r2 != 0) goto L6a
            return r1
        L6a:
            r7.k()
            int r2 = r7.f3895e
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L80
            if (r3 == r5) goto L78
            return r1
        L78:
            int r2 = r2 + 1
            r7.f3895e = r2
        L7c:
            r7.E0()
            goto L2
        L80:
            int r2 = r2 + 1
            r7.f3895e = r2
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r7.D0(r1)
            if (r1 == 0) goto L91
            int r1 = r7.f3895e
            int r1 = r1 + r6
            goto L4
        L91:
            java.lang.String r8 = "Unterminated comment"
            r7.H0(r8)
            r8 = 0
            throw r8
        L98:
            r2 = 35
            r7.f3895e = r4
            if (r1 != r2) goto La2
            r7.k()
            goto L7c
        La2:
            return r1
        La3:
            r1 = r4
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.b.y.a.r0(boolean):int");
    }

    private String t0(char c2) {
        char[] cArr = this.f3894d;
        StringBuilder sb = null;
        while (true) {
            int i = this.f3895e;
            int i2 = this.f3896f;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c3 = cArr[i];
                    if (c3 == c2) {
                        this.f3895e = i3;
                        int i4 = (i3 - i) - 1;
                        if (sb == null) {
                            return new String(cArr, i, i4);
                        }
                        sb.append(cArr, i, i4);
                        return sb.toString();
                    } else if (c3 == '\\') {
                        this.f3895e = i3;
                        int i5 = (i3 - i) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i5 + 1) * 2, 16));
                        }
                        sb.append(cArr, i, i5);
                        sb.append(A0());
                    } else {
                        if (c3 == '\n') {
                            this.f3897g++;
                            this.f3898h = i3;
                        }
                        i = i3;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i - i) * 2, 16));
                    }
                    sb.append(cArr, i, i - i);
                    this.f3895e = i;
                    if (!h0(1)) {
                        H0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        k();
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String v0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f3895e
            int r4 = r3 + r2
            int r5 = r6.f3896f
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f3894d
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
            r6.k()
            goto L5c
        L4e:
            char[] r3 = r6.f3894d
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.h0(r3)
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
            char[] r3 = r6.f3894d
            int r4 = r6.f3895e
            r1.append(r3, r4, r2)
            int r3 = r6.f3895e
            int r3 = r3 + r2
            r6.f3895e = r3
            r2 = 1
            boolean r2 = r6.h0(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f3894d
            int r3 = r6.f3895e
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f3894d
            int r3 = r6.f3895e
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f3895e
            int r2 = r2 + r0
            r6.f3895e = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.b.y.a.v0():java.lang.String");
    }

    private int x0() {
        String str;
        String str2;
        int i;
        char c2 = this.f3894d[this.f3895e];
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
            if (this.f3895e + i2 >= this.f3896f && !h0(i2 + 1)) {
                return 0;
            }
            char c3 = this.f3894d[this.f3895e + i2];
            if (c3 != str2.charAt(i2) && c3 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f3895e + length < this.f3896f || h0(length + 1)) && k0(this.f3894d[this.f3895e + length])) {
            return 0;
        }
        this.f3895e += length;
        this.i = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
        if (k0(r14) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
        if (r9 != 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
        if (r10 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009f, code lost:
        if (r11 != Long.MIN_VALUE) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a1, code lost:
        if (r13 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a7, code lost:
        if (r11 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a9, code lost:
        if (r13 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ab, code lost:
        if (r13 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ae, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00af, code lost:
        r18.j = r11;
        r18.f3895e += r8;
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b8, code lost:
        r18.i = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ba, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bb, code lost:
        if (r9 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00be, code lost:
        if (r9 == 4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c1, code lost:
        if (r9 != 7) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c4, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c6, code lost:
        r18.k = r8;
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00cb, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int y0() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.b.y.a.y0():int");
    }

    private void z0(int i) {
        int i2 = this.n;
        int[] iArr = this.m;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 * 2];
            int[] iArr3 = new int[i2 * 2];
            String[] strArr = new String[i2 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.p, 0, iArr3, 0, this.n);
            System.arraycopy(this.o, 0, strArr, 0, this.n);
            this.m = iArr2;
            this.p = iArr3;
            this.o = strArr;
        }
        int[] iArr4 = this.m;
        int i3 = this.n;
        this.n = i3 + 1;
        iArr4[i3] = i;
    }

    public final void B0(boolean z) {
        this.f3893c = z;
    }

    public void G0() {
        char c2;
        int i = 0;
        do {
            int i2 = this.i;
            if (i2 == 0) {
                i2 = N();
            }
            if (i2 == 3) {
                z0(1);
            } else if (i2 == 1) {
                z0(3);
            } else {
                if (i2 == 4 || i2 == 2) {
                    this.n--;
                    i--;
                } else if (i2 == 14 || i2 == 10) {
                    F0();
                } else {
                    if (i2 == 8 || i2 == 12) {
                        c2 = '\'';
                    } else if (i2 == 9 || i2 == 13) {
                        c2 = '\"';
                    } else if (i2 == 16) {
                        this.f3895e += this.k;
                    }
                    C0(c2);
                }
                this.i = 0;
            }
            i++;
            this.i = 0;
        } while (i != 0);
        int[] iArr = this.p;
        int i3 = this.n;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.o[i3 - 1] = "null";
    }

    int N() {
        int i;
        int r0;
        int[] iArr = this.m;
        int i2 = this.n;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 != 2) {
            if (i3 == 3 || i3 == 5) {
                iArr[i2 - 1] = 4;
                if (i3 == 5 && (r0 = r0(true)) != 44) {
                    if (r0 != 59) {
                        if (r0 != 125) {
                            H0("Unterminated object");
                            throw null;
                        }
                        i = 2;
                    } else {
                        k();
                    }
                }
                int r02 = r0(true);
                if (r02 == 34) {
                    i = 13;
                } else if (r02 == 39) {
                    k();
                    i = 12;
                } else if (r02 != 125) {
                    k();
                    this.f3895e--;
                    if (!k0((char) r02)) {
                        H0("Expected name");
                        throw null;
                    }
                    i = 14;
                } else {
                    if (i3 == 5) {
                        H0("Expected name");
                        throw null;
                    }
                    i = 2;
                }
            } else if (i3 == 4) {
                iArr[i2 - 1] = 5;
                int r03 = r0(true);
                if (r03 != 58) {
                    if (r03 != 61) {
                        H0("Expected ':'");
                        throw null;
                    }
                    k();
                    if (this.f3895e < this.f3896f || h0(1)) {
                        char[] cArr = this.f3894d;
                        int i4 = this.f3895e;
                        if (cArr[i4] == '>') {
                            this.f3895e = i4 + 1;
                        }
                    }
                }
            } else if (i3 == 6) {
                if (this.f3893c) {
                    I();
                }
                this.m[this.n - 1] = 7;
            } else if (i3 == 7) {
                if (r0(false) == -1) {
                    i = 17;
                } else {
                    k();
                    this.f3895e--;
                }
            } else if (i3 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
            this.i = i;
            return i;
        } else {
            int r04 = r0(true);
            if (r04 != 44) {
                if (r04 != 59) {
                    if (r04 == 93) {
                        this.i = 4;
                        return 4;
                    }
                    H0("Unterminated array");
                    throw null;
                }
                k();
            }
        }
        int r05 = r0(true);
        if (r05 != 34) {
            if (r05 == 39) {
                k();
                this.i = 8;
                return 8;
            }
            if (r05 != 44 && r05 != 59) {
                if (r05 == 91) {
                    this.i = 3;
                    return 3;
                } else if (r05 != 93) {
                    if (r05 == 123) {
                        this.i = 1;
                        return 1;
                    }
                    this.f3895e--;
                    int x0 = x0();
                    if (x0 != 0) {
                        return x0;
                    }
                    int y0 = y0();
                    if (y0 != 0) {
                        return y0;
                    }
                    if (!k0(this.f3894d[this.f3895e])) {
                        H0("Expected value");
                        throw null;
                    }
                    k();
                    i = 10;
                } else if (i3 == 1) {
                    this.i = 4;
                    return 4;
                }
            }
            if (i3 != 1 && i3 != 2) {
                H0("Unexpected value");
                throw null;
            }
            k();
            this.f3895e--;
            this.i = 7;
            return 7;
        }
        i = 9;
        this.i = i;
        return i;
    }

    public String X() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.n;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.m[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.p[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.o;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    public void a() {
        int i = this.i;
        if (i == 0) {
            i = N();
        }
        if (i == 3) {
            z0(1);
            this.p[this.n - 1] = 0;
            this.i = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + w0() + l0());
    }

    public void c() {
        int i = this.i;
        if (i == 0) {
            i = N();
        }
        if (i == 1) {
            z0(3);
            this.i = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + w0() + l0());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.i = 0;
        this.m[0] = 8;
        this.n = 1;
        this.f3892b.close();
    }

    public void f0() {
        int i = this.i;
        if (i == 0) {
            i = N();
        }
        if (i != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + w0() + l0());
        }
        int i2 = this.n - 1;
        this.n = i2;
        int[] iArr = this.p;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.i = 0;
    }

    public void g0() {
        int i = this.i;
        if (i == 0) {
            i = N();
        }
        if (i != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + w0() + l0());
        }
        int i2 = this.n - 1;
        this.n = i2;
        this.o[i2] = null;
        int[] iArr = this.p;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.i = 0;
    }

    public boolean i0() {
        int i = this.i;
        if (i == 0) {
            i = N();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public final boolean j0() {
        return this.f3893c;
    }

    String l0() {
        return " at line " + (this.f3897g + 1) + " column " + ((this.f3895e - this.f3898h) + 1) + " path " + X();
    }

    public boolean m0() {
        int i = this.i;
        if (i == 0) {
            i = N();
        }
        if (i == 5) {
            this.i = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.i = 0;
            int[] iArr2 = this.p;
            int i3 = this.n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + w0() + l0());
        }
    }

    public double n0() {
        String str;
        int i = this.i;
        if (i == 0) {
            i = N();
        }
        if (i == 15) {
            this.i = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.j;
        }
        if (i == 16) {
            this.l = new String(this.f3894d, this.f3895e, this.k);
            this.f3895e += this.k;
        } else {
            if (i == 8 || i == 9) {
                str = t0(i == 8 ? '\'' : '\"');
            } else if (i == 10) {
                str = v0();
            } else if (i != 11) {
                throw new IllegalStateException("Expected a double but was " + w0() + l0());
            }
            this.l = str;
        }
        this.i = 11;
        double parseDouble = Double.parseDouble(this.l);
        if (!this.f3893c && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new d("JSON forbids NaN and infinities: " + parseDouble + l0());
        }
        this.l = null;
        this.i = 0;
        int[] iArr2 = this.p;
        int i3 = this.n - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public int o0() {
        String t0;
        int i = this.i;
        if (i == 0) {
            i = N();
        }
        if (i == 15) {
            long j = this.j;
            int i2 = (int) j;
            if (j == i2) {
                this.i = 0;
                int[] iArr = this.p;
                int i3 = this.n - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.j + l0());
        }
        if (i == 16) {
            this.l = new String(this.f3894d, this.f3895e, this.k);
            this.f3895e += this.k;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException("Expected an int but was " + w0() + l0());
        } else {
            if (i == 10) {
                t0 = v0();
            } else {
                t0 = t0(i == 8 ? '\'' : '\"');
            }
            this.l = t0;
            try {
                int parseInt = Integer.parseInt(this.l);
                this.i = 0;
                int[] iArr2 = this.p;
                int i4 = this.n - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.i = 11;
        double parseDouble = Double.parseDouble(this.l);
        int i5 = (int) parseDouble;
        if (i5 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.l + l0());
        }
        this.l = null;
        this.i = 0;
        int[] iArr3 = this.p;
        int i6 = this.n - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    public long p0() {
        String t0;
        int i = this.i;
        if (i == 0) {
            i = N();
        }
        if (i == 15) {
            this.i = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.j;
        }
        if (i == 16) {
            this.l = new String(this.f3894d, this.f3895e, this.k);
            this.f3895e += this.k;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException("Expected a long but was " + w0() + l0());
        } else {
            if (i == 10) {
                t0 = v0();
            } else {
                t0 = t0(i == 8 ? '\'' : '\"');
            }
            this.l = t0;
            try {
                long parseLong = Long.parseLong(this.l);
                this.i = 0;
                int[] iArr2 = this.p;
                int i3 = this.n - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.i = 11;
        double parseDouble = Double.parseDouble(this.l);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.l + l0());
        }
        this.l = null;
        this.i = 0;
        int[] iArr3 = this.p;
        int i4 = this.n - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j;
    }

    public String q0() {
        String str;
        char c2;
        int i = this.i;
        if (i == 0) {
            i = N();
        }
        if (i == 14) {
            str = v0();
        } else {
            if (i == 12) {
                c2 = '\'';
            } else if (i != 13) {
                throw new IllegalStateException("Expected a name but was " + w0() + l0());
            } else {
                c2 = '\"';
            }
            str = t0(c2);
        }
        this.i = 0;
        this.o[this.n - 1] = str;
        return str;
    }

    public void s0() {
        int i = this.i;
        if (i == 0) {
            i = N();
        }
        if (i == 7) {
            this.i = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + w0() + l0());
    }

    public String toString() {
        return getClass().getSimpleName() + l0();
    }

    public String u0() {
        String str;
        char c2;
        int i = this.i;
        if (i == 0) {
            i = N();
        }
        if (i == 10) {
            str = v0();
        } else {
            if (i == 8) {
                c2 = '\'';
            } else if (i == 9) {
                c2 = '\"';
            } else if (i == 11) {
                str = this.l;
                this.l = null;
            } else if (i == 15) {
                str = Long.toString(this.j);
            } else if (i != 16) {
                throw new IllegalStateException("Expected a string but was " + w0() + l0());
            } else {
                str = new String(this.f3894d, this.f3895e, this.k);
                this.f3895e += this.k;
            }
            str = t0(c2);
        }
        this.i = 0;
        int[] iArr = this.p;
        int i2 = this.n - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public b w0() {
        int i = this.i;
        if (i == 0) {
            i = N();
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
