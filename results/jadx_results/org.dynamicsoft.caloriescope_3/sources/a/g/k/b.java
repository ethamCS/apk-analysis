package a.g.k;

import android.util.Log;
import java.io.Writer;
/* loaded from: classes.dex */
public class b extends Writer {

    /* renamed from: b */
    private final String f243b;

    /* renamed from: c */
    private StringBuilder f244c = new StringBuilder(128);

    public b(String str) {
        this.f243b = str;
    }

    private void a() {
        if (this.f244c.length() > 0) {
            Log.d(this.f243b, this.f244c.toString());
            StringBuilder sb = this.f244c;
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
                this.f244c.append(c2);
            }
        }
    }
}
