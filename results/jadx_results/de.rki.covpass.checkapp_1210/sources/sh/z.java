package sh;

import java.math.BigInteger;
import zh.m1;
import zh.n1;
import zh.o1;
/* loaded from: classes3.dex */
public class z implements org.bouncycastle.crypto.c {

    /* renamed from: h */
    private static final BigInteger f21762h = BigInteger.valueOf(1);

    /* renamed from: g */
    private m1 f21763g;

    private static int c(int i10, int i11) {
        if (i10 >= 1536) {
            if (i11 <= 100) {
                return 3;
            }
            if (i11 > 128) {
                return 4 + (((i11 - 128) + 1) / 2);
            }
            return 4;
        } else if (i10 >= 1024) {
            if (i11 <= 100) {
                return 4;
            }
            if (i11 > 112) {
                return (((i11 - 112) + 1) / 2) + 5;
            }
            return 5;
        } else if (i10 < 512) {
            if (i11 > 80) {
                return 40 + (((i11 - 80) + 1) / 2);
            }
            return 40;
        } else if (i11 <= 80) {
            return 5;
        } else {
            if (i11 > 100) {
                return (((i11 - 100) + 1) / 2) + 7;
            }
            return 7;
        }
    }

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b a() {
        BigInteger b10;
        BigInteger b11;
        BigInteger multiply;
        BigInteger bigInteger;
        z zVar = this;
        int b12 = zVar.f21763g.b();
        int i10 = (b12 + 1) / 2;
        int i11 = b12 - i10;
        int i12 = b12 / 2;
        int i13 = i12 - 100;
        int i14 = b12 / 3;
        if (i13 < i14) {
            i13 = i14;
        }
        int i15 = b12 >> 2;
        BigInteger pow = BigInteger.valueOf(2L).pow(i12);
        BigInteger bigInteger2 = f21762h;
        BigInteger shiftLeft = bigInteger2.shiftLeft(b12 - 1);
        BigInteger shiftLeft2 = bigInteger2.shiftLeft(i13);
        org.bouncycastle.crypto.b bVar = null;
        boolean z10 = false;
        while (!z10) {
            BigInteger d10 = zVar.f21763g.d();
            do {
                b10 = zVar.b(i10, d10, shiftLeft);
                while (true) {
                    b11 = zVar.b(i11, d10, shiftLeft);
                    BigInteger abs = b11.subtract(b10).abs();
                    if (abs.bitLength() < i13 || abs.compareTo(shiftLeft2) <= 0) {
                        zVar = this;
                        b12 = b12;
                    } else {
                        multiply = b10.multiply(b11);
                        if (multiply.bitLength() != b12) {
                            b10 = b10.max(b11);
                        }
                    }
                }
            } while (ti.x.h(multiply) < i15);
            if (b10.compareTo(b11) < 0) {
                bigInteger = b10;
                b10 = b11;
            } else {
                bigInteger = b11;
            }
            BigInteger bigInteger3 = f21762h;
            BigInteger subtract = b10.subtract(bigInteger3);
            BigInteger subtract2 = bigInteger.subtract(bigInteger3);
            int i16 = b12;
            BigInteger modInverse = d10.modInverse(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2));
            if (modInverse.compareTo(pow) <= 0) {
                zVar = this;
                b12 = i16;
            } else {
                bVar = new org.bouncycastle.crypto.b(new n1(false, multiply, d10), new o1(multiply, d10, modInverse, b10, bigInteger, modInverse.remainder(subtract), modInverse.remainder(subtract2), ak.b.j(b10, bigInteger)));
                z10 = true;
                b12 = i16;
                zVar = this;
            }
        }
        return bVar;
    }

    protected BigInteger b(int i10, BigInteger bigInteger, BigInteger bigInteger2) {
        for (int i11 = 0; i11 != i10 * 5; i11++) {
            BigInteger g10 = ak.b.g(i10, 1, this.f21763g.a());
            BigInteger mod = g10.mod(bigInteger);
            BigInteger bigInteger3 = f21762h;
            if (!mod.equals(bigInteger3) && g10.multiply(g10).compareTo(bigInteger2) >= 0 && e(g10) && bigInteger.gcd(g10.subtract(bigInteger3)).equals(bigInteger3)) {
                return g10;
            }
        }
        throw new IllegalStateException("unable to generate prime number for RSA key");
    }

    public void d(org.bouncycastle.crypto.w wVar) {
        this.f21763g = (m1) wVar;
    }

    protected boolean e(BigInteger bigInteger) {
        return !si.a.b(bigInteger) && si.a.e(bigInteger, this.f21763g.a(), c(bigInteger.bitLength(), this.f21763g.c()));
    }
}
