package li;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
/* loaded from: classes3.dex */
public class a extends FilterInputStream {
    private int U3;

    /* renamed from: c */
    private final Cipher f16078c;

    /* renamed from: d */
    private final byte[] f16079d = new byte[512];

    /* renamed from: q */
    private boolean f16080q = false;

    /* renamed from: x */
    private byte[] f16081x;

    /* renamed from: y */
    private int f16082y;

    public a(InputStream inputStream, Cipher cipher) {
        super(inputStream);
        this.f16078c = cipher;
    }

    private byte[] b() {
        try {
            if (this.f16080q) {
                return null;
            }
            this.f16080q = true;
            return this.f16078c.doFinal();
        } catch (GeneralSecurityException e10) {
            throw new th.d("Error finalising cipher", e10);
        }
    }

    private int e() {
        if (this.f16080q) {
            return -1;
        }
        this.U3 = 0;
        this.f16082y = 0;
        while (true) {
            int i10 = this.f16082y;
            if (i10 != 0) {
                return i10;
            }
            int read = ((FilterInputStream) this).in.read(this.f16079d);
            if (read == -1) {
                byte[] b10 = b();
                this.f16081x = b10;
                if (b10 == null || b10.length == 0) {
                    return -1;
                }
                int length = b10.length;
                this.f16082y = length;
                return length;
            }
            byte[] update = this.f16078c.update(this.f16079d, 0, read);
            this.f16081x = update;
            if (update != null) {
                this.f16082y = update.length;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.f16082y - this.U3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            ((FilterInputStream) this).in.close();
            this.U3 = 0;
            this.f16082y = 0;
        } finally {
            if (!this.f16080q) {
                b();
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.U3 < this.f16082y || e() >= 0) {
            byte[] bArr = this.f16081x;
            int i10 = this.U3;
            this.U3 = i10 + 1;
            return bArr[i10] & 255;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (this.U3 < this.f16082y || e() >= 0) {
            int min = Math.min(i11, available());
            System.arraycopy(this.f16081x, this.U3, bArr, i10, min);
            this.U3 += min;
            return min;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        int min = (int) Math.min(j10, available());
        this.U3 += min;
        return min;
    }
}
