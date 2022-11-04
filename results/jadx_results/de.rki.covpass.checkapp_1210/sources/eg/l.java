package eg;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016¨\u0006\u0016"}, d2 = {"Leg/l;", "Leg/a0;", "Ltb/e0;", "f", "Leg/c;", "sink", BuildConfig.FLAVOR, "byteCount", "g1", "b", BuildConfig.FLAVOR, "e", "Leg/b0;", "m", "close", "Leg/e;", "source", "Ljava/util/zip/Inflater;", "inflater", "<init>", "(Leg/e;Ljava/util/zip/Inflater;)V", "(Leg/a0;Ljava/util/zip/Inflater;)V", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class l implements a0 {

    /* renamed from: c */
    private final e f9627c;

    /* renamed from: d */
    private final Inflater f9628d;

    /* renamed from: q */
    private int f9629q;

    /* renamed from: x */
    private boolean f9630x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(a0 a0Var, Inflater inflater) {
        this(n.d(a0Var), inflater);
        hc.t.e(a0Var, "source");
        hc.t.e(inflater, "inflater");
    }

    public l(e eVar, Inflater inflater) {
        hc.t.e(eVar, "source");
        hc.t.e(inflater, "inflater");
        this.f9627c = eVar;
        this.f9628d = inflater;
    }

    private final void f() {
        int i10 = this.f9629q;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f9628d.getRemaining();
        this.f9629q -= remaining;
        this.f9627c.skip(remaining);
    }

    public final long b(c cVar, long j10) {
        hc.t.e(cVar, "sink");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (!(!this.f9630x)) {
                throw new IllegalStateException("closed".toString());
            }
            if (i10 == 0) {
                return 0L;
            }
            try {
                v i12 = cVar.i1(1);
                e();
                int inflate = this.f9628d.inflate(i12.f9650a, i12.f9652c, (int) Math.min(j10, 8192 - i12.f9652c));
                f();
                if (inflate > 0) {
                    i12.f9652c += inflate;
                    long j11 = inflate;
                    cVar.c1(cVar.e1() + j11);
                    return j11;
                }
                if (i12.f9651b == i12.f9652c) {
                    cVar.f9600c = i12.b();
                    w.b(i12);
                }
                return 0L;
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        }
        throw new IllegalArgumentException(hc.t.l("byteCount < 0: ", Long.valueOf(j10)).toString());
    }

    @Override // eg.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f9630x) {
            return;
        }
        this.f9628d.end();
        this.f9630x = true;
        this.f9627c.close();
    }

    public final boolean e() {
        if (!this.f9628d.needsInput()) {
            return false;
        }
        if (this.f9627c.g0()) {
            return true;
        }
        v vVar = this.f9627c.c().f9600c;
        hc.t.b(vVar);
        int i10 = vVar.f9652c;
        int i11 = vVar.f9651b;
        int i12 = i10 - i11;
        this.f9629q = i12;
        this.f9628d.setInput(vVar.f9650a, i11, i12);
        return false;
    }

    @Override // eg.a0
    public long g1(c cVar, long j10) {
        hc.t.e(cVar, "sink");
        do {
            long b10 = b(cVar, j10);
            if (b10 > 0) {
                return b10;
            }
            if (this.f9628d.finished() || this.f9628d.needsDictionary()) {
                return -1L;
            }
        } while (!this.f9627c.g0());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // eg.a0
    public b0 m() {
        return this.f9627c.m();
    }
}
