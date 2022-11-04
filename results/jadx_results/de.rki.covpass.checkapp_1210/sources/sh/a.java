package sh;

import org.conscrypt.PSKKeyManager;
import zh.a1;
import zh.z0;
/* loaded from: classes3.dex */
public class a implements org.bouncycastle.crypto.p {

    /* renamed from: a */
    private int f21709a;

    /* renamed from: b */
    private org.bouncycastle.crypto.r f21710b;

    /* renamed from: c */
    private byte[] f21711c;

    /* renamed from: d */
    private byte[] f21712d;

    public a(int i10, org.bouncycastle.crypto.r rVar) {
        this.f21709a = i10;
        this.f21710b = rVar;
    }

    @Override // org.bouncycastle.crypto.p
    public int generateBytes(byte[] bArr, int i10, int i11) {
        int i12 = i11;
        int i13 = i10;
        if (bArr.length - i12 >= i13) {
            long j10 = i12;
            int digestSize = this.f21710b.getDigestSize();
            if (j10 > 8589934591L) {
                throw new IllegalArgumentException("Output length too large");
            }
            long j11 = digestSize;
            int i14 = (int) (((j10 + j11) - 1) / j11);
            byte[] bArr2 = new byte[this.f21710b.getDigestSize()];
            byte[] bArr3 = new byte[4];
            ak.l.f(this.f21709a, bArr3, 0);
            int i15 = this.f21709a & (-256);
            for (int i16 = 0; i16 < i14; i16++) {
                org.bouncycastle.crypto.r rVar = this.f21710b;
                byte[] bArr4 = this.f21711c;
                rVar.update(bArr4, 0, bArr4.length);
                this.f21710b.update(bArr3, 0, 4);
                byte[] bArr5 = this.f21712d;
                if (bArr5 != null) {
                    this.f21710b.update(bArr5, 0, bArr5.length);
                }
                this.f21710b.doFinal(bArr2, 0);
                if (i12 > digestSize) {
                    System.arraycopy(bArr2, 0, bArr, i13, digestSize);
                    i13 += digestSize;
                    i12 -= digestSize;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i13, i12);
                }
                byte b10 = (byte) (bArr3[3] + 1);
                bArr3[3] = b10;
                if (b10 == 0) {
                    i15 += PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    ak.l.f(i15, bArr3, 0);
                }
            }
            this.f21710b.reset();
            return (int) j10;
        }
        throw new org.bouncycastle.crypto.a0("output buffer too small");
    }

    @Override // org.bouncycastle.crypto.p
    public void init(org.bouncycastle.crypto.q qVar) {
        if (qVar instanceof a1) {
            a1 a1Var = (a1) qVar;
            this.f21711c = a1Var.b();
            this.f21712d = a1Var.a();
        } else if (!(qVar instanceof z0)) {
            throw new IllegalArgumentException("KDF parameters required for generator");
        } else {
            this.f21711c = ((z0) qVar).a();
            this.f21712d = null;
        }
    }
}
