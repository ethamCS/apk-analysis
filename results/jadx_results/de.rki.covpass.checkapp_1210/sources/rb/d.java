package rb;

import hc.t;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\r"}, d2 = {"Lrb/d;", "Lrb/c;", "Ljava/nio/ByteBuffer;", "z", "instance", "u", "Ltb/e0;", "B", BuildConfig.FLAVOR, "capacity", "bufferSize", "<init>", "(II)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d extends c<ByteBuffer> {
    private final int V3;

    public d() {
        this(0, 0, 3, null);
    }

    public d(int i10, int i11) {
        super(i10);
        this.V3 = i11;
    }

    public /* synthetic */ d(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 2000 : i10, (i12 & 2) != 0 ? 4096 : i11);
    }

    /* renamed from: B */
    public void s(ByteBuffer byteBuffer) {
        t.e(byteBuffer, "instance");
        if (byteBuffer.capacity() == this.V3) {
            if (!byteBuffer.isDirect()) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: u */
    public ByteBuffer e(ByteBuffer byteBuffer) {
        t.e(byteBuffer, "instance");
        byteBuffer.clear();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer;
    }

    /* renamed from: z */
    public ByteBuffer j() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.V3);
        t.b(allocateDirect);
        return allocateDirect;
    }
}
