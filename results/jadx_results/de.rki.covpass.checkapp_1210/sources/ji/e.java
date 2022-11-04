package ji;

import gg.x1;
import hh.n0;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public class e implements PublicKey {

    /* renamed from: c */
    private final List<PublicKey> f14389c;

    public e(PublicKey... publicKeyArr) {
        if (publicKeyArr == null || publicKeyArr.length == 0) {
            throw new IllegalArgumentException("at least one public key must be provided");
        }
        ArrayList arrayList = new ArrayList(publicKeyArr.length);
        for (int i10 = 0; i10 != publicKeyArr.length; i10++) {
            arrayList.add(publicKeyArr[i10]);
        }
        this.f14389c = Collections.unmodifiableList(arrayList);
    }

    public List<PublicKey> b() {
        return this.f14389c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f14389c.equals(((e) obj).f14389c);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "Composite";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        gg.h hVar = new gg.h();
        for (int i10 = 0; i10 != this.f14389c.size(); i10++) {
            hVar.a(n0.n(this.f14389c.get(i10).getEncoded()));
        }
        try {
            return new n0(new hh.b(tg.c.N), new x1(hVar)).k("DER");
        } catch (IOException e10) {
            throw new IllegalStateException("unable to encode composite key: " + e10.getMessage());
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f14389c.hashCode();
    }
}
