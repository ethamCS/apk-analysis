package di;

import java.math.BigInteger;
import java.security.SecureRandom;
import zh.b1;
/* loaded from: classes3.dex */
public class l implements b {

    /* renamed from: e */
    private static final BigInteger f9111e = BigInteger.valueOf(0);

    /* renamed from: a */
    private final uh.g f9112a;

    /* renamed from: b */
    private final byte[] f9113b;

    /* renamed from: c */
    private final byte[] f9114c;

    /* renamed from: d */
    private BigInteger f9115d;

    public l(org.bouncycastle.crypto.r rVar) {
        uh.g gVar = new uh.g(rVar);
        this.f9112a = gVar;
        this.f9114c = new byte[gVar.getMacSize()];
        this.f9113b = new byte[gVar.getMacSize()];
    }

    private BigInteger e(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        return bArr.length * 8 > this.f9115d.bitLength() ? bigInteger.shiftRight((bArr.length * 8) - this.f9115d.bitLength()) : bigInteger;
    }

    @Override // di.b
    public BigInteger a() {
        int i10 = ak.b.i(this.f9115d);
        byte[] bArr = new byte[i10];
        while (true) {
            int i11 = 0;
            while (i11 < i10) {
                uh.g gVar = this.f9112a;
                byte[] bArr2 = this.f9114c;
                gVar.update(bArr2, 0, bArr2.length);
                this.f9112a.doFinal(this.f9114c, 0);
                int min = Math.min(i10 - i11, this.f9114c.length);
                System.arraycopy(this.f9114c, 0, bArr, i11, min);
                i11 += min;
            }
            BigInteger e10 = e(bArr);
            if (e10.compareTo(f9111e) <= 0 || e10.compareTo(this.f9115d) >= 0) {
                uh.g gVar2 = this.f9112a;
                byte[] bArr3 = this.f9114c;
                gVar2.update(bArr3, 0, bArr3.length);
                this.f9112a.update((byte) 0);
                this.f9112a.doFinal(this.f9113b, 0);
                this.f9112a.init(new b1(this.f9113b));
                uh.g gVar3 = this.f9112a;
                byte[] bArr4 = this.f9114c;
                gVar3.update(bArr4, 0, bArr4.length);
                this.f9112a.doFinal(this.f9114c, 0);
            } else {
                return e10;
            }
        }
    }

    @Override // di.b
    public boolean b() {
        return true;
    }

    @Override // di.b
    public void c(BigInteger bigInteger, SecureRandom secureRandom) {
        throw new IllegalStateException("Operation not supported");
    }

    @Override // di.b
    public void d(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f9115d = bigInteger;
        ak.a.y(this.f9114c, (byte) 1);
        ak.a.y(this.f9113b, (byte) 0);
        int i10 = ak.b.i(bigInteger);
        byte[] bArr2 = new byte[i10];
        byte[] c10 = ak.b.c(bigInteger2);
        System.arraycopy(c10, 0, bArr2, i10 - c10.length, c10.length);
        byte[] bArr3 = new byte[i10];
        BigInteger e10 = e(bArr);
        if (e10.compareTo(bigInteger) >= 0) {
            e10 = e10.subtract(bigInteger);
        }
        byte[] c11 = ak.b.c(e10);
        System.arraycopy(c11, 0, bArr3, i10 - c11.length, c11.length);
        this.f9112a.init(new b1(this.f9113b));
        uh.g gVar = this.f9112a;
        byte[] bArr4 = this.f9114c;
        gVar.update(bArr4, 0, bArr4.length);
        this.f9112a.update((byte) 0);
        this.f9112a.update(bArr2, 0, i10);
        this.f9112a.update(bArr3, 0, i10);
        this.f9112a.doFinal(this.f9113b, 0);
        this.f9112a.init(new b1(this.f9113b));
        uh.g gVar2 = this.f9112a;
        byte[] bArr5 = this.f9114c;
        gVar2.update(bArr5, 0, bArr5.length);
        this.f9112a.doFinal(this.f9114c, 0);
        uh.g gVar3 = this.f9112a;
        byte[] bArr6 = this.f9114c;
        gVar3.update(bArr6, 0, bArr6.length);
        this.f9112a.update((byte) 1);
        this.f9112a.update(bArr2, 0, i10);
        this.f9112a.update(bArr3, 0, i10);
        this.f9112a.doFinal(this.f9113b, 0);
        this.f9112a.init(new b1(this.f9113b));
        uh.g gVar4 = this.f9112a;
        byte[] bArr7 = this.f9114c;
        gVar4.update(bArr7, 0, bArr7.length);
        this.f9112a.doFinal(this.f9114c, 0);
    }
}
