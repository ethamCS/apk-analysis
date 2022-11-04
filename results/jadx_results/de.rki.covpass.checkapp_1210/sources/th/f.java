package th;

import java.io.OutputStream;
import org.bouncycastle.crypto.y;
/* loaded from: classes3.dex */
public class f extends OutputStream {

    /* renamed from: c */
    protected y f22356c;

    public f(y yVar) {
        this.f22356c = yVar;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f22356c.update((byte) i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        this.f22356c.update(bArr, i10, i11);
    }
}
