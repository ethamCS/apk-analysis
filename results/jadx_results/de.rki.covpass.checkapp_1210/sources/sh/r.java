package sh;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.conscrypt.PSKKeyManager;
import zh.r0;
import zh.t0;
import zh.u0;
import zh.v0;
/* loaded from: classes3.dex */
public class r implements org.bouncycastle.crypto.c {

    /* renamed from: g */
    private r0 f21749g;

    @Override // org.bouncycastle.crypto.c
    public org.bouncycastle.crypto.b a() {
        t0 c10 = this.f21749g.c();
        SecureRandom a10 = this.f21749g.a();
        BigInteger c11 = c10.c();
        BigInteger b10 = c10.b();
        BigInteger a11 = c10.a();
        while (true) {
            BigInteger e10 = ak.b.e(PSKKeyManager.MAX_KEY_LENGTH_BYTES, a10);
            if (e10.signum() >= 1 && e10.compareTo(c11) < 0 && ti.x.h(e10) >= 64) {
                return new org.bouncycastle.crypto.b(new v0(a11.modPow(e10, b10), c10), new u0(e10, c10));
            }
        }
    }

    public void b(org.bouncycastle.crypto.w wVar) {
        this.f21749g = (r0) wVar;
    }
}
