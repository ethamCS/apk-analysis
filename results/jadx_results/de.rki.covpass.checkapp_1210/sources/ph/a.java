package ph;

import java.math.BigInteger;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.u;
import zh.g1;
import zh.n1;
/* loaded from: classes3.dex */
public class a implements org.bouncycastle.crypto.a {

    /* renamed from: f */
    private static final BigInteger f19214f = BigInteger.valueOf(16);

    /* renamed from: g */
    private static final BigInteger f19215g = BigInteger.valueOf(6);

    /* renamed from: h */
    private static byte[] f19216h = {14, 3, 5, 8, 9, 4, 2, 15, 0, 13, 11, 6, 7, 10, 12, 1};

    /* renamed from: i */
    private static byte[] f19217i = {8, 15, 6, 1, 5, 2, 11, 12, 3, 4, 13, 10, 14, 9, 0, 7};

    /* renamed from: a */
    private org.bouncycastle.crypto.a f19218a;

    /* renamed from: b */
    private boolean f19219b;

    /* renamed from: c */
    private int f19220c;

    /* renamed from: d */
    private int f19221d = 0;

    /* renamed from: e */
    private BigInteger f19222e;

    public a(org.bouncycastle.crypto.a aVar) {
        this.f19218a = aVar;
    }

    private static byte[] d(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            return bArr;
        }
        return byteArray;
    }

    private byte[] e(byte[] bArr, int i10, int i11) {
        byte[] a10 = this.f19218a.a(bArr, i10, i11);
        int i12 = (this.f19220c + 13) / 16;
        BigInteger bigInteger = new BigInteger(1, a10);
        BigInteger bigInteger2 = f19214f;
        BigInteger mod = bigInteger.mod(bigInteger2);
        BigInteger bigInteger3 = f19215g;
        if (!mod.equals(bigInteger3)) {
            if (!this.f19222e.subtract(bigInteger).mod(bigInteger2).equals(bigInteger3)) {
                throw new u("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
            }
            bigInteger = this.f19222e.subtract(bigInteger);
        }
        byte[] d10 = d(bigInteger);
        if ((d10[d10.length - 1] & 15) == 6) {
            d10[d10.length - 1] = (byte) (((d10[d10.length - 1] & 255) >>> 4) | (f19217i[(d10[d10.length - 2] & 255) >> 4] << 4));
            byte[] bArr2 = f19216h;
            d10[0] = (byte) (bArr2[d10[1] & 15] | (bArr2[(d10[1] & 255) >>> 4] << 4));
            int i13 = 1;
            int i14 = 0;
            boolean z10 = false;
            for (int length = d10.length - 1; length >= d10.length - (i12 * 2); length -= 2) {
                byte[] bArr3 = f19216h;
                int i15 = bArr3[d10[length] & 15] | (bArr3[(d10[length] & 255) >>> 4] << 4);
                int i16 = length - 1;
                if (((d10[i16] ^ i15) & 255) != 0) {
                    if (z10) {
                        throw new u("invalid tsums in block");
                    }
                    i13 = (d10[i16] ^ i15) & 255;
                    z10 = true;
                    i14 = i16;
                }
            }
            d10[i14] = 0;
            int length2 = (d10.length - i14) / 2;
            byte[] bArr4 = new byte[length2];
            for (int i17 = 0; i17 < length2; i17++) {
                bArr4[i17] = d10[(i17 * 2) + i14 + 1];
            }
            this.f19221d = i13 - 1;
            return bArr4;
        }
        throw new u("invalid forcing byte in block");
    }

    private byte[] f(byte[] bArr, int i10, int i11) {
        int i12 = this.f19220c;
        int i13 = (i12 + 7) / 8;
        byte[] bArr2 = new byte[i13];
        int i14 = 1;
        int i15 = this.f19221d + 1;
        int i16 = (i12 + 13) / 16;
        int i17 = 0;
        while (i17 < i16) {
            if (i17 > i16 - i11) {
                int i18 = i16 - i17;
                System.arraycopy(bArr, (i10 + i11) - i18, bArr2, i13 - i16, i18);
            } else {
                System.arraycopy(bArr, i10, bArr2, i13 - (i17 + i11), i11);
            }
            i17 += i11;
        }
        for (int i19 = i13 - (i16 * 2); i19 != i13; i19 += 2) {
            byte b10 = bArr2[(i13 - i16) + (i19 / 2)];
            byte[] bArr3 = f19216h;
            bArr2[i19] = (byte) (bArr3[b10 & 15] | (bArr3[(b10 & 255) >>> 4] << 4));
            bArr2[i19 + 1] = b10;
        }
        int i20 = i13 - (i11 * 2);
        bArr2[i20] = (byte) (bArr2[i20] ^ i15);
        int i21 = i13 - 1;
        bArr2[i21] = (byte) ((bArr2[i21] << 4) | 6);
        int i22 = 8 - ((this.f19220c - 1) % 8);
        if (i22 != 8) {
            bArr2[0] = (byte) (bArr2[0] & (255 >>> i22));
            bArr2[0] = (byte) ((128 >>> i22) | bArr2[0]);
            i14 = 0;
        } else {
            bArr2[0] = 0;
            bArr2[1] = (byte) (bArr2[1] | 128);
        }
        return this.f19218a.a(bArr2, i14, i13 - i14);
    }

    @Override // org.bouncycastle.crypto.a
    public byte[] a(byte[] bArr, int i10, int i11) {
        return this.f19219b ? f(bArr, i10, i11) : e(bArr, i10, i11);
    }

    @Override // org.bouncycastle.crypto.a
    public int b() {
        int b10 = this.f19218a.b();
        return this.f19219b ? (b10 + 1) / 2 : b10;
    }

    @Override // org.bouncycastle.crypto.a
    public int c() {
        int c10 = this.f19218a.c();
        return this.f19219b ? c10 : (c10 + 1) / 2;
    }

    @Override // org.bouncycastle.crypto.a
    public void init(boolean z10, i iVar) {
        n1 n1Var = iVar instanceof g1 ? (n1) ((g1) iVar).a() : (n1) iVar;
        this.f19218a.init(z10, iVar);
        BigInteger c10 = n1Var.c();
        this.f19222e = c10;
        this.f19220c = c10.bitLength();
        this.f19219b = z10;
    }
}
