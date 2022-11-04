package ak;

import java.math.BigInteger;
import java.security.SecureRandom;
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a */
    public static final BigInteger f550a = BigInteger.valueOf(0);

    /* renamed from: b */
    public static final BigInteger f551b = BigInteger.valueOf(1);

    /* renamed from: c */
    public static final BigInteger f552c = BigInteger.valueOf(2);

    /* renamed from: d */
    private static final BigInteger f553d = BigInteger.valueOf(3);

    /* renamed from: e */
    private static final BigInteger f554e = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);

    /* renamed from: f */
    private static final int f555f = BigInteger.valueOf(743).bitLength();

    public static void a(BigInteger bigInteger, byte[] bArr, int i10, int i11) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i11) {
            System.arraycopy(byteArray, 0, bArr, i10, i11);
            return;
        }
        int i12 = 1;
        if (byteArray[0] != 0 || byteArray.length == 1) {
            i12 = 0;
        }
        int length = byteArray.length - i12;
        if (length > i11) {
            throw new IllegalArgumentException("standard length exceeded for value");
        }
        int i13 = (i11 - length) + i10;
        a.z(bArr, i10, i13, (byte) 0);
        System.arraycopy(byteArray, i12, bArr, i13, length);
    }

    public static byte[] b(int i10, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i10) {
            return byteArray;
        }
        int i11 = 0;
        if (byteArray[0] == 0 && byteArray.length != 1) {
            i11 = 1;
        }
        int length = byteArray.length - i11;
        if (length > i10) {
            throw new IllegalArgumentException("standard length exceeded for value");
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(byteArray, i11, bArr, i10 - length, length);
        return bArr;
    }

    public static byte[] c(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0 || byteArray.length == 1) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    private static byte[] d(int i10, SecureRandom secureRandom) {
        if (i10 >= 1) {
            int i11 = (i10 + 7) / 8;
            byte[] bArr = new byte[i11];
            secureRandom.nextBytes(bArr);
            bArr[0] = (byte) (bArr[0] & ((byte) (255 >>> ((i11 * 8) - i10))));
            return bArr;
        }
        throw new IllegalArgumentException("bitLength must be at least 1");
    }

    public static BigInteger e(int i10, SecureRandom secureRandom) {
        return new BigInteger(1, d(i10, secureRandom));
    }

    public static BigInteger f(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger e10;
        int compareTo = bigInteger.compareTo(bigInteger2);
        if (compareTo >= 0) {
            if (compareTo > 0) {
                throw new IllegalArgumentException("'min' may not be greater than 'max'");
            }
            return bigInteger;
        }
        if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
            e10 = f(f550a, bigInteger2.subtract(bigInteger), secureRandom);
        } else {
            for (int i10 = 0; i10 < 1000; i10++) {
                BigInteger e11 = e(bigInteger2.bitLength(), secureRandom);
                if (e11.compareTo(bigInteger) >= 0 && e11.compareTo(bigInteger2) <= 0) {
                    return e11;
                }
            }
            e10 = e(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom);
        }
        return e10.add(bigInteger);
    }

    public static BigInteger g(int i10, int i11, SecureRandom secureRandom) {
        BigInteger bigInteger;
        if (i10 >= 2) {
            if (i10 == 2) {
                return secureRandom.nextInt() < 0 ? f552c : f553d;
            }
            do {
                byte[] d10 = d(i10, secureRandom);
                d10[0] = (byte) (((byte) (1 << (7 - ((d10.length * 8) - i10)))) | d10[0]);
                int length = d10.length - 1;
                d10[length] = (byte) (d10[length] | 1);
                bigInteger = new BigInteger(1, d10);
                if (i10 > f555f) {
                    while (!bigInteger.gcd(f554e).equals(f551b)) {
                        bigInteger = bigInteger.add(f552c);
                    }
                }
            } while (!bigInteger.isProbablePrime(i11));
            return bigInteger;
        }
        throw new IllegalArgumentException("bitLength < 2");
    }

    public static BigInteger h(byte[] bArr, int i10, int i11) {
        if (i10 != 0 || i11 != bArr.length) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }

    public static int i(BigInteger bigInteger) {
        if (bigInteger.equals(f550a)) {
            return 1;
        }
        return (bigInteger.bitLength() + 7) / 8;
    }

    public static BigInteger j(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.testBit(0)) {
            if (bigInteger.signum() != 1) {
                throw new ArithmeticException("BigInteger: modulus not positive");
            }
            if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
                bigInteger2 = bigInteger2.mod(bigInteger);
            }
            int bitLength = bigInteger.bitLength();
            int[] r10 = bj.n.r(bitLength, bigInteger);
            int[] r11 = bj.n.r(bitLength, bigInteger2);
            int length = r10.length;
            int[] k10 = bj.n.k(length);
            if (bj.c.k(r10, r11, k10) == 0) {
                throw new ArithmeticException("BigInteger not invertible.");
            }
            return bj.n.V(length, k10);
        }
        throw new IllegalArgumentException("'M' must be odd");
    }

    public static BigInteger k(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.testBit(0)) {
            if (bigInteger.signum() != 1) {
                throw new ArithmeticException("BigInteger: modulus not positive");
            }
            BigInteger bigInteger3 = f551b;
            if (bigInteger.equals(bigInteger3)) {
                return f550a;
            }
            if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
                bigInteger2 = bigInteger2.mod(bigInteger);
            }
            if (bigInteger2.equals(bigInteger3)) {
                return bigInteger3;
            }
            int bitLength = bigInteger.bitLength();
            int[] r10 = bj.n.r(bitLength, bigInteger);
            int[] r11 = bj.n.r(bitLength, bigInteger2);
            int length = r10.length;
            int[] k10 = bj.n.k(length);
            if (!bj.c.l(r10, r11, k10)) {
                throw new ArithmeticException("BigInteger not invertible.");
            }
            return bj.n.V(length, k10);
        }
        throw new IllegalArgumentException("'M' must be odd");
    }
}
