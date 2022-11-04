package lh;

import java.math.BigInteger;
import zh.d0;
import zh.e0;
import zh.y;
/* loaded from: classes3.dex */
public class c implements org.bouncycastle.crypto.d {

    /* renamed from: a */
    private d0 f16065a;

    @Override // org.bouncycastle.crypto.d
    public int a() {
        return (this.f16065a.b().a().t() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.d
    public BigInteger b(org.bouncycastle.crypto.i iVar) {
        e0 e0Var = (e0) iVar;
        y b10 = this.f16065a.b();
        if (b10.equals(e0Var.b())) {
            BigInteger c10 = this.f16065a.c();
            ti.i a10 = ti.c.a(b10.a(), e0Var.c());
            if (a10.u()) {
                throw new IllegalStateException("Infinity is not a valid public key for ECDH");
            }
            BigInteger c11 = b10.c();
            if (!c11.equals(ti.d.f22360b)) {
                c10 = b10.d().multiply(c10).mod(b10.e());
                a10 = ti.c.q(a10, c11);
            }
            ti.i A = a10.y(c10).A();
            if (A.u()) {
                throw new IllegalStateException("Infinity is not a valid agreement value for ECDH");
            }
            return A.f().t();
        }
        throw new IllegalStateException("ECDH public key has wrong domain parameters");
    }

    @Override // org.bouncycastle.crypto.d
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f16065a = (d0) iVar;
    }
}
