package sj;

import gg.e0;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import zg.s;
/* loaded from: classes3.dex */
public class a implements Key, PrivateKey {

    /* renamed from: c */
    private transient ij.a f21767c;

    /* renamed from: d */
    private transient e0 f21768d;

    public a(s sVar) {
        b(sVar);
    }

    private void b(s sVar) {
        this.f21768d = sVar.l();
        this.f21767c = (ij.a) nj.a.b(sVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return ak.a.f(this.f21767c.b(), ((a) obj).f21767c.b());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return nj.b.a(this.f21767c, this.f21768d).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return ak.a.L(this.f21767c.b());
    }
}
