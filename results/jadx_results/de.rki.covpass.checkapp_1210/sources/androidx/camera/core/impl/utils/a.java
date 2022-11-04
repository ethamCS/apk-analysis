package androidx.camera.core.impl.utils;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
class a extends FilterOutputStream {

    /* renamed from: c */
    final OutputStream f2323c;

    /* renamed from: d */
    private ByteOrder f2324d;

    public a(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f2323c = outputStream;
        this.f2324d = byteOrder;
    }

    public void b(ByteOrder byteOrder) {
        this.f2324d = byteOrder;
    }

    public void e(int i10) {
        this.f2323c.write(i10);
    }

    public void f(int i10) {
        OutputStream outputStream;
        int i11;
        ByteOrder byteOrder = this.f2324d;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f2323c.write((i10 >>> 0) & 255);
            this.f2323c.write((i10 >>> 8) & 255);
            this.f2323c.write((i10 >>> 16) & 255);
            outputStream = this.f2323c;
            i11 = i10 >>> 24;
        } else if (byteOrder != ByteOrder.BIG_ENDIAN) {
            return;
        } else {
            this.f2323c.write((i10 >>> 24) & 255);
            this.f2323c.write((i10 >>> 16) & 255);
            this.f2323c.write((i10 >>> 8) & 255);
            outputStream = this.f2323c;
            i11 = i10 >>> 0;
        }
        outputStream.write(i11 & 255);
    }

    public void h(short s10) {
        OutputStream outputStream;
        int i10;
        ByteOrder byteOrder = this.f2324d;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f2323c.write((s10 >>> 0) & 255);
            outputStream = this.f2323c;
            i10 = s10 >>> 8;
        } else if (byteOrder != ByteOrder.BIG_ENDIAN) {
            return;
        } else {
            this.f2323c.write((s10 >>> 8) & 255);
            outputStream = this.f2323c;
            i10 = s10 >>> 0;
        }
        outputStream.write(i10 & 255);
    }

    public void i(long j10) {
        f((int) j10);
    }

    public void j(int i10) {
        h((short) i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        this.f2323c.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        this.f2323c.write(bArr, i10, i11);
    }
}
