package di;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.f0;
import zh.j0;
import zh.k0;
/* loaded from: classes3.dex */
public class j implements f0 {

    /* renamed from: g */
    private final b f9104g = new b();

    /* renamed from: h */
    private final byte[] f9105h;

    /* renamed from: i */
    private boolean f9106i;

    /* renamed from: j */
    private j0 f9107j;

    /* renamed from: k */
    private k0 f9108k;

    /* loaded from: classes3.dex */
    public static class b extends ByteArrayOutputStream {
        private b() {
        }

        synchronized byte[] b(j0 j0Var, byte[] bArr) {
            byte[] bArr2;
            bArr2 = new byte[114];
            j0Var.c(0, bArr, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, bArr2, 0);
            reset();
            return bArr2;
        }

        synchronized boolean e(k0 k0Var, byte[] bArr, byte[] bArr2) {
            if (114 != bArr2.length) {
                reset();
                return false;
            }
            boolean R = zi.b.R(bArr2, 0, k0Var.getEncoded(), 0, bArr, ((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count);
            reset();
            return R;
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized void reset() {
            ak.a.z(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
            ((ByteArrayOutputStream) this).count = 0;
        }
    }

    public j(byte[] bArr) {
        this.f9105h = ak.a.h(bArr);
    }

    @Override // org.bouncycastle.crypto.f0
    public boolean a(byte[] bArr) {
        k0 k0Var;
        if (this.f9106i || (k0Var = this.f9108k) == null) {
            throw new IllegalStateException("Ed448Signer not initialised for verification");
        }
        return this.f9104g.e(k0Var, this.f9105h, bArr);
    }

    @Override // org.bouncycastle.crypto.f0
    public byte[] b() {
        j0 j0Var;
        if (!this.f9106i || (j0Var = this.f9107j) == null) {
            throw new IllegalStateException("Ed448Signer not initialised for signature generation.");
        }
        return this.f9104g.b(j0Var, this.f9105h);
    }

    public void c() {
        this.f9104g.reset();
    }

    @Override // org.bouncycastle.crypto.f0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        this.f9106i = z10;
        if (z10) {
            this.f9107j = (j0) iVar;
            this.f9108k = null;
        } else {
            this.f9107j = null;
            this.f9108k = (k0) iVar;
        }
        c();
    }

    @Override // org.bouncycastle.crypto.f0
    public void update(byte b10) {
        this.f9104g.write(b10);
    }

    @Override // org.bouncycastle.crypto.f0
    public void update(byte[] bArr, int i10, int i11) {
        this.f9104g.write(bArr, i10, i11);
    }
}
