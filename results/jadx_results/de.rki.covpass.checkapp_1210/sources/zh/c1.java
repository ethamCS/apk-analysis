package zh;

import java.util.Objects;
/* loaded from: classes3.dex */
public class c1 implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private d0 f26912c;

    /* renamed from: d */
    private d0 f26913d;

    /* renamed from: q */
    private e0 f26914q;

    public c1(d0 d0Var, d0 d0Var2, e0 e0Var) {
        Objects.requireNonNull(d0Var, "staticPrivateKey cannot be null");
        Objects.requireNonNull(d0Var2, "ephemeralPrivateKey cannot be null");
        y b10 = d0Var.b();
        if (b10.equals(d0Var2.b())) {
            if (e0Var == null) {
                e0Var = new e0(new ti.k().a(b10.b(), d0Var2.c()), b10);
            } else if (!b10.equals(e0Var.b())) {
                throw new IllegalArgumentException("Ephemeral public key has different domain parameters");
            }
            this.f26912c = d0Var;
            this.f26913d = d0Var2;
            this.f26914q = e0Var;
            return;
        }
        throw new IllegalArgumentException("Static and ephemeral private keys have different domain parameters");
    }

    public d0 a() {
        return this.f26913d;
    }

    public e0 b() {
        return this.f26914q;
    }

    public d0 c() {
        return this.f26912c;
    }
}
