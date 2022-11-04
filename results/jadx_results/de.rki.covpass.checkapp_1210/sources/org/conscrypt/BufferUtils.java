package org.conscrypt;

import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
final class BufferUtils {
    private BufferUtils() {
    }

    public static void checkNotNull(ByteBuffer[] byteBufferArr) {
        for (ByteBuffer byteBuffer : byteBufferArr) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null buffer in array");
            }
        }
    }

    public static void consume(ByteBuffer[] byteBufferArr, int i10) {
        for (ByteBuffer byteBuffer : byteBufferArr) {
            int min = Math.min(byteBuffer.remaining(), i10);
            if (min > 0) {
                byteBuffer.position(byteBuffer.position() + min);
                i10 -= min;
                if (i10 == 0) {
                    break;
                }
            }
        }
        if (i10 <= 0) {
            return;
        }
        throw new IllegalArgumentException("toConsume > data size");
    }

    public static ByteBuffer copyNoConsume(ByteBuffer[] byteBufferArr, ByteBuffer byteBuffer, int i10) {
        Preconditions.checkArgument(byteBuffer.remaining() >= i10, "Destination buffer too small");
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            int remaining = byteBuffer2.remaining();
            if (remaining > 0) {
                int position = byteBuffer2.position();
                if (remaining <= i10) {
                    byteBuffer.put(byteBuffer2);
                    i10 -= remaining;
                } else {
                    int limit = byteBuffer2.limit();
                    byteBuffer2.limit(byteBuffer2.position() + i10);
                    byteBuffer.put(byteBuffer2);
                    byteBuffer2.limit(limit);
                    i10 = 0;
                }
                byteBuffer2.position(position);
                if (i10 == 0) {
                    break;
                }
            }
        }
        byteBuffer.flip();
        return byteBuffer;
    }

    public static ByteBuffer getBufferLargerThan(ByteBuffer[] byteBufferArr, int i10) {
        int length = byteBufferArr.length;
        int i11 = 0;
        while (i11 < length) {
            ByteBuffer byteBuffer = byteBufferArr[i11];
            int remaining = byteBuffer.remaining();
            if (remaining > 0) {
                if (remaining >= i10) {
                    return byteBuffer;
                }
                do {
                    i11++;
                    if (i11 >= length) {
                        return byteBuffer;
                    }
                } while (byteBufferArr[i11].remaining() <= 0);
                return null;
            }
            i11++;
        }
        return null;
    }

    public static long remaining(ByteBuffer[] byteBufferArr) {
        long j10 = 0;
        for (ByteBuffer byteBuffer : byteBufferArr) {
            j10 += byteBuffer.remaining();
        }
        return j10;
    }
}
