package vh;

import org.bouncycastle.crypto.a0;
import org.bouncycastle.crypto.g0;
import zh.f1;
/* loaded from: classes3.dex */
public class s extends g0 {

    /* renamed from: b */
    private byte[] f24305b;

    /* renamed from: c */
    private byte[] f24306c;

    /* renamed from: d */
    private byte[] f24307d;

    /* renamed from: e */
    private int f24308e;

    /* renamed from: f */
    private boolean f24309f;

    /* renamed from: g */
    private org.bouncycastle.crypto.e f24310g;

    public s(org.bouncycastle.crypto.e eVar) {
        super(eVar);
        this.f24310g = eVar;
        this.f24305b = new byte[eVar.b()];
        this.f24306c = new byte[eVar.b()];
        this.f24307d = new byte[eVar.b()];
    }

    private void e() {
    }

    private void f(int i10) {
        while (true) {
            byte[] bArr = this.f24306c;
            if (i10 < bArr.length) {
                int i11 = i10 + 1;
                byte b10 = (byte) (bArr[i10] + 1);
                bArr[i10] = b10;
                if (b10 != 0) {
                    return;
                }
                i10 = i11;
            } else {
                return;
            }
        }
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (bArr.length - i10 >= b()) {
            if (bArr2.length - i11 < b()) {
                throw new a0("output buffer too short");
            }
            processBytes(bArr, i10, b(), bArr2, i11);
            return b();
        }
        throw new org.bouncycastle.crypto.o("input buffer too short");
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return this.f24310g.b();
    }

    @Override // org.bouncycastle.crypto.g0
    protected byte c(byte b10) {
        int i10 = this.f24308e;
        if (i10 == 0) {
            f(0);
            e();
            this.f24310g.a(this.f24306c, 0, this.f24307d, 0);
            byte[] bArr = this.f24307d;
            int i11 = this.f24308e;
            this.f24308e = i11 + 1;
            return (byte) (b10 ^ bArr[i11]);
        }
        byte[] bArr2 = this.f24307d;
        int i12 = i10 + 1;
        this.f24308e = i12;
        byte b11 = (byte) (b10 ^ bArr2[i10]);
        if (i12 == this.f24306c.length) {
            this.f24308e = 0;
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.f24310g.getAlgorithmName() + "/KCTR";
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        this.f24309f = true;
        if (iVar instanceof f1) {
            f1 f1Var = (f1) iVar;
            byte[] a10 = f1Var.a();
            byte[] bArr = this.f24305b;
            ak.a.y(bArr, (byte) 0);
            System.arraycopy(a10, 0, this.f24305b, bArr.length - a10.length, a10.length);
            org.bouncycastle.crypto.i b10 = f1Var.b();
            if (b10 != null) {
                this.f24310g.init(true, b10);
            }
            reset();
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed");
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        if (this.f24309f) {
            this.f24310g.a(this.f24305b, 0, this.f24306c, 0);
        }
        this.f24310g.reset();
        this.f24308e = 0;
    }
}
