package gg;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class h2 implements d {

    /* renamed from: c */
    private final s2 f10828c;

    /* renamed from: d */
    private int f10829d = 0;

    public h2(s2 s2Var) {
        this.f10828c = s2Var;
    }

    private InputStream c(boolean z10) {
        int f10 = this.f10828c.f();
        if (f10 >= 1) {
            int read = this.f10828c.read();
            this.f10829d = read;
            if (read > 0) {
                if (f10 < 2) {
                    throw new IllegalStateException("zero length data with non-zero pad bits");
                }
                if (read > 7) {
                    throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
                }
                if (z10) {
                    throw new IOException("expected octet-aligned bitstring, but found padBits: " + this.f10829d);
                }
            }
            return this.f10828c;
        }
        throw new IllegalStateException("content octets cannot be empty");
    }

    @Override // gg.g
    public a0 b() {
        try {
            return e();
        } catch (IOException e10) {
            throw new z("IOException converting stream to byte array: " + e10.getMessage(), e10);
        }
    }

    @Override // gg.d
    public int d() {
        return this.f10829d;
    }

    @Override // gg.t2
    public a0 e() {
        return c.C(this.f10828c.i());
    }

    @Override // gg.d
    public InputStream f() {
        return c(false);
    }
}
