package b.c.a;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
final class n extends InputStream {

    /* renamed from: b */
    private final InputStream f1306b;

    /* renamed from: c */
    private long f1307c;
    private long d;
    private long e;
    private long f;

    public n(InputStream inputStream) {
        this(inputStream, 4096);
    }

    public n(InputStream inputStream, int i) {
        this.f = -1L;
        this.f1306b = !inputStream.markSupported() ? new BufferedInputStream(inputStream, i) : inputStream;
    }

    private void a(long j, long j2) {
        while (j < j2) {
            long skip = this.f1306b.skip(j2 - j);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                }
                skip = 1;
            }
            j += skip;
        }
    }

    private void b(long j) {
        try {
            if (this.d >= this.f1307c || this.f1307c > this.e) {
                this.d = this.f1307c;
                this.f1306b.mark((int) (j - this.f1307c));
            } else {
                this.f1306b.reset();
                this.f1306b.mark((int) (j - this.d));
                a(this.d, this.f1307c);
            }
            this.e = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    public long a(int i) {
        long j = this.f1307c + i;
        if (this.e < j) {
            b(j);
        }
        return this.f1307c;
    }

    public void a(long j) {
        if (this.f1307c > this.e || j < this.d) {
            throw new IOException("Cannot reset");
        }
        this.f1306b.reset();
        a(this.d, j);
        this.f1307c = j;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f1306b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1306b.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f = a(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f1306b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.f1306b.read();
        if (read != -1) {
            this.f1307c++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        int read = this.f1306b.read(bArr);
        if (read != -1) {
            this.f1307c += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = this.f1306b.read(bArr, i, i2);
        if (read != -1) {
            this.f1307c += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() {
        a(this.f);
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        long skip = this.f1306b.skip(j);
        this.f1307c += skip;
        return skip;
    }
}
