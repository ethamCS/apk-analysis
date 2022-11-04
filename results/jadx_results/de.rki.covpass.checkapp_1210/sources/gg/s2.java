package gg;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
class s2 extends x2 {

    /* renamed from: y */
    private static final byte[] f10889y = new byte[0];

    /* renamed from: q */
    private final int f10890q;

    /* renamed from: x */
    private int f10891x;

    public s2(InputStream inputStream, int i10, int i11) {
        super(inputStream, i11);
        if (i10 <= 0) {
            if (i10 < 0) {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
            e(true);
        }
        this.f10890q = i10;
        this.f10891x = i10;
    }

    public int f() {
        return this.f10891x;
    }

    public void h(byte[] bArr) {
        int i10 = this.f10891x;
        if (i10 == bArr.length) {
            if (i10 == 0) {
                return;
            }
            int b10 = b();
            int i11 = this.f10891x;
            if (i11 >= b10) {
                throw new IOException("corrupted stream - out of bounds length found: " + this.f10891x + " >= " + b10);
            }
            int g10 = i11 - ck.b.g(this.f10917c, bArr, 0, bArr.length);
            this.f10891x = g10;
            if (g10 == 0) {
                e(true);
                return;
            }
            throw new EOFException("DEF length " + this.f10890q + " object truncated by " + this.f10891x);
        }
        throw new IllegalArgumentException("buffer length not right for data");
    }

    public byte[] i() {
        if (this.f10891x == 0) {
            return f10889y;
        }
        int b10 = b();
        int i10 = this.f10891x;
        if (i10 >= b10) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.f10891x + " >= " + b10);
        }
        byte[] bArr = new byte[i10];
        int g10 = i10 - ck.b.g(this.f10917c, bArr, 0, i10);
        this.f10891x = g10;
        if (g10 == 0) {
            e(true);
            return bArr;
        }
        throw new EOFException("DEF length " + this.f10890q + " object truncated by " + this.f10891x);
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f10891x == 0) {
            return -1;
        }
        int read = this.f10917c.read();
        if (read >= 0) {
            int i10 = this.f10891x - 1;
            this.f10891x = i10;
            if (i10 == 0) {
                e(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f10890q + " object truncated by " + this.f10891x);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f10891x;
        if (i12 == 0) {
            return -1;
        }
        int read = this.f10917c.read(bArr, i10, Math.min(i11, i12));
        if (read >= 0) {
            int i13 = this.f10891x - read;
            this.f10891x = i13;
            if (i13 == 0) {
                e(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f10890q + " object truncated by " + this.f10891x);
    }
}
