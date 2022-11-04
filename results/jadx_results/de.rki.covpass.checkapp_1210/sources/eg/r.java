package eg;

import java.io.OutputStream;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0013"}, d2 = {"Leg/r;", "Leg/y;", "Leg/c;", "source", BuildConfig.FLAVOR, "byteCount", "Ltb/e0;", "O", "flush", "close", "Leg/b0;", "m", BuildConfig.FLAVOR, "toString", "Ljava/io/OutputStream;", "out", "timeout", "<init>", "(Ljava/io/OutputStream;Leg/b0;)V", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class r implements y {

    /* renamed from: c */
    private final OutputStream f9636c;

    /* renamed from: d */
    private final b0 f9637d;

    public r(OutputStream outputStream, b0 b0Var) {
        hc.t.e(outputStream, "out");
        hc.t.e(b0Var, "timeout");
        this.f9636c = outputStream;
        this.f9637d = b0Var;
    }

    @Override // eg.y
    public void O(c cVar, long j10) {
        hc.t.e(cVar, "source");
        f0.b(cVar.e1(), 0L, j10);
        while (j10 > 0) {
            this.f9637d.f();
            v vVar = cVar.f9600c;
            hc.t.b(vVar);
            int min = (int) Math.min(j10, vVar.f9652c - vVar.f9651b);
            this.f9636c.write(vVar.f9650a, vVar.f9651b, min);
            vVar.f9651b += min;
            long j11 = min;
            j10 -= j11;
            cVar.c1(cVar.e1() - j11);
            if (vVar.f9651b == vVar.f9652c) {
                cVar.f9600c = vVar.b();
                w.b(vVar);
            }
        }
    }

    @Override // eg.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9636c.close();
    }

    @Override // eg.y, java.io.Flushable
    public void flush() {
        this.f9636c.flush();
    }

    @Override // eg.y
    public b0 m() {
        return this.f9637d;
    }

    public String toString() {
        return "sink(" + this.f9636c + ')';
    }
}
