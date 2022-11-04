package f;

import java.nio.channels.WritableByteChannel;
/* loaded from: classes.dex */
public interface d extends s, WritableByteChannel {
    d A(int i);

    d F(int i);

    d O(String str);

    d Q(long j);

    d U(int i);

    c b();

    d e(byte[] bArr);

    d f(byte[] bArr, int i, int i2);

    @Override // f.s, java.io.Flushable
    void flush();

    d j(f fVar);

    d n();

    d o(long j);
}
