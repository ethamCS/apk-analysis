package eg;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0011"}, d2 = {"Leg/h;", "Leg/y;", "Leg/c;", "source", BuildConfig.FLAVOR, "byteCount", "Ltb/e0;", "O", "flush", "Leg/b0;", "m", "close", BuildConfig.FLAVOR, "toString", "delegate", "<init>", "(Leg/y;)V", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public abstract class h implements y {

    /* renamed from: c */
    private final y f9619c;

    public h(y yVar) {
        hc.t.e(yVar, "delegate");
        this.f9619c = yVar;
    }

    @Override // eg.y
    public void O(c cVar, long j10) {
        hc.t.e(cVar, "source");
        this.f9619c.O(cVar, j10);
    }

    @Override // eg.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9619c.close();
    }

    @Override // eg.y, java.io.Flushable
    public void flush() {
        this.f9619c.flush();
    }

    @Override // eg.y
    public b0 m() {
        return this.f9619c.m();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) getClass().getSimpleName());
        sb2.append('(');
        sb2.append(this.f9619c);
        sb2.append(')');
        return sb2.toString();
    }
}
