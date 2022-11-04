package uh;

import org.bouncycastle.crypto.y;
import zh.b1;
/* loaded from: classes3.dex */
public class k implements y {

    /* renamed from: a */
    private org.bouncycastle.crypto.r f23730a;

    /* renamed from: b */
    private int f23731b;

    /* renamed from: c */
    private byte[] f23732c = new byte[64];

    /* renamed from: d */
    private byte[] f23733d = new byte[64];

    public k(org.bouncycastle.crypto.r rVar) {
        this.f23730a = rVar;
        this.f23731b = rVar.getDigestSize();
    }

    @Override // org.bouncycastle.crypto.y
    public int doFinal(byte[] bArr, int i10) {
        int i11 = this.f23731b;
        byte[] bArr2 = new byte[i11];
        this.f23730a.doFinal(bArr2, 0);
        org.bouncycastle.crypto.r rVar = this.f23730a;
        byte[] bArr3 = this.f23733d;
        rVar.update(bArr3, 0, bArr3.length);
        this.f23730a.update(bArr2, 0, i11);
        int doFinal = this.f23730a.doFinal(bArr, i10);
        reset();
        return doFinal;
    }

    @Override // org.bouncycastle.crypto.y
    public String getAlgorithmName() {
        return this.f23730a.getAlgorithmName() + "/HMAC";
    }

    @Override // org.bouncycastle.crypto.y
    public int getMacSize() {
        return this.f23731b;
    }

    @Override // org.bouncycastle.crypto.y
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f23730a.reset();
        byte[] a10 = ((b1) iVar).a();
        if (a10.length <= 64) {
            System.arraycopy(a10, 0, this.f23732c, 0, a10.length);
            int length = a10.length;
            while (true) {
                byte[] bArr = this.f23732c;
                if (length >= bArr.length) {
                    break;
                }
                bArr[length] = 0;
                length++;
            }
        } else {
            this.f23730a.update(a10, 0, a10.length);
            this.f23730a.doFinal(this.f23732c, 0);
            int i10 = this.f23731b;
            while (true) {
                byte[] bArr2 = this.f23732c;
                if (i10 >= bArr2.length) {
                    break;
                }
                bArr2[i10] = 0;
                i10++;
            }
        }
        byte[] bArr3 = this.f23732c;
        byte[] bArr4 = new byte[bArr3.length];
        this.f23733d = bArr4;
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        int i11 = 0;
        while (true) {
            byte[] bArr5 = this.f23732c;
            if (i11 >= bArr5.length) {
                break;
            }
            bArr5[i11] = (byte) (bArr5[i11] ^ 54);
            i11++;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr6 = this.f23733d;
            if (i12 >= bArr6.length) {
                org.bouncycastle.crypto.r rVar = this.f23730a;
                byte[] bArr7 = this.f23732c;
                rVar.update(bArr7, 0, bArr7.length);
                return;
            }
            bArr6[i12] = (byte) (bArr6[i12] ^ 92);
            i12++;
        }
    }

    @Override // org.bouncycastle.crypto.y
    public void reset() {
        this.f23730a.reset();
        org.bouncycastle.crypto.r rVar = this.f23730a;
        byte[] bArr = this.f23732c;
        rVar.update(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte b10) {
        this.f23730a.update(b10);
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte[] bArr, int i10, int i11) {
        this.f23730a.update(bArr, i10, i11);
    }
}
