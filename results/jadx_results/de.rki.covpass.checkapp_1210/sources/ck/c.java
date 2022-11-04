package ck;

import java.io.OutputStream;
/* loaded from: classes3.dex */
public class c extends OutputStream {

    /* renamed from: c */
    private OutputStream f6644c;

    /* renamed from: d */
    private OutputStream f6645d;

    public c(OutputStream outputStream, OutputStream outputStream2) {
        this.f6644c = outputStream;
        this.f6645d = outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6644c.close();
        this.f6645d.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.f6644c.flush();
        this.f6645d.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f6644c.write(i10);
        this.f6645d.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f6644c.write(bArr);
        this.f6645d.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        this.f6644c.write(bArr, i10, i11);
        this.f6645d.write(bArr, i10, i11);
    }
}
