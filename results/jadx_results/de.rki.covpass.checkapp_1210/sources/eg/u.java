package eg;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0018H\u0016J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020\u0013H\u0016J\b\u0010#\u001a\u00020\u0013H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J\b\u0010&\u001a\u00020\u0005H\u0016J\u0010\u0010'\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\rH\u0016J \u0010+\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005H\u0016J\u0010\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u000fH\u0016J\u0018\u0010.\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u0005H\u0016J\u0010\u00100\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u000fH\u0016J\u0018\u00101\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u00020\u0001H\u0016J\b\u00104\u001a\u000203H\u0016J\b\u00105\u001a\u00020\bH\u0016J\b\u00106\u001a\u00020\nH\u0016J\b\u00108\u001a\u000207H\u0016J\b\u00109\u001a\u00020\u001bH\u0016R\u001b\u0010>\u001a\u00020\u00028Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\b<\u0010=\u001a\u0004\b:\u0010;¨\u0006C"}, d2 = {"Leg/u;", "Leg/e;", "Leg/c;", "E", "sink", BuildConfig.FLAVOR, "byteCount", "g1", BuildConfig.FLAVOR, "g0", "Ltb/e0;", "N0", "P", BuildConfig.FLAVOR, "readByte", "Leg/f;", "F", "Leg/q;", "options", BuildConfig.FLAVOR, "Q", BuildConfig.FLAVOR, "l0", "readFully", "Ljava/nio/ByteBuffer;", "read", "Z0", BuildConfig.FLAVOR, "b0", "limit", "y0", BuildConfig.FLAVOR, "readShort", "j", "readInt", "i", "readLong", "v0", "b1", "skip", "b", "fromIndex", "toIndex", "e", "bytes", "X", "f", "targetBytes", "Y", "h", "J0", "Ljava/io/InputStream;", "d1", "isOpen", "close", "Leg/b0;", "m", "toString", "c", "()Leg/c;", "getBuffer$annotations", "()V", "buffer", "Leg/a0;", "source", "<init>", "(Leg/a0;)V", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class u implements e {

    /* renamed from: c */
    public final a0 f9646c;

    /* renamed from: d */
    public final c f9647d = new c();

    /* renamed from: q */
    public boolean f9648q;

    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"eg/u$a", "Ljava/io/InputStream;", BuildConfig.FLAVOR, "read", BuildConfig.FLAVOR, "data", "offset", "byteCount", "available", "Ltb/e0;", "close", BuildConfig.FLAVOR, "toString", "okio"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a extends InputStream {
        a() {
            u.this = r1;
        }

        @Override // java.io.InputStream
        public int available() {
            u uVar = u.this;
            if (!uVar.f9648q) {
                return (int) Math.min(uVar.f9647d.e1(), Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            u.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            u uVar = u.this;
            if (!uVar.f9648q) {
                if (uVar.f9647d.e1() == 0) {
                    u uVar2 = u.this;
                    if (uVar2.f9646c.g1(uVar2.f9647d, 8192L) == -1) {
                        return -1;
                    }
                }
                return u.this.f9647d.readByte() & 255;
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            hc.t.e(bArr, "data");
            if (!u.this.f9648q) {
                f0.b(bArr.length, i10, i11);
                if (u.this.f9647d.e1() == 0) {
                    u uVar = u.this;
                    if (uVar.f9646c.g1(uVar.f9647d, 8192L) == -1) {
                        return -1;
                    }
                }
                return u.this.f9647d.read(bArr, i10, i11);
            }
            throw new IOException("closed");
        }

        public String toString() {
            return u.this + ".inputStream()";
        }
    }

    public u(a0 a0Var) {
        hc.t.e(a0Var, "source");
        this.f9646c = a0Var;
    }

    @Override // eg.e
    public c E() {
        return this.f9647d;
    }

    @Override // eg.e
    public f F(long j10) {
        N0(j10);
        return this.f9647d.F(j10);
    }

    @Override // eg.e
    public e J0() {
        return n.d(new s(this));
    }

    @Override // eg.e
    public void N0(long j10) {
        if (P(j10)) {
            return;
        }
        throw new EOFException();
    }

    @Override // eg.e
    public boolean P(long j10) {
        if (j10 >= 0) {
            if (!(!this.f9648q)) {
                throw new IllegalStateException("closed".toString());
            }
            while (this.f9647d.e1() < j10) {
                if (this.f9646c.g1(this.f9647d, 8192L) == -1) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException(hc.t.l("byteCount < 0: ", Long.valueOf(j10)).toString());
    }

    @Override // eg.e
    public int Q(q qVar) {
        hc.t.e(qVar, "options");
        if (!this.f9648q) {
            while (true) {
                int e10 = fg.a.e(this.f9647d, qVar, true);
                if (e10 == -2) {
                    if (this.f9646c.g1(this.f9647d, 8192L) == -1) {
                        break;
                    }
                } else if (e10 != -1) {
                    this.f9647d.skip(qVar.e()[e10].W());
                    return e10;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // eg.e
    public long X(f fVar) {
        hc.t.e(fVar, "bytes");
        return f(fVar, 0L);
    }

    @Override // eg.e
    public long Y(f fVar) {
        hc.t.e(fVar, "targetBytes");
        return h(fVar, 0L);
    }

    @Override // eg.e
    public void Z0(c cVar, long j10) {
        hc.t.e(cVar, "sink");
        try {
            N0(j10);
            this.f9647d.Z0(cVar, j10);
        } catch (EOFException e10) {
            cVar.G0(this.f9647d);
            throw e10;
        }
    }

    public long b(byte b10) {
        return e(b10, 0L, Long.MAX_VALUE);
    }

    @Override // eg.e
    public String b0() {
        return y0(Long.MAX_VALUE);
    }

    @Override // eg.e
    public long b1() {
        byte M;
        int a10;
        int a11;
        N0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!P(i11)) {
                break;
            }
            M = this.f9647d.M(i10);
            if ((M < ((byte) 48) || M > ((byte) 57)) && ((M < ((byte) 97) || M > ((byte) 102)) && (M < ((byte) 65) || M > ((byte) 70)))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            a10 = bf.b.a(16);
            a11 = bf.b.a(a10);
            String num = Integer.toString(M, a11);
            hc.t.d(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            throw new NumberFormatException(hc.t.l("Expected leading [0-9a-fA-F] character but was 0x", num));
        }
        return this.f9647d.b1();
    }

    @Override // eg.e, eg.d
    public c c() {
        return this.f9647d;
    }

    @Override // eg.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f9648q) {
            return;
        }
        this.f9648q = true;
        this.f9646c.close();
        this.f9647d.e();
    }

    @Override // eg.e
    public InputStream d1() {
        return new a();
    }

    public long e(byte b10, long j10, long j11) {
        boolean z10 = true;
        if (!this.f9648q) {
            if (0 > j10 || j10 > j11) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
            }
            while (j10 < j11) {
                long V = this.f9647d.V(b10, j10, j11);
                if (V != -1) {
                    return V;
                }
                long e12 = this.f9647d.e1();
                if (e12 >= j11 || this.f9646c.g1(this.f9647d, 8192L) == -1) {
                    return -1L;
                }
                j10 = Math.max(j10, e12);
            }
            return -1L;
        }
        throw new IllegalStateException("closed".toString());
    }

    public long f(f fVar, long j10) {
        hc.t.e(fVar, "bytes");
        if (!this.f9648q) {
            while (true) {
                long W = this.f9647d.W(fVar, j10);
                if (W != -1) {
                    return W;
                }
                long e12 = this.f9647d.e1();
                if (this.f9646c.g1(this.f9647d, 8192L) == -1) {
                    return -1L;
                }
                j10 = Math.max(j10, (e12 - fVar.W()) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // eg.e
    public boolean g0() {
        if (!this.f9648q) {
            return this.f9647d.g0() && this.f9646c.g1(this.f9647d, 8192L) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // eg.a0
    public long g1(c cVar, long j10) {
        hc.t.e(cVar, "sink");
        if (j10 >= 0) {
            if (!(!this.f9648q)) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f9647d.e1() == 0 && this.f9646c.g1(this.f9647d, 8192L) == -1) {
                return -1L;
            }
            return this.f9647d.g1(cVar, Math.min(j10, this.f9647d.e1()));
        }
        throw new IllegalArgumentException(hc.t.l("byteCount < 0: ", Long.valueOf(j10)).toString());
    }

    public long h(f fVar, long j10) {
        hc.t.e(fVar, "targetBytes");
        if (!this.f9648q) {
            while (true) {
                long e02 = this.f9647d.e0(fVar, j10);
                if (e02 != -1) {
                    return e02;
                }
                long e12 = this.f9647d.e1();
                if (this.f9646c.g1(this.f9647d, 8192L) == -1) {
                    return -1L;
                }
                j10 = Math.max(j10, e12);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public int i() {
        N0(4L);
        return this.f9647d.z0();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f9648q;
    }

    public short j() {
        N0(2L);
        return this.f9647d.D0();
    }

    @Override // eg.e
    public byte[] l0(long j10) {
        N0(j10);
        return this.f9647d.l0(j10);
    }

    @Override // eg.a0
    public b0 m() {
        return this.f9646c.m();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        hc.t.e(byteBuffer, "sink");
        if (this.f9647d.e1() == 0 && this.f9646c.g1(this.f9647d, 8192L) == -1) {
            return -1;
        }
        return this.f9647d.read(byteBuffer);
    }

    @Override // eg.e
    public byte readByte() {
        N0(1L);
        return this.f9647d.readByte();
    }

    @Override // eg.e
    public void readFully(byte[] bArr) {
        hc.t.e(bArr, "sink");
        try {
            N0(bArr.length);
            this.f9647d.readFully(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.f9647d.e1() > 0) {
                c cVar = this.f9647d;
                int read = cVar.read(bArr, i10, (int) cVar.e1());
                if (read == -1) {
                    throw new AssertionError();
                }
                i10 += read;
            }
            throw e10;
        }
    }

    @Override // eg.e
    public int readInt() {
        N0(4L);
        return this.f9647d.readInt();
    }

    @Override // eg.e
    public long readLong() {
        N0(8L);
        return this.f9647d.readLong();
    }

    @Override // eg.e
    public short readShort() {
        N0(2L);
        return this.f9647d.readShort();
    }

    @Override // eg.e
    public void skip(long j10) {
        if (!this.f9648q) {
            while (j10 > 0) {
                if (this.f9647d.e1() == 0 && this.f9646c.g1(this.f9647d, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, this.f9647d.e1());
                this.f9647d.skip(min);
                j10 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        return "buffer(" + this.f9646c + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r4 == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        r1 = bf.b.a(16);
        r1 = bf.b.a(r1);
        r1 = java.lang.Integer.toString(r8, r1);
        hc.t.d(r1, "java.lang.Integer.toStri…(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        throw new java.lang.NumberFormatException(hc.t.l("Expected a digit or '-' but was 0x", r1));
     */
    @Override // eg.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long v0() {
        /*
            r10 = this;
            r0 = 1
            r10.N0(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.P(r6)
            if (r8 == 0) goto L4e
            eg.c r8 = r10.f9647d
            byte r8 = r8.M(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L20
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L2a
        L20:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2c
            r5 = 45
            byte r5 = (byte) r5
            if (r8 == r5) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto L8
        L2c:
            if (r4 == 0) goto L2f
            goto L4e
        L2f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            int r1 = bf.a.a(r1)
            int r1 = bf.a.a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            hc.t.d(r1, r2)
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            java.lang.String r1 = hc.t.l(r2, r1)
            r0.<init>(r1)
            throw r0
        L4e:
            eg.c r0 = r10.f9647d
            long r0 = r0.v0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.u.v0():long");
    }

    @Override // eg.e
    public String y0(long j10) {
        if (j10 >= 0) {
            long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
            byte b10 = (byte) 10;
            long e10 = e(b10, 0L, j11);
            if (e10 != -1) {
                return fg.a.d(this.f9647d, e10);
            }
            if (j11 < Long.MAX_VALUE && P(j11) && this.f9647d.M(j11 - 1) == ((byte) 13) && P(1 + j11) && this.f9647d.M(j11) == b10) {
                return fg.a.d(this.f9647d, j11);
            }
            c cVar = new c();
            c cVar2 = this.f9647d;
            cVar2.j(cVar, 0L, Math.min(32, cVar2.e1()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f9647d.e1(), j10) + " content=" + cVar.w0().x() + (char) 8230);
        }
        throw new IllegalArgumentException(hc.t.l("limit < 0: ", Long.valueOf(j10)).toString());
    }
}
