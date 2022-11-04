package eg;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0012\u001a\u00020\u0007H&J\b\u0010\u0013\u001a\u00020\u0007H&J\b\u0010\u0014\u001a\u00020\u0007H&J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001bH&J\u0018\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010!\u001a\u00020 H&J\u0010\u0010#\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0007H&J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0016H&J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0016H&J\b\u0010(\u001a\u00020\u0000H&J\b\u0010*\u001a\u00020)H&R\u0014\u0010-\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006.À\u0006\u0001"}, d2 = {"Leg/e;", "Leg/a0;", "Ljava/nio/channels/ReadableByteChannel;", "Leg/c;", "E", BuildConfig.FLAVOR, "g0", BuildConfig.FLAVOR, "byteCount", "Ltb/e0;", "N0", "P", BuildConfig.FLAVOR, "readByte", BuildConfig.FLAVOR, "readShort", BuildConfig.FLAVOR, "readInt", "readLong", "v0", "b1", "skip", "Leg/f;", "F", "Leg/q;", "options", "Q", BuildConfig.FLAVOR, "l0", "sink", "readFully", "Z0", BuildConfig.FLAVOR, "b0", "limit", "y0", "bytes", "X", "targetBytes", "Y", "J0", "Ljava/io/InputStream;", "d1", "c", "()Leg/c;", "buffer", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public interface e extends a0, ReadableByteChannel {
    c E();

    f F(long j10);

    e J0();

    void N0(long j10);

    boolean P(long j10);

    int Q(q qVar);

    long X(f fVar);

    long Y(f fVar);

    void Z0(c cVar, long j10);

    String b0();

    long b1();

    c c();

    InputStream d1();

    boolean g0();

    byte[] l0(long j10);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j10);

    long v0();

    String y0(long j10);
}
