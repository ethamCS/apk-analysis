package zh;

import java.util.Objects;
/* loaded from: classes3.dex */
public class l implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private j f26954c;

    /* renamed from: d */
    private j f26955d;

    /* renamed from: q */
    private k f26956q;

    public l(j jVar, j jVar2) {
        this(jVar, jVar2, null);
    }

    public l(j jVar, j jVar2, k kVar) {
        Objects.requireNonNull(jVar, "staticPrivateKey cannot be null");
        Objects.requireNonNull(jVar2, "ephemeralPrivateKey cannot be null");
        i b10 = jVar.b();
        if (b10.equals(jVar2.b())) {
            if (kVar == null) {
                kVar = new k(b10.b().modPow(jVar2.c(), b10.f()), b10);
            } else if (!b10.equals(kVar.b())) {
                throw new IllegalArgumentException("ephemeral public key has different domain parameters");
            }
            this.f26954c = jVar;
            this.f26955d = jVar2;
            this.f26956q = kVar;
            return;
        }
        throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
    }

    public j a() {
        return this.f26955d;
    }

    public j b() {
        return this.f26954c;
    }
}
