package wf;

import hc.t;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import wf.d;
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00015B\u0017\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00102\u001a\u00020\u0016¢\u0006\u0004\b3\u00104J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ$\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u0011\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0002J(\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J(\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\tJ\u001e\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002J\u001e\u0010'\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%J\u0016\u0010)\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0004J&\u0010,\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002J\b\u0010-\u001a\u00020\u0006H\u0016J$\u0010/\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¨\u00066"}, d2 = {"Lwf/j;", "Ljava/io/Closeable;", BuildConfig.FLAVOR, "streamId", BuildConfig.FLAVOR, "byteCount", "Ltb/e0;", "G", "e", "Lwf/m;", "peerSettings", "b", "promisedStreamId", BuildConfig.FLAVOR, "Lwf/c;", "requestHeaders", "s", "flush", "Lwf/b;", "errorCode", "u", "p", BuildConfig.FLAVOR, "outFinished", "Leg/c;", "source", "f", "flags", "buffer", "h", "settings", "z", "ack", "payload1", "payload2", "r", "lastGoodStreamId", BuildConfig.FLAVOR, "debugData", "j", "windowSizeIncrement", "B", "length", "type", "i", "close", "headerBlock", "n", "Leg/d;", "sink", "client", "<init>", "(Leg/d;Z)V", "a", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class j implements Closeable {
    public static final a Companion = new a(null);
    private static final Logger V3 = Logger.getLogger(e.class.getName());
    private final d.b U3;

    /* renamed from: c */
    private final eg.d f25062c;

    /* renamed from: d */
    private final boolean f25063d;

    /* renamed from: q */
    private final eg.c f25064q;

    /* renamed from: x */
    private int f25065x = 16384;

    /* renamed from: y */
    private boolean f25066y;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lwf/j$a;", BuildConfig.FLAVOR, "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public j(eg.d dVar, boolean z10) {
        t.e(dVar, "sink");
        this.f25062c = dVar;
        this.f25063d = z10;
        eg.c cVar = new eg.c();
        this.f25064q = cVar;
        this.U3 = new d.b(0, false, cVar, 3, null);
    }

    private final void G(int i10, long j10) {
        while (j10 > 0) {
            long min = Math.min(this.f25065x, j10);
            j10 -= min;
            i(i10, (int) min, 9, j10 == 0 ? 4 : 0);
            this.f25062c.O(this.f25064q, min);
        }
    }

    public final synchronized void B(int i10, long j10) {
        if (this.f25066y) {
            throw new IOException("closed");
        }
        if (!(j10 != 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(t.l("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j10)).toString());
        }
        i(i10, 4, 8, 0);
        this.f25062c.U((int) j10);
        this.f25062c.flush();
    }

    public final synchronized void b(m mVar) {
        t.e(mVar, "peerSettings");
        if (this.f25066y) {
            throw new IOException("closed");
        }
        this.f25065x = mVar.e(this.f25065x);
        if (mVar.b() != -1) {
            this.U3.e(mVar.b());
        }
        i(0, 0, 4, 1);
        this.f25062c.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f25066y = true;
        this.f25062c.close();
    }

    public final synchronized void e() {
        if (!this.f25066y) {
            if (!this.f25063d) {
                return;
            }
            Logger logger = V3;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(pf.d.t(t.l(">> CONNECTION ", e.f24923b.x()), new Object[0]));
            }
            this.f25062c.k0(e.f24923b);
            this.f25062c.flush();
            return;
        }
        throw new IOException("closed");
    }

    public final synchronized void f(boolean z10, int i10, eg.c cVar, int i11) {
        if (this.f25066y) {
            throw new IOException("closed");
        }
        h(i10, z10 ? 1 : 0, cVar, i11);
    }

    public final synchronized void flush() {
        if (this.f25066y) {
            throw new IOException("closed");
        }
        this.f25062c.flush();
    }

    public final void h(int i10, int i11, eg.c cVar, int i12) {
        i(i10, i12, 0, i11);
        if (i12 > 0) {
            eg.d dVar = this.f25062c;
            t.b(cVar);
            dVar.O(cVar, i12);
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        Logger logger = V3;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.f24922a.c(false, i10, i11, i12, i13));
        }
        boolean z10 = true;
        if (!(i11 <= this.f25065x)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f25065x + ": " + i11).toString());
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException(t.l("reserved bit set: ", Integer.valueOf(i10)).toString());
        }
        pf.d.b0(this.f25062c, i11);
        this.f25062c.i0(i12 & 255);
        this.f25062c.i0(i13 & 255);
        this.f25062c.U(i10 & Integer.MAX_VALUE);
    }

    public final synchronized void j(int i10, b bVar, byte[] bArr) {
        t.e(bVar, "errorCode");
        t.e(bArr, "debugData");
        if (this.f25066y) {
            throw new IOException("closed");
        }
        boolean z10 = false;
        if (!(bVar.g() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        i(0, bArr.length + 8, 7, 0);
        this.f25062c.U(i10);
        this.f25062c.U(bVar.g());
        if (bArr.length == 0) {
            z10 = true;
        }
        if (!z10) {
            this.f25062c.r0(bArr);
        }
        this.f25062c.flush();
    }

    public final synchronized void n(boolean z10, int i10, List<c> list) {
        t.e(list, "headerBlock");
        if (this.f25066y) {
            throw new IOException("closed");
        }
        this.U3.g(list);
        long e12 = this.f25064q.e1();
        long min = Math.min(this.f25065x, e12);
        int i11 = (e12 > min ? 1 : (e12 == min ? 0 : -1));
        int i12 = i11 == 0 ? 4 : 0;
        if (z10) {
            i12 |= 1;
        }
        i(i10, (int) min, 1, i12);
        this.f25062c.O(this.f25064q, min);
        if (i11 > 0) {
            G(i10, e12 - min);
        }
    }

    public final int p() {
        return this.f25065x;
    }

    public final synchronized void r(boolean z10, int i10, int i11) {
        if (this.f25066y) {
            throw new IOException("closed");
        }
        i(0, 8, 6, z10 ? 1 : 0);
        this.f25062c.U(i10);
        this.f25062c.U(i11);
        this.f25062c.flush();
    }

    public final synchronized void s(int i10, int i11, List<c> list) {
        t.e(list, "requestHeaders");
        if (this.f25066y) {
            throw new IOException("closed");
        }
        this.U3.g(list);
        long e12 = this.f25064q.e1();
        int min = (int) Math.min(this.f25065x - 4, e12);
        int i12 = min + 4;
        long j10 = min;
        int i13 = (e12 > j10 ? 1 : (e12 == j10 ? 0 : -1));
        i(i10, i12, 5, i13 == 0 ? 4 : 0);
        this.f25062c.U(i11 & Integer.MAX_VALUE);
        this.f25062c.O(this.f25064q, j10);
        if (i13 > 0) {
            G(i10, e12 - j10);
        }
    }

    public final synchronized void u(int i10, b bVar) {
        t.e(bVar, "errorCode");
        if (this.f25066y) {
            throw new IOException("closed");
        }
        if (!(bVar.g() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        i(i10, 4, 3, 0);
        this.f25062c.U(bVar.g());
        this.f25062c.flush();
    }

    public final synchronized void z(m mVar) {
        t.e(mVar, "settings");
        if (this.f25066y) {
            throw new IOException("closed");
        }
        int i10 = 0;
        i(0, mVar.i() * 6, 4, 0);
        while (i10 < 10) {
            int i11 = i10 + 1;
            if (mVar.f(i10)) {
                this.f25062c.N(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                this.f25062c.U(mVar.a(i10));
            }
            i10 = i11;
        }
        this.f25062c.flush();
    }
}
