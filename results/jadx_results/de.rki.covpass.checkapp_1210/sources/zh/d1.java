package zh;

import java.util.Objects;
/* loaded from: classes3.dex */
public class d1 implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private e0 f26916c;

    /* renamed from: d */
    private e0 f26917d;

    public d1(e0 e0Var, e0 e0Var2) {
        Objects.requireNonNull(e0Var, "staticPublicKey cannot be null");
        Objects.requireNonNull(e0Var2, "ephemeralPublicKey cannot be null");
        if (e0Var.b().equals(e0Var2.b())) {
            this.f26916c = e0Var;
            this.f26917d = e0Var2;
            return;
        }
        throw new IllegalArgumentException("Static and ephemeral public keys have different domain parameters");
    }

    public e0 a() {
        return this.f26917d;
    }

    public e0 b() {
        return this.f26916c;
    }
}
