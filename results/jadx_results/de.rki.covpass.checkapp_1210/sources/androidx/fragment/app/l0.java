package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;
/* loaded from: classes.dex */
final class l0 extends Writer {

    /* renamed from: c */
    private final String f4143c;

    /* renamed from: d */
    private StringBuilder f4144d = new StringBuilder(128);

    public l0(String str) {
        this.f4143c = str;
    }

    private void b() {
        if (this.f4144d.length() > 0) {
            Log.d(this.f4143c, this.f4144d.toString());
            StringBuilder sb2 = this.f4144d;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        b();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                b();
            } else {
                this.f4144d.append(c10);
            }
        }
    }
}
