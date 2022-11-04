package ob;

import java.nio.ByteOrder;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u0004"}, d2 = {"Ljava/nio/ByteOrder;", "nioOrder", "Lob/p;", "b", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class q {
    public static final p b(ByteOrder byteOrder) {
        return byteOrder == ByteOrder.BIG_ENDIAN ? p.f17788q : p.f17789x;
    }
}
