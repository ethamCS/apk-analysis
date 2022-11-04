package vh;

import org.bouncycastle.crypto.a0;
import org.bouncycastle.crypto.g0;
/* loaded from: classes3.dex */
public class f extends org.bouncycastle.crypto.f {

    /* renamed from: g */
    private int f24175g;

    public f(org.bouncycastle.crypto.e eVar) {
        if (!(eVar instanceof g0)) {
            this.f18645d = eVar;
            int b10 = eVar.b();
            this.f24175g = b10;
            this.f18642a = new byte[b10 * 2];
            this.f18643b = 0;
            return;
        }
        throw new IllegalArgumentException("CTSBlockCipher can only accept ECB, or CBC ciphers");
    }

    @Override // org.bouncycastle.crypto.f
    public int a(byte[] bArr, int i10) {
        if (this.f18643b + i10 <= bArr.length) {
            int b10 = this.f18645d.b();
            int i11 = this.f18643b;
            int i12 = i11 - b10;
            byte[] bArr2 = new byte[b10];
            if (!this.f18644c) {
                if (i11 < b10) {
                    throw new org.bouncycastle.crypto.o("need at least one block of input for CTS");
                }
                byte[] bArr3 = new byte[b10];
                if (i11 <= b10) {
                    this.f18645d.a(this.f18642a, 0, bArr2, 0);
                    System.arraycopy(bArr2, 0, bArr, i10, b10);
                    int i13 = this.f18643b;
                    i();
                    return i13;
                }
                org.bouncycastle.crypto.e eVar = this.f18645d;
                if (eVar instanceof c) {
                    ((c) eVar).e().a(this.f18642a, 0, bArr2, 0);
                } else {
                    eVar.a(this.f18642a, 0, bArr2, 0);
                }
                for (int i14 = b10; i14 != this.f18643b; i14++) {
                    int i15 = i14 - b10;
                    bArr3[i15] = (byte) (bArr2[i15] ^ this.f18642a[i14]);
                }
                System.arraycopy(this.f18642a, b10, bArr2, 0, i12);
                this.f18645d.a(bArr2, 0, bArr, i10);
                System.arraycopy(bArr3, 0, bArr, i10 + b10, i12);
                int i132 = this.f18643b;
                i();
                return i132;
            } else if (i11 < b10) {
                throw new org.bouncycastle.crypto.o("need at least one block of input for CTS");
            } else {
                this.f18645d.a(this.f18642a, 0, bArr2, 0);
                int i16 = this.f18643b;
                if (i16 > b10) {
                    while (true) {
                        byte[] bArr4 = this.f18642a;
                        if (i16 == bArr4.length) {
                            break;
                        }
                        bArr4[i16] = bArr2[i16 - b10];
                        i16++;
                    }
                    for (int i17 = b10; i17 != this.f18643b; i17++) {
                        byte[] bArr5 = this.f18642a;
                        bArr5[i17] = (byte) (bArr5[i17] ^ bArr2[i17 - b10]);
                    }
                    org.bouncycastle.crypto.e eVar2 = this.f18645d;
                    if (eVar2 instanceof c) {
                        ((c) eVar2).e().a(this.f18642a, b10, bArr, i10);
                    } else {
                        eVar2.a(this.f18642a, b10, bArr, i10);
                    }
                    System.arraycopy(bArr2, 0, bArr, i10 + b10, i12);
                    int i1322 = this.f18643b;
                    i();
                    return i1322;
                }
                System.arraycopy(bArr2, 0, bArr, i10, b10);
                int i13222 = this.f18643b;
                i();
                return i13222;
            }
        }
        throw new a0("output buffer to small in doFinal");
    }

    @Override // org.bouncycastle.crypto.f
    public int c(int i10) {
        return i10 + this.f18643b;
    }

    @Override // org.bouncycastle.crypto.f
    public int e(int i10) {
        int i11 = i10 + this.f18643b;
        byte[] bArr = this.f18642a;
        int length = i11 % bArr.length;
        return length == 0 ? i11 - bArr.length : i11 - length;
    }

    @Override // org.bouncycastle.crypto.f
    public int g(byte b10, byte[] bArr, int i10) {
        int i11 = this.f18643b;
        byte[] bArr2 = this.f18642a;
        int i12 = 0;
        if (i11 == bArr2.length) {
            int a10 = this.f18645d.a(bArr2, 0, bArr, i10);
            byte[] bArr3 = this.f18642a;
            int i13 = this.f24175g;
            System.arraycopy(bArr3, i13, bArr3, 0, i13);
            this.f18643b = this.f24175g;
            i12 = a10;
        }
        byte[] bArr4 = this.f18642a;
        int i14 = this.f18643b;
        this.f18643b = i14 + 1;
        bArr4[i14] = b10;
        return i12;
    }

    @Override // org.bouncycastle.crypto.f
    public int h(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (i11 >= 0) {
            int b10 = b();
            int e10 = e(i11);
            if (e10 > 0 && e10 + i12 > bArr2.length) {
                throw new a0("output buffer too short");
            }
            byte[] bArr3 = this.f18642a;
            int length = bArr3.length;
            int i13 = this.f18643b;
            int i14 = length - i13;
            int i15 = 0;
            if (i11 > i14) {
                System.arraycopy(bArr, i10, bArr3, i13, i14);
                int a10 = this.f18645d.a(this.f18642a, 0, bArr2, i12) + 0;
                byte[] bArr4 = this.f18642a;
                System.arraycopy(bArr4, b10, bArr4, 0, b10);
                this.f18643b = b10;
                i11 -= i14;
                i10 += i14;
                while (i11 > b10) {
                    System.arraycopy(bArr, i10, this.f18642a, this.f18643b, b10);
                    a10 += this.f18645d.a(this.f18642a, 0, bArr2, i12 + a10);
                    byte[] bArr5 = this.f18642a;
                    System.arraycopy(bArr5, b10, bArr5, 0, b10);
                    i11 -= b10;
                    i10 += b10;
                }
                i15 = a10;
            }
            System.arraycopy(bArr, i10, this.f18642a, this.f18643b, i11);
            this.f18643b += i11;
            return i15;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
