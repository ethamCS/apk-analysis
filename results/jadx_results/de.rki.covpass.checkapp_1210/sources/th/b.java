package th;

import java.io.FilterInputStream;
import java.io.InputStream;
import org.bouncycastle.crypto.r;
/* loaded from: classes3.dex */
public class b extends FilterInputStream {

    /* renamed from: c */
    protected r f22353c;

    public b(InputStream inputStream, r rVar) {
        super(inputStream);
        this.f22353c = rVar;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read >= 0) {
            this.f22353c.update((byte) read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int read = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (read > 0) {
            this.f22353c.update(bArr, i10, read);
        }
        return read;
    }
}
