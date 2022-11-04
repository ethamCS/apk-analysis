package org.apache.james.mime4j.storage;

import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public abstract class StorageOutputStream extends OutputStream {
    private boolean closed;
    private byte[] singleByte;
    private boolean usedUp;

    protected abstract Storage toStorage0() throws IOException;

    protected abstract void write0(byte[] bArr, int i, int i2) throws IOException;

    public final Storage toStorage() throws IOException {
        if (this.usedUp) {
            throw new IllegalStateException("toStorage may be invoked only once");
        }
        if (!this.closed) {
            close();
        }
        this.usedUp = true;
        return toStorage0();
    }

    @Override // java.io.OutputStream
    public final void write(int b) throws IOException {
        if (this.closed) {
            throw new IOException("StorageOutputStream has been closed");
        }
        if (this.singleByte == null) {
            this.singleByte = new byte[1];
        }
        this.singleByte[0] = (byte) b;
        write0(this.singleByte, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer) throws IOException {
        if (this.closed) {
            throw new IOException("StorageOutputStream has been closed");
        }
        if (buffer == null) {
            throw new NullPointerException();
        }
        if (buffer.length != 0) {
            write0(buffer, 0, buffer.length);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer, int offset, int length) throws IOException {
        if (this.closed) {
            throw new IOException("StorageOutputStream has been closed");
        }
        if (buffer == null) {
            throw new NullPointerException();
        }
        if (offset < 0 || length < 0 || offset + length > buffer.length) {
            throw new IndexOutOfBoundsException();
        }
        if (length != 0) {
            write0(buffer, offset, length);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.closed = true;
    }
}
