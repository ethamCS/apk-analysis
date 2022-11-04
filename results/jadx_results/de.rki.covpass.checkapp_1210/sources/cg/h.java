package cg;

import e.j;
import eg.c;
import hc.t;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0006H\u0016¨\u0006\u001d"}, d2 = {"Lcg/h;", "Ljava/io/Closeable;", BuildConfig.FLAVOR, "opcode", "Leg/f;", "payload", "Ltb/e0;", "e", "h", "i", "code", "reason", "b", "formatOpcode", "data", "f", "close", BuildConfig.FLAVOR, "isClient", "Leg/d;", "sink", "Ljava/util/Random;", "random", "perMessageDeflate", "noContextTakeover", BuildConfig.FLAVOR, "minimumDeflateSize", "<init>", "(ZLeg/d;Ljava/util/Random;ZZJ)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class h implements Closeable {
    private final long U3;
    private final eg.c V3 = new eg.c();
    private final eg.c W3;
    private boolean X3;
    private a Y3;
    private final byte[] Z3;

    /* renamed from: a4 */
    private final c.a f6549a4;

    /* renamed from: c */
    private final boolean f6550c;

    /* renamed from: d */
    private final eg.d f6551d;

    /* renamed from: q */
    private final Random f6552q;

    /* renamed from: x */
    private final boolean f6553x;

    /* renamed from: y */
    private final boolean f6554y;

    public h(boolean z10, eg.d dVar, Random random, boolean z11, boolean z12, long j10) {
        t.e(dVar, "sink");
        t.e(random, "random");
        this.f6550c = z10;
        this.f6551d = dVar;
        this.f6552q = random;
        this.f6553x = z11;
        this.f6554y = z12;
        this.U3 = j10;
        this.W3 = dVar.c();
        c.a aVar = null;
        this.Z3 = z10 ? new byte[4] : null;
        this.f6549a4 = z10 ? new c.a() : aVar;
    }

    private final void e(int i10, eg.f fVar) {
        if (!this.X3) {
            int W = fVar.W();
            if (!(((long) W) <= 125)) {
                throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
            }
            this.W3.i0(i10 | 128);
            if (this.f6550c) {
                this.W3.i0(W | 128);
                Random random = this.f6552q;
                byte[] bArr = this.Z3;
                t.b(bArr);
                random.nextBytes(bArr);
                this.W3.r0(this.Z3);
                if (W > 0) {
                    long e12 = this.W3.e1();
                    this.W3.k0(fVar);
                    eg.c cVar = this.W3;
                    c.a aVar = this.f6549a4;
                    t.b(aVar);
                    cVar.j0(aVar);
                    this.f6549a4.h(e12);
                    f.f6538a.b(this.f6549a4, this.Z3);
                    this.f6549a4.close();
                }
            } else {
                this.W3.i0(W);
                this.W3.k0(fVar);
            }
            this.f6551d.flush();
            return;
        }
        throw new IOException("closed");
    }

    public final void b(int i10, eg.f fVar) {
        eg.f fVar2 = eg.f.f9610x;
        if (i10 != 0 || fVar != null) {
            if (i10 != 0) {
                f.f6538a.c(i10);
            }
            eg.c cVar = new eg.c();
            cVar.N(i10);
            if (fVar != null) {
                cVar.k0(fVar);
            }
            fVar2 = cVar.w0();
        }
        try {
            e(8, fVar2);
        } finally {
            this.X3 = true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a aVar = this.Y3;
        if (aVar == null) {
            return;
        }
        aVar.close();
    }

    public final void f(int i10, eg.f fVar) {
        t.e(fVar, "data");
        if (!this.X3) {
            this.V3.k0(fVar);
            int i11 = 128;
            int i12 = i10 | 128;
            if (this.f6553x && fVar.W() >= this.U3) {
                a aVar = this.Y3;
                if (aVar == null) {
                    aVar = new a(this.f6554y);
                    this.Y3 = aVar;
                }
                aVar.b(this.V3);
                i12 |= 64;
            }
            long e12 = this.V3.e1();
            this.W3.i0(i12);
            if (!this.f6550c) {
                i11 = 0;
            }
            if (e12 <= 125) {
                this.W3.i0(((int) e12) | i11);
            } else if (e12 <= 65535) {
                this.W3.i0(i11 | j.M0);
                this.W3.N((int) e12);
            } else {
                this.W3.i0(i11 | 127);
                this.W3.q1(e12);
            }
            if (this.f6550c) {
                Random random = this.f6552q;
                byte[] bArr = this.Z3;
                t.b(bArr);
                random.nextBytes(bArr);
                this.W3.r0(this.Z3);
                if (e12 > 0) {
                    eg.c cVar = this.V3;
                    c.a aVar2 = this.f6549a4;
                    t.b(aVar2);
                    cVar.j0(aVar2);
                    this.f6549a4.h(0L);
                    f.f6538a.b(this.f6549a4, this.Z3);
                    this.f6549a4.close();
                }
            }
            this.W3.O(this.V3, e12);
            this.f6551d.L();
            return;
        }
        throw new IOException("closed");
    }

    public final void h(eg.f fVar) {
        t.e(fVar, "payload");
        e(9, fVar);
    }

    public final void i(eg.f fVar) {
        t.e(fVar, "payload");
        e(10, fVar);
    }
}
