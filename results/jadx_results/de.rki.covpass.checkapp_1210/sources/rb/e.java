package rb;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import rb.f;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lrb/e;", BuildConfig.FLAVOR, "T", "Lrb/f;", "instance", "Ltb/e0;", "B0", "(Ljava/lang/Object;)V", "g", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class e<T> implements f<T> {
    @Override // rb.f
    public void B0(T t10) {
        t.e(t10, "instance");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        f.a.a(this);
    }

    @Override // rb.f
    public void g() {
    }
}
