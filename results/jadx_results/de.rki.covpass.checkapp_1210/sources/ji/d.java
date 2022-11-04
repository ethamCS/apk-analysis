package ji;

import gg.x1;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public class d implements PrivateKey {

    /* renamed from: c */
    private final List<PrivateKey> f14388c;

    public d(PrivateKey... privateKeyArr) {
        if (privateKeyArr == null || privateKeyArr.length == 0) {
            throw new IllegalArgumentException("at least one public key must be provided");
        }
        ArrayList arrayList = new ArrayList(privateKeyArr.length);
        for (int i10 = 0; i10 != privateKeyArr.length; i10++) {
            arrayList.add(privateKeyArr[i10]);
        }
        this.f14388c = Collections.unmodifiableList(arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return this.f14388c.equals(((d) obj).f14388c);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "Composite";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        gg.h hVar = new gg.h();
        for (int i10 = 0; i10 != this.f14388c.size(); i10++) {
            hVar.a(zg.s.m(this.f14388c.get(i10).getEncoded()));
        }
        try {
            return new zg.s(new hh.b(tg.c.N), new x1(hVar)).k("DER");
        } catch (IOException e10) {
            throw new IllegalStateException("unable to encode composite key: " + e10.getMessage());
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f14388c.hashCode();
    }
}
