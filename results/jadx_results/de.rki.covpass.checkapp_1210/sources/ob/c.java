package ob;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b+\b'\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u001f\b\u0000\u0012\u0006\u0010]\u001a\u00020\n\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0004\b^\u0010_B\u0017\b\u0016\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0004\b^\u0010`B\t\b\u0016¢\u0006\u0004\b^\u0010$J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J&\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0002J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J*\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH$ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0004H$J\u0006\u0010 \u001a\u00020\u0004J\u0011\u0010!\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0006H\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b(\u0010'J\u000e\u0010)\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010*\u001a\u00020\u0004J\u0010\u0010+\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0012\u0010.\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010,H\u0016J\"\u00101\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\nH\u0016J\u000e\u00103\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u000202J\u0017\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0006H\u0000¢\u0006\u0004\b5\u0010'J\u0016\u00107\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u0002022\u0006\u0010\f\u001a\u000206J\u0006\u00108\u001a\u00020\u0004J\u0010\u00109\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nH\u0007J\b\u0010:\u001a\u00020\u0004H\u0007R(\u0010>\u001a\u0004\u0018\u00010\u00062\b\u0010;\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b<\u0010\"\"\u0004\b=\u0010'R(\u0010A\u001a\u0004\u0018\u00010\u00062\b\u0010;\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b?\u0010\"\"\u0004\b@\u0010'R$\u0010F\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8@@BX\u0080\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010I\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER$\u0010L\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bJ\u0010C\"\u0004\bK\u0010ER \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010\b\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\"R*\u0010U\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\u00198@@@X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010X\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bV\u0010C\"\u0004\bW\u0010ER$\u0010\\\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\n8D@EX\u0084\u000e¢\u0006\f\u001a\u0004\bZ\u0010C\"\u0004\b[\u0010E\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006a"}, d2 = {"Lob/c;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "Lob/h0;", "Ltb/e0;", "B", "Lpb/a;", "r", "head", "newTail", BuildConfig.FLAVOR, "chainedSizeDelta", "n", BuildConfig.FLAVOR, "v", "f1", BuildConfig.FLAVOR, "c", "p", "tail", "foreignStolen", "Lrb/f;", "pool", "k1", "l1", "Llb/c;", "source", "offset", "length", "z", "(Ljava/nio/ByteBuffer;II)V", "u", "flush", "e1", "()Lpb/a;", "b", "()V", "buffer", "s", "(Lpb/a;)V", "j", "q0", "close", "f", BuildConfig.FLAVOR, "csq", "h", "start", "end", "i", "Lob/u;", "i1", "chunkBuffer", "h1", BuildConfig.FLAVOR, "j1", "z0", "w0", "e", "value", "j0", "V0", "_head", "u0", "c1", "_tail", "W", "()I", "K0", "(I)V", "tailEndExclusive", "e0", "M0", "tailInitialPosition", "G", "D0", "chainedSize", "Lrb/f;", "V", "()Lrb/f;", "M", "f0", "()Ljava/nio/ByteBuffer;", "O0", "(Ljava/nio/ByteBuffer;)V", "tailMemory", "h0", "R0", "tailPosition", "<anonymous parameter 0>", "s0", "set_size", "_size", "headerSizeHint", "<init>", "(ILrb/f;)V", "(Lrb/f;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class c implements Appendable, h0 {

    /* renamed from: c */
    private final int f17747c;

    /* renamed from: d */
    private final rb.f<pb.a> f17748d;

    /* renamed from: q */
    private final d f17749q;

    /* renamed from: x */
    private p f17750x;

    public c() {
        this(pb.a.Companion.c());
    }

    public c(int i10, rb.f<pb.a> fVar) {
        hc.t.e(fVar, "pool");
        this.f17747c = i10;
        this.f17748d = fVar;
        this.f17749q = new d();
        this.f17750x = p.BIG_ENDIAN;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(rb.f<pb.a> fVar) {
        this(0, fVar);
        hc.t.e(fVar, "pool");
    }

    private final void B() {
        pb.a e12 = e1();
        if (e12 == null) {
            return;
        }
        pb.a aVar = e12;
        do {
            try {
                z(aVar.n(), aVar.p(), aVar.s() - aVar.p());
                aVar = aVar.M0();
            } finally {
                o.c(e12, this.f17748d);
            }
        } while (aVar != null);
    }

    private final void D0(int i10) {
        this.f17749q.h(i10);
    }

    private final int G() {
        return this.f17749q.a();
    }

    private final void K0(int i10) {
        this.f17749q.k(i10);
    }

    private final void M0(int i10) {
        this.f17749q.l(i10);
    }

    private final void V0(pb.a aVar) {
        this.f17749q.i(aVar);
    }

    private final void c1(pb.a aVar) {
        this.f17749q.j(aVar);
    }

    private final int e0() {
        return this.f17749q.e();
    }

    private final void f1(byte b10) {
        r().q0(b10);
        R0(h0() + 1);
    }

    private final pb.a j0() {
        return this.f17749q.b();
    }

    private final void k1(pb.a aVar, pb.a aVar2, rb.f<pb.a> fVar) {
        aVar.e(h0());
        int s10 = aVar.s() - aVar.p();
        int s11 = aVar2.s() - aVar2.p();
        int b10 = k0.b();
        if (s11 >= b10 || s11 > (aVar.i() - aVar.j()) + (aVar.j() - aVar.s())) {
            s11 = -1;
        }
        if (s10 >= b10 || s10 > aVar2.r() || !pb.b.a(aVar2)) {
            s10 = -1;
        }
        if (s11 == -1 && s10 == -1) {
            j(aVar2);
        } else if (s10 == -1 || s11 <= s10) {
            f.a(aVar, aVar2, (aVar.j() - aVar.s()) + (aVar.i() - aVar.j()));
            e();
            pb.a K0 = aVar2.K0();
            if (K0 != null) {
                j(K0);
            }
            aVar2.c1(fVar);
        } else if (s11 == -1 || s10 < s11) {
            l1(aVar2, aVar);
        } else {
            throw new IllegalStateException("prep = " + s10 + ", app = " + s11);
        }
    }

    private final void l1(pb.a aVar, pb.a aVar2) {
        f.c(aVar, aVar2);
        pb.a j02 = j0();
        if (j02 != null) {
            if (j02 == aVar2) {
                V0(aVar);
            } else {
                while (true) {
                    pb.a M0 = j02.M0();
                    hc.t.b(M0);
                    if (M0 == aVar2) {
                        break;
                    }
                    j02 = M0;
                }
                j02.f1(aVar);
            }
            aVar2.c1(this.f17748d);
            c1(o.a(aVar));
            return;
        }
        throw new IllegalStateException("head should't be null since it is already handled in the fast-path".toString());
    }

    private final void n(pb.a aVar, pb.a aVar2, int i10) {
        pb.a u02 = u0();
        if (u02 == null) {
            V0(aVar);
            D0(0);
        } else {
            u02.f1(aVar);
            int h02 = h0();
            u02.e(h02);
            D0(G() + (h02 - e0()));
        }
        c1(aVar2);
        D0(G() + i10);
        O0(aVar2.n());
        R0(aVar2.s());
        M0(aVar2.p());
        K0(aVar2.j());
    }

    private final void p(char c10) {
        int i10 = 3;
        pb.a w02 = w0(3);
        try {
            ByteBuffer n10 = w02.n();
            int s10 = w02.s();
            boolean z10 = true;
            if (c10 >= 0 && c10 < 128) {
                n10.put(s10, (byte) c10);
                i10 = 1;
            } else {
                if (128 <= c10 && c10 < 2048) {
                    n10.put(s10, (byte) (((c10 >> 6) & 31) | 192));
                    n10.put(s10 + 1, (byte) ((c10 & '?') | 128));
                    i10 = 2;
                } else {
                    if (2048 <= c10 && c10 < 0) {
                        n10.put(s10, (byte) (((c10 >> '\f') & 15) | 224));
                        n10.put(s10 + 1, (byte) (((c10 >> 6) & 63) | 128));
                        n10.put(s10 + 2, (byte) ((c10 & '?') | 128));
                    } else {
                        if (!(0 <= c10 && c10 < 0)) {
                            pb.g.j(c10);
                            throw new tb.i();
                        }
                        n10.put(s10, (byte) (((c10 >> 18) & 7) | 240));
                        n10.put(s10 + 1, (byte) (((c10 >> '\f') & 63) | 128));
                        n10.put(s10 + 2, (byte) (((c10 >> 6) & 63) | 128));
                        n10.put(s10 + 3, (byte) ((c10 & '?') | 128));
                        i10 = 4;
                    }
                }
            }
            w02.b(i10);
            if (i10 < 0) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("The returned value shouldn't be negative".toString());
            }
        } finally {
            e();
        }
    }

    private final pb.a r() {
        pb.a c02 = this.f17748d.c0();
        c02.G(8);
        s(c02);
        return c02;
    }

    private final pb.a u0() {
        return this.f17749q.c();
    }

    public final pb.a M() {
        pb.a j02 = j0();
        return j02 == null ? pb.a.Companion.a() : j02;
    }

    public final void O0(ByteBuffer byteBuffer) {
        hc.t.e(byteBuffer, "value");
        this.f17749q.m(byteBuffer);
    }

    public final void R0(int i10) {
        this.f17749q.n(i10);
    }

    public final rb.f<pb.a> V() {
        return this.f17748d;
    }

    public final int W() {
        return this.f17749q.d();
    }

    public final void b() {
        pb.a M = M();
        if (M != pb.a.Companion.a()) {
            if (!(M.M0() == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            M.W();
            M.M(this.f17747c);
            M.G(8);
            R0(M.s());
            M0(h0());
            K0(M.j());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
        } finally {
            u();
        }
    }

    public final void e() {
        pb.a u02 = u0();
        if (u02 == null) {
            return;
        }
        R0(u02.s());
    }

    public final pb.a e1() {
        pb.a j02 = j0();
        if (j02 == null) {
            return null;
        }
        pb.a u02 = u0();
        if (u02 != null) {
            u02.e(h0());
        }
        V0(null);
        c1(null);
        R0(0);
        K0(0);
        M0(0);
        D0(0);
        O0(lb.c.Companion.a());
        return j02;
    }

    /* renamed from: f */
    public c append(char c10) {
        int h02 = h0();
        int i10 = 3;
        if (W() - h02 < 3) {
            p(c10);
            return this;
        }
        ByteBuffer f02 = f0();
        boolean z10 = true;
        if (c10 >= 0 && c10 < 128) {
            f02.put(h02, (byte) c10);
            i10 = 1;
        } else {
            if (128 <= c10 && c10 < 2048) {
                f02.put(h02, (byte) (((c10 >> 6) & 31) | 192));
                f02.put(h02 + 1, (byte) ((c10 & '?') | 128));
                i10 = 2;
            } else {
                if (2048 <= c10 && c10 < 0) {
                    f02.put(h02, (byte) (((c10 >> '\f') & 15) | 224));
                    f02.put(h02 + 1, (byte) (((c10 >> 6) & 63) | 128));
                    f02.put(h02 + 2, (byte) ((c10 & '?') | 128));
                } else {
                    if (0 > c10 || c10 >= 0) {
                        z10 = false;
                    }
                    if (!z10) {
                        pb.g.j(c10);
                        throw new tb.i();
                    }
                    f02.put(h02, (byte) (((c10 >> 18) & 7) | 240));
                    f02.put(h02 + 1, (byte) (((c10 >> '\f') & 63) | 128));
                    f02.put(h02 + 2, (byte) (((c10 >> 6) & 63) | 128));
                    f02.put(h02 + 3, (byte) ((c10 & '?') | 128));
                    i10 = 4;
                }
            }
        }
        R0(h02 + i10);
        return this;
    }

    public final ByteBuffer f0() {
        return this.f17749q.f();
    }

    public final void flush() {
        B();
    }

    /* renamed from: h */
    public c append(CharSequence charSequence) {
        if (charSequence == null) {
            append("null", 0, 4);
        } else {
            append(charSequence, 0, charSequence.length());
        }
        return this;
    }

    public final int h0() {
        return this.f17749q.g();
    }

    public final void h1(pb.a aVar) {
        hc.t.e(aVar, "chunkBuffer");
        pb.a u02 = u0();
        if (u02 == null) {
            j(aVar);
        } else {
            k1(u02, aVar, this.f17748d);
        }
    }

    /* renamed from: i */
    public c append(CharSequence charSequence, int i10, int i11) {
        if (charSequence == null) {
            return append("null", i10, i11);
        }
        l0.h(this, charSequence, i10, i11, bf.d.f5986b);
        return this;
    }

    public final void i1(u uVar) {
        hc.t.e(uVar, "p");
        pb.a u12 = uVar.u1();
        if (u12 == null) {
            uVar.n1();
            return;
        }
        pb.a u02 = u0();
        if (u02 == null) {
            j(u12);
        } else {
            k1(u02, u12, uVar.z0());
        }
    }

    public final void j(pb.a aVar) {
        hc.t.e(aVar, "head");
        pb.a a10 = o.a(aVar);
        long e10 = o.e(aVar) - (a10.s() - a10.p());
        if (e10 < 2147483647L) {
            n(aVar, a10, (int) e10);
        } else {
            pb.e.a(e10, "total size increase");
            throw new tb.i();
        }
    }

    public final void j1(u uVar, long j10) {
        hc.t.e(uVar, "p");
        while (j10 > 0) {
            long s02 = uVar.s0() - uVar.w0();
            if (s02 > j10) {
                pb.a f12 = uVar.f1(1);
                if (f12 == null) {
                    l0.a(1);
                    throw new tb.i();
                }
                int p10 = f12.p();
                try {
                    i0.a(this, f12, (int) j10);
                    int p11 = f12.p();
                    if (p11 < p10) {
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                    if (p11 == f12.s()) {
                        uVar.B(f12);
                        return;
                    } else {
                        uVar.q1(p11);
                        return;
                    }
                } catch (Throwable th2) {
                    int p12 = f12.p();
                    if (p12 < p10) {
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                    if (p12 == f12.s()) {
                        uVar.B(f12);
                    } else {
                        uVar.q1(p12);
                    }
                    throw th2;
                }
            }
            j10 -= s02;
            pb.a t12 = uVar.t1();
            if (t12 == null) {
                throw new EOFException("Unexpected end of packet");
            }
            s(t12);
        }
    }

    @Override // ob.h0
    public final void q0(byte b10) {
        int h02 = h0();
        if (h02 >= W()) {
            f1(b10);
            return;
        }
        R0(h02 + 1);
        f0().put(h02, b10);
    }

    public final void s(pb.a aVar) {
        hc.t.e(aVar, "buffer");
        if (aVar.M0() == null) {
            n(aVar, aVar, 0);
            return;
        }
        throw new IllegalStateException("It should be a single buffer chunk.".toString());
    }

    public final int s0() {
        return G() + (h0() - e0());
    }

    protected abstract void u();

    public final pb.a w0(int i10) {
        pb.a u02;
        if (W() - h0() < i10 || (u02 = u0()) == null) {
            return r();
        }
        u02.e(h0());
        return u02;
    }

    protected abstract void z(ByteBuffer byteBuffer, int i10, int i11);

    public final void z0() {
        close();
    }
}
