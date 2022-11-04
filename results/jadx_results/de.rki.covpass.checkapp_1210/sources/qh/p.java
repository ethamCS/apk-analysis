package qh;
/* loaded from: classes3.dex */
public class p extends o {

    /* renamed from: o */
    private int[] f20094o = null;

    /* renamed from: p */
    private int[] f20095p = null;

    /* renamed from: q */
    private int[] f20096q = null;

    /* renamed from: r */
    private boolean f20097r;

    @Override // qh.o, org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr = this.f20094o;
        if (iArr != null) {
            if (i10 + 8 > bArr.length) {
                throw new org.bouncycastle.crypto.o("input buffer too short");
            }
            if (i11 + 8 > bArr2.length) {
                throw new org.bouncycastle.crypto.a0("output buffer too short");
            }
            byte[] bArr3 = new byte[8];
            if (this.f20097r) {
                c(iArr, bArr, i10, bArr3, 0);
                c(this.f20095p, bArr3, 0, bArr3, 0);
                c(this.f20096q, bArr3, 0, bArr2, i11);
            } else {
                c(this.f20096q, bArr, i10, bArr3, 0);
                c(this.f20095p, bArr3, 0, bArr3, 0);
                c(this.f20094o, bArr3, 0, bArr2, i11);
            }
            return 8;
        }
        throw new IllegalStateException("DESede engine not initialised");
    }

    @Override // qh.o, org.bouncycastle.crypto.e
    public int b() {
        return 8;
    }

    @Override // qh.o, org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "DESede";
    }

    @Override // qh.o, org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (!(iVar instanceof zh.b1)) {
            throw new IllegalArgumentException("invalid parameter passed to DESede init - " + iVar.getClass().getName());
        }
        byte[] a10 = ((zh.b1) iVar).a();
        if (a10.length != 24 && a10.length != 16) {
            throw new IllegalArgumentException("key size must be 16 or 24 bytes.");
        }
        this.f20097r = z10;
        byte[] bArr = new byte[8];
        System.arraycopy(a10, 0, bArr, 0, 8);
        this.f20094o = d(z10, bArr);
        byte[] bArr2 = new byte[8];
        System.arraycopy(a10, 8, bArr2, 0, 8);
        this.f20095p = d(!z10, bArr2);
        if (a10.length != 24) {
            this.f20096q = this.f20094o;
            return;
        }
        byte[] bArr3 = new byte[8];
        System.arraycopy(a10, 16, bArr3, 0, 8);
        this.f20096q = d(z10, bArr3);
    }

    @Override // qh.o, org.bouncycastle.crypto.e
    public void reset() {
    }
}
