package eg;

import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\rH&J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H&J \u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH&J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\tH&J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\tH&J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\tH&J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000eH&J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000eH&J\b\u0010 \u001a\u00020\u001fH&J\b\u0010!\u001a\u00020\u0000H&J\b\u0010\"\u001a\u00020\u0000H&R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006'À\u0006\u0001"}, d2 = {"Leg/d;", "Leg/y;", "Ljava/nio/channels/WritableByteChannel;", "Leg/f;", "byteString", "k0", BuildConfig.FLAVOR, "source", "r0", BuildConfig.FLAVOR, "offset", "byteCount", "o", "Leg/a0;", BuildConfig.FLAVOR, "G0", BuildConfig.FLAVOR, "string", "Q0", "beginIndex", "endIndex", "x", "b", "i0", "s", "N", "i", "U", "v", "T0", "A", "Ltb/e0;", "flush", "L", "t0", "Leg/c;", "c", "()Leg/c;", "buffer", "okio"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public interface d extends y, WritableByteChannel {
    d A(long j10);

    long G0(a0 a0Var);

    d L();

    d N(int i10);

    d Q0(String str);

    d T0(long j10);

    d U(int i10);

    c c();

    @Override // eg.y, java.io.Flushable
    void flush();

    d i0(int i10);

    d k0(f fVar);

    d o(byte[] bArr, int i10, int i11);

    d r0(byte[] bArr);

    d t0();

    d x(String str, int i10, int i11);
}
