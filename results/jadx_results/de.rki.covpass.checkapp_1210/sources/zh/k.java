package zh;

import java.math.BigInteger;
import java.util.Objects;
/* loaded from: classes3.dex */
public class k extends f {

    /* renamed from: x */
    private static final BigInteger f26948x = BigInteger.valueOf(1);

    /* renamed from: y */
    private static final BigInteger f26949y = BigInteger.valueOf(2);

    /* renamed from: q */
    private BigInteger f26950q;

    public k(BigInteger bigInteger, i iVar) {
        super(false, iVar);
        this.f26950q = e(bigInteger, iVar);
    }

    private static int d(BigInteger bigInteger, BigInteger bigInteger2) {
        int bitLength = bigInteger2.bitLength();
        int[] r10 = bj.n.r(bitLength, bigInteger);
        int[] r11 = bj.n.r(bitLength, bigInteger2);
        int length = r11.length;
        int i10 = 0;
        while (true) {
            if (r10[0] == 0) {
                bj.n.I(length, r10, 0);
            } else {
                int b10 = ak.g.b(r10[0]);
                if (b10 > 0) {
                    bj.n.G(length, r10, b10, 0);
                    int i11 = r11[0];
                    i10 ^= (b10 << 1) & (i11 ^ (i11 >>> 1));
                }
                int i12 = bj.n.i(length, r10, r11);
                if (i12 == 0) {
                    break;
                }
                if (i12 < 0) {
                    i10 ^= r10[0] & r11[0];
                    int[] iArr = r11;
                    r11 = r10;
                    r10 = iArr;
                }
                while (true) {
                    int i13 = length - 1;
                    if (r10[i13] != 0) {
                        break;
                    }
                    length = i13;
                }
                bj.n.Q(length, r10, r11, r10);
            }
        }
        if (bj.n.z(length, r11)) {
            return 1 - (i10 & 2);
        }
        return 0;
    }

    private BigInteger e(BigInteger bigInteger, i iVar) {
        Objects.requireNonNull(bigInteger, "y value cannot be null");
        BigInteger f10 = iVar.f();
        BigInteger bigInteger2 = f26949y;
        if (bigInteger.compareTo(bigInteger2) < 0 || bigInteger.compareTo(f10.subtract(bigInteger2)) > 0) {
            throw new IllegalArgumentException("invalid DH public key");
        }
        BigInteger g10 = iVar.g();
        if (g10 == null) {
            return bigInteger;
        }
        if (!f10.testBit(0) || f10.bitLength() - 1 != g10.bitLength() || !f10.shiftRight(1).equals(g10)) {
            if (f26948x.equals(bigInteger.modPow(g10, f10))) {
                return bigInteger;
            }
        } else if (1 == d(bigInteger, f10)) {
            return bigInteger;
        }
        throw new IllegalArgumentException("Y value does not appear to be in correct group");
    }

    public BigInteger c() {
        return this.f26950q;
    }

    @Override // zh.f
    public boolean equals(Object obj) {
        return (obj instanceof k) && ((k) obj).c().equals(this.f26950q) && super.equals(obj);
    }

    @Override // zh.f
    public int hashCode() {
        return this.f26950q.hashCode() ^ super.hashCode();
    }
}
