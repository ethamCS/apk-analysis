package f;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class c implements e, d, Cloneable, ByteChannel {

    /* renamed from: d */
    private static final byte[] f4434d = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    @Nullable

    /* renamed from: b */
    p f4435b;

    /* renamed from: c */
    long f4436c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends OutputStream {
        a() {
            c.this = r1;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return c.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            c.this.D0((byte) i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            c.this.B0(bArr, i, i2);
        }
    }

    /* loaded from: classes.dex */
    class b extends InputStream {
        b() {
            c.this = r1;
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.f4436c, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            c cVar = c.this;
            if (cVar.f4436c > 0) {
                return cVar.d0() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return c.this.n0(bArr, i, i2);
        }

        public String toString() {
            return c.this + ".inputStream()";
        }
    }

    @Override // f.d
    public /* bridge */ /* synthetic */ d A(int i) {
        H0(i);
        return this;
    }

    public c A0(byte[] bArr) {
        if (bArr != null) {
            B0(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public c B0(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = i2;
            v.b(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                p y0 = y0(1);
                int min = Math.min(i3 - i, 8192 - y0.f4472c);
                System.arraycopy(bArr, i, y0.f4470a, y0.f4472c, min);
                i += min;
                y0.f4472c += min;
            }
            this.f4436c += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public long C0(t tVar) {
        if (tVar != null) {
            long j = 0;
            while (true) {
                long q = tVar.q(this, 8192L);
                if (q == -1) {
                    return j;
                }
                j += q;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public c D0(int i) {
        p y0 = y0(1);
        byte[] bArr = y0.f4470a;
        int i2 = y0.f4472c;
        y0.f4472c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f4436c++;
        return this;
    }

    @Override // f.e
    public int E() {
        long j = this.f4436c;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.f4436c);
        }
        p pVar = this.f4435b;
        int i = pVar.f4471b;
        int i2 = pVar.f4472c;
        if (i2 - i < 4) {
            return ((d0() & 255) << 24) | ((d0() & 255) << 16) | ((d0() & 255) << 8) | (d0() & 255);
        }
        byte[] bArr = pVar.f4470a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.f4436c = j - 4;
        if (i8 == i2) {
            this.f4435b = pVar.b();
            q.a(pVar);
        } else {
            pVar.f4471b = i8;
        }
        return i9;
    }

    public c E0(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            D0(48);
            return this;
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                J0("-9223372036854775808");
                return this;
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        p y0 = y0(i2);
        byte[] bArr = y0.f4470a;
        int i3 = y0.f4472c + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = f4434d[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        y0.f4472c += i2;
        this.f4436c += i2;
        return this;
    }

    @Override // f.d
    public /* bridge */ /* synthetic */ d F(int i) {
        G0(i);
        return this;
    }

    public c F0(long j) {
        if (j == 0) {
            D0(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        p y0 = y0(numberOfTrailingZeros);
        byte[] bArr = y0.f4470a;
        int i = y0.f4472c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f4434d[(int) (15 & j)];
            j >>>= 4;
        }
        y0.f4472c += numberOfTrailingZeros;
        this.f4436c += numberOfTrailingZeros;
        return this;
    }

    public c G0(int i) {
        p y0 = y0(4);
        byte[] bArr = y0.f4470a;
        int i2 = y0.f4472c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        y0.f4472c = i5 + 1;
        this.f4436c += 4;
        return this;
    }

    public c H0(int i) {
        p y0 = y0(2);
        byte[] bArr = y0.f4470a;
        int i2 = y0.f4472c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        y0.f4472c = i3 + 1;
        this.f4436c += 2;
        return this;
    }

    public c I0(String str, int i, int i2, Charset charset) {
        if (str != null) {
            if (i < 0) {
                throw new IllegalAccessError("beginIndex < 0: " + i);
            } else if (i2 < i) {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
            } else if (i2 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
            } else if (charset == null) {
                throw new IllegalArgumentException("charset == null");
            } else {
                if (charset.equals(v.f4485a)) {
                    K0(str, i, i2);
                    return this;
                }
                byte[] bytes = str.substring(i, i2).getBytes(charset);
                B0(bytes, 0, bytes.length);
                return this;
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    public c J0(String str) {
        K0(str, 0, str.length());
        return this;
    }

    @Override // f.e
    public String K() {
        return u(Long.MAX_VALUE);
    }

    public c K0(String str, int i, int i2) {
        int i3;
        if (str != null) {
            if (i < 0) {
                throw new IllegalArgumentException("beginIndex < 0: " + i);
            } else if (i2 < i) {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
            } else if (i2 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
            } else {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt < 128) {
                        p y0 = y0(1);
                        byte[] bArr = y0.f4470a;
                        int i4 = y0.f4472c - i;
                        int min = Math.min(i2, 8192 - i4);
                        int i5 = i + 1;
                        bArr[i + i4] = (byte) charAt;
                        while (i5 < min) {
                            char charAt2 = str.charAt(i5);
                            if (charAt2 >= 128) {
                                break;
                            }
                            bArr[i5 + i4] = (byte) charAt2;
                            i5++;
                        }
                        int i6 = y0.f4472c;
                        int i7 = (i4 + i5) - i6;
                        y0.f4472c = i6 + i7;
                        this.f4436c += i7;
                        i = i5;
                    } else {
                        if (charAt < 2048) {
                            i3 = (charAt >> 6) | 192;
                        } else if (charAt < 55296 || charAt > 57343) {
                            D0((charAt >> '\f') | 224);
                            i3 = ((charAt >> 6) & 63) | 128;
                        } else {
                            int i8 = i + 1;
                            char charAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                            if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                                D0(63);
                                i = i8;
                            } else {
                                int i9 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                                D0((i9 >> 18) | 240);
                                D0(((i9 >> 12) & 63) | 128);
                                D0(((i9 >> 6) & 63) | 128);
                                D0((i9 & 63) | 128);
                                i += 2;
                            }
                        }
                        D0(i3);
                        D0((charAt & '?') | 128);
                        i++;
                    }
                }
                return this;
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    public c L0(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i >= 55296 && i <= 57343) {
                        D0(63);
                        return this;
                    }
                    i2 = (i >> 12) | 224;
                } else if (i > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                } else {
                    D0((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                }
                D0(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            D0(i3);
            i = (i & 63) | 128;
        }
        D0(i);
        return this;
    }

    @Override // f.e
    public void M(long j) {
        if (this.f4436c >= j) {
            return;
        }
        throw new EOFException();
    }

    @Override // f.d
    public /* bridge */ /* synthetic */ d O(String str) {
        J0(str);
        return this;
    }

    @Override // f.e
    public int P() {
        return v.c(E());
    }

    @Override // f.d
    public /* bridge */ /* synthetic */ d Q(long j) {
        E0(j);
        return this;
    }

    @Override // f.e
    public c R() {
        return this;
    }

    @Override // f.e
    public boolean S() {
        return this.f4436c == 0;
    }

    @Override // f.d
    public /* bridge */ /* synthetic */ d U(int i) {
        D0(i);
        return this;
    }

    @Override // f.e
    public long W(byte b2) {
        return l0(b2, 0L, Long.MAX_VALUE);
    }

    @Override // f.e
    public byte[] Y(long j) {
        v.b(this.f4436c, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            l(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3 A[EDGE_INSN: B:42:0x00a3->B:38:0x00a3 ?: BREAK  , SYNTHETIC] */
    @Override // f.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a0() {
        /*
            r15 = this;
            long r0 = r15.f4436c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Laa
            r0 = 0
            r4 = r2
            r1 = 0
        Lb:
            f.p r6 = r15.f4435b
            byte[] r7 = r6.f4470a
            int r8 = r6.f4471b
            int r9 = r6.f4472c
        L13:
            if (r8 >= r9) goto L8f
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L3a
        L22:
            r11 = 97
            if (r10 < r11) goto L2f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2f
            int r11 = r10 + (-97)
        L2c:
            int r11 = r11 + 10
            goto L3a
        L2f:
            r11 = 65
            if (r10 < r11) goto L70
            r11 = 70
            if (r10 > r11) goto L70
            int r11 = r10 + (-65)
            goto L2c
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L4a:
            f.c r0 = new f.c
            r0.<init>()
            r0.F0(r4)
            r0.D0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.r0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L70:
            if (r0 == 0) goto L74
            r1 = 1
            goto L8f
        L74:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8f:
            if (r8 != r9) goto L9b
            f.p r7 = r6.b()
            r15.f4435b = r7
            f.q.a(r6)
            goto L9d
        L9b:
            r6.f4471b = r8
        L9d:
            if (r1 != 0) goto La3
            f.p r6 = r15.f4435b
            if (r6 != 0) goto Lb
        La3:
            long r1 = r15.f4436c
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f4436c = r1
            return r4
        Laa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.c.a0():long");
    }

    @Override // f.e, f.d
    public c b() {
        return this;
    }

    @Override // f.e
    public InputStream c0() {
        return new b();
    }

    @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // f.t
    public u d() {
        return u.f4481d;
    }

    @Override // f.e
    public byte d0() {
        long j = this.f4436c;
        if (j != 0) {
            p pVar = this.f4435b;
            int i = pVar.f4471b;
            int i2 = pVar.f4472c;
            int i3 = i + 1;
            byte b2 = pVar.f4470a[i];
            this.f4436c = j - 1;
            if (i3 == i2) {
                this.f4435b = pVar.b();
                q.a(pVar);
            } else {
                pVar.f4471b = i3;
            }
            return b2;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // f.d
    public /* bridge */ /* synthetic */ d e(byte[] bArr) {
        A0(bArr);
        return this;
    }

    @Override // f.e
    public int e0(m mVar) {
        int u0 = u0(mVar, false);
        if (u0 == -1) {
            return -1;
        }
        try {
            w(mVar.f4461b[u0].r());
            return u0;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j = this.f4436c;
        if (j != cVar.f4436c) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        p pVar = this.f4435b;
        p pVar2 = cVar.f4435b;
        int i = pVar.f4471b;
        int i2 = pVar2.f4471b;
        while (j2 < this.f4436c) {
            long min = Math.min(pVar.f4472c - i, pVar2.f4472c - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (pVar.f4470a[i] != pVar2.f4470a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == pVar.f4472c) {
                pVar = pVar.f4475f;
                i = pVar.f4471b;
            }
            if (i2 == pVar2.f4472c) {
                pVar2 = pVar2.f4475f;
                i2 = pVar2.f4471b;
            }
            j2 += min;
        }
        return true;
    }

    @Override // f.d
    public /* bridge */ /* synthetic */ d f(byte[] bArr, int i, int i2) {
        B0(bArr, i, i2);
        return this;
    }

    public final void f0() {
        try {
            w(this.f4436c);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // f.d, f.s, java.io.Flushable
    public void flush() {
    }

    /* renamed from: g0 */
    public c clone() {
        c cVar = new c();
        if (this.f4436c == 0) {
            return cVar;
        }
        p d2 = this.f4435b.d();
        cVar.f4435b = d2;
        d2.f4476g = d2;
        d2.f4475f = d2;
        p pVar = this.f4435b;
        while (true) {
            pVar = pVar.f4475f;
            if (pVar == this.f4435b) {
                cVar.f4436c = this.f4436c;
                return cVar;
            }
            cVar.f4435b.f4476g.c(pVar.d());
        }
    }

    public final long h0() {
        long j = this.f4436c;
        if (j == 0) {
            return 0L;
        }
        p pVar = this.f4435b.f4476g;
        int i = pVar.f4472c;
        return (i >= 8192 || !pVar.f4474e) ? j : j - (i - pVar.f4471b);
    }

    public int hashCode() {
        p pVar = this.f4435b;
        if (pVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = pVar.f4472c;
            for (int i3 = pVar.f4471b; i3 < i2; i3++) {
                i = (i * 31) + pVar.f4470a[i3];
            }
            pVar = pVar.f4475f;
        } while (pVar != this.f4435b);
        return i;
    }

    @Override // f.s
    public void i(c cVar, long j) {
        if (cVar != null) {
            if (cVar == this) {
                throw new IllegalArgumentException("source == this");
            }
            v.b(cVar.f4436c, 0L, j);
            while (j > 0) {
                p pVar = cVar.f4435b;
                if (j < pVar.f4472c - pVar.f4471b) {
                    p pVar2 = this.f4435b;
                    p pVar3 = pVar2 != null ? pVar2.f4476g : null;
                    if (pVar3 != null && pVar3.f4474e) {
                        if ((pVar3.f4472c + j) - (pVar3.f4473d ? 0 : pVar3.f4471b) <= 8192) {
                            pVar.f(pVar3, (int) j);
                            cVar.f4436c -= j;
                            this.f4436c += j;
                            return;
                        }
                    }
                    cVar.f4435b = pVar.e((int) j);
                }
                p pVar4 = cVar.f4435b;
                long j2 = pVar4.f4472c - pVar4.f4471b;
                cVar.f4435b = pVar4.b();
                p pVar5 = this.f4435b;
                if (pVar5 == null) {
                    this.f4435b = pVar4;
                    pVar4.f4476g = pVar4;
                    pVar4.f4475f = pVar4;
                } else {
                    pVar5.f4476g.c(pVar4);
                    pVar4.a();
                }
                cVar.f4436c -= j2;
                this.f4436c += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final c i0(c cVar, long j, long j2) {
        if (cVar != null) {
            v.b(this.f4436c, j, j2);
            if (j2 == 0) {
                return this;
            }
            cVar.f4436c += j2;
            p pVar = this.f4435b;
            while (true) {
                int i = pVar.f4472c;
                int i2 = pVar.f4471b;
                if (j >= i - i2) {
                    j -= i - i2;
                    pVar = pVar.f4475f;
                }
            }
            while (j2 > 0) {
                p d2 = pVar.d();
                int i3 = (int) (d2.f4471b + j);
                d2.f4471b = i3;
                d2.f4472c = Math.min(i3 + ((int) j2), d2.f4472c);
                p pVar2 = cVar.f4435b;
                if (pVar2 == null) {
                    d2.f4476g = d2;
                    d2.f4475f = d2;
                    cVar.f4435b = d2;
                } else {
                    pVar2.f4476g.c(d2);
                }
                j2 -= d2.f4472c - d2.f4471b;
                pVar = pVar.f4475f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // f.d
    public /* bridge */ /* synthetic */ d j(f fVar) {
        z0(fVar);
        return this;
    }

    public c j0() {
        return this;
    }

    public final byte k0(long j) {
        int i;
        v.b(this.f4436c, j, 1L);
        long j2 = this.f4436c;
        if (j2 - j <= j) {
            long j3 = j - j2;
            p pVar = this.f4435b;
            do {
                pVar = pVar.f4476g;
                int i2 = pVar.f4472c;
                i = pVar.f4471b;
                j3 += i2 - i;
            } while (j3 < 0);
            return pVar.f4470a[i + ((int) j3)];
        }
        p pVar2 = this.f4435b;
        while (true) {
            int i3 = pVar2.f4472c;
            int i4 = pVar2.f4471b;
            long j4 = i3 - i4;
            if (j < j4) {
                return pVar2.f4470a[i4 + ((int) j)];
            }
            j -= j4;
            pVar2 = pVar2.f4475f;
        }
    }

    @Override // f.e
    public void l(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int n0 = n0(bArr, i, bArr.length - i);
            if (n0 == -1) {
                throw new EOFException();
            }
            i += n0;
        }
    }

    public long l0(byte b2, long j, long j2) {
        p pVar;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f4436c), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.f4436c;
        long j5 = j2 > j4 ? j4 : j2;
        if (j == j5 || (pVar = this.f4435b) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                pVar = pVar.f4476g;
                j4 -= pVar.f4472c - pVar.f4471b;
            }
        } else {
            while (true) {
                long j6 = (pVar.f4472c - pVar.f4471b) + j3;
                if (j6 >= j) {
                    break;
                }
                pVar = pVar.f4475f;
                j3 = j6;
            }
            j4 = j3;
        }
        long j7 = j;
        while (j4 < j5) {
            byte[] bArr = pVar.f4470a;
            int min = (int) Math.min(pVar.f4472c, (pVar.f4471b + j5) - j4);
            for (int i = (int) ((pVar.f4471b + j7) - j4); i < min; i++) {
                if (bArr[i] == b2) {
                    return (i - pVar.f4471b) + j4;
                }
            }
            j4 += pVar.f4472c - pVar.f4471b;
            pVar = pVar.f4475f;
            j7 = j4;
        }
        return -1L;
    }

    @Override // f.e
    public short m() {
        return v.d(z());
    }

    public OutputStream m0() {
        return new a();
    }

    @Override // f.d
    public /* bridge */ /* synthetic */ d n() {
        j0();
        return this;
    }

    public int n0(byte[] bArr, int i, int i2) {
        v.b(bArr.length, i, i2);
        p pVar = this.f4435b;
        if (pVar == null) {
            return -1;
        }
        int min = Math.min(i2, pVar.f4472c - pVar.f4471b);
        System.arraycopy(pVar.f4470a, pVar.f4471b, bArr, i, min);
        int i3 = pVar.f4471b + min;
        pVar.f4471b = i3;
        this.f4436c -= min;
        if (i3 == pVar.f4472c) {
            this.f4435b = pVar.b();
            q.a(pVar);
        }
        return min;
    }

    @Override // f.d
    public /* bridge */ /* synthetic */ d o(long j) {
        F0(j);
        return this;
    }

    public byte[] o0() {
        try {
            return Y(this.f4436c);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public f p0() {
        return new f(o0());
    }

    @Override // f.t
    public long q(c cVar, long j) {
        if (cVar != null) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            long j2 = this.f4436c;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            cVar.i(this, j);
            return j;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public String q0(long j, Charset charset) {
        v.b(this.f4436c, 0L, j);
        if (charset != null) {
            if (j > 2147483647L) {
                throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
            } else if (j == 0) {
                return "";
            } else {
                p pVar = this.f4435b;
                if (pVar.f4471b + j > pVar.f4472c) {
                    return new String(Y(j), charset);
                }
                String str = new String(pVar.f4470a, pVar.f4471b, (int) j, charset);
                int i = (int) (pVar.f4471b + j);
                pVar.f4471b = i;
                this.f4436c -= j;
                if (i == pVar.f4472c) {
                    this.f4435b = pVar.b();
                    q.a(pVar);
                }
                return str;
            }
        }
        throw new IllegalArgumentException("charset == null");
    }

    public String r0() {
        try {
            return q0(this.f4436c, v.f4485a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        p pVar = this.f4435b;
        if (pVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), pVar.f4472c - pVar.f4471b);
        byteBuffer.put(pVar.f4470a, pVar.f4471b, min);
        int i = pVar.f4471b + min;
        pVar.f4471b = i;
        this.f4436c -= min;
        if (i == pVar.f4472c) {
            this.f4435b = pVar.b();
            q.a(pVar);
        }
        return min;
    }

    @Override // f.e
    public f s(long j) {
        return new f(Y(j));
    }

    public String s0(long j) {
        return q0(j, v.f4485a);
    }

    public String t0(long j) {
        String s0;
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (k0(j3) == 13) {
                s0 = s0(j3);
                j2 = 2;
                w(j2);
                return s0;
            }
        }
        s0 = s0(j);
        w(j2);
        return s0;
    }

    public String toString() {
        return w0().toString();
    }

    @Override // f.e
    public String u(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j + 1;
        }
        long l0 = l0((byte) 10, 0L, j2);
        if (l0 != -1) {
            return t0(l0);
        }
        if (j2 < v0() && k0(j2 - 1) == 13 && k0(j2) == 10) {
            return t0(j2);
        }
        c cVar = new c();
        i0(cVar, 0L, Math.min(32L, v0()));
        throw new EOFException("\\n not found: limit=" + Math.min(v0(), j) + " content=" + cVar.p0().l() + (char) 8230);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (r19 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int u0(f.m r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.c.u0(f.m, boolean):int");
    }

    public final long v0() {
        return this.f4436c;
    }

    @Override // f.e
    public void w(long j) {
        p pVar;
        while (j > 0) {
            if (this.f4435b == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, pVar.f4472c - pVar.f4471b);
            long j2 = min;
            this.f4436c -= j2;
            j -= j2;
            p pVar2 = this.f4435b;
            int i = pVar2.f4471b + min;
            pVar2.f4471b = i;
            if (i == pVar2.f4472c) {
                this.f4435b = pVar2.b();
                q.a(pVar2);
            }
        }
    }

    public final f w0() {
        long j = this.f4436c;
        if (j <= 2147483647L) {
            return x0((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f4436c);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                p y0 = y0(1);
                int min = Math.min(i, 8192 - y0.f4472c);
                byteBuffer.get(y0.f4470a, y0.f4472c, min);
                i -= min;
                y0.f4472c += min;
            }
            this.f4436c += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final f x0(int i) {
        return i == 0 ? f.f4440f : new r(this, i);
    }

    @Override // f.e
    public long y(s sVar) {
        long j = this.f4436c;
        if (j > 0) {
            sVar.i(this, j);
        }
        return j;
    }

    public p y0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        p pVar = this.f4435b;
        if (pVar == null) {
            p b2 = q.b();
            this.f4435b = b2;
            b2.f4476g = b2;
            b2.f4475f = b2;
            return b2;
        }
        p pVar2 = pVar.f4476g;
        if (pVar2.f4472c + i <= 8192 && pVar2.f4474e) {
            return pVar2;
        }
        p b3 = q.b();
        pVar2.c(b3);
        return b3;
    }

    @Override // f.e
    public short z() {
        long j = this.f4436c;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.f4436c);
        }
        p pVar = this.f4435b;
        int i = pVar.f4471b;
        int i2 = pVar.f4472c;
        if (i2 - i < 2) {
            return (short) (((d0() & 255) << 8) | (d0() & 255));
        }
        byte[] bArr = pVar.f4470a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.f4436c = j - 2;
        if (i4 == i2) {
            this.f4435b = pVar.b();
            q.a(pVar);
        } else {
            pVar.f4471b = i4;
        }
        return (short) i5;
    }

    public c z0(f fVar) {
        if (fVar != null) {
            fVar.x(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }
}
