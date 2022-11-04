package gg;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class g1 extends InputStream {
    private InputStream U3;

    /* renamed from: c */
    private final f0 f10814c;

    /* renamed from: d */
    private final boolean f10815d;

    /* renamed from: q */
    private boolean f10816q = true;

    /* renamed from: x */
    private int f10817x = 0;

    /* renamed from: y */
    private d f10818y;

    public g1(f0 f0Var, boolean z10) {
        this.f10814c = f0Var;
        this.f10815d = z10;
    }

    private d b() {
        g g10 = this.f10814c.g();
        if (g10 == null) {
            if (!this.f10815d || this.f10817x == 0) {
                return null;
            }
            throw new IOException("expected octet-aligned bitstring, but found padBits: " + this.f10817x);
        } else if (g10 instanceof d) {
            if (this.f10817x != 0) {
                throw new IOException("only the last nested bitstring can have padding");
            }
            return (d) g10;
        } else {
            throw new IOException("unknown object encountered: " + g10.getClass());
        }
    }

    public int e() {
        return this.f10817x;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.U3 == null) {
            if (!this.f10816q) {
                return -1;
            }
            d b10 = b();
            this.f10818y = b10;
            if (b10 == null) {
                return -1;
            }
            this.f10816q = false;
            this.U3 = b10.f();
        }
        while (true) {
            int read = this.U3.read();
            if (read >= 0) {
                return read;
            }
            this.f10817x = this.f10818y.d();
            d b11 = b();
            this.f10818y = b11;
            if (b11 == null) {
                this.U3 = null;
                return -1;
            }
            this.U3 = b11.f();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        if (this.U3 == null) {
            if (!this.f10816q) {
                return -1;
            }
            d b10 = b();
            this.f10818y = b10;
            if (b10 == null) {
                return -1;
            }
            this.f10816q = false;
            this.U3 = b10.f();
        }
        while (true) {
            int read = this.U3.read(bArr, i10 + i12, i11 - i12);
            if (read >= 0) {
                i12 += read;
                if (i12 == i11) {
                    return i12;
                }
            } else {
                this.f10817x = this.f10818y.d();
                d b11 = b();
                this.f10818y = b11;
                if (b11 == null) {
                    this.U3 = null;
                    if (i12 >= 1) {
                        return i12;
                    }
                    return -1;
                }
                this.U3 = b11.f();
            }
        }
    }
}
