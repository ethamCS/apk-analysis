package eg;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J \u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016¨\u0006\u0019"}, d2 = {"Leg/k;", "Leg/a0;", "Ltb/e0;", "e", "f", "Leg/c;", "buffer", BuildConfig.FLAVOR, "offset", "byteCount", "h", BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "expected", "actual", "b", "sink", "g1", "Leg/b0;", "m", "close", "source", "<init>", "(Leg/a0;)V", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class k implements a0 {

    /* renamed from: c */
    private byte f9622c;

    /* renamed from: d */
    private final u f9623d;

    /* renamed from: q */
    private final Inflater f9624q;

    /* renamed from: x */
    private final l f9625x;

    /* renamed from: y */
    private final CRC32 f9626y = new CRC32();

    public k(a0 a0Var) {
        hc.t.e(a0Var, "source");
        u uVar = new u(a0Var);
        this.f9623d = uVar;
        Inflater inflater = new Inflater(true);
        this.f9624q = inflater;
        this.f9625x = new l((e) uVar, inflater);
    }

    private final void b(String str, int i10, int i11) {
        if (i11 == i10) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
        hc.t.d(format, "java.lang.String.format(this, *args)");
        throw new IOException(format);
    }

    private final void e() {
        this.f9623d.N0(10L);
        byte M = this.f9623d.f9647d.M(3L);
        boolean z10 = true;
        boolean z11 = ((M >> 1) & 1) == 1;
        if (z11) {
            h(this.f9623d.f9647d, 0L, 10L);
        }
        b("ID1ID2", 8075, this.f9623d.readShort());
        this.f9623d.skip(8L);
        if (((M >> 2) & 1) == 1) {
            this.f9623d.N0(2L);
            if (z11) {
                h(this.f9623d.f9647d, 0L, 2L);
            }
            long D0 = this.f9623d.f9647d.D0();
            this.f9623d.N0(D0);
            if (z11) {
                h(this.f9623d.f9647d, 0L, D0);
            }
            this.f9623d.skip(D0);
        }
        if (((M >> 3) & 1) == 1) {
            long b10 = this.f9623d.b((byte) 0);
            if (b10 == -1) {
                throw new EOFException();
            }
            if (z11) {
                h(this.f9623d.f9647d, 0L, b10 + 1);
            }
            this.f9623d.skip(b10 + 1);
        }
        if (((M >> 4) & 1) != 1) {
            z10 = false;
        }
        if (z10) {
            long b11 = this.f9623d.b((byte) 0);
            if (b11 == -1) {
                throw new EOFException();
            }
            if (z11) {
                h(this.f9623d.f9647d, 0L, b11 + 1);
            }
            this.f9623d.skip(b11 + 1);
        }
        if (z11) {
            b("FHCRC", this.f9623d.j(), (short) this.f9626y.getValue());
            this.f9626y.reset();
        }
    }

    private final void f() {
        b("CRC", this.f9623d.i(), (int) this.f9626y.getValue());
        b("ISIZE", this.f9623d.i(), (int) this.f9624q.getBytesWritten());
    }

    private final void h(c cVar, long j10, long j11) {
        int i10;
        v vVar = cVar.f9600c;
        while (true) {
            hc.t.b(vVar);
            int i11 = vVar.f9652c;
            int i12 = vVar.f9651b;
            if (j10 >= i11 - i12) {
                j10 -= i11 - i12;
                vVar = vVar.f9655f;
            }
        }
        while (j11 > 0) {
            int min = (int) Math.min(vVar.f9652c - i10, j11);
            this.f9626y.update(vVar.f9650a, (int) (vVar.f9651b + j10), min);
            j11 -= min;
            vVar = vVar.f9655f;
            hc.t.b(vVar);
            j10 = 0;
        }
    }

    @Override // eg.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9625x.close();
    }

    @Override // eg.a0
    public long g1(c cVar, long j10) {
        hc.t.e(cVar, "sink");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (i10 == 0) {
                return 0L;
            }
            if (this.f9622c == 0) {
                e();
                this.f9622c = (byte) 1;
            }
            if (this.f9622c == 1) {
                long e12 = cVar.e1();
                long g12 = this.f9625x.g1(cVar, j10);
                if (g12 != -1) {
                    h(cVar, e12, g12);
                    return g12;
                }
                this.f9622c = (byte) 2;
            }
            if (this.f9622c == 2) {
                f();
                this.f9622c = (byte) 3;
                if (!this.f9623d.g0()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(hc.t.l("byteCount < 0: ", Long.valueOf(j10)).toString());
    }

    @Override // eg.a0
    public b0 m() {
        return this.f9623d.m();
    }
}
