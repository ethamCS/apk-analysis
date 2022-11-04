package th;

import java.io.FilterInputStream;
import java.io.InputStream;
import org.bouncycastle.crypto.y;
/* loaded from: classes3.dex */
public class e extends FilterInputStream {

    /* renamed from: c */
    protected y f22355c;

    public e(InputStream inputStream, y yVar) {
        super(inputStream);
        this.f22355c = yVar;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read >= 0) {
            this.f22355c.update((byte) read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int read = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (read >= 0) {
            this.f22355c.update(bArr, i10, read);
        }
        return read;
    }
}
