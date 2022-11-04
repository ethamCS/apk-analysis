package zh;

import java.util.Objects;
/* loaded from: classes3.dex */
public class w implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private d0 f27013c;

    /* renamed from: d */
    private d0 f27014d;

    /* renamed from: q */
    private e0 f27015q;

    public w(d0 d0Var, d0 d0Var2, e0 e0Var) {
        Objects.requireNonNull(d0Var, "staticPrivateKey cannot be null");
        Objects.requireNonNull(d0Var2, "ephemeralPrivateKey cannot be null");
        y b10 = d0Var.b();
        if (b10.equals(d0Var2.b())) {
            if (e0Var == null) {
                e0Var = new e0(new ti.k().a(b10.b(), d0Var2.c()), b10);
            } else if (!b10.equals(e0Var.b())) {
                throw new IllegalArgumentException("ephemeral public key has different domain parameters");
            }
            this.f27013c = d0Var;
            this.f27014d = d0Var2;
            this.f27015q = e0Var;
            return;
        }
        throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
    }

    public d0 a() {
        return this.f27014d;
    }

    public d0 b() {
        return this.f27013c;
    }
}
