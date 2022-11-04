package org.conscrypt;

import java.io.FilterInputStream;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class OpenSSLBIOInputStream extends FilterInputStream {
    private long ctx;

    public OpenSSLBIOInputStream(InputStream inputStream, boolean z10) {
        super(inputStream);
        this.ctx = NativeCrypto.create_BIO_InputStream(this, z10);
    }

    public long getBioContext() {
        return this.ctx;
    }

    int gets(byte[] bArr) {
        int read;
        int i10 = 0;
        if (bArr != null && bArr.length != 0) {
            while (i10 < bArr.length && (read = read()) != -1) {
                if (read != 10) {
                    bArr[i10] = (byte) read;
                    i10++;
                } else if (i10 != 0) {
                    break;
                }
            }
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException("Invalid bounds");
        }
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        do {
            int read = super.read(bArr, i10 + i12, (i11 - i12) - i10);
            if (read == -1) {
                break;
            }
            i12 += read;
        } while (i10 + i12 < i11);
        if (i12 != 0) {
            return i12;
        }
        return -1;
    }

    public void release() {
        NativeCrypto.BIO_free_all(this.ctx);
    }
}
