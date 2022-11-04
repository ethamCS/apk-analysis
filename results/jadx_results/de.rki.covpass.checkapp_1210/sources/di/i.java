package di;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.f0;
import zh.g0;
import zh.h0;
/* loaded from: classes3.dex */
public class i implements f0 {

    /* renamed from: g */
    private final b f9100g = new b();

    /* renamed from: h */
    private boolean f9101h;

    /* renamed from: i */
    private g0 f9102i;

    /* renamed from: j */
    private h0 f9103j;

    /* loaded from: classes3.dex */
    public static class b extends ByteArrayOutputStream {
        private b() {
        }

        synchronized byte[] b(g0 g0Var) {
            byte[] bArr;
            bArr = new byte[64];
            g0Var.c(0, null, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, bArr, 0);
            reset();
            return bArr;
        }

        synchronized boolean e(h0 h0Var, byte[] bArr) {
            if (64 != bArr.length) {
                reset();
                return false;
            }
            boolean W = zi.a.W(bArr, 0, h0Var.getEncoded(), 0, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            reset();
            return W;
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized void reset() {
            ak.a.z(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
            ((ByteArrayOutputStream) this).count = 0;
        }
    }

    @Override // org.bouncycastle.crypto.f0
    public boolean a(byte[] bArr) {
        h0 h0Var;
        if (this.f9101h || (h0Var = this.f9103j) == null) {
            throw new IllegalStateException("Ed25519Signer not initialised for verification");
        }
        return this.f9100g.e(h0Var, bArr);
    }

    @Override // org.bouncycastle.crypto.f0
    public byte[] b() {
        g0 g0Var;
        if (!this.f9101h || (g0Var = this.f9102i) == null) {
            throw new IllegalStateException("Ed25519Signer not initialised for signature generation.");
        }
        return this.f9100g.b(g0Var);
    }

    public void c() {
        this.f9100g.reset();
    }

    @Override // org.bouncycastle.crypto.f0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        this.f9101h = z10;
        if (z10) {
            this.f9102i = (g0) iVar;
            this.f9103j = null;
        } else {
            this.f9102i = null;
            this.f9103j = (h0) iVar;
        }
        c();
    }

    @Override // org.bouncycastle.crypto.f0
    public void update(byte b10) {
        this.f9100g.write(b10);
    }

    @Override // org.bouncycastle.crypto.f0
    public void update(byte[] bArr, int i10, int i11) {
        this.f9100g.write(bArr, i10, i11);
    }
}
