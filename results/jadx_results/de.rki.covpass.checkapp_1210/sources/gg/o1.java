package gg;

import java.util.Date;
/* loaded from: classes3.dex */
public class o1 extends m {
    public o1(Date date) {
        super(date);
    }

    public o1(byte[] bArr) {
        super(bArr);
    }

    private byte[] Q() {
        byte[] bArr = this.f10855c;
        if (bArr[bArr.length - 1] == 90) {
            if (!M()) {
                byte[] bArr2 = this.f10855c;
                byte[] bArr3 = new byte[bArr2.length + 4];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
                System.arraycopy(ak.q.f("0000Z"), 0, bArr3, this.f10855c.length - 1, 5);
                return bArr3;
            } else if (!N()) {
                byte[] bArr4 = this.f10855c;
                byte[] bArr5 = new byte[bArr4.length + 2];
                System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
                System.arraycopy(ak.q.f("00Z"), 0, bArr5, this.f10855c.length - 1, 3);
                return bArr5;
            } else if (!L()) {
                return this.f10855c;
            } else {
                int length = this.f10855c.length - 2;
                while (length > 0 && this.f10855c[length] == 48) {
                    length--;
                }
                byte[] bArr6 = this.f10855c;
                if (bArr6[length] == 46) {
                    byte[] bArr7 = new byte[length + 1];
                    System.arraycopy(bArr6, 0, bArr7, 0, length);
                    bArr7[length] = 90;
                    return bArr7;
                }
                byte[] bArr8 = new byte[length + 2];
                int i10 = length + 1;
                System.arraycopy(bArr6, 0, bArr8, 0, i10);
                bArr8[i10] = 90;
                return bArr8;
            }
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gg.m, gg.a0
    public void m(y yVar, boolean z10) {
        yVar.o(z10, 24, Q());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gg.m, gg.a0
    public int q(boolean z10) {
        return y.g(z10, Q().length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gg.m, gg.a0
    public a0 w() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // gg.m, gg.a0
    public a0 z() {
        return this;
    }
}
