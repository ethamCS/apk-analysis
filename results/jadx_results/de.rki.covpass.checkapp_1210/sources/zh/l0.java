package zh;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class l0 extends org.bouncycastle.crypto.w {

    /* renamed from: c */
    private n0 f26957c;

    public l0(SecureRandom secureRandom, n0 n0Var) {
        super(secureRandom, d(n0Var));
        this.f26957c = n0Var;
    }

    static int d(n0 n0Var) {
        return n0Var.b() != 0 ? n0Var.b() : n0Var.c().bitLength();
    }

    public n0 c() {
        return this.f26957c;
    }
}
