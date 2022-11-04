package lb;

import hc.t;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a4\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a$\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a$\u0010\r\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\r\u0010\f\u001a\u001c\u0010\u000e\u001a\u00020\n*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Llb/c;", BuildConfig.FLAVOR, "destination", BuildConfig.FLAVOR, "offset", "length", "destinationOffset", "Ltb/e0;", "a", "(Ljava/nio/ByteBuffer;[BIII)V", "Ljava/nio/ByteBuffer;", "b", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)V", "c", "d", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d {
    public static final void a(ByteBuffer byteBuffer, byte[] bArr, int i10, int i11, int i12) {
        t.e(byteBuffer, "$this$copyTo");
        t.e(bArr, "destination");
        if (!byteBuffer.hasArray() || byteBuffer.isReadOnly()) {
            byteBuffer.duplicate().get(bArr, i12, i11);
        } else {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i10, bArr, i12, i11);
        }
    }

    public static final void b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10) {
        t.e(byteBuffer, "$this$copyTo");
        t.e(byteBuffer2, "destination");
        int remaining = byteBuffer2.remaining();
        if (byteBuffer.hasArray() && !byteBuffer.isReadOnly() && byteBuffer2.hasArray() && !byteBuffer2.isReadOnly()) {
            int position = byteBuffer2.position();
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i10, byteBuffer2.array(), byteBuffer2.arrayOffset() + position, remaining);
            byteBuffer2.position(position + remaining);
            return;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.limit(remaining + i10);
        duplicate.position(i10);
        byteBuffer2.put(duplicate);
    }

    public static final void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10) {
        t.e(byteBuffer, "$this$copyTo");
        t.e(byteBuffer2, "destination");
        if (!byteBuffer.hasArray() || byteBuffer.isReadOnly()) {
            d(byteBuffer2, i10, byteBuffer.remaining()).put(byteBuffer);
            return;
        }
        byte[] array = byteBuffer.array();
        t.d(array, "array()");
        int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        int remaining = byteBuffer.remaining();
        ByteBuffer order = ByteBuffer.wrap(array, arrayOffset, remaining).slice().order(ByteOrder.BIG_ENDIAN);
        t.d(order, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        c.c(c.b(order), byteBuffer2, 0, remaining, i10);
        byteBuffer.position(byteBuffer.limit());
    }

    public static final ByteBuffer d(ByteBuffer byteBuffer, int i10, int i11) {
        t.e(byteBuffer, "<this>");
        ByteBuffer duplicate = byteBuffer.duplicate();
        t.d(duplicate, BuildConfig.FLAVOR);
        duplicate.position(i10);
        duplicate.limit(i10 + i11);
        ByteBuffer slice = duplicate.slice();
        t.d(slice, BuildConfig.FLAVOR);
        return slice;
    }
}
