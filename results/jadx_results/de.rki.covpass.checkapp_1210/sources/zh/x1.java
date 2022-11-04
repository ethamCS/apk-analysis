package zh;

import java.util.Objects;
/* loaded from: classes3.dex */
public class x1 implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private b f27026c;

    /* renamed from: d */
    private b f27027d;

    /* renamed from: q */
    private b f27028q;

    public x1(b bVar, b bVar2, b bVar3) {
        Objects.requireNonNull(bVar, "staticPrivateKey cannot be null");
        boolean z10 = bVar instanceof v1;
        if (z10 || (bVar instanceof s1)) {
            Objects.requireNonNull(bVar2, "ephemeralPrivateKey cannot be null");
            if (!bVar.getClass().isAssignableFrom(bVar2.getClass())) {
                throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
            }
            if (bVar3 == null) {
                bVar3 = bVar2 instanceof v1 ? ((v1) bVar2).b() : ((s1) bVar2).b();
            } else if ((bVar3 instanceof w1) && !z10) {
                throw new IllegalArgumentException("ephemeral public key has different domain parameters");
            } else {
                if ((bVar3 instanceof t1) && !(bVar instanceof s1)) {
                    throw new IllegalArgumentException("ephemeral public key has different domain parameters");
                }
            }
            this.f27026c = bVar;
            this.f27027d = bVar2;
            this.f27028q = bVar3;
            return;
        }
        throw new IllegalArgumentException("only X25519 and X448 paramaters can be used");
    }

    public b a() {
        return this.f27027d;
    }

    public b b() {
        return this.f27026c;
    }
}
