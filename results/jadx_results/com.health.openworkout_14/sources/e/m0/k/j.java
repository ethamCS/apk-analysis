package e.m0.k;

import e.m0.k.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
final class j implements Closeable {

    /* renamed from: h */
    private static final Logger f4320h = Logger.getLogger(e.class.getName());

    /* renamed from: b */
    private final f.d f4321b;

    /* renamed from: c */
    private final boolean f4322c;

    /* renamed from: d */
    private final f.c f4323d;

    /* renamed from: e */
    private int f4324e = 16384;

    /* renamed from: f */
    private boolean f4325f;

    /* renamed from: g */
    final d.b f4326g;

    public j(f.d dVar, boolean z) {
        this.f4321b = dVar;
        this.f4322c = z;
        f.c cVar = new f.c();
        this.f4323d = cVar;
        this.f4326g = new d.b(cVar);
    }

    private void n0(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min(this.f4324e, j);
            long j2 = min;
            j -= j2;
            N(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f4321b.i(this.f4323d, j2);
        }
    }

    private static void o0(f.d dVar, int i) {
        dVar.U((i >>> 16) & 255);
        dVar.U((i >>> 8) & 255);
        dVar.U(i & 255);
    }

    void I(int i, byte b2, f.c cVar, int i2) {
        N(i, i2, (byte) 0, b2);
        if (i2 > 0) {
            this.f4321b.i(cVar, i2);
        }
    }

    public void N(int i, int i2, byte b2, byte b3) {
        Logger logger = f4320h;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.b(false, i, i2, b2, b3));
        }
        int i3 = this.f4324e;
        if (i2 > i3) {
            e.c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        } else if ((Integer.MIN_VALUE & i) != 0) {
            e.c("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        } else {
            o0(this.f4321b, i2);
            this.f4321b.U(b2 & 255);
            this.f4321b.U(b3 & 255);
            this.f4321b.F(i & Integer.MAX_VALUE);
        }
    }

    public synchronized void a(m mVar) {
        if (this.f4325f) {
            throw new IOException("closed");
        }
        this.f4324e = mVar.f(this.f4324e);
        if (mVar.c() != -1) {
            this.f4326g.e(mVar.c());
        }
        N(0, 0, (byte) 4, (byte) 1);
        this.f4321b.flush();
    }

    public synchronized void c() {
        if (!this.f4325f) {
            if (!this.f4322c) {
                return;
            }
            Logger logger = f4320h;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.m0.e.o(">> CONNECTION %s", e.f4226a.l()));
            }
            this.f4321b.e(e.f4226a.v());
            this.f4321b.flush();
            return;
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f4325f = true;
        this.f4321b.close();
    }

    public synchronized void f0(int i, b bVar, byte[] bArr) {
        if (this.f4325f) {
            throw new IOException("closed");
        }
        if (bVar.f4199b == -1) {
            e.c("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
        N(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f4321b.F(i);
        this.f4321b.F(bVar.f4199b);
        if (bArr.length > 0) {
            this.f4321b.e(bArr);
        }
        this.f4321b.flush();
    }

    public synchronized void flush() {
        if (this.f4325f) {
            throw new IOException("closed");
        }
        this.f4321b.flush();
    }

    public synchronized void g0(boolean z, int i, List<c> list) {
        if (this.f4325f) {
            throw new IOException("closed");
        }
        this.f4326g.g(list);
        long v0 = this.f4323d.v0();
        int min = (int) Math.min(this.f4324e, v0);
        long j = min;
        int i2 = (v0 > j ? 1 : (v0 == j ? 0 : -1));
        byte b2 = i2 == 0 ? (byte) 4 : (byte) 0;
        if (z) {
            b2 = (byte) (b2 | 1);
        }
        N(i, min, (byte) 1, b2);
        this.f4321b.i(this.f4323d, j);
        if (i2 > 0) {
            n0(i, v0 - j);
        }
    }

    public int h0() {
        return this.f4324e;
    }

    public synchronized void i0(boolean z, int i, int i2) {
        if (this.f4325f) {
            throw new IOException("closed");
        }
        N(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.f4321b.F(i);
        this.f4321b.F(i2);
        this.f4321b.flush();
    }

    public synchronized void j0(int i, int i2, List<c> list) {
        if (this.f4325f) {
            throw new IOException("closed");
        }
        this.f4326g.g(list);
        long v0 = this.f4323d.v0();
        int min = (int) Math.min(this.f4324e - 4, v0);
        long j = min;
        int i3 = (v0 > j ? 1 : (v0 == j ? 0 : -1));
        N(i, min + 4, (byte) 5, i3 == 0 ? (byte) 4 : (byte) 0);
        this.f4321b.F(i2 & Integer.MAX_VALUE);
        this.f4321b.i(this.f4323d, j);
        if (i3 > 0) {
            n0(i, v0 - j);
        }
    }

    public synchronized void k(boolean z, int i, f.c cVar, int i2) {
        if (this.f4325f) {
            throw new IOException("closed");
        }
        byte b2 = 0;
        if (z) {
            b2 = (byte) 1;
        }
        I(i, b2, cVar, i2);
    }

    public synchronized void k0(int i, b bVar) {
        if (this.f4325f) {
            throw new IOException("closed");
        }
        if (bVar.f4199b == -1) {
            throw new IllegalArgumentException();
        }
        N(i, 4, (byte) 3, (byte) 0);
        this.f4321b.F(bVar.f4199b);
        this.f4321b.flush();
    }

    public synchronized void l0(m mVar) {
        if (this.f4325f) {
            throw new IOException("closed");
        }
        int i = 0;
        N(0, mVar.j() * 6, (byte) 4, (byte) 0);
        while (i < 10) {
            if (mVar.g(i)) {
                this.f4321b.A(i == 4 ? 3 : i == 7 ? 4 : i);
                this.f4321b.F(mVar.b(i));
            }
            i++;
        }
        this.f4321b.flush();
    }

    public synchronized void m0(int i, long j) {
        if (this.f4325f) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            e.c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
        N(i, 4, (byte) 8, (byte) 0);
        this.f4321b.F((int) j);
        this.f4321b.flush();
    }
}
