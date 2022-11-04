package com.fasterxml.jackson.core.util;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: classes.dex */
public final class ByteArrayBuilder extends OutputStream {
    public static final byte[] NO_BYTES = new byte[0];
    private final BufferRecycler _bufferRecycler;
    private byte[] _currBlock;
    private int _currBlockPtr;
    private final LinkedList<byte[]> _pastBlocks;
    private int _pastLen;

    public ByteArrayBuilder() {
        this((BufferRecycler) null);
    }

    public ByteArrayBuilder(int i10) {
        this(null, i10);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler) {
        this(bufferRecycler, 500);
    }

    public ByteArrayBuilder(BufferRecycler bufferRecycler, int i10) {
        this._pastBlocks = new LinkedList<>();
        this._bufferRecycler = bufferRecycler;
        this._currBlock = bufferRecycler == null ? new byte[i10 > 131072 ? 131072 : i10] : bufferRecycler.allocByteBuffer(2);
    }

    private void _allocMore() {
        int length = this._pastLen + this._currBlock.length;
        if (length >= 0) {
            this._pastLen = length;
            int max = Math.max(length >> 1, 1000);
            if (max > 131072) {
                max = 131072;
            }
            this._pastBlocks.add(this._currBlock);
            this._currBlock = new byte[max];
            this._currBlockPtr = 0;
            return;
        }
        throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
    }

    public void append(int i10) {
        if (this._currBlockPtr >= this._currBlock.length) {
            _allocMore();
        }
        byte[] bArr = this._currBlock;
        int i11 = this._currBlockPtr;
        this._currBlockPtr = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    public void appendThreeBytes(int i10) {
        int i11 = this._currBlockPtr;
        int i12 = i11 + 2;
        byte[] bArr = this._currBlock;
        if (i12 >= bArr.length) {
            append(i10 >> 16);
            append(i10 >> 8);
            append(i10);
            return;
        }
        int i13 = i11 + 1;
        this._currBlockPtr = i13;
        bArr[i11] = (byte) (i10 >> 16);
        int i14 = i13 + 1;
        this._currBlockPtr = i14;
        bArr[i13] = (byte) (i10 >> 8);
        this._currBlockPtr = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    public void appendTwoBytes(int i10) {
        int i11 = this._currBlockPtr;
        int i12 = i11 + 1;
        byte[] bArr = this._currBlock;
        if (i12 >= bArr.length) {
            append(i10 >> 8);
            append(i10);
            return;
        }
        int i13 = i11 + 1;
        this._currBlockPtr = i13;
        bArr[i11] = (byte) (i10 >> 8);
        this._currBlockPtr = i13 + 1;
        bArr[i13] = (byte) i10;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    public void reset() {
        this._pastLen = 0;
        this._currBlockPtr = 0;
        if (!this._pastBlocks.isEmpty()) {
            this._pastBlocks.clear();
        }
    }

    public byte[] toByteArray() {
        int i10 = this._pastLen + this._currBlockPtr;
        if (i10 == 0) {
            return NO_BYTES;
        }
        byte[] bArr = new byte[i10];
        Iterator<byte[]> it = this._pastBlocks.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            byte[] next = it.next();
            int length = next.length;
            System.arraycopy(next, 0, bArr, i11, length);
            i11 += length;
        }
        System.arraycopy(this._currBlock, 0, bArr, i11, this._currBlockPtr);
        int i12 = i11 + this._currBlockPtr;
        if (i12 == i10) {
            if (!this._pastBlocks.isEmpty()) {
                reset();
            }
            return bArr;
        }
        throw new RuntimeException("Internal error: total len assumed to be " + i10 + ", copied " + i12 + " bytes");
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        append(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        while (true) {
            int min = Math.min(this._currBlock.length - this._currBlockPtr, i11);
            if (min > 0) {
                System.arraycopy(bArr, i10, this._currBlock, this._currBlockPtr, min);
                i10 += min;
                this._currBlockPtr += min;
                i11 -= min;
            }
            if (i11 <= 0) {
                return;
            }
            _allocMore();
        }
    }
}
