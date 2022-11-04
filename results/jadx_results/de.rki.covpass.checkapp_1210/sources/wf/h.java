package wf;

import eg.a0;
import eg.b0;
import hc.t;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import wf.d;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003!\"#B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u001b\u001a\u00020\bH\u0016¨\u0006$"}, d2 = {"Lwf/h;", "Ljava/io/Closeable;", "Lwf/h$c;", "handler", BuildConfig.FLAVOR, "length", "flags", "streamId", "Ltb/e0;", "n", "padding", BuildConfig.FLAVOR, "Lwf/c;", "j", "h", "s", "r", "z", "B", "u", "p", "i", "G", "f", BuildConfig.FLAVOR, "requireSettings", "e", "close", "Leg/e;", "source", "client", "<init>", "(Leg/e;Z)V", "a", "b", "c", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class h implements Closeable {
    public static final a Companion = new a(null);

    /* renamed from: y */
    private static final Logger f25027y;

    /* renamed from: c */
    private final eg.e f25028c;

    /* renamed from: d */
    private final boolean f25029d;

    /* renamed from: q */
    private final b f25030q;

    /* renamed from: x */
    private final d.a f25031x;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lwf/h$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "length", "flags", "padding", "b", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return h.f25027y;
        }

        public final int b(int i10, int i11, int i12) {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }
    }

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\"\u0010\u0019\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\"\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012¨\u0006#"}, d2 = {"Lwf/h$b;", "Leg/a0;", "Ltb/e0;", "e", "Leg/c;", "sink", BuildConfig.FLAVOR, "byteCount", "g1", "Leg/b0;", "m", "close", BuildConfig.FLAVOR, "length", "I", "getLength", "()I", "i", "(I)V", "flags", "getFlags", "f", "streamId", "getStreamId", "n", "left", "b", "h", "padding", "getPadding", "j", "Leg/e;", "source", "<init>", "(Leg/e;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class b implements a0 {
        private int U3;

        /* renamed from: c */
        private final eg.e f25032c;

        /* renamed from: d */
        private int f25033d;

        /* renamed from: q */
        private int f25034q;

        /* renamed from: x */
        private int f25035x;

        /* renamed from: y */
        private int f25036y;

        public b(eg.e eVar) {
            t.e(eVar, "source");
            this.f25032c = eVar;
        }

        private final void e() {
            int i10 = this.f25035x;
            int J = pf.d.J(this.f25032c);
            this.f25036y = J;
            this.f25033d = J;
            int d10 = pf.d.d(this.f25032c.readByte(), 255);
            this.f25034q = pf.d.d(this.f25032c.readByte(), 255);
            a aVar = h.Companion;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(e.f24922a.c(true, this.f25035x, this.f25033d, d10, this.f25034q));
            }
            int readInt = this.f25032c.readInt() & Integer.MAX_VALUE;
            this.f25035x = readInt;
            if (d10 == 9) {
                if (readInt != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
                return;
            }
            throw new IOException(d10 + " != TYPE_CONTINUATION");
        }

        public final int b() {
            return this.f25036y;
        }

        @Override // eg.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public final void f(int i10) {
            this.f25034q = i10;
        }

        @Override // eg.a0
        public long g1(eg.c cVar, long j10) {
            t.e(cVar, "sink");
            while (true) {
                int i10 = this.f25036y;
                if (i10 != 0) {
                    long g12 = this.f25032c.g1(cVar, Math.min(j10, i10));
                    if (g12 == -1) {
                        return -1L;
                    }
                    this.f25036y -= (int) g12;
                    return g12;
                }
                this.f25032c.skip(this.U3);
                this.U3 = 0;
                if ((this.f25034q & 4) != 0) {
                    return -1L;
                }
                e();
            }
        }

        public final void h(int i10) {
            this.f25036y = i10;
        }

        public final void i(int i10) {
            this.f25033d = i10;
        }

        public final void j(int i10) {
            this.U3 = i10;
        }

        @Override // eg.a0
        public b0 m() {
            return this.f25032c.m();
        }

        public final void n(int i10) {
            this.f25035x = i10;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&J.\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&J\b\u0010\u0017\u001a\u00020\tH&J \u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H&J \u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH&J\u0018\u0010\"\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&J(\u0010&\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0002H&J&\u0010)\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¨\u0006*"}, d2 = {"Lwf/h$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "inFinished", BuildConfig.FLAVOR, "streamId", "Leg/e;", "source", "length", "Ltb/e0;", "b", "associatedStreamId", BuildConfig.FLAVOR, "Lwf/c;", "headerBlock", "f", "Lwf/b;", "errorCode", "d", "clearPrevious", "Lwf/m;", "settings", "k", "a", "ack", "payload1", "payload2", "c", "lastGoodStreamId", "Leg/f;", "debugData", "g", BuildConfig.FLAVOR, "windowSizeIncrement", "h", "streamDependency", "weight", "exclusive", "e", "promisedStreamId", "requestHeaders", "j", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public interface c {
        void a();

        void b(boolean z10, int i10, eg.e eVar, int i11);

        void c(boolean z10, int i10, int i11);

        void d(int i10, wf.b bVar);

        void e(int i10, int i11, int i12, boolean z10);

        void f(boolean z10, int i10, int i11, List<wf.c> list);

        void g(int i10, wf.b bVar, eg.f fVar);

        void h(int i10, long j10);

        void j(int i10, int i11, List<wf.c> list);

        void k(boolean z10, m mVar);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        t.d(logger, "getLogger(Http2::class.java.name)");
        f25027y = logger;
    }

    public h(eg.e eVar, boolean z10) {
        t.e(eVar, "source");
        this.f25028c = eVar;
        this.f25029d = z10;
        b bVar = new b(eVar);
        this.f25030q = bVar;
        this.f25031x = new d.a(bVar, 4096, 0, 4, null);
    }

    private final void B(c cVar, int i10, int i11, int i12) {
        nc.g i13;
        nc.e h10;
        int readInt;
        if (i12 == 0) {
            if ((i11 & 1) != 0) {
                if (i10 != 0) {
                    throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                }
                cVar.a();
                return;
            } else if (i10 % 6 != 0) {
                throw new IOException(t.l("TYPE_SETTINGS length % 6 != 0: ", Integer.valueOf(i10)));
            } else {
                m mVar = new m();
                i13 = nc.m.i(0, i10);
                h10 = nc.m.h(i13, 6);
                int a10 = h10.a();
                int b10 = h10.b();
                int d10 = h10.d();
                if ((d10 > 0 && a10 <= b10) || (d10 < 0 && b10 <= a10)) {
                    while (true) {
                        int i14 = a10 + d10;
                        int e10 = pf.d.e(this.f25028c.readShort(), 65535);
                        readInt = this.f25028c.readInt();
                        if (e10 != 2) {
                            if (e10 == 3) {
                                e10 = 4;
                            } else if (e10 == 4) {
                                e10 = 7;
                                if (readInt < 0) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else if (e10 == 5 && (readInt < 16384 || readInt > 16777215)) {
                                break;
                            }
                        } else if (readInt != 0 && readInt != 1) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                        }
                        mVar.h(e10, readInt);
                        if (a10 == b10) {
                            break;
                        }
                        a10 = i14;
                    }
                    throw new IOException(t.l("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", Integer.valueOf(readInt)));
                }
                cVar.k(false, mVar);
                return;
            }
        }
        throw new IOException("TYPE_SETTINGS streamId != 0");
    }

    private final void G(c cVar, int i10, int i11, int i12) {
        if (i10 == 4) {
            long f10 = pf.d.f(this.f25028c.readInt(), 2147483647L);
            if (f10 == 0) {
                throw new IOException("windowSizeIncrement was 0");
            }
            cVar.h(i12, f10);
            return;
        }
        throw new IOException(t.l("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(i10)));
    }

    private final void h(c cVar, int i10, int i11, int i12) {
        if (i12 != 0) {
            int i13 = 0;
            boolean z10 = true;
            boolean z11 = (i11 & 1) != 0;
            if ((i11 & 32) == 0) {
                z10 = false;
            }
            if (z10) {
                throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            }
            if ((i11 & 8) != 0) {
                i13 = pf.d.d(this.f25028c.readByte(), 255);
            }
            cVar.b(z11, i12, this.f25028c, Companion.b(i10, i11, i13));
            this.f25028c.skip(i13);
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    private final void i(c cVar, int i10, int i11, int i12) {
        if (i10 >= 8) {
            if (i12 != 0) {
                throw new IOException("TYPE_GOAWAY streamId != 0");
            }
            int readInt = this.f25028c.readInt();
            int readInt2 = this.f25028c.readInt();
            int i13 = i10 - 8;
            wf.b a10 = wf.b.Companion.a(readInt2);
            if (a10 == null) {
                throw new IOException(t.l("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(readInt2)));
            }
            eg.f fVar = eg.f.f9610x;
            if (i13 > 0) {
                fVar = this.f25028c.F(i13);
            }
            cVar.g(readInt, a10, fVar);
            return;
        }
        throw new IOException(t.l("TYPE_GOAWAY length < 8: ", Integer.valueOf(i10)));
    }

    private final List<wf.c> j(int i10, int i11, int i12, int i13) {
        this.f25030q.h(i10);
        b bVar = this.f25030q;
        bVar.i(bVar.b());
        this.f25030q.j(i11);
        this.f25030q.f(i12);
        this.f25030q.n(i13);
        this.f25031x.k();
        return this.f25031x.e();
    }

    private final void n(c cVar, int i10, int i11, int i12) {
        if (i12 != 0) {
            int i13 = 0;
            boolean z10 = (i11 & 1) != 0;
            if ((i11 & 8) != 0) {
                i13 = pf.d.d(this.f25028c.readByte(), 255);
            }
            if ((i11 & 32) != 0) {
                r(cVar, i12);
                i10 -= 5;
            }
            cVar.f(z10, i12, -1, j(Companion.b(i10, i11, i13), i13, i11, i12));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    private final void p(c cVar, int i10, int i11, int i12) {
        if (i10 == 8) {
            if (i12 != 0) {
                throw new IOException("TYPE_PING streamId != 0");
            }
            int readInt = this.f25028c.readInt();
            int readInt2 = this.f25028c.readInt();
            boolean z10 = true;
            if ((i11 & 1) == 0) {
                z10 = false;
            }
            cVar.c(z10, readInt, readInt2);
            return;
        }
        throw new IOException(t.l("TYPE_PING length != 8: ", Integer.valueOf(i10)));
    }

    private final void r(c cVar, int i10) {
        int readInt = this.f25028c.readInt();
        cVar.e(i10, readInt & Integer.MAX_VALUE, pf.d.d(this.f25028c.readByte(), 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    private final void s(c cVar, int i10, int i11, int i12) {
        if (i10 == 5) {
            if (i12 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            r(cVar, i12);
            return;
        }
        throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
    }

    private final void u(c cVar, int i10, int i11, int i12) {
        if (i12 != 0) {
            int d10 = (i11 & 8) != 0 ? pf.d.d(this.f25028c.readByte(), 255) : 0;
            cVar.j(i12, this.f25028c.readInt() & Integer.MAX_VALUE, j(Companion.b(i10 - 4, i11, d10), d10, i11, i12));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    private final void z(c cVar, int i10, int i11, int i12) {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        } else if (i12 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        } else {
            int readInt = this.f25028c.readInt();
            wf.b a10 = wf.b.Companion.a(readInt);
            if (a10 == null) {
                throw new IOException(t.l("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(readInt)));
            }
            cVar.d(i12, a10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f25028c.close();
    }

    public final boolean e(boolean z10, c cVar) {
        t.e(cVar, "handler");
        try {
            this.f25028c.N0(9L);
            int J = pf.d.J(this.f25028c);
            if (J > 16384) {
                throw new IOException(t.l("FRAME_SIZE_ERROR: ", Integer.valueOf(J)));
            }
            int d10 = pf.d.d(this.f25028c.readByte(), 255);
            int d11 = pf.d.d(this.f25028c.readByte(), 255);
            int readInt = this.f25028c.readInt() & Integer.MAX_VALUE;
            Logger logger = f25027y;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.f24922a.c(true, readInt, J, d10, d11));
            }
            if (z10 && d10 != 4) {
                throw new IOException(t.l("Expected a SETTINGS frame but was ", e.f24922a.b(d10)));
            }
            switch (d10) {
                case 0:
                    h(cVar, J, d11, readInt);
                    return true;
                case 1:
                    n(cVar, J, d11, readInt);
                    return true;
                case 2:
                    s(cVar, J, d11, readInt);
                    return true;
                case 3:
                    z(cVar, J, d11, readInt);
                    return true;
                case 4:
                    B(cVar, J, d11, readInt);
                    return true;
                case 5:
                    u(cVar, J, d11, readInt);
                    return true;
                case 6:
                    p(cVar, J, d11, readInt);
                    return true;
                case 7:
                    i(cVar, J, d11, readInt);
                    return true;
                case 8:
                    G(cVar, J, d11, readInt);
                    return true;
                default:
                    this.f25028c.skip(J);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void f(c cVar) {
        t.e(cVar, "handler");
        if (this.f25029d) {
            if (!e(true, cVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        eg.e eVar = this.f25028c;
        eg.f fVar = e.f24923b;
        eg.f F = eVar.F(fVar.W());
        Logger logger = f25027y;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(pf.d.t(t.l("<< CONNECTION ", F.x()), new Object[0]));
        }
        if (!t.a(fVar, F)) {
            throw new IOException(t.l("Expected a connection header but was ", F.e0()));
        }
    }
}
