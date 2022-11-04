package com.fasterxml.jackson.core.util;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes.dex */
public class BufferRecycler {
    private static final int[] BYTE_BUFFER_LENGTHS = {8000, 8000, 2000, 2000};
    private static final int[] CHAR_BUFFER_LENGTHS = {4000, 4000, 200, 200};
    protected final AtomicReferenceArray<byte[]> _byteBuffers;
    protected final AtomicReferenceArray<char[]> _charBuffers;

    public BufferRecycler() {
        this(4, 4);
    }

    protected BufferRecycler(int i10, int i11) {
        this._byteBuffers = new AtomicReferenceArray<>(i10);
        this._charBuffers = new AtomicReferenceArray<>(i11);
    }

    public final byte[] allocByteBuffer(int i10) {
        return allocByteBuffer(i10, 0);
    }

    public byte[] allocByteBuffer(int i10, int i11) {
        int byteBufferLength = byteBufferLength(i10);
        if (i11 < byteBufferLength) {
            i11 = byteBufferLength;
        }
        byte[] andSet = this._byteBuffers.getAndSet(i10, null);
        return (andSet == null || andSet.length < i11) ? balloc(i11) : andSet;
    }

    public final char[] allocCharBuffer(int i10) {
        return allocCharBuffer(i10, 0);
    }

    public char[] allocCharBuffer(int i10, int i11) {
        int charBufferLength = charBufferLength(i10);
        if (i11 < charBufferLength) {
            i11 = charBufferLength;
        }
        char[] andSet = this._charBuffers.getAndSet(i10, null);
        return (andSet == null || andSet.length < i11) ? calloc(i11) : andSet;
    }

    protected byte[] balloc(int i10) {
        return new byte[i10];
    }

    protected int byteBufferLength(int i10) {
        return BYTE_BUFFER_LENGTHS[i10];
    }

    protected char[] calloc(int i10) {
        return new char[i10];
    }

    protected int charBufferLength(int i10) {
        return CHAR_BUFFER_LENGTHS[i10];
    }

    public void releaseByteBuffer(int i10, byte[] bArr) {
        this._byteBuffers.set(i10, bArr);
    }

    public void releaseCharBuffer(int i10, char[] cArr) {
        this._charBuffers.set(i10, cArr);
    }
}
