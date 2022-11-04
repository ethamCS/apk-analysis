package com.fasterxml.jackson.databind.util;
/* loaded from: classes.dex */
public abstract class PrimitiveArrayBuilder<T> {
    protected Node<T> _bufferHead;
    protected Node<T> _bufferTail;
    protected int _bufferedEntryCount;
    protected T _freeBuffer;

    /* loaded from: classes.dex */
    public static final class Node<T> {
        final T _data;
        final int _dataLength;
        Node<T> _next;

        public Node(T t10, int i10) {
            this._data = t10;
            this._dataLength = i10;
        }

        public int copyData(T t10, int i10) {
            System.arraycopy(this._data, 0, t10, i10, this._dataLength);
            return i10 + this._dataLength;
        }

        public T getData() {
            return this._data;
        }

        public void linkNext(Node<T> node) {
            if (this._next == null) {
                this._next = node;
                return;
            }
            throw new IllegalStateException();
        }

        public Node<T> next() {
            return this._next;
        }
    }

    protected abstract T _constructArray(int i10);

    protected void _reset() {
        Node<T> node = this._bufferTail;
        if (node != null) {
            this._freeBuffer = node.getData();
        }
        this._bufferTail = null;
        this._bufferHead = null;
        this._bufferedEntryCount = 0;
    }

    public final T appendCompletedChunk(T t10, int i10) {
        Node<T> node = new Node<>(t10, i10);
        if (this._bufferHead == null) {
            this._bufferTail = node;
            this._bufferHead = node;
        } else {
            this._bufferTail.linkNext(node);
            this._bufferTail = node;
        }
        this._bufferedEntryCount += i10;
        return _constructArray(i10 < 16384 ? i10 + i10 : i10 + (i10 >> 2));
    }

    public int bufferedSize() {
        return this._bufferedEntryCount;
    }

    public T completeAndClearBuffer(T t10, int i10) {
        int i11 = this._bufferedEntryCount + i10;
        T _constructArray = _constructArray(i11);
        int i12 = 0;
        for (Node<T> node = this._bufferHead; node != null; node = node.next()) {
            i12 = node.copyData(_constructArray, i12);
        }
        System.arraycopy(t10, 0, _constructArray, i12, i10);
        int i13 = i12 + i10;
        if (i13 == i11) {
            return _constructArray;
        }
        throw new IllegalStateException("Should have gotten " + i11 + " entries, got " + i13);
    }

    public T resetAndStart() {
        _reset();
        T t10 = this._freeBuffer;
        return t10 == null ? _constructArray(12) : t10;
    }
}
