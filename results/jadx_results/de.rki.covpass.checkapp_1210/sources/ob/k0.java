package ob;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007*\n\u0010\t\"\u00020\b2\u00020\b¨\u0006\n"}, d2 = {BuildConfig.FLAVOR, "headerSizeHint", "Lob/r;", "a", "PACKET_MAX_COPY_SIZE", "I", "b", "()I", "Ljava/io/EOFException;", "EOFException", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a */
    private static final int f17774a = sb.a.a("max.copy.size", 500);

    public static final r a(int i10) {
        return new r(i10, pb.a.Companion.c());
    }

    public static final int b() {
        return f17774a;
    }
}
