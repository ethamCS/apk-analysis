package zh;

import java.util.Objects;
/* loaded from: classes3.dex */
public class y1 implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private b f27036c;

    /* renamed from: d */
    private b f27037d;

    public y1(b bVar, b bVar2) {
        Objects.requireNonNull(bVar, "staticPublicKey cannot be null");
        if ((bVar instanceof w1) || (bVar instanceof t1)) {
            Objects.requireNonNull(bVar2, "ephemeralPublicKey cannot be null");
            if (!bVar.getClass().isAssignableFrom(bVar2.getClass())) {
                throw new IllegalArgumentException("static and ephemeral public keys have different domain parameters");
            }
            this.f27036c = bVar;
            this.f27037d = bVar2;
            return;
        }
        throw new IllegalArgumentException("only X25519 and X448 paramaters can be used");
    }

    public b a() {
        return this.f27037d;
    }

    public b b() {
        return this.f27036c;
    }
}
