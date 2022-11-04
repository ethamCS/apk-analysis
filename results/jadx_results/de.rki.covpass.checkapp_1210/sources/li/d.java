package li;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;
/* loaded from: classes3.dex */
class d extends OutputStream {

    /* renamed from: c */
    private Signature f16085c;

    public d(Signature signature) {
        this.f16085c = signature;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        try {
            this.f16085c.update((byte) i10);
        } catch (SignatureException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            this.f16085c.update(bArr);
        } catch (SignatureException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        try {
            this.f16085c.update(bArr, i10, i11);
        } catch (SignatureException e10) {
            throw new IOException(e10.getMessage());
        }
    }
}
