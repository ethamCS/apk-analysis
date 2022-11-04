package ob;

import java.io.Closeable;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J@\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H&R\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lob/z;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Llb/c;", "destination", BuildConfig.FLAVOR, "destinationOffset", "offset", "min", "max", "Z", "(Ljava/nio/ByteBuffer;JJJJ)J", "n", "y", BuildConfig.FLAVOR, "a1", "()Z", "endOfInput", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public interface z extends Closeable {
    long Z(ByteBuffer byteBuffer, long j10, long j11, long j12, long j13);

    boolean a1();

    long y(long j10);
}
