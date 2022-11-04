package eg;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u0012"}, d2 = {"Leg/m;", "Leg/a0;", "Leg/c;", "sink", BuildConfig.FLAVOR, "byteCount", "g1", "Ltb/e0;", "close", "Leg/b0;", "m", BuildConfig.FLAVOR, "toString", "Ljava/io/InputStream;", "input", "timeout", "<init>", "(Ljava/io/InputStream;Leg/b0;)V", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public class m implements a0 {

    /* renamed from: c */
    private final InputStream f9631c;

    /* renamed from: d */
    private final b0 f9632d;

    public m(InputStream inputStream, b0 b0Var) {
        hc.t.e(inputStream, "input");
        hc.t.e(b0Var, "timeout");
        this.f9631c = inputStream;
        this.f9632d = b0Var;
    }

    @Override // eg.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9631c.close();
    }

    @Override // eg.a0
    public long g1(c cVar, long j10) {
        hc.t.e(cVar, "sink");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0) {
            return 0L;
        }
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(hc.t.l("byteCount < 0: ", Long.valueOf(j10)).toString());
        }
        try {
            this.f9632d.f();
            v i12 = cVar.i1(1);
            int read = this.f9631c.read(i12.f9650a, i12.f9652c, (int) Math.min(j10, 8192 - i12.f9652c));
            if (read != -1) {
                i12.f9652c += read;
                long j11 = read;
                cVar.c1(cVar.e1() + j11);
                return j11;
            } else if (i12.f9651b != i12.f9652c) {
                return -1L;
            } else {
                cVar.f9600c = i12.b();
                w.b(i12);
                return -1L;
            }
        } catch (AssertionError e10) {
            if (!n.e(e10)) {
                throw e10;
            }
            throw new IOException(e10);
        }
    }

    @Override // eg.a0
    public b0 m() {
        return this.f9632d;
    }

    public String toString() {
        return "source(" + this.f9631c + ')';
    }
}
