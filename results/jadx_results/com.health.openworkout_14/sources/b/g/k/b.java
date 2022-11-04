package b.g.k;

import android.util.Log;
import java.io.Writer;
@Deprecated
/* loaded from: classes.dex */
public class b extends Writer {

    /* renamed from: b */
    private final String f2491b;

    /* renamed from: c */
    private StringBuilder f2492c = new StringBuilder(128);

    public b(String str) {
        this.f2491b = str;
    }

    private void a() {
        if (this.f2492c.length() > 0) {
            Log.d(this.f2491b, this.f2492c.toString());
            StringBuilder sb = this.f2492c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                a();
            } else {
                this.f2492c.append(c2);
            }
        }
    }
}
