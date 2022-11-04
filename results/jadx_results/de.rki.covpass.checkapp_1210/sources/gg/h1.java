package gg;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class h1 extends InputStream {

    /* renamed from: c */
    private final f0 f10825c;

    /* renamed from: d */
    private boolean f10826d = true;

    /* renamed from: q */
    private InputStream f10827q;

    public h1(f0 f0Var) {
        this.f10825c = f0Var;
    }

    private x b() {
        g g10 = this.f10825c.g();
        if (g10 == null) {
            return null;
        }
        if (g10 instanceof x) {
            return (x) g10;
        }
        throw new IOException("unknown object encountered: " + g10.getClass());
    }

    @Override // java.io.InputStream
    public int read() {
        x b10;
        if (this.f10827q == null) {
            if (!this.f10826d || (b10 = b()) == null) {
                return -1;
            }
            this.f10826d = false;
            this.f10827q = b10.a();
        }
        while (true) {
            int read = this.f10827q.read();
            if (read >= 0) {
                return read;
            }
            x b11 = b();
            if (b11 == null) {
                this.f10827q = null;
                return -1;
            }
            this.f10827q = b11.a();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        x b10;
        int i12 = 0;
        if (this.f10827q == null) {
            if (!this.f10826d || (b10 = b()) == null) {
                return -1;
            }
            this.f10826d = false;
            this.f10827q = b10.a();
        }
        while (true) {
            int read = this.f10827q.read(bArr, i10 + i12, i11 - i12);
            if (read >= 0) {
                i12 += read;
                if (i12 == i11) {
                    return i12;
                }
            } else {
                x b11 = b();
                if (b11 == null) {
                    this.f10827q = null;
                    if (i12 >= 1) {
                        return i12;
                    }
                    return -1;
                }
                this.f10827q = b11.a();
            }
        }
    }
}
