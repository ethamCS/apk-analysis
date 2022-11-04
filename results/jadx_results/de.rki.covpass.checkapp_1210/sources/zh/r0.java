package zh;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class r0 extends org.bouncycastle.crypto.w {

    /* renamed from: c */
    private t0 f26994c;

    public r0(SecureRandom secureRandom, t0 t0Var) {
        super(secureRandom, t0Var.b().bitLength() - 1);
        this.f26994c = t0Var;
    }

    public t0 c() {
        return this.f26994c;
    }
}
