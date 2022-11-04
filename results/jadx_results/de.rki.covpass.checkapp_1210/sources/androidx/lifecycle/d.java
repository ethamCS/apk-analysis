package androidx.lifecycle;

import java.io.Closeable;
import kotlin.Metadata;
import kotlinx.coroutines.g2;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/lifecycle/d;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/q0;", "Ltb/e0;", "close", "Lxb/g;", "coroutineContext", "Lxb/g;", "h", "()Lxb/g;", "context", "<init>", "(Lxb/g;)V", "lifecycle-viewmodel-ktx_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d implements Closeable, kotlinx.coroutines.q0 {

    /* renamed from: c */
    private final xb.g f4311c;

    public d(xb.g gVar) {
        hc.t.e(gVar, "context");
        this.f4311c = gVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        g2.e(h(), null, 1, null);
    }

    @Override // kotlinx.coroutines.q0
    public xb.g h() {
        return this.f4311c;
    }
}
