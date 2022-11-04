package eg;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\r\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Leg/i;", "Leg/a0;", "Leg/c;", "sink", BuildConfig.FLAVOR, "byteCount", "g1", "Leg/b0;", "m", "Ltb/e0;", "close", BuildConfig.FLAVOR, "toString", "delegate", "Leg/a0;", "b", "()Leg/a0;", "<init>", "(Leg/a0;)V", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public abstract class i implements a0 {

    /* renamed from: c */
    private final a0 f9620c;

    public i(a0 a0Var) {
        hc.t.e(a0Var, "delegate");
        this.f9620c = a0Var;
    }

    public final a0 b() {
        return this.f9620c;
    }

    @Override // eg.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9620c.close();
    }

    @Override // eg.a0
    public long g1(c cVar, long j10) {
        hc.t.e(cVar, "sink");
        return this.f9620c.g1(cVar, j10);
    }

    @Override // eg.a0
    public b0 m() {
        return this.f9620c.m();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) getClass().getSimpleName());
        sb2.append('(');
        sb2.append(this.f9620c);
        sb2.append(')');
        return sb2.toString();
    }
}
