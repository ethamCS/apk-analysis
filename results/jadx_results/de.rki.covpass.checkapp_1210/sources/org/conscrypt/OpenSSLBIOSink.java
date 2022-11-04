package org.conscrypt;

import java.io.ByteArrayOutputStream;
/* loaded from: classes3.dex */
final class OpenSSLBIOSink {
    private final ByteArrayOutputStream buffer;
    private final long ctx;
    private int position;

    private OpenSSLBIOSink(ByteArrayOutputStream byteArrayOutputStream) {
        this.ctx = NativeCrypto.create_BIO_OutputStream(byteArrayOutputStream);
        this.buffer = byteArrayOutputStream;
    }

    static OpenSSLBIOSink create() {
        return new OpenSSLBIOSink(new ByteArrayOutputStream());
    }

    int available() {
        return this.buffer.size() - this.position;
    }

    protected void finalize() {
        try {
            NativeCrypto.BIO_free_all(this.ctx);
        } finally {
            super.finalize();
        }
    }

    long getContext() {
        return this.ctx;
    }

    int position() {
        return this.position;
    }

    void reset() {
        this.buffer.reset();
        this.position = 0;
    }

    long skip(long j10) {
        int min = Math.min(available(), (int) j10);
        int i10 = this.position + min;
        this.position = i10;
        if (i10 == this.buffer.size()) {
            reset();
        }
        return min;
    }

    byte[] toByteArray() {
        return this.buffer.toByteArray();
    }
}
