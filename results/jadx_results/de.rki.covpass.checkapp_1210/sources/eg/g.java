package eg;

import java.util.zip.Deflater;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u000f\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016¨\u0006\u001a"}, d2 = {"Leg/g;", "Leg/y;", BuildConfig.FLAVOR, "syncFlush", "Ltb/e0;", "b", "Leg/c;", "source", BuildConfig.FLAVOR, "byteCount", "O", "flush", "e", "()V", "close", "Leg/b0;", "m", BuildConfig.FLAVOR, "toString", "Leg/d;", "sink", "Ljava/util/zip/Deflater;", "deflater", "<init>", "(Leg/d;Ljava/util/zip/Deflater;)V", "(Leg/y;Ljava/util/zip/Deflater;)V", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class g implements y {

    /* renamed from: c */
    private final d f9616c;

    /* renamed from: d */
    private final Deflater f9617d;

    /* renamed from: q */
    private boolean f9618q;

    public g(d dVar, Deflater deflater) {
        hc.t.e(dVar, "sink");
        hc.t.e(deflater, "deflater");
        this.f9616c = dVar;
        this.f9617d = deflater;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(y yVar, Deflater deflater) {
        this(n.c(yVar), deflater);
        hc.t.e(yVar, "sink");
        hc.t.e(deflater, "deflater");
    }

    @IgnoreJRERequirement
    private final void b(boolean z10) {
        v i12;
        c c10 = this.f9616c.c();
        while (true) {
            i12 = c10.i1(1);
            Deflater deflater = this.f9617d;
            byte[] bArr = i12.f9650a;
            int i10 = i12.f9652c;
            int i11 = 8192 - i10;
            int deflate = z10 ? deflater.deflate(bArr, i10, i11, 2) : deflater.deflate(bArr, i10, i11);
            if (deflate > 0) {
                i12.f9652c += deflate;
                c10.c1(c10.e1() + deflate);
                this.f9616c.t0();
            } else if (this.f9617d.needsInput()) {
                break;
            }
        }
        if (i12.f9651b == i12.f9652c) {
            c10.f9600c = i12.b();
            w.b(i12);
        }
    }

    @Override // eg.y
    public void O(c cVar, long j10) {
        hc.t.e(cVar, "source");
        f0.b(cVar.e1(), 0L, j10);
        while (j10 > 0) {
            v vVar = cVar.f9600c;
            hc.t.b(vVar);
            int min = (int) Math.min(j10, vVar.f9652c - vVar.f9651b);
            this.f9617d.setInput(vVar.f9650a, vVar.f9651b, min);
            b(false);
            long j11 = min;
            cVar.c1(cVar.e1() - j11);
            int i10 = vVar.f9651b + min;
            vVar.f9651b = i10;
            if (i10 == vVar.f9652c) {
                cVar.f9600c = vVar.b();
                w.b(vVar);
            }
            j10 -= j11;
        }
    }

    @Override // eg.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f9618q) {
            return;
        }
        Throwable th2 = null;
        try {
            e();
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            this.f9617d.end();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        try {
            this.f9616c.close();
        } catch (Throwable th5) {
            if (th2 == null) {
                th2 = th5;
            }
        }
        this.f9618q = true;
        if (th2 != null) {
            throw th2;
        }
    }

    public final void e() {
        this.f9617d.finish();
        b(false);
    }

    @Override // eg.y, java.io.Flushable
    public void flush() {
        b(true);
        this.f9616c.flush();
    }

    @Override // eg.y
    public b0 m() {
        return this.f9616c.m();
    }

    public String toString() {
        return "DeflaterSink(" + this.f9616c + ')';
    }
}
