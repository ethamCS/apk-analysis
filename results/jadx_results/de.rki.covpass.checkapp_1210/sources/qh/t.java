package qh;

import java.math.BigInteger;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class t implements org.bouncycastle.crypto.a {

    /* renamed from: e */
    private static final BigInteger f20166e = BigInteger.valueOf(0);

    /* renamed from: f */
    private static final BigInteger f20167f = BigInteger.valueOf(1);

    /* renamed from: g */
    private static final BigInteger f20168g = BigInteger.valueOf(2);

    /* renamed from: a */
    private zh.m0 f20169a;

    /* renamed from: b */
    private SecureRandom f20170b;

    /* renamed from: c */
    private boolean f20171c;

    /* renamed from: d */
    private int f20172d;

    @Override // org.bouncycastle.crypto.a
    public byte[] a(byte[] bArr, int i10, int i11) {
        BigInteger e10;
        if (this.f20169a != null) {
            if (i11 > (this.f20171c ? ((this.f20172d - 1) + 7) / 8 : b())) {
                throw new org.bouncycastle.crypto.o("input too large for ElGamal cipher.\n");
            }
            BigInteger c10 = this.f20169a.b().c();
            if (this.f20169a instanceof zh.o0) {
                int i12 = i11 / 2;
                byte[] bArr2 = new byte[i12];
                byte[] bArr3 = new byte[i12];
                System.arraycopy(bArr, i10, bArr2, 0, i12);
                System.arraycopy(bArr, i10 + i12, bArr3, 0, i12);
                return ak.b.c(new BigInteger(1, bArr2).modPow(c10.subtract(f20167f).subtract(((zh.o0) this.f20169a).c()), c10).multiply(new BigInteger(1, bArr3)).mod(c10));
            }
            if (i10 != 0 || i11 != bArr.length) {
                byte[] bArr4 = new byte[i11];
                System.arraycopy(bArr, i10, bArr4, 0, i11);
                bArr = bArr4;
            }
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (bigInteger.compareTo(c10) >= 0) {
                throw new org.bouncycastle.crypto.o("input too large for ElGamal cipher.\n");
            }
            zh.p0 p0Var = (zh.p0) this.f20169a;
            int bitLength = c10.bitLength();
            while (true) {
                e10 = ak.b.e(bitLength, this.f20170b);
                if (!e10.equals(f20166e) && e10.compareTo(c10.subtract(f20168g)) <= 0) {
                    break;
                }
            }
            BigInteger modPow = this.f20169a.b().a().modPow(e10, c10);
            BigInteger mod = bigInteger.multiply(p0Var.c().modPow(e10, c10)).mod(c10);
            byte[] byteArray = modPow.toByteArray();
            byte[] byteArray2 = mod.toByteArray();
            int c11 = c();
            byte[] bArr5 = new byte[c11];
            int i13 = c11 / 2;
            if (byteArray.length > i13) {
                System.arraycopy(byteArray, 1, bArr5, i13 - (byteArray.length - 1), byteArray.length - 1);
            } else {
                System.arraycopy(byteArray, 0, bArr5, i13 - byteArray.length, byteArray.length);
            }
            if (byteArray2.length > i13) {
                System.arraycopy(byteArray2, 1, bArr5, c11 - (byteArray2.length - 1), byteArray2.length - 1);
            } else {
                System.arraycopy(byteArray2, 0, bArr5, c11 - byteArray2.length, byteArray2.length);
            }
            return bArr5;
        }
        throw new IllegalStateException("ElGamal engine not initialised");
    }

    @Override // org.bouncycastle.crypto.a
    public int b() {
        return this.f20171c ? (this.f20172d - 1) / 8 : ((this.f20172d + 7) / 8) * 2;
    }

    @Override // org.bouncycastle.crypto.a
    public int c() {
        return this.f20171c ? ((this.f20172d + 7) / 8) * 2 : (this.f20172d - 1) / 8;
    }

    @Override // org.bouncycastle.crypto.a
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        SecureRandom secureRandom;
        if (iVar instanceof zh.g1) {
            zh.g1 g1Var = (zh.g1) iVar;
            this.f20169a = (zh.m0) g1Var.a();
            secureRandom = g1Var.b();
        } else {
            this.f20169a = (zh.m0) iVar;
            secureRandom = org.bouncycastle.crypto.l.b();
        }
        this.f20170b = secureRandom;
        this.f20171c = z10;
        this.f20172d = this.f20169a.b().c().bitLength();
        if (z10) {
            if (!(this.f20169a instanceof zh.p0)) {
                throw new IllegalArgumentException("ElGamalPublicKeyParameters are required for encryption.");
            }
        } else if (!(this.f20169a instanceof zh.o0)) {
            throw new IllegalArgumentException("ElGamalPrivateKeyParameters are required for decryption.");
        }
    }
}
