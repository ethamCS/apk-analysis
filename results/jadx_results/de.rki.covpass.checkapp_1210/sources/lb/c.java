package lb;

import hc.t;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import pb.e;
import tb.i;
@fc.b
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0013B\u0014\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0088\u0001\u0010\u0092\u0001\u00020\u000fø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0014"}, d2 = {"Llb/c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "offset", "length", "e", "(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;", "destination", "destinationOffset", "Ltb/e0;", "c", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;III)V", BuildConfig.FLAVOR, "d", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;JJJ)V", "Ljava/nio/ByteBuffer;", "buffer", "b", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", "a", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private static final ByteBuffer f15917a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\t"}, d2 = {"Llb/c$a;", BuildConfig.FLAVOR, "Llb/c;", "Empty", "Ljava/nio/ByteBuffer;", "a", "()Ljava/nio/ByteBuffer;", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ByteBuffer a() {
            return c.f15917a;
        }
    }

    static {
        ByteBuffer order = ByteBuffer.allocate(0).order(ByteOrder.BIG_ENDIAN);
        t.d(order, "allocate(0).order(ByteOrder.BIG_ENDIAN)");
        f15917a = b(order);
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) {
        t.e(byteBuffer, "buffer");
        return byteBuffer;
    }

    public static final void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10, int i11, int i12) {
        t.e(byteBuffer, "arg0");
        t.e(byteBuffer2, "destination");
        if (byteBuffer.hasArray() && byteBuffer2.hasArray() && !byteBuffer.isReadOnly() && !byteBuffer2.isReadOnly()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i10, byteBuffer2.array(), byteBuffer2.arrayOffset() + i12, i11);
            return;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i10);
        duplicate.limit(i10 + i11);
        ByteBuffer duplicate2 = byteBuffer2.duplicate();
        duplicate2.position(i12);
        duplicate2.put(duplicate);
    }

    public static final void d(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, long j10, long j11, long j12) {
        t.e(byteBuffer, "arg0");
        t.e(byteBuffer2, "destination");
        if (j10 >= 2147483647L) {
            e.a(j10, "offset");
            throw new i();
        }
        int i10 = (int) j10;
        if (j11 >= 2147483647L) {
            e.a(j11, "length");
            throw new i();
        }
        int i11 = (int) j11;
        if (j12 < 2147483647L) {
            c(byteBuffer, byteBuffer2, i10, i11, (int) j12);
        } else {
            e.a(j12, "destinationOffset");
            throw new i();
        }
    }

    public static final ByteBuffer e(ByteBuffer byteBuffer, int i10, int i11) {
        t.e(byteBuffer, "arg0");
        return b(d.d(byteBuffer, i10, i11));
    }
}
