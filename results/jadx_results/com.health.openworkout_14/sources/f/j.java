package f;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
/* loaded from: classes.dex */
public final class j implements t {

    /* renamed from: c */
    private final e f4448c;

    /* renamed from: d */
    private final Inflater f4449d;

    /* renamed from: e */
    private final k f4450e;

    /* renamed from: b */
    private int f4447b = 0;

    /* renamed from: f */
    private final CRC32 f4451f = new CRC32();

    public j(t tVar) {
        if (tVar != null) {
            Inflater inflater = new Inflater(true);
            this.f4449d = inflater;
            e b2 = l.b(tVar);
            this.f4448c = b2;
            this.f4450e = new k(b2, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void I(c cVar, long j, long j2) {
        int i;
        p pVar = cVar.f4435b;
        while (true) {
            int i2 = pVar.f4472c;
            int i3 = pVar.f4471b;
            if (j >= i2 - i3) {
                j -= i2 - i3;
                pVar = pVar.f4475f;
            }
        }
        while (j2 > 0) {
            int min = (int) Math.min(pVar.f4472c - i, j2);
            this.f4451f.update(pVar.f4470a, (int) (pVar.f4471b + j), min);
            j2 -= min;
            pVar = pVar.f4475f;
            j = 0;
        }
    }

    private void a(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
    }

    private void c() {
        this.f4448c.M(10L);
        byte k0 = this.f4448c.b().k0(3L);
        boolean z = ((k0 >> 1) & 1) == 1;
        if (z) {
            I(this.f4448c.b(), 0L, 10L);
        }
        a("ID1ID2", 8075, this.f4448c.z());
        this.f4448c.w(8L);
        if (((k0 >> 2) & 1) == 1) {
            this.f4448c.M(2L);
            if (z) {
                I(this.f4448c.b(), 0L, 2L);
            }
            long m = this.f4448c.b().m();
            this.f4448c.M(m);
            if (z) {
                I(this.f4448c.b(), 0L, m);
            }
            this.f4448c.w(m);
        }
        if (((k0 >> 3) & 1) == 1) {
            long W = this.f4448c.W((byte) 0);
            if (W == -1) {
                throw new EOFException();
            }
            if (z) {
                I(this.f4448c.b(), 0L, W + 1);
            }
            this.f4448c.w(W + 1);
        }
        if (((k0 >> 4) & 1) == 1) {
            long W2 = this.f4448c.W((byte) 0);
            if (W2 == -1) {
                throw new EOFException();
            }
            if (z) {
                I(this.f4448c.b(), 0L, W2 + 1);
            }
            this.f4448c.w(W2 + 1);
        }
        if (z) {
            a("FHCRC", this.f4448c.m(), (short) this.f4451f.getValue());
            this.f4451f.reset();
        }
    }

    private void k() {
        a("CRC", this.f4448c.P(), (int) this.f4451f.getValue());
        a("ISIZE", this.f4448c.P(), (int) this.f4449d.getBytesWritten());
    }

    @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4450e.close();
    }

    @Override // f.t
    public u d() {
        return this.f4448c.d();
    }

    @Override // f.t
    public long q(c cVar, long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (i == 0) {
            return 0L;
        } else {
            if (this.f4447b == 0) {
                c();
                this.f4447b = 1;
            }
            if (this.f4447b == 1) {
                long j2 = cVar.f4436c;
                long q = this.f4450e.q(cVar, j);
                if (q != -1) {
                    I(cVar, j2, q);
                    return q;
                }
                this.f4447b = 2;
            }
            if (this.f4447b == 2) {
                k();
                this.f4447b = 3;
                if (!this.f4448c.S()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
    }
}
