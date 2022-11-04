package f;

import java.nio.ByteBuffer;
import java.util.Objects;
/* loaded from: classes.dex */
public final class n implements d {

    /* renamed from: b */
    public final c f4463b = new c();

    /* renamed from: c */
    public final s f4464c;

    /* renamed from: d */
    boolean f4465d;

    public n(s sVar) {
        Objects.requireNonNull(sVar, "sink == null");
        this.f4464c = sVar;
    }

    @Override // f.d
    public d A(int i) {
        if (!this.f4465d) {
            this.f4463b.H0(i);
            n();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.d
    public d F(int i) {
        if (!this.f4465d) {
            this.f4463b.G0(i);
            n();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.d
    public d O(String str) {
        if (!this.f4465d) {
            this.f4463b.J0(str);
            return n();
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.d
    public d Q(long j) {
        if (!this.f4465d) {
            this.f4463b.E0(j);
            n();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.d
    public d U(int i) {
        if (!this.f4465d) {
            this.f4463b.D0(i);
            n();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.d
    public c b() {
        return this.f4463b;
    }

    @Override // f.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Throwable th;
        if (this.f4465d) {
            return;
        }
        try {
            c cVar = this.f4463b;
            long j = cVar.f4436c;
            if (j > 0) {
                this.f4464c.i(cVar, j);
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f4464c.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f4465d = true;
        if (th == null) {
            return;
        }
        v.e(th);
        throw null;
    }

    @Override // f.s
    public u d() {
        return this.f4464c.d();
    }

    @Override // f.d
    public d e(byte[] bArr) {
        if (!this.f4465d) {
            this.f4463b.A0(bArr);
            n();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.d
    public d f(byte[] bArr, int i, int i2) {
        if (!this.f4465d) {
            this.f4463b.B0(bArr, i, i2);
            n();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.d, f.s, java.io.Flushable
    public void flush() {
        if (!this.f4465d) {
            c cVar = this.f4463b;
            long j = cVar.f4436c;
            if (j > 0) {
                this.f4464c.i(cVar, j);
            }
            this.f4464c.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.s
    public void i(c cVar, long j) {
        if (!this.f4465d) {
            this.f4463b.i(cVar, j);
            n();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f4465d;
    }

    @Override // f.d
    public d j(f fVar) {
        if (!this.f4465d) {
            this.f4463b.z0(fVar);
            n();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.d
    public d n() {
        if (!this.f4465d) {
            long h0 = this.f4463b.h0();
            if (h0 > 0) {
                this.f4464c.i(this.f4463b, h0);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // f.d
    public d o(long j) {
        if (!this.f4465d) {
            this.f4463b.F0(j);
            return n();
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        return "buffer(" + this.f4464c + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (!this.f4465d) {
            int write = this.f4463b.write(byteBuffer);
            n();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
