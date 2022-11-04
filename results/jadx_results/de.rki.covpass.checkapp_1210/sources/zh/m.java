package zh;

import java.util.Objects;
/* loaded from: classes3.dex */
public class m implements org.bouncycastle.crypto.i {

    /* renamed from: c */
    private k f26959c;

    /* renamed from: d */
    private k f26960d;

    public m(k kVar, k kVar2) {
        Objects.requireNonNull(kVar, "staticPublicKey cannot be null");
        Objects.requireNonNull(kVar2, "ephemeralPublicKey cannot be null");
        if (kVar.b().equals(kVar2.b())) {
            this.f26959c = kVar;
            this.f26960d = kVar2;
            return;
        }
        throw new IllegalArgumentException("Static and ephemeral public keys have different domain parameters");
    }

    public k a() {
        return this.f26960d;
    }

    public k b() {
        return this.f26959c;
    }
}
