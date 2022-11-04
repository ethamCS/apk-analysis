package qh;

import java.math.BigInteger;
import java.security.SecureRandom;
import zh.n1;
import zh.o1;
/* loaded from: classes3.dex */
public class n0 implements org.bouncycastle.crypto.a {

    /* renamed from: d */
    private static final BigInteger f20074d = BigInteger.valueOf(1);

    /* renamed from: a */
    private o0 f20075a = new o0();

    /* renamed from: b */
    private n1 f20076b;

    /* renamed from: c */
    private SecureRandom f20077c;

    @Override // org.bouncycastle.crypto.a
    public byte[] a(byte[] bArr, int i10, int i11) {
        BigInteger bigInteger;
        o1 o1Var;
        BigInteger h10;
        if (this.f20076b != null) {
            BigInteger a10 = this.f20075a.a(bArr, i10, i11);
            n1 n1Var = this.f20076b;
            if (!(n1Var instanceof o1) || (h10 = (o1Var = (o1) n1Var).h()) == null) {
                bigInteger = this.f20075a.f(a10);
            } else {
                BigInteger c10 = o1Var.c();
                BigInteger bigInteger2 = f20074d;
                BigInteger f10 = ak.b.f(bigInteger2, c10.subtract(bigInteger2), this.f20077c);
                bigInteger = this.f20075a.f(f10.modPow(h10, c10).multiply(a10).mod(c10)).multiply(ak.b.j(c10, f10)).mod(c10);
                if (!a10.equals(bigInteger.modPow(h10, c10))) {
                    throw new IllegalStateException("RSA engine faulty decryption/signing detected");
                }
            }
            return this.f20075a.b(bigInteger);
        }
        throw new IllegalStateException("RSA engine not initialised");
    }

    @Override // org.bouncycastle.crypto.a
    public int b() {
        return this.f20075a.c();
    }

    @Override // org.bouncycastle.crypto.a
    public int c() {
        return this.f20075a.d();
    }

    @Override // org.bouncycastle.crypto.a
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        SecureRandom secureRandom;
        this.f20075a.e(z10, iVar);
        if (!(iVar instanceof zh.g1)) {
            n1 n1Var = (n1) iVar;
            this.f20076b = n1Var;
            if (n1Var instanceof o1) {
                secureRandom = org.bouncycastle.crypto.l.b();
                this.f20077c = secureRandom;
                return;
            }
            this.f20077c = null;
        }
        zh.g1 g1Var = (zh.g1) iVar;
        n1 n1Var2 = (n1) g1Var.a();
        this.f20076b = n1Var2;
        if (n1Var2 instanceof o1) {
            secureRandom = g1Var.b();
            this.f20077c = secureRandom;
            return;
        }
        this.f20077c = null;
    }
}
