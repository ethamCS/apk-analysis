package ob;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0007"}, d2 = {"Lob/e;", "Ljava/nio/ByteBuffer;", "dst", BuildConfig.FLAVOR, "length", "Ltb/e0;", "a", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class g0 {
    public static final void a(e eVar, ByteBuffer byteBuffer, int i10) {
        hc.t.e(eVar, "<this>");
        hc.t.e(byteBuffer, "dst");
        ByteBuffer n10 = eVar.n();
        int p10 = eVar.p();
        if (!(eVar.s() - p10 >= i10)) {
            new l("buffer content", i10).a();
            throw new tb.i();
        }
        int limit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i10);
            lb.d.b(n10, byteBuffer, p10);
            byteBuffer.limit(limit);
            tb.e0 e0Var = tb.e0.f22152a;
            eVar.f(i10);
        } catch (Throwable th2) {
            byteBuffer.limit(limit);
            throw th2;
        }
    }
}
