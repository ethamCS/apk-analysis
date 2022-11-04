package f;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;
/* loaded from: classes.dex */
public final class o implements e {

    /* renamed from: b */
    public final c f4466b = new c();

    /* renamed from: c */
    public final t f4467c;

    /* renamed from: d */
    boolean f4468d;

    /* loaded from: classes.dex */
    class a extends InputStream {
        a() {
            o.this = r1;
        }

        @Override // java.io.InputStream
        public int available() {
            o oVar = o.this;
            if (!oVar.f4468d) {
                return (int) Math.min(oVar.f4466b.f4436c, 2147483647L);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            o.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            o oVar = o.this;
            if (!oVar.f4468d) {
                c cVar = oVar.f4466b;
                if (cVar.f4436c != 0 || oVar.f4467c.q(cVar, 8192L) != -1) {
                    return o.this.f4466b.d0() & 255;
                }
                return -1;
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (!o.this.f4468d) {
                v.b(bArr.length, i, i2);
                o oVar = o.this;
                c cVar = oVar.f4466b;
                if (cVar.f4436c != 0 || oVar.f4467c.q(cVar, 8192L) != -1) {
                    return o.this.f4466b.n0(bArr, i, i2);
                }
                return -1;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return o.this + ".inputStream()";
        }
    }

    public o(t tVar) {
        Objects.requireNonNull(tVar, "source == null");
        this.f4467c = tVar;
    }

    @Override // f.e
    public int E() {
        M(4L);
        return this.f4466b.E();
    }

    @Override // f.e
    public String K() {
        return u(Long.MAX_VALUE);
    }

    @Override // f.e
    public void M(long j) {
        if (c(j)) {
            return;
        }
        throw new EOFException();
    }

    @Override // f.e
    public int P() {
        M(4L);
        return this.f4466b.P();
    }

    @Override // f.e
    public c R() {
        return this.f4466b;
    }

    @Override // f.e
    public boolean S() {
        if (!this.f4468d) {
            return this.f4466b.S() && this.f4467c.q(this.f4466b, 8192L) == -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.e
    public long W(byte b2) {
        return a(b2, 0L, Long.MAX_VALUE);
    }

    @Override // f.e
    public byte[] Y(long j) {
        M(j);
        return this.f4466b.Y(j);
    }

    public long a(byte b2, long j, long j2) {
        if (!this.f4468d) {
            if (j < 0 || j2 < j) {
                throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
            }
            while (j < j2) {
                long l0 = this.f4466b.l0(b2, j, j2);
                if (l0 == -1) {
                    c cVar = this.f4466b;
                    long j3 = cVar.f4436c;
                    if (j3 >= j2 || this.f4467c.q(cVar, 8192L) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return l0;
                }
            }
            return -1L;
        }
        throw new IllegalStateException("closed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r1 == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // f.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a0() {
        /*
            r6 = this;
            r0 = 1
            r6.M(r0)
            r0 = 0
            r1 = 0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.c(r3)
            if (r3 == 0) goto L4a
            f.c r3 = r6.f4466b
            long r4 = (long) r1
            byte r3 = r3.k0(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L30
        L1f:
            r4 = 97
            if (r3 < r4) goto L27
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L30
        L27:
            r4 = 65
            if (r3 < r4) goto L32
            r4 = 70
            if (r3 <= r4) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L4a:
            f.c r0 = r6.f4466b
            long r0 = r0.a0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o.a0():long");
    }

    @Override // f.e, f.d
    public c b() {
        return this.f4466b;
    }

    public boolean c(long j) {
        c cVar;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f4468d) {
            throw new IllegalStateException("closed");
        } else {
            do {
                cVar = this.f4466b;
                if (cVar.f4436c >= j) {
                    return true;
                }
            } while (this.f4467c.q(cVar, 8192L) != -1);
            return false;
        }
    }

    @Override // f.e
    public InputStream c0() {
        return new a();
    }

    @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f4468d) {
            return;
        }
        this.f4468d = true;
        this.f4467c.close();
        this.f4466b.f0();
    }

    @Override // f.t
    public u d() {
        return this.f4467c.d();
    }

    @Override // f.e
    public byte d0() {
        M(1L);
        return this.f4466b.d0();
    }

    @Override // f.e
    public int e0(m mVar) {
        if (!this.f4468d) {
            do {
                int u0 = this.f4466b.u0(mVar, true);
                if (u0 == -1) {
                    return -1;
                }
                if (u0 != -2) {
                    this.f4466b.w(mVar.f4461b[u0].r());
                    return u0;
                }
            } while (this.f4467c.q(this.f4466b, 8192L) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f4468d;
    }

    @Override // f.e
    public void l(byte[] bArr) {
        try {
            M(bArr.length);
            this.f4466b.l(bArr);
        } catch (EOFException e2) {
            int i = 0;
            while (true) {
                c cVar = this.f4466b;
                long j = cVar.f4436c;
                if (j <= 0) {
                    throw e2;
                }
                int n0 = cVar.n0(bArr, i, (int) j);
                if (n0 == -1) {
                    throw new AssertionError();
                }
                i += n0;
            }
        }
    }

    @Override // f.e
    public short m() {
        M(2L);
        return this.f4466b.m();
    }

    @Override // f.t
    public long q(c cVar, long j) {
        if (cVar != null) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f4468d) {
                throw new IllegalStateException("closed");
            } else {
                c cVar2 = this.f4466b;
                if (cVar2.f4436c == 0 && this.f4467c.q(cVar2, 8192L) == -1) {
                    return -1L;
                }
                return this.f4466b.q(cVar, Math.min(j, this.f4466b.f4436c));
            }
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        c cVar = this.f4466b;
        if (cVar.f4436c == 0 && this.f4467c.q(cVar, 8192L) == -1) {
            return -1;
        }
        return this.f4466b.read(byteBuffer);
    }

    @Override // f.e
    public f s(long j) {
        M(j);
        return this.f4466b.s(j);
    }

    public String toString() {
        return "buffer(" + this.f4467c + ")";
    }

    @Override // f.e
    public String u(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long a2 = a((byte) 10, 0L, j2);
        if (a2 != -1) {
            return this.f4466b.t0(a2);
        }
        if (j2 < Long.MAX_VALUE && c(j2) && this.f4466b.k0(j2 - 1) == 13 && c(1 + j2) && this.f4466b.k0(j2) == 10) {
            return this.f4466b.t0(j2);
        }
        c cVar = new c();
        c cVar2 = this.f4466b;
        cVar2.i0(cVar, 0L, Math.min(32L, cVar2.v0()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f4466b.v0(), j) + " content=" + cVar.p0().l() + (char) 8230);
    }

    @Override // f.e
    public void w(long j) {
        if (!this.f4468d) {
            while (j > 0) {
                c cVar = this.f4466b;
                if (cVar.f4436c == 0 && this.f4467c.q(cVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f4466b.v0());
                this.f4466b.w(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.e
    public long y(s sVar) {
        c cVar;
        if (sVar != null) {
            long j = 0;
            while (true) {
                int i = (this.f4467c.q(this.f4466b, 8192L) > (-1L) ? 1 : (this.f4467c.q(this.f4466b, 8192L) == (-1L) ? 0 : -1));
                cVar = this.f4466b;
                if (i == 0) {
                    break;
                }
                long h0 = cVar.h0();
                if (h0 > 0) {
                    j += h0;
                    sVar.i(this.f4466b, h0);
                }
            }
            if (cVar.v0() <= 0) {
                return j;
            }
            long v0 = j + this.f4466b.v0();
            c cVar2 = this.f4466b;
            sVar.i(cVar2, cVar2.v0());
            return v0;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // f.e
    public short z() {
        M(2L);
        return this.f4466b.z();
    }
}
