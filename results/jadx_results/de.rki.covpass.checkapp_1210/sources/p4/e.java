package p4;

import eg.f;
import java.io.EOFException;
import java.util.Objects;
import p4.c;
/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: c4 */
    private static final f f18897c4 = f.j("'\\");

    /* renamed from: d4 */
    private static final f f18898d4 = f.j("\"\\");

    /* renamed from: e4 */
    private static final f f18899e4 = f.j("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: f4 */
    private static final f f18900f4 = f.j("\n\r");

    /* renamed from: g4 */
    private static final f f18901g4 = f.j("*/");
    private final eg.e W3;
    private final eg.c X3;
    private int Y3 = 0;
    private long Z3;

    /* renamed from: a4 */
    private int f18902a4;

    /* renamed from: b4 */
    private String f18903b4;

    public e(eg.e eVar) {
        Objects.requireNonNull(eVar, "source == null");
        this.W3 = eVar;
        this.X3 = eVar.E();
        G(6);
    }

    private String D0() {
        long Y = this.W3.Y(f18899e4);
        return Y != -1 ? this.X3.R0(Y) : this.X3.O0();
    }

    private int K0() {
        String str;
        String str2;
        int i10;
        byte M = this.X3.M(0L);
        if (M == 116 || M == 84) {
            i10 = 5;
            str2 = "true";
            str = "TRUE";
        } else if (M == 102 || M == 70) {
            i10 = 6;
            str2 = "false";
            str = "FALSE";
        } else if (M != 110 && M != 78) {
            return 0;
        } else {
            i10 = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        int i11 = 1;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (!this.W3.P(i12)) {
                return 0;
            }
            byte M2 = this.X3.M(i11);
            if (M2 != str2.charAt(i11) && M2 != str.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (!this.W3.P(length + 1) || !u0(this.X3.M(length))) {
            this.X3.skip(length);
            this.Y3 = i10;
            return i10;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
        if (u0(r11) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0084, code lost:
        if (r6 != 2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0086, code lost:
        if (r7 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008c, code lost:
        if (r8 != Long.MIN_VALUE) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
        if (r10 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0092, code lost:
        if (r8 != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0094, code lost:
        if (r10 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0096, code lost:
        if (r10 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0099, code lost:
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009a, code lost:
        r16.Z3 = r8;
        r16.X3.skip(r5);
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a4, code lost:
        r16.Y3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a6, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a7, code lost:
        if (r6 == 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00aa, code lost:
        if (r6 == 4) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ad, code lost:
        if (r6 != 7) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b0, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b2, code lost:
        r16.f18902a4 = r5;
        r1 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b7, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int M0() {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.e.M0():int");
    }

    private char O0() {
        int i10;
        int i11;
        if (this.W3.P(1L)) {
            byte readByte = this.X3.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return '\b';
            }
            if (readByte == 102) {
                return '\f';
            }
            if (readByte == 110) {
                return '\n';
            }
            if (readByte == 114) {
                return '\r';
            }
            if (readByte == 116) {
                return '\t';
            }
            if (readByte != 117) {
                if (this.f18889y) {
                    return (char) readByte;
                }
                throw f0("Invalid escape sequence: \\" + ((char) readByte));
            } else if (!this.W3.P(4L)) {
                throw new EOFException("Unterminated escape sequence at path " + l());
            } else {
                char c10 = 0;
                for (int i12 = 0; i12 < 4; i12++) {
                    byte M = this.X3.M(i12);
                    char c11 = (char) (c10 << 4);
                    if (M < 48 || M > 57) {
                        if (M >= 97 && M <= 102) {
                            i10 = M - 97;
                        } else if (M < 65 || M > 70) {
                            throw f0("\\u" + this.X3.R0(4L));
                        } else {
                            i10 = M - 65;
                        }
                        i11 = i10 + 10;
                    } else {
                        i11 = M - 48;
                    }
                    c10 = (char) (c11 + i11);
                }
                this.X3.skip(4L);
                return c10;
            }
        }
        throw f0("Unterminated escape sequence");
    }

    private void R0(f fVar) {
        while (true) {
            long Y = this.W3.Y(fVar);
            if (Y != -1) {
                if (this.X3.M(Y) != 92) {
                    this.X3.skip(Y + 1);
                    return;
                } else {
                    this.X3.skip(Y + 1);
                    O0();
                }
            } else {
                throw f0("Unterminated string");
            }
        }
    }

    private boolean V0() {
        eg.e eVar = this.W3;
        f fVar = f18901g4;
        long X = eVar.X(fVar);
        boolean z10 = X != -1;
        eg.c cVar = this.X3;
        cVar.skip(z10 ? X + fVar.W() : cVar.e1());
        return z10;
    }

    private void c1() {
        long Y = this.W3.Y(f18900f4);
        eg.c cVar = this.X3;
        cVar.skip(Y != -1 ? Y + 1 : cVar.e1());
    }

    private void e1() {
        long Y = this.W3.Y(f18899e4);
        eg.c cVar = this.X3;
        if (Y == -1) {
            Y = cVar.e1();
        }
        cVar.skip(Y);
    }

    private void h0() {
        if (this.f18889y) {
            return;
        }
        throw f0("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private int j0() {
        int i10;
        int[] iArr = this.f18886d;
        int i11 = this.f18885c;
        int i12 = iArr[i11 - 1];
        if (i12 != 1) {
            if (i12 == 2) {
                int w02 = w0(true);
                this.X3.readByte();
                if (w02 != 44) {
                    if (w02 != 59) {
                        if (w02 != 93) {
                            throw f0("Unterminated array");
                        }
                        this.Y3 = 4;
                        return 4;
                    }
                    h0();
                }
            } else if (i12 == 3 || i12 == 5) {
                iArr[i11 - 1] = 4;
                if (i12 == 5) {
                    int w03 = w0(true);
                    this.X3.readByte();
                    if (w03 != 44) {
                        if (w03 != 59) {
                            if (w03 != 125) {
                                throw f0("Unterminated object");
                            }
                            i10 = 2;
                        } else {
                            h0();
                        }
                    }
                }
                int w04 = w0(true);
                if (w04 == 34) {
                    this.X3.readByte();
                    i10 = 13;
                } else if (w04 == 39) {
                    this.X3.readByte();
                    h0();
                    i10 = 12;
                } else if (w04 != 125) {
                    h0();
                    if (!u0((char) w04)) {
                        throw f0("Expected name");
                    }
                    i10 = 14;
                } else if (i12 == 5) {
                    throw f0("Expected name");
                } else {
                    this.X3.readByte();
                    i10 = 2;
                }
            } else if (i12 == 4) {
                iArr[i11 - 1] = 5;
                int w05 = w0(true);
                this.X3.readByte();
                if (w05 != 58) {
                    if (w05 != 61) {
                        throw f0("Expected ':'");
                    }
                    h0();
                    if (this.W3.P(1L) && this.X3.M(0L) == 62) {
                        this.X3.readByte();
                    }
                }
            } else if (i12 == 6) {
                iArr[i11 - 1] = 7;
            } else if (i12 == 7) {
                if (w0(false) == -1) {
                    i10 = 18;
                }
                h0();
            } else if (i12 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
            this.Y3 = i10;
            return i10;
        }
        iArr[i11 - 1] = 2;
        int w06 = w0(true);
        if (w06 != 34) {
            if (w06 == 39) {
                h0();
                this.X3.readByte();
                this.Y3 = 8;
                return 8;
            }
            if (w06 != 44 && w06 != 59) {
                if (w06 == 91) {
                    this.X3.readByte();
                    this.Y3 = 3;
                    return 3;
                } else if (w06 != 93) {
                    if (w06 == 123) {
                        this.X3.readByte();
                        this.Y3 = 1;
                        return 1;
                    }
                    int K0 = K0();
                    if (K0 != 0) {
                        return K0;
                    }
                    int M0 = M0();
                    if (M0 != 0) {
                        return M0;
                    }
                    if (!u0(this.X3.M(0L))) {
                        throw f0("Expected value");
                    }
                    h0();
                    i10 = 10;
                } else if (i12 == 1) {
                    this.X3.readByte();
                    i10 = 4;
                }
            }
            if (i12 != 1 && i12 != 2) {
                throw f0("Unexpected value");
            }
            h0();
            this.Y3 = 7;
            return 7;
        }
        this.X3.readByte();
        i10 = 9;
        this.Y3 = i10;
        return i10;
    }

    private int s0(String str, c.a aVar) {
        int length = aVar.f18890a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f18890a[i10])) {
                this.Y3 = 0;
                this.f18887q[this.f18885c - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    private boolean u0(int i10) {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        h0();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        r6.X3.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r1 != 47) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r6.W3.P(2) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
        h0();
        r3 = r6.X3.M(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r3 == 42) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r3 == 47) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        r6.X3.readByte();
        r6.X3.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        c1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        r6.X3.readByte();
        r6.X3.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (V0() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
        throw f0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
        if (r1 != 35) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
        h0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int w0(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            eg.e r2 = r6.W3
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.P(r4)
            if (r2 == 0) goto L7f
            eg.c r2 = r6.X3
            long r4 = (long) r1
            byte r1 = r2.M(r4)
            r2 = 10
            if (r1 == r2) goto L7d
            r2 = 32
            if (r1 == r2) goto L7d
            r2 = 13
            if (r1 == r2) goto L7d
            r2 = 9
            if (r1 != r2) goto L25
            goto L7d
        L25:
            eg.c r2 = r6.X3
            int r3 = r3 + (-1)
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L74
            eg.e r3 = r6.W3
            r4 = 2
            boolean r3 = r3.P(r4)
            if (r3 != 0) goto L3c
            return r1
        L3c:
            r6.h0()
            eg.c r3 = r6.X3
            r4 = 1
            byte r3 = r3.M(r4)
            r4 = 42
            if (r3 == r4) goto L5c
            if (r3 == r2) goto L4e
            return r1
        L4e:
            eg.c r1 = r6.X3
            r1.readByte()
            eg.c r1 = r6.X3
            r1.readByte()
        L58:
            r6.c1()
            goto L1
        L5c:
            eg.c r1 = r6.X3
            r1.readByte()
            eg.c r1 = r6.X3
            r1.readByte()
            boolean r1 = r6.V0()
            if (r1 == 0) goto L6d
            goto L1
        L6d:
            java.lang.String r7 = "Unterminated comment"
            p4.b r7 = r6.f0(r7)
            throw r7
        L74:
            r2 = 35
            if (r1 != r2) goto L7c
            r6.h0()
            goto L58
        L7c:
            return r1
        L7d:
            r1 = r3
            goto L2
        L7f:
            if (r7 != 0) goto L83
            r7 = -1
            return r7
        L83:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.e.w0(boolean):int");
    }

    private String z0(f fVar) {
        StringBuilder sb2 = null;
        while (true) {
            long Y = this.W3.Y(fVar);
            if (Y != -1) {
                if (this.X3.M(Y) != 92) {
                    String R0 = this.X3.R0(Y);
                    if (sb2 == null) {
                        this.X3.readByte();
                        return R0;
                    }
                    sb2.append(R0);
                    this.X3.readByte();
                    return sb2.toString();
                }
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.X3.R0(Y));
                this.X3.readByte();
                sb2.append(O0());
            } else {
                throw f0("Unterminated string");
            }
        }
    }

    @Override // p4.c
    public c.b B() {
        int i10 = this.Y3;
        if (i10 == 0) {
            i10 = j0();
        }
        switch (i10) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // p4.c
    public int M(c.a aVar) {
        int i10 = this.Y3;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 < 12 || i10 > 15) {
            return -1;
        }
        if (i10 == 15) {
            return s0(this.f18903b4, aVar);
        }
        int Q = this.W3.Q(aVar.f18891b);
        if (Q != -1) {
            this.Y3 = 0;
            this.f18887q[this.f18885c - 1] = aVar.f18890a[Q];
            return Q;
        }
        String str = this.f18887q[this.f18885c - 1];
        String s10 = s();
        int s02 = s0(s10, aVar);
        if (s02 == -1) {
            this.Y3 = 15;
            this.f18903b4 = s10;
            this.f18887q[this.f18885c - 1] = str;
        }
        return s02;
    }

    @Override // p4.c
    public void V() {
        f fVar;
        if (this.U3) {
            throw new a("Cannot skip unexpected " + B() + " at " + l());
        }
        int i10 = this.Y3;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 == 14) {
            e1();
        } else {
            if (i10 == 13) {
                fVar = f18898d4;
            } else if (i10 == 12) {
                fVar = f18897c4;
            } else if (i10 != 15) {
                throw new a("Expected a name but was " + B() + " at path " + l());
            }
            R0(fVar);
        }
        this.Y3 = 0;
        this.f18887q[this.f18885c - 1] = "null";
    }

    @Override // p4.c
    public void W() {
        f fVar;
        if (this.U3) {
            throw new a("Cannot skip unexpected " + B() + " at " + l());
        }
        int i10 = 0;
        do {
            int i11 = this.Y3;
            if (i11 == 0) {
                i11 = j0();
            }
            if (i11 == 3) {
                G(1);
            } else if (i11 == 1) {
                G(3);
            } else {
                if (i11 == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new a("Expected a value but was " + B() + " at path " + l());
                    }
                } else if (i11 == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new a("Expected a value but was " + B() + " at path " + l());
                    }
                } else {
                    if (i11 == 14 || i11 == 10) {
                        e1();
                    } else {
                        if (i11 == 9 || i11 == 13) {
                            fVar = f18898d4;
                        } else if (i11 == 8 || i11 == 12) {
                            fVar = f18897c4;
                        } else if (i11 == 17) {
                            this.X3.skip(this.f18902a4);
                        } else if (i11 == 18) {
                            throw new a("Expected a value but was " + B() + " at path " + l());
                        }
                        R0(fVar);
                    }
                    this.Y3 = 0;
                }
                this.f18885c--;
                this.Y3 = 0;
            }
            i10++;
            this.Y3 = 0;
        } while (i10 != 0);
        int[] iArr = this.f18888x;
        int i12 = this.f18885c;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f18887q[i12 - 1] = "null";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.Y3 = 0;
        this.f18886d[0] = 8;
        this.f18885c = 1;
        this.X3.e();
        this.W3.close();
    }

    @Override // p4.c
    public void e() {
        int i10 = this.Y3;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 == 3) {
            G(1);
            this.f18888x[this.f18885c - 1] = 0;
            this.Y3 = 0;
            return;
        }
        throw new a("Expected BEGIN_ARRAY but was " + B() + " at path " + l());
    }

    @Override // p4.c
    public void f() {
        int i10 = this.Y3;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 == 1) {
            G(3);
            this.Y3 = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + B() + " at path " + l());
    }

    @Override // p4.c
    public void h() {
        int i10 = this.Y3;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 != 4) {
            throw new a("Expected END_ARRAY but was " + B() + " at path " + l());
        }
        int i11 = this.f18885c - 1;
        this.f18885c = i11;
        int[] iArr = this.f18888x;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.Y3 = 0;
    }

    @Override // p4.c
    public void i() {
        int i10 = this.Y3;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 != 2) {
            throw new a("Expected END_OBJECT but was " + B() + " at path " + l());
        }
        int i11 = this.f18885c - 1;
        this.f18885c = i11;
        this.f18887q[i11] = null;
        int[] iArr = this.f18888x;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.Y3 = 0;
    }

    @Override // p4.c
    public boolean j() {
        int i10 = this.Y3;
        if (i10 == 0) {
            i10 = j0();
        }
        return (i10 == 2 || i10 == 4 || i10 == 18) ? false : true;
    }

    @Override // p4.c
    public boolean n() {
        int i10 = this.Y3;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 == 5) {
            this.Y3 = 0;
            int[] iArr = this.f18888x;
            int i11 = this.f18885c - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.Y3 = 0;
            int[] iArr2 = this.f18888x;
            int i12 = this.f18885c - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new a("Expected a boolean but was " + B() + " at path " + l());
        }
    }

    @Override // p4.c
    public double p() {
        double parseDouble;
        String D0;
        f fVar;
        int i10 = this.Y3;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 == 16) {
            this.Y3 = 0;
            int[] iArr = this.f18888x;
            int i11 = this.f18885c - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.Z3;
        }
        try {
            if (i10 == 17) {
                D0 = this.X3.R0(this.f18902a4);
            } else {
                if (i10 == 9) {
                    fVar = f18898d4;
                } else if (i10 == 8) {
                    fVar = f18897c4;
                } else if (i10 != 10) {
                    if (i10 != 11) {
                        throw new a("Expected a double but was " + B() + " at path " + l());
                    }
                    this.Y3 = 11;
                    parseDouble = Double.parseDouble(this.f18903b4);
                    if (!this.f18889y || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                        this.f18903b4 = null;
                        this.Y3 = 0;
                        int[] iArr2 = this.f18888x;
                        int i12 = this.f18885c - 1;
                        iArr2[i12] = iArr2[i12] + 1;
                        return parseDouble;
                    }
                    throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + l());
                } else {
                    D0 = D0();
                }
                D0 = z0(fVar);
            }
            parseDouble = Double.parseDouble(this.f18903b4);
            if (!this.f18889y) {
            }
            this.f18903b4 = null;
            this.Y3 = 0;
            int[] iArr22 = this.f18888x;
            int i122 = this.f18885c - 1;
            iArr22[i122] = iArr22[i122] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f18903b4 + " at path " + l());
        }
        this.f18903b4 = D0;
        this.Y3 = 11;
    }

    @Override // p4.c
    public int r() {
        int i10 = this.Y3;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 == 16) {
            long j10 = this.Z3;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.Y3 = 0;
                int[] iArr = this.f18888x;
                int i12 = this.f18885c - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new a("Expected an int but was " + this.Z3 + " at path " + l());
        }
        if (i10 == 17) {
            this.f18903b4 = this.X3.R0(this.f18902a4);
        } else if (i10 == 9 || i10 == 8) {
            String z02 = z0(i10 == 9 ? f18898d4 : f18897c4);
            this.f18903b4 = z02;
            try {
                int parseInt = Integer.parseInt(z02);
                this.Y3 = 0;
                int[] iArr2 = this.f18888x;
                int i13 = this.f18885c - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i10 != 11) {
            throw new a("Expected an int but was " + B() + " at path " + l());
        }
        this.Y3 = 11;
        try {
            double parseDouble = Double.parseDouble(this.f18903b4);
            int i14 = (int) parseDouble;
            if (i14 == parseDouble) {
                this.f18903b4 = null;
                this.Y3 = 0;
                int[] iArr3 = this.f18888x;
                int i15 = this.f18885c - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new a("Expected an int but was " + this.f18903b4 + " at path " + l());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f18903b4 + " at path " + l());
        }
    }

    @Override // p4.c
    public String s() {
        String str;
        f fVar;
        int i10 = this.Y3;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 == 14) {
            str = D0();
        } else {
            if (i10 == 13) {
                fVar = f18898d4;
            } else if (i10 == 12) {
                fVar = f18897c4;
            } else if (i10 != 15) {
                throw new a("Expected a name but was " + B() + " at path " + l());
            } else {
                str = this.f18903b4;
            }
            str = z0(fVar);
        }
        this.Y3 = 0;
        this.f18887q[this.f18885c - 1] = str;
        return str;
    }

    public String toString() {
        return "JsonReader(" + this.W3 + ")";
    }

    @Override // p4.c
    public String u() {
        String str;
        f fVar;
        int i10 = this.Y3;
        if (i10 == 0) {
            i10 = j0();
        }
        if (i10 == 10) {
            str = D0();
        } else {
            if (i10 == 9) {
                fVar = f18898d4;
            } else if (i10 == 8) {
                fVar = f18897c4;
            } else if (i10 == 11) {
                str = this.f18903b4;
                this.f18903b4 = null;
            } else if (i10 == 16) {
                str = Long.toString(this.Z3);
            } else if (i10 != 17) {
                throw new a("Expected a string but was " + B() + " at path " + l());
            } else {
                str = this.X3.R0(this.f18902a4);
            }
            str = z0(fVar);
        }
        this.Y3 = 0;
        int[] iArr = this.f18888x;
        int i11 = this.f18885c - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }
}
