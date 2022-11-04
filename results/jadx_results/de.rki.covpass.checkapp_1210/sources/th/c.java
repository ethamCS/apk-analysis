package th;

import java.io.OutputStream;
import org.bouncycastle.crypto.r;
/* loaded from: classes3.dex */
public class c extends OutputStream {

    /* renamed from: c */
    protected r f22354c;

    public c(r rVar) {
        this.f22354c = rVar;
    }

    public byte[] b() {
        byte[] bArr = new byte[this.f22354c.getDigestSize()];
        this.f22354c.doFinal(bArr, 0);
        return bArr;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f22354c.update((byte) i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        this.f22354c.update(bArr, i10, i11);
    }
}
