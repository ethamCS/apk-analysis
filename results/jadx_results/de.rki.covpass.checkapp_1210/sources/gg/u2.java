package gg;

import java.io.EOFException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class u2 extends x2 {

    /* renamed from: q */
    private int f10895q;

    /* renamed from: x */
    private int f10896x;

    /* renamed from: y */
    private boolean f10897y = false;
    private boolean U3 = true;

    public u2(InputStream inputStream, int i10) {
        super(inputStream, i10);
        this.f10895q = inputStream.read();
        int read = inputStream.read();
        this.f10896x = read;
        if (read >= 0) {
            f();
            return;
        }
        throw new EOFException();
    }

    private boolean f() {
        if (!this.f10897y && this.U3 && this.f10895q == 0 && this.f10896x == 0) {
            this.f10897y = true;
            e(true);
        }
        return this.f10897y;
    }

    public void h(boolean z10) {
        this.U3 = z10;
        f();
    }

    @Override // java.io.InputStream
    public int read() {
        if (f()) {
            return -1;
        }
        int read = this.f10917c.read();
        if (read < 0) {
            throw new EOFException();
        }
        int i10 = this.f10895q;
        this.f10895q = this.f10896x;
        this.f10896x = read;
        return i10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (this.U3 || i11 < 3) {
            return super.read(bArr, i10, i11);
        }
        if (this.f10897y) {
            return -1;
        }
        int read = this.f10917c.read(bArr, i10 + 2, i11 - 2);
        if (read < 0) {
            throw new EOFException();
        }
        bArr[i10] = (byte) this.f10895q;
        bArr[i10 + 1] = (byte) this.f10896x;
        this.f10895q = this.f10917c.read();
        int read2 = this.f10917c.read();
        this.f10896x = read2;
        if (read2 < 0) {
            throw new EOFException();
        }
        return read + 2;
    }
}
