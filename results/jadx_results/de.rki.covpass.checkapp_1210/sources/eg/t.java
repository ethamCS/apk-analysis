package eg;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u0011\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0012H\u0016J \u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J\u0010\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u000eH\u0016J\u0010\u0010!\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0004H\u0016J\u0010\u0010\"\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u0004H\u0016J\b\u0010#\u001a\u00020\u0001H\u0016J\b\u0010$\u001a\u00020\u0001H\u0016J\b\u0010%\u001a\u00020\u0006H\u0016J\b\u0010'\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J\b\u0010*\u001a\u00020)H\u0016J\b\u0010+\u001a\u00020\u000bH\u0016R\u001b\u00100\u001a\u00020\u00028Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-¨\u00065"}, d2 = {"Leg/t;", "Leg/d;", "Leg/c;", "source", BuildConfig.FLAVOR, "byteCount", "Ltb/e0;", "O", "Leg/f;", "byteString", "k0", BuildConfig.FLAVOR, "string", "Q0", BuildConfig.FLAVOR, "beginIndex", "endIndex", "x", BuildConfig.FLAVOR, "r0", "offset", "o", "Ljava/nio/ByteBuffer;", "write", "Leg/a0;", "G0", "b", "i0", "s", "N", "i", "U", "v", "T0", "A", "t0", "L", "flush", BuildConfig.FLAVOR, "isOpen", "close", "Leg/b0;", "m", "toString", "c", "()Leg/c;", "getBuffer$annotations", "()V", "buffer", "Leg/y;", "sink", "<init>", "(Leg/y;)V", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class t implements d {

    /* renamed from: c */
    public final y f9643c;

    /* renamed from: d */
    public final c f9644d = new c();

    /* renamed from: q */
    public boolean f9645q;

    public t(y yVar) {
        hc.t.e(yVar, "sink");
        this.f9643c = yVar;
    }

    @Override // eg.d
    public d A(long j10) {
        if (!this.f9645q) {
            this.f9644d.A(j10);
            return t0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // eg.d
    public long G0(a0 a0Var) {
        hc.t.e(a0Var, "source");
        long j10 = 0;
        while (true) {
            long g12 = a0Var.g1(this.f9644d, 8192L);
            if (g12 == -1) {
                return j10;
            }
            j10 += g12;
            t0();
        }
    }

    @Override // eg.d
    public d L() {
        if (!this.f9645q) {
            long e12 = this.f9644d.e1();
            if (e12 > 0) {
                this.f9643c.O(this.f9644d, e12);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // eg.d
    public d N(int i10) {
        if (!this.f9645q) {
            this.f9644d.N(i10);
            return t0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // eg.y
    public void O(c cVar, long j10) {
        hc.t.e(cVar, "source");
        if (!this.f9645q) {
            this.f9644d.O(cVar, j10);
            t0();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // eg.d
    public d Q0(String str) {
        hc.t.e(str, "string");
        if (!this.f9645q) {
            this.f9644d.Q0(str);
            return t0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // eg.d
    public d T0(long j10) {
        if (!this.f9645q) {
            this.f9644d.T0(j10);
            return t0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // eg.d
    public d U(int i10) {
        if (!this.f9645q) {
            this.f9644d.U(i10);
            return t0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // eg.d
    public c c() {
        return this.f9644d;
    }

    @Override // eg.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f9645q) {
            return;
        }
        Throwable th2 = null;
        try {
            if (this.f9644d.e1() > 0) {
                y yVar = this.f9643c;
                c cVar = this.f9644d;
                yVar.O(cVar, cVar.e1());
            }
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            this.f9643c.close();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        this.f9645q = true;
        if (th2 != null) {
            throw th2;
        }
    }

    @Override // eg.d, eg.y, java.io.Flushable
    public void flush() {
        if (!this.f9645q) {
            if (this.f9644d.e1() > 0) {
                y yVar = this.f9643c;
                c cVar = this.f9644d;
                yVar.O(cVar, cVar.e1());
            }
            this.f9643c.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // eg.d
    public d i0(int i10) {
        if (!this.f9645q) {
            this.f9644d.i0(i10);
            return t0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f9645q;
    }

    @Override // eg.d
    public d k0(f fVar) {
        hc.t.e(fVar, "byteString");
        if (!this.f9645q) {
            this.f9644d.k0(fVar);
            return t0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // eg.y
    public b0 m() {
        return this.f9643c.m();
    }

    @Override // eg.d
    public d o(byte[] bArr, int i10, int i11) {
        hc.t.e(bArr, "source");
        if (!this.f9645q) {
            this.f9644d.o(bArr, i10, i11);
            return t0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // eg.d
    public d r0(byte[] bArr) {
        hc.t.e(bArr, "source");
        if (!this.f9645q) {
            this.f9644d.r0(bArr);
            return t0();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // eg.d
    public d t0() {
        if (!this.f9645q) {
            long h10 = this.f9644d.h();
            if (h10 > 0) {
                this.f9643c.O(this.f9644d, h10);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        return "buffer(" + this.f9643c + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        hc.t.e(byteBuffer, "source");
        if (!this.f9645q) {
            int write = this.f9644d.write(byteBuffer);
            t0();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // eg.d
    public d x(String str, int i10, int i11) {
        hc.t.e(str, "string");
        if (!this.f9645q) {
            this.f9644d.x(str, i10, i11);
            return t0();
        }
        throw new IllegalStateException("closed".toString());
    }
}
