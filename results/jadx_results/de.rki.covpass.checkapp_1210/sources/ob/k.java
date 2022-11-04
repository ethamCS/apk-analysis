package ob;

import java.nio.ByteBuffer;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Lob/e;", "Ljava/nio/ByteBuffer;", "source", "Ltb/e0;", "a", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class k {
    public static final void a(e eVar, ByteBuffer byteBuffer) {
        hc.t.e(eVar, "<this>");
        hc.t.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        ByteBuffer n10 = eVar.n();
        int s10 = eVar.s();
        int j10 = eVar.j() - s10;
        if (j10 >= remaining) {
            lb.d.c(byteBuffer, n10, s10);
            eVar.b(remaining);
            return;
        }
        throw new e0("buffer content", remaining, j10);
    }
}
