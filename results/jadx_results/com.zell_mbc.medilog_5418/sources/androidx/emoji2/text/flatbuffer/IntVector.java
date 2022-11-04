package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import net.lingala.zip4j.util.InternalZipConstants;
/* loaded from: classes.dex */
public final class IntVector extends BaseVector {
    public IntVector __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 4, byteBuffer);
        return this;
    }

    public int get(int i) {
        return this.bb.getInt(__element(i));
    }

    public long getAsUnsigned(int i) {
        return get(i) & InternalZipConstants.ZIP_64_SIZE_LIMIT;
    }
}
