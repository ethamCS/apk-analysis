package e.m0.k;

import e.m0.k.d;
import f.t;
import f.u;
import java.io.Closeable;
import java.io.EOFException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class h implements Closeable {

    /* renamed from: f */
    static final Logger f4289f = Logger.getLogger(e.class.getName());

    /* renamed from: b */
    private final f.e f4290b;

    /* renamed from: c */
    private final a f4291c;

    /* renamed from: d */
    private final boolean f4292d;

    /* renamed from: e */
    final d.a f4293e;

    /* loaded from: classes.dex */
    public static final class a implements t {

        /* renamed from: b */
        private final f.e f4294b;

        /* renamed from: c */
        int f4295c;

        /* renamed from: d */
        byte f4296d;

        /* renamed from: e */
        int f4297e;

        /* renamed from: f */
        int f4298f;

        /* renamed from: g */
        short f4299g;

        a(f.e eVar) {
            this.f4294b = eVar;
        }

        private void a() {
            int i = this.f4297e;
            int h0 = h.h0(this.f4294b);
            this.f4298f = h0;
            this.f4295c = h0;
            byte d0 = (byte) (this.f4294b.d0() & 255);
            this.f4296d = (byte) (this.f4294b.d0() & 255);
            Logger logger = h.f4289f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.b(true, this.f4297e, this.f4295c, d0, this.f4296d));
            }
            int E = this.f4294b.E() & Integer.MAX_VALUE;
            this.f4297e = E;
            if (d0 != 9) {
                e.d("%s != TYPE_CONTINUATION", Byte.valueOf(d0));
                throw null;
            } else if (E == i) {
            } else {
                e.d("TYPE_CONTINUATION streamId changed", new Object[0]);
                throw null;
            }
        }

        @Override // f.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // f.t
        public u d() {
            return this.f4294b.d();
        }

        @Override // f.t
        public long q(f.c cVar, long j) {
            while (true) {
                int i = this.f4298f;
                if (i != 0) {
                    long q = this.f4294b.q(cVar, Math.min(j, i));
                    if (q == -1) {
                        return -1L;
                    }
                    this.f4298f = (int) (this.f4298f - q);
                    return q;
                }
                this.f4294b.w(this.f4299g);
                this.f4299g = (short) 0;
                if ((this.f4296d & 4) != 0) {
                    return -1L;
                }
                a();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z, int i, int i2, List<c> list);

        void b();

        void c(int i, long j);

        void d(boolean z, m mVar);

        void e(int i, int i2, List<c> list);

        void f(boolean z, int i, f.e eVar, int i2);

        void g(boolean z, int i, int i2);

        void h(int i, e.m0.k.b bVar, f.f fVar);

        void i(int i, int i2, int i3, boolean z);

        void j(int i, e.m0.k.b bVar);
    }

    public h(f.e eVar, boolean z) {
        this.f4290b = eVar;
        this.f4292d = z;
        a aVar = new a(eVar);
        this.f4291c = aVar;
        this.f4293e = new d.a(4096, aVar);
    }

    private void I(b bVar, int i, byte b2, int i2) {
        short s = 0;
        if (i2 == 0) {
            e.d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
            throw null;
        }
        boolean z = true;
        boolean z2 = (b2 & 1) != 0;
        if ((b2 & 32) == 0) {
            z = false;
        }
        if (z) {
            e.d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        if ((b2 & 8) != 0) {
            s = (short) (this.f4290b.d0() & 255);
        }
        bVar.f(z2, i2, this.f4290b, a(i, b2, s));
        this.f4290b.w(s);
    }

    private void N(b bVar, int i, byte b2, int i2) {
        if (i < 8) {
            e.d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 != 0) {
            e.d("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        } else {
            int E = this.f4290b.E();
            int E2 = this.f4290b.E();
            int i3 = i - 8;
            e.m0.k.b a2 = e.m0.k.b.a(E2);
            if (a2 == null) {
                e.d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(E2));
                throw null;
            }
            f.f fVar = f.f.f4440f;
            if (i3 > 0) {
                fVar = this.f4290b.s(i3);
            }
            bVar.h(E, a2, fVar);
        }
    }

    static int a(int i, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        e.d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    private List<c> f0(int i, short s, byte b2, int i2) {
        a aVar = this.f4291c;
        aVar.f4298f = i;
        aVar.f4295c = i;
        aVar.f4299g = s;
        aVar.f4296d = b2;
        aVar.f4297e = i2;
        this.f4293e.k();
        return this.f4293e.e();
    }

    private void g0(b bVar, int i, byte b2, int i2) {
        short s = 0;
        if (i2 == 0) {
            e.d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z = (b2 & 1) != 0;
        if ((b2 & 8) != 0) {
            s = (short) (this.f4290b.d0() & 255);
        }
        if ((b2 & 32) != 0) {
            j0(bVar, i2);
            i -= 5;
        }
        bVar.a(z, i2, -1, f0(a(i, b2, s), s, b2, i2));
    }

    static int h0(f.e eVar) {
        return (eVar.d0() & 255) | ((eVar.d0() & 255) << 16) | ((eVar.d0() & 255) << 8);
    }

    private void i0(b bVar, int i, byte b2, int i2) {
        boolean z = false;
        if (i != 8) {
            e.d("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 != 0) {
            e.d("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        } else {
            int E = this.f4290b.E();
            int E2 = this.f4290b.E();
            if ((b2 & 1) != 0) {
                z = true;
            }
            bVar.g(z, E, E2);
        }
    }

    private void j0(b bVar, int i) {
        int E = this.f4290b.E();
        bVar.i(i, E & Integer.MAX_VALUE, (this.f4290b.d0() & 255) + 1, (Integer.MIN_VALUE & E) != 0);
    }

    private void k0(b bVar, int i, byte b2, int i2) {
        if (i != 5) {
            e.d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            throw null;
        } else if (i2 != 0) {
            j0(bVar, i2);
        } else {
            e.d("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
    }

    private void l0(b bVar, int i, byte b2, int i2) {
        short s = 0;
        if (i2 == 0) {
            e.d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        if ((b2 & 8) != 0) {
            s = (short) (this.f4290b.d0() & 255);
        }
        bVar.e(i2, this.f4290b.E() & Integer.MAX_VALUE, f0(a(i - 4, b2, s), s, b2, i2));
    }

    private void m0(b bVar, int i, byte b2, int i2) {
        if (i != 4) {
            e.d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            e.d("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        } else {
            int E = this.f4290b.E();
            e.m0.k.b a2 = e.m0.k.b.a(E);
            if (a2 != null) {
                bVar.j(i2, a2);
            } else {
                e.d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(E));
                throw null;
            }
        }
    }

    private void n0(b bVar, int i, byte b2, int i2) {
        if (i2 != 0) {
            e.d("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        } else if ((b2 & 1) != 0) {
            if (i != 0) {
                e.d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
            bVar.b();
        } else if (i % 6 != 0) {
            e.d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        } else {
            m mVar = new m();
            for (int i3 = 0; i3 < i; i3 += 6) {
                int z = this.f4290b.z() & 65535;
                int E = this.f4290b.E();
                if (z != 2) {
                    if (z == 3) {
                        z = 4;
                    } else if (z == 4) {
                        z = 7;
                        if (E < 0) {
                            e.d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            throw null;
                        }
                    } else if (z == 5 && (E < 16384 || E > 16777215)) {
                        e.d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(E));
                        throw null;
                    }
                } else if (E != 0 && E != 1) {
                    e.d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    throw null;
                }
                mVar.i(z, E);
            }
            bVar.d(false, mVar);
        }
    }

    private void o0(b bVar, int i, byte b2, int i2) {
        if (i != 4) {
            e.d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
            throw null;
        }
        long E = this.f4290b.E() & 2147483647L;
        if (E != 0) {
            bVar.c(i2, E);
        } else {
            e.d("windowSizeIncrement was 0", Long.valueOf(E));
            throw null;
        }
    }

    public boolean c(boolean z, b bVar) {
        try {
            this.f4290b.M(9L);
            int h0 = h0(this.f4290b);
            if (h0 < 0 || h0 > 16384) {
                e.d("FRAME_SIZE_ERROR: %s", Integer.valueOf(h0));
                throw null;
            }
            byte d0 = (byte) (this.f4290b.d0() & 255);
            if (z && d0 != 4) {
                e.d("Expected a SETTINGS frame but was %s", Byte.valueOf(d0));
                throw null;
            }
            byte d02 = (byte) (this.f4290b.d0() & 255);
            int E = this.f4290b.E() & Integer.MAX_VALUE;
            Logger logger = f4289f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.b(true, E, h0, d0, d02));
            }
            switch (d0) {
                case 0:
                    I(bVar, h0, d02, E);
                    break;
                case 1:
                    g0(bVar, h0, d02, E);
                    break;
                case 2:
                    k0(bVar, h0, d02, E);
                    break;
                case 3:
                    m0(bVar, h0, d02, E);
                    break;
                case 4:
                    n0(bVar, h0, d02, E);
                    break;
                case 5:
                    l0(bVar, h0, d02, E);
                    break;
                case 6:
                    i0(bVar, h0, d02, E);
                    break;
                case 7:
                    N(bVar, h0, d02, E);
                    break;
                case 8:
                    o0(bVar, h0, d02, E);
                    break;
                default:
                    this.f4290b.w(h0);
                    break;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4290b.close();
    }

    public void k(b bVar) {
        if (this.f4292d) {
            if (c(true, bVar)) {
                return;
            }
            e.d("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        f.e eVar = this.f4290b;
        f.f fVar = e.f4226a;
        f.f s = eVar.s(fVar.r());
        Logger logger = f4289f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.m0.e.o("<< CONNECTION %s", s.l()));
        }
        if (fVar.equals(s)) {
            return;
        }
        e.d("Expected a connection header but was %s", s.w());
        throw null;
    }
}
