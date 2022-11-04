package zh;

import java.util.Objects;
/* loaded from: classes3.dex */
public class x implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private e0 f27021c;

    /* renamed from: d */
    private e0 f27022d;

    public x(e0 e0Var, e0 e0Var2) {
        Objects.requireNonNull(e0Var, "staticPublicKey cannot be null");
        Objects.requireNonNull(e0Var2, "ephemeralPublicKey cannot be null");
        if (e0Var.b().equals(e0Var2.b())) {
            this.f27021c = e0Var;
            this.f27022d = e0Var2;
            return;
        }
        throw new IllegalArgumentException("static and ephemeral public keys have different domain parameters");
    }

    public e0 a() {
        return this.f27022d;
    }

    public e0 b() {
        return this.f27021c;
    }
}
