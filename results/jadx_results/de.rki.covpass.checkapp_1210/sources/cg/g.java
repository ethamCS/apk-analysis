package cg;

import eg.c;
import hc.t;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B/\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u0015"}, d2 = {"Lcg/g;", "Ljava/io/Closeable;", "Ltb/e0;", "f", "e", "i", "j", "h", "b", "close", BuildConfig.FLAVOR, "isClient", "Leg/e;", "source", "Lcg/g$a;", "frameCallback", "perMessageDeflate", "noContextTakeover", "<init>", "(ZLeg/e;Lcg/g$a;ZZ)V", "a", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class g implements Closeable {
    private boolean U3;
    private int V3;
    private long W3;
    private boolean X3;
    private boolean Y3;
    private boolean Z3;

    /* renamed from: a4 */
    private final eg.c f6539a4 = new eg.c();

    /* renamed from: b4 */
    private final eg.c f6540b4 = new eg.c();

    /* renamed from: c */
    private final boolean f6541c;

    /* renamed from: c4 */
    private c f6542c4;

    /* renamed from: d */
    private final eg.e f6543d;

    /* renamed from: d4 */
    private final byte[] f6544d4;

    /* renamed from: e4 */
    private final c.a f6545e4;

    /* renamed from: q */
    private final a f6546q;

    /* renamed from: x */
    private final boolean f6547x;

    /* renamed from: y */
    private final boolean f6548y;

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H&¨\u0006\u0010"}, d2 = {"Lcg/g$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "text", "Ltb/e0;", "f", "Leg/f;", "bytes", "e", "payload", "g", "d", BuildConfig.FLAVOR, "code", "reason", "h", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public interface a {
        void d(eg.f fVar);

        void e(eg.f fVar);

        void f(String str);

        void g(eg.f fVar);

        void h(int i10, String str);
    }

    public g(boolean z10, eg.e eVar, a aVar, boolean z11, boolean z12) {
        t.e(eVar, "source");
        t.e(aVar, "frameCallback");
        this.f6541c = z10;
        this.f6543d = eVar;
        this.f6546q = aVar;
        this.f6547x = z11;
        this.f6548y = z12;
        c.a aVar2 = null;
        this.f6544d4 = z10 ? null : new byte[4];
        this.f6545e4 = !z10 ? new c.a() : aVar2;
    }

    private final void e() {
        String str;
        long j10 = this.W3;
        if (j10 > 0) {
            this.f6543d.Z0(this.f6539a4, j10);
            if (!this.f6541c) {
                eg.c cVar = this.f6539a4;
                c.a aVar = this.f6545e4;
                t.b(aVar);
                cVar.j0(aVar);
                this.f6545e4.h(0L);
                f fVar = f.f6538a;
                c.a aVar2 = this.f6545e4;
                byte[] bArr = this.f6544d4;
                t.b(bArr);
                fVar.b(aVar2, bArr);
                this.f6545e4.close();
            }
        }
        switch (this.V3) {
            case 8:
                short s10 = 1005;
                long e12 = this.f6539a4.e1();
                if (e12 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (e12 != 0) {
                    s10 = this.f6539a4.readShort();
                    str = this.f6539a4.O0();
                    String a10 = f.f6538a.a(s10);
                    if (a10 != null) {
                        throw new ProtocolException(a10);
                    }
                } else {
                    str = BuildConfig.FLAVOR;
                }
                this.f6546q.h(s10, str);
                this.U3 = true;
                return;
            case 9:
                this.f6546q.g(this.f6539a4.w0());
                return;
            case 10:
                this.f6546q.d(this.f6539a4.w0());
                return;
            default:
                throw new ProtocolException(t.l("Unknown control opcode: ", pf.d.Q(this.V3)));
        }
    }

    private final void f() {
        boolean z10;
        if (!this.U3) {
            long h10 = this.f6543d.m().h();
            this.f6543d.m().b();
            try {
                int d10 = pf.d.d(this.f6543d.readByte(), 255);
                this.f6543d.m().g(h10, TimeUnit.NANOSECONDS);
                int i10 = d10 & 15;
                this.V3 = i10;
                boolean z11 = false;
                boolean z12 = (d10 & 128) != 0;
                this.X3 = z12;
                boolean z13 = (d10 & 8) != 0;
                this.Y3 = z13;
                if (z13 && !z12) {
                    throw new ProtocolException("Control frames must be final.");
                }
                boolean z14 = (d10 & 64) != 0;
                if (i10 == 1 || i10 == 2) {
                    if (!z14) {
                        z10 = false;
                    } else if (!this.f6547x) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    } else {
                        z10 = true;
                    }
                    this.Z3 = z10;
                } else if (z14) {
                    throw new ProtocolException("Unexpected rsv1 flag");
                }
                if ((d10 & 32) != 0) {
                    throw new ProtocolException("Unexpected rsv2 flag");
                }
                if ((d10 & 16) != 0) {
                    throw new ProtocolException("Unexpected rsv3 flag");
                }
                int d11 = pf.d.d(this.f6543d.readByte(), 255);
                if ((d11 & 128) != 0) {
                    z11 = true;
                }
                if (z11 == this.f6541c) {
                    throw new ProtocolException(this.f6541c ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                }
                long j10 = d11 & 127;
                this.W3 = j10;
                if (j10 == 126) {
                    this.W3 = pf.d.e(this.f6543d.readShort(), 65535);
                } else if (j10 == 127) {
                    long readLong = this.f6543d.readLong();
                    this.W3 = readLong;
                    if (readLong < 0) {
                        throw new ProtocolException("Frame length 0x" + pf.d.R(this.W3) + " > 0x7FFFFFFFFFFFFFFF");
                    }
                }
                if (this.Y3 && this.W3 > 125) {
                    throw new ProtocolException("Control frame must be less than 125B.");
                }
                if (!z11) {
                    return;
                }
                eg.e eVar = this.f6543d;
                byte[] bArr = this.f6544d4;
                t.b(bArr);
                eVar.readFully(bArr);
                return;
            } catch (Throwable th2) {
                this.f6543d.m().g(h10, TimeUnit.NANOSECONDS);
                throw th2;
            }
        }
        throw new IOException("closed");
    }

    private final void h() {
        while (!this.U3) {
            long j10 = this.W3;
            if (j10 > 0) {
                this.f6543d.Z0(this.f6540b4, j10);
                if (!this.f6541c) {
                    eg.c cVar = this.f6540b4;
                    c.a aVar = this.f6545e4;
                    t.b(aVar);
                    cVar.j0(aVar);
                    this.f6545e4.h(this.f6540b4.e1() - this.W3);
                    f fVar = f.f6538a;
                    c.a aVar2 = this.f6545e4;
                    byte[] bArr = this.f6544d4;
                    t.b(bArr);
                    fVar.b(aVar2, bArr);
                    this.f6545e4.close();
                }
            }
            if (this.X3) {
                return;
            }
            j();
            if (this.V3 != 0) {
                throw new ProtocolException(t.l("Expected continuation opcode. Got: ", pf.d.Q(this.V3)));
            }
        }
        throw new IOException("closed");
    }

    private final void i() {
        int i10 = this.V3;
        if (i10 == 1 || i10 == 2) {
            h();
            if (this.Z3) {
                c cVar = this.f6542c4;
                if (cVar == null) {
                    cVar = new c(this.f6548y);
                    this.f6542c4 = cVar;
                }
                cVar.b(this.f6540b4);
            }
            if (i10 == 1) {
                this.f6546q.f(this.f6540b4.O0());
                return;
            } else {
                this.f6546q.e(this.f6540b4.w0());
                return;
            }
        }
        throw new ProtocolException(t.l("Unknown opcode: ", pf.d.Q(i10)));
    }

    private final void j() {
        while (!this.U3) {
            f();
            if (!this.Y3) {
                return;
            }
            e();
        }
    }

    public final void b() {
        f();
        if (this.Y3) {
            e();
        } else {
            i();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c cVar = this.f6542c4;
        if (cVar == null) {
            return;
        }
        cVar.close();
    }
}
