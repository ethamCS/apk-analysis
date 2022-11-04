package sh;

import java.math.BigInteger;
import java.security.SecureRandom;
import zh.d0;
import zh.e0;
/* loaded from: classes3.dex */
public class l implements org.bouncycastle.crypto.c, ti.d {

    /* renamed from: g */
    zh.y f21739g;

    /* renamed from: h */
    SecureRandom f21740h;

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b a() {
        BigInteger e10 = this.f21739g.e();
        int bitLength = e10.bitLength();
        int i10 = bitLength >>> 2;
        while (true) {
            BigInteger e11 = ak.b.e(bitLength, this.f21740h);
            if (e11.compareTo(ti.d.f22360b) >= 0 && e11.compareTo(e10) < 0 && ti.x.h(e11) >= i10) {
                return new org.bouncycastle.crypto.b(new e0(b().a(this.f21739g.b(), e11), this.f21739g), new d0(e11, this.f21739g));
            }
        }
    }

    protected ti.h b() {
        return new ti.k();
    }

    public void c(org.bouncycastle.crypto.w wVar) {
        zh.a0 a0Var = (zh.a0) wVar;
        this.f21740h = a0Var.a();
        this.f21739g = a0Var.c();
    }
}
