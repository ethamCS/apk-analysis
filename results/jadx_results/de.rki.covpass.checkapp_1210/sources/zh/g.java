package zh;

import java.util.Objects;
/* loaded from: classes3.dex */
public class g implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private j f26925c;

    /* renamed from: d */
    private j f26926d;

    /* renamed from: q */
    private k f26927q;

    public g(j jVar, j jVar2) {
        this(jVar, jVar2, null);
    }

    public g(j jVar, j jVar2, k kVar) {
        Objects.requireNonNull(jVar, "staticPrivateKey cannot be null");
        Objects.requireNonNull(jVar2, "ephemeralPrivateKey cannot be null");
        i b10 = jVar.b();
        if (b10.equals(jVar2.b())) {
            if (kVar == null) {
                kVar = new k(b10.b().multiply(jVar2.c()), b10);
            } else if (!b10.equals(kVar.b())) {
                throw new IllegalArgumentException("Ephemeral public key has different domain parameters");
            }
            this.f26925c = jVar;
            this.f26926d = jVar2;
            this.f26927q = kVar;
            return;
        }
        throw new IllegalArgumentException("Static and ephemeral private keys have different domain parameters");
    }

    public j a() {
        return this.f26926d;
    }

    public k b() {
        return this.f26927q;
    }

    public j c() {
        return this.f26925c;
    }
}
