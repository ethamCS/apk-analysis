package sh;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public class j {

    /* renamed from: i */
    private static final BigInteger f21728i = BigInteger.valueOf(0);

    /* renamed from: j */
    private static final BigInteger f21729j = BigInteger.valueOf(1);

    /* renamed from: k */
    private static final BigInteger f21730k = BigInteger.valueOf(2);

    /* renamed from: a */
    private org.bouncycastle.crypto.r f21731a;

    /* renamed from: b */
    private int f21732b;

    /* renamed from: c */
    private int f21733c;

    /* renamed from: d */
    private int f21734d;

    /* renamed from: e */
    private int f21735e;

    /* renamed from: f */
    private SecureRandom f21736f;

    /* renamed from: g */
    private boolean f21737g;

    /* renamed from: h */
    private int f21738h;

    public j() {
        this(ei.a.b());
    }

    public j(org.bouncycastle.crypto.r rVar) {
        this.f21731a = rVar;
    }

    private static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger modPow;
        BigInteger divide = bigInteger.subtract(f21729j).divide(bigInteger2);
        BigInteger subtract = bigInteger.subtract(f21730k);
        do {
            modPow = ak.b.f(f21730k, subtract, secureRandom).modPow(divide, bigInteger);
        } while (modPow.bitLength() <= 1);
        return modPow;
    }

    private static BigInteger b(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        return a(bigInteger, bigInteger2, secureRandom);
    }

    private static BigInteger c(org.bouncycastle.crypto.r rVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i10) {
        BigInteger divide = bigInteger.subtract(f21729j).divide(bigInteger2);
        byte[] b10 = bk.f.b("6767656E");
        int length = bArr.length + b10.length + 1 + 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(b10, 0, bArr2, bArr.length, b10.length);
        bArr2[length - 3] = (byte) i10;
        byte[] bArr3 = new byte[rVar.getDigestSize()];
        for (int i11 = 1; i11 < 65536; i11++) {
            j(bArr2);
            i(rVar, bArr2, bArr3, 0);
            BigInteger modPow = new BigInteger(1, bArr3).modPow(divide, bigInteger);
            if (modPow.compareTo(f21730k) >= 0) {
                return modPow;
            }
        }
        return null;
    }

    private zh.r e() {
        int i10 = 20;
        byte[] bArr = new byte[20];
        byte[] bArr2 = new byte[20];
        byte[] bArr3 = new byte[20];
        byte[] bArr4 = new byte[20];
        int i11 = this.f21732b;
        int i12 = (i11 - 1) / 160;
        int i13 = i11 / 8;
        byte[] bArr5 = new byte[i13];
        if (this.f21731a instanceof nh.v) {
            while (true) {
                this.f21736f.nextBytes(bArr);
                i(this.f21731a, bArr, bArr2, 0);
                System.arraycopy(bArr, 0, bArr3, 0, i10);
                j(bArr3);
                i(this.f21731a, bArr3, bArr3, 0);
                for (int i14 = 0; i14 != i10; i14++) {
                    bArr4[i14] = (byte) (bArr2[i14] ^ bArr3[i14]);
                }
                bArr4[0] = (byte) (bArr4[0] | Byte.MIN_VALUE);
                bArr4[19] = (byte) (bArr4[19] | 1);
                BigInteger bigInteger = new BigInteger(1, bArr4);
                if (m(bigInteger)) {
                    byte[] h10 = ak.a.h(bArr);
                    j(h10);
                    int i15 = 0;
                    while (i15 < 4096) {
                        for (int i16 = 1; i16 <= i12; i16++) {
                            j(h10);
                            i(this.f21731a, h10, bArr5, i13 - (i16 * 20));
                        }
                        int i17 = i13 - (i12 * 20);
                        j(h10);
                        i(this.f21731a, h10, bArr2, 0);
                        System.arraycopy(bArr2, 20 - i17, bArr5, 0, i17);
                        bArr5[0] = (byte) (bArr5[0] | Byte.MIN_VALUE);
                        BigInteger bigInteger2 = new BigInteger(1, bArr5);
                        BigInteger subtract = bigInteger2.subtract(bigInteger2.mod(bigInteger.shiftLeft(1)).subtract(f21729j));
                        if (subtract.bitLength() == this.f21732b && m(subtract)) {
                            return new zh.r(subtract, bigInteger, a(subtract, bigInteger, this.f21736f), new zh.u(bArr, i15));
                        }
                        i15++;
                        i10 = 20;
                    }
                    continue;
                }
            }
        } else {
            throw new IllegalStateException("can only use SHA-1 for generating FIPS 186-2 parameters");
        }
    }

    private zh.r f() {
        BigInteger bit;
        int i10;
        BigInteger subtract;
        BigInteger c10;
        org.bouncycastle.crypto.r rVar = this.f21731a;
        int digestSize = rVar.getDigestSize() * 8;
        byte[] bArr = new byte[this.f21733c / 8];
        int i11 = this.f21732b;
        int i12 = (i11 - 1) / digestSize;
        int i13 = (i11 - 1) % digestSize;
        int i14 = i11 / 8;
        byte[] bArr2 = new byte[i14];
        int digestSize2 = rVar.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        loop0: while (true) {
            this.f21736f.nextBytes(bArr);
            int i15 = 0;
            i(rVar, bArr, bArr3, 0);
            bit = new BigInteger(1, bArr3).mod(f21729j.shiftLeft(this.f21733c - 1)).setBit(0).setBit(this.f21733c - 1);
            if (m(bit)) {
                byte[] h10 = ak.a.h(bArr);
                int i16 = this.f21732b * 4;
                i10 = 0;
                while (i10 < i16) {
                    for (int i17 = 1; i17 <= i12; i17++) {
                        j(h10);
                        i(rVar, h10, bArr2, i14 - (i17 * digestSize2));
                    }
                    int i18 = i14 - (i12 * digestSize2);
                    j(h10);
                    i(rVar, h10, bArr3, i15);
                    System.arraycopy(bArr3, digestSize2 - i18, bArr2, i15, i18);
                    bArr2[i15] = (byte) (bArr2[i15] | Byte.MIN_VALUE);
                    BigInteger bigInteger = new BigInteger(1, bArr2);
                    subtract = bigInteger.subtract(bigInteger.mod(bit.shiftLeft(1)).subtract(f21729j));
                    if (subtract.bitLength() == this.f21732b && m(subtract)) {
                        break loop0;
                    }
                    i10++;
                    i15 = 0;
                }
                continue;
            }
        }
        int i19 = this.f21738h;
        return (i19 < 0 || (c10 = c(rVar, subtract, bit, bArr, i19)) == null) ? new zh.r(subtract, bit, b(subtract, bit, this.f21736f), new zh.u(bArr, i10)) : new zh.r(subtract, bit, c10, new zh.u(bArr, i10, this.f21738h));
    }

    private static int g(int i10) {
        if (i10 > 1024) {
            return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        return 160;
    }

    private static int h(int i10) {
        if (i10 <= 1024) {
            return 40;
        }
        return (((i10 - 1) / 1024) * 8) + 48;
    }

    private static void i(org.bouncycastle.crypto.r rVar, byte[] bArr, byte[] bArr2, int i10) {
        rVar.update(bArr, 0, bArr.length);
        rVar.doFinal(bArr2, i10);
    }

    private static void j(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b10 = (byte) ((bArr[length] + 1) & 255);
            bArr[length] = b10;
            if (b10 != 0) {
                return;
            }
        }
    }

    private boolean m(BigInteger bigInteger) {
        return bigInteger.isProbablePrime(this.f21734d);
    }

    public zh.r d() {
        return this.f21737g ? f() : e();
    }

    public void k(int i10, int i11, SecureRandom secureRandom) {
        this.f21732b = i10;
        this.f21733c = g(i10);
        this.f21734d = i11;
        this.f21735e = Math.max(h(this.f21732b), (i11 + 1) / 2);
        this.f21736f = secureRandom;
        this.f21737g = false;
        this.f21738h = -1;
    }

    public void l(zh.q qVar) {
        int b10 = qVar.b();
        int c10 = qVar.c();
        if (b10 < 1024 || b10 > 3072 || b10 % 1024 != 0) {
            throw new IllegalArgumentException("L values must be between 1024 and 3072 and a multiple of 1024");
        }
        if (b10 == 1024 && c10 != 160) {
            throw new IllegalArgumentException("N must be 160 for L = 1024");
        }
        if (b10 == 2048 && c10 != 224 && c10 != 256) {
            throw new IllegalArgumentException("N must be 224 or 256 for L = 2048");
        }
        if (b10 == 3072 && c10 != 256) {
            throw new IllegalArgumentException("N must be 256 for L = 3072");
        }
        if (this.f21731a.getDigestSize() * 8 < c10) {
            throw new IllegalStateException("Digest output size too small for value of N");
        }
        this.f21732b = b10;
        this.f21733c = c10;
        this.f21734d = qVar.a();
        this.f21735e = Math.max(h(b10), (this.f21734d + 1) / 2);
        this.f21736f = qVar.d();
        this.f21737g = true;
        this.f21738h = qVar.e();
    }
}
