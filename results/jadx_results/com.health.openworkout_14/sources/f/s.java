package f;

import java.io.Closeable;
import java.io.Flushable;
/* loaded from: classes.dex */
public interface s extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    u d();

    void flush();

    void i(c cVar, long j);
}
