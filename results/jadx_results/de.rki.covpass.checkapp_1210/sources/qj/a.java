package qj;

import gg.e0;
import gj.g;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import zg.s;
/* loaded from: classes3.dex */
public class a implements PrivateKey, Key {

    /* renamed from: c */
    private transient g f20258c;

    /* renamed from: d */
    private transient e0 f20259d;

    public a(s sVar) {
        b(sVar);
    }

    private void b(s sVar) {
        this.f20259d = sVar.l();
        this.f20258c = (g) nj.a.b(sVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            return ak.a.c(this.f20258c.getEncoded(), ((a) obj).f20258c.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to perform equals");
        }
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return nj.b.a(this.f20258c, this.f20259d).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        try {
            return ak.a.F(this.f20258c.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }
}
