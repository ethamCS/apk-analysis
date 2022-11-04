package qh;

import java.math.BigInteger;
import zh.n1;
import zh.o1;
/* loaded from: classes3.dex */
class o0 {

    /* renamed from: a */
    private n1 f20092a;

    /* renamed from: b */
    private boolean f20093b;

    public BigInteger a(byte[] bArr, int i10, int i11) {
        if (i11 <= c() + 1) {
            if (i11 == c() + 1 && !this.f20093b) {
                throw new org.bouncycastle.crypto.o("input too large for RSA cipher.");
            }
            if (i10 != 0 || i11 != bArr.length) {
                byte[] bArr2 = new byte[i11];
                System.arraycopy(bArr, i10, bArr2, 0, i11);
                bArr = bArr2;
            }
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (bigInteger.compareTo(this.f20092a.c()) >= 0) {
                throw new org.bouncycastle.crypto.o("input too large for RSA cipher.");
            }
            return bigInteger;
        }
        throw new org.bouncycastle.crypto.o("input too large for RSA cipher.");
    }

    public byte[] b(BigInteger bigInteger) {
        byte[] bArr;
        byte[] byteArray = bigInteger.toByteArray();
        if (!this.f20093b) {
            if (byteArray[0] == 0) {
                int length = byteArray.length - 1;
                bArr = new byte[length];
                System.arraycopy(byteArray, 1, bArr, 0, length);
            } else {
                int length2 = byteArray.length;
                bArr = new byte[length2];
                System.arraycopy(byteArray, 0, bArr, 0, length2);
            }
            ak.a.y(byteArray, (byte) 0);
            return bArr;
        } else if (byteArray[0] == 0 && byteArray.length > d()) {
            int length3 = byteArray.length - 1;
            byte[] bArr2 = new byte[length3];
            System.arraycopy(byteArray, 1, bArr2, 0, length3);
            return bArr2;
        } else if (byteArray.length >= d()) {
            return byteArray;
        } else {
            int d10 = d();
            byte[] bArr3 = new byte[d10];
            System.arraycopy(byteArray, 0, bArr3, d10 - byteArray.length, byteArray.length);
            return bArr3;
        }
    }

    public int c() {
        int bitLength = (this.f20092a.c().bitLength() + 7) / 8;
        return this.f20093b ? bitLength - 1 : bitLength;
    }

    public int d() {
        int bitLength = (this.f20092a.c().bitLength() + 7) / 8;
        return this.f20093b ? bitLength : bitLength - 1;
    }

    public void e(boolean z10, org.bouncycastle.crypto.i iVar) {
        if (iVar instanceof zh.g1) {
            iVar = ((zh.g1) iVar).a();
        }
        this.f20092a = (n1) iVar;
        this.f20093b = z10;
    }

    public BigInteger f(BigInteger bigInteger) {
        n1 n1Var = this.f20092a;
        if (n1Var instanceof o1) {
            o1 o1Var = (o1) n1Var;
            BigInteger g10 = o1Var.g();
            BigInteger i10 = o1Var.i();
            BigInteger e10 = o1Var.e();
            BigInteger f10 = o1Var.f();
            BigInteger j10 = o1Var.j();
            BigInteger modPow = bigInteger.remainder(g10).modPow(e10, g10);
            BigInteger modPow2 = bigInteger.remainder(i10).modPow(f10, i10);
            return modPow.subtract(modPow2).multiply(j10).mod(g10).multiply(i10).add(modPow2);
        }
        return bigInteger.modPow(n1Var.b(), this.f20092a.c());
    }
}
