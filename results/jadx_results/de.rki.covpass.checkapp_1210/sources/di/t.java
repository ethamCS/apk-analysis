package di;

import java.math.BigInteger;
import org.bouncycastle.crypto.f0;
import zh.n1;
/* loaded from: classes3.dex */
public class t implements f0 {

    /* renamed from: g */
    private org.bouncycastle.crypto.r f9153g;

    /* renamed from: h */
    private org.bouncycastle.crypto.a f9154h;

    /* renamed from: i */
    private n1 f9155i;

    /* renamed from: j */
    private int f9156j;

    /* renamed from: k */
    private int f9157k;

    /* renamed from: l */
    private byte[] f9158l;

    public t(org.bouncycastle.crypto.a aVar, org.bouncycastle.crypto.r rVar) {
        this(aVar, rVar, false);
    }

    public t(org.bouncycastle.crypto.a aVar, org.bouncycastle.crypto.r rVar, boolean z10) {
        int intValue;
        this.f9154h = aVar;
        this.f9153g = rVar;
        if (z10) {
            intValue = 188;
        } else {
            Integer a10 = n.a(rVar);
            if (a10 == null) {
                throw new IllegalArgumentException("no valid trailer for digest: " + rVar.getAlgorithmName());
            }
            intValue = a10.intValue();
        }
        this.f9156j = intValue;
    }

    private void c(byte[] bArr) {
        for (int i10 = 0; i10 != bArr.length; i10++) {
            bArr[i10] = 0;
        }
    }

    private void d(int i10) {
        int i11;
        byte[] bArr;
        int digestSize = this.f9153g.getDigestSize();
        if (i10 == 188) {
            byte[] bArr2 = this.f9158l;
            i11 = (bArr2.length - digestSize) - 1;
            this.f9153g.doFinal(bArr2, i11);
            this.f9158l[bArr.length - 1] = -68;
        } else {
            byte[] bArr3 = this.f9158l;
            int length = (bArr3.length - digestSize) - 2;
            this.f9153g.doFinal(bArr3, length);
            byte[] bArr4 = this.f9158l;
            bArr4[bArr4.length - 2] = (byte) (i10 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i10;
            i11 = length;
        }
        this.f9158l[0] = 107;
        for (int i12 = i11 - 2; i12 != 0; i12--) {
            this.f9158l[i12] = -69;
        }
        this.f9158l[i11 - 1] = -70;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
        if ((r4.intValue() & 15) == 12) goto L8;
     */
    @Override // org.bouncycastle.crypto.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            org.bouncycastle.crypto.a r1 = r3.f9154h     // Catch: java.lang.Exception -> L5e
            int r2 = r4.length     // Catch: java.lang.Exception -> L5e
            byte[] r4 = r1.a(r4, r0, r2)     // Catch: java.lang.Exception -> L5e
            r3.f9158l = r4     // Catch: java.lang.Exception -> L5e
            java.math.BigInteger r4 = new java.math.BigInteger
            r1 = 1
            byte[] r2 = r3.f9158l
            r4.<init>(r1, r2)
            int r1 = r4.intValue()
            r1 = r1 & 15
            r2 = 12
            if (r1 != r2) goto L1d
            goto L2f
        L1d:
            zh.n1 r1 = r3.f9155i
            java.math.BigInteger r1 = r1.c()
            java.math.BigInteger r4 = r1.subtract(r4)
            int r1 = r4.intValue()
            r1 = r1 & 15
            if (r1 != r2) goto L5e
        L2f:
            int r0 = r3.f9156j
            r3.d(r0)
            byte[] r0 = r3.f9158l
            int r0 = r0.length
            byte[] r4 = ak.b.b(r0, r4)
            byte[] r0 = r3.f9158l
            boolean r0 = ak.a.u(r0, r4)
            int r1 = r3.f9156j
            r2 = 15052(0x3acc, float:2.1092E-41)
            if (r1 != r2) goto L56
            if (r0 != 0) goto L56
            byte[] r0 = r3.f9158l
            int r1 = r0.length
            int r1 = r1 + (-2)
            r2 = 64
            r0[r1] = r2
            boolean r0 = ak.a.u(r0, r4)
        L56:
            byte[] r1 = r3.f9158l
            r3.c(r1)
            r3.c(r4)
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: di.t.a(byte[]):boolean");
    }

    @Override // org.bouncycastle.crypto.f0
    public byte[] b() {
        d(this.f9156j);
        org.bouncycastle.crypto.a aVar = this.f9154h;
        byte[] bArr = this.f9158l;
        BigInteger bigInteger = new BigInteger(1, aVar.a(bArr, 0, bArr.length));
        c(this.f9158l);
        return ak.b.b(ak.b.i(this.f9155i.c()), bigInteger.min(this.f9155i.c().subtract(bigInteger)));
    }

    public void e() {
        this.f9153g.reset();
    }

    @Override // org.bouncycastle.crypto.f0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        n1 n1Var = (n1) iVar;
        this.f9155i = n1Var;
        this.f9154h.init(z10, n1Var);
        int bitLength = this.f9155i.c().bitLength();
        this.f9157k = bitLength;
        this.f9158l = new byte[(bitLength + 7) / 8];
        e();
    }

    @Override // org.bouncycastle.crypto.f0
    public void update(byte b10) {
        this.f9153g.update(b10);
    }

    @Override // org.bouncycastle.crypto.f0
    public void update(byte[] bArr, int i10, int i11) {
        this.f9153g.update(bArr, i10, i11);
    }
}
