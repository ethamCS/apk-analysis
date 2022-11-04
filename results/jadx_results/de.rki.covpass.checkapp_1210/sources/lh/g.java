package lh;

import java.math.BigInteger;
import org.bouncycastle.crypto.r;
import zh.d0;
import zh.e0;
import zh.i1;
import zh.y;
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a */
    private final r f16069a;

    /* renamed from: b */
    private d0 f16070b;

    /* renamed from: c */
    private BigInteger f16071c;

    public g(r rVar) {
        this.f16069a = rVar;
    }

    private byte[] b(ti.i iVar) {
        BigInteger t10 = iVar.f().t();
        BigInteger t11 = iVar.g().t();
        int i10 = t10.toByteArray().length > 33 ? 64 : 32;
        int i11 = i10 * 2;
        byte[] bArr = new byte[i11];
        byte[] b10 = ak.b.b(i10, t10);
        byte[] b11 = ak.b.b(i10, t11);
        for (int i12 = 0; i12 != i10; i12++) {
            bArr[i12] = b10[(i10 - i12) - 1];
        }
        for (int i13 = 0; i13 != i10; i13++) {
            bArr[i10 + i13] = b11[(i10 - i13) - 1];
        }
        this.f16069a.update(bArr, 0, i11);
        byte[] bArr2 = new byte[this.f16069a.getDigestSize()];
        this.f16069a.doFinal(bArr2, 0);
        return bArr2;
    }

    private static BigInteger d(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i10 = 0; i10 != length; i10++) {
            bArr2[i10] = bArr[(bArr.length - i10) - 1];
        }
        return new BigInteger(1, bArr2);
    }

    public byte[] a(org.bouncycastle.crypto.i iVar) {
        e0 e0Var = (e0) iVar;
        y b10 = this.f16070b.b();
        if (b10.equals(e0Var.b())) {
            BigInteger mod = b10.c().multiply(this.f16071c).multiply(this.f16070b.c()).mod(b10.e());
            ti.i a10 = ti.c.a(b10.a(), e0Var.c());
            if (a10.u()) {
                throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
            }
            ti.i A = a10.y(mod).A();
            if (A.u()) {
                throw new IllegalStateException("Infinity is not a valid agreement value for ECVKO");
            }
            return b(A);
        }
        throw new IllegalStateException("ECVKO public key has wrong domain parameters");
    }

    public void c(org.bouncycastle.crypto.i iVar) {
        i1 i1Var = (i1) iVar;
        this.f16070b = (d0) i1Var.a();
        this.f16071c = d(i1Var.b());
    }
}
