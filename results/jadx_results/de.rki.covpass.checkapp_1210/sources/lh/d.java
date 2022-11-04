package lh;

import java.math.BigInteger;
import zh.d0;
import zh.e0;
import zh.y;
/* loaded from: classes3.dex */
public class d implements org.bouncycastle.crypto.d {

    /* renamed from: a */
    d0 f16066a;

    @Override // org.bouncycastle.crypto.d
    public int a() {
        return (this.f16066a.b().a().t() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.d
    public BigInteger b(org.bouncycastle.crypto.i iVar) {
        e0 e0Var = (e0) iVar;
        y b10 = this.f16066a.b();
        if (b10.equals(e0Var.b())) {
            BigInteger mod = b10.c().multiply(this.f16066a.c()).mod(b10.e());
            ti.i a10 = ti.c.a(b10.a(), e0Var.c());
            if (a10.u()) {
                throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
            }
            ti.i A = a10.y(mod).A();
            if (A.u()) {
                throw new IllegalStateException("Infinity is not a valid agreement value for ECDHC");
            }
            return A.f().t();
        }
        throw new IllegalStateException("ECDHC public key has wrong domain parameters");
    }

    @Override // org.bouncycastle.crypto.d
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f16066a = (d0) iVar;
    }
}
